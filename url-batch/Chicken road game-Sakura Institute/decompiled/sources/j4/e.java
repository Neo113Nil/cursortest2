package j4;

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
import java.util.ArrayList;
import java.util.Iterator;
import l4.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5012c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f5013d = new e();

    public static AlertDialog d(Activity activity, int i7, m4.k kVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(m4.j.b(activity, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i7 != 1 ? i7 != 2 ? i7 != 3 ? resources.getString(R.string.ok) : resources.getString(com.android.installreferrer.R.string.common_google_play_services_enable_button) : resources.getString(com.android.installreferrer.R.string.common_google_play_services_update_button) : resources.getString(com.android.installreferrer.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, kVar);
        }
        String c4 = m4.j.c(activity, i7);
        if (c4 != null) {
            builder.setTitle(c4);
        }
        Log.w("GoogleApiAvailability", a0.m.i("Creating dialog for Google Play services availability issue. ConnectionResult=", i7), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        m4.o.e(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f5006f = alertDialog;
        if (onCancelListener != null) {
            cVar.f5007g = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i7, GoogleApiActivity googleApiActivity2) {
        AlertDialog d8 = d(googleApiActivity, i7, new m4.k(super.a(googleApiActivity, i7, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d8 == null) {
            return;
        }
        e(googleApiActivity, d8, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i7, PendingIntent pendingIntent) {
        CharSequence charSequence;
        int i8;
        Bundle bundle;
        int i9;
        ArrayList arrayList;
        int i10;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", a0.m.g(i7, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i7 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e9 = i7 == 6 ? m4.j.e(context, "common_google_play_services_resolution_required_title") : m4.j.c(context, i7);
        if (e9 == null) {
            e9 = context.getResources().getString(com.android.installreferrer.R.string.common_google_play_services_notification_ticker);
        }
        String d8 = (i7 == 6 || i7 == 19) ? m4.j.d(context, "common_google_play_services_resolution_required_text", m4.j.a(context)) : m4.j.b(context, i7);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        m4.o.d(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        s2.e eVar = new s2.e();
        ArrayList arrayList2 = new ArrayList();
        eVar.f8504b = arrayList2;
        eVar.f8505c = new ArrayList();
        eVar.f8506d = new ArrayList();
        eVar.f8511i = true;
        eVar.f8513k = false;
        Notification notification = new Notification();
        eVar.f8517o = notification;
        eVar.f8503a = context;
        eVar.f8515m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        eVar.f8510h = 0;
        eVar.f8518p = new ArrayList();
        eVar.f8516n = true;
        eVar.f8513k = true;
        notification.flags |= 16;
        eVar.f8507e = s2.e.a(e9);
        q5.g gVar = new q5.g(10);
        gVar.f7528h = s2.e.a(d8);
        eVar.b(gVar);
        PackageManager packageManager = context.getPackageManager();
        if (a8.m.f563c == null) {
            a8.m.f563c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (a8.m.f563c.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            eVar.f8510h = 2;
            if (a8.m.C(context)) {
                arrayList2.add(new s2.d(resources.getString(com.android.installreferrer.R.string.common_open_on_phone), pendingIntent));
            } else {
                eVar.f8509g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = s2.e.a(resources.getString(com.android.installreferrer.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            eVar.f8509g = pendingIntent;
            eVar.f8508f = s2.e.a(d8);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            if (i11 < 26) {
                throw new IllegalStateException();
            }
            synchronized (f5012c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.android.installreferrer.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(b2.g.c(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVar.f8515m = "com.google.android.gms.availability";
        }
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Context context2 = eVar.f8503a;
        ArrayList arrayList3 = eVar.f8518p;
        ArrayList arrayList4 = eVar.f8505c;
        ArrayList arrayList5 = eVar.f8506d;
        Notification.Builder a3 = Build.VERSION.SDK_INT >= 26 ? s2.j.a(context2, eVar.f8515m) : new Notification.Builder(context2);
        Notification notification2 = eVar.f8517o;
        a3.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(eVar.f8507e).setContentText(eVar.f8508f).setContentInfo(null).setContentIntent(eVar.f8509g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        s2.h.b(a3, null);
        a3.setSubText(null).setUsesChronometer(false).setPriority(eVar.f8510h);
        ArrayList arrayList6 = eVar.f8504b;
        int size = arrayList6.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList6.get(i12);
            int i13 = i12 + 1;
            s2.d dVar = (s2.d) obj;
            ArrayList arrayList7 = arrayList6;
            if (dVar.f8497b == null && (i10 = dVar.f8500e) != 0) {
                dVar.f8497b = IconCompat.b(i10);
            }
            IconCompat iconCompat = dVar.f8497b;
            int i14 = size;
            boolean z8 = dVar.f8498c;
            Bundle bundle3 = dVar.f8496a;
            ArrayList arrayList8 = arrayList4;
            NotificationManager notificationManager2 = notificationManager;
            Notification.Action.Builder a9 = s2.h.a(iconCompat != null ? w2.a.c(iconCompat, null) : null, dVar.f8501f, dVar.f8502g);
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            bundle4.putBoolean("android.support.allowGeneratedReplies", z8);
            int i15 = Build.VERSION.SDK_INT;
            s2.i.a(a9, z8);
            bundle4.putInt("android.support.action.semanticAction", 0);
            if (i15 >= 28) {
                s2.k.b(a9, 0);
            }
            if (i15 >= 29) {
                s2.l.c(a9, false);
            }
            if (i15 >= 31) {
                s2.m.a(a9, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", dVar.f8499d);
            s2.f.b(a9, bundle4);
            s2.f.a(a3, s2.f.d(a9));
            arrayList6 = arrayList7;
            size = i14;
            i12 = i13;
            arrayList4 = arrayList8;
            notificationManager = notificationManager2;
        }
        NotificationManager notificationManager3 = notificationManager;
        ArrayList arrayList9 = arrayList4;
        Bundle bundle5 = eVar.f8514l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        int i16 = Build.VERSION.SDK_INT;
        a3.setShowWhen(eVar.f8511i);
        s2.f.i(a3, eVar.f8513k);
        s2.f.g(a3, null);
        s2.f.j(a3, null);
        s2.f.h(a3, false);
        s2.g.b(a3, null);
        s2.g.c(a3, 0);
        s2.g.f(a3, 0);
        s2.g.d(a3, null);
        s2.g.e(a3, notification2.sound, notification2.audioAttributes);
        if (i16 < 28) {
            if (arrayList9 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList9.size());
                Iterator it = arrayList9.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    i.f fVar = new i.f(arrayList3.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList3.get(i17);
                i17++;
                s2.g.a(a3, (String) obj2);
            }
        }
        if (arrayList5.size() > 0) {
            if (eVar.f8514l == null) {
                eVar.f8514l = new Bundle();
            }
            Bundle bundle6 = eVar.f8514l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i18 = 0;
            while (i18 < arrayList5.size()) {
                String num = Integer.toString(i18);
                s2.d dVar2 = (s2.d) arrayList5.get(i18);
                Bundle bundle9 = new Bundle();
                if (dVar2.f8497b == null && (i9 = dVar2.f8500e) != 0) {
                    dVar2.f8497b = IconCompat.b(i9);
                }
                IconCompat iconCompat2 = dVar2.f8497b;
                int i19 = i18;
                Bundle bundle10 = dVar2.f8496a;
                ArrayList arrayList10 = arrayList5;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.c() : 0);
                bundle9.putCharSequence("title", dVar2.f8501f);
                bundle9.putParcelable("actionIntent", dVar2.f8502g);
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", dVar2.f8498c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", dVar2.f8499d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                i18 = i19 + 1;
                arrayList5 = arrayList10;
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (eVar.f8514l == null) {
                eVar.f8514l = new Bundle();
            }
            eVar.f8514l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        }
        int i20 = Build.VERSION.SDK_INT;
        a3.setExtras(eVar.f8514l);
        s2.i.e(a3, null);
        if (i20 >= 26) {
            s2.j.b(a3, 0);
            s2.j.e(a3, null);
            s2.j.f(a3, null);
            s2.j.g(a3, 0L);
            s2.j.d(a3, 0);
            if (!TextUtils.isEmpty(eVar.f8515m)) {
                a3.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i20 >= 28) {
            Iterator it2 = arrayList9.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i20 >= 29) {
            s2.l.a(a3, eVar.f8516n);
            charSequence = null;
            s2.l.b(a3, null);
        } else {
            charSequence = null;
        }
        q5.g gVar2 = eVar.f8512j;
        if (gVar2 != null) {
            new Notification.BigTextStyle(a3).setBigContentTitle(charSequence).bigText((CharSequence) gVar2.f7528h);
        }
        Notification build = i11 >= 26 ? a3.build() : a3.build();
        if (gVar2 != null) {
            eVar.f8512j.getClass();
        }
        if (gVar2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            h.f5016a.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager3.notify(i8, build);
    }

    public final void g(Activity activity, u uVar, int i7, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d8 = d(activity, i7, new m4.k(super.a(activity, i7, "d"), uVar, 1), onCancelListener);
        if (d8 == null) {
            return;
        }
        e(activity, d8, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
