package L2;

import D.C0296p;
import D.t;
import D.v;
import D.y;
import N2.InterfaceC0319e;
import O2.q;
import O2.w;
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
import androidx.fragment.app.AbstractActivityC0490x;
import androidx.fragment.app.C0468a;
import androidx.fragment.app.N;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.ads.CL;
import com.icefishing.icefishingliveapp.C5284R;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1723c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f1724d = new e();

    public static AlertDialog e(Activity activity, int i, q qVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(O2.p.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(C5284R.string.common_google_play_services_enable_button) : resources.getString(C5284R.string.common_google_play_services_update_button) : resources.getString(C5284R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, qVar);
        }
        String c4 = O2.p.c(activity, i);
        if (c4 != null) {
            builder.setTitle(c4);
        }
        Log.w("GoogleApiAvailability", CL.i(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0490x) {
                N supportFragmentManager = ((AbstractActivityC0490x) activity).getSupportFragmentManager();
                j jVar = new j();
                w.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f1732N0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f1733O0 = onCancelListener;
                }
                jVar.f5122K0 = false;
                jVar.f5123L0 = true;
                supportFragmentManager.getClass();
                C0468a c0468a = new C0468a(supportFragmentManager);
                c0468a.f5054o = true;
                c0468a.e(0, jVar, str, 1);
                c0468a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        w.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f1716n = alertDialog;
        if (onCancelListener != null) {
            cVar.f1717u = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog e6 = e(googleApiActivity, i, new q(super.b(googleApiActivity, "d", i), googleApiActivity, 0), googleApiActivity2);
        if (e6 == null) {
            return;
        }
        f(googleApiActivity, e6, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i4;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", y.i(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e6 = i == 6 ? O2.p.e(context, "common_google_play_services_resolution_required_title") : O2.p.c(context, i);
        if (e6 == null) {
            e6 = context.getResources().getString(C5284R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i == 6 || i == 19) ? O2.p.d(context, "common_google_play_services_resolution_required_text", O2.p.a(context)) : O2.p.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        w.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        v vVar = new v(context, null);
        vVar.f562o = true;
        vVar.d(16, true);
        vVar.f553e = v.b(e6);
        t tVar = new t(0);
        tVar.f548f = v.b(d2);
        vVar.g(tVar);
        PackageManager packageManager = context.getPackageManager();
        if (S2.b.f2966c == null) {
            S2.b.f2966c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (S2.b.f2966c.booleanValue()) {
            vVar.f569v.icon = context.getApplicationInfo().icon;
            vVar.f557j = 2;
            if (S2.b.i(context)) {
                vVar.f550b.add(new C0296p(2131231108, pendingIntent, resources.getString(C5284R.string.common_open_on_phone)));
            } else {
                vVar.f555g = pendingIntent;
            }
        } else {
            vVar.f569v.icon = R.drawable.stat_sys_warning;
            vVar.f569v.tickerText = v.b(resources.getString(C5284R.string.common_google_play_services_notification_ticker));
            vVar.f569v.when = System.currentTimeMillis();
            vVar.f555g = pendingIntent;
            vVar.f554f = v.b(d2);
        }
        if (S2.b.f()) {
            w.k(S2.b.f());
            synchronized (f1723c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(C5284R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(A1.b.c(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            vVar.f566s = "com.google.android.gms.availability";
        }
        Notification a9 = vVar.a();
        if (i == 1 || i == 2 || i == 3) {
            h.f1727a.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, a9);
    }

    public final void h(Activity activity, InterfaceC0319e interfaceC0319e, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e6 = e(activity, i, new q(super.b(activity, "d", i), interfaceC0319e, 1), onCancelListener);
        if (e6 == null) {
            return;
        }
        f(activity, e6, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
