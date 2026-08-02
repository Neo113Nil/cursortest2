package a2;

import E.AbstractC0005f;
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
import androidx.fragment.app.C0193a;
import androidx.fragment.app.K;
import androidx.fragment.app.f0;
import c2.InterfaceC0288e;
import com.google.android.gms.common.api.GoogleApiActivity;
import d2.C0389g;
import d2.s;
import i2.AbstractC0457a;
import java.util.ArrayList;
import t.C1417e;
import t.C1418f;

/* renamed from: a2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165e extends C0166f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4274c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final C0165e f4275d = new C0165e();

    public static AlertDialog d(Activity activity, int i4, d2.m mVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i4 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(d2.l.b(activity, i4));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i4 != 1 ? i4 != 2 ? i4 != 3 ? resources.getString(R.string.ok) : resources.getString(com.rockchicken.pump.up.road.R.string.common_google_play_services_enable_button) : resources.getString(com.rockchicken.pump.up.road.R.string.common_google_play_services_update_button) : resources.getString(com.rockchicken.pump.up.road.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, mVar);
        }
        String c4 = d2.l.c(activity, i4);
        if (c4 != null) {
            builder.setTitle(c4);
        }
        Log.w("GoogleApiAvailability", AbstractC0005f.j(i4, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof K) {
                f0 supportFragmentManager = ((K) activity).getSupportFragmentManager();
                j jVar = new j();
                s.d(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.o = alertDialog;
                if (onCancelListener != null) {
                    jVar.f4283p = onCancelListener;
                }
                jVar.f4977l = false;
                jVar.f4978m = true;
                supportFragmentManager.getClass();
                C0193a c0193a = new C0193a(supportFragmentManager);
                c0193a.o = true;
                c0193a.e(0, jVar, str);
                c0193a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC0163c dialogFragmentC0163c = new DialogFragmentC0163c();
        s.d(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC0163c.f4268a = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC0163c.f4269b = onCancelListener;
        }
        dialogFragmentC0163c.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i4, GoogleApiActivity googleApiActivity2) {
        AlertDialog d4 = d(googleApiActivity, i4, new d2.m(super.a(i4, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d4 == null) {
            return;
        }
        e(googleApiActivity, d4, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i4, PendingIntent pendingIntent) {
        int i5;
        Bundle bundle;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", AbstractC0005f.k(i4, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i4 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i4 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e4 = i4 == 6 ? d2.l.e(context, "common_google_play_services_resolution_required_title") : d2.l.c(context, i4);
        if (e4 == null) {
            e4 = context.getResources().getString(com.rockchicken.pump.up.road.R.string.common_google_play_services_notification_ticker);
        }
        String d4 = (i4 == 6 || i4 == 19) ? d2.l.d(context, "common_google_play_services_resolution_required_text", d2.l.a(context)) : d2.l.b(context, i4);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        s.c(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C1418f c1418f = new C1418f();
        ArrayList arrayList = new ArrayList();
        c1418f.f15249b = arrayList;
        c1418f.f15250c = new ArrayList();
        c1418f.f15251d = new ArrayList();
        c1418f.f15256i = true;
        c1418f.f15258k = false;
        Notification notification = new Notification();
        c1418f.o = notification;
        c1418f.f15248a = context;
        c1418f.f15260m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        c1418f.f15255h = 0;
        c1418f.f15261p = new ArrayList();
        c1418f.n = true;
        c1418f.f15258k = true;
        notification.flags |= 16;
        c1418f.f15252e = C1418f.a(e4);
        C0389g c0389g = new C0389g(15, false);
        c0389g.f8265c = C1418f.a(d4);
        c1418f.b(c0389g);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0457a.f9314c == null) {
            AbstractC0457a.f9314c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC0457a.f9314c.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            c1418f.f15255h = 2;
            if (AbstractC0457a.v(context)) {
                arrayList.add(new C1417e(resources.getString(com.rockchicken.pump.up.road.R.string.common_open_on_phone), pendingIntent));
            } else {
                c1418f.f15254g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = C1418f.a(resources.getString(com.rockchicken.pump.up.road.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            c1418f.f15254g = pendingIntent;
            c1418f.f15253f = C1418f.a(d4);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            if (i6 < 26) {
                throw new IllegalStateException();
            }
            synchronized (f4274c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.rockchicken.pump.up.road.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(C.a.e(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            c1418f.f15260m = "com.google.android.gms.availability";
        }
        B1.j jVar = new B1.j(c1418f);
        Notification.Builder builder = (Notification.Builder) jVar.f201b;
        C1418f c1418f2 = (C1418f) jVar.f202c;
        C0389g c0389g2 = c1418f2.f15257j;
        if (c0389g2 != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) c0389g2.f8265c);
        }
        Notification build = i6 >= 26 ? builder.build() : builder.build();
        if (c0389g2 != null) {
            c1418f2.f15257j.getClass();
        }
        if (c0389g2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            h.f4278a.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, build);
    }

    public final void g(Activity activity, InterfaceC0288e interfaceC0288e, int i4, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d4 = d(activity, i4, new d2.m(super.a(i4, activity, "d"), interfaceC0288e, 1), onCancelListener);
        if (d4 == null) {
            return;
        }
        e(activity, d4, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
