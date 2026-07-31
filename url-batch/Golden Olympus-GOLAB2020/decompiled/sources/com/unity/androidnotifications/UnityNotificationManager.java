package com.unity.androidnotifications;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import com.unity3d.player.UnityPlayer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class UnityNotificationManager extends BroadcastReceiver {
    public static final String KEY_BIG_CONTENT_DESCRIPTION = "com.unity.BigContentDescription";
    public static final String KEY_BIG_CONTENT_TITLE = "com.unity.BigContentTytle";
    public static final String KEY_BIG_LARGE_ICON = "com.unity.BigLargeIcon";
    public static final String KEY_BIG_PICTURE = "com.unity.BigPicture";
    public static final String KEY_BIG_SHOW_WHEN_COLLAPSED = "com.unity.BigShowWhenCollapsed";
    public static final String KEY_BIG_SUMMARY_TEXT = "com.unity.BigSummaryText";
    public static final String KEY_CHANNEL_ID = "channelID";
    public static final String KEY_FIRE_TIME = "fireTime";
    public static final String KEY_ID = "id";
    public static final String KEY_INTENT_DATA = "data";
    public static final String KEY_LARGE_ICON = "largeIcon";
    public static final String KEY_NOTIFICATION = "unityNotification";
    public static final String KEY_NOTIFICATION_DISMISSED = "com.unity.NotificationDismissed";
    public static final String KEY_NOTIFICATION_ID = "com.unity.NotificationID";
    public static final String KEY_REPEAT_INTERVAL = "repeatInterval";
    public static final String KEY_SHOW_IN_FOREGROUND = "com.unity.showInForeground";
    public static final String KEY_SMALL_ICON = "smallIcon";
    static final String NOTIFICATION_CHANNELS_SHARED_PREFS = "UNITY_NOTIFICATIONS";
    static final String NOTIFICATION_CHANNELS_SHARED_PREFS_KEY = "ChannelIDs";
    static final String NOTIFICATION_IDS_SHARED_PREFS = "UNITY_STORED_NOTIFICATION_IDS";
    static final String NOTIFICATION_IDS_SHARED_PREFS_KEY = "UNITY_NOTIFICATION_IDS";
    private static final int PERMISSION_STATUS_ALLOWED = 1;
    private static final int PERMISSION_STATUS_DENIED = 2;
    private static final int PERMISSION_STATUS_NOTIFICATIONS_BLOCKED_FOR_APP = 5;
    static final String TAG_UNITY = "UnityNotifications";
    static UnityNotificationManager mUnityNotificationManager;
    private UnityNotificationBackgroundThread mBackgroundThread;
    private NotificationCallback mNotificationCallback;
    private Random mRandom;
    private ConcurrentHashMap<Integer, Notification.Builder> mScheduledNotifications;
    private HashSet<Integer> mVisibleNotifications;
    private Context mContext = null;
    private Activity mActivity = null;
    private Class mOpenActivity = null;
    private int mExactSchedulingSetting = -1;

    public static /* synthetic */ void a(UnityNotificationManager unityNotificationManager, Integer num) {
        Notification.Builder deserializeNotificationBuilder = unityNotificationManager.deserializeNotificationBuilder(num);
        if (deserializeNotificationBuilder == null) {
            Log.e(TAG_UNITY, "Failed to recover builder, can't send notification");
        } else {
            unityNotificationManager.notify(num.intValue(), deserializeNotificationBuilder);
        }
    }

    private Notification buildNotificationForSending(Class cls, Notification.Builder builder) {
        int i4 = builder.getExtras().getInt("id", -1);
        Intent intent = new Intent(this.mContext, (Class<?>) cls);
        intent.addFlags(805306368);
        intent.putExtra(KEY_NOTIFICATION_ID, i4);
        builder.setContentIntent(getActivityPendingIntent(i4, intent, 0));
        finalizeNotificationForDisplay(builder);
        return builder.build();
    }

    private Intent buildNotificationIntent() {
        Intent intent = new Intent(this.mContext, (Class<?>) UnityNotificationManager.class);
        intent.setFlags(268468224);
        return intent;
    }

    private boolean canScheduleExactAlarms(AlarmManager alarmManager) {
        boolean canScheduleExactAlarms;
        Bundle appMetadata;
        int i4 = Build.VERSION.SDK_INT;
        if (this.mExactSchedulingSetting < 0 && (appMetadata = getAppMetadata()) != null) {
            this.mExactSchedulingSetting = appMetadata.getInt("com.unity.androidnotifications.exact_scheduling", 1);
        }
        if (this.mExactSchedulingSetting == 0) {
            return false;
        }
        if (i4 < 31) {
            return true;
        }
        canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
        return canScheduleExactAlarms;
    }

    private Notification.Builder deserializeNotificationBuilder(Integer num) {
        Object deserializeNotification = UnityNotificationUtilities.deserializeNotification(this.mContext, this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(num.toString()), 0));
        if (deserializeNotification == null) {
            return null;
        }
        return deserializeNotification instanceof Notification ? UnityNotificationUtilities.recoverBuilder(this.mContext, (Notification) deserializeNotification) : (Notification.Builder) deserializeNotification;
    }

    private void finalizeNotificationForDisplay(Notification.Builder builder) {
        String string = builder.getExtras().getString(KEY_SMALL_ICON);
        Object iconForUri = getIconForUri(string);
        if (iconForUri != null) {
            builder.setSmallIcon((Icon) iconForUri);
        } else {
            int findResourceIdInContextByName = UnityNotificationUtilities.findResourceIdInContextByName(this.mContext, string);
            if (findResourceIdInContextByName == 0) {
                findResourceIdInContextByName = this.mContext.getApplicationInfo().icon;
            }
            builder.setSmallIcon(findResourceIdInContextByName);
        }
        Object icon = getIcon(builder.getExtras().getString(KEY_LARGE_ICON));
        if (icon != null) {
            if (icon instanceof Icon) {
                builder.setLargeIcon((Icon) icon);
            } else {
                builder.setLargeIcon((Bitmap) icon);
            }
        }
        setupBigPictureStyle(builder);
    }

    private Set<String> findInvalidNotificationIds(Set<String> set) {
        Intent buildNotificationIntent = buildNotificationIntent();
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (getBroadcastPendingIntent(Integer.valueOf(str).intValue(), buildNotificationIntent, 536870912) == null) {
                hashSet.add(str);
            }
        }
        for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
            hashSet.remove(String.valueOf(statusBarNotification.getId()));
        }
        Activity activity = UnityPlayer.currentActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
                hashSet.remove(String.valueOf(intent.getExtras().getInt(KEY_NOTIFICATION_ID)));
            }
        }
        return hashSet;
    }

    private int generateUniqueId() {
        int i4 = 0;
        do {
            i4 += this.mRandom.nextInt(1000);
        } while (this.mScheduledNotifications.containsKey(Integer.valueOf(i4)));
        return i4;
    }

    private PendingIntent getActivityPendingIntent(int i4, Intent intent, int i5) {
        return PendingIntent.getActivity(this.mContext, i4, intent, i5 | 67108864);
    }

    private Bundle getAppMetadata() {
        try {
            return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private PendingIntent getBroadcastPendingIntent(int i4, Intent intent, int i5) {
        return PendingIntent.getBroadcast(this.mContext, i4, intent, i5 | 67108864);
    }

    private Object getIcon(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return BitmapFactory.decodeFile(str);
        }
        Object iconForUri = getIconForUri(str);
        return iconForUri != null ? iconForUri : getIconFromResources(str, false);
    }

    private Object getIconForUri(String str) {
        if (str == null || str.length() == 0 || str.indexOf("://") <= 0) {
            return null;
        }
        return Icon.createWithContentUri(str);
    }

    private Object getIconFromResources(String str, boolean z4) {
        int findResourceIdInContextByName = UnityNotificationUtilities.findResourceIdInContextByName(this.mContext, str);
        if (findResourceIdInContextByName != 0) {
            return !z4 ? Icon.createWithResource(this.mContext, findResourceIdInContextByName) : BitmapFactory.decodeResource(this.mContext.getResources(), findResourceIdInContextByName);
        }
        return null;
    }

    public static String getNotificationChannelId(Notification notification) {
        String channelId;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        channelId = notification.getChannelId();
        return channelId;
    }

    public static Integer getNotificationColor(Notification notification) {
        if (Build.VERSION.SDK_INT < 26 || notification.extras.containsKey("android.colorized")) {
            return Integer.valueOf(notification.color);
        }
        return null;
    }

    public static int getNotificationGroupAlertBehavior(Notification notification) {
        int groupAlertBehavior;
        if (Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        groupAlertBehavior = notification.getGroupAlertBehavior();
        return groupAlertBehavior;
    }

    static synchronized UnityNotificationManager getNotificationManagerImpl(Context context) {
        UnityNotificationManager unityNotificationManager;
        synchronized (UnityNotificationManager.class) {
            try {
                if (mUnityNotificationManager == null) {
                    UnityNotificationManager unityNotificationManager2 = new UnityNotificationManager();
                    mUnityNotificationManager = unityNotificationManager2;
                    unityNotificationManager2.mVisibleNotifications = new HashSet<>();
                    mUnityNotificationManager.mScheduledNotifications = new ConcurrentHashMap<>();
                }
                mUnityNotificationManager.mContext = context.getApplicationContext();
                unityNotificationManager = mUnityNotificationManager;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unityNotificationManager;
    }

    private Object getNotificationOrBuilderForIntent(Intent intent) {
        Object notificationOrIdForIntent = getNotificationOrIdForIntent(intent);
        if (!(notificationOrIdForIntent instanceof Integer)) {
            return notificationOrIdForIntent;
        }
        Integer num = (Integer) notificationOrIdForIntent;
        Notification.Builder builder = this.mScheduledNotifications.get(num);
        return builder == null ? deserializeNotificationBuilder(num) : builder;
    }

    private Object getNotificationOrIdForIntent(Intent intent) {
        if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
            return Integer.valueOf(intent.getExtras().getInt(KEY_NOTIFICATION_ID));
        }
        if (intent.hasExtra(KEY_NOTIFICATION)) {
            return intent.getParcelableExtra(KEY_NOTIFICATION);
        }
        return null;
    }

    private synchronized Set<String> getScheduledNotificationIDs() {
        return this.mContext.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0).getStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, new HashSet());
    }

    private static String getSharedPrefsNameByChannelId(String str) {
        return String.format("unity_notification_channel_%s", str);
    }

    static String getSharedPrefsNameByNotificationId(String str) {
        return String.format("u_notification_data_%s", str);
    }

    private void initialize(Activity activity, NotificationCallback notificationCallback) {
        this.mContext = activity.getApplicationContext();
        this.mActivity = activity;
        this.mNotificationCallback = notificationCallback;
        if (this.mScheduledNotifications == null) {
            this.mScheduledNotifications = new ConcurrentHashMap<>();
        }
        UnityNotificationBackgroundThread unityNotificationBackgroundThread = this.mBackgroundThread;
        if (unityNotificationBackgroundThread == null || !unityNotificationBackgroundThread.isAlive()) {
            this.mBackgroundThread = new UnityNotificationBackgroundThread(this, this.mScheduledNotifications);
        }
        if (this.mRandom == null) {
            this.mRandom = new Random();
        }
        if (this.mVisibleNotifications == null) {
            this.mVisibleNotifications = new HashSet<>();
        }
        getAppMetadata();
        Class<?> openAppActivity = UnityNotificationUtilities.getOpenAppActivity(this.mContext);
        this.mOpenActivity = openAppActivity;
        if (openAppActivity == null) {
            throw new RuntimeException("Failed to determine Activity to be opened when tapping notification");
        }
        if (this.mBackgroundThread.isAlive()) {
            return;
        }
        this.mBackgroundThread.start();
    }

    private static boolean isInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i4 = runningAppProcessInfo.importance;
        return i4 == 100 || i4 == 200;
    }

    private Bitmap loadBitmap(String str) {
        try {
            return BitmapFactory.decodeStream(this.mContext.getContentResolver().openInputStream(Uri.parse(str)));
        } catch (Exception e4) {
            Log.e(TAG_UNITY, "Failed to load image " + str, e4);
            return null;
        }
    }

    @TargetApi(26)
    private static NotificationChannelWrapper notificationChannelToWrapper(Object obj) {
        String id;
        CharSequence name;
        int importance;
        String description;
        boolean shouldShowLights;
        boolean shouldVibrate;
        boolean canBypassDnd;
        boolean canShowBadge;
        long[] vibrationPattern;
        int lockscreenVisibility;
        String group;
        NotificationChannel a4 = AbstractC1721i.a(obj);
        NotificationChannelWrapper notificationChannelWrapper = new NotificationChannelWrapper();
        id = a4.getId();
        notificationChannelWrapper.id = id;
        name = a4.getName();
        notificationChannelWrapper.name = name.toString();
        importance = a4.getImportance();
        notificationChannelWrapper.importance = importance;
        description = a4.getDescription();
        notificationChannelWrapper.description = description;
        shouldShowLights = a4.shouldShowLights();
        notificationChannelWrapper.enableLights = shouldShowLights;
        shouldVibrate = a4.shouldVibrate();
        notificationChannelWrapper.enableVibration = shouldVibrate;
        canBypassDnd = a4.canBypassDnd();
        notificationChannelWrapper.canBypassDnd = canBypassDnd;
        canShowBadge = a4.canShowBadge();
        notificationChannelWrapper.canShowBadge = canShowBadge;
        vibrationPattern = a4.getVibrationPattern();
        notificationChannelWrapper.vibrationPattern = vibrationPattern;
        lockscreenVisibility = a4.getLockscreenVisibility();
        notificationChannelWrapper.lockscreenVisibility = lockscreenVisibility;
        group = a4.getGroup();
        notificationChannelWrapper.group = group;
        return notificationChannelWrapper;
    }

    private void scheduleNotificationIntentAlarm(long j4, long j5, PendingIntent pendingIntent) {
        AlarmManager alarmManager = (AlarmManager) this.mContext.getSystemService("alarm");
        if (j4 > 0) {
            alarmManager.setInexactRepeating(0, j5, j4, pendingIntent);
        } else if (canScheduleExactAlarms(alarmManager)) {
            alarmManager.setExactAndAllowWhileIdle(0, j5, pendingIntent);
        } else {
            alarmManager.set(0, j5, pendingIntent);
        }
    }

    public static void setNotificationColor(Notification.Builder builder, int i4) {
        if (i4 != 0) {
            builder.setColor(i4);
            if (Build.VERSION.SDK_INT >= 26) {
                builder.setColorized(true);
            }
        }
    }

    public static void setNotificationGroupAlertBehavior(Notification.Builder builder, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(i4);
        }
    }

    public static void setNotificationIcon(Notification.Builder builder, String str, String str2) {
        if (str2 == null || (str2.length() == 0 && builder.getExtras().getString(str) != null)) {
            builder.getExtras().remove(str);
        } else {
            builder.getExtras().putString(str, str2);
        }
    }

    public static void setNotificationUsesChronometer(Notification.Builder builder, boolean z4) {
        builder.setUsesChronometer(z4);
    }

    private void showNotification(Intent intent) {
        Object notificationOrIdForIntent = getNotificationOrIdForIntent(intent);
        if (notificationOrIdForIntent == null) {
            return;
        }
        if (notificationOrIdForIntent instanceof Notification) {
            Notification notification = (Notification) notificationOrIdForIntent;
            notify(notification.extras.getInt("id", -1), notification);
            return;
        }
        final Integer num = (Integer) notificationOrIdForIntent;
        Notification.Builder builder = this.mScheduledNotifications.get(num);
        if (builder != null) {
            notify(num.intValue(), builder);
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.unity.androidnotifications.J
                @Override // java.lang.Runnable
                public final void run() {
                    UnityNotificationManager.a(UnityNotificationManager.this, num);
                }
            });
        }
    }

    @TargetApi(24)
    public int areNotificationsEnabled() {
        boolean z4 = Build.VERSION.SDK_INT < 33 || this.mContext.checkCallingOrSelfPermission("android.permission.POST_NOTIFICATIONS") == 0;
        boolean areNotificationsEnabled = getNotificationManager().areNotificationsEnabled();
        if (z4) {
            return areNotificationsEnabled ? 1 : 5;
        }
        return 2;
    }

    public void cancelAllNotifications() {
        getNotificationManager().cancelAll();
    }

    public void cancelAllPendingNotificationIntents() {
        this.mBackgroundThread.enqueueCancelAllNotifications();
    }

    public void cancelDisplayedNotification(int i4) {
        getNotificationManager().cancel(i4);
    }

    public void cancelPendingNotification(int i4) {
        this.mBackgroundThread.enqueueCancelNotification(i4);
    }

    void cancelPendingNotificationIntent(int i4) {
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(i4, new Intent(this.mContext, (Class<?>) UnityNotificationManager.class), 536870912);
        if (broadcastPendingIntent != null) {
            ((AlarmManager) this.mContext.getSystemService("alarm")).cancel(broadcastPendingIntent);
            broadcastPendingIntent.cancel();
        }
    }

    public boolean checkIfPendingNotificationIsRegistered(int i4) {
        return getBroadcastPendingIntent(i4, new Intent(this.mActivity, (Class<?>) UnityNotificationManager.class), 536870912) != null;
    }

    public int checkNotificationStatus(int i4) {
        for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
            if (i4 == statusBarNotification.getId()) {
                return 2;
            }
        }
        return (this.mScheduledNotifications.containsKey(Integer.valueOf(i4)) || checkIfPendingNotificationIsRegistered(i4)) ? 1 : 0;
    }

    public Notification.Builder createNotificationBuilder(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            A.a();
            return z.a(this.mContext, str);
        }
        Notification.Builder builder = new Notification.Builder(this.mContext);
        NotificationChannelWrapper notificationChannel = getNotificationChannel(str);
        long[] jArr = notificationChannel.vibrationPattern;
        int i4 = -1;
        if (jArr == null || jArr.length <= 0) {
            builder.setDefaults(-1);
        } else {
            builder.setDefaults(5);
            builder.setVibrate(notificationChannel.vibrationPattern);
        }
        builder.setVisibility(notificationChannel.lockscreenVisibility);
        int i5 = notificationChannel.importance;
        if (i5 == 0) {
            i4 = -2;
        } else if (i5 != 2) {
            i4 = (i5 == 3 || i5 != 4) ? 0 : 2;
        }
        builder.setPriority(i4);
        builder.getExtras().putString("channelID", str);
        return builder;
    }

    synchronized void deleteExpiredNotificationIntent(String str) {
        this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(str), 0).edit().clear().apply();
    }

    public void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            getNotificationManager().deleteNotificationChannel(str);
            return;
        }
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0);
        Set<String> stringSet = sharedPreferences.getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new HashSet());
        if (stringSet.contains(str)) {
            HashSet hashSet = new HashSet(stringSet);
            hashSet.remove(str);
            SharedPreferences.Editor clear = sharedPreferences.edit().clear();
            clear.putStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, hashSet);
            clear.apply();
            this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0).edit().clear().apply();
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (str == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            getNotificationManager().deleteNotificationChannelGroup(str);
            return;
        }
        for (NotificationChannelWrapper notificationChannelWrapper : getNotificationChannels()) {
            if (str.equals(notificationChannelWrapper.group)) {
                deleteNotificationChannel(notificationChannelWrapper.id);
            }
        }
    }

    public NotificationChannelWrapper getNotificationChannel(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannel = getNotificationManagerImpl(this.mContext).getNotificationManager().getNotificationChannel(str);
            if (notificationChannel == null) {
                return null;
            }
            return notificationChannelToWrapper(notificationChannel);
        }
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0);
        NotificationChannelWrapper notificationChannelWrapper = new NotificationChannelWrapper();
        notificationChannelWrapper.id = str;
        notificationChannelWrapper.name = sharedPreferences.getString(b9.h.f15436D0, StringUtils.UNDEFINED);
        notificationChannelWrapper.importance = sharedPreferences.getInt("importance", 3);
        notificationChannelWrapper.description = sharedPreferences.getString("description", StringUtils.UNDEFINED);
        notificationChannelWrapper.enableLights = sharedPreferences.getBoolean("enableLights", false);
        notificationChannelWrapper.enableVibration = sharedPreferences.getBoolean("enableVibration", false);
        notificationChannelWrapper.canBypassDnd = sharedPreferences.getBoolean("canBypassDnd", false);
        notificationChannelWrapper.canShowBadge = sharedPreferences.getBoolean("canShowBadge", false);
        notificationChannelWrapper.lockscreenVisibility = sharedPreferences.getInt("lockscreenVisibility", 1);
        notificationChannelWrapper.group = sharedPreferences.getString("group", null);
        String[] split = sharedPreferences.getString("vibrationPattern", "[]").split(StringUtils.COMMA);
        int length = split.length;
        long[] jArr = new long[length];
        if (length > 1) {
            for (int i4 = 0; i4 < split.length; i4++) {
                try {
                    jArr[i4] = Long.parseLong(split[i4]);
                } catch (NumberFormatException unused) {
                    jArr[i4] = 1;
                }
            }
        }
        notificationChannelWrapper.vibrationPattern = length > 1 ? jArr : null;
        return notificationChannelWrapper;
    }

    public NotificationChannelWrapper[] getNotificationChannels() {
        List notificationChannels;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannels = getNotificationManager().getNotificationChannels();
            if (notificationChannels.size() == 0) {
                return null;
            }
            NotificationChannelWrapper[] notificationChannelWrapperArr = new NotificationChannelWrapper[notificationChannels.size()];
            Iterator it = notificationChannels.iterator();
            while (it.hasNext()) {
                notificationChannelWrapperArr[i4] = notificationChannelToWrapper(AbstractC1721i.a(it.next()));
                i4++;
            }
            return notificationChannelWrapperArr;
        }
        Set<String> stringSet = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0).getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new HashSet());
        if (stringSet.size() == 0) {
            return null;
        }
        NotificationChannelWrapper[] notificationChannelWrapperArr2 = new NotificationChannelWrapper[stringSet.size()];
        Iterator<String> it2 = stringSet.iterator();
        while (it2.hasNext()) {
            notificationChannelWrapperArr2[i4] = getNotificationChannel(it2.next());
            i4++;
        }
        return notificationChannelWrapperArr2;
    }

    public Notification getNotificationFromIntent(Intent intent) {
        if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
            int i4 = intent.getExtras().getInt(KEY_NOTIFICATION_ID);
            for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
                if (statusBarNotification.getId() == i4) {
                    return statusBarNotification.getNotification();
                }
            }
        }
        Object notificationOrBuilderForIntent = getNotificationOrBuilderForIntent(intent);
        if (notificationOrBuilderForIntent == null) {
            return null;
        }
        return notificationOrBuilderForIntent instanceof Notification ? (Notification) notificationOrBuilderForIntent : ((Notification.Builder) notificationOrBuilderForIntent).build();
    }

    public NotificationManager getNotificationManager() {
        return (NotificationManager) this.mContext.getSystemService("notification");
    }

    public int getTargetSdk() {
        return this.mContext.getApplicationInfo().targetSdkVersion;
    }

    synchronized List<Notification.Builder> loadSavedNotifications() {
        ArrayList arrayList;
        try {
            Set<String> scheduledNotificationIDs = getScheduledNotificationIDs();
            arrayList = new ArrayList();
            HashSet<String> hashSet = new HashSet();
            for (String str : scheduledNotificationIDs) {
                Object deserializeNotification = UnityNotificationUtilities.deserializeNotification(this.mContext, this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(str), 0));
                Notification.Builder recoverBuilder = deserializeNotification != null ? deserializeNotification instanceof Notification.Builder ? (Notification.Builder) deserializeNotification : UnityNotificationUtilities.recoverBuilder(this.mContext, (Notification) deserializeNotification) : null;
                if (recoverBuilder != null) {
                    arrayList.add(recoverBuilder);
                } else {
                    hashSet.add(str);
                }
            }
            if (hashSet.size() > 0) {
                HashSet hashSet2 = new HashSet(scheduledNotificationIDs);
                for (String str2 : hashSet) {
                    hashSet2.remove(str2);
                    deleteExpiredNotificationIntent(str2);
                }
                saveScheduledNotificationIDs(hashSet2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    void notify(int i4, Notification.Builder builder) {
        Class<?> cls = this.mOpenActivity;
        if (cls == null && (cls = UnityNotificationUtilities.getOpenAppActivity(this.mContext)) == null) {
            Log.e(TAG_UNITY, "Activity not found, cannot show notification");
            return;
        }
        Notification buildNotificationForSending = buildNotificationForSending(cls, builder);
        if (buildNotificationForSending != null) {
            notify(i4, buildNotificationForSending);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        getNotificationManagerImpl(context).onReceive(intent);
    }

    void performNotificationHousekeeping(Set<String> set) {
        Log.d(TAG_UNITY, "Checking for invalid notification IDs still hanging around");
        Set<String> findInvalidNotificationIds = findInvalidNotificationIds(set);
        HashSet hashSet = new HashSet(set);
        for (String str : findInvalidNotificationIds) {
            hashSet.remove(str);
            this.mScheduledNotifications.remove(str);
        }
        Iterator<String> it = findInvalidNotificationIds.iterator();
        while (it.hasNext()) {
            deleteExpiredNotificationIntent(it.next());
        }
    }

    void performNotificationScheduling(int i4, Notification.Builder builder, boolean z4) {
        Bundle extras = builder.getExtras();
        long j4 = extras.getLong(KEY_REPEAT_INTERVAL, -1L);
        long j5 = extras.getLong(KEY_FIRE_TIME, -1L);
        boolean z5 = j5 - Calendar.getInstance().getTime().getTime() < 1000;
        if (!z5 || j4 > 0) {
            if (z5) {
                j5 += j4;
            }
            Intent buildNotificationIntent = buildNotificationIntent();
            if (buildNotificationIntent != null) {
                saveNotification(builder.build(), z4);
                scheduleAlarmWithNotification(builder, buildNotificationIntent, j5);
            }
        }
        if (z5) {
            notify(i4, buildNotificationForSending(this.mOpenActivity, builder));
        }
    }

    public void registerNotificationChannel(String str, String str2, int i4, String str3, boolean z4, boolean z5, boolean z6, boolean z7, long[] jArr, int i5, String str4) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel a4 = com.google.android.gms.common.e.a(str, str2, i4);
            a4.setDescription(str3);
            a4.enableLights(z4);
            a4.enableVibration(z5);
            a4.setBypassDnd(z6);
            a4.setShowBadge(z7);
            a4.setVibrationPattern(jArr);
            a4.setLockscreenVisibility(i5);
            a4.setGroup(str4);
            getNotificationManager().createNotificationChannel(a4);
            return;
        }
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new HashSet()));
        hashSet.add(str);
        SharedPreferences.Editor clear = sharedPreferences.edit().clear();
        clear.putStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, hashSet);
        clear.apply();
        SharedPreferences.Editor edit = this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0).edit();
        edit.putString(b9.h.f15436D0, str2);
        edit.putInt("importance", i4);
        edit.putString("description", str3);
        edit.putBoolean("enableLights", z4);
        edit.putBoolean("enableVibration", z5);
        edit.putBoolean("canBypassDnd", z6);
        edit.putBoolean("canShowBadge", z7);
        edit.putString("vibrationPattern", Arrays.toString(jArr));
        edit.putInt("lockscreenVisibility", i5);
        edit.putString("group", str4);
        edit.apply();
    }

    public void registerNotificationChannelGroup(String str, String str2, String str3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            NotificationChannelGroup a4 = B.a(str, str2);
            if (i4 >= 28) {
                a4.setDescription(str3);
            }
            getNotificationManager().createNotificationChannelGroup(a4);
        }
    }

    synchronized void saveNotification(Notification notification, boolean z4) {
        UnityNotificationUtilities.serializeNotification(this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(Integer.toString(notification.extras.getInt("id", -1))), 0), notification, z4);
    }

    synchronized void saveScheduledNotificationIDs(Set<String> set) {
        SharedPreferences.Editor clear = this.mContext.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0).edit().clear();
        clear.putStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, set);
        clear.apply();
    }

    void scheduleAlarmWithNotification(Notification.Builder builder, Intent intent, long j4) {
        Bundle extras = builder.getExtras();
        int i4 = extras.getInt("id", -1);
        long j5 = extras.getLong(KEY_REPEAT_INTERVAL, -1L);
        this.mScheduledNotifications.put(Integer.valueOf(i4), builder);
        intent.putExtra(KEY_NOTIFICATION_ID, i4);
        scheduleNotificationIntentAlarm(j5, j4, getBroadcastPendingIntent(i4, intent, 134217728));
    }

    public int scheduleNotification(Notification.Builder builder, boolean z4) {
        int i4;
        Bundle extras = builder.getExtras();
        if (extras.containsKey("id")) {
            i4 = builder.getExtras().getInt("id", -1);
        } else {
            int generateUniqueId = generateUniqueId();
            extras.putInt("id", generateUniqueId);
            i4 = generateUniqueId;
        }
        this.mBackgroundThread.enqueueNotification(i4, builder, z4, this.mScheduledNotifications.putIfAbsent(Integer.valueOf(i4), builder) == null);
        return i4;
    }

    public void setupBigPictureStyle(Notification.Builder builder, String str, String str2, String str3, String str4, String str5, boolean z4) {
        Bundle extras = builder.getExtras();
        if (str2 == null || str2.length() == 0) {
            return;
        }
        extras.putString(KEY_BIG_LARGE_ICON, str);
        extras.putString(KEY_BIG_PICTURE, str2);
        extras.putString(KEY_BIG_CONTENT_TITLE, str3);
        extras.putString(KEY_BIG_SUMMARY_TEXT, str5);
        extras.putString(KEY_BIG_CONTENT_DESCRIPTION, str4);
        extras.putBoolean(KEY_BIG_SHOW_WHEN_COLLAPSED, z4);
    }

    public void showNotificationSettings(String str) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 26) {
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.mContext.getPackageName(), null));
        } else {
            if (str == null || str.length() <= 0) {
                intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            } else {
                Intent intent2 = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent2.putExtra("android.provider.extra.CHANNEL_ID", str);
                intent = intent2;
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", this.mContext.getPackageName());
        }
        intent.addFlags(268435456);
        this.mActivity.startActivity(intent);
    }

    public void onReceive(Intent intent) {
        showNotification(intent);
    }

    private void notify(int i4, Notification notification) {
        boolean z4 = notification.extras.getBoolean(KEY_SHOW_IN_FOREGROUND, true);
        if (!isInForeground() || z4) {
            getNotificationManager().notify(i4, notification);
        }
        if (notification.extras.getLong(KEY_REPEAT_INTERVAL, -1L) <= 0) {
            this.mScheduledNotifications.remove(Integer.valueOf(i4));
            cancelPendingNotificationIntent(i4);
        }
        try {
            NotificationCallback notificationCallback = this.mNotificationCallback;
            if (notificationCallback != null) {
                notificationCallback.onSentNotification(notification);
            }
        } catch (RuntimeException unused) {
            Log.w(TAG_UNITY, "Can not invoke OnNotificationReceived event when the app is not running!");
        }
    }

    public static synchronized UnityNotificationManager getNotificationManagerImpl(Activity activity, NotificationCallback notificationCallback) {
        UnityNotificationManager unityNotificationManager;
        synchronized (UnityNotificationManager.class) {
            try {
                if (mUnityNotificationManager == null) {
                    mUnityNotificationManager = new UnityNotificationManager();
                }
                mUnityNotificationManager.initialize(activity, notificationCallback);
                unityNotificationManager = mUnityNotificationManager;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unityNotificationManager;
    }

    public boolean canScheduleExactAlarms() {
        return canScheduleExactAlarms((AlarmManager) this.mContext.getSystemService("alarm"));
    }

    void scheduleAlarmWithNotification(Notification.Builder builder) {
        scheduleAlarmWithNotification(builder, buildNotificationIntent(), builder.getExtras().getLong(KEY_FIRE_TIME, 0L));
    }

    private void setupBigPictureStyle(Notification.Builder builder) {
        Bundle extras = builder.getExtras();
        String string = extras.getString(KEY_BIG_PICTURE);
        if (string == null) {
            return;
        }
        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
        Object icon = getIcon(extras.getString(KEY_BIG_LARGE_ICON));
        if (icon != null) {
            if (icon instanceof Icon) {
                bigPictureStyle.bigLargeIcon((Icon) icon);
            } else {
                bigPictureStyle.bigLargeIcon((Bitmap) icon);
            }
        }
        if (string.charAt(0) == '/') {
            bigPictureStyle.bigPicture(BitmapFactory.decodeFile(string));
        } else {
            int i4 = Build.VERSION.SDK_INT;
            if (string.indexOf("://") <= 0) {
                Object iconFromResources = getIconFromResources(string, i4 < 31);
                if (i4 >= 31 && (iconFromResources instanceof Icon)) {
                    bigPictureStyle.bigPicture((Icon) iconFromResources);
                } else if (iconFromResources instanceof Bitmap) {
                    bigPictureStyle.bigPicture((Bitmap) iconFromResources);
                }
            } else if (i4 >= 31) {
                bigPictureStyle.bigPicture(Icon.createWithContentUri(string));
            } else {
                Bitmap loadBitmap = loadBitmap(string);
                if (loadBitmap != null) {
                    bigPictureStyle.bigPicture(loadBitmap);
                }
            }
        }
        bigPictureStyle.setBigContentTitle(extras.getString(KEY_BIG_CONTENT_TITLE));
        bigPictureStyle.setSummaryText(extras.getString(KEY_BIG_SUMMARY_TEXT));
        if (Build.VERSION.SDK_INT >= 31) {
            bigPictureStyle.setContentDescription(extras.getString(KEY_BIG_CONTENT_DESCRIPTION));
            bigPictureStyle.showBigPictureWhenCollapsed(extras.getBoolean(KEY_BIG_SHOW_WHEN_COLLAPSED, false));
        }
        builder.setStyle(bigPictureStyle);
    }
}
