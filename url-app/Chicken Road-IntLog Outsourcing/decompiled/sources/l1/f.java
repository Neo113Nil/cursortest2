package l1;

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
import b2.AbstractC0279e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import n1.Y;
import o1.u;
import u.C1469j;
import u.C1473n;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11009c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final f f11010d = new f();

    public static AlertDialog d(Activity activity, int i2, o1.n nVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(o1.m.b(activity, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(R.string.ok) : resources.getString(com.chickyneer.roadway.R.string.common_google_play_services_enable_button) : resources.getString(com.chickyneer.roadway.R.string.common_google_play_services_update_button) : resources.getString(com.chickyneer.roadway.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, nVar);
        }
        String c2 = o1.m.c(activity, i2);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", AbstractC0279e.d(i2, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        u.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f11003a = alertDialog;
        if (onCancelListener != null) {
            cVar.f11004b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i2, GoogleApiActivity googleApiActivity2) {
        AlertDialog d6 = d(googleApiActivity, i2, new o1.n(super.a(googleApiActivity, "d", i2), googleApiActivity, 0), googleApiActivity2);
        if (d6 == null) {
            return;
        }
        e(googleApiActivity, d6, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i2, PendingIntent pendingIntent) {
        int i3;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", B0.o.g(i2, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e3 = i2 == 6 ? o1.m.e(context, "common_google_play_services_resolution_required_title") : o1.m.c(context, i2);
        if (e3 == null) {
            e3 = context.getResources().getString(com.chickyneer.roadway.R.string.common_google_play_services_notification_ticker);
        }
        String d6 = (i2 == 6 || i2 == 19) ? o1.m.d(context, "common_google_play_services_resolution_required_text", o1.m.a(context)) : o1.m.b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        u.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        u.p pVar = new u.p(context, null);
        pVar.f12018o = true;
        pVar.d(16, true);
        pVar.f12008e = u.p.b(e3);
        C1473n c1473n = new C1473n(0);
        c1473n.f12003f = u.p.b(d6);
        pVar.g(c1473n);
        PackageManager packageManager = context.getPackageManager();
        if (s1.b.f11802b == null) {
            s1.b.f11802b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (s1.b.f11802b.booleanValue()) {
            pVar.f12025v.icon = context.getApplicationInfo().icon;
            pVar.f12013j = 2;
            if (s1.b.c(context)) {
                pVar.f12005b.add(new C1469j(2131165278, resources.getString(com.chickyneer.roadway.R.string.common_open_on_phone), pendingIntent));
            } else {
                pVar.f12010g = pendingIntent;
            }
        } else {
            pVar.f12025v.icon = R.drawable.stat_sys_warning;
            pVar.f12025v.tickerText = u.p.b(resources.getString(com.chickyneer.roadway.R.string.common_google_play_services_notification_ticker));
            pVar.f12025v.when = System.currentTimeMillis();
            pVar.f12010g = pendingIntent;
            pVar.f12009f = u.p.b(d6);
        }
        if (s1.b.b()) {
            if (!s1.b.b()) {
                throw new IllegalStateException();
            }
            synchronized (f11009c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.chickyneer.roadway.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(e.h(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            pVar.f12022s = "com.google.android.gms.availability";
        }
        Notification a6 = pVar.a();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            i.f11013a.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, a6);
    }

    public final void g(Activity activity, Y y5, int i2, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d6 = d(activity, i2, new o1.n(super.a(activity, "d", i2), y5, 1), onCancelListener);
        if (d6 == null) {
            return;
        }
        e(activity, d6, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
