package R0;

import T0.T;
import U0.t;
import W4.o;
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
import t.p;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2062b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final d f2063c = new d();

    public static AlertDialog d(Activity activity, int i7, U0.m mVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(U0.l.b(activity, i7));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = activity.getResources();
        String string = i7 != 1 ? i7 != 2 ? i7 != 3 ? resources.getString(R.string.ok) : resources.getString(com.strategylink.Row.Five.R.string.common_google_play_services_enable_button) : resources.getString(com.strategylink.Row.Five.R.string.common_google_play_services_update_button) : resources.getString(com.strategylink.Row.Five.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, mVar);
        }
        String c7 = U0.l.c(activity, i7);
        if (c7 != null) {
            builder.setTitle(c7);
        }
        Log.w("GoogleApiAvailability", o.c("Creating dialog for Google Play services availability issue. ConnectionResult=", i7), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        t.g(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f2056f = alertDialog;
        bVar.f2057g = onCancelListener;
        bVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i7, GoogleApiActivity googleApiActivity2) {
        AlertDialog d7 = d(googleApiActivity, i7, new U0.m(super.a(i7, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d7 == null) {
            return;
        }
        e(googleApiActivity, d7, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i7, PendingIntent pendingIntent) {
        int i8;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", C1.c.g("GMS core API Availability. ConnectionResult=", i7, ", tag=null"), new IllegalArgumentException());
        if (i7 == 18) {
            new i(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e4 = i7 == 6 ? U0.l.e(context, "common_google_play_services_resolution_required_title") : U0.l.c(context, i7);
        if (e4 == null) {
            e4 = context.getResources().getString(com.strategylink.Row.Five.R.string.common_google_play_services_notification_ticker);
        }
        String d7 = (i7 == 6 || i7 == 19) ? U0.l.d(context, "common_google_play_services_resolution_required_text", U0.l.a(context)) : U0.l.b(context, i7);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        t.f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        p pVar = new p(context, null);
        pVar.f5931o = true;
        pVar.d(16, true);
        pVar.f5921e = p.b(e4);
        t.n nVar = new t.n(0);
        nVar.f5916f = p.b(d7);
        pVar.g(nVar);
        PackageManager packageManager = context.getPackageManager();
        if (Y0.b.f3084b == null) {
            Y0.b.f3084b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (Y0.b.f3084b.booleanValue()) {
            pVar.f5938v.icon = context.getApplicationInfo().icon;
            pVar.f5926j = 2;
            if (Y0.b.c(context)) {
                pVar.f5918b.add(new t.j(2131165271, resources.getString(com.strategylink.Row.Five.R.string.common_open_on_phone), pendingIntent));
            } else {
                pVar.f5923g = pendingIntent;
            }
        } else {
            pVar.f5938v.icon = R.drawable.stat_sys_warning;
            pVar.f5938v.tickerText = p.b(resources.getString(com.strategylink.Row.Five.R.string.common_google_play_services_notification_ticker));
            pVar.f5938v.when = System.currentTimeMillis();
            pVar.f5923g = pendingIntent;
            pVar.f5922f = p.b(d7);
        }
        if (Y0.b.b()) {
            if (!Y0.b.b()) {
                throw new IllegalStateException();
            }
            synchronized (f2062b) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.strategylink.Row.Five.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(P2.a.d(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            pVar.f5935s = "com.google.android.gms.availability";
        }
        Notification a7 = pVar.a();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            f.f2065a.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager.notify(i8, a7);
    }

    public final void g(Activity activity, T t6, int i7, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d7 = d(activity, i7, new U0.m(super.a(i7, activity, "d"), t6, 1), onCancelListener);
        if (d7 == null) {
            return;
        }
        e(activity, d7, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
