package a0;

import E.AbstractC0005f;
import T.C0083a;
import T.C0086d;
import T.C0097o;
import T.C0103v;
import T.C0104w;
import T.C0107z;
import W.AbstractC0108a;
import W.C0112e;
import a.AbstractC0124a;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import q0.AbstractC1359a;
import q0.C1353B;
import q0.C1360b;
import q0.InterfaceC1382y;
import q0.InterfaceC1383z;

/* loaded from: classes.dex */
public final class M implements Handler.Callback, InterfaceC1382y, h0, w0.t {

    /* renamed from: g0, reason: collision with root package name */
    public static final long f3923g0 = W.J.Z(10000);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f3924A;

    /* renamed from: B, reason: collision with root package name */
    public p0 f3925B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3927D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3928E;

    /* renamed from: F, reason: collision with root package name */
    public L f3929F;

    /* renamed from: G, reason: collision with root package name */
    public int f3930G;

    /* renamed from: H, reason: collision with root package name */
    public g0 f3931H;

    /* renamed from: I, reason: collision with root package name */
    public C0134J f3932I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3933J;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f3935M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f3937O;

    /* renamed from: P, reason: collision with root package name */
    public int f3938P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3940R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3941S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f3942T;

    /* renamed from: U, reason: collision with root package name */
    public int f3943U;

    /* renamed from: V, reason: collision with root package name */
    public L f3944V;

    /* renamed from: W, reason: collision with root package name */
    public long f3945W;

    /* renamed from: X, reason: collision with root package name */
    public long f3946X;

    /* renamed from: Y, reason: collision with root package name */
    public int f3947Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f3948Z;

    /* renamed from: a, reason: collision with root package name */
    public final n0[] f3949a;

    /* renamed from: a0, reason: collision with root package name */
    public C0146l f3950a0;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0135a[] f3951b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f3953c;

    /* renamed from: c0, reason: collision with root package name */
    public C0150p f3954c0;

    /* renamed from: d, reason: collision with root package name */
    public final t0.w f3955d;

    /* renamed from: e, reason: collision with root package name */
    public final t0.x f3957e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3958e0;

    /* renamed from: f, reason: collision with root package name */
    public final O f3959f;

    /* renamed from: g, reason: collision with root package name */
    public final u0.d f3961g;

    /* renamed from: h, reason: collision with root package name */
    public final W.F f3962h;

    /* renamed from: i, reason: collision with root package name */
    public final E1.N f3963i;

    /* renamed from: j, reason: collision with root package name */
    public final Looper f3964j;

    /* renamed from: k, reason: collision with root package name */
    public final T.S f3965k;

    /* renamed from: l, reason: collision with root package name */
    public final T.Q f3966l;

    /* renamed from: m, reason: collision with root package name */
    public final long f3967m;
    public final C0142h n;
    public final ArrayList o;

    /* renamed from: p, reason: collision with root package name */
    public final W.D f3968p;

    /* renamed from: q, reason: collision with root package name */
    public final C0156w f3969q;

    /* renamed from: r, reason: collision with root package name */
    public final V f3970r;

    /* renamed from: s, reason: collision with root package name */
    public final f0 f3971s;

    /* renamed from: t, reason: collision with root package name */
    public final C0139e f3972t;

    /* renamed from: u, reason: collision with root package name */
    public final long f3973u;
    public final b0.i v;

    /* renamed from: w, reason: collision with root package name */
    public final b0.d f3974w;

    /* renamed from: x, reason: collision with root package name */
    public final W.F f3975x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f3976y;
    public final U.e z;

    /* renamed from: d0, reason: collision with root package name */
    public long f3956d0 = -9223372036854775807L;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f3939Q = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3934K = false;

    /* renamed from: f0, reason: collision with root package name */
    public float f3960f0 = 1.0f;

    /* renamed from: C, reason: collision with root package name */
    public o0 f3926C = o0.f4225b;

    /* renamed from: b0, reason: collision with root package name */
    public long f3952b0 = -9223372036854775807L;

    /* renamed from: N, reason: collision with root package name */
    public long f3936N = -9223372036854775807L;

