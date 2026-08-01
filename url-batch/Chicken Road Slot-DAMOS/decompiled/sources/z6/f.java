package z6;

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
import c7.c0;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f10878d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final f f10879e = new f();

    /* renamed from: c, reason: collision with root package name */
    public e7.d f10880c;

    public final void c(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        AlertDialog create;
        c7.s sVar = new c7.s(super.a(i3, googleApiActivity, "d"), googleApiActivity);
        if (i3 == 0) {
            create = null;
        } else {
            TypedValue typedValue = new TypedValue();
            googleApiActivity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(googleApiActivity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(googleApiActivity);
            }
            builder.setMessage(c7.r.b(googleApiActivity, i3));
            if (googleApiActivity2 != null) {
                builder.setOnCancelListener(googleApiActivity2);
            }
            Resources resources = googleApiActivity.getResources();
            String string = i3 != 1 ? i3 != 2 ? i3 != 3 ? resources.getString(R.string.ok) : resources.getString(com.appsflyer.R.string.common_google_play_services_enable_button) : resources.getString(com.appsflyer.R.string.common_google_play_services_update_button) : resources.getString(com.appsflyer.R.string.common_google_play_services_install_button);
            if (string != null) {
                builder.setPositiveButton(string, sVar);
            }
            String a9 = c7.r.a(googleApiActivity, i3);
            if (a9 != null) {
                builder.setTitle(a9);
            }
            Log.w("GoogleApiAvailability", v4.a.j(i3, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
            create = builder.create();
        }
        if (create == null) {
            return;
        }
        FragmentManager fragmentManager = googleApiActivity.getFragmentManager();
        c cVar = new c();
        c0.h(create, "Cannot display null dialog");
        create.setOnCancelListener(null);
        create.setOnDismissListener(null);
        cVar.f10871d = create;
        if (googleApiActivity2 != null) {
            cVar.f10872e = googleApiActivity2;
        }
        cVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
    }

    public final void d(Context context, int i3, PendingIntent pendingIntent) {
        int i10;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", n0.l.f(i3, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i3 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e2 = i3 == 6 ? c7.r.e(context, "common_google_play_services_resolution_required_title") : c7.r.a(context, i3);
        if (e2 == null) {
            e2 = context.getResources().getString(com.appsflyer.R.string.common_google_play_services_notification_ticker);
        }
        String d10 = (i3 == 6 || i3 == 19) ? c7.r.d(context, "common_google_play_services_resolution_required_text", c7.r.c(context)) : c7.r.b(context, i3);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        c0.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        e3.g gVar = new e3.g(context, null);
        gVar.f3814o = true;
        gVar.d(16, true);
        gVar.f3806e = e3.g.b(e2);
        e3.f fVar = new e3.f(0);
        fVar.f3801f = e3.g.b(d10);
        gVar.g(fVar);
        PackageManager packageManager = context.getPackageManager();
        if (g7.b.f4279c == null) {
            g7.b.f4279c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean booleanValue = g7.b.f4279c.booleanValue();
        int i11 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i12 = context.getApplicationInfo().icon;
            if (i12 != 0) {
                i11 = i12;
            }
            gVar.f3821v.icon = i11;
            gVar.j = 2;
            if (g7.b.d(context)) {
                gVar.f3803b.add(new e3.c(2131165283, resources.getString(com.appsflyer.R.string.common_open_on_phone), pendingIntent));
            } else {
                gVar.g = pendingIntent;
            }
        } else {
            gVar.f3821v.icon = R.drawable.stat_sys_warning;
            gVar.f3821v.tickerText = e3.g.b(resources.getString(com.appsflyer.R.string.common_google_play_services_notification_ticker));
            gVar.f3821v.when = System.currentTimeMillis();
            gVar.g = pendingIntent;
            gVar.f3807f = e3.g.b(d10);
        }
        if (g7.b.b()) {
            c0.j(g7.b.b());
            synchronized (f10878d) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.appsflyer.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(e.a(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            gVar.f3818s = "com.google.android.gms.availability";
        }
        Notification a9 = gVar.a();
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i.f10883a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, a9);
    }
}
