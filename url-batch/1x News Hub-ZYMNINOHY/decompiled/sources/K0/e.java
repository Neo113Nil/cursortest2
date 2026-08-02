package K0;

import E1.AbstractC0033i;
import M0.y;
import N0.r;
import a.AbstractC0129a;
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
import f0.C0322a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f845c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f846d = new e();

    public static AlertDialog d(Activity activity, int i3, N0.l lVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(N0.k.b(activity, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i3 != 1 ? i3 != 2 ? i3 != 3 ? resources.getString(R.string.ok) : resources.getString(com.fc.barca.football.R.string.common_google_play_services_enable_button) : resources.getString(com.fc.barca.football.R.string.common_google_play_services_update_button) : resources.getString(com.fc.barca.football.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, lVar);
        }
        String c3 = N0.k.c(activity, i3);
        if (c3 != null) {
            builder.setTitle(c3);
        }
        Log.w("GoogleApiAvailability", AbstractC0033i.h(i3, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        r.d(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f839a = alertDialog;
        if (onCancelListener != null) {
            cVar.f840b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        AlertDialog d3 = d(googleApiActivity, i3, new N0.l(super.a(i3, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d3 == null) {
            return;
        }
        e(googleApiActivity, d3, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i3, PendingIntent pendingIntent) {
        int i4;
        Bundle bundle;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", AbstractC0033i.i(i3, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
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
        String e3 = i3 == 6 ? N0.k.e(context, "common_google_play_services_resolution_required_title") : N0.k.c(context, i3);
        if (e3 == null) {
            e3 = context.getResources().getString(com.fc.barca.football.R.string.common_google_play_services_notification_ticker);
        }
        String d3 = (i3 == 6 || i3 == 19) ? N0.k.d(context, "common_google_play_services_resolution_required_text", N0.k.a(context)) : N0.k.b(context, i3);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        r.c(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        t.d dVar = new t.d();
        ArrayList arrayList = new ArrayList();
        dVar.f10341b = arrayList;
        dVar.f10342c = new ArrayList();
        dVar.f10343d = new ArrayList();
        dVar.f10347i = true;
        dVar.f10349k = false;
        Notification notification = new Notification();
        dVar.o = notification;
        dVar.f10340a = context;
        dVar.f10351m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        dVar.f10346h = 0;
        dVar.f10353p = new ArrayList();
        dVar.f10352n = true;
        dVar.f10349k = true;
        notification.flags |= 16;
        dVar.f10344e = t.d.a(e3);
        C0322a c0322a = new C0322a(14);
        c0322a.f4978c = t.d.a(d3);
        dVar.b(c0322a);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0129a.f1915a == null) {
            AbstractC0129a.f1915a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC0129a.f1915a.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            dVar.f10346h = 2;
            if (AbstractC0129a.q(context)) {
                arrayList.add(new t.c(resources.getString(com.fc.barca.football.R.string.common_open_on_phone), pendingIntent));
            } else {
                dVar.f10345g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = t.d.a(resources.getString(com.fc.barca.football.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            dVar.f10345g = pendingIntent;
            dVar.f = t.d.a(d3);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            if (i5 < 26) {
                throw new IllegalStateException();
            }
            synchronized (f845c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.fc.barca.football.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(C.a.e(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVar.f10351m = "com.google.android.gms.availability";
        }
        A0.f fVar = new A0.f(dVar);
        t.d dVar2 = (t.d) fVar.f24c;
        C0322a c0322a2 = dVar2.f10348j;
        Notification.Builder builder = (Notification.Builder) fVar.f23b;
        if (c0322a2 != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) c0322a2.f4978c);
        }
        Notification build = i5 >= 26 ? builder.build() : builder.build();
        if (c0322a2 != null) {
            dVar2.f10348j.getClass();
        }
        if (c0322a2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i.f849a.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, build);
    }

    public final void g(Activity activity, y yVar, int i3, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d3 = d(activity, i3, new N0.l(super.a(i3, activity, "d"), yVar, 1), onCancelListener);
        if (d3 == null) {
            return;
        }
        e(activity, d3, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
