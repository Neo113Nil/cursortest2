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
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class c50 extends d50 {
    public static final Object c = new Object();
    public static final c50 d = new c50();

    public static AlertDialog d(Activity activity, int i, vs1 vs1Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(ks1.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.feathherdashh.dashgame.R.string.common_google_play_services_enable_button) : resources.getString(com.feathherdashh.dashgame.R.string.common_google_play_services_update_button) : resources.getString(com.feathherdashh.dashgame.R.string.common_google_play_services_install_button);
        if (string != null) {
            if (vs1Var == null) {
                vs1Var = null;
            }
            builder.setPositiveButton(string, vs1Var);
        }
        String c2 = ks1.c(activity, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", qy0.i(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        cw cwVar = new cw();
        y90.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cwVar.d = alertDialog;
        if (onCancelListener != null) {
            cwVar.e = onCancelListener;
        }
        cwVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d2 = d(googleApiActivity, i, vs1.b(googleApiActivity, super.a(i, googleApiActivity, "d"), 2), googleApiActivity2);
        if (d2 == null) {
            return;
        }
        e(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", "GMS core API Availability. ConnectionResult=" + i + ", tag=null", new IllegalArgumentException());
        if (i == 18) {
            new ss1(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e = i == 6 ? ks1.e(context, "common_google_play_services_resolution_required_title") : ks1.c(context, i);
        if (e == null) {
            e = context.getResources().getString(com.feathherdashh.dashgame.R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i == 6 || i == 19) ? ks1.d(context, "common_google_play_services_resolution_required_text", ks1.a(context)) : ks1.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y90.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        gq0 gq0Var = new gq0(context, null);
        gq0Var.m = true;
        gq0Var.c(true);
        gq0Var.e = gq0.b(e);
        eq0 eq0Var = new eq0();
        eq0Var.e = gq0.b(d2);
        gq0Var.d(eq0Var);
        PackageManager packageManager = context.getPackageManager();
        if (uq1.r == null) {
            uq1.r = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (uq1.r.booleanValue()) {
            gq0Var.s.icon = context.getApplicationInfo().icon;
            gq0Var.j = 2;
            if (uq1.M(context)) {
                gq0Var.b.add(new aq0(resources.getString(com.feathherdashh.dashgame.R.string.common_open_on_phone), pendingIntent));
            } else {
                gq0Var.g = pendingIntent;
            }
        } else {
            gq0Var.s.icon = R.drawable.stat_sys_warning;
            gq0Var.s.tickerText = gq0.b(resources.getString(com.feathherdashh.dashgame.R.string.common_google_play_services_notification_ticker));
            gq0Var.s.when = System.currentTimeMillis();
            gq0Var.g = pendingIntent;
            gq0Var.f = gq0.b(d2);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.feathherdashh.dashgame.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        gq0Var.q = "com.google.android.gms.availability";
        Notification a = gq0Var.a();
        if (i == 1 || i == 2 || i == 3) {
            i50.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, a);
    }

    public final void g(Activity activity, ot1 ot1Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, vs1.c(ot1Var, super.a(i, activity, "d"), 2), onCancelListener);
        if (d2 == null) {
            return;
        }
        e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
