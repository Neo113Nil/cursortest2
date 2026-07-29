package com.google.android.gms.gcm;

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
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
final class zzd {
    static zzd zzj;
    private final Context zzk;
    private String zzl;
    private final AtomicInteger zzm = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private zzd(Context context) {
        this.zzk = context.getApplicationContext();
    }

    static synchronized zzd zzd(Context context) {
        zzd zzdVar;
        synchronized (zzd.class) {
            if (zzj == null) {
                zzj = new zzd(context);
            }
            zzdVar = zzj;
        }
        return zzdVar;
    }

    static String zzd(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    private final Bundle zze() {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = this.zzk.getPackageManager().getApplicationInfo(this.zzk.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (applicationInfo == null || applicationInfo.metaData == null) ? Bundle.EMPTY : applicationInfo.metaData;
    }

    private final String zze(Bundle bundle, String str) {
        String zzd = zzd(bundle, str);
        if (!TextUtils.isEmpty(zzd)) {
            return zzd;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        String zzd2 = zzd(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(zzd2)) {
            return null;
        }
        Resources resources = this.zzk.getResources();
        int identifier = resources.getIdentifier(zzd2, "string", this.zzk.getPackageName());
        if (identifier == 0) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf("_loc_key");
            String substring = (valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(zzd2).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(zzd2);
            sb.append(" Default value will be used.");
            Log.w("GcmNotification", sb.toString());
            return null;
        }
        String valueOf5 = String.valueOf(str);
        String valueOf6 = String.valueOf("_loc_args");
        String zzd3 = zzd(bundle, valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5));
        if (TextUtils.isEmpty(zzd3)) {
            return resources.getString(identifier);
        }
        try {
            JSONArray jSONArray = new JSONArray(zzd3);
            Object[] objArr = new String[jSONArray.length()];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return resources.getString(identifier, objArr);
        } catch (MissingFormatArgumentException e) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd2).length() + 58 + String.valueOf(zzd3).length());
            sb2.append("Missing format argument for ");
            sb2.append(zzd2);
            sb2.append(": ");
            sb2.append(zzd3);
            sb2.append(" Default value will be used.");
            Log.w("GcmNotification", sb2.toString(), e);
            return null;
        } catch (JSONException unused) {
            String valueOf7 = String.valueOf(str);
            String valueOf8 = String.valueOf("_loc_args");
            String substring2 = (valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7)).substring(6);
            StringBuilder sb3 = new StringBuilder(String.valueOf(substring2).length() + 41 + String.valueOf(zzd3).length());
            sb3.append("Malformed ");
            sb3.append(substring2);
            sb3.append(": ");
            sb3.append(zzd3);
            sb3.append("  Default value will be used.");
            Log.w("GcmNotification", sb3.toString());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zze(Bundle bundle) {
        int i;
        String zzd;
        String zzd2;
        Uri defaultUri;
        String zzd3;
        Intent launchIntentForPackage;
        PendingIntent pendingIntent;
        Notification build;
        String zzd4;
        String str;
        String str2;
        CharSequence zze = zze(bundle, "gcm.n.title");
        if (TextUtils.isEmpty(zze)) {
            zze = this.zzk.getApplicationInfo().loadLabel(this.zzk.getPackageManager());
        }
        String zze2 = zze(bundle, "gcm.n.body");
        String zzd5 = zzd(bundle, "gcm.n.icon");
        if (!TextUtils.isEmpty(zzd5)) {
            Resources resources = this.zzk.getResources();
            i = resources.getIdentifier(zzd5, "drawable", this.zzk.getPackageName());
            if (i == 0 && (i = resources.getIdentifier(zzd5, "mipmap", this.zzk.getPackageName())) == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzd5).length() + 57);
                sb.append("Icon resource ");
                sb.append(zzd5);
                sb.append(" not found. Notification will use app icon.");
                Log.w("GcmNotification", sb.toString());
            }
            zzd = zzd(bundle, "gcm.n.color");
            zzd2 = zzd(bundle, "gcm.n.sound2");
            String str3 = null;
            if (!TextUtils.isEmpty(zzd2)) {
                defaultUri = null;
            } else if ("default".equals(zzd2) || this.zzk.getResources().getIdentifier(zzd2, "raw", this.zzk.getPackageName()) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                String packageName = this.zzk.getPackageName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 24 + String.valueOf(zzd2).length());
                sb2.append("android.resource://");
                sb2.append(packageName);
                sb2.append("/raw/");
                sb2.append(zzd2);
                defaultUri = Uri.parse(sb2.toString());
            }
            zzd3 = zzd(bundle, "gcm.n.click_action");
            if (TextUtils.isEmpty(zzd3)) {
                launchIntentForPackage = new Intent(zzd3);
                launchIntentForPackage.setPackage(this.zzk.getPackageName());
                launchIntentForPackage.setFlags(268435456);
            } else {
                launchIntentForPackage = this.zzk.getPackageManager().getLaunchIntentForPackage(this.zzk.getPackageName());
                if (launchIntentForPackage == null) {
                    Log.w("GcmNotification", "No activity found to launch app");
                    pendingIntent = null;
                    if (PlatformVersion.isAtLeastO() || this.zzk.getApplicationInfo().targetSdkVersion < 26) {
                        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(this.zzk).setAutoCancel(true).setSmallIcon(i);
                        if (!TextUtils.isEmpty(zze)) {
                            smallIcon.setContentTitle(zze);
                        }
                        if (!TextUtils.isEmpty(zze2)) {
                            smallIcon.setContentText(zze2);
                        }
                        if (!TextUtils.isEmpty(zzd)) {
                            smallIcon.setColor(Color.parseColor(zzd));
                        }
                        if (defaultUri != null) {
                            smallIcon.setSound(defaultUri);
                        }
                        if (pendingIntent != null) {
                            smallIcon.setContentIntent(pendingIntent);
                        }
                        build = smallIcon.build();
                    } else {
                        String zzd6 = zzd(bundle, "gcm.n.android_channel_id");
                        if (PlatformVersion.isAtLeastO()) {
                            NotificationManager notificationManager = (NotificationManager) this.zzk.getSystemService(NotificationManager.class);
                            if (!TextUtils.isEmpty(zzd6)) {
                                if (notificationManager.getNotificationChannel(zzd6) != null) {
                                    str3 = zzd6;
                                } else {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(zzd6).length() + 122);
                                    sb3.append("Notification Channel requested (");
                                    sb3.append(zzd6);
                                    sb3.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                                    Log.w("GcmNotification", sb3.toString());
                                }
                            }
                            if (this.zzl == null) {
                                this.zzl = zze().getString("com.google.android.gms.gcm.default_notification_channel_id");
                                if (TextUtils.isEmpty(this.zzl)) {
                                    str = "GcmNotification";
                                    str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                                } else if (notificationManager.getNotificationChannel(this.zzl) == null) {
                                    str = "GcmNotification";
                                    str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
                                }
                                Log.w(str, str2);
                                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", this.zzk.getString(R.string.gcm_fallback_notification_channel_label), 3));
                                }
                                this.zzl = "fcm_fallback_notification_channel";
                            }
                            str3 = this.zzl;
                        }
                        Notification.Builder smallIcon2 = new Notification.Builder(this.zzk).setAutoCancel(true).setSmallIcon(i);
                        if (!TextUtils.isEmpty(zze)) {
                            smallIcon2.setContentTitle(zze);
                        }
                        if (!TextUtils.isEmpty(zze2)) {
                            smallIcon2.setContentText(zze2);
                            smallIcon2.setStyle(new Notification.BigTextStyle().bigText(zze2));
                        }
                        if (!TextUtils.isEmpty(zzd)) {
                            smallIcon2.setColor(Color.parseColor(zzd));
                        }
                        if (defaultUri != null) {
                            smallIcon2.setSound(defaultUri);
                        }
                        if (pendingIntent != null) {
                            smallIcon2.setContentIntent(pendingIntent);
                        }
                        if (str3 != null) {
                            smallIcon2.setChannelId(str3);
                        }
                        build = smallIcon2.build();
                    }
                    zzd4 = zzd(bundle, "gcm.n.tag");
                    if (Log.isLoggable("GcmNotification", 3)) {
                        Log.d("GcmNotification", "Showing notification");
                    }
                    NotificationManager notificationManager2 = (NotificationManager) this.zzk.getSystemService("notification");
                    if (TextUtils.isEmpty(zzd4)) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        StringBuilder sb4 = new StringBuilder(37);
                        sb4.append("GCM-Notification:");
                        sb4.append(uptimeMillis);
                        zzd4 = sb4.toString();
                    }
                    notificationManager2.notify(zzd4, 0, build);
                    return true;
                }
            }
            Bundle bundle2 = new Bundle(bundle);
            GcmListenerService.zzd(bundle2);
            launchIntentForPackage.putExtras(bundle2);
            for (String str4 : bundle2.keySet()) {
                if (str4.startsWith("gcm.n.") || str4.startsWith("gcm.notification.")) {
                    launchIntentForPackage.removeExtra(str4);
                }
            }
            pendingIntent = PendingIntent.getActivity(this.zzk, this.zzm.getAndIncrement(), launchIntentForPackage, CrashUtils.ErrorDialogData.SUPPRESSED);
            if (PlatformVersion.isAtLeastO()) {
            }
            NotificationCompat.Builder smallIcon3 = new NotificationCompat.Builder(this.zzk).setAutoCancel(true).setSmallIcon(i);
            if (!TextUtils.isEmpty(zze)) {
            }
            if (!TextUtils.isEmpty(zze2)) {
            }
            if (!TextUtils.isEmpty(zzd)) {
            }
            if (defaultUri != null) {
            }
            if (pendingIntent != null) {
            }
            build = smallIcon3.build();
            zzd4 = zzd(bundle, "gcm.n.tag");
            if (Log.isLoggable("GcmNotification", 3)) {
            }
            NotificationManager notificationManager22 = (NotificationManager) this.zzk.getSystemService("notification");
            if (TextUtils.isEmpty(zzd4)) {
            }
            notificationManager22.notify(zzd4, 0, build);
            return true;
        }
        int i2 = this.zzk.getApplicationInfo().icon;
        i = i2 == 0 ? android.R.drawable.sym_def_app_icon : i2;
        zzd = zzd(bundle, "gcm.n.color");
        zzd2 = zzd(bundle, "gcm.n.sound2");
        String str32 = null;
        if (!TextUtils.isEmpty(zzd2)) {
        }
        zzd3 = zzd(bundle, "gcm.n.click_action");
        if (TextUtils.isEmpty(zzd3)) {
        }
        Bundle bundle22 = new Bundle(bundle);
        GcmListenerService.zzd(bundle22);
        launchIntentForPackage.putExtras(bundle22);
        while (r5.hasNext()) {
        }
        pendingIntent = PendingIntent.getActivity(this.zzk, this.zzm.getAndIncrement(), launchIntentForPackage, CrashUtils.ErrorDialogData.SUPPRESSED);
        if (PlatformVersion.isAtLeastO()) {
        }
        NotificationCompat.Builder smallIcon32 = new NotificationCompat.Builder(this.zzk).setAutoCancel(true).setSmallIcon(i);
        if (!TextUtils.isEmpty(zze)) {
        }
        if (!TextUtils.isEmpty(zze2)) {
        }
        if (!TextUtils.isEmpty(zzd)) {
        }
        if (defaultUri != null) {
        }
        if (pendingIntent != null) {
        }
        build = smallIcon32.build();
        zzd4 = zzd(bundle, "gcm.n.tag");
        if (Log.isLoggable("GcmNotification", 3)) {
        }
        NotificationManager notificationManager222 = (NotificationManager) this.zzk.getSystemService("notification");
        if (TextUtils.isEmpty(zzd4)) {
        }
        notificationManager222.notify(zzd4, 0, build);
        return true;
    }
}
