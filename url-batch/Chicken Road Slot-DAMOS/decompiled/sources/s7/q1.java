package s7;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.da;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.la;
import com.google.android.gms.internal.measurement.ma;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.sa;
import com.google.android.gms.internal.measurement.ta;
import com.google.android.gms.internal.measurement.wa;
import com.google.android.gms.internal.measurement.ya;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q1 implements y1 {
    public static volatile q1 T;
    public final q2 A;
    public final z B;
    public final u2 C;
    public final String D;
    public o0 E;
    public l3 F;
    public p G;
    public m0 H;
    public v2 I;
    public Boolean K;
    public long L;
    public volatile Boolean M;
    public volatile boolean N;
    public int O;
    public int P;
    public final long R;
    public final long S;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8932d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8933e;

    /* renamed from: i, reason: collision with root package name */
    public final k5.c f8934i;

    /* renamed from: r, reason: collision with root package name */
    public final g f8935r;

    /* renamed from: s, reason: collision with root package name */
    public final f1 f8936s;

    /* renamed from: t, reason: collision with root package name */
    public final v0 f8937t;

    /* renamed from: u, reason: collision with root package name */
    public final o1 f8938u;

    /* renamed from: v, reason: collision with root package name */
    public final t3 f8939v;

    /* renamed from: w, reason: collision with root package name */
    public final p4 f8940w;

    /* renamed from: x, reason: collision with root package name */
    public final p0 f8941x;

    /* renamed from: y, reason: collision with root package name */
    public final g7.a f8942y;

    /* renamed from: z, reason: collision with root package name */
    public final b3 f8943z;
    public boolean J = false;
    public final AtomicInteger Q = new AtomicInteger(0);

    public q1(e2 e2Var) {
        Context context;
        long currentTimeMillis;
        long elapsedRealtime;
        Context context2 = e2Var.f8669a;
        k5.c cVar = new k5.c(17);
        this.f8934i = cVar;
        d2.f8591n = cVar;
        this.f8932d = context2;
        this.f8933e = e2Var.f8673e;
        this.M = e2Var.f8670b;
        this.D = e2Var.f8675h;
        this.N = true;
        if (wa.f2946b == null && context2 != null) {
            Object obj = wa.f2945a;
            synchronized (obj) {
                try {
                    if (wa.f2946b == null) {
                        synchronized (obj) {
                            la laVar = wa.f2946b;
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context2;
                            }
                            if (laVar != null) {
                                if (laVar.f2501a != applicationContext) {
                                }
                            }
                            if (laVar != null) {
                                Iterator it = ma.f2533a.values().iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                                ya.a();
                            }
                            wa.f2946b = new la(applicationContext, z4.w.D(new ta(applicationContext, 2)));
                            wa.f2947c.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.f8942y = g7.a.f4276a;
        da daVar = new da(context2, com.google.android.gms.internal.measurement.g1.f2311a, a7.b.f312a, a7.i.f325c);
        String concat = "com.google.android.gms.measurement#".concat(String.valueOf(context2.getPackageName()));
        a8.l b10 = a8.l.b();
        b10.f358c = new l5(2, concat, new String[0]);
        daVar.b(0, b10.a());
        AtomicReference atomicReference = sa.f2783k;
        if (atomicReference.get() == null) {
            try {
                context = context2.getApplicationContext();
            } catch (NullPointerException unused) {
                sa.b();
                com.google.android.gms.internal.measurement.h.h(Level.WARNING, (Executor) sa.f2785m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                context = null;
            }
            if (context != null) {
                while (!atomicReference.compareAndSet(null, context) && atomicReference.get() == null) {
                }
            }
        }
        Long l10 = e2Var.f8674f;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            this.f8942y.getClass();
            currentTimeMillis = System.currentTimeMillis();
        }
        this.R = currentTimeMillis;
        Long l11 = e2Var.g;
        if (l11 != null) {
            elapsedRealtime = l11.longValue();
        } else {
            this.f8942y.getClass();
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.S = elapsedRealtime;
        g gVar = new g(this);
        gVar.f8701r = k5.c.f5394e;
        this.f8935r = gVar;
        f1 f1Var = new f1(this);
        f1Var.v();
        this.f8936s = f1Var;
        v0 v0Var = new v0(this);
        v0Var.v();
        this.f8937t = v0Var;
        p4 p4Var = new p4(this);
        p4Var.v();
        this.f8940w = p4Var;
        this.f8941x = new p0(new h1(e2Var, this));
        this.B = new z(this);
        b3 b3Var = new b3(this);
        b3Var.u();
        this.f8943z = b3Var;
        q2 q2Var = new q2(this);
        q2Var.u();
        this.A = q2Var;
        t3 t3Var = new t3(this);
        t3Var.u();
        this.f8939v = t3Var;
        u2 u2Var = new u2(this);
        u2Var.v();
        this.C = u2Var;
        o1 o1Var = new o1(this);
        o1Var.v();
        this.f8938u = o1Var;
        n6 n6Var = e2Var.f8672d;
        boolean z10 = n6Var == null || n6Var.f2571e == 0;
        if (this.f8932d.getApplicationContext() instanceof Application) {
            k(q2Var);
            if (((q1) q2Var.f1478d).f8932d.getApplicationContext() instanceof Application) {
                Application application = (Application) ((q1) q2Var.f1478d).f8932d.getApplicationContext();
                if (q2Var.f8944i == null) {
                    q2Var.f8944i = new com.google.firebase.messaging.k(q2Var);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(q2Var.f8944i);
                    application.registerActivityLifecycleCallbacks(q2Var.f8944i);
                    v0 v0Var2 = ((q1) q2Var.f1478d).f8937t;
                    l(v0Var2);
                    v0Var2.B.a("Registered activity lifecycle callback");
                }
            }
        } else {
            l(v0Var);
            v0Var.f9053w.a("Application context is not an Application");
        }
        o1Var.B(new f8.j0(16, this, e2Var, false));
    }

    public static final void i(b0 b0Var) {
        if (b0Var != null) {
            return;
        }
        kotlin.collections.i0.l("Component not created");
    }

    public static final void j(c1.b bVar) {
        if (bVar != null) {
            return;
        }
        kotlin.collections.i0.l("Component not created");
    }

    public static final void k(g0 g0Var) {
        if (g0Var == null) {
            kotlin.collections.i0.l("Component not created");
        } else {
            if (g0Var.f8703e) {
                return;
            }
            kotlin.collections.i0.l("Component not initialized: ".concat(String.valueOf(g0Var.getClass())));
        }
    }

    public static final void l(x1 x1Var) {
        if (x1Var == null) {
            kotlin.collections.i0.l("Component not created");
        } else {
            if (x1Var.f9095e) {
                return;
            }
            kotlin.collections.i0.l("Component not initialized: ".concat(String.valueOf(x1Var.getClass())));
        }
    }

    public static q1 r(Context context, n6 n6Var, Long l10, Long l11) {
        Bundle bundle;
        if (n6Var != null) {
            Bundle bundle2 = n6Var.f2573r;
            n6Var = new n6(n6Var.f2570d, n6Var.f2571e, n6Var.f2572i, bundle2, null);
        }
        c7.c0.g(context);
        c7.c0.g(context.getApplicationContext());
        if (T == null) {
            synchronized (q1.class) {
                try {
                    if (T == null) {
                        T = new q1(new e2(context, n6Var, l10, l11));
                    }
                } finally {
                }
            }
        } else if (n6Var != null && (bundle = n6Var.f2573r) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            c7.c0.g(T);
            T.M = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        c7.c0.g(T);
        return T;
    }

    @Override // s7.y1
    public final k5.c a() {
        return this.f8934i;
    }

    @Override // s7.y1
    public final v0 b() {
        v0 v0Var = this.f8937t;
        l(v0Var);
        return v0Var;
    }

    public final boolean c() {
        return g() == 0;
    }

    @Override // s7.y1
    public final o1 d() {
        o1 o1Var = this.f8938u;
        l(o1Var);
        return o1Var;
    }

    @Override // s7.y1
    public final Context e() {
        return this.f8932d;
    }

    @Override // s7.y1
    public final g7.a f() {
        return this.f8942y;
    }

    public final int g() {
        o1 o1Var = this.f8938u;
        l(o1Var);
        o1Var.s();
        g gVar = this.f8935r;
        if (gVar.G()) {
            return 1;
        }
        l(o1Var);
        o1Var.s();
        if (!this.N) {
            return 8;
        }
        f1 f1Var = this.f8936s;
        j(f1Var);
        f1Var.s();
        Boolean valueOf = f1Var.w().contains("measurement_enabled") ? Boolean.valueOf(f1Var.w().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        k5.c cVar = ((q1) gVar.f1478d).f8934i;
        Boolean F = gVar.F("firebase_analytics_collection_enabled");
        return F != null ? F.booleanValue() ? 0 : 4 : (this.M == null || this.M.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.L) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        if (!this.J) {
            kotlin.collections.i0.l("AppMeasurement is not initialized");
            return false;
        }
        o1 o1Var = this.f8938u;
        l(o1Var);
        o1Var.s();
        Boolean bool = this.K;
        g7.a aVar = this.f8942y;
        if (bool != null && this.L != 0) {
            if (!bool.booleanValue()) {
                aVar.getClass();
            }
            return this.K.booleanValue();
        }
        aVar.getClass();
        this.L = SystemClock.elapsedRealtime();
        p4 p4Var = this.f8940w;
        j(p4Var);
        boolean z10 = false;
        if (p4Var.V("android.permission.INTERNET") && p4Var.V("android.permission.ACCESS_NETWORK_STATE")) {
            Context context = this.f8932d;
            if (i7.b.a(context).f() || this.f8935r.v() || (p4.n0(context) && p4.N(context))) {
                z10 = true;
            }
        }
        this.K = Boolean.valueOf(z10);
        if (z10) {
            this.K = Boolean.valueOf(p4Var.y(q().z()));
        }
        return this.K.booleanValue();
    }

    public final p0 m() {
        return this.f8941x;
    }

    public final o0 n() {
        k(this.E);
        return this.E;
    }

    public final l3 o() {
        k(this.F);
        return this.F;
    }

    public final p p() {
        l(this.G);
        return this.G;
    }

    public final m0 q() {
        k(this.H);
        return this.H;
    }
}
