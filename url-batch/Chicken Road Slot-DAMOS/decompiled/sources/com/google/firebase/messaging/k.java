package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.gd;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.q6;
import java.util.ArrayDeque;
import java.util.Objects;
import s7.a3;
import s7.b3;
import s7.i2;
import s7.o1;
import s7.p3;
import s7.p4;
import s7.q1;
import s7.q2;
import s7.t3;
import s7.v0;
import s7.y2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3152d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3153e;

    public k() {
        this.f3152d = 0;
        this.f3153e = new ArrayDeque(10);
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3153e;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e2) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e2);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    i8.a aVar = (i8.a) g8.g.c().b(i8.a.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (aVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        i8.b bVar = (i8.b) aVar;
                        if (!j8.a.f5106b.contains("fcm")) {
                            d7 d7Var = bVar.f4671a.f3061a;
                            d7Var.a(new q6(d7Var, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        bVar.a("_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            e0.h("_no", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:12:0x0048, B:15:0x004f, B:19:0x0061, B:23:0x006e, B:31:0x002d, B:33:0x0034, B:35:0x0040), top: B:2:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(p6 p6Var, Bundle bundle) {
        q1 q1Var;
        q1 q1Var2;
        Intent intent;
        Uri uri;
        q2 q2Var = (q2) this.f3153e;
        try {
            try {
                q1Var2 = (q1) q2Var.f1478d;
                v0 v0Var = q1Var2.f8937t;
                q1.l(v0Var);
                v0Var.B.a("onActivityCreated");
                intent = p6Var.f2669i;
            } catch (RuntimeException e2) {
                v0 v0Var2 = ((q1) q2Var.f1478d).f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.b(e2, "Throwable caught in onActivityCreated");
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        q1.j(q1Var2.f8940w);
                        String str = !p4.u0(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z10 = bundle != null;
                        o1 o1Var = q1Var2.f8938u;
                        q1.l(o1Var);
                        o1Var.B(new i2(this, z10, uri, str, queryParameter));
                        q1Var = (q1) q2Var.f1478d;
                        b3 b3Var = q1Var.f8943z;
                        q1.k(b3Var);
                        b3Var.z(p6Var, bundle);
                    }
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                        uri = data;
                        if (uri != null) {
                            q1.j(q1Var2.f8940w);
                            String str2 = !p4.u0(intent) ? "gs" : "auto";
                            String queryParameter2 = uri.getQueryParameter("referrer");
                            boolean z102 = bundle != null;
                            o1 o1Var2 = q1Var2.f8938u;
                            q1.l(o1Var2);
                            o1Var2.B(new i2(this, z102, uri, str2, queryParameter2));
                            q1Var = (q1) q2Var.f1478d;
                            b3 b3Var2 = q1Var.f8943z;
                            q1.k(b3Var2);
                            b3Var2.z(p6Var, bundle);
                        }
                    }
                }
                uri = null;
                if (uri != null) {
                }
            }
            q1Var = (q1) q2Var.f1478d;
            b3 b3Var22 = q1Var.f8943z;
            q1.k(b3Var22);
            b3Var22.z(p6Var, bundle);
        } catch (Throwable th) {
            b3 b3Var3 = ((q1) q2Var.f1478d).f8943z;
            q1.k(b3Var3);
            b3Var3.z(p6Var, bundle);
            throw th;
        }
    }

    public void k(p6 p6Var) {
        b3 b3Var = ((q1) ((q2) this.f3153e).f1478d).f8943z;
        q1.k(b3Var);
        synchronized (b3Var.f8531z) {
            try {
                if (Objects.equals(b3Var.f8526u, p6Var)) {
                    b3Var.f8526u = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((q1) b3Var.f1478d).f8935r.H()) {
            b3Var.f8525t.remove(Integer.valueOf(p6Var.f2667d));
        }
    }

    public void l(p6 p6Var) {
        q1 q1Var = (q1) ((q2) this.f3153e).f1478d;
        b3 b3Var = q1Var.f8943z;
        q1.k(b3Var);
        synchronized (b3Var.f8531z) {
            b3Var.f8530y = false;
            b3Var.f8527v = true;
        }
        q1 q1Var2 = (q1) b3Var.f1478d;
        q1Var2.f8942y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (q1Var2.f8935r.H()) {
            y2 C = b3Var.C(p6Var);
            b3Var.f8523r = b3Var.f8522i;
            b3Var.f8522i = null;
            o1 o1Var = q1Var2.f8938u;
            q1.l(o1Var);
            o1Var.B(new gd(b3Var, C, elapsedRealtime));
        } else {
            b3Var.f8522i = null;
            o1 o1Var2 = q1Var2.f8938u;
            q1.l(o1Var2);
            o1Var2.B(new s7.x(b3Var, elapsedRealtime));
        }
        t3 t3Var = q1Var.f8939v;
        q1.k(t3Var);
        q1 q1Var3 = (q1) t3Var.f1478d;
        q1Var3.f8942y.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        o1 o1Var3 = q1Var3.f8938u;
        q1.l(o1Var3);
        o1Var3.B(new p3(t3Var, elapsedRealtime2, 1));
    }

    public void m(p6 p6Var) {
        q1 q1Var = (q1) ((q2) this.f3153e).f1478d;
        t3 t3Var = q1Var.f8939v;
        q1.k(t3Var);
        q1 q1Var2 = (q1) t3Var.f1478d;
        q1Var2.f8942y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        o1 o1Var = q1Var2.f8938u;
        q1.l(o1Var);
        o1Var.B(new p3(t3Var, elapsedRealtime, 0));
        b3 b3Var = q1Var.f8943z;
        q1.k(b3Var);
        Object obj = b3Var.f8531z;
        synchronized (obj) {
            try {
                b3Var.f8530y = true;
                if (!Objects.equals(p6Var, b3Var.f8526u)) {
                    synchronized (obj) {
                        b3Var.f8526u = p6Var;
                        b3Var.f8527v = false;
                        q1 q1Var3 = (q1) b3Var.f1478d;
                        if (q1Var3.f8935r.H()) {
                            b3Var.f8528w = null;
                            o1 o1Var2 = q1Var3.f8938u;
                            q1.l(o1Var2);
                            o1Var2.B(new a3(b3Var, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        q1 q1Var4 = (q1) b3Var.f1478d;
        if (!q1Var4.f8935r.H()) {
            b3Var.f8522i = b3Var.f8528w;
            o1 o1Var3 = q1Var4.f8938u;
            q1.l(o1Var3);
            o1Var3.B(new a3(b3Var, 0));
            return;
        }
        b3Var.A(p6Var.f2668e, b3Var.C(p6Var), false);
        s7.z zVar = ((q1) b3Var.f1478d).B;
        q1.i(zVar);
        q1 q1Var5 = (q1) zVar.f1478d;
        q1Var5.f8942y.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        o1 o1Var4 = q1Var5.f8938u;
        q1.l(o1Var4);
        o1Var4.B(new s7.x(zVar, elapsedRealtime2));
    }

    public void n(p6 p6Var, Bundle bundle) {
        y2 y2Var;
        b3 b3Var = ((q1) ((q2) this.f3153e).f1478d).f8943z;
        q1.k(b3Var);
        if (!((q1) b3Var.f1478d).f8935r.H() || bundle == null || (y2Var = (y2) b3Var.f8525t.get(Integer.valueOf(p6Var.f2667d))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", y2Var.f9128c);
        bundle2.putString("name", y2Var.f9126a);
        bundle2.putString("referrer_name", y2Var.f9127b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f3152d) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                        break;
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a6.f(1, this, intent));
                        break;
                    }
                }
                break;
            default:
                j(p6.b(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f3152d) {
            case 0:
                break;
            default:
                k(p6.b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f3152d) {
            case 0:
                break;
            default:
                l(p6.b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f3152d) {
            case 0:
                break;
            default:
                m(p6.b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f3152d) {
            case 0:
                break;
            default:
                n(p6.b(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i3 = this.f3152d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i3 = this.f3152d;
    }

    public k(q2 q2Var) {
        this.f3152d = 1;
        this.f3153e = q2Var;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
