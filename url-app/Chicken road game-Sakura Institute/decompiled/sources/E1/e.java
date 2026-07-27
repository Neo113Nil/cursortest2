package E1;

import A.AbstractC0017m;
import G1.z;
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
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.GoogleApiActivity;
import i.C0671f;
import java.util.ArrayList;
import java.util.Iterator;
import y.t;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2287c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f2288d = new e();

    public static AlertDialog d(Activity activity, int i2, H1.k kVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(H1.j.b(activity, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(R.string.ok) : resources.getString(com.chicken.road.kedro.laqer.R.string.common_google_play_services_enable_button) : resources.getString(com.chicken.road.kedro.laqer.R.string.common_google_play_services_update_button) : resources.getString(com.chicken.road.kedro.laqer.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, kVar);
        }
        String c4 = H1.j.c(activity, i2);
        if (c4 != null) {
            builder.setTitle(c4);
        }
        Log.w("GoogleApiAvailability", AbstractC0017m.g(i2, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        H1.o.e(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f2281d = alertDialog;
        if (onCancelListener != null) {
            cVar.f2282e = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i2, GoogleApiActivity googleApiActivity2) {
        AlertDialog d4 = d(googleApiActivity, i2, new H1.k(super.a(googleApiActivity, i2, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d4 == null) {
            return;
        }
        e(googleApiActivity, d4, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i2, PendingIntent pendingIntent) {
        NotificationManager notificationManager;
        CharSequence charSequence;
        int i4;
        Bundle bundle;
        NotificationManager notificationManager2;
        int i5;
        int i6;
        ArrayList arrayList;
        int i7;
        Log.w("GoogleApiAvailability", AbstractC0017m.h(i2, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e4 = i2 == 6 ? H1.j.e(context, "common_google_play_services_resolution_required_title") : H1.j.c(context, i2);
        if (e4 == null) {
            e4 = context.getResources().getString(com.chicken.road.kedro.laqer.R.string.common_google_play_services_notification_ticker);
        }
        String d4 = (i2 == 6 || i2 == 19) ? H1.j.d(context, "common_google_play_services_resolution_required_text", H1.j.a(context)) : H1.j.b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        H1.o.d(systemService);
        NotificationManager notificationManager3 = (NotificationManager) systemService;
        S0.d dVar = new S0.d();
        ArrayList arrayList2 = new ArrayList();
        dVar.f4007b = arrayList2;
        dVar.f4008c = new ArrayList();
        dVar.f4009d = new ArrayList();
        dVar.f4014i = true;
        dVar.f4016k = false;
        Notification notification = new Notification();
        dVar.f4020o = notification;
        dVar.f4006a = context;
        dVar.f4018m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        dVar.f4013h = 0;
        dVar.f4021p = new ArrayList();
        dVar.f4019n = true;
        dVar.f4016k = true;
        notification.flags |= 16;
        dVar.f4010e = S0.d.a(e4);
        t tVar = new t(14, false);
        tVar.f11495i = S0.d.a(d4);
        dVar.b(tVar);
        PackageManager packageManager = context.getPackageManager();
        if (M1.a.f3569f == null) {
            M1.a.f3569f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (M1.a.f3569f.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            dVar.f4013h = 2;
            if (M1.a.J(context)) {
                arrayList2.add(new S0.c(resources.getString(com.chicken.road.kedro.laqer.R.string.common_open_on_phone), pendingIntent));
            } else {
                dVar.f4012g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = S0.d.a(resources.getString(com.chicken.road.kedro.laqer.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            dVar.f4012g = pendingIntent;
            dVar.f4011f = S0.d.a(d4);
        }
        synchronized (f2287c) {
        }
        NotificationChannel notificationChannel = notificationManager3.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.chicken.road.kedro.laqer.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager3.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager3.createNotificationChannel(notificationChannel);
        }
        dVar.f4018m = "com.google.android.gms.availability";
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder a4 = S0.i.a(dVar.f4006a, dVar.f4018m);
        Notification notification2 = dVar.f4020o;
        a4.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(dVar.f4010e).setContentText(dVar.f4011f).setContentInfo(null).setContentIntent(dVar.f4012g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        S0.g.b(a4, null);
        a4.setSubText(null).setUsesChronometer(false).setPriority(dVar.f4013h);
        Iterator it = dVar.f4007b.iterator();
        while (it.hasNext()) {
            S0.c cVar = (S0.c) it.next();
            if (cVar.f4000b == null && (i7 = cVar.f4003e) != 0) {
                cVar.f4000b = IconCompat.a(i7);
            }
            IconCompat iconCompat = cVar.f4000b;
            Notification.Action.Builder a5 = S0.g.a(iconCompat != null ? W0.a.c(iconCompat, null) : null, cVar.f4004f, cVar.f4005g);
            Bundle bundle3 = cVar.f3999a;
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            boolean z4 = cVar.f4001c;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z4);
            int i8 = Build.VERSION.SDK_INT;
            S0.h.a(a5, z4);
            bundle4.putInt("android.support.action.semanticAction", 0);
            if (i8 >= 28) {
                S0.j.b(a5, 0);
            }
            if (i8 >= 29) {
                S0.k.c(a5, false);
            }
            if (i8 >= 31) {
                S0.l.a(a5, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", cVar.f4002d);
            S0.e.b(a5, bundle4);
            S0.e.a(a4, S0.e.d(a5));
        }
        Bundle bundle5 = dVar.f4017l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        int i9 = Build.VERSION.SDK_INT;
        a4.setShowWhen(dVar.f4014i);
        S0.e.i(a4, dVar.f4016k);
        S0.e.g(a4, null);
        S0.e.j(a4, null);
        S0.e.h(a4, false);
        S0.f.b(a4, null);
        S0.f.c(a4, 0);
        S0.f.f(a4, 0);
        S0.f.d(a4, null);
        S0.f.e(a4, notification2.sound, notification2.audioAttributes);
        ArrayList arrayList3 = dVar.f4021p;
        ArrayList arrayList4 = dVar.f4008c;
        if (i9 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it2 = arrayList4.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    C0671f c0671f = new C0671f(arrayList3.size() + arrayList.size());
                    c0671f.addAll(arrayList);
                    c0671f.addAll(arrayList3);
                    arrayList3 = new ArrayList(c0671f);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                S0.f.a(a4, (String) it3.next());
            }
        }
        ArrayList arrayList5 = dVar.f4009d;
        if (arrayList5.size() > 0) {
            if (dVar.f4017l == null) {
                dVar.f4017l = new Bundle();
            }
            Bundle bundle6 = dVar.f4017l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i10 = 0;
            while (i10 < arrayList5.size()) {
                String num = Integer.toString(i10);
                S0.c cVar2 = (S0.c) arrayList5.get(i10);
                Bundle bundle9 = new Bundle();
                ArrayList arrayList6 = arrayList5;
                if (cVar2.f4000b == null && (i6 = cVar2.f4003e) != 0) {
                    cVar2.f4000b = IconCompat.a(i6);
                }
                IconCompat iconCompat2 = cVar2.f4000b;
                if (iconCompat2 != null) {
                    i5 = iconCompat2.b();
                    notificationManager2 = notificationManager3;
                } else {
                    notificationManager2 = notificationManager3;
                    i5 = 0;
                }
                bundle9.putInt("icon", i5);
                bundle9.putCharSequence("title", cVar2.f4004f);
                bundle9.putParcelable("actionIntent", cVar2.f4005g);
                Bundle bundle10 = cVar2.f3999a;
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", cVar2.f4001c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", cVar2.f4002d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                i10++;
                arrayList5 = arrayList6;
                notificationManager3 = notificationManager2;
            }
            notificationManager = notificationManager3;
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (dVar.f4017l == null) {
                dVar.f4017l = new Bundle();
            }
            dVar.f4017l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        } else {
            notificationManager = notificationManager3;
        }
        int i11 = Build.VERSION.SDK_INT;
        a4.setExtras(dVar.f4017l);
        S0.h.e(a4, null);
        S0.i.b(a4, 0);
        S0.i.e(a4, null);
        S0.i.f(a4, null);
        S0.i.g(a4, 0L);
        S0.i.d(a4, 0);
        if (!TextUtils.isEmpty(dVar.f4018m)) {
            a4.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i11 >= 28) {
            Iterator it4 = arrayList4.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i11 >= 29) {
            S0.k.a(a4, dVar.f4019n);
            charSequence = null;
            S0.k.b(a4, null);
        } else {
            charSequence = null;
        }
        t tVar2 = dVar.f4015j;
        if (tVar2 != null) {
            new Notification.BigTextStyle(a4).setBigContentTitle(charSequence).bigText((CharSequence) tVar2.f11495i);
        }
        Notification build = a4.build();
        if (tVar2 != null) {
            dVar.f4015j.getClass();
        }
        if (tVar2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            h.f2291a.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, build);
    }

    public final void g(Activity activity, z zVar, int i2, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d4 = d(activity, i2, new H1.k(super.a(activity, i2, "d"), zVar, 1), onCancelListener);
        if (d4 == null) {
            return;
        }
        e(activity, d4, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
