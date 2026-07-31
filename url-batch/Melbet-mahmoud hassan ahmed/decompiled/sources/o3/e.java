package o3;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.GoogleApiActivity;
import j.e;
import r3.a0;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: c, reason: collision with root package name */
    private String f19856c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f19854e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final e f19855f = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final int f19853d = f.f19857a;

    public static e l() {
        return f19855f;
    }

    @Override // o3.f
    @RecentlyNullable
    public Intent b(Context context, int i7, String str) {
        return super.b(context, i7, str);
    }

    @Override // o3.f
    @RecentlyNullable
    public PendingIntent c(@RecentlyNonNull Context context, int i7, int i8) {
        return super.c(context, i7, i8);
    }

    @Override // o3.f
    public final String e(int i7) {
        return super.e(i7);
    }

    @Override // o3.f
    public int g(@RecentlyNonNull Context context) {
        return super.g(context);
    }

    @Override // o3.f
    public int h(@RecentlyNonNull Context context, int i7) {
        return super.h(context, i7);
    }

    @Override // o3.f
    public final boolean i(int i7) {
        return super.i(i7);
    }

    @RecentlyNullable
    public Dialog j(@RecentlyNonNull Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i7, a0.b(activity, b(activity, i7, "d"), i8), onCancelListener);
    }

    @RecentlyNullable
    public PendingIntent k(@RecentlyNonNull Context context, @RecentlyNonNull b bVar) {
        return bVar.i() ? bVar.h() : c(context, bVar.c(), 0);
    }

    public boolean m(@RecentlyNonNull Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog j7 = j(activity, i7, i8, onCancelListener);
        if (j7 == null) {
            return false;
        }
        r(activity, j7, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void n(@RecentlyNonNull Context context, int i7) {
        o(context, i7, null, d(context, i7, 0, "n"));
    }

    @TargetApi(20)
    final void o(Context context, int i7, String str, PendingIntent pendingIntent) {
        int i8;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i7), null), new IllegalArgumentException());
        if (i7 == 18) {
            s(context);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String b7 = r3.y.b(context, i7);
        String d7 = r3.y.d(context, i7);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) r3.o.i(context.getSystemService("notification"));
        e.d x6 = new e.d(context).s(true).j(true).o(b7).x(new e.b().m(d7));
        if (v3.h.e(context)) {
            r3.o.k(v3.l.f());
            x6.w(context.getApplicationInfo().icon).u(2);
            if (v3.h.g(context)) {
                x6.a(n3.a.f19606a, resources.getString(n3.b.f19621o), pendingIntent);
            } else {
                x6.m(pendingIntent);
            }
        } else {
            x6.w(R.drawable.stat_sys_warning).z(resources.getString(n3.b.f19614h)).B(System.currentTimeMillis()).m(pendingIntent).n(d7);
        }
        if (v3.l.j()) {
            r3.o.k(v3.l.j());
            synchronized (f19854e) {
                str2 = this.f19856c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String g7 = r3.y.g(context);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", g7, 4);
                } else if (!g7.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(g7);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            x6.k(str2);
        }
        Notification c7 = x6.c();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            j.f19862b.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager.notify(i8, c7);
    }

    public final boolean p(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, int i7) {
        PendingIntent k7 = k(context, bVar);
        if (k7 == null) {
            return false;
        }
        o(context, bVar.c(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, k7, i7, true), 134217728));
        return true;
    }

    final Dialog q(Context context, int i7, a0 a0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(r3.y.c(context, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e7 = r3.y.e(context, i7);
        if (e7 != null) {
            builder.setPositiveButton(e7, a0Var);
        }
        String a7 = r3.y.a(context, i7);
        if (a7 != null) {
            builder.setTitle(a7);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i7)), new IllegalArgumentException());
        return builder.create();
    }

    final void r(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.d) {
                m.p1(dialog, onCancelListener).o1(((androidx.fragment.app.d) activity).j(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void s(Context context) {
        new o(this, context).sendEmptyMessageDelayed(1, 120000L);
    }
}
