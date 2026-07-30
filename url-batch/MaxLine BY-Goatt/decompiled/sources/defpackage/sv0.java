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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class sv0 extends tv0 {
    public static final Object c = new Object();
    public static final sv0 d = new sv0();

    public static AlertDialog d(Activity activity, int i, pa3 pa3Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(ea3.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.majelw.libystne.R.string.common_google_play_services_enable_button) : resources.getString(com.majelw.libystne.R.string.common_google_play_services_update_button) : resources.getString(com.majelw.libystne.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, pa3Var);
        }
        String c2 = ea3.c(activity, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", in1.k(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof kr0) {
                as0 supportFragmentManager = ((kr0) activity).getSupportFragmentManager();
                uq2 uq2Var = new uq2();
                ll3.w(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                uq2Var.m = alertDialog;
                if (onCancelListener != null) {
                    uq2Var.n = onCancelListener;
                }
                uq2Var.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ki0 ki0Var = new ki0();
        ll3.w(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        ki0Var.m = alertDialog;
        if (onCancelListener != null) {
            ki0Var.n = onCancelListener;
        }
        ki0Var.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d2 = d(googleApiActivity, i, new ka3(super.a(googleApiActivity, "d", i), googleApiActivity), googleApiActivity2);
        if (d2 == null) {
            return;
        }
        e(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", in1.l(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new ma3(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e = i == 6 ? ea3.e(context, "common_google_play_services_resolution_required_title") : ea3.c(context, i);
        if (e == null) {
            e = context.getResources().getString(com.majelw.libystne.R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i == 6 || i == 19) ? ea3.d(context, "common_google_play_services_resolution_required_text", ea3.a(context)) : ea3.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        ll3.v(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        bt1 bt1Var = new bt1(context, null);
        bt1Var.m = true;
        bt1Var.c(true);
        bt1Var.e = bt1.b(e);
        at1 at1Var = new at1();
        at1Var.n = bt1.b(d2);
        bt1Var.e(at1Var);
        PackageManager packageManager = context.getPackageManager();
        if (tk3.n == null) {
            tk3.n = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (tk3.n.booleanValue()) {
            bt1Var.s.icon = context.getApplicationInfo().icon;
            bt1Var.j = 2;
            if (tk3.T(context)) {
                bt1Var.b.add(new xs1(resources.getString(com.majelw.libystne.R.string.common_open_on_phone), pendingIntent));
            } else {
                bt1Var.g = pendingIntent;
            }
        } else {
            bt1Var.s.icon = R.drawable.stat_sys_warning;
            bt1Var.s.tickerText = bt1.b(resources.getString(com.majelw.libystne.R.string.common_google_play_services_notification_ticker));
            bt1Var.s.when = System.currentTimeMillis();
            bt1Var.g = pendingIntent;
            bt1Var.f = bt1.b(d2);
        }
        if (s03.A()) {
            if (!s03.A()) {
                throw new IllegalStateException();
            }
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.majelw.libystne.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            bt1Var.q = "com.google.android.gms.availability";
        }
        Notification a = bt1Var.a();
        if (i == 1 || i == 2 || i == 3) {
            xv0.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, a);
    }

    public final void g(Activity activity, gd1 gd1Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new oa3(super.a(activity, "d", i), gd1Var), onCancelListener);
        if (d2 == null) {
            return;
        }
        e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
