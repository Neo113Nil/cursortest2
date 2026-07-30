package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bh0 extends ch0 {
    public static final Object TSizfFm2Yiuu = new Object();
    public static final bh0 Y1f8riQaR6yg = new bh0();

    public static AlertDialog Y1f8riQaR6yg(Activity activity, int i, fw2 fw2Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(zv2.lS5Rgt96tfkO(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.ice.fishing.grenza.R.string.common_google_play_services_enable_button) : resources.getString(com.ice.fishing.grenza.R.string.common_google_play_services_update_button) : resources.getString(com.ice.fishing.grenza.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, fw2Var);
        }
        String TSizfFm2Yiuu2 = zv2.TSizfFm2Yiuu(activity, i);
        if (TSizfFm2Yiuu2 != null) {
            builder.setTitle(TSizfFm2Yiuu2);
        }
        Log.w("GoogleApiAvailability", o0.wdg6QnbFHrFF("Creating dialog for Google Play services availability issue. ConnectionResult=", i), new IllegalArgumentException());
        return builder.create();
    }

    public static void e9gEMXR7LXtO(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        p60 p60Var = new p60();
        jh0.cpQdD2nAriOS(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        p60Var.rtx2ld2ELZv4 = alertDialog;
        if (onCancelListener != null) {
            p60Var.OPXfSBeufaJ8 = onCancelListener;
        }
        p60Var.show(fragmentManager, str);
    }

    public final void RAsUl2FVSrh6(Activity activity, xw2 xw2Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog Y1f8riQaR6yg2 = Y1f8riQaR6yg(activity, i, new fw2(super.PxuCJdSBwIXG(activity, i, "d"), xw2Var, 1), onCancelListener);
        if (Y1f8riQaR6yg2 == null) {
            return;
        }
        e9gEMXR7LXtO(activity, Y1f8riQaR6yg2, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void TSizfFm2Yiuu(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog Y1f8riQaR6yg2 = Y1f8riQaR6yg(googleApiActivity, i, new fw2(super.PxuCJdSBwIXG(googleApiActivity, i, "d"), googleApiActivity, 0), googleApiActivity2);
        if (Y1f8riQaR6yg2 == null) {
            return;
        }
        e9gEMXR7LXtO(googleApiActivity, Y1f8riQaR6yg2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void a92UlCVFR9N8(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Bundle bundle;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", o0.OPXfSBeufaJ8(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new hw2(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e9gEMXR7LXtO = i == 6 ? zv2.e9gEMXR7LXtO(context, "common_google_play_services_resolution_required_title") : zv2.TSizfFm2Yiuu(context, i);
        if (e9gEMXR7LXtO == null) {
            e9gEMXR7LXtO = context.getResources().getString(com.ice.fishing.grenza.R.string.common_google_play_services_notification_ticker);
        }
        String Y1f8riQaR6yg2 = (i == 6 || i == 19) ? zv2.Y1f8riQaR6yg(context, "common_google_play_services_resolution_required_text", zv2.PxuCJdSBwIXG(context)) : zv2.lS5Rgt96tfkO(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        jh0.x50lh2ztY7Y5(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        ge1 ge1Var = new ge1();
        ArrayList arrayList = new ArrayList();
        ge1Var.lS5Rgt96tfkO = arrayList;
        ge1Var.TSizfFm2Yiuu = new ArrayList();
        ge1Var.Y1f8riQaR6yg = new ArrayList();
        ge1Var.OPXfSBeufaJ8 = true;
        ge1Var.dgRBjINgWbAK = false;
        Notification notification = new Notification();
        ge1Var.QrzZRwfaDlRX = notification;
        ge1Var.PxuCJdSBwIXG = context;
        ge1Var.cpQdD2nAriOS = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        ge1Var.rtx2ld2ELZv4 = 0;
        ge1Var.gPXPFXrUH4XX = new ArrayList();
        ge1Var.r3s1LDPKFs1S = true;
        ge1Var.dgRBjINgWbAK = true;
        notification.flags |= 16;
        ge1Var.e9gEMXR7LXtO = ge1.PxuCJdSBwIXG(e9gEMXR7LXtO);
        op0 op0Var = new op0(25, false);
        op0Var.wdg6QnbFHrFF = ge1.PxuCJdSBwIXG(Y1f8riQaR6yg2);
        ge1Var.lS5Rgt96tfkO(op0Var);
        PackageManager packageManager = context.getPackageManager();
        if (fx1.r3s1LDPKFs1S == null) {
            fx1.r3s1LDPKFs1S = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (fx1.r3s1LDPKFs1S.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            ge1Var.rtx2ld2ELZv4 = 2;
            if (fx1.bEKsvqmvPh2y(context)) {
                arrayList.add(new fe1(resources.getString(com.ice.fishing.grenza.R.string.common_open_on_phone), pendingIntent));
            } else {
                ge1Var.RAsUl2FVSrh6 = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = ge1.PxuCJdSBwIXG(resources.getString(com.ice.fishing.grenza.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            ge1Var.RAsUl2FVSrh6 = pendingIntent;
            ge1Var.a92UlCVFR9N8 = ge1.PxuCJdSBwIXG(Y1f8riQaR6yg2);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            if (i3 < 26) {
                throw new IllegalStateException();
            }
            synchronized (TSizfFm2Yiuu) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.ice.fishing.grenza.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(hi.Y1f8riQaR6yg(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            ge1Var.cpQdD2nAriOS = "com.google.android.gms.availability";
        }
        m9 m9Var = new m9(ge1Var);
        Notification.Builder builder = (Notification.Builder) m9Var.OPXfSBeufaJ8;
        ge1 ge1Var2 = (ge1) m9Var.wdg6QnbFHrFF;
        op0 op0Var2 = ge1Var2.wdg6QnbFHrFF;
        if (op0Var2 != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) op0Var2.wdg6QnbFHrFF);
        }
        Notification build = i3 >= 26 ? builder.build() : builder.build();
        if (op0Var2 != null) {
            ge1Var2.wdg6QnbFHrFF.getClass();
        }
        if (op0Var2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i == 1 || i == 2 || i == 3) {
            hh0.PxuCJdSBwIXG.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, build);
    }
}