    public M(Context context, AbstractC0135a[] abstractC0135aArr, AbstractC0135a[] abstractC0135aArr2, t0.w wVar, t0.x xVar, O o, u0.d dVar, int i4, b0.d dVar2, p0 p0Var, C0139e c0139e, long j4, Looper looper, W.D d4, C0156w c0156w, b0.i iVar, C0150p c0150p, final w0.t tVar, boolean z) {
        Looper looper2;
        this.f3969q = c0156w;
        this.f3955d = wVar;
        this.f3957e = xVar;
        this.f3959f = o;
        this.f3961g = dVar;
        this.f3938P = i4;
        boolean z4 = false;
        this.f3925B = p0Var;
        this.f3972t = c0139e;
        this.f3973u = j4;
        this.f3968p = d4;
        this.v = iVar;
        this.f3954c0 = c0150p;
        this.f3974w = dVar2;
        this.f3924A = z;
        this.f3967m = ((C0141g) o).n;
        T.P p2 = T.T.f2704a;
        g0 k4 = g0.k(xVar);
        this.f3931H = k4;
        this.f3932I = new C0134J(k4);
        this.f3951b = new AbstractC0135a[abstractC0135aArr.length];
        this.f3953c = new boolean[abstractC0135aArr.length];
        t0.r rVar = (t0.r) wVar;
        rVar.getClass();
        this.f3949a = new n0[abstractC0135aArr.length];
        boolean z5 = false;
        for (int i5 = 0; i5 < abstractC0135aArr.length; i5++) {
            AbstractC0135a abstractC0135a = abstractC0135aArr[i5];
            abstractC0135a.f4041e = i5;
            abstractC0135a.f4042f = iVar;
            abstractC0135a.f4043g = d4;
            this.f3951b[i5] = abstractC0135a;
            AbstractC0135a abstractC0135a2 = this.f3951b[i5];
            synchronized (abstractC0135a2.f4037a) {
                abstractC0135a2.f4052r = rVar;
            }
            AbstractC0135a abstractC0135a3 = abstractC0135aArr2[i5];
            if (abstractC0135a3 != null) {
                abstractC0135a3.f4041e = i5;
                abstractC0135a3.f4042f = iVar;
                abstractC0135a3.f4043g = d4;
                z5 = true;
            }
            n0[] n0VarArr = this.f3949a;
            AbstractC0135a abstractC0135a4 = abstractC0135aArr[i5];
            n0 n0Var = new n0();
            n0Var.f4202e = abstractC0135a4;
            n0Var.f4200c = i5;
            n0Var.f4203f = abstractC0135a3;
            n0Var.f4201d = 0;
            n0Var.f4198a = false;
            n0Var.f4199b = false;
            n0VarArr[i5] = n0Var;
        }
        this.f3976y = z5;
        this.n = new C0142h(this, d4);
        this.o = new ArrayList();
        this.f3965k = new T.S();
        this.f3966l = new T.Q();
        AbstractC0124a.t(wVar.f15382a == null);
        wVar.f15382a = this;
        wVar.f15383b = dVar;
        this.f3948Z = true;
        W.F a3 = d4.a(looper, null);
        this.f3975x = a3;
        this.f3970r = new V(dVar2, a3, new D0.a(16, this), c0150p);
        this.f3971s = new f0(this, dVar2, a3, iVar);
        E1.N n = new E1.N();
        this.f3963i = n;
        synchronized (n.f512b) {
            try {
                if (((Looper) n.f513c) == null) {
                    if (n.f511a == 0 && ((HandlerThread) n.f514d) == null) {
                        z4 = true;
                    }
                    AbstractC0124a.t(z4);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    n.f514d = handlerThread;
                    handlerThread.start();
                    n.f513c = ((HandlerThread) n.f514d).getLooper();
                }
                n.f511a++;
                looper2 = (Looper) n.f513c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3964j = looper2;
        W.F a4 = d4.a(looper2, this);
        this.f3962h = a4;
        this.z = new U.e(context, looper2, this);
        a4.a(35, new w0.t() { // from class: a0.G
            @Override // w0.t
            public final void a(long j5, long j6, C0097o c0097o, MediaFormat mediaFormat) {
                M m4 = M.this;
                m4.getClass();
                tVar.a(j5, j6, c0097o, mediaFormat);
                m4.a(j5, j6, c0097o, mediaFormat);
            }
        }).b();
    }

    public static Pair S(T.T t4, L l4, boolean z, int i4, boolean z4, T.S s4, T.Q q4) {
        int T4;
        T.T t5 = l4.f3920a;
        if (t4.p()) {
            return null;
        }
        T.T t6 = t5.p() ? t4 : t5;
        try {
            Pair i5 = t6.i(s4, q4, l4.f3921b, l4.f3922c);
            if (!t4.equals(t6)) {
                if (t4.b(i5.first) == -1) {
                    if (!z || (T4 = T(s4, q4, i4, z4, i5.first, t6, t4)) == -1) {
                        return null;
                    }
                    return t4.i(s4, q4, T4, -9223372036854775807L);
                }
                if (t6.g(i5.first, q4).f2686f && t6.m(q4.f2683c, s4, 0L).n == t6.b(i5.first)) {
                    return t4.i(s4, q4, t4.g(i5.first, q4).f2683c, l4.f3922c);
                }
            }
            return i5;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(T.S s4, T.Q q4, int i4, boolean z, Object obj, T.T t4, T.T t5) {
        T.S s5 = s4;
        T.T t6 = t4;
        Object obj2 = t6.m(t6.g(obj, q4).f2683c, s4, 0L).f2690a;
        for (int i5 = 0; i5 < t5.o(); i5++) {
            if (t5.m(i5, s4, 0L).f2690a.equals(obj2)) {
                return i5;
            }
        }
        int b4 = t6.b(obj);
        int h2 = t6.h();
        int i6 = -1;
        int i7 = 0;
        while (i7 < h2 && i6 == -1) {
            T.T t7 = t6;
            int d4 = t7.d(b4, q4, s5, i4, z);
            if (d4 == -1) {
                break;
            }
            i6 = t5.b(t7.l(d4));
            i7++;
            t6 = t7;
            b4 = d4;
            s5 = s4;
        }
        if (i6 == -1) {
            return -1;
        }
        return t5.f(i6, q4, false).f2683c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, q0.d0, q0.z] */
    public static boolean z(T t4) {
        if (t4 != null) {
            try {
                ?? r12 = t4.f3988a;
                if (t4.f3992e) {
                    for (q0.b0 b0Var : t4.f3990c) {
                        if (b0Var != null) {
                            b0Var.a();
                        }
                    }
                } else {
                    r12.h();
                }
                if ((!t4.f3992e ? 0L : r12.e()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i4, C1353B c1353b) {
        V v = this.f3970r;
        T t4 = v.f4022k;
        if (t4 != null && t4.f3994g.f4002a.equals(c1353b)) {
            n0 n0Var = this.f3949a[i4];
            T t5 = v.f4022k;
            int i5 = n0Var.f4201d;
            boolean z = (i5 == 2 || i5 == 4) && n0Var.d(t5) == ((AbstractC0135a) n0Var.f4202e);
            boolean z4 = n0Var.f4201d == 3 && n0Var.d(t5) == ((AbstractC0135a) n0Var.f4203f);
            if (z || z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, q0.z] */
    public final void A0() {
        long j4;
        float f4;
        T t4 = this.f3970r.f4020i;
        if (t4 == null) {
            return;
        }
        long q4 = t4.f3992e ? t4.f3988a.q() : -9223372036854775807L;
        if (q4 != -9223372036854775807L) {
            if (!t4.g()) {
                this.f3970r.n(t4);
                u(false);
                C();
            }
            Q(q4, true);
            if (q4 != this.f3931H.f4155s) {
                g0 g0Var = this.f3931H;
                this.f3931H = y(g0Var.f4140b, q4, g0Var.f4141c, q4, true, 5);
            }
        } else {
            C0142h c0142h = this.n;
            boolean z = t4 != this.f3970r.f4021j;
            q0 q0Var = c0142h.f4157a;
            AbstractC0135a abstractC0135a = c0142h.f4159c;
            if (abstractC0135a == null || abstractC0135a.m() || ((z && c0142h.f4159c.f4044h != 2) || (!c0142h.f4159c.o() && (z || c0142h.f4159c.l())))) {
                c0142h.f4161e = true;
                if (c0142h.f4162f) {
                    q0Var.f();
                }
            } else {
                S s4 = c0142h.f4160d;
                s4.getClass();
                long a3 = s4.a();
                if (c0142h.f4161e) {
                    if (a3 >= q0Var.a()) {
                        c0142h.f4161e = false;
                        if (c0142h.f4162f) {
                            q0Var.f();
                        }
                    } else if (q0Var.f4234b) {
                        q0Var.c(q0Var.a());
                        q0Var.f4234b = false;
                    }
                }
                q0Var.c(a3);
                T.I e4 = s4.e();
                if (!e4.equals(q0Var.f4237e)) {
                    q0Var.d(e4);
                    c0142h.f4158b.f3962h.a(16, e4).b();
                }
            }
            long a4 = c0142h.a();
            this.f3945W = a4;
            long j5 = a4 - t4.f4001p;
            long j6 = this.f3931H.f4155s;
            if (!this.o.isEmpty() && !this.f3931H.f4140b.b()) {
                if (this.f3948Z) {
                    this.f3948Z = false;
                }
                g0 g0Var2 = this.f3931H;
                g0Var2.f4139a.b(g0Var2.f4140b.f14812a);
                int min = Math.min(this.f3947Y, this.o.size());
                if (min > 0 && this.o.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.o.size() && this.o.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f3947Y = min;
            }
            if (this.n.b()) {
                boolean z4 = !this.f3932I.f3911c;
                g0 g0Var3 = this.f3931H;
                this.f3931H = y(g0Var3.f4140b, j5, g0Var3.f4141c, j5, z4, 6);
            } else {
                g0 g0Var4 = this.f3931H;
                g0Var4.f4155s = j5;
                g0Var4.f4156t = SystemClock.elapsedRealtime();
            }
        }
        this.f3931H.f4153q = this.f3970r.f4023l.d();
        g0 g0Var5 = this.f3931H;
        g0Var5.f4154r = o(g0Var5.f4153q);
        g0 g0Var6 = this.f3931H;
        if (g0Var6.f4150l && g0Var6.f4143e == 3 && r0(g0Var6.f4139a, g0Var6.f4140b)) {
            g0 g0Var7 = this.f3931H;
            float f5 = 1.0f;
            if (g0Var7.o.f2664a == 1.0f) {
                C0139e c0139e = this.f3972t;
                long k4 = k(g0Var7.f4139a, g0Var7.f4140b.f14812a, g0Var7.f4155s);
                long j7 = this.f3931H.f4154r;
                if (c0139e.f4090c != -9223372036854775807L) {
                    long j8 = k4 - j7;
                    long j9 = c0139e.f4100m;
                    if (j9 == -9223372036854775807L) {
                        c0139e.f4100m = j8;
                        c0139e.n = 0L;
                    } else {
                        c0139e.f4100m = Math.max(j8, (long) ((j8 * 9.999871E-4f) + (j9 * 0.999f)));
                        c0139e.n = (long) ((9.999871E-4f * Math.abs(j8 - r9)) + (c0139e.n * 0.999f));
                    }
                    if (c0139e.f4099l != -9223372036854775807L) {
                        j4 = 1000;
                        if (SystemClock.elapsedRealtime() - c0139e.f4099l < 1000) {
                            f5 = c0139e.f4098k;
                        }
                    } else {
                        j4 = 1000;
                    }
                    c0139e.f4099l = SystemClock.elapsedRealtime();
                    long j10 = (c0139e.n * 3) + c0139e.f4100m;
                    if (c0139e.f4095h > j10) {
                        float M4 = W.J.M(j4);
                        f4 = 1.0E-7f;
                        long[] jArr = {j10, c0139e.f4092e, c0139e.f4095h - (((long) ((c0139e.f4098k - 1.0f) * M4)) + ((long) ((c0139e.f4096i - 1.0f) * M4)))};
                        long j11 = jArr[0];
                        for (int i4 = 1; i4 < 3; i4++) {
                            long j12 = jArr[i4];
                            if (j12 > j11) {
                                j11 = j12;
                            }
                        }
                        c0139e.f4095h = j11;
                    } else {
                        f4 = 1.0E-7f;
                        long k5 = W.J.k(k4 - ((long) (Math.max(0.0f, c0139e.f4098k - 1.0f) / 1.0E-7f)), c0139e.f4095h, j10);
                        c0139e.f4095h = k5;
                        long j13 = c0139e.f4094g;
                        if (j13 != -9223372036854775807L && k5 > j13) {
                            c0139e.f4095h = j13;
                        }
                    }
                    long j14 = k4 - c0139e.f4095h;
                    if (Math.abs(j14) < c0139e.f4088a) {
                        c0139e.f4098k = 1.0f;
                    } else {
                        c0139e.f4098k = W.J.i((f4 * j14) + 1.0f, c0139e.f4097j, c0139e.f4096i);
                    }
                    f5 = c0139e.f4098k;
                }
                if (this.n.e().f2664a != f5) {
                    T.I i5 = new T.I(f5, this.f3931H.o.f2665b);
                    this.f3962h.d(16);
                    this.n.d(i5);
                    x(this.f3931H.o, this.n.e().f2664a, false, false);
                }
            }
        }
    }

    public final boolean B() {
        T t4 = this.f3970r.f4020i;
        long j4 = t4.f3994g.f4006e;
        if (t4.f3992e) {
            return j4 == -9223372036854775807L || this.f3931H.f4155s < j4 || !q0();
        }
        return false;
    }

    public final void B0(T.T t4, C1353B c1353b, T.T t5, C1353B c1353b2, long j4, boolean z) {
        boolean r02 = r0(t4, c1353b);
        Object obj = c1353b.f14812a;
        if (!r02) {
            T.I i4 = c1353b.b() ? T.I.f2663d : this.f3931H.o;
            C0142h c0142h = this.n;
            if (c0142h.e().equals(i4)) {
                return;
            }
            this.f3962h.d(16);
            c0142h.d(i4);
            x(this.f3931H.o, i4.f2664a, false, false);
            return;
        }
        T.Q q4 = this.f3966l;
        int i5 = t4.g(obj, q4).f2683c;
        T.S s4 = this.f3965k;
        t4.n(i5, s4);
        C0103v c0103v = s4.f2699j;
        C0139e c0139e = this.f3972t;
        c0139e.getClass();
        c0139e.f4090c = W.J.M(c0103v.f2888a);
        c0139e.f4093f = W.J.M(c0103v.f2889b);
        c0139e.f4094g = W.J.M(c0103v.f2890c);
        float f4 = c0103v.f2891d;
        if (f4 == -3.4028235E38f) {
            f4 = 0.97f;
        }
        c0139e.f4097j = f4;
        float f5 = c0103v.f2892e;
        if (f5 == -3.4028235E38f) {
            f5 = 1.03f;
        }
        c0139e.f4096i = f5;
        if (f4 == 1.0f && f5 == 1.0f) {
            c0139e.f4090c = -9223372036854775807L;
        }
        c0139e.a();
        if (j4 != -9223372036854775807L) {
            c0139e.f4091d = k(t4, obj, j4);
            c0139e.a();
            return;
        }
        if (!Objects.equals(!t5.p() ? t5.m(t5.g(c1353b2.f14812a, q4).f2683c, s4, 0L).f2690a : null, s4.f2690a) || z) {
            c0139e.f4091d = -9223372036854775807L;
            c0139e.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, q0.z] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, q0.d0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, q0.d0] */
    public final void C() {
        boolean b4;
        if (z(this.f3970r.f4023l)) {
            T t4 = this.f3970r.f4023l;
            long o = o(!t4.f3992e ? 0L : t4.f3988a.e());
            T t5 = this.f3970r.f4020i;
            long j4 = r0(this.f3931H.f4139a, t4.f3994g.f4002a) ? this.f3972t.f4095h : -9223372036854775807L;
            b0.i iVar = this.v;
            T.T t6 = this.f3931H.f4139a;
            C1353B c1353b = t4.f3994g.f4002a;
            float f4 = this.n.e().f2664a;
            boolean z = this.f3931H.f4150l;
            N n = new N(iVar, t6, c1353b, o, f4, this.f3935M, j4);
            b4 = ((C0141g) this.f3959f).b(n);
            T t7 = this.f3970r.f4020i;
            if (!b4 && t7.f3992e && o < 500000 && this.f3967m > 0) {
                t7.f3988a.j(this.f3931H.f4155s);
                b4 = ((C0141g) this.f3959f).b(n);
            }
        } else {
            b4 = false;
        }
        this.f3937O = b4;
        if (b4) {
            T t8 = this.f3970r.f4023l;
            t8.getClass();
            P p2 = new P();
            p2.f3982a = this.f3945W - t8.f4001p;
            float f5 = this.n.e().f2664a;
            AbstractC0124a.h(f5 > 0.0f || f5 == -3.4028235E38f);
            p2.f3983b = f5;
            long j5 = this.f3936N;
            AbstractC0124a.h(j5 >= 0 || j5 == -9223372036854775807L);
            p2.f3984c = j5;
            Q q4 = new Q(p2);
            AbstractC0124a.t(t8.f4000m == null);
            t8.f3988a.v(q4);
        }
        v0();
    }

    public final void C0(boolean z, boolean z4) {
        long j4;
        this.f3935M = z;
        if (!z || z4) {
            j4 = -9223372036854775807L;
        } else {
            this.f3968p.getClass();
            j4 = SystemClock.elapsedRealtime();
        }
        this.f3936N = j4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, q0.d0, q0.z] */
    public final void D() {
        V v = this.f3970r;
        v.k();
        T t4 = v.f4024m;
        if (t4 != null) {
            ?? r12 = t4.f3988a;
            if ((!t4.f3991d || t4.f3992e) && !r12.l()) {
                T.T t5 = this.f3931H.f4139a;
                if (t4.f3992e) {
                    r12.u();
                }
                Iterator it = ((C0141g) this.f3959f).f4136p.values().iterator();
                while (it.hasNext()) {
                    if (((C0140f) it.next()).f4107b) {
                        return;
                    }
                }
                if (!t4.f3991d) {
                    long j4 = t4.f3994g.f4003b;
                    t4.f3991d = true;
                    r12.f(this, j4);
                    return;
                }
                P p2 = new P();
                p2.f3982a = this.f3945W - t4.f4001p;
                float f4 = this.n.e().f2664a;
                AbstractC0124a.h(f4 > 0.0f || f4 == -3.4028235E38f);
                p2.f3983b = f4;
                long j5 = this.f3936N;
                AbstractC0124a.h(j5 >= 0 || j5 == -9223372036854775807L);
                p2.f3984c = j5;
                Q q4 = new Q(p2);
                AbstractC0124a.t(t4.f4000m == null);
                r12.v(q4);
            }
        }
    }

    public final void E() {
        C0134J c0134j = this.f3932I;
        g0 g0Var = this.f3931H;
        boolean z = c0134j.f3910b | (((g0) c0134j.f3913e) != g0Var);
        c0134j.f3910b = z;
        c0134j.f3913e = g0Var;
        if (z) {
            C0130F c0130f = this.f3969q.f4248a;
            c0130f.f3889k.c(new R1.e(c0130f, 11, c0134j));
            this.f3932I = new C0134J(this.f3931H);
        }
    }

    public final void F(int i4) {
        n0 n0Var = this.f3949a[i4];
        try {
            T t4 = this.f3970r.f4020i;
            t4.getClass();
            AbstractC0135a d4 = n0Var.d(t4);
            d4.getClass();
            q0.b0 b0Var = d4.f4045i;
            b0Var.getClass();
            b0Var.a();
        } catch (IOException | RuntimeException e4) {
            int i5 = ((AbstractC0135a) n0Var.f4202e).f4038b;
            if (i5 != 3 && i5 != 5) {
                throw e4;
            }
            t0.x xVar = this.f3970r.f4020i.o;
            AbstractC0108a.f("ExoPlayerImplInternal", "Disabling track due to error: " + C0097o.c(xVar.f15386c[i4].l()), e4);
            t0.x xVar2 = new t0.x((m0[]) xVar.f15385b.clone(), (t0.t[]) xVar.f15386c.clone(), xVar.f15387d, xVar.f15388e);
            xVar2.f15385b[i4] = null;
            xVar2.f15386c[i4] = null;
            g(i4);
            T t5 = this.f3970r.f4020i;
            t5.a(xVar2, this.f3931H.f4155s, false, new boolean[t5.f3997j.length]);
        }
    }

    public final void G(int i4, boolean z) {
        boolean[] zArr = this.f3953c;
        if (zArr[i4] != z) {
            zArr[i4] = z;
            this.f3975x.c(new U.f(this, i4, z));
        }
    }

    public final void H() {
        v(this.f3971s.b(), true);
    }

    public final void I() {
        this.f3932I.c(1);
        throw null;
    }

    public final void J() {
        this.f3932I.c(1);
        O(false, false, false, true);
        C0141g c0141g = (C0141g) this.f3959f;
        ConcurrentHashMap concurrentHashMap = c0141g.f4136p;
        long id = Thread.currentThread().getId();
        long j4 = c0141g.f4137q;
        AbstractC0124a.s("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j4 == -1 || j4 == id);
        c0141g.f4137q = id;
        b0.i iVar = this.v;
        C0140f c0140f = (C0140f) concurrentHashMap.get(iVar);
        if (c0140f == null) {
            C0140f c0140f2 = new C0140f();
            c0140f2.f4106a = 1;
            concurrentHashMap.put(iVar, c0140f2);
        } else {
            c0140f.f4106a++;
        }
        C0140f c0140f3 = (C0140f) concurrentHashMap.get(iVar);
        c0140f3.getClass();
        Integer num = (Integer) c0141g.o.get(iVar.f5319a);
        int intValue = (num == null || num.intValue() == -1) ? c0141g.f4134l : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        c0140f3.f4108c = intValue;
        c0140f3.f4107b = false;
        m0(this.f3931H.f4139a.p() ? 4 : 2);
        g0 g0Var = this.f3931H;
        boolean z = g0Var.f4150l;
        z0(this.z.d(g0Var.f4143e, z), g0Var.n, g0Var.f4151m, z);
        u0.g gVar = (u0.g) this.f3961g;
        gVar.getClass();
        f0 f0Var = this.f3971s;
        ArrayList arrayList = f0Var.f4111b;
        AbstractC0124a.t(!f0Var.f4120k);
        f0Var.f4121l = gVar;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            e0 e0Var = (e0) arrayList.get(i4);
            f0Var.e(e0Var);
            f0Var.f4116g.add(e0Var);
        }
        f0Var.f4120k = true;
        this.f3962h.e(2);
    }

    public final void K(C0112e c0112e) {
        E1.N n = this.f3963i;
        W.F f4 = this.f3962h;
        try {
            O(true, false, true, false);
            L();
            O o = this.f3959f;
            b0.i iVar = this.v;
            C0141g c0141g = (C0141g) o;
            ConcurrentHashMap concurrentHashMap = c0141g.f4136p;
            C0140f c0140f = (C0140f) concurrentHashMap.get(iVar);
            if (c0140f != null) {
                int i4 = c0140f.f4106a - 1;
                c0140f.f4106a = i4;
                if (i4 == 0) {
                    concurrentHashMap.remove(iVar);
                    c0141g.c();
                }
            }
            if (c0141g.f4136p.isEmpty()) {
                c0141g.f4137q = -1L;
            }
            U.e eVar = this.z;
            eVar.f3027c = null;
            eVar.a();
            eVar.c(0);
            this.f3955d.a();
            m0(1);
        } finally {
            f4.f3257a.removeCallbacksAndMessages(null);
            n.c();
            c0112e.c();
        }
    }

    public final void L() {
        for (int i4 = 0; i4 < this.f3949a.length; i4++) {
            AbstractC0135a abstractC0135a = this.f3951b[i4];
            synchronized (abstractC0135a.f4037a) {
                abstractC0135a.f4052r = null;
            }
            n0 n0Var = this.f3949a[i4];
            AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4202e;
            AbstractC0124a.t(abstractC0135a2.f4044h == 0);
            abstractC0135a2.s();
            n0Var.f4198a = false;
            AbstractC0135a abstractC0135a3 = (AbstractC0135a) n0Var.f4203f;
            if (abstractC0135a3 != null) {
                AbstractC0124a.t(abstractC0135a3.f4044h == 0);
                abstractC0135a3.s();
                n0Var.f4199b = false;
            }
        }
    }

    public final void M(int i4, int i5, q0.e0 e0Var) {
        this.f3932I.c(1);
        f0 f0Var = this.f3971s;
        f0Var.getClass();
        AbstractC0124a.h(i4 >= 0 && i4 <= i5 && i5 <= f0Var.f4111b.size());
        f0Var.f4119j = e0Var;
        f0Var.g(i4, i5);
        v(f0Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        int i4;
        int i5;
        float f4 = this.n.e().f2664a;
        V v = this.f3970r;
        T t4 = v.f4020i;
        T t5 = v.f4021j;
        t0.x xVar = null;
        T t6 = t4;
        boolean z = true;
        while (t6 != null && t6.f3992e) {
            g0 g0Var = this.f3931H;
            t0.x j4 = t6.j(f4, g0Var.f4139a, g0Var.f4150l);
            t0.x xVar2 = t6 == this.f3970r.f4020i ? j4 : xVar;
            t0.x xVar3 = t6.o;
            t0.t[] tVarArr = j4.f15386c;
            if (xVar3 != null && xVar3.f15386c.length == tVarArr.length) {
                for (int i6 = 0; i6 < tVarArr.length; i6++) {
                    if (j4.a(xVar3, i6)) {
                    }
                }
                if (t6 == t5) {
                    z = false;
                }
                t6 = t6.f4000m;
                xVar = xVar2;
            }
            if (z) {
                V v4 = this.f3970r;
                T t7 = v4.f4020i;
                boolean z4 = (v4.n(t7) & 1) != 0;
                boolean[] zArr = new boolean[this.f3949a.length];
                xVar2.getClass();
                long a3 = t7.a(xVar2, this.f3931H.f4155s, z4, zArr);
                g0 g0Var2 = this.f3931H;
                boolean z5 = (g0Var2.f4143e == 4 || a3 == g0Var2.f4155s) ? false : true;
                g0 g0Var3 = this.f3931H;
                i4 = 4;
                this.f3931H = y(g0Var3.f4140b, a3, g0Var3.f4141c, g0Var3.f4142d, z5, 5);
                if (z5) {
                    Q(a3, true);
                }
                f();
                boolean[] zArr2 = new boolean[this.f3949a.length];
                int i7 = 0;
                while (true) {
                    n0[] n0VarArr = this.f3949a;
                    if (i7 >= n0VarArr.length) {
                        break;
                    }
                    int c4 = n0VarArr[i7].c();
                    zArr2[i7] = this.f3949a[i7].g();
                    n0 n0Var = this.f3949a[i7];
                    q0.b0 b0Var = t7.f3990c[i7];
                    C0142h c0142h = this.n;
                    long j5 = this.f3945W;
                    boolean z6 = zArr[i7];
                    AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4202e;
                    if (n0.h(abstractC0135a)) {
                        if (b0Var != abstractC0135a.f4045i) {
                            n0Var.a(abstractC0135a, c0142h);
                        } else if (z6) {
                            abstractC0135a.B(j5, false, true);
                        }
                    }
                    AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4203f;
                    if (abstractC0135a2 != null && n0.h(abstractC0135a2)) {
                        if (b0Var != abstractC0135a2.f4045i) {
                            n0Var.a(abstractC0135a2, c0142h);
                        } else if (z6) {
                            abstractC0135a2.B(j5, false, true);
                        }
                    }
                    if (c4 - this.f3949a[i7].c() > 0) {
                        G(i7, false);
                    }
                    this.f3943U -= c4 - this.f3949a[i7].c();
                    i7++;
                }
                j(zArr2, this.f3945W);
                t7.f3995h = true;
            } else {
                i4 = 4;
                this.f3970r.n(t6);
                if (t6.f3992e) {
                    long max = Math.max(t6.f3994g.f4003b, this.f3945W - t6.f4001p);
                    if (this.f3976y && d() && this.f3970r.f4022k == t6) {
                        f();
                    }
                    i5 = 4;
                    t6.a(j4, max, false, new boolean[t6.f3997j.length]);
                    u(true);
                    if (this.f3931H.f4143e == i5) {
                        C();
                        A0();
                        this.f3962h.e(2);
                        return;
                    }
                    return;
                }
            }
            i5 = i4;
            u(true);
            if (this.f3931H.f4143e == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(boolean z, boolean z4, boolean z5, boolean z6) {
        long j4;
        long j5;
        long j6;
        boolean z7;
        T.T t4;
        T.T t5;
        C1353B c1353b;
        List list;
        this.f3962h.d(2);
        this.f3928E = false;
        if (this.f3929F != null) {
            this.f3932I.c(1);
            this.f3929F = null;
        }
        this.f3950a0 = null;
        C0(false, true);
        C0142h c0142h = this.n;
        c0142h.f4162f = false;
        q0 q0Var = c0142h.f4157a;
        if (q0Var.f4234b) {
            q0Var.c(q0Var.a());
            q0Var.f4234b = false;
        }
        this.f3945W = 1000000000000L;
        for (int i4 = 0; i4 < this.f3949a.length; i4++) {
            try {
                g(i4);
            } catch (C0146l e4) {
                e = e4;
                AbstractC0108a.f("ExoPlayerImplInternal", "Disable failed.", e);
                if (z) {
                }
                this.f3943U = 0;
                g0 g0Var = this.f3931H;
                C1353B c1353b2 = g0Var.f4140b;
                long j7 = g0Var.f4155s;
                if (!this.f3931H.f4140b.b()) {
                }
                j4 = this.f3931H.f4141c;
                if (z4) {
                }
                this.f3970r.b();
                this.f3937O = false;
                t4 = this.f3931H.f4139a;
                if (z5) {
                }
                t5 = t4;
                c1353b = c1353b2;
                g0 g0Var2 = this.f3931H;
                int i5 = g0Var2.f4143e;
                if (z6) {
                }
                q0.j0 j0Var = z7 ? q0.j0.f15033d : g0Var2.f4146h;
                t0.x xVar = z7 ? this.f3957e : g0Var2.f4147i;
                if (z7) {
                }
                this.f3931H = new g0(t5, c1353b, j6, j5, i5, r14, false, j0Var, xVar, list, c1353b, g0Var2.f4150l, g0Var2.f4151m, g0Var2.n, g0Var2.o, j5, 0L, j5, 0L, false);
                if (z5) {
                }
            } catch (RuntimeException e5) {
                e = e5;
                AbstractC0108a.f("ExoPlayerImplInternal", "Disable failed.", e);
                if (z) {
                }
                this.f3943U = 0;
                g0 g0Var3 = this.f3931H;
                C1353B c1353b22 = g0Var3.f4140b;
                long j72 = g0Var3.f4155s;
                if (!this.f3931H.f4140b.b()) {
                }
                j4 = this.f3931H.f4141c;
                if (z4) {
                }
                this.f3970r.b();
                this.f3937O = false;
                t4 = this.f3931H.f4139a;
                if (z5) {
                }
                t5 = t4;
                c1353b = c1353b22;
                g0 g0Var22 = this.f3931H;
                int i52 = g0Var22.f4143e;
                if (z6) {
                }
                q0.j0 j0Var2 = z7 ? q0.j0.f15033d : g0Var22.f4146h;
                t0.x xVar2 = z7 ? this.f3957e : g0Var22.f4147i;
                if (z7) {
                }
                this.f3931H = new g0(t5, c1353b, j6, j5, i52, r14, false, j0Var2, xVar2, list, c1353b, g0Var22.f4150l, g0Var22.f4151m, g0Var22.n, g0Var22.o, j5, 0L, j5, 0L, false);
                if (z5) {
                }
            }
        }
        this.f3956d0 = -9223372036854775807L;
        if (z) {
            for (n0 n0Var : this.f3949a) {
                try {
                    n0Var.k();
                } catch (RuntimeException e6) {
                    AbstractC0108a.f("ExoPlayerImplInternal", "Reset failed.", e6);
                }
            }
        }
        this.f3943U = 0;
        g0 g0Var32 = this.f3931H;
        C1353B c1353b222 = g0Var32.f4140b;
        long j722 = g0Var32.f4155s;
        if (!this.f3931H.f4140b.b()) {
            g0 g0Var4 = this.f3931H;
            T.Q q4 = this.f3966l;
            C1353B c1353b3 = g0Var4.f4140b;
            T.T t6 = g0Var4.f4139a;
            if (!t6.p() && !t6.g(c1353b3.f14812a, q4).f2686f) {
                j4 = this.f3931H.f4155s;
                if (z4) {
                    j5 = j722;
                    j6 = j4;
                    z7 = false;
                } else {
                    this.f3944V = null;
                    Pair n = n(this.f3931H.f4139a);
                    c1353b222 = (C1353B) n.first;
                    long longValue = ((Long) n.second).longValue();
                    z7 = c1353b222.equals(this.f3931H.f4140b) ? false : true;
                    j5 = longValue;
                    j6 = -9223372036854775807L;
                }
                this.f3970r.b();
                this.f3937O = false;
                t4 = this.f3931H.f4139a;
                if (z5 || !(t4 instanceof l0)) {
                    t5 = t4;
                } else {
                    l0 l0Var = (l0) t4;
                    q0.e0 e0Var = this.f3971s.f4119j;
                    T.T[] tArr = l0Var.f4189h;
                    T.T[] tArr2 = new T.T[tArr.length];
                    for (int i6 = 0; i6 < tArr.length; i6++) {
                        tArr2[i6] = new k0(tArr[i6]);
                    }
                    t5 = new l0(tArr2, l0Var.f4190i, e0Var);
                    if (c1353b222.f14813b != -1) {
                        t5.g(c1353b222.f14812a, this.f3966l);
                        int i7 = this.f3966l.f2683c;
                        T.S s4 = this.f3965k;
                        t5.m(i7, s4, 0L);
                        if (s4.a()) {
                            c1353b = new C1353B(c1353b222.f14815d, c1353b222.f14812a);
                            g0 g0Var222 = this.f3931H;
                            int i522 = g0Var222.f4143e;
                            C0146l c0146l = z6 ? null : g0Var222.f4144f;
                            q0.j0 j0Var22 = z7 ? q0.j0.f15033d : g0Var222.f4146h;
                            t0.x xVar22 = z7 ? this.f3957e : g0Var222.f4147i;
                            if (z7) {
                                v2.G g4 = v2.I.f15571b;
                                list = v2.a0.f15605e;
                            } else {
                                list = g0Var222.f4148j;
                            }
                            this.f3931H = new g0(t5, c1353b, j6, j5, i522, c0146l, false, j0Var22, xVar22, list, c1353b, g0Var222.f4150l, g0Var222.f4151m, g0Var222.n, g0Var222.o, j5, 0L, j5, 0L, false);
                            if (z5) {
                                V v = this.f3970r;
                                if (!v.f4026q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i8 = 0; i8 < v.f4026q.size(); i8++) {
                                        ((T) v.f4026q.get(i8)).i();
                                    }
                                    v.f4026q = arrayList;
                                    v.f4024m = null;
                                    v.k();
                                }
                                f0 f0Var = this.f3971s;
                                HashMap hashMap = f0Var.f4115f;
                                for (d0 d0Var : hashMap.values()) {
                                    try {
                                        d0Var.f4085a.s(d0Var.f4086b);
                                    } catch (RuntimeException e7) {
                                        AbstractC0108a.f("MediaSourceList", "Failed to release child source.", e7);
                                    }
                                    AbstractC1359a abstractC1359a = d0Var.f4085a;
                                    c0 c0Var = d0Var.f4087c;
                                    abstractC1359a.v(c0Var);
                                    d0Var.f4085a.u(c0Var);
                                }
                                hashMap.clear();
                                f0Var.f4116g.clear();
                                f0Var.f4120k = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                c1353b = c1353b222;
                g0 g0Var2222 = this.f3931H;
                int i5222 = g0Var2222.f4143e;
                if (z6) {
                }
                q0.j0 j0Var222 = z7 ? q0.j0.f15033d : g0Var2222.f4146h;
                t0.x xVar222 = z7 ? this.f3957e : g0Var2222.f4147i;
                if (z7) {
                }
                this.f3931H = new g0(t5, c1353b, j6, j5, i5222, c0146l, false, j0Var222, xVar222, list, c1353b, g0Var2222.f4150l, g0Var2222.f4151m, g0Var2222.n, g0Var2222.o, j5, 0L, j5, 0L, false);
                if (z5) {
                }
            }
        }
        j4 = this.f3931H.f4141c;
        if (z4) {
        }
        this.f3970r.b();
        this.f3937O = false;
        t4 = this.f3931H.f4139a;
        if (z5) {
        }
        t5 = t4;
        c1353b = c1353b222;
        g0 g0Var22222 = this.f3931H;
        int i52222 = g0Var22222.f4143e;
        if (z6) {
        }
        q0.j0 j0Var2222 = z7 ? q0.j0.f15033d : g0Var22222.f4146h;
        t0.x xVar2222 = z7 ? this.f3957e : g0Var22222.f4147i;
        if (z7) {
        }
        this.f3931H = new g0(t5, c1353b, j6, j5, i52222, c0146l, false, j0Var2222, xVar2222, list, c1353b, g0Var22222.f4150l, g0Var22222.f4151m, g0Var22222.n, g0Var22222.o, j5, 0L, j5, 0L, false);
        if (z5) {
        }
    }

    public final void P() {
        T t4 = this.f3970r.f4020i;
        this.L = t4 != null && t4.f3994g.f4010i && this.f3934K;
    }

    public final void Q(long j4, boolean z) {
        T t4 = this.f3970r.f4020i;
        long j5 = j4 + (t4 == null ? 1000000000000L : t4.f4001p);
        this.f3945W = j5;
        this.n.f4157a.c(j5);
        for (n0 n0Var : this.f3949a) {
            long j6 = this.f3945W;
            AbstractC0135a d4 = n0Var.d(t4);
            if (d4 != null) {
                d4.B(j6, false, z);
            }
        }
        for (T t5 = r0.f4020i; t5 != null; t5 = t5.f4000m) {
            for (t0.t tVar : t5.o.f15386c) {
                if (tVar != null) {
                    tVar.r();
                }
            }
        }
    }

    public final void R(T.T t4, T.T t5) {
        if (t4.p() && t5.p()) {
            return;
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC0005f.x(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j4) {
        boolean z = this.f3927D;
        long j5 = f3923g0;
        if (z) {
            this.f3926C.getClass();
            r2 = this.f3931H.f4143e != 3 ? j5 : 1000L;
            for (n0 n0Var : this.f3949a) {
                long j6 = this.f3945W;
                long j7 = this.f3946X;
                AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4203f;
                AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4202e;
                long i4 = n0.h(abstractC0135a2) ? abstractC0135a2.i(j6, j7) : Long.MAX_VALUE;
                if (abstractC0135a != null && abstractC0135a.f4044h != 0) {
                    i4 = Math.min(i4, abstractC0135a.i(j6, j7));
                }
                r2 = Math.min(r2, W.J.Z(i4));
            }
            if (this.f3931H.m()) {
                T t4 = this.f3970r.f4020i;
                if ((t4 != null ? t4.f4000m : null) != null) {
                    if ((W.J.M(r2) * this.f3931H.o.f2664a) + this.f3945W >= r1.e()) {
                        r2 = Math.min(r2, j5);
                    }
                }
            }
        } else if (this.f3931H.f4143e != 3 || q0()) {
            r2 = j5;
        }
        this.f3962h.f3257a.sendEmptyMessageAtTime(2, j4 + r2);
    }

    public final void V(boolean z) {
        C1353B c1353b = this.f3970r.f4020i.f3994g.f4002a;
        long X4 = X(c1353b, this.f3931H.f4155s, true, false);
        if (X4 != this.f3931H.f4155s) {
            g0 g0Var = this.f3931H;
            this.f3931H = y(c1353b, X4, g0Var.f4141c, g0Var.f4142d, z, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, q0.z] */
    public final void W(L l4) {
        long longValue;
        long j4;
        C1353B p2;
        long j5;
        boolean z;
        boolean z4;
        C1353B c1353b;
        long j6;
        long j7;
        long j8;
        boolean z5;
        long j9;
        boolean z6;
        long X4;
        g0 g0Var;
        C1353B c1353b2;
        T.T t4;
        long j10;
        C1353B c1353b3;
        long j11;
        long j12;
        g0 g0Var2;
        int i4;
        int i5;
        long j13;
        M m4 = this;
        if (m4.f3928E) {
            if (m4.f3929F != null) {
                m4.f3930G++;
                m4.f3932I.c(1);
            }
            m4.f3929F = l4;
            return;
        }
        m4.f3932I.c(1);
        Pair S4 = S(m4.f3931H.f4139a, l4, true, m4.f3938P, m4.f3939Q, m4.f3965k, m4.f3966l);
        if (S4 == null) {
            Pair n = m4.n(m4.f3931H.f4139a);
            p2 = (C1353B) n.first;
            longValue = ((Long) n.second).longValue();
            z = !m4.f3931H.f4139a.p();
            j5 = 0;
            j4 = -9223372036854775807L;
        } else {
            Object obj = S4.first;
            longValue = ((Long) S4.second).longValue();
            j4 = l4.f3922c == -9223372036854775807L ? -9223372036854775807L : longValue;
            p2 = m4.f3970r.p(m4.f3931H.f4139a, obj, longValue);
            if (p2.b()) {
                m4.f3931H.f4139a.g(p2.f14812a, m4.f3966l);
                if (m4.f3966l.e(p2.f14813b) == p2.f14814c) {
                    m4.f3966l.f2687g.getClass();
                }
                m4.f3966l.f2687g.a(p2.f14813b).getClass();
                j4 = Math.max(j4, 0L);
                longValue = 0;
                j5 = 0;
            } else {
                j5 = 0;
                if (l4.f3922c != -9223372036854775807L) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (m4.f3931H.f4139a.p()) {
                    m4.f3944V = l4;
                } else if (S4 == null) {
                    if (m4.f3931H.f4143e != 1) {
                        m4.m0(4);
                    }
                    m4.O(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (p2.equals(m4.f3931H.f4140b)) {
                                            T t5 = m4.f3970r.f4020i;
                                            if (t5 == null || !t5.f3992e || longValue == j5) {
                                                j8 = longValue;
                                            } else {
                                                ?? r02 = t5.f3988a;
                                                long j14 = m4.f3965k.f2702m;
                                                if (m4.f3927D && j14 != -9223372036854775807L) {
                                                    m4.f3926C.getClass();
                                                }
                                                j8 = r02.b(longValue, m4.f3925B);
                                            }
                                            if (W.J.Z(j8) != W.J.Z(m4.f3931H.f4155s) || ((i4 = (g0Var2 = m4.f3931H).f4143e) != 2 && i4 != 3)) {
                                                z4 = z;
                                                c1353b = p2;
                                            }
                                            j12 = g0Var2.f4155s;
                                            z4 = z;
                                            c1353b3 = p2;
                                            i5 = 2;
                                            j13 = j12;
                                            j11 = j4;
                                            m4.f3931H = m4.y(c1353b3, j12, j11, j13, z4, i5);
                                        }
                                        z4 = z;
                                        c1353b = p2;
                                        j8 = longValue;
                                        m4.B0(t4, c1353b2, t4, g0Var.f4140b, j10, true);
                                        c1353b3 = c1353b2;
                                        j11 = j10;
                                        j12 = X4;
                                        i5 = 2;
                                        j13 = j12;
                                        m4 = this;
                                        m4.f3931H = m4.y(c1353b3, j12, j11, j13, z4, i5);
                                    } catch (Throwable th) {
                                        th = th;
                                        c1353b = c1353b2;
                                        j6 = j10;
                                        j7 = X4;
                                        m4.f3931H = m4.y(c1353b, j7, j6, j7, z4, 2);
                                        throw th;
                                    }
                                    t4 = g0Var.f4139a;
                                    j10 = j4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c1353b = c1353b2;
                                    j6 = j4;
                                    j7 = X4;
                                    m4.f3931H = m4.y(c1353b, j7, j6, j7, z4, 2);
                                    throw th;
                                }
                                g0Var = m4.f3931H;
                                c1353b2 = c1353b;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            V v = m4.f3970r;
                            X4 = m4.X(c1353b, j9, v.f4020i != v.f4021j ? z5 : false, z6);
                            z4 |= longValue != X4 ? z5 : false;
                        } catch (Throwable th4) {
                            th = th4;
                            j6 = j4;
                            j7 = longValue;
                            m4.f3931H = m4.y(c1353b, j7, j6, j7, z4, 2);
                            throw th;
                        }
                        if (m4.f3927D) {
                            try {
                                for (n0 n0Var : m4.f3949a) {
                                    if (n0Var.g() && ((AbstractC0135a) n0Var.f4202e).f4038b == 2) {
                                        z5 = true;
                                        m4.f3928E = true;
                                        break;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                j7 = longValue;
                                j6 = j4;
                                m4.f3931H = m4.y(c1353b, j7, j6, j7, z4, 2);
                                throw th;
                            }
                        }
                        z5 = true;
                        if (m4.f3931H.f4143e == 4) {
                            j9 = j8;
                            z6 = z5;
                        } else {
                            j9 = j8;
                            z6 = false;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                z4 = z;
                c1353b3 = p2;
                j12 = longValue;
                j11 = j4;
                i5 = 2;
                j13 = j12;
                m4 = this;
                m4.f3931H = m4.y(c1353b3, j12, j11, j13, z4, i5);
            } catch (Throwable th7) {
                th = th7;
                z4 = z;
                c1353b = p2;
            }
        } catch (Throwable th8) {
            th = th8;
            z4 = z;
            c1353b = p2;
        }
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, q0.z] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, q0.z] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Object, q0.z] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, q0.z] */
    public final long X(C1353B c1353b, long j4, boolean z, boolean z4) {
        V v;
        u0();
        boolean z5 = true;
        C0(false, true);
        if (z4 || this.f3931H.f4143e == 3) {
            m0(2);
        }
        T t4 = this.f3970r.f4020i;
        T t5 = t4;
        while (t5 != null && !c1353b.equals(t5.f3994g.f4002a)) {
            t5 = t5.f4000m;
        }
        if (z || t4 != t5 || (t5 != null && t5.f4001p + j4 < 0)) {
            for (int i4 = 0; i4 < this.f3949a.length; i4++) {
                g(i4);
            }
            this.f3956d0 = -9223372036854775807L;
            if (t5 != null) {
                while (true) {
                    v = this.f3970r;
                    if (v.f4020i == t5) {
                        break;
                    }
                    v.a();
                }
                v.n(t5);
                t5.f4001p = 1000000000000L;
                j(new boolean[this.f3949a.length], this.f3970r.f4021j.e());
                t5.f3995h = true;
            }
        }
        f();
        if (t5 != null) {
            this.f3970r.n(t5);
            if (!t5.f3992e) {
                t5.f3994g = t5.f3994g.b(j4);
            } else if (t5.f3993f) {
                if (this.f3927D) {
                    this.f3926C.getClass();
                    if (!this.f3931H.f4139a.p() && t5.f3994g.f4002a.equals(this.f3931H.f4140b)) {
                        long j5 = t5.f4001p + j4;
                        boolean z6 = true;
                        for (n0 n0Var : this.f3949a) {
                            if (n0Var.g()) {
                                AbstractC0135a d4 = n0Var.d(t5);
                                z6 &= d4 != null && d4.F(j5);
                            }
                        }
                        if (z6) {
                            ?? r10 = t5.f3988a;
                            long j6 = this.f3931H.f4155s;
                            p0 p0Var = p0.f4228c;
                            if (r10.b(j6, p0Var) == t5.f3988a.b(j4, p0Var)) {
                                z5 = false;
                            }
                        }
                    }
                }
                j4 = t5.f3988a.i(j4);
                t5.f3988a.j(j4 - this.f3967m);
            }
            Q(j4, z5);
            C();
        } else {
            this.f3970r.b();
            Q(j4, true);
        }
        u(false);
        this.f3962h.e(2);
        return j4;
    }

    public final void Y(j0 j0Var) {
        j0Var.getClass();
        W.F f4 = this.f3962h;
        if (j0Var.f4172e != this.f3964j) {
            f4.a(15, j0Var).b();
            return;
        }
        synchronized (j0Var) {
        }
        try {
            j0Var.f4168a.c(j0Var.f4170c, j0Var.f4171d);
            j0Var.a(true);
            int i4 = this.f3931H.f4143e;
            if (i4 == 3 || i4 == 2) {
                f4.e(2);
            }
        } catch (Throwable th) {
            j0Var.a(true);
            throw th;
        }
    }

    public final void Z(j0 j0Var) {
        Looper looper = j0Var.f4172e;
        if (looper.getThread().isAlive()) {
            this.f3968p.a(looper, null).c(new R1.n(this, j0Var));
        } else {
            AbstractC0108a.s("TAG", "Trying to send message on a dead thread.");
            j0Var.a(false);
        }
    }

    @Override // w0.t
    public final void a(long j4, long j5, C0097o c0097o, MediaFormat mediaFormat) {
        if (this.f3928E) {
            W.F f4 = this.f3962h;
            f4.getClass();
            W.E b4 = W.F.b();
            b4.f3255a = f4.f3257a.obtainMessage(37);
            b4.b();
        }
    }

    public final void a0(C0086d c0086d, boolean z) {
        t0.r rVar = (t0.r) this.f3955d;
        if (!rVar.f15372i.equals(c0086d)) {
            rVar.f15372i = c0086d;
            rVar.e();
        }
        if (!z) {
            c0086d = null;
        }
        U.e eVar = this.z;
        if (!Objects.equals(eVar.f3028d, c0086d)) {
            eVar.f3028d = c0086d;
            int i4 = c0086d == null ? 0 : 1;
            eVar.f3030f = i4;
            AbstractC0124a.g("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i4 == 1 || i4 == 0);
        }
        g0 g0Var = this.f3931H;
        boolean z4 = g0Var.f4150l;
        z0(eVar.d(g0Var.f4143e, z4), g0Var.n, g0Var.f4151m, z4);
    }

    public final void b(C0133I c0133i, int i4) {
        this.f3932I.c(1);
        f0 f0Var = this.f3971s;
        if (i4 == -1) {
            i4 = f0Var.f4111b.size();
        }
        v(f0Var.a(i4, c0133i.f3905a, c0133i.f3906b), false);
    }

    public final void b0(boolean z, C0112e c0112e) {
        if (this.f3940R != z) {
            this.f3940R = z;
            if (!z) {
                for (n0 n0Var : this.f3949a) {
                    n0Var.k();
                }
            }
        }
        if (c0112e != null) {
            c0112e.c();
        }
    }

    public final void c() {
        for (n0 n0Var : this.f3949a) {
            o0 o0Var = this.f3927D ? this.f3926C : null;
            ((AbstractC0135a) n0Var.f4202e).c(18, o0Var);
            AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4203f;
            if (abstractC0135a != null) {
                abstractC0135a.c(18, o0Var);
            }
        }
    }

    public final void c0(C0133I c0133i) {
        this.f3932I.c(1);
        int i4 = c0133i.f3907c;
        q0.e0 e0Var = c0133i.f3906b;
        ArrayList arrayList = c0133i.f3905a;
        if (i4 != -1) {
            this.f3944V = new L(new l0(arrayList, e0Var), c0133i.f3907c, c0133i.f3908d);
        }
        f0 f0Var = this.f3971s;
        ArrayList arrayList2 = f0Var.f4111b;
        f0Var.g(0, arrayList2.size());
        v(f0Var.a(arrayList2.size(), arrayList, e0Var), false);
    }

    public final boolean d() {
        if (!this.f3976y) {
            return false;
        }
        for (n0 n0Var : this.f3949a) {
            if (n0Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z) {
        this.f3934K = z;
        P();
        if (this.L) {
            V v = this.f3970r;
            if (v.f4021j != v.f4020i) {
                V(true);
                u(false);
            }
        }
    }

    public final void e() {
        N();
        V(true);
    }

    public final void e0(T.I i4) {
        this.f3962h.d(16);
        C0142h c0142h = this.n;
        c0142h.d(i4);
        T.I e4 = c0142h.e();
        x(e4, e4.f2664a, true, true);
    }

    public final void f() {
        AbstractC0135a abstractC0135a;
        if (this.f3976y && d()) {
            for (n0 n0Var : this.f3949a) {
                int c4 = n0Var.c();
                if (n0Var.f()) {
                    int i4 = n0Var.f4201d;
                    boolean z = i4 == 4 || i4 == 2;
                    int i5 = i4 != 4 ? 0 : 1;
                    if (z) {
                        abstractC0135a = (AbstractC0135a) n0Var.f4202e;
                    } else {
                        abstractC0135a = (AbstractC0135a) n0Var.f4203f;
                        abstractC0135a.getClass();
                    }
                    n0Var.a(abstractC0135a, this.n);
                    n0Var.i(z);
                    n0Var.f4201d = i5;
                }
                this.f3943U -= c4 - n0Var.c();
            }
            this.f3956d0 = -9223372036854775807L;
        }
    }

    public final void f0(C0150p c0150p) {
        this.f3954c0 = c0150p;
        T.T t4 = this.f3931H.f4139a;
        V v = this.f3970r;
        v.getClass();
        c0150p.getClass();
        if (v.f4026q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < v.f4026q.size(); i4++) {
            ((T) v.f4026q.get(i4)).i();
        }
        v.f4026q = arrayList;
        v.f4024m = null;
        v.k();
    }

    public final void g(int i4) {
        n0[] n0VarArr = this.f3949a;
        int c4 = n0VarArr[i4].c();
        n0 n0Var = n0VarArr[i4];
        AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4202e;
        C0142h c0142h = this.n;
        n0Var.a(abstractC0135a, c0142h);
        AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4203f;
        if (abstractC0135a2 != null) {
            boolean z = (abstractC0135a2.f4044h == 0 || n0Var.f4201d == 3) ? false : true;
            n0Var.a(abstractC0135a2, c0142h);
            n0Var.i(false);
            if (z) {
                AbstractC0135a abstractC0135a3 = (AbstractC0135a) n0Var.f4202e;
                abstractC0135a2.getClass();
                abstractC0135a2.c(17, abstractC0135a3);
            }
        }
        n0Var.f4201d = 0;
        G(i4, false);
        this.f3943U -= c4;
    }

    public final void g0(int i4) {
        this.f3938P = i4;
        T.T t4 = this.f3931H.f4139a;
        V v = this.f3970r;
        v.f4018g = i4;
        int r4 = v.r(t4);
        if ((r4 & 1) != 0) {
            V(true);
        } else if ((r4 & 2) != 0) {
            f();
        }
        u(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0245, code lost:
    
        if (r6 >= r4.f4108c) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02db  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, q0.z] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, q0.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        boolean z;
        boolean z4;
        long j4;
        boolean z5;
        boolean z6;
        long j5;
        boolean z7;
        int i4;
        boolean z8;
        g0 g0Var;
        int i5;
        boolean z9;
        this.f3968p.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f3962h.d(2);
        if (!this.f3924A) {
            y0();
        }
        int i6 = this.f3931H.f4143e;
        if (i6 == 1 || i6 == 4) {
            return;
        }
        if (this.f3924A) {
            y0();
        }
        T t4 = this.f3970r.f4020i;
        if (t4 == null) {
            U(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        A0();
        if (t4.f3992e) {
            this.f3968p.getClass();
            this.f3946X = W.J.M(SystemClock.elapsedRealtime());
            t4.f3988a.j(this.f3931H.f4155s - this.f3967m);
            z = true;
            z4 = true;
            int i7 = 0;
            while (true) {
                n0[] n0VarArr = this.f3949a;
                if (i7 >= n0VarArr.length) {
                    break;
                }
                n0 n0Var = n0VarArr[i7];
                if (n0Var.c() == 0) {
                    G(i7, false);
                } else {
                    long j6 = this.f3945W;
                    long j7 = this.f3946X;
                    AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4203f;
                    AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4202e;
                    if (n0.h(abstractC0135a2)) {
                        abstractC0135a2.z(j6, j7);
                    }
                    if (abstractC0135a != null && abstractC0135a.f4044h != 0) {
                        abstractC0135a.z(j6, j7);
                    }
                    if (z) {
                        AbstractC0135a abstractC0135a3 = (AbstractC0135a) n0Var.f4203f;
                        AbstractC0135a abstractC0135a4 = (AbstractC0135a) n0Var.f4202e;
                        boolean m4 = n0.h(abstractC0135a4) ? abstractC0135a4.m() : true;
                        if (abstractC0135a3 != null && abstractC0135a3.f4044h != 0) {
                            m4 &= abstractC0135a3.m();
                        }
                        if (m4) {
                            z = true;
                            AbstractC0135a d4 = n0Var.d(t4);
                            z9 = d4 != null || d4.l() || d4.o() || d4.m();
                            G(i7, z9);
                            z4 = !z4 && z9;
                            if (z9) {
                                F(i7);
                            }
                        }
                    }
                    z = false;
                    AbstractC0135a d42 = n0Var.d(t4);
                    if (d42 != null) {
                    }
                    G(i7, z9);
                    if (z4) {
                    }
                    if (z9) {
                    }
                }
                i7++;
            }
        } else {
            t4.f3988a.h();
            z = true;
            z4 = true;
        }
        long j8 = t4.f3994g.f4006e;
        boolean z10 = z && t4.f3992e && (j8 == -9223372036854775807L || j8 <= this.f3931H.f4155s);
        if (z10 && this.L) {
            this.L = false;
            int i8 = this.f3931H.n;
            this.f3932I.c(0);
            z0(this.z.d(this.f3931H.f4143e, false), i8, 5, false);
        }
        if (!z10 || !t4.f3994g.f4011j) {
            g0 g0Var2 = this.f3931H;
            if (g0Var2.f4143e == 2) {
                V v = this.f3970r;
                if (this.f3943U == 0) {
                    z7 = B();
                } else if (z4) {
                    if (g0Var2.f4145g) {
                        T t5 = v.f4020i;
                        long j9 = r0(g0Var2.f4139a, t5.f3994g.f4002a) ? this.f3972t.f4095h : -9223372036854775807L;
                        T t6 = v.f4023l;
                        boolean z11 = t6.g() && t6.f3994g.f4011j;
                        boolean z12 = t6.f3994g.f4002a.b() && !t6.f3992e;
                        if (!z11 && !z12) {
                            long o = o(t6.d());
                            O o4 = this.f3959f;
                            b0.i iVar = this.v;
                            j4 = -9223372036854775807L;
                            T.T t7 = this.f3931H.f4139a;
                            C1353B c1353b = t5.f3994g.f4002a;
                            float f4 = this.n.e().f2664a;
                            boolean z13 = this.f3931H.f4150l;
                            boolean z14 = this.f3935M;
                            C0141g c0141g = (C0141g) o4;
                            c0141g.getClass();
                            long j10 = j9;
                            C0104w c0104w = t7.m(t7.g(c1353b.f14812a, c0141g.f4124b).f2683c, c0141g.f4123a, 0L).f2692c.f2900b;
                            if (c0104w != null) {
                                String scheme = c0104w.f2893a.getScheme();
                                if (TextUtils.isEmpty(scheme) || C0141g.f4122r.contains(scheme)) {
                                    z6 = true;
                                    long C4 = W.J.C(o, f4);
                                    j5 = !z14 ? z6 ? c0141g.f4133k : c0141g.f4132j : z6 ? c0141g.f4131i : c0141g.f4130h;
                                    if (j10 != -9223372036854775807L) {
                                        j5 = Math.min(j10 / 2, j5);
                                    }
                                    if (j5 > 0 && C4 < j5) {
                                        if (!(!z6 ? c0141g.f4135m : false)) {
                                            C0140f c0140f = (C0140f) c0141g.f4136p.get(iVar);
                                            c0140f.getClass();
                                            synchronized (c0140f) {
                                                i4 = c0140f.f4109d;
                                            }
                                            int i9 = i4 * c0141g.f4125c.f15442b;
                                            C0140f c0140f2 = (C0140f) c0141g.f4136p.get(iVar);
                                            c0140f2.getClass();
                                        }
                                        z7 = false;
                                        if (z7) {
                                            m0(3);
                                            this.f3950a0 = null;
                                            if (q0()) {
                                                C0(false, false);
                                                C0142h c0142h = this.n;
                                                z5 = true;
                                                c0142h.f4162f = true;
                                                c0142h.f4157a.f();
                                                s0();
                                                if (this.f3931H.f4143e == 2) {
                                                    int i10 = 0;
                                                    while (true) {
                                                        n0[] n0VarArr2 = this.f3949a;
                                                        if (i10 >= n0VarArr2.length) {
                                                            break;
                                                        }
                                                        if (n0VarArr2[i10].d(t4) != null ? z5 : false) {
                                                            F(i10);
                                                        }
                                                        i10++;
                                                    }
                                                    g0 g0Var3 = this.f3931H;
                                                    if (!g0Var3.f4145g && g0Var3.f4154r < 500000 && z(this.f3970r.f4023l) && q0()) {
                                                        z8 = z5;
                                                        if (z8) {
                                                            this.f3952b0 = -9223372036854775807L;
                                                        } else if (this.f3952b0 == -9223372036854775807L) {
                                                            this.f3968p.getClass();
                                                            this.f3952b0 = SystemClock.elapsedRealtime();
                                                        } else {
                                                            this.f3968p.getClass();
                                                            if (SystemClock.elapsedRealtime() - this.f3952b0 >= 4000) {
                                                                throw new W.C(0, 4000);
                                                            }
                                                        }
                                                        boolean z15 = (q0() || this.f3931H.f4143e != 3) ? false : z5;
                                                        if (this.f3942T || !this.f3941S || !z15) {
                                                            z5 = false;
                                                        }
                                                        g0Var = this.f3931H;
                                                        if (g0Var.f4152p != z5) {
                                                            this.f3931H = g0Var.i(z5);
                                                        }
                                                        this.f3941S = false;
                                                        if (!z5 && (i5 = this.f3931H.f4143e) != 4 && (z15 || i5 == 2 || (i5 == 3 && this.f3943U != 0))) {
                                                            U(uptimeMillis);
                                                        }
                                                        Trace.endSection();
                                                    }
                                                }
                                                z8 = false;
                                                if (z8) {
                                                }
                                                if (q0()) {
                                                }
                                                if (this.f3942T) {
                                                }
                                                z5 = false;
                                                g0Var = this.f3931H;
                                                if (g0Var.f4152p != z5) {
                                                }
                                                this.f3941S = false;
                                                if (!z5) {
                                                    U(uptimeMillis);
                                                }
                                                Trace.endSection();
                                            }
                                        }
                                    }
                                    z7 = true;
                                    if (z7) {
                                    }
                                }
                            }
                            z6 = false;
                            long C42 = W.J.C(o, f4);
                            if (!z14) {
                            }
                            if (j10 != -9223372036854775807L) {
                            }
                            if (j5 > 0) {
                                if (!(!z6 ? c0141g.f4135m : false)) {
                                }
                                z7 = false;
                                if (z7) {
                                }
                            }
                            z7 = true;
                            if (z7) {
                            }
                        }
                    }
                    j4 = -9223372036854775807L;
                    z7 = true;
                    if (z7) {
                    }
                } else {
                    z7 = false;
                }
                j4 = -9223372036854775807L;
                if (z7) {
                }
            } else {
                j4 = -9223372036854775807L;
            }
            z5 = true;
            if (this.f3931H.f4143e == 3 && (this.f3943U != 0 ? !z4 : !B())) {
                C0(q0(), false);
                m0(2);
                if (this.f3935M) {
                    for (T t8 = this.f3970r.f4020i; t8 != null; t8 = t8.f4000m) {
                        for (t0.t tVar : t8.o.f15386c) {
                            if (tVar != null) {
                                tVar.s();
                            }
                        }
                    }
                    C0139e c0139e = this.f3972t;
                    long j11 = c0139e.f4095h;
                    if (j11 != j4) {
                        long j12 = j11 + c0139e.f4089b;
                        c0139e.f4095h = j12;
                        long j13 = c0139e.f4094g;
                        if (j13 != j4 && j12 > j13) {
                            c0139e.f4095h = j13;
                        }
                        c0139e.f4099l = j4;
                    }
                }
                u0();
            }
            if (this.f3931H.f4143e == 2) {
            }
            z8 = false;
            if (z8) {
            }
            if (q0()) {
            }
            if (this.f3942T) {
            }
            z5 = false;
            g0Var = this.f3931H;
            if (g0Var.f4152p != z5) {
            }
            this.f3941S = false;
            if (!z5) {
            }
            Trace.endSection();
        }
        m0(4);
        u0();
        z5 = true;
        if (this.f3931H.f4143e == 2) {
        }
        z8 = false;
        if (z8) {
        }
        if (q0()) {
        }
        if (this.f3942T) {
        }
        z5 = false;
        g0Var = this.f3931H;
        if (g0Var.f4152p != z5) {
        }
        this.f3941S = false;
        if (!z5) {
        }
        Trace.endSection();
    }

    public final void h0(boolean z) {
        if (!z) {
            L l4 = this.f3929F;
            W.F f4 = this.f3962h;
            if (l4 != null && this.f3928E && !f4.f3257a.hasMessages(37)) {
                this.f3930G++;
            }
            int i4 = this.f3930G;
            if (i4 > 0) {
                this.f3975x.c(new R1.n(this, i4));
            }
            this.f3930G = 0;
            this.f3928E = false;
            f4.d(37);
            L l5 = this.f3929F;
            if (l5 != null) {
                W(l5);
                this.f3929F = null;
                this.f3928E = false;
            }
        }
        this.f3927D = z;
        c();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4;
        T t4;
        C1353B c1353b;
        T t5;
        int i5;
        int i6 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i7 = message.arg2;
                    this.f3932I.c(1);
                    z0(this.z.d(this.f3931H.f4143e, z), i7 >> 4, i7 & 15, z);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    W((L) message.obj);
                    break;
                case 4:
                    e0((T.I) message.obj);
                    break;
                case 5:
                    j0((p0) message.obj);
                    break;
                case 6:
                    t0(false, true);
                    break;
                case 7:
                    K((C0112e) message.obj);
                    return true;
                case 8:
                    w((InterfaceC1383z) message.obj);
                    break;
                case 9:
                    r((InterfaceC1383z) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case 12:
                    k0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (C0112e) message.obj);
                    break;
                case 14:
                    Y((j0) message.obj);
                    break;
                case 15:
                    Z((j0) message.obj);
                    break;
                case 16:
                    T.I i8 = (T.I) message.obj;
                    x(i8, i8.f2664a, true, false);
                    break;
                case 17:
                    c0((C0133I) message.obj);
                    break;
                case 18:
                    b((C0133I) message.obj, message.arg1);
                    break;
                case C0583e9.f11743C /* 19 */:
                    AbstractC0005f.x(message.obj);
                    I();
                    throw null;
                case C0583e9.f11744D /* 20 */:
                    M(message.arg1, message.arg2, (q0.e0) message.obj);
                    break;
                case 21:
                    l0((q0.e0) message.obj);
                    break;
                case Build.API_LEVELS.API_22 /* 22 */:
                    H();
                    break;
                case Build.API_LEVELS.API_23 /* 23 */:
                    d0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    e();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    x0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case Build.API_LEVELS.API_28 /* 28 */:
                    f0((C0150p) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case Build.API_LEVELS.API_30 /* 30 */:
                    Pair pair = (Pair) message.obj;
                    o0(pair.first, (C0112e) pair.second);
                    break;
                case Build.API_LEVELS.API_31 /* 31 */:
                    a0((C0086d) message.obj, message.arg1 != 0);
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
                    p0(((Float) message.obj).floatValue());
                    break;
                case Build.API_LEVELS.API_33 /* 33 */:
                    p(message.arg1);
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    q();
                    break;
                case 35:
                    n0((w0.t) message.obj);
                    break;
                case Build.API_LEVELS.API_36 /* 36 */:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f3928E = false;
                    L l4 = this.f3929F;
                    if (l4 != null) {
                        W(l4);
                        this.f3929F = null;
                        break;
                    }
                    break;
                case C0583e9.f11751K /* 38 */:
                    i0((o0) message.obj);
                    break;
            }
        } catch (T.G e4) {
            boolean z4 = e4.f2659a;
            int i9 = e4.f2660b;
            if (i9 == 1) {
                i5 = z4 ? 3001 : 3003;
            } else {
                if (i9 == 4) {
                    i5 = z4 ? 3002 : 3004;
                }
                t(e4, i6);
            }
            i6 = i5;
            t(e4, i6);
        } catch (Y.i e5) {
            t(e5, e5.f3694a);
        } catch (C0146l e6) {
            e = e6;
            int i10 = e.f4175c;
            V v = this.f3970r;
            if (i10 == 1 && (t5 = v.f4021j) != null && e.f4180h == null) {
                e = e.a(t5.f3994g.f4002a);
            }
            int i11 = e.f4175c;
            W.F f4 = this.f3962h;
            if (i11 == 1 && (c1353b = e.f4180h) != null && A(e.f4177e, c1353b)) {
                this.f3958e0 = true;
                f();
                T g4 = v.g();
                T t6 = v.f4020i;
                if (t6 != g4) {
                    while (t6 != null) {
                        T t7 = t6.f4000m;
                        if (t7 == g4) {
                            break;
                        }
                        t6 = t7;
                    }
                }
                v.n(t6);
                if (this.f3931H.f4143e != 4) {
                    C();
                    f4.e(2);
                }
            } else {
                C0146l c0146l = this.f3950a0;
                if (c0146l != null) {
                    c0146l.addSuppressed(e);
                    e = this.f3950a0;
                }
                if (e.f4175c == 1 && v.f4020i != v.f4021j) {
                    while (true) {
                        t4 = v.f4020i;
                        if (t4 == v.f4021j) {
                            break;
                        }
                        v.a();
                    }
                    AbstractC0124a.n(t4);
                    E();
                    U u4 = t4.f3994g;
                    C1353B c1353b2 = u4.f4002a;
                    long j4 = u4.f4003b;
                    this.f3931H = y(c1353b2, j4, u4.f4004c, j4, true, 0);
                }
                if (e.f4181i && (this.f3950a0 == null || (i4 = e.f2661a) == 5004 || i4 == 5003)) {
                    AbstractC0108a.t("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f3950a0 == null) {
                        this.f3950a0 = e;
                    }
                    W.E a3 = f4.a(25, e);
                    Handler handler = f4.f3257a;
                    Message message2 = a3.f3255a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    a3.a();
                } else {
                    AbstractC0108a.f("ExoPlayerImplInternal", "Playback error", e);
                    t0(true, false);
                    this.f3931H = this.f3931H.f(e);
                }
            }
        } catch (f0.c e7) {
            t(e7, e7.f8489a);
        } catch (RuntimeException e8) {
            if ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) {
                i6 = 1004;
            }
            C0146l c0146l2 = new C0146l(2, e8, i6);
            AbstractC0108a.f("ExoPlayerImplInternal", "Playback error", c0146l2);
            t0(true, false);
            this.f3931H = this.f3931H.f(c0146l2);
        } catch (C1360b e9) {
            t(e9, 1002);
        } catch (IOException e10) {
            t(e10, 2000);
        }
        E();
        return true;
    }

    public final void i(T t4, int i4, boolean z, long j4) {
        n0 n0Var = this.f3949a[i4];
        boolean g4 = n0Var.g();
        AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4202e;
        if (g4) {
            return;
        }
        boolean z4 = t4 == this.f3970r.f4020i;
        t0.x xVar = t4.o;
        m0 m0Var = xVar.f15385b[i4];
        t0.t tVar = xVar.f15386c[i4];
        boolean z5 = q0() && this.f3931H.f4143e == 3;
        boolean z6 = !z && z5;
        this.f3943U++;
        q0.b0 b0Var = t4.f3990c[i4];
        long j5 = t4.f4001p;
        C1353B c1353b = t4.f3994g.f4002a;
        AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4203f;
        int length = tVar != null ? tVar.length() : 0;
        C0097o[] c0097oArr = new C0097o[length];
        for (int i5 = 0; i5 < length; i5++) {
            tVar.getClass();
            c0097oArr[i5] = tVar.f(i5);
        }
        int i6 = n0Var.f4201d;
        C0142h c0142h = this.n;
        if (i6 == 0 || i6 == 2 || i6 == 4) {
            n0Var.f4198a = true;
            AbstractC0124a.t(abstractC0135a.f4044h == 0);
            abstractC0135a.f4040d = m0Var;
            abstractC0135a.f4051q = c1353b;
            abstractC0135a.f4044h = 1;
            abstractC0135a.q(z6, z4);
            abstractC0135a.A(c0097oArr, b0Var, j4, j5, c1353b);
            abstractC0135a.B(j4, z6, true);
            c0142h.c(abstractC0135a);
        } else {
            n0Var.f4199b = true;
            abstractC0135a2.getClass();
            AbstractC0124a.t(abstractC0135a2.f4044h == 0);
            abstractC0135a2.f4040d = m0Var;
            abstractC0135a2.f4051q = c1353b;
            abstractC0135a2.f4044h = 1;
            abstractC0135a2.q(z6, z4);
            abstractC0135a2.A(c0097oArr, b0Var, j4, j5, c1353b);
            abstractC0135a2.B(j4, z6, true);
            c0142h.c(abstractC0135a2);
        }
        C0132H c0132h = new C0132H(this);
        AbstractC0135a d4 = n0Var.d(t4);
        d4.getClass();
        d4.c(11, c0132h);
        if (z5 && z4) {
            n0Var.m();
        }
    }

    public final void i0(o0 o0Var) {
        this.f3926C = o0Var;
        c();
    }

    public final void j(boolean[] zArr, long j4) {
        n0[] n0VarArr;
        long j5;
        T t4 = this.f3970r.f4021j;
        t0.x xVar = t4.o;
        int i4 = 0;
        while (true) {
            n0VarArr = this.f3949a;
            if (i4 >= n0VarArr.length) {
                break;
            }
            if (!xVar.b(i4)) {
                n0VarArr[i4].k();
            }
            i4++;
        }
        int i5 = 0;
        while (i5 < n0VarArr.length) {
            if (xVar.b(i5) && n0VarArr[i5].d(t4) == null) {
                j5 = j4;
                i(t4, i5, zArr[i5], j5);
            } else {
                j5 = j4;
            }
            i5++;
            j4 = j5;
        }
    }

    public final void j0(p0 p0Var) {
        this.f3925B = p0Var;
    }

    public final long k(T.T t4, Object obj, long j4) {
        T.Q q4 = this.f3966l;
        int i4 = t4.g(obj, q4).f2683c;
        T.S s4 = this.f3965k;
        t4.n(i4, s4);
        if (s4.f2695f != -9223372036854775807L && s4.a() && s4.f2698i) {
            return W.J.M(W.J.A(s4.f2696g) - s4.f2695f) - (j4 + q4.f2685e);
        }
        return -9223372036854775807L;
    }

    public final void k0(boolean z) {
        this.f3939Q = z;
        T.T t4 = this.f3931H.f4139a;
        V v = this.f3970r;
        v.f4019h = z;
        int r4 = v.r(t4);
        if ((r4 & 1) != 0) {
            V(true);
        } else if ((r4 & 2) != 0) {
            f();
        }
        u(false);
    }

    public final long l(T t4) {
        if (t4 == null) {
            return 0L;
        }
        long j4 = t4.f4001p;
        if (!t4.f3992e) {
            return j4;
        }
        int i4 = 0;
        while (true) {
            n0[] n0VarArr = this.f3949a;
            if (i4 >= n0VarArr.length) {
                return j4;
            }
            if (n0VarArr[i4].d(t4) != null) {
                AbstractC0135a d4 = n0VarArr[i4].d(t4);
                Objects.requireNonNull(d4);
                long j5 = d4.f4049m;
                if (j5 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j4 = Math.max(j5, j4);
            }
            i4++;
        }
    }

    public final void l0(q0.e0 e0Var) {
        this.f3932I.c(1);
        f0 f0Var = this.f3971s;
        int size = f0Var.f4111b.size();
        if (e0Var.f14997b.length != size) {
            e0Var = new q0.e0(new Random(e0Var.f14996a.nextLong())).a(size);
        }
        f0Var.f4119j = e0Var;
        v(f0Var.b(), false);
    }

    @Override // q0.InterfaceC1382y
    public final void m(InterfaceC1383z interfaceC1383z) {
        this.f3962h.a(8, interfaceC1383z).b();
    }

    public final void m0(int i4) {
        g0 g0Var = this.f3931H;
        if (g0Var.f4143e != i4) {
            if (i4 != 2) {
                this.f3952b0 = -9223372036854775807L;
            }
            if (i4 != 3 && g0Var.f4152p) {
                this.f3931H = g0Var.i(false);
            }
            this.f3931H = this.f3931H.h(i4);
        }
    }

    public final Pair n(T.T t4) {
        long j4 = 0;
        if (t4.p()) {
            return Pair.create(g0.f4138u, 0L);
        }
        int a3 = t4.a(this.f3939Q);
        Pair i4 = t4.i(this.f3965k, this.f3966l, a3, -9223372036854775807L);
        C1353B p2 = this.f3970r.p(t4, i4.first, 0L);
        long longValue = ((Long) i4.second).longValue();
        if (p2.b()) {
            Object obj = p2.f14812a;
            T.Q q4 = this.f3966l;
            t4.g(obj, q4);
            if (p2.f14814c == q4.e(p2.f14813b)) {
                q4.f2687g.getClass();
            }
        } else {
            j4 = longValue;
        }
        return Pair.create(p2, Long.valueOf(j4));
    }

    public final void n0(w0.t tVar) {
        for (n0 n0Var : this.f3949a) {
            AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4202e;
            int i4 = abstractC0135a.f4038b;
            if (i4 == 2 || i4 == 4) {
                abstractC0135a.c(7, tVar);
                AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4203f;
                if (abstractC0135a2 != null) {
                    abstractC0135a2.c(7, tVar);
                }
            }
        }
    }

    public final long o(long j4) {
        T t4 = this.f3970r.f4023l;
        if (t4 == null) {
            return 0L;
        }
        return Math.max(0L, j4 - (this.f3945W - t4.f4001p));
    }

    public final void o0(Object obj, C0112e c0112e) {
        for (n0 n0Var : this.f3949a) {
            AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4202e;
            if (abstractC0135a.f4038b == 2) {
                int i4 = n0Var.f4201d;
                if (i4 == 4 || i4 == 1) {
                    AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4203f;
                    abstractC0135a2.getClass();
                    abstractC0135a2.c(1, obj);
                } else {
                    abstractC0135a.c(1, obj);
                }
            }
        }
        int i5 = this.f3931H.f4143e;
        if (i5 == 3 || i5 == 2) {
            this.f3962h.e(2);
        }
        if (c0112e != null) {
            c0112e.c();
        }
    }

    public final void p(int i4) {
        g0 g0Var = this.f3931H;
        z0(i4, g0Var.n, g0Var.f4151m, g0Var.f4150l);
    }

    public final void p0(float f4) {
        this.f3960f0 = f4;
        float f5 = f4 * this.z.f3031g;
        for (n0 n0Var : this.f3949a) {
            AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4202e;
            if (abstractC0135a.f4038b == 1) {
                abstractC0135a.c(2, Float.valueOf(f5));
                AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4203f;
                if (abstractC0135a2 != null) {
                    abstractC0135a2.c(2, Float.valueOf(f5));
                }
            }
        }
    }

    public final void q() {
        p0(this.f3960f0);
    }

    public final boolean q0() {
        g0 g0Var = this.f3931H;
        return g0Var.f4150l && g0Var.n == 0;
    }

    public final void r(InterfaceC1383z interfaceC1383z) {
        V v = this.f3970r;
        T t4 = v.f4023l;
        if (t4 != null && t4.f3988a == interfaceC1383z) {
            v.m(this.f3945W);
            C();
            return;
        }
        T t5 = v.f4024m;
        if (t5 == null || t5.f3988a != interfaceC1383z) {
            return;
        }
        D();
    }

    public final boolean r0(T.T t4, C1353B c1353b) {
        if (c1353b.b() || t4.p()) {
            return false;
        }
        int i4 = t4.g(c1353b.f14812a, this.f3966l).f2683c;
        T.S s4 = this.f3965k;
        t4.n(i4, s4);
        return s4.a() && s4.f2698i && s4.f2695f != -9223372036854775807L;
    }

    @Override // q0.c0
    public final void s(q0.d0 d0Var) {
        this.f3962h.a(9, (InterfaceC1383z) d0Var).b();
    }

    public final void s0() {
        T t4 = this.f3970r.f4020i;
        if (t4 == null) {
            return;
        }
        t0.x xVar = t4.o;
        int i4 = 0;
        while (true) {
            n0[] n0VarArr = this.f3949a;
            if (i4 >= n0VarArr.length) {
                return;
            }
            if (xVar.b(i4)) {
                n0VarArr[i4].m();
            }
            i4++;
        }
    }

    public final void t(IOException iOException, int i4) {
        C0146l c0146l = new C0146l(0, iOException, i4);
        T t4 = this.f3970r.f4020i;
        if (t4 != null) {
            c0146l = c0146l.a(t4.f3994g.f4002a);
        }
        AbstractC0108a.f("ExoPlayerImplInternal", "Playback error", c0146l);
        t0(false, false);
        this.f3931H = this.f3931H.f(c0146l);
    }

    public final void t0(boolean z, boolean z4) {
        O(z || !this.f3940R, false, true, false);
        this.f3932I.c(z4 ? 1 : 0);
        C0141g c0141g = (C0141g) this.f3959f;
        ConcurrentHashMap concurrentHashMap = c0141g.f4136p;
        b0.i iVar = this.v;
        C0140f c0140f = (C0140f) concurrentHashMap.get(iVar);
        if (c0140f != null) {
            int i4 = c0140f.f4106a - 1;
            c0140f.f4106a = i4;
            if (i4 == 0) {
                concurrentHashMap.remove(iVar);
                c0141g.c();
            }
        }
        this.z.d(1, this.f3931H.f4150l);
        m0(1);
    }

    public final void u(boolean z) {
        T t4 = this.f3970r.f4023l;
        C1353B c1353b = t4 == null ? this.f3931H.f4140b : t4.f3994g.f4002a;
        boolean equals = this.f3931H.f4149k.equals(c1353b);
        if (!equals) {
            this.f3931H = this.f3931H.c(c1353b);
        }
        g0 g0Var = this.f3931H;
        g0Var.f4153q = t4 == null ? g0Var.f4155s : t4.d();
        g0 g0Var2 = this.f3931H;
        g0Var2.f4154r = o(g0Var2.f4153q);
        if ((!equals || z) && t4 != null && t4.f3992e) {
            w0(t4.f3994g.f4002a, t4.o);
        }
    }

    public final void u0() {
        C0142h c0142h = this.n;
        c0142h.f4162f = false;
        q0 q0Var = c0142h.f4157a;
        if (q0Var.f4234b) {
            q0Var.c(q0Var.a());
            q0Var.f4234b = false;
        }
        for (n0 n0Var : this.f3949a) {
            AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4203f;
            AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4202e;
            if (n0.h(abstractC0135a2)) {
                n0.b(abstractC0135a2);
            }
            if (abstractC0135a != null && abstractC0135a.f4044h != 0) {
                n0.b(abstractC0135a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0355 A[Catch: all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:130:0x034c, B:131:0x0355, B:133:0x035b, B:19:0x0378, B:54:0x0386, B:56:0x038c, B:58:0x0396, B:60:0x03a3), top: B:17:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04a0  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v7, types: [long] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r2v34, types: [a0.V] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v22, types: [T.T] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(T.T t4, boolean z) {
        C1353B c1353b;
        int i4;
        long j4;
        T.T t5;
        T.S s4;
        long j5;
        int i5;
        long j6;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        boolean z7;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        K k4;
        int i7;
        long longValue;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i8;
        ?? r20;
        T.T t6;
        C1353B c1353b2;
        L l4;
        boolean z12;
        int i9;
        boolean z13;
        char c4;
        int i10;
        boolean z14;
        L l5;
        T.T t7;
        T.T t8;
        long l6;
        long j12;
        char c5;
        int s5;
        T t9;
        int i11;
        boolean z15;
        L l7;
        int i12;
        g0 g0Var = this.f3931H;
        L l8 = this.f3944V;
        V v = this.f3970r;
        int i13 = this.f3938P;
        boolean z16 = this.f3939Q;
        T.S s6 = this.f3965k;
        T.Q q4 = this.f3966l;
        if (t4.p()) {
            r20 = 0;
            i8 = 0;
            t5 = t4;
            k4 = new K(g0.f4138u, 0L, -9223372036854775807L, false, true, false);
            j9 = 0;
        } else {
            C1353B c1353b3 = g0Var.f4140b;
            Object obj = c1353b3.f14812a;
            T.T t10 = g0Var.f4139a;
            boolean p2 = t10.p();
            boolean z17 = p2 || t10.g(c1353b3.f14812a, q4).f2686f;
            long j13 = (g0Var.f4140b.b() || z17) ? g0Var.f4141c : g0Var.f4155s;
            if (l8 != null) {
                c1353b = c1353b3;
                i4 = -1;
                j4 = 1;
                t5 = t4;
                Pair S4 = S(t5, l8, true, i13, z16, s6, q4);
                if (S4 == null) {
                    i5 = t5.a(z16);
                    longValue = j13;
                    z11 = true;
                    z9 = false;
                    z10 = false;
                } else {
                    if (l8.f3922c == -9223372036854775807L) {
                        i5 = t5.g(S4.first, q4).f2683c;
                        longValue = j13;
                        z8 = false;
                    } else {
                        obj = S4.first;
                        longValue = ((Long) S4.second).longValue();
                        i5 = -1;
                        z8 = true;
                    }
                    z9 = g0Var.f4143e == 4;
                    z10 = z8;
                    z11 = false;
                }
                z5 = z11;
                z4 = z9;
                z6 = z10;
                long j14 = longValue;
                s4 = s6;
                j5 = j14;
            } else {
                c1353b = c1353b3;
                i4 = -1;
                j4 = 1;
                t5 = t4;
                if (g0Var.f4139a.p()) {
                    i5 = t5.a(z16);
                    s4 = s6;
                } else if (t5.b(obj) == -1) {
                    int T4 = T(s6, q4, i13, z16, obj, g0Var.f4139a, t5);
                    s4 = s6;
                    t5 = t5;
                    q4 = q4;
                    if (T4 == -1) {
                        i6 = t5.a(z16);
                        z7 = true;
                    } else {
                        i6 = T4;
                        z7 = false;
                    }
                    z5 = z7;
                    obj = obj;
                    i5 = i6;
                    j5 = j13;
                    z4 = false;
                    z6 = false;
                } else {
                    s4 = s6;
                    if (j13 == -9223372036854775807L) {
                        int i14 = t5.g(obj, q4).f2683c;
                        obj = obj;
                        i5 = i14;
                    } else if (z17) {
                        g0Var.f4139a.g(c1353b.f14812a, q4);
                        if (g0Var.f4139a.m(q4.f2683c, s4, 0L).n == g0Var.f4139a.b(c1353b.f14812a)) {
                            Pair i15 = t5.i(s4, q4, t5.g(obj, q4).f2683c, j13 + q4.f2685e);
                            obj = i15.first;
                            j6 = ((Long) i15.second).longValue();
                        } else if (t5.g(obj, q4).f2684d != -9223372036854775807L) {
                            j6 = W.J.k(j13, 0L, q4.f2684d - 1);
                            obj = obj;
                        } else {
                            obj = obj;
                            j6 = j13;
                        }
                        j5 = j6;
                        i5 = -1;
                        i4 = -1;
                        z4 = false;
                        z5 = false;
                        z6 = true;
                    } else {
                        obj = obj;
                        j5 = j13;
                        i5 = -1;
                        i4 = -1;
                        z4 = false;
                        z5 = false;
                        z6 = false;
                    }
                }
                j5 = j13;
                z4 = false;
                z5 = false;
                z6 = false;
            }
            if (i5 != i4) {
                Pair i16 = t5.i(s4, q4, i5, -9223372036854775807L);
                obj = i16.first;
                j7 = ((Long) i16.second).longValue();
                j5 = -9223372036854775807L;
            } else {
                j7 = j5;
            }
            C1353B p4 = v.p(t5, obj, j7);
            int i17 = p4.f14816e;
            boolean z18 = i17 == i4 || ((i7 = c1353b.f14816e) != i4 && i17 >= i7);
            boolean equals = c1353b.f14812a.equals(obj);
            boolean z19 = equals && !c1353b.b() && !p4.b() && z18;
            T.Q g4 = t5.g(obj, q4);
            if (z17 || j13 != j5) {
                j8 = j5;
            } else {
                Object obj2 = c1353b.f14812a;
                int i18 = c1353b.f14813b;
                j8 = j5;
                if (obj2.equals(p4.f14812a)) {
                    if (c1353b.b()) {
                        g4.g(i18);
                    }
                    if (p4.b()) {
                        g4.g(p4.f14813b);
                    }
                }
            }
            C1353B c1353b4 = !z19 ? p4 : c1353b;
            if (!c1353b4.b()) {
                if (equals && c1353b.b()) {
                    C0083a a3 = t5.g(obj, q4).f2687g.a(c1353b.f14813b);
                    a3.getClass();
                    long j15 = g0Var.f4141c;
                    j9 = 0;
                    if (j15 == -9223372036854775807L || 0 > j15) {
                        int i19 = a3.f2756a;
                        int i20 = c1353b.f14814c;
                        if (i19 > i20 && a3.f2760e[i20] == 2) {
                            long j16 = t5.g(obj, q4).f2684d;
                            if (j16 != -9223372036854775807L) {
                                j7 = Math.min(j16 - j4, j7);
                            }
                            j10 = j7;
                            j11 = j10;
                        }
                    }
                } else {
                    j9 = 0;
                }
                j10 = j7;
                j11 = j8;
            } else if (c1353b4.equals(c1353b)) {
                j10 = g0Var.f4155s;
                j11 = j8;
                j9 = 0;
            } else {
                t5.g(c1353b4.f14812a, q4);
                if (c1353b4.f14814c == q4.e(c1353b4.f14813b)) {
                    q4.f2687g.getClass();
                }
                j11 = j8;
                j9 = 0;
                j10 = 0;
            }
            k4 = new K(c1353b4, j10, j11, z4, z5, z6);
            r20 = p2;
            i8 = j13;
        }
        C1353B c1353b5 = k4.f3914a;
        ?? r12 = k4.f3916c;
        boolean z20 = k4.f3917d;
        long j17 = k4.f3915b;
        boolean z21 = (this.f3931H.f4140b.equals(c1353b5) && j17 == this.f3931H.f4155s) ? false : true;
        try {
            if (k4.f3918e) {
                try {
                    z13 = true;
                    if (this.f3931H.f4143e != 1) {
                        c4 = 4;
                        try {
                            m0(4);
                        } catch (Throwable th) {
                            th = th;
                            t6 = t5;
                            c1353b2 = c1353b5;
                            z12 = z13;
                            i9 = c4;
                            j9 = r12;
                            l4 = null;
                            g0 g0Var2 = this.f3931H;
                            T.T t11 = g0Var2.f4139a;
                            C1353B c1353b6 = g0Var2.f4140b;
                            C1353B c1353b7 = c1353b2;
                            B0(t6, c1353b7, t11, c1353b6, !k4.f3919f ? j17 : -9223372036854775807L, false);
                            if (!z21) {
                            }
                            g0 g0Var3 = this.f3931H;
                            Object obj3 = g0Var3.f4140b.f14812a;
                            T.T t12 = g0Var3.f4139a;
                            if (z21) {
                            }
                            this.f3931H = y(c1353b7, j17, j9, !r9 ? j17 : this.f3931H.f4142d, r9, t6.b(obj3) != -1 ? i9 : 3);
                            P();
                            R(t6, this.f3931H.f4139a);
                            this.f3931H = this.f3931H.j(t6);
                            if (!t6.p()) {
                            }
                            u(false);
                            this.f3962h.e(2);
                            throw th;
                        }
                    } else {
                        c4 = 4;
                    }
                    O(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z13 = true;
                    c4 = 4;
                    t6 = t5;
                    c1353b2 = c1353b5;
                    z12 = z13;
                    i9 = c4;
                    j9 = r12;
                    l4 = null;
                    g0 g0Var22 = this.f3931H;
                    T.T t112 = g0Var22.f4139a;
                    C1353B c1353b62 = g0Var22.f4140b;
                    C1353B c1353b72 = c1353b2;
                    B0(t6, c1353b72, t112, c1353b62, !k4.f3919f ? j17 : -9223372036854775807L, false);
                    if (!z21) {
                    }
                    g0 g0Var32 = this.f3931H;
                    Object obj32 = g0Var32.f4140b.f14812a;
                    T.T t122 = g0Var32.f4139a;
                    if (z21) {
                    }
                    this.f3931H = y(c1353b72, j17, j9, !r9 ? j17 : this.f3931H.f4142d, r9, t6.b(obj32) != -1 ? i9 : 3);
                    P();
                    R(t6, this.f3931H.f4139a);
                    this.f3931H = this.f3931H.j(t6);
                    if (!t6.p()) {
                    }
                    u(false);
                    this.f3962h.e(2);
                    throw th;
                }
            } else {
                z13 = true;
                c4 = 4;
            }
            n0[] n0VarArr = this.f3949a;
            int length = n0VarArr.length;
            ?? r8 = 0;
            while (r8 < length) {
                try {
                    n0 n0Var = n0VarArr[r8];
                    AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4202e;
                    if (!Objects.equals(abstractC0135a.f4050p, t5)) {
                        abstractC0135a.f4050p = t5;
                        abstractC0135a.x();
                    }
                    AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var.f4203f;
                    if (abstractC0135a2 != null && !Objects.equals(abstractC0135a2.f4050p, t5)) {
                        abstractC0135a2.f4050p = t5;
                        abstractC0135a2.x();
                    }
                    r8++;
                } catch (Throwable th3) {
                    th = th3;
                    t6 = t5;
                    c1353b2 = c1353b5;
                    i9 = c4;
                    j9 = r12;
                    l4 = null;
                    z12 = true;
                    g0 g0Var222 = this.f3931H;
                    T.T t1122 = g0Var222.f4139a;
                    C1353B c1353b622 = g0Var222.f4140b;
                    C1353B c1353b722 = c1353b2;
                    B0(t6, c1353b722, t1122, c1353b622, !k4.f3919f ? j17 : -9223372036854775807L, false);
                    if (!z21) {
                    }
                    g0 g0Var322 = this.f3931H;
                    Object obj322 = g0Var322.f4140b.f14812a;
                    T.T t1222 = g0Var322.f4139a;
                    if (z21) {
                    }
                    this.f3931H = y(c1353b722, j17, j9, !r9 ? j17 : this.f3931H.f4142d, r9, t6.b(obj322) != -1 ? i9 : 3);
                    P();
                    R(t6, this.f3931H.f4139a);
                    this.f3931H = this.f3931H.j(t6);
                    if (!t6.p()) {
                    }
                    u(false);
                    this.f3962h.e(2);
                    throw th;
                }
            }
            try {
                if (z21) {
                    r8 = t5;
                    i8 = c4;
                    j9 = r12;
                    l7 = null;
                    l7 = null;
                    l5 = null;
                    r12 = 0;
                    z15 = true;
                    z15 = true;
                    z14 = true;
                    r20 = 1;
                    i12 = i8;
                    if (!r8.p()) {
                        for (T t13 = this.f3970r.f4020i; t13 != null; t13 = t13.f4000m) {
                            if (t13.f3994g.f4002a.equals(c1353b5)) {
                                t13.f3994g = this.f3970r.h(r8, t13.f3994g);
                                t13.k();
                            }
                        }
                        try {
                            V v4 = this.f3970r;
                            c1353b2 = c1353b5;
                            try {
                                j17 = X(c1353b2, j17, v4.f4020i != v4.f4021j, z20);
                                i11 = i8;
                                g0 g0Var4 = this.f3931H;
                                C1353B c1353b8 = c1353b2;
                                B0(t4, c1353b8, g0Var4.f4139a, g0Var4.f4140b, !k4.f3919f ? j17 : -9223372036854775807L, false);
                                if (!z21 || j9 != this.f3931H.f4141c) {
                                    g0 g0Var5 = this.f3931H;
                                    Object obj4 = g0Var5.f4140b.f14812a;
                                    T.T t14 = g0Var5.f4139a;
                                    boolean z22 = (z21 || !z || t14.p() || t14.g(obj4, this.f3966l).f2686f) ? false : z15;
                                    this.f3931H = y(c1353b8, j17, j9, !z22 ? j17 : this.f3931H.f4142d, z22, t4.b(obj4) != -1 ? i11 : 3);
                                }
                                P();
                                R(t4, this.f3931H.f4139a);
                                this.f3931H = this.f3931H.j(t4);
                                if (!t4.p()) {
                                    this.f3944V = l7;
                                }
                                u(false);
                                this.f3962h.e(2);
                            } catch (Throwable th4) {
                                th = th4;
                                j17 = j17;
                                t7 = r8;
                                i10 = i8;
                                t6 = t7;
                                l4 = l5;
                                z12 = z14;
                                i9 = i10;
                                g0 g0Var2222 = this.f3931H;
                                T.T t11222 = g0Var2222.f4139a;
                                C1353B c1353b6222 = g0Var2222.f4140b;
                                C1353B c1353b7222 = c1353b2;
                                B0(t6, c1353b7222, t11222, c1353b6222, !k4.f3919f ? j17 : -9223372036854775807L, false);
                                if (!z21) {
                                }
                                g0 g0Var3222 = this.f3931H;
                                Object obj3222 = g0Var3222.f4140b.f14812a;
                                T.T t12222 = g0Var3222.f4139a;
                                if (z21) {
                                }
                                this.f3931H = y(c1353b7222, j17, j9, !r9 ? j17 : this.f3931H.f4142d, r9, t6.b(obj3222) != -1 ? i9 : 3);
                                P();
                                R(t6, this.f3931H.f4139a);
                                this.f3931H = this.f3931H.j(t6);
                                if (!t6.p()) {
                                }
                                u(false);
                                this.f3962h.e(2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c1353b2 = c1353b5;
                            t7 = r8;
                            l5 = r12;
                            z14 = r20;
                            i10 = i8;
                            t6 = t7;
                            l4 = l5;
                            z12 = z14;
                            i9 = i10;
                            g0 g0Var22222 = this.f3931H;
                            T.T t112222 = g0Var22222.f4139a;
                            C1353B c1353b62222 = g0Var22222.f4140b;
                            C1353B c1353b72222 = c1353b2;
                            B0(t6, c1353b72222, t112222, c1353b62222, !k4.f3919f ? j17 : -9223372036854775807L, false);
                            if (!z21) {
                            }
                            g0 g0Var32222 = this.f3931H;
                            Object obj32222 = g0Var32222.f4140b.f14812a;
                            T.T t122222 = g0Var32222.f4139a;
                            if (z21) {
                            }
                            this.f3931H = y(c1353b72222, j17, j9, !r9 ? j17 : this.f3931H.f4142d, r9, t6.b(obj32222) != -1 ? i9 : 3);
                            P();
                            R(t6, this.f3931H.f4139a);
                            this.f3931H = this.f3931H.j(t6);
                            if (!t6.p()) {
                            }
                            u(false);
                            this.f3962h.e(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        T t15 = this.f3970r.f4021j;
                        l6 = t15 == null ? j9 : l(t15);
                    } catch (Throwable th6) {
                        th = th6;
                        t8 = t5;
                    }
                    try {
                        try {
                            try {
                                if (d() && (t9 = this.f3970r.f4022k) != null) {
                                    j12 = l(t9);
                                    c5 = c4;
                                    i8 = c5;
                                    j9 = r12;
                                    r12 = 0;
                                    l7 = null;
                                    l7 = null;
                                    l7 = null;
                                    r20 = 1;
                                    z15 = true;
                                    z15 = true;
                                    z15 = true;
                                    s5 = this.f3970r.s(t4, this.f3945W, l6, j12);
                                    if ((s5 & 1) == 0) {
                                        V(false);
                                        i12 = i8;
                                    } else {
                                        i12 = i8;
                                        if ((s5 & 2) != 0) {
                                            f();
                                            i12 = i8;
                                        }
                                    }
                                }
                                s5 = this.f3970r.s(t4, this.f3945W, l6, j12);
                                if ((s5 & 1) == 0) {
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                r8 = t4;
                                c1353b2 = c1353b5;
                                t7 = r8;
                                l5 = r12;
                                z14 = r20;
                                i10 = i8;
                                t6 = t7;
                                l4 = l5;
                                z12 = z14;
                                i9 = i10;
                                g0 g0Var222222 = this.f3931H;
                                T.T t1122222 = g0Var222222.f4139a;
                                C1353B c1353b622222 = g0Var222222.f4140b;
                                C1353B c1353b722222 = c1353b2;
                                B0(t6, c1353b722222, t1122222, c1353b622222, !k4.f3919f ? j17 : -9223372036854775807L, false);
                                if (!z21 || j9 != this.f3931H.f4141c) {
                                    g0 g0Var322222 = this.f3931H;
                                    Object obj322222 = g0Var322222.f4140b.f14812a;
                                    T.T t1222222 = g0Var322222.f4139a;
                                    boolean z23 = (z21 || !z || t1222222.p() || t1222222.g(obj322222, this.f3966l).f2686f) ? false : z12;
                                    this.f3931H = y(c1353b722222, j17, j9, !z23 ? j17 : this.f3931H.f4142d, z23, t6.b(obj322222) != -1 ? i9 : 3);
                                }
                                P();
                                R(t6, this.f3931H.f4139a);
                                this.f3931H = this.f3931H.j(t6);
                                if (!t6.p()) {
                                    this.f3944V = l4;
                                }
                                u(false);
                                this.f3962h.e(2);
                                throw th;
                            }
                            i8 = c5;
                            j9 = r12;
                            r12 = 0;
                            l7 = null;
                            l7 = null;
                            l7 = null;
                            r20 = 1;
                            z15 = true;
                            z15 = true;
                            z15 = true;
                        } catch (Throwable th8) {
                            th = th8;
                            r8 = t4;
                            i8 = c5;
                            j9 = r12;
                            r12 = 0;
                            r20 = 1;
                            c1353b2 = c1353b5;
                            t7 = r8;
                            l5 = r12;
                            z14 = r20;
                            i10 = i8;
                            t6 = t7;
                            l4 = l5;
                            z12 = z14;
                            i9 = i10;
                            g0 g0Var2222222 = this.f3931H;
                            T.T t11222222 = g0Var2222222.f4139a;
                            C1353B c1353b6222222 = g0Var2222222.f4140b;
                            C1353B c1353b7222222 = c1353b2;
                            B0(t6, c1353b7222222, t11222222, c1353b6222222, !k4.f3919f ? j17 : -9223372036854775807L, false);
                            if (!z21) {
                            }
                            g0 g0Var3222222 = this.f3931H;
                            Object obj3222222 = g0Var3222222.f4140b.f14812a;
                            T.T t12222222 = g0Var3222222.f4139a;
                            if (z21) {
                            }
                            this.f3931H = y(c1353b7222222, j17, j9, !z23 ? j17 : this.f3931H.f4142d, z23, t6.b(obj3222222) != -1 ? i9 : 3);
                            P();
                            R(t6, this.f3931H.f4139a);
                            this.f3931H = this.f3931H.j(t6);
                            if (!t6.p()) {
                            }
                            u(false);
                            this.f3962h.e(2);
                            throw th;
                        }
                        c5 = c4;
                    } catch (Throwable th9) {
                        th = th9;
                        t8 = t4;
                        i8 = c4;
                        r8 = t8;
                        j9 = r12;
                        r12 = 0;
                        r20 = 1;
                        c1353b2 = c1353b5;
                        t7 = r8;
                        l5 = r12;
                        z14 = r20;
                        i10 = i8;
                        t6 = t7;
                        l4 = l5;
                        z12 = z14;
                        i9 = i10;
                        g0 g0Var22222222 = this.f3931H;
                        T.T t112222222 = g0Var22222222.f4139a;
                        C1353B c1353b62222222 = g0Var22222222.f4140b;
                        C1353B c1353b72222222 = c1353b2;
                        B0(t6, c1353b72222222, t112222222, c1353b62222222, !k4.f3919f ? j17 : -9223372036854775807L, false);
                        if (!z21) {
                        }
                        g0 g0Var32222222 = this.f3931H;
                        Object obj32222222 = g0Var32222222.f4140b.f14812a;
                        T.T t122222222 = g0Var32222222.f4139a;
                        if (z21) {
                        }
                        this.f3931H = y(c1353b72222222, j17, j9, !z23 ? j17 : this.f3931H.f4142d, z23, t6.b(obj32222222) != -1 ? i9 : 3);
                        P();
                        R(t6, this.f3931H.f4139a);
                        this.f3931H = this.f3931H.j(t6);
                        if (!t6.p()) {
                        }
                        u(false);
                        this.f3962h.e(2);
                        throw th;
                    }
                    j12 = j9;
                }
                c1353b2 = c1353b5;
                i11 = i12;
                g0 g0Var42 = this.f3931H;
                C1353B c1353b82 = c1353b2;
                B0(t4, c1353b82, g0Var42.f4139a, g0Var42.f4140b, !k4.f3919f ? j17 : -9223372036854775807L, false);
                if (!z21) {
                }
                g0 g0Var52 = this.f3931H;
                Object obj42 = g0Var52.f4140b.f14812a;
                T.T t142 = g0Var52.f4139a;
                if (z21) {
                }
                this.f3931H = y(c1353b82, j17, j9, !z22 ? j17 : this.f3931H.f4142d, z22, t4.b(obj42) != -1 ? i11 : 3);
                P();
                R(t4, this.f3931H.f4139a);
                this.f3931H = this.f3931H.j(t4);
                if (!t4.p()) {
                }
                u(false);
                this.f3962h.e(2);
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            t6 = t5;
            c1353b2 = c1353b5;
            j9 = r12;
            l4 = null;
            z12 = true;
            i9 = 4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, q0.d0] */
    public final void v0() {
        T t4 = this.f3970r.f4023l;
        boolean z = this.f3937O || (t4 != null && t4.f3988a.l());
        g0 g0Var = this.f3931H;
        if (z != g0Var.f4145g) {
            this.f3931H = g0Var.b(z);
        }
    }

    public final void w(InterfaceC1383z interfaceC1383z) {
        T t4;
        V v = this.f3970r;
        T t5 = v.f4023l;
        C0142h c0142h = this.n;
        if (t5 != null && t5.f3988a == interfaceC1383z) {
            t5.getClass();
            if (!t5.f3992e) {
                float f4 = c0142h.e().f2664a;
                g0 g0Var = this.f3931H;
                t5.f(f4, g0Var.f4139a, g0Var.f4150l);
            }
            w0(t5.f3994g.f4002a, t5.o);
            if (t5 == v.f4020i) {
                Q(t5.f3994g.f4003b, true);
                j(new boolean[this.f3949a.length], v.f4021j.e());
                t5.f3995h = true;
                g0 g0Var2 = this.f3931H;
                C1353B c1353b = g0Var2.f4140b;
                long j4 = t5.f3994g.f4003b;
                this.f3931H = y(c1353b, j4, g0Var2.f4141c, j4, false, 5);
            }
            C();
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= v.f4026q.size()) {
                t4 = null;
                break;
            }
            t4 = (T) v.f4026q.get(i4);
            if (t4.f3988a == interfaceC1383z) {
                break;
            } else {
                i4++;
            }
        }
        if (t4 != null) {
            AbstractC0124a.t(true ^ t4.f3992e);
            float f5 = c0142h.e().f2664a;
            g0 g0Var3 = this.f3931H;
            t4.f(f5, g0Var3.f4139a, g0Var3.f4150l);
            T t6 = v.f4024m;
            if (t6 == null || t6.f3988a != interfaceC1383z) {
                return;
            }
            D();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(C1353B c1353b, t0.x xVar) {
        boolean z;
        int length;
        int i4;
        T t4 = this.f3970r.f4023l;
        t4.getClass();
        o(t4.d());
        if (r0(this.f3931H.f4139a, t4.f3994g.f4002a)) {
            long j4 = this.f3972t.f4095h;
        }
        T.T t5 = this.f3931H.f4139a;
        float f4 = this.n.e().f2664a;
        boolean z4 = this.f3931H.f4150l;
        t0.t[] tVarArr = xVar.f15386c;
        C0141g c0141g = (C0141g) this.f3959f;
        c0141g.getClass();
        v2.f0 f0Var = c0141g.o;
        b0.i iVar = this.v;
        Integer num = (Integer) f0Var.get(iVar.f5319a);
        int intValue = (num == null || num.intValue() == -1) ? c0141g.f4134l : num.intValue();
        C0140f c0140f = (C0140f) c0141g.f4136p.get(iVar);
        c0140f.getClass();
        if (intValue == -1) {
            C0104w c0104w = t5.m(t5.g(c1353b.f14812a, c0141g.f4124b).f2683c, c0141g.f4123a, 0L).f2692c.f2900b;
            if (c0104w != null) {
                String scheme = c0104w.f2893a.getScheme();
                if (TextUtils.isEmpty(scheme) || C0141g.f4122r.contains(scheme)) {
                    z = true;
                    length = tVarArr.length;
                    i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = 13107200;
                        if (i4 >= length) {
                            t0.t tVar = tVarArr[i4];
                            if (tVar != null) {
                                switch (tVar.c().f2707c) {
                                    case -2:
                                        i6 = 0;
                                        i5 += i6;
                                        break;
                                    case -1:
                                    case 1:
                                        i5 += i6;
                                        break;
                                    case 0:
                                        i6 = 144310272;
                                        i5 += i6;
                                        break;
                                    case 2:
                                        i6 = z ? 19660800 : 131072000;
                                        i5 += i6;
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                        i6 = 131072;
                                        i5 += i6;
                                        break;
                                    case 4:
                                        i6 = 26214400;
                                        i5 += i6;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            }
                            i4++;
                        } else {
                            intValue = W.J.j(i5, 13107200, 210239488);
                        }
                    }
                }
            }
            z = false;
            length = tVarArr.length;
            i4 = 0;
            int i52 = 0;
            while (true) {
                int i62 = 13107200;
                if (i4 >= length) {
                }
                i4++;
            }
        }
        c0140f.f4108c = intValue;
        c0141g.c();
    }

    public final void x(T.I i4, float f4, boolean z, boolean z4) {
        int i5;
        if (z) {
            if (z4) {
                this.f3932I.c(1);
            }
            this.f3931H = this.f3931H.g(i4);
        }
        float f5 = i4.f2664a;
        T t4 = this.f3970r.f4020i;
        while (true) {
            i5 = 0;
            if (t4 == null) {
                break;
            }
            t0.t[] tVarArr = t4.o.f15386c;
            int length = tVarArr.length;
            while (i5 < length) {
                t0.t tVar = tVarArr[i5];
                if (tVar != null) {
                    tVar.p(f5);
                }
                i5++;
            }
            t4 = t4.f4000m;
        }
        n0[] n0VarArr = this.f3949a;
        int length2 = n0VarArr.length;
        while (i5 < length2) {
            n0 n0Var = n0VarArr[i5];
            float f6 = i4.f2664a;
            ((AbstractC0135a) n0Var.f4202e).C(f4, f6);
            AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var.f4203f;
            if (abstractC0135a != null) {
                abstractC0135a.C(f4, f6);
            }
            i5++;
        }
    }

    public final void x0(int i4, int i5, List list) {
        this.f3932I.c(1);
        f0 f0Var = this.f3971s;
        f0Var.getClass();
        ArrayList arrayList = f0Var.f4111b;
        AbstractC0124a.h(i4 >= 0 && i4 <= i5 && i5 <= arrayList.size());
        AbstractC0124a.h(list.size() == i5 - i4);
        for (int i6 = i4; i6 < i5; i6++) {
            ((e0) arrayList.get(i6)).f4101a.w((C0107z) list.get(i6 - i4));
        }
        v(f0Var.b(), false);
    }

    public final g0 y(C1353B c1353b, long j4, long j5, long j6, boolean z, int i4) {
        v2.a0 a0Var;
        boolean z4;
        this.f3948Z = (!this.f3948Z && j4 == this.f3931H.f4155s && c1353b.equals(this.f3931H.f4140b)) ? false : true;
        P();
        g0 g0Var = this.f3931H;
        q0.j0 j0Var = g0Var.f4146h;
        t0.x xVar = g0Var.f4147i;
        List list = g0Var.f4148j;
        if (this.f3971s.f4120k) {
            T t4 = this.f3970r.f4020i;
            j0Var = t4 == null ? q0.j0.f15033d : t4.n;
            xVar = t4 == null ? this.f3957e : t4.o;
            t0.t[] tVarArr = xVar.f15386c;
            v2.F f4 = new v2.F(4);
            boolean z5 = false;
            for (t0.t tVar : tVarArr) {
                if (tVar != null) {
                    T.E e4 = tVar.f(0).f2867l;
                    if (e4 == null) {
                        f4.b(new T.E(new T.D[0]));
                    } else {
                        f4.b(e4);
                        z5 = true;
                    }
                }
            }
            if (z5) {
                a0Var = f4.f();
            } else {
                v2.G g4 = v2.I.f15571b;
                a0Var = v2.a0.f15605e;
            }
            list = a0Var;
            if (t4 != null) {
                U u4 = t4.f3994g;
                if (u4.f4004c != j5) {
                    t4.f3994g = u4.a(j5);
                }
            }
            n0[] n0VarArr = this.f3949a;
            V v = this.f3970r;
            T t5 = v.f4020i;
            if (t5 == v.f4021j && t5 != null) {
                t0.x xVar2 = t5.o;
                int i5 = 0;
                boolean z6 = false;
                while (true) {
                    if (i5 >= n0VarArr.length) {
                        z4 = true;
                        break;
                    }
                    if (xVar2.b(i5)) {
                        if (((AbstractC0135a) n0VarArr[i5].f4202e).f4038b != 1) {
                            z4 = false;
                            break;
                        }
                        if (xVar2.f15385b[i5].f4195a != 0) {
                            z6 = true;
                        }
                    }
                    i5++;
                }
                boolean z7 = z6 && z4;
                if (z7 != this.f3942T) {
                    this.f3942T = z7;
                    if (!z7 && this.f3931H.f4152p) {
                        this.f3962h.e(2);
                    }
                }
            }
        } else if (!c1353b.equals(g0Var.f4140b)) {
            j0Var = q0.j0.f15033d;
            xVar = this.f3957e;
            list = v2.a0.f15605e;
        }
        q0.j0 j0Var2 = j0Var;
        t0.x xVar3 = xVar;
        List list2 = list;
        if (z) {
            C0134J c0134j = this.f3932I;
            if (!c0134j.f3911c || c0134j.f3912d == 5) {
                c0134j.f3910b = true;
                c0134j.f3911c = true;
                c0134j.f3912d = i4;
            } else {
                AbstractC0124a.h(i4 == 5);
            }
        }
        g0 g0Var2 = this.f3931H;
        return g0Var2.d(c1353b, j4, j5, j6, o(g0Var2.f4153q), j0Var2, xVar3, list2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x02a2, code lost:
    
        if (((long) ((r3.e() - r23.f3945W) / r23.n.e().f2664a)) > 10000000) goto L255;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0238  */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, q0.z] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, q0.z] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, q0.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0() {
        T t4;
        long j4;
        T t5;
        T t6;
        n0[] n0VarArr;
        V v;
        boolean z;
        T t7;
        T t8;
        T a3;
        boolean z4;
        int i4;
        n0[] n0VarArr2;
        int i5;
        boolean z5;
        boolean z6;
        char c4;
        int i6;
        int i7;
        T t9;
        T t10;
        boolean z7;
        int i8;
        if (this.f3931H.f4139a.p() || !this.f3971s.f4120k) {
            return;
        }
        this.f3970r.m(this.f3945W);
        V v4 = this.f3970r;
        T t11 = v4.f4023l;
        if (t11 == null || (!t11.f3994g.f4011j && t11.g() && v4.f4023l.f3994g.f4006e != -9223372036854775807L && v4.n < 100)) {
            V v5 = this.f3970r;
            long j5 = this.f3945W;
            g0 g0Var = this.f3931H;
            T t12 = v5.f4023l;
            U d4 = t12 == null ? v5.d(g0Var.f4139a, g0Var.f4140b, g0Var.f4141c, g0Var.f4155s) : v5.c(g0Var.f4139a, t12, j5);
            if (d4 != null) {
                V v6 = this.f3970r;
                T t13 = v6.f4023l;
                long j6 = t13 == null ? 1000000000000L : (t13.f4001p + t13.f3994g.f4006e) - d4.f4003b;
                int i9 = 0;
                while (true) {
                    if (i9 >= v6.f4026q.size()) {
                        t4 = null;
                        break;
                    }
                    U u4 = ((T) v6.f4026q.get(i9)).f3994g;
                    long j7 = u4.f4006e;
                    long j8 = d4.f4006e;
                    if ((j7 == -9223372036854775807L || j7 == j8) && u4.f4003b == d4.f4003b && u4.f4002a.equals(d4.f4002a)) {
                        t4 = (T) v6.f4026q.remove(i9);
                        break;
                    }
                    i9++;
                }
                if (t4 == null) {
                    M m4 = (M) v6.f4016e.f331b;
                    AbstractC0135a[] abstractC0135aArr = m4.f3951b;
                    t0.w wVar = m4.f3955d;
                    O o = m4.f3959f;
                    b0.i iVar = m4.v;
                    C0141g c0141g = (C0141g) o;
                    c0141g.getClass();
                    j4 = -9223372036854775807L;
                    B1.j jVar = new B1.j(c0141g, iVar);
                    f0 f0Var = m4.f3971s;
                    t0.x xVar = m4.f3957e;
                    m4.f3954c0.getClass();
                    t4 = new T(abstractC0135aArr, j6, wVar, jVar, f0Var, d4, xVar);
                } else {
                    j4 = -9223372036854775807L;
                    t4.f3994g = d4;
                    t4.f4001p = j6;
                }
                T t14 = v6.f4023l;
                if (t14 == null) {
                    v6.f4020i = t4;
                    v6.f4021j = t4;
                    v6.f4022k = t4;
                } else if (t4 != t14.f4000m) {
                    t14.b();
                    t14.f4000m = t4;
                    t14.c();
                }
                v6.o = null;
                v6.f4023l = t4;
                v6.n++;
                v6.l();
                if (!t4.f3991d) {
                    long j9 = d4.f4003b;
                    t4.f3991d = true;
                    t4.f3988a.f(this, j9);
                } else if (t4.f3992e) {
                    this.f3962h.a(8, t4.f3988a).b();
                }
                if (this.f3970r.f4020i == t4) {
                    Q(d4.f4003b, true);
                }
                u(false);
                if (this.f3937O) {
                    C();
                } else {
                    this.f3937O = z(this.f3970r.f4023l);
                    v0();
                }
                V v7 = this.f3970r;
                if (!this.L && this.f3976y && !this.f3958e0 && !d() && (t9 = v7.f4022k) != null && t9 == v7.f4021j && (t10 = t9.f4000m) != null && (z7 = t10.f3992e)) {
                    AbstractC0124a.t(z7);
                    if (((long) ((t10.e() - this.f3945W) / this.n.e().f2664a)) <= 10000000) {
                        T t15 = v7.f4022k;
                        t15.getClass();
                        v7.f4022k = t15.f4000m;
                        v7.l();
                        v7.f4022k.getClass();
                        n0[] n0VarArr3 = this.f3949a;
                        T t16 = v7.f4022k;
                        if (t16 != null) {
                            t0.x xVar2 = t16.o;
                            for (int i10 = 0; i10 < n0VarArr3.length; i10++) {
                                if (xVar2.b(i10)) {
                                    n0 n0Var = n0VarArr3[i10];
                                    if (((AbstractC0135a) n0Var.f4203f) != null && !n0Var.f()) {
                                        n0 n0Var2 = n0VarArr3[i10];
                                        AbstractC0124a.t(!n0Var2.f());
                                        if (n0.h((AbstractC0135a) n0Var2.f4202e)) {
                                            i8 = 3;
                                        } else {
                                            AbstractC0135a abstractC0135a = (AbstractC0135a) n0Var2.f4203f;
                                            i8 = (abstractC0135a == null || abstractC0135a.f4044h == 0) ? 2 : 4;
                                        }
                                        n0Var2.f4201d = i8;
                                        i(t16, i10, false, t16.e());
                                    }
                                }
                            }
                            if (d()) {
                                this.f3956d0 = t16.f3988a.q();
                                if (!t16.g()) {
                                    v7.n(t16);
                                    u(false);
                                    C();
                                }
                            }
                        }
                    }
                }
                boolean z8 = this.f3976y;
                n0[] n0VarArr4 = this.f3949a;
                V v8 = this.f3970r;
                t5 = v8.f4021j;
                if (t5 != null) {
                    if (t5.f4000m == null || this.L) {
                        if (t5.f3994g.f4011j || this.L) {
                            for (n0 n0Var3 : n0VarArr4) {
                                if (n0Var3.d(t5) != null) {
                                    AbstractC0135a d5 = n0Var3.d(t5);
                                    d5.getClass();
                                    if (d5.l()) {
                                        long j10 = t5.f3994g.f4006e;
                                        long j11 = (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : j10 + t5.f4001p;
                                        AbstractC0135a d6 = n0Var3.d(t5);
                                        d6.getClass();
                                        n0.l(d6, j11);
                                    }
                                }
                            }
                        }
                    } else if (t5.f3992e) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < n0VarArr4.length) {
                                n0 n0Var4 = n0VarArr4[i11];
                                if (!n0Var4.e(t5, (AbstractC0135a) n0Var4.f4202e) || !n0Var4.e(t5, (AbstractC0135a) n0Var4.f4203f)) {
                                    break;
                                } else {
                                    i11++;
                                }
                            } else if (!d() || v8.f4022k != v8.f4021j) {
                                T t17 = t5.f4000m;
                                if (t17.f3992e || this.f3945W >= t17.e()) {
                                    boolean z9 = t5.f4000m.f3992e;
                                    if (z9) {
                                        AbstractC0124a.t(z9);
                                    }
                                    t0.x xVar3 = t5.o;
                                    T t18 = v8.f4022k;
                                    T t19 = v8.f4021j;
                                    if (t18 == t19) {
                                        t19.getClass();
                                        v8.f4022k = t19.f4000m;
                                    }
                                    T t20 = v8.f4021j;
                                    t20.getClass();
                                    v8.f4021j = t20.f4000m;
                                    v8.l();
                                    T t21 = v8.f4021j;
                                    t21.getClass();
                                    t0.x xVar4 = t21.o;
                                    T.T t22 = this.f3931H.f4139a;
                                    B0(t22, t21.f3994g.f4002a, t22, t5.f3994g.f4002a, -9223372036854775807L, false);
                                    if (t21.f3992e && ((z8 && this.f3956d0 != j4) || t21.f3988a.q() != j4)) {
                                        this.f3956d0 = j4;
                                        boolean z10 = z8 && !this.f3958e0;
                                        if (z10) {
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= n0VarArr4.length) {
                                                    break;
                                                }
                                                boolean b4 = xVar4.b(i12);
                                                t0.t[] tVarArr = xVar4.f15386c;
                                                if (b4 && ((AbstractC0135a) n0VarArr4[i12].f4202e).f4038b != -2 && !T.F.a(tVarArr[i12].l().n, tVarArr[i12].l().f2866k) && !n0VarArr4[i12].f()) {
                                                    z10 = false;
                                                    break;
                                                }
                                                i12++;
                                            }
                                        }
                                        if (!z10) {
                                            long e4 = t21.e();
                                            for (n0 n0Var5 : n0VarArr4) {
                                                AbstractC0135a abstractC0135a2 = (AbstractC0135a) n0Var5.f4203f;
                                                AbstractC0135a abstractC0135a3 = (AbstractC0135a) n0Var5.f4202e;
                                                if (n0.h(abstractC0135a3) && (i7 = n0Var5.f4201d) != 4 && i7 != 2) {
                                                    n0.l(abstractC0135a3, e4);
                                                }
                                                if (abstractC0135a2 != null) {
                                                    if ((abstractC0135a2.f4044h != 0) && n0Var5.f4201d != 3) {
                                                        n0.l(abstractC0135a2, e4);
                                                    }
                                                }
                                            }
                                            if (!t21.g()) {
                                                v8.n(t21);
                                                u(false);
                                                C();
                                            }
                                        }
                                    }
                                    for (n0 n0Var6 : n0VarArr4) {
                                        long e5 = t21.e();
                                        AbstractC0135a abstractC0135a4 = (AbstractC0135a) n0Var6.f4202e;
                                        int i13 = n0Var6.f4200c;
                                        boolean b5 = xVar3.b(i13);
                                        boolean b6 = xVar4.b(i13);
                                        AbstractC0135a abstractC0135a5 = (AbstractC0135a) n0Var6.f4203f;
                                        if (abstractC0135a5 == null || (i6 = n0Var6.f4201d) == 3 || (i6 == 0 && n0.h(abstractC0135a4))) {
                                            abstractC0135a5 = abstractC0135a4;
                                        }
                                        if (!b5 || abstractC0135a5.n) {
                                            c4 = 65534;
                                        } else {
                                            int i14 = abstractC0135a4.f4038b;
                                            c4 = 65534;
                                            boolean z11 = i14 == -2;
                                            m0 m0Var = xVar3.f15385b[i13];
                                            m0 m0Var2 = xVar4.f15385b[i13];
                                            if (!b6 || !Objects.equals(m0Var2, m0Var) || z11 || n0Var6.f()) {
                                                n0.l(abstractC0135a5, e5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                V v9 = this.f3970r;
                t6 = v9.f4021j;
                if (t6 != null && v9.f4020i != t6 && !t6.f3995h) {
                    n0VarArr2 = this.f3949a;
                    t0.x xVar5 = t6.o;
                    z5 = true;
                    for (i5 = 0; i5 < n0VarArr2.length; i5++) {
                        int c5 = n0VarArr2[i5].c();
                        n0 n0Var7 = n0VarArr2[i5];
                        C0142h c0142h = this.n;
                        int j12 = n0Var7.j((AbstractC0135a) n0Var7.f4202e, t6, xVar5, c0142h);
                        int j13 = n0Var7.j((AbstractC0135a) n0Var7.f4203f, t6, xVar5, c0142h);
                        if (j12 == 1) {
                            j12 = j13;
                        }
                        if ((j12 & 2) != 0 && (z6 = this.f3942T) && z6) {
                            this.f3942T = false;
                            if (this.f3931H.f4152p) {
                                this.f3962h.e(2);
                            }
                        }
                        this.f3943U -= c5 - n0VarArr2[i5].c();
                        z5 &= (j12 & 1) != 0;
                    }
                    if (z5) {
                        for (int i15 = 0; i15 < n0VarArr2.length; i15++) {
                            if (xVar5.b(i15)) {
                                if (!(n0VarArr2[i15].d(t6) != null)) {
                                    i(t6, i15, false, t6.e());
                                }
                            }
                        }
                    }
                    if (z5) {
                        v9.f4021j.f3995h = true;
                    }
                }
                n0VarArr = this.f3949a;
                v = this.f3970r;
                z = false;
                while (q0() && !this.L && (t7 = v.f4020i) != null && (t8 = t7.f4000m) != null && this.f3945W >= t8.e() && t8.f3995h) {
                    if (z) {
                        E();
                    }
                    this.f3958e0 = false;
                    a3 = v.a();
                    a3.getClass();
                    if (this.f3931H.f4140b.f14812a.equals(a3.f3994g.f4002a.f14812a)) {
                        C1353B c1353b = this.f3931H.f4140b;
                        if (c1353b.f14813b == -1) {
                            C1353B c1353b2 = a3.f3994g.f4002a;
                            if (c1353b2.f14813b == -1 && c1353b.f14816e != c1353b2.f14816e) {
                                z4 = true;
                                U u5 = a3.f3994g;
                                boolean z12 = z4;
                                C1353B c1353b3 = u5.f4002a;
                                long j14 = u5.f4003b;
                                this.f3931H = y(c1353b3, j14, u5.f4004c, j14, !z12, 0);
                                P();
                                A0();
                                if (d() && a3 == v.f4022k) {
                                    for (n0 n0Var8 : n0VarArr) {
                                        int i16 = n0Var8.f4201d;
                                        if (i16 == 3 || i16 == 4) {
                                            boolean z13 = i16 == 4;
                                            AbstractC0135a abstractC0135a6 = (AbstractC0135a) n0Var8.f4202e;
                                            AbstractC0135a abstractC0135a7 = (AbstractC0135a) n0Var8.f4203f;
                                            if (z13) {
                                                abstractC0135a7.getClass();
                                                abstractC0135a7.c(17, abstractC0135a6);
                                            } else {
                                                abstractC0135a7.getClass();
                                                abstractC0135a6.c(17, abstractC0135a7);
                                            }
                                            n0Var8.f4201d = n0Var8.f4201d == 4 ? 0 : 1;
                                        } else if (i16 == 2) {
                                            n0Var8.f4201d = 0;
                                        }
                                    }
                                }
                                if (this.f3931H.f4143e == 3) {
                                    s0();
                                }
                                t0.x xVar6 = v.f4020i.o;
                                for (i4 = 0; i4 < n0VarArr.length; i4++) {
                                    if (xVar6.b(i4)) {
                                        n0 n0Var9 = n0VarArr[i4];
                                        AbstractC0135a abstractC0135a8 = (AbstractC0135a) n0Var9.f4203f;
                                        AbstractC0135a abstractC0135a9 = (AbstractC0135a) n0Var9.f4202e;
                                        if (n0.h(abstractC0135a9)) {
                                            abstractC0135a9.h();
                                        } else if (abstractC0135a8 != null) {
                                            if (abstractC0135a8.f4044h != 0) {
                                                abstractC0135a8.h();
                                            }
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    z4 = false;
                    U u52 = a3.f3994g;
                    boolean z122 = z4;
                    C1353B c1353b32 = u52.f4002a;
                    long j142 = u52.f4003b;
                    this.f3931H = y(c1353b32, j142, u52.f4004c, j142, !z122, 0);
                    P();
                    A0();
                    if (d()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.f3931H.f4143e == 3) {
                    }
                    t0.x xVar62 = v.f4020i.o;
                    while (i4 < n0VarArr.length) {
                    }
                    z = true;
                }
                this.f3954c0.getClass();
            }
        }
        j4 = -9223372036854775807L;
        if (this.f3937O) {
        }
        V v72 = this.f3970r;
        if (!this.L) {
            AbstractC0124a.t(z7);
            if (((long) ((t10.e() - this.f3945W) / this.n.e().f2664a)) <= 10000000) {
            }
        }
        boolean z82 = this.f3976y;
        n0[] n0VarArr42 = this.f3949a;
        V v82 = this.f3970r;
        t5 = v82.f4021j;
        if (t5 != null) {
        }
        V v92 = this.f3970r;
        t6 = v92.f4021j;
        if (t6 != null) {
            n0VarArr2 = this.f3949a;
            t0.x xVar52 = t6.o;
            z5 = true;
            while (i5 < n0VarArr2.length) {
            }
            if (z5) {
            }
            if (z5) {
            }
        }
        n0VarArr = this.f3949a;
        v = this.f3970r;
        z = false;
        while (q0()) {
            if (z) {
            }
            this.f3958e0 = false;
            a3 = v.a();
            a3.getClass();
            if (this.f3931H.f4140b.f14812a.equals(a3.f3994g.f4002a.f14812a)) {
            }
            z4 = false;
            U u522 = a3.f3994g;
            boolean z1222 = z4;
            C1353B c1353b322 = u522.f4002a;
            long j1422 = u522.f4003b;
            this.f3931H = y(c1353b322, j1422, u522.f4004c, j1422, !z1222, 0);
            P();
            A0();
            if (d()) {
            }
            if (this.f3931H.f4143e == 3) {
            }
            t0.x xVar622 = v.f4020i.o;
            while (i4 < n0VarArr.length) {
            }
            z = true;
        }
        this.f3954c0.getClass();
    }

    public final void z0(int i4, int i5, int i6, boolean z) {
        boolean z4 = z && i4 != -1;
        if (i4 == -1) {
            i6 = 2;
        } else if (i6 == 2) {
            i6 = 1;
        }
        boolean z5 = this.f3927D;
        if (i4 == 0) {
            i5 = 1;
        } else if (i5 == 1) {
            i5 = z5 ? 4 : 0;
        }
        g0 g0Var = this.f3931H;
        if (g0Var.f4150l == z4 && g0Var.n == i5 && g0Var.f4151m == i6) {
            return;
        }
        this.f3931H = g0Var.e(i6, z4, i5);
        C0(false, false);
        V v = this.f3970r;
        for (T t4 = v.f4020i; t4 != null; t4 = t4.f4000m) {
            for (t0.t tVar : t4.o.f15386c) {
                if (tVar != null) {
                    tVar.e(z4);
                }
            }
        }
        if (!q0()) {
            u0();
            A0();
            g0 g0Var2 = this.f3931H;
            if (g0Var2.f4152p) {
                this.f3931H = g0Var2.i(false);
            }
            v.m(this.f3945W);
            return;
        }
        int i7 = this.f3931H.f4143e;
        W.F f4 = this.f3962h;
        if (i7 != 3) {
            if (i7 == 2) {
                f4.e(2);
            }
        } else {
            C0142h c0142h = this.n;
            c0142h.f4162f = true;
            c0142h.f4157a.f();
            s0();
            f4.e(2);
        }
    }
}
