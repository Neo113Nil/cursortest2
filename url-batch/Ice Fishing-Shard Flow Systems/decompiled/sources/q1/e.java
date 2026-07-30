package q1;

import C4.p;
import android.R;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import t1.u;
import x1.AbstractC1000b;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f7322d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final e f7323e = new e();

    /* renamed from: c, reason: collision with root package name */
    public v1.d f7324c;

    public final void c(GoogleApiActivity googleApiActivity, int i2, GoogleApiActivity googleApiActivity2) {
        t1.n nVar = new t1.n(super.a(i2, googleApiActivity, "d"), googleApiActivity);
        AlertDialog alertDialog = null;
        if (i2 != 0) {
            TypedValue typedValue = new TypedValue();
            googleApiActivity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(googleApiActivity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(googleApiActivity);
            }
            builder.setMessage(t1.m.b(googleApiActivity, i2));
            if (googleApiActivity2 != null) {
                builder.setOnCancelListener(googleApiActivity2);
            }
            Resources resources = googleApiActivity.getResources();
            String string = i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(R.string.ok) : resources.getString(com.icefishing.icefish.ice.fishing.s294s.R.string.common_google_play_services_enable_button) : resources.getString(com.icefishing.icefish.ice.fishing.s294s.R.string.common_google_play_services_update_button) : resources.getString(com.icefishing.icefish.ice.fishing.s294s.R.string.common_google_play_services_install_button);
            if (string != null) {
                builder.setPositiveButton(string, nVar);
            }
            String a7 = t1.m.a(googleApiActivity, i2);
            if (a7 != null) {
                builder.setTitle(a7);
            }
            Log.w("GoogleApiAvailability", p.g(i2, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
            alertDialog = builder.create();
        }
        if (alertDialog == null) {
            return;
        }
        FragmentManager fragmentManager = googleApiActivity.getFragmentManager();
        c cVar = new c();
        u.g(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f7315d = alertDialog;
        if (googleApiActivity2 != null) {
            cVar.f7316e = googleApiActivity2;
        }
        cVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
    }

    public final void d(Context context, int i2, PendingIntent pendingIntent) {
        int i5;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", p.h(i2, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e7 = i2 == 6 ? t1.m.e(context, "common_google_play_services_resolution_required_title") : t1.m.a(context, i2);
        if (e7 == null) {
            e7 = context.getResources().getString(com.icefishing.icefish.ice.fishing.s294s.R.string.common_google_play_services_notification_ticker);
        }
        String d7 = (i2 == 6 || i2 == 19) ? t1.m.d(context, "common_google_play_services_resolution_required_text", t1.m.c(context)) : t1.m.b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        u.f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        y.l lVar = new y.l(context, null);
        lVar.f8488o = true;
        lVar.d(16, true);
        lVar.f8479e = y.l.b(e7);
        y.k kVar = new y.k(0);
        kVar.f8474f = y.l.b(d7);
        lVar.g(kVar);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1000b.f8319b == null) {
            AbstractC1000b.f8319b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean booleanValue = AbstractC1000b.f8319b.booleanValue();
        int i7 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i8 = context.getApplicationInfo().icon;
            if (i8 != 0) {
                i7 = i8;
            }
            lVar.f8495v.icon = i7;
            lVar.j = 2;
            if (AbstractC1000b.c(context)) {
                lVar.f8476b.add(new y.h(2131165271, resources.getString(com.icefishing.icefish.ice.fishing.s294s.R.string.common_open_on_phone), pendingIntent));
            } else {
                lVar.f8481g = pendingIntent;
            }
        } else {
            lVar.f8495v.icon = R.drawable.stat_sys_warning;
            lVar.f8495v.tickerText = y.l.b(resources.getString(com.icefishing.icefish.ice.fishing.s294s.R.string.common_google_play_services_notification_ticker));
            lVar.f8495v.when = System.currentTimeMillis();
            lVar.f8481g = pendingIntent;
            lVar.f8480f = y.l.b(d7);
        }
        if (AbstractC1000b.b()) {
            if (!AbstractC1000b.b()) {
                throw new IllegalStateException();
            }
            synchronized (f7322d) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.icefishing.icefish.ice.fishing.s294s.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(io.flutter.view.k.f(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            lVar.f8492s = "com.google.android.gms.availability";
        }
        Notification a7 = lVar.a();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            g.f7327a.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, a7);
    }
}
