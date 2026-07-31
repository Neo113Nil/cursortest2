package com.unity.services.pushnotifications.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.e;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import com.ironsource.b9;
import com.unity.androidnotifications.A;
import com.unity.androidnotifications.AbstractC1721i;
import com.unity.androidnotifications.z;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UnityPushNotifications {
    public static final String KEY_CHANNEL_ID = "channelID";
    static final String NOTIFICATION_CHANNELS_SHARED_PREFS = "UNITY_NOTIFICATIONS";
    static final String NOTIFICATION_CHANNELS_SHARED_PREFS_KEY = "ChannelIDs";
    public static String SENDER_ID = "UnityNotificationsSenderId";
    public static String SHARED_PREFERENCE = "UnityNotificationsSharedPreferences";
    private static final String TAG = "UnityPushNotifications";
    static UnityPushNotifications mUnityPushNotifications;
    private Context mContext = null;
    private Activity mActivity = null;
    private String mAppName = "UNITY_PUSH_NOTIFICATIONS";
    private UnityPushNotificationsCallback mPushNotificationsCallback = null;

    public UnityPushNotifications() {
        Log.d(TAG, "Initialise");
    }

    private Notification buildNotification(Notification.Builder builder, Map<String, String> map) {
        Bitmap loadBitmap;
        Intent launchIntentForPackage = this.mContext.getPackageManager().getLaunchIntentForPackage(this.mContext.getPackageName());
        launchIntentForPackage.putExtra("notificationData", new JSONObject(map).toString());
        builder.setContentIntent(PendingIntent.getActivity(this.mContext, 0, launchIntentForPackage, 201326592));
        builder.setContentTitle(map.get(b9.h.f15436D0));
        builder.setContentText(map.get("alert"));
        builder.setSmallIcon(this.mContext.getApplicationInfo().icon);
        builder.setAutoCancel(true);
        builder.setOngoing(false);
        String str = map.get("imageUrl");
        if (str != null && (loadBitmap = loadBitmap(str)) != null) {
            builder.setLargeIcon(loadBitmap);
            builder.setStyle(new Notification.BigPictureStyle().bigPicture(loadBitmap).bigLargeIcon(loadBitmap));
        }
        return builder.build();
    }

    private Object getIconForUri(String str) {
        if (str == null || str.length() == 0 || str.indexOf("://") <= 0) {
            return null;
        }
        return Icon.createWithContentUri(str);
    }

    private static String getSharedPrefsNameByChannelId(String str) {
        return String.format("unity_notification_channel_%s", str);
    }

    public static synchronized UnityPushNotifications getUnityPushNotificationImpl(Context context) {
        UnityPushNotifications unityPushNotifications;
        synchronized (UnityPushNotifications.class) {
            try {
                if (mUnityPushNotifications == null) {
                    mUnityPushNotifications = new UnityPushNotifications();
                }
                mUnityPushNotifications.mContext = context.getApplicationContext();
                unityPushNotifications = mUnityPushNotifications;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unityPushNotifications;
    }

    private void initialize(Activity activity, UnityPushNotificationsCallback unityPushNotificationsCallback) {
        this.mContext = activity.getApplicationContext();
        this.mActivity = activity;
        this.mPushNotificationsCallback = unityPushNotificationsCallback;
    }

    private Bitmap loadBitmap(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (IOException e4) {
            Log.e(TAG, "Failed to load image " + str + " : " + e4);
            return null;
        }
    }

    @TargetApi(26)
    private static NotificationChannelWrapper notificationChannelToWrapper(Object obj) {
        String id;
        CharSequence name;
        int importance;
        String description;
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
        return notificationChannelWrapper;
    }

    private void notify(int i4, Notification notification) {
        Log.w(TAG, "notify " + notification.toString());
        getNotificationManager().notify(-1, notification);
    }

    public Notification.Builder createNotificationBuilder(String str) {
        int i4;
        if (Build.VERSION.SDK_INT >= 26) {
            A.a();
            return z.a(this.mContext, str);
        }
        Notification.Builder builder = new Notification.Builder(this.mContext);
        int i5 = getNotificationChannel(str).importance;
        if (i5 != 0) {
            i4 = 2;
            if (i5 == 2) {
                i4 = -1;
            } else if (i5 == 3 || i5 != 4) {
                i4 = 0;
            }
        } else {
            i4 = -2;
        }
        builder.setPriority(i4);
        builder.getExtras().putString("channelID", str);
        return builder;
    }

    public NotificationChannelWrapper getNotificationChannel(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannel = getUnityPushNotificationImpl(this.mActivity).getNotificationManager().getNotificationChannel(str);
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
        return notificationChannelWrapper;
    }

    public NotificationManager getNotificationManager() {
        return (NotificationManager) this.mContext.getSystemService("notification");
    }

    public void registerForPushNotifications(String str, String str2, String str3, String str4) {
        FirebaseApp initializeApp = FirebaseApp.initializeApp(this.mContext, new FirebaseOptions.Builder().setApiKey(str).setApplicationId(str2).setGcmSenderId(str3).setProjectId(str4).build(), this.mAppName);
        this.mContext.getSharedPreferences(SHARED_PREFERENCE, 0).edit().putString(SENDER_ID, str3).apply();
        ((FirebaseMessaging) initializeApp.get(FirebaseMessaging.class)).getToken().addOnCompleteListener(new OnCompleteListener<String>() { // from class: com.unity.services.pushnotifications.android.UnityPushNotifications.1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NonNull Task<String> task) {
                if (!task.isSuccessful()) {
                    Log.w(UnityPushNotifications.TAG, "Fetching FCM registration token failed", task.getException());
                    UnityPushNotifications.this.mPushNotificationsCallback.OnTokenReceived("");
                } else {
                    String result = task.getResult();
                    Log.d(UnityPushNotifications.TAG, result);
                    UnityPushNotifications.this.mPushNotificationsCallback.OnTokenReceived(result);
                }
            }
        });
    }

    public void registerNotificationChannel(String str, String str2, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            getNotificationManager().createNotificationChannel(e.a(str, str2, i4));
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
        edit.apply();
    }

    public void sendPushNotification(RemoteMessage remoteMessage, String str) {
        registerNotificationChannel(str, this.mContext.getPackageName(), 3);
        notify(-1, buildNotification(createNotificationBuilder(str), remoteMessage.getData()));
        try {
            if (this.mPushNotificationsCallback != null) {
                this.mPushNotificationsCallback.OnRemoteNotificationReceived(new JSONObject(remoteMessage.getData()).toString());
            }
        } catch (RuntimeException unused) {
            Log.w(TAG, "Can not invoke OnPushNotificationReceived event when the app is not running!");
        }
    }
}
