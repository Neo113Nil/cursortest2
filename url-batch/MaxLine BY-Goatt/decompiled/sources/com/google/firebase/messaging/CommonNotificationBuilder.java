package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import defpackage.at1;
import defpackage.bt1;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CommonNotificationBuilder {
    private static final String ACTION_RECEIVER = "com.google.android.c2dm.intent.RECEIVE";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class DisplayNotificationInfo {
        public final int id;
        public final bt1 notificationBuilder;
        public final String tag;

        public DisplayNotificationInfo(bt1 bt1Var, String str, int i) {
            this.notificationBuilder = bt1Var;
            this.tag = str;
            this.id = i;
        }
    }

    private CommonNotificationBuilder() {
    }

    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent createTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (createTargetIntent == null) {
            return null;
        }
        createTargetIntent.addFlags(67108864);
        createTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            createTargetIntent.putExtra(Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), createTargetIntent, getPendingIntentFlags(1073741824));
    }

    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new Intent(ACTION_RECEIVER).setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), getPendingIntentFlags(1073741824));
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        bt1 bt1Var = new bt1(context2, str);
        String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.TITLE);
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            bt1Var.e = bt1.b(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.BODY);
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            bt1Var.f = bt1.b(possiblyLocalizedString2);
            at1 at1Var = new at1();
            at1Var.n = bt1.b(possiblyLocalizedString2);
            bt1Var.e(at1Var);
        }
        int smallIcon = getSmallIcon(packageManager, resources, packageName, notificationParams.getString(Constants.MessageNotificationKeys.ICON), bundle);
        Notification notification = bt1Var.s;
        notification.icon = smallIcon;
        Uri sound = getSound(packageName, notificationParams, resources);
        if (sound != null) {
            notification.sound = sound;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        bt1Var.g = createContentIntent(context, notificationParams, packageName, packageManager);
        PendingIntent createDeleteIntent = createDeleteIntent(context, context2, notificationParams);
        if (createDeleteIntent != null) {
            notification.deleteIntent = createDeleteIntent;
        }
        Integer color = getColor(context2, notificationParams.getString(Constants.MessageNotificationKeys.COLOR), bundle);
        if (color != null) {
            bt1Var.o = color.intValue();
        }
        bt1Var.c(!notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY));
        bt1Var.m = notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY);
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
        if (string != null) {
            notification.tickerText = bt1.b(string);
        }
        Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            bt1Var.j = notificationPriority.intValue();
        }
        Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            bt1Var.p = visibility.intValue();
        }
        Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            bt1Var.i = notificationCount.intValue();
        }
        Long l = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
        if (l != null) {
            bt1Var.k = true;
            notification.when = l.longValue();
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            notification.vibrate = vibrateTimings;
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            int i = lightSettings[0];
            int i2 = lightSettings[1];
            int i3 = lightSettings[2];
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
        }
        int consolidatedDefaults = getConsolidatedDefaults(notificationParams);
        notification.defaults = consolidatedDefaults;
        if ((consolidatedDefaults & 4) != 0) {
            notification.flags |= 1;
        }
        return new DisplayNotificationInfo(bt1Var, getTag(notificationParams), 0);
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w(Constants.TAG, "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w(Constants.TAG, "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(context.getColor(i));
        } catch (Resources.NotFoundException unused2) {
            Log.w(Constants.TAG, "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
        ?? r0 = z;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            r0 = (z ? 1 : 0) | 2;
        }
        return notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS) ? r0 | 4 : r0;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(Constants.TAG, "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w(Constants.TAG, "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (TextUtils.isEmpty(string2)) {
                Log.w(Constants.TAG, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w(Constants.TAG, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e(Constants.TAG, "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE;
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL, string, 3));
            }
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int getPendingIntentFlags(int i) {
        return i | 67108864;
    }

    private static int getSmallIcon(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && isValidIcon(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && isValidIcon(resources, identifier2)) {
                return identifier2;
            }
            Log.w(Constants.TAG, "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt(METADATA_DEFAULT_ICON, 0);
        if (i == 0 || !isValidIcon(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w(Constants.TAG, "Couldn't get own application info: " + e);
            }
        }
        return (i == 0 || !isValidIcon(resources, i)) ? android.R.drawable.sym_def_app_icon : i;
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if ("default".equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean isValidIcon(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e(Constants.TAG, "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e(Constants.TAG, "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    public static boolean shouldUploadMetrics(NotificationParams notificationParams) {
        return notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED);
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) {
        Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
    }
}
