package a0;

import T.C0086d;
import T.C0091i;
import T.C0095m;
import T.C0097o;
import T.C0107z;
import W.AbstractC0108a;
import W.C0112e;
import W.InterfaceC0118k;
import a.AbstractC0124a;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import b0.C0255a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import q0.C1353B;
import q0.InterfaceC1352A;
import v2.C1470q;

/* renamed from: a0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130F extends E0.e implements InterfaceC0151q {

    /* renamed from: A, reason: collision with root package name */
    public final W.M f3846A;

    /* renamed from: B, reason: collision with root package name */
    public final W.M f3847B;

    /* renamed from: C, reason: collision with root package name */
    public final long f3848C;

    /* renamed from: D, reason: collision with root package name */
    public final K3.n f3849D;

    /* renamed from: E, reason: collision with root package name */
    public final W.B f3850E;

    /* renamed from: F, reason: collision with root package name */
    public final B1.j f3851F;

    /* renamed from: G, reason: collision with root package name */
    public final l2.e f3852G;

    /* renamed from: H, reason: collision with root package name */
    public final l2.e f3853H;

    /* renamed from: I, reason: collision with root package name */
    public int f3854I;

    /* renamed from: J, reason: collision with root package name */
    public int f3855J;

    /* renamed from: K, reason: collision with root package name */
    public int f3856K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public final o0 f3857M;

    /* renamed from: N, reason: collision with root package name */
    public final p0 f3858N;

    /* renamed from: O, reason: collision with root package name */
    public q0.e0 f3859O;

    /* renamed from: P, reason: collision with root package name */
    public final C0150p f3860P;

    /* renamed from: Q, reason: collision with root package name */
    public T.J f3861Q;

    /* renamed from: R, reason: collision with root package name */
    public T.C f3862R;

    /* renamed from: S, reason: collision with root package name */
    public C0097o f3863S;

    /* renamed from: T, reason: collision with root package name */
    public Object f3864T;

    /* renamed from: U, reason: collision with root package name */
    public Surface f3865U;

    /* renamed from: V, reason: collision with root package name */
    public SurfaceHolder f3866V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3867W;

    /* renamed from: X, reason: collision with root package name */
    public final int f3868X;

    /* renamed from: Y, reason: collision with root package name */
    public W.v f3869Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0086d f3870Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f3871a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3872b0;

    /* renamed from: c, reason: collision with root package name */
    public final t0.x f3873c;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f3874c0;

    /* renamed from: d, reason: collision with root package name */
    public final T.J f3875d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3876d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0112e f3877e = new C0112e();

    /* renamed from: e0, reason: collision with root package name */
    public final int f3878e0;

    /* renamed from: f, reason: collision with root package name */
    public final Context f3879f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3880f0;

    /* renamed from: g, reason: collision with root package name */
    public final C0130F f3881g;

    /* renamed from: g0, reason: collision with root package name */
    public T.e0 f3882g0;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0135a[] f3883h;

    /* renamed from: h0, reason: collision with root package name */
    public T.C f3884h0;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0135a[] f3885i;

    /* renamed from: i0, reason: collision with root package name */
    public g0 f3886i0;

    /* renamed from: j, reason: collision with root package name */
    public final t0.w f3887j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3888j0;

    /* renamed from: k, reason: collision with root package name */
    public final W.F f3889k;

    /* renamed from: k0, reason: collision with root package name */
    public long f3890k0;

    /* renamed from: l, reason: collision with root package name */
    public final C0156w f3891l;

    /* renamed from: m, reason: collision with root package name */
    public final M f3892m;
    public final W.n n;
    public final CopyOnWriteArraySet o;

    /* renamed from: p, reason: collision with root package name */
    public final T.Q f3893p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f3894q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3895r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1352A f3896s;

    /* renamed from: t, reason: collision with root package name */
    public final b0.d f3897t;

    /* renamed from: u, reason: collision with root package name */
    public final Looper f3898u;
    public final u0.d v;

    /* renamed from: w, reason: collision with root package name */
    public final W.D f3899w;

    /* renamed from: x, reason: collision with root package name */
    public final SurfaceHolderCallbackC0125A f3900x;

    /* renamed from: y, reason: collision with root package name */
    public final C0126B f3901y;
    public final U.b z;

    static {
        T.A.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x033a A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:3:0x0017, B:6:0x0095, B:7:0x009e, B:9:0x00a4, B:11:0x00b2, B:13:0x0139, B:15:0x0146, B:16:0x016e, B:18:0x0174, B:20:0x018a, B:21:0x0266, B:23:0x026c, B:30:0x0276, B:33:0x027f, B:35:0x0295, B:36:0x02ac, B:38:0x02eb, B:40:0x02ef, B:42:0x02f3, B:46:0x02fb, B:49:0x0311, B:52:0x0320, B:55:0x032c, B:57:0x033a, B:58:0x0342, B:64:0x0325, B:66:0x030a), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0325 A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:3:0x0017, B:6:0x0095, B:7:0x009e, B:9:0x00a4, B:11:0x00b2, B:13:0x0139, B:15:0x0146, B:16:0x016e, B:18:0x0174, B:20:0x018a, B:21:0x0266, B:23:0x026c, B:30:0x0276, B:33:0x027f, B:35:0x0295, B:36:0x02ac, B:38:0x02eb, B:40:0x02ef, B:42:0x02f3, B:46:0x02fb, B:49:0x0311, B:52:0x0320, B:55:0x032c, B:57:0x033a, B:58:0x0342, B:64:0x0325, B:66:0x030a), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030a A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:3:0x0017, B:6:0x0095, B:7:0x009e, B:9:0x00a4, B:11:0x00b2, B:13:0x0139, B:15:0x0146, B:16:0x016e, B:18:0x0174, B:20:0x018a, B:21:0x0266, B:23:0x026c, B:30:0x0276, B:33:0x027f, B:35:0x0295, B:36:0x02ac, B:38:0x02eb, B:40:0x02ef, B:42:0x02f3, B:46:0x02fb, B:49:0x0311, B:52:0x0320, B:55:0x032c, B:57:0x033a, B:58:0x0342, B:64:0x0325, B:66:0x030a), top: B:2:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0130F(C0149o c0149o) {
        B1.j jVar;
        boolean z;
        W.M m4;
        W.M m5;
        boolean z4;
        try {
            AbstractC0108a.j("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.2] [" + W.J.f3263a + "]");
            Context context = c0149o.f4204a;
            Looper looper = c0149o.f4210g;
            W.D d4 = c0149o.f4205b;
            this.f3879f = context.getApplicationContext();
            this.f3897t = new b0.d(d4);
            this.f3878e0 = c0149o.f4211h;
            this.f3870Z = c0149o.f4212i;
            this.f3868X = c0149o.f4213j;
            this.f3872b0 = false;
            this.f3848C = c0149o.f4217p;
            SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A = new SurfaceHolderCallbackC0125A(this);
            this.f3900x = surfaceHolderCallbackC0125A;
            this.f3901y = new C0126B();
            AbstractC0135a[] a3 = ((C0143i) c0149o.f4206c.get()).a(new Handler(looper), surfaceHolderCallbackC0125A, surfaceHolderCallbackC0125A, surfaceHolderCallbackC0125A, surfaceHolderCallbackC0125A);
            this.f3883h = a3;
            AbstractC0124a.t(a3.length > 0);
            this.f3885i = new AbstractC0135a[a3.length];
            int i4 = 0;
            while (true) {
                AbstractC0135a[] abstractC0135aArr = this.f3885i;
                if (i4 >= abstractC0135aArr.length) {
                    break;
                }
                int i5 = this.f3883h[i4].f4038b;
                abstractC0135aArr[i4] = null;
                i4++;
            }
            this.f3887j = (t0.w) c0149o.f4208e.get();
            this.f3896s = (InterfaceC1352A) c0149o.f4207d.get();
            this.v = (u0.d) c0149o.f4209f.get();
            this.f3895r = c0149o.f4214k;
            this.f3858N = c0149o.f4215l;
            this.f3857M = c0149o.f4216m;
            this.f3898u = looper;
            this.f3899w = d4;
            this.f3881g = this;
            this.n = new W.n(new CopyOnWriteArraySet(), looper, looper.getThread(), d4, new C0156w(this), true);
            this.o = new CopyOnWriteArraySet();
            this.f3894q = new ArrayList();
            this.f3859O = new q0.e0();
            this.f3860P = C0150p.f4227a;
            AbstractC0135a[] abstractC0135aArr2 = this.f3883h;
            this.f3873c = new t0.x(new m0[abstractC0135aArr2.length], new t0.t[abstractC0135aArr2.length], T.a0.f2764b, null);
            this.f3893p = new T.Q();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i6 = 0; i6 < 20; i6++) {
                int i7 = iArr[i6];
                AbstractC0124a.t(!false);
                sparseBooleanArray.append(i7, true);
            }
            this.f3887j.getClass();
            AbstractC0124a.t(!false);
            sparseBooleanArray.append(29, true);
            AbstractC0124a.t(!false);
            C0095m c0095m = new C0095m(sparseBooleanArray);
            SparseBooleanArray sparseBooleanArray2 = c0095m.f2805a;
            this.f3875d = new T.J(c0095m);
            SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
            for (int i8 = 0; i8 < sparseBooleanArray2.size(); i8++) {
                AbstractC0124a.m(i8, sparseBooleanArray2.size());
                int keyAt = sparseBooleanArray2.keyAt(i8);
                AbstractC0124a.t(!false);
                sparseBooleanArray3.append(keyAt, true);
            }
            AbstractC0124a.t(!false);
            sparseBooleanArray3.append(4, true);
            AbstractC0124a.t(!false);
            sparseBooleanArray3.append(10, true);
            AbstractC0124a.t(!false);
            this.f3861Q = new T.J(new C0095m(sparseBooleanArray3));
            this.f3889k = this.f3899w.a(this.f3898u, null);
            C0156w c0156w = new C0156w(this);
            this.f3891l = c0156w;
            this.f3886i0 = g0.k(this.f3873c);
            this.f3897t.m(this.f3881g, this.f3898u);
            final b0.i iVar = new b0.i(c0149o.f4223w);
            M m6 = new M(this.f3879f, this.f3883h, this.f3885i, this.f3887j, this.f3873c, new C0141g(), this.v, this.f3854I, this.f3897t, this.f3858N, c0149o.n, c0149o.o, this.f3898u, this.f3899w, c0156w, iVar, this.f3860P, this.f3901y, c0149o.f4224x);
            W.F f4 = m6.f3962h;
            this.f3892m = m6;
            Looper looper2 = m6.f3964j;
            this.f3871a0 = 1.0f;
            this.f3854I = 0;
            T.C c4 = T.C.f2631B;
            this.f3862R = c4;
            this.f3884h0 = c4;
            this.f3888j0 = -1;
            C1470q c1470q = V.c.f3163b;
            this.f3874c0 = true;
            b0.d dVar = this.f3897t;
            W.n nVar = this.n;
            dVar.getClass();
            nVar.a(dVar);
            u0.d dVar2 = this.v;
            Handler handler = new Handler(this.f3898u);
            b0.d dVar3 = this.f3897t;
            u0.g gVar = (u0.g) dVar2;
            gVar.getClass();
            dVar3.getClass();
            e0.t tVar = gVar.f15456c;
            tVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) tVar.f8416a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                u0.c cVar = (u0.c) it.next();
                if (cVar.f15439b == dVar3) {
                    cVar.f15440c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new u0.c(handler, dVar3));
            this.o.add(this.f3900x);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 31) {
                final Context context2 = this.f3879f;
                final boolean z5 = c0149o.f4222u;
                jVar = null;
                this.f3899w.a(m6.f3964j, null).c(new Runnable() { // from class: a0.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlaybackSession createPlaybackSession;
                        b0.h hVar;
                        LogSessionId sessionId;
                        boolean equals;
                        LogSessionId unused;
                        Context context3 = context2;
                        boolean z6 = z5;
                        C0130F c0130f = this;
                        b0.i iVar2 = iVar;
                        MediaMetricsManager b4 = W.o.b(context3.getSystemService("media_metrics"));
                        if (b4 == null) {
                            hVar = null;
                        } else {
                            createPlaybackSession = b4.createPlaybackSession();
                            hVar = new b0.h(context3, createPlaybackSession);
                        }
                        if (hVar == null) {
                            AbstractC0108a.s("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z6) {
                            b0.d dVar4 = c0130f.f3897t;
                            dVar4.getClass();
                            dVar4.f5274f.a(hVar);
                        }
                        sessionId = hVar.f5299d.getSessionId();
                        synchronized (iVar2) {
                            t1.h hVar2 = iVar2.f5320b;
                            hVar2.getClass();
                            LogSessionId logSessionId = (LogSessionId) hVar2.f15398b;
                            unused = LogSessionId.LOG_SESSION_ID_NONE;
                            equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                            AbstractC0124a.t(equals);
                            hVar2.f15398b = sessionId;
                        }
                    }
                });
            } else {
                jVar = null;
            }
            B1.j jVar2 = jVar;
            K3.n nVar2 = new K3.n(0, looper2, this.f3898u, this.f3899w, new C0156w(this));
            this.f3849D = nVar2;
            nVar2.g(new R1.n(4, this));
            U.b bVar = new U.b(c0149o.f4204a, looper2, c0149o.f4210g, this.f3900x, this.f3899w);
            this.z = bVar;
            bVar.a();
            if (c0149o.f4218q != Integer.MAX_VALUE && c0149o.f4219r != Integer.MAX_VALUE && c0149o.f4220s != Integer.MAX_VALUE && c0149o.f4221t != Integer.MAX_VALUE) {
                z = 1;
                m4 = new W.M(context, looper2, this.f3899w, 0);
                this.f3846A = m4;
                if (m4.f3287d == z) {
                    m4.f3287d = z;
                    m4.a(z, m4.f3288e);
                }
                m5 = new W.M(context, looper2, this.f3899w, 1);
                this.f3847B = m5;
                z4 = z != 2;
                if (m5.f3287d == z4) {
                    m5.f3287d = z4;
                    m5.b(z4, m5.f3288e);
                }
                int i10 = C0091i.f2792c;
                this.f3882g0 = T.e0.f2775d;
                this.f3869Y = W.v.f3354c;
                this.f3851F = i9 < 34 ? new B1.j(this, context) : jVar2;
                this.f3852G = new l2.e(23);
                this.f3853H = new l2.e(23);
                this.f3850E = new W.B(this, this.f3900x, this.f3899w, c0149o.f4218q, c0149o.f4219r, c0149o.f4220s, c0149o.f4221t);
                f4.a(38, this.f3857M).b();
                C0086d c0086d = this.f3870Z;
                f4.getClass();
                W.E b4 = W.F.b();
                b4.f3255a = f4.f3257a.obtainMessage(31, 0, 0, c0086d);
                b4.b();
                D(1, 3, this.f3870Z);
                D(2, 4, Integer.valueOf(this.f3868X));
                D(2, 5, 0);
                D(1, 9, Boolean.valueOf(this.f3872b0));
                D(6, 8, this.f3901y);
                D(-1, 16, Integer.valueOf(this.f3878e0));
                this.f3877e.c();
            }
            z = 0;
            m4 = new W.M(context, looper2, this.f3899w, 0);
            this.f3846A = m4;
            if (m4.f3287d == z) {
            }
            m5 = new W.M(context, looper2, this.f3899w, 1);
            this.f3847B = m5;
            if (z != 2) {
            }
            if (m5.f3287d == z4) {
            }
            int i102 = C0091i.f2792c;
            this.f3882g0 = T.e0.f2775d;
            this.f3869Y = W.v.f3354c;
            this.f3851F = i9 < 34 ? new B1.j(this, context) : jVar2;
            this.f3852G = new l2.e(23);
            this.f3853H = new l2.e(23);
            this.f3850E = new W.B(this, this.f3900x, this.f3899w, c0149o.f4218q, c0149o.f4219r, c0149o.f4220s, c0149o.f4221t);
            f4.a(38, this.f3857M).b();
            C0086d c0086d2 = this.f3870Z;
            f4.getClass();
            W.E b42 = W.F.b();
            b42.f3255a = f4.f3257a.obtainMessage(31, 0, 0, c0086d2);
            b42.b();
            D(1, 3, this.f3870Z);
            D(2, 4, Integer.valueOf(this.f3868X));
            D(2, 5, 0);
            D(1, 9, Boolean.valueOf(this.f3872b0));
            D(6, 8, this.f3901y);
            D(-1, 16, Integer.valueOf(this.f3878e0));
            this.f3877e.c();
        } catch (Throwable th) {
            this.f3877e.c();
            throw th;
        }
    }

    public static long v(g0 g0Var) {
        T.S s4 = new T.S();
        T.Q q4 = new T.Q();
        g0Var.f4139a.g(g0Var.f4140b.f14812a, q4);
        long j4 = g0Var.f4141c;
        return j4 == -9223372036854775807L ? g0Var.f4139a.m(q4.f2683c, s4, 0L).f2701l : q4.f2685e + j4;
    }

    public static g0 x(g0 g0Var, int i4) {
        g0 h2 = g0Var.h(i4);
        return (i4 == 1 || i4 == 4) ? h2.b(false) : h2;
    }

    public final void A(final int i4, final int i5) {
        W.v vVar = this.f3869Y;
        if (i4 == vVar.f3355a && i5 == vVar.f3356b) {
            return;
        }
        this.f3869Y = new W.v(i4, i5);
        this.n.e(24, new InterfaceC0118k() { // from class: a0.u
            @Override // W.InterfaceC0118k
            public final void invoke(Object obj) {
                ((T.L) obj).onSurfaceSizeChanged(i4, i5);
            }
        });
        D(2, 14, new W.v(i4, i5));
    }

    public final void B() {
        L();
        g0 g0Var = this.f3886i0;
        if (g0Var.f4143e != 1) {
            return;
        }
        g0 f4 = g0Var.f(null);
        g0 x4 = x(f4, f4.f4139a.p() ? 4 : 2);
        this.f3855J++;
        W.F f5 = this.f3892m.f3962h;
        f5.getClass();
        W.E b4 = W.F.b();
        b4.f3255a = f5.f3257a.obtainMessage(29);
        b4.b();
        J(x4, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void C() {
        SurfaceHolder surfaceHolder = this.f3866V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f3900x);
            this.f3866V = null;
        }
    }

    public final void D(int i4, int i5, Object obj) {
        M m4;
        AbstractC0135a[] abstractC0135aArr = this.f3883h;
        int length = abstractC0135aArr.length;
        int i6 = 0;
        while (true) {
            m4 = this.f3892m;
            if (i6 >= length) {
                break;
            }
            AbstractC0135a abstractC0135a = abstractC0135aArr[i6];
            if (i4 == -1 || abstractC0135a.f4038b == i4) {
                int r4 = r(this.f3886i0);
                T.T t4 = this.f3886i0.f4139a;
                if (r4 == -1) {
                    r4 = 0;
                }
                j0 j0Var = new j0(m4, abstractC0135a, t4, r4, m4.f3964j);
                AbstractC0124a.t(!j0Var.f4173f);
                j0Var.f4170c = i5;
                AbstractC0124a.t(!j0Var.f4173f);
                j0Var.f4171d = obj;
                j0Var.b();
            }
            i6++;
        }
        for (AbstractC0135a abstractC0135a2 : this.f3885i) {
            if (abstractC0135a2 != null && (i4 == -1 || abstractC0135a2.f4038b == i4)) {
                int r5 = r(this.f3886i0);
                T.T t5 = this.f3886i0.f4139a;
                if (r5 == -1) {
                    r5 = 0;
                }
                j0 j0Var2 = new j0(m4, abstractC0135a2, t5, r5, m4.f3964j);
                AbstractC0124a.t(!j0Var2.f4173f);
                j0Var2.f4170c = i5;
                AbstractC0124a.t(!j0Var2.f4173f);
                j0Var2.f4171d = obj;
                j0Var2.b();
            }
        }
    }

    public final void E(Surface surface) {
        Object obj = this.f3864T;
        boolean z = true;
        boolean z4 = (obj == null || obj == surface) ? false : true;
        long j4 = z4 ? this.f3848C : -9223372036854775807L;
        M m4 = this.f3892m;
        if (!m4.f3933J && m4.f3964j.getThread().isAlive()) {
            C0112e c0112e = new C0112e(m4.f3968p);
            m4.f3962h.a(30, new Pair(surface, c0112e)).b();
            if (j4 != -9223372036854775807L) {
                z = c0112e.b(j4);
            }
        }
        if (z4) {
            Object obj2 = this.f3864T;
            Surface surface2 = this.f3865U;
            if (obj2 == surface2) {
                surface2.release();
                this.f3865U = null;
            }
        }
        this.f3864T = surface;
        if (z) {
            return;
        }
        G(new C0146l(2, new G1.a("Detaching surface timed out."), 1003));
    }

    public final void F(Surface surface) {
        L();
        C();
        E(surface);
        int i4 = surface == null ? 0 : -1;
        A(i4, i4);
    }

    public final void G(C0146l c0146l) {
        g0 g0Var = this.f3886i0;
        g0 c4 = g0Var.c(g0Var.f4140b);
        c4.f4153q = c4.f4155s;
        c4.f4154r = 0L;
        g0 f4 = x(c4, 1).f(c0146l);
        this.f3855J++;
        W.F f5 = this.f3892m.f3962h;
        f5.getClass();
        W.E b4 = W.F.b();
        b4.f3255a = f5.f3257a.obtainMessage(6);
        b4.b();
        J(f4, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void H() {
        int k4;
        int e4;
        T.J j4 = this.f3861Q;
        String str = W.J.f3263a;
        C0130F c0130f = this.f3881g;
        boolean w4 = c0130f.w();
        T.S s4 = (T.S) c0130f.f471b;
        T.T q4 = c0130f.q();
        boolean z = false;
        boolean z4 = !q4.p() && q4.m(c0130f.m(), s4, 0L).f2697h;
        T.T q5 = c0130f.q();
        if (q5.p()) {
            k4 = -1;
        } else {
            int m4 = c0130f.m();
            c0130f.L();
            int i4 = c0130f.f3854I;
            if (i4 == 1) {
                i4 = 0;
            }
            c0130f.L();
            k4 = q5.k(m4, i4);
        }
        boolean z5 = k4 != -1;
        T.T q6 = c0130f.q();
        if (q6.p()) {
            e4 = -1;
        } else {
            int m5 = c0130f.m();
            c0130f.L();
            int i5 = c0130f.f3854I;
            if (i5 == 1) {
                i5 = 0;
            }
            c0130f.L();
            e4 = q6.e(m5, false, i5);
        }
        boolean z6 = e4 != -1;
        T.T q7 = c0130f.q();
        boolean z7 = !q7.p() && q7.m(c0130f.m(), s4, 0L).a();
        T.T q8 = c0130f.q();
        boolean z8 = !q8.p() && q8.m(c0130f.m(), s4, 0L).f2698i;
        boolean p2 = c0130f.q().p();
        t1.h hVar = new t1.h(21);
        E1.X x4 = (E1.X) hVar.f15398b;
        SparseBooleanArray sparseBooleanArray = this.f3875d.f2667a.f2805a;
        x4.getClass();
        for (int i6 = 0; i6 < sparseBooleanArray.size(); i6++) {
            AbstractC0124a.m(i6, sparseBooleanArray.size());
            x4.a(sparseBooleanArray.keyAt(i6));
        }
        boolean z9 = !w4;
        hVar.h(4, z9);
        hVar.h(5, z4 && !w4);
        hVar.h(6, z5 && !w4);
        hVar.h(7, !p2 && (z5 || !z7 || z4) && !w4);
        hVar.h(8, z6 && !w4);
        hVar.h(9, !p2 && (z6 || (z7 && z8)) && !w4);
        hVar.h(10, z9);
        hVar.h(11, z4 && !w4);
        if (z4 && !w4) {
            z = true;
        }
        hVar.h(12, z);
        T.J j5 = new T.J(x4.b());
        this.f3861Q = j5;
        if (j5.equals(j4)) {
            return;
        }
        this.n.c(13, new C0156w(this));
    }

    public final void I(int i4, boolean z) {
        g0 g0Var = this.f3886i0;
        int i5 = g0Var.n;
        int i6 = (i5 != 1 || z) ? 0 : 1;
        if (g0Var.f4150l == z && i5 == i6 && g0Var.f4151m == i4) {
            return;
        }
        this.f3855J++;
        if (g0Var.f4152p) {
            g0Var = g0Var.a();
        }
        g0 e4 = g0Var.e(i4, z, i6);
        W.F f4 = this.f3892m.f3962h;
        f4.getClass();
        W.E b4 = W.F.b();
        b4.f3255a = f4.f3257a.obtainMessage(1, z ? 1 : 0, i4 | (i6 << 4));
        b4.b();
        J(e4, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void J(final g0 g0Var, final int i4, boolean z, int i5, long j4, int i6) {
        Pair pair;
        int i7;
        final C0107z c0107z;
        boolean z4;
        boolean z5;
        boolean z6;
        int i8;
        int i9;
        Object obj;
        C0107z c0107z2;
        Object obj2;
        long j5;
        long j6;
        long j7;
        long v;
        Object obj3;
        C0107z c0107z3;
        Object obj4;
        g0 g0Var2 = this.f3886i0;
        this.f3886i0 = g0Var;
        boolean equals = g0Var2.f4139a.equals(g0Var.f4139a);
        T.S s4 = (T.S) this.f471b;
        T.Q q4 = this.f3893p;
        T.T t4 = g0Var2.f4139a;
        C1353B c1353b = g0Var2.f4140b;
        T.T t5 = g0Var.f4139a;
        C1353B c1353b2 = g0Var.f4140b;
        if (t5.p() && t4.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (t5.p() != t4.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (t4.m(t4.g(c1353b.f14812a, q4).f2683c, s4, 0L).f2690a.equals(t5.m(t5.g(c1353b2.f14812a, q4).f2683c, s4, 0L).f2690a)) {
            pair = (z && i5 == 0 && c1353b.f14815d < c1353b2.f14815d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i5 == 0) {
                i7 = 1;
            } else if (z && i5 == 1) {
                i7 = 2;
            } else {
                if (equals) {
                    throw new IllegalStateException();
                }
                i7 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i7));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            c0107z = !g0Var.f4139a.p() ? g0Var.f4139a.m(g0Var.f4139a.g(g0Var.f4140b.f14812a, this.f3893p).f2683c, (T.S) this.f471b, 0L).f2692c : null;
            this.f3884h0 = T.C.f2631B;
        } else {
            c0107z = null;
        }
        if (booleanValue || !g0Var2.f4148j.equals(g0Var.f4148j)) {
            T.B a3 = this.f3884h0.a();
            List list = g0Var.f4148j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                T.E e4 = (T.E) list.get(i10);
                int i11 = 0;
                while (true) {
                    T.D[] dArr = e4.f2655a;
                    if (i11 < dArr.length) {
                        dArr[i11].c(a3);
                        i11++;
                    }
                }
            }
            this.f3884h0 = new T.C(a3);
        }
        T.C h2 = h();
        boolean equals2 = h2.equals(this.f3862R);
        this.f3862R = h2;
        boolean z7 = g0Var2.f4150l != g0Var.f4150l;
        boolean z8 = g0Var2.f4143e != g0Var.f4143e;
        if (z8 || z7) {
            K();
        }
        boolean z9 = g0Var2.f4145g != g0Var.f4145g;
        if (!equals) {
            final int i12 = 0;
            this.n.c(0, new InterfaceC0118k() { // from class: a0.r
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj5) {
                    switch (i12) {
                        case 0:
                            ((T.L) obj5).onTimelineChanged(((g0) g0Var).f4139a, i4);
                            break;
                        default:
                            ((T.L) obj5).onMediaItemTransition((C0107z) g0Var, i4);
                            break;
                    }
                }
            });
        }
        if (z) {
            T.Q q5 = new T.Q();
            if (g0Var2.f4139a.p()) {
                z4 = booleanValue;
                z5 = equals2;
                z6 = z8;
                i8 = i6;
                i9 = i8;
                obj = null;
                c0107z2 = null;
                obj2 = null;
            } else {
                Object obj5 = g0Var2.f4140b.f14812a;
                g0Var2.f4139a.g(obj5, q5);
                int i13 = q5.f2683c;
                int b4 = g0Var2.f4139a.b(obj5);
                z4 = booleanValue;
                z5 = equals2;
                z6 = z8;
                obj = g0Var2.f4139a.m(i13, (T.S) this.f471b, 0L).f2690a;
                c0107z2 = ((T.S) this.f471b).f2692c;
                obj2 = obj5;
                i8 = i13;
                i9 = b4;
            }
            if (i5 == 0) {
                if (g0Var2.f4140b.b()) {
                    C1353B c1353b3 = g0Var2.f4140b;
                    j7 = q5.a(c1353b3.f14813b, c1353b3.f14814c);
                    v = v(g0Var2);
                } else if (g0Var2.f4140b.f14816e != -1) {
                    j7 = v(this.f3886i0);
                    v = j7;
                } else {
                    j5 = q5.f2685e;
                    j6 = q5.f2684d;
                    j7 = j5 + j6;
                    v = j7;
                }
            } else if (g0Var2.f4140b.b()) {
                j7 = g0Var2.f4155s;
                v = v(g0Var2);
            } else {
                j5 = q5.f2685e;
                j6 = g0Var2.f4155s;
                j7 = j5 + j6;
                v = j7;
            }
            long Z3 = W.J.Z(j7);
            long Z4 = W.J.Z(v);
            C1353B c1353b4 = g0Var2.f4140b;
            T.M m4 = new T.M(obj, i8, c0107z2, obj2, i9, Z3, Z4, c1353b4.f14813b, c1353b4.f14814c);
            T.S s5 = (T.S) this.f471b;
            int m5 = m();
            int n = n();
            if (this.f3886i0.f4139a.p()) {
                obj3 = null;
                c0107z3 = null;
                obj4 = null;
            } else {
                g0 g0Var3 = this.f3886i0;
                Object obj6 = g0Var3.f4140b.f14812a;
                g0Var3.f4139a.g(obj6, this.f3893p);
                n = this.f3886i0.f4139a.b(obj6);
                Object obj7 = this.f3886i0.f4139a.m(m5, s5, 0L).f2690a;
                c0107z3 = s5.f2692c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i14 = n;
            long Z5 = W.J.Z(j4);
            long Z6 = this.f3886i0.f4140b.b() ? W.J.Z(v(this.f3886i0)) : Z5;
            C1353B c1353b5 = this.f3886i0.f4140b;
            this.n.c(11, new R1.h(m4, new T.M(obj3, m5, c0107z3, obj4, i14, Z5, Z6, c1353b5.f14813b, c1353b5.f14814c), i5));
        } else {
            z4 = booleanValue;
            z5 = equals2;
            z6 = z8;
        }
        if (z4) {
            final int i15 = 1;
            this.n.c(1, new InterfaceC0118k() { // from class: a0.r
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj52) {
                    switch (i15) {
                        case 0:
                            ((T.L) obj52).onTimelineChanged(((g0) c0107z).f4139a, intValue);
                            break;
                        default:
                            ((T.L) obj52).onMediaItemTransition((C0107z) c0107z, intValue);
                            break;
                    }
                }
            });
        }
        if (g0Var2.f4144f != g0Var.f4144f) {
            final int i16 = 7;
            this.n.c(10, new InterfaceC0118k() { // from class: a0.s
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj8) {
                    T.L l4 = (T.L) obj8;
                    switch (i16) {
                        case 0:
                            g0 g0Var4 = g0Var;
                            l4.onLoadingChanged(g0Var4.f4145g);
                            l4.onIsLoadingChanged(g0Var4.f4145g);
                            break;
                        case 1:
                            g0 g0Var5 = g0Var;
                            l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                            break;
                        case 2:
                            l4.onPlaybackStateChanged(g0Var.f4143e);
                            break;
                        case 3:
                            g0 g0Var6 = g0Var;
                            l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                            break;
                        case 4:
                            l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                            break;
                        case 5:
                            l4.onIsPlayingChanged(g0Var.m());
                            break;
                        case 6:
                            l4.onPlaybackParametersChanged(g0Var.o);
                            break;
                        case 7:
                            l4.onPlayerErrorChanged(g0Var.f4144f);
                            break;
                        case 8:
                            l4.onPlayerError(g0Var.f4144f);
                            break;
                        default:
                            l4.onTracksChanged(g0Var.f4147i.f15387d);
                            break;
                    }
                }
            });
            if (g0Var.f4144f != null) {
                final int i17 = 8;
                this.n.c(10, new InterfaceC0118k() { // from class: a0.s
                    @Override // W.InterfaceC0118k
                    public final void invoke(Object obj8) {
                        T.L l4 = (T.L) obj8;
                        switch (i17) {
                            case 0:
                                g0 g0Var4 = g0Var;
                                l4.onLoadingChanged(g0Var4.f4145g);
                                l4.onIsLoadingChanged(g0Var4.f4145g);
                                break;
                            case 1:
                                g0 g0Var5 = g0Var;
                                l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                                break;
                            case 2:
                                l4.onPlaybackStateChanged(g0Var.f4143e);
                                break;
                            case 3:
                                g0 g0Var6 = g0Var;
                                l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                                break;
                            case 4:
                                l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                                break;
                            case 5:
                                l4.onIsPlayingChanged(g0Var.m());
                                break;
                            case 6:
                                l4.onPlaybackParametersChanged(g0Var.o);
                                break;
                            case 7:
                                l4.onPlayerErrorChanged(g0Var.f4144f);
                                break;
                            case 8:
                                l4.onPlayerError(g0Var.f4144f);
                                break;
                            default:
                                l4.onTracksChanged(g0Var.f4147i.f15387d);
                                break;
                        }
                    }
                });
            }
        }
        t0.x xVar = g0Var2.f4147i;
        t0.x xVar2 = g0Var.f4147i;
        if (xVar != xVar2) {
            t0.w wVar = this.f3887j;
            Object obj8 = xVar2.f15388e;
            wVar.getClass();
            final int i18 = 9;
            this.n.c(2, new InterfaceC0118k() { // from class: a0.s
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj82) {
                    T.L l4 = (T.L) obj82;
                    switch (i18) {
                        case 0:
                            g0 g0Var4 = g0Var;
                            l4.onLoadingChanged(g0Var4.f4145g);
                            l4.onIsLoadingChanged(g0Var4.f4145g);
                            break;
                        case 1:
                            g0 g0Var5 = g0Var;
                            l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                            break;
                        case 2:
                            l4.onPlaybackStateChanged(g0Var.f4143e);
                            break;
                        case 3:
                            g0 g0Var6 = g0Var;
                            l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                            break;
                        case 4:
                            l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                            break;
                        case 5:
                            l4.onIsPlayingChanged(g0Var.m());
                            break;
                        case 6:
                            l4.onPlaybackParametersChanged(g0Var.o);
                            break;
                        case 7:
                            l4.onPlayerErrorChanged(g0Var.f4144f);
                            break;
                        case 8:
                            l4.onPlayerError(g0Var.f4144f);
                            break;
                        default:
                            l4.onTracksChanged(g0Var.f4147i.f15387d);
                            break;
                    }
                }
            });
        }
        if (!z5) {
            this.n.c(14, new D0.a(10, this.f3862R));
        }
        if (z9) {
            final int i19 = 0;
            this.n.c(3, new InterfaceC0118k() { // from class: a0.s
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj82) {
                    T.L l4 = (T.L) obj82;
                    switch (i19) {
                        case 0:
                            g0 g0Var4 = g0Var;
                            l4.onLoadingChanged(g0Var4.f4145g);
                            l4.onIsLoadingChanged(g0Var4.f4145g);
                            break;
                        case 1:
                            g0 g0Var5 = g0Var;
                            l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                            break;
                        case 2:
                            l4.onPlaybackStateChanged(g0Var.f4143e);
                            break;
                        case 3:
                            g0 g0Var6 = g0Var;
                            l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                            break;
                        case 4:
                            l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                            break;
                        case 5:
                            l4.onIsPlayingChanged(g0Var.m());
                            break;
                        case 6:
                            l4.onPlaybackParametersChanged(g0Var.o);
                            break;
                        case 7:
                            l4.onPlayerErrorChanged(g0Var.f4144f);
                            break;
                        case 8:
                            l4.onPlayerError(g0Var.f4144f);
                            break;
                        default:
                            l4.onTracksChanged(g0Var.f4147i.f15387d);
                            break;
                    }
                }
            });
        }
        if (z6 || z7) {
            final int i20 = 1;
            this.n.c(-1, new InterfaceC0118k() { // from class: a0.s
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj82) {
                    T.L l4 = (T.L) obj82;
                    switch (i20) {
                        case 0:
                            g0 g0Var4 = g0Var;
                            l4.onLoadingChanged(g0Var4.f4145g);
                            l4.onIsLoadingChanged(g0Var4.f4145g);
                            break;
                        case 1:
                            g0 g0Var5 = g0Var;
                            l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                            break;
                        case 2:
                            l4.onPlaybackStateChanged(g0Var.f4143e);
                            break;
                        case 3:
                            g0 g0Var6 = g0Var;
                            l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                            break;
                        case 4:
                            l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                            break;
                        case 5:
                            l4.onIsPlayingChanged(g0Var.m());
                            break;
                        case 6:
                            l4.onPlaybackParametersChanged(g0Var.o);
                            break;
                        case 7:
                            l4.onPlayerErrorChanged(g0Var.f4144f);
                            break;
                        case 8:
                            l4.onPlayerError(g0Var.f4144f);
                            break;
                        default:
                            l4.onTracksChanged(g0Var.f4147i.f15387d);
                            break;
                    }
                }
            });
        }
        if (z6) {
            final int i21 = 2;
            this.n.c(4, new InterfaceC0118k() { // from class: a0.s
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj82) {
                    T.L l4 = (T.L) obj82;
                    switch (i21) {
                        case 0:
                            g0 g0Var4 = g0Var;
                            l4.onLoadingChanged(g0Var4.f4145g);
                            l4.onIsLoadingChanged(g0Var4.f4145g);
                            break;
                        case 1:
                            g0 g0Var5 = g0Var;
                            l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                            break;
                        case 2:
                            l4.onPlaybackStateChanged(g0Var.f4143e);
                            break;
                        case 3:
                            g0 g0Var6 = g0Var;
                            l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                            break;
                        case 4:
                            l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                            break;
                        case 5:
                            l4.onIsPlayingChanged(g0Var.m());
                            break;
                        case 6:
                            l4.onPlaybackParametersChanged(g0Var.o);
                            break;
                        case 7:
                            l4.onPlayerErrorChanged(g0Var.f4144f);
                            break;
                        case 8:
                            l4.onPlayerError(g0Var.f4144f);
                            break;
                        default:
                            l4.onTracksChanged(g0Var.f4147i.f15387d);
                            break;
                    }
                }
            });
        }
        if (z7 || g0Var2.f4151m != g0Var.f4151m) {
            final int i22 = 3;
            this.n.c(5, new InterfaceC0118k() { // from class: a0.s
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj82) {
                    T.L l4 = (T.L) obj82;
                    switch (i22) {
                        case 0:
                            g0 g0Var4 = g0Var;
                            l4.onLoadingChanged(g0Var4.f4145g);
                            l4.onIsLoadingChanged(g0Var4.f4145g);
                            break;
                        case 1:
                            g0 g0Var5 = g0Var;
                            l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                            break;
                        case 2:
                            l4.onPlaybackStateChanged(g0Var.f4143e);
                            break;
                        case 3:
                            g0 g0Var6 = g0Var;
                            l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                            break;
                        case 4:
                            l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                            break;
                        case 5:
                            l4.onIsPlayingChanged(g0Var.m());
                            break;
                        case 6:
                            l4.onPlaybackParametersChanged(g0Var.o);
                            break;
                        case 7:
                            l4.onPlayerErrorChanged(g0Var.f4144f);
                            break;
                        case 8:
                            l4.onPlayerError(g0Var.f4144f);
                            break;
                        default:
                            l4.onTracksChanged(g0Var.f4147i.f15387d);
                            break;
                    }
                }
            });
        }
        if (g0Var2.n != g0Var.n) {
            final int i23 = 4;
            this.n.c(6, new InterfaceC0118k() { // from class: a0.s
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj82) {
                    T.L l4 = (T.L) obj82;
                    switch (i23) {
                        case 0:
                            g0 g0Var4 = g0Var;
                            l4.onLoadingChanged(g0Var4.f4145g);
                            l4.onIsLoadingChanged(g0Var4.f4145g);
                            break;
                        case 1:
                            g0 g0Var5 = g0Var;
                            l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                            break;
                        case 2:
                            l4.onPlaybackStateChanged(g0Var.f4143e);
                            break;
                        case 3:
                            g0 g0Var6 = g0Var;
                            l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                            break;
                        case 4:
                            l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                            break;
                        case 5:
                            l4.onIsPlayingChanged(g0Var.m());
                            break;
                        case 6:
                            l4.onPlaybackParametersChanged(g0Var.o);
                            break;
                        case 7:
                            l4.onPlayerErrorChanged(g0Var.f4144f);
                            break;
                        case 8:
                            l4.onPlayerError(g0Var.f4144f);
                            break;
                        default:
                            l4.onTracksChanged(g0Var.f4147i.f15387d);
                            break;
                    }
                }
            });
        }
        if (g0Var2.m() != g0Var.m()) {
            final int i24 = 5;
            this.n.c(7, new InterfaceC0118k() { // from class: a0.s
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj82) {
                    T.L l4 = (T.L) obj82;
                    switch (i24) {
                        case 0:
                            g0 g0Var4 = g0Var;
                            l4.onLoadingChanged(g0Var4.f4145g);
                            l4.onIsLoadingChanged(g0Var4.f4145g);
                            break;
                        case 1:
                            g0 g0Var5 = g0Var;
                            l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                            break;
                        case 2:
                            l4.onPlaybackStateChanged(g0Var.f4143e);
                            break;
                        case 3:
                            g0 g0Var6 = g0Var;
                            l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                            break;
                        case 4:
                            l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                            break;
                        case 5:
                            l4.onIsPlayingChanged(g0Var.m());
                            break;
                        case 6:
                            l4.onPlaybackParametersChanged(g0Var.o);
                            break;
                        case 7:
                            l4.onPlayerErrorChanged(g0Var.f4144f);
                            break;
                        case 8:
                            l4.onPlayerError(g0Var.f4144f);
                            break;
                        default:
                            l4.onTracksChanged(g0Var.f4147i.f15387d);
                            break;
                    }
                }
            });
        }
        if (!g0Var2.o.equals(g0Var.o)) {
            final int i25 = 6;
            this.n.c(12, new InterfaceC0118k() { // from class: a0.s
                @Override // W.InterfaceC0118k
                public final void invoke(Object obj82) {
                    T.L l4 = (T.L) obj82;
                    switch (i25) {
                        case 0:
                            g0 g0Var4 = g0Var;
                            l4.onLoadingChanged(g0Var4.f4145g);
                            l4.onIsLoadingChanged(g0Var4.f4145g);
                            break;
                        case 1:
                            g0 g0Var5 = g0Var;
                            l4.onPlayerStateChanged(g0Var5.f4150l, g0Var5.f4143e);
                            break;
                        case 2:
                            l4.onPlaybackStateChanged(g0Var.f4143e);
                            break;
                        case 3:
                            g0 g0Var6 = g0Var;
                            l4.onPlayWhenReadyChanged(g0Var6.f4150l, g0Var6.f4151m);
                            break;
                        case 4:
                            l4.onPlaybackSuppressionReasonChanged(g0Var.n);
                            break;
                        case 5:
                            l4.onIsPlayingChanged(g0Var.m());
                            break;
                        case 6:
                            l4.onPlaybackParametersChanged(g0Var.o);
                            break;
                        case 7:
                            l4.onPlayerErrorChanged(g0Var.f4144f);
                            break;
                        case 8:
                            l4.onPlayerError(g0Var.f4144f);
                            break;
                        default:
                            l4.onTracksChanged(g0Var.f4147i.f15387d);
                            break;
                    }
                }
            });
        }
        H();
        this.n.b();
        if (g0Var2.f4152p != g0Var.f4152p) {
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC0125A) it.next()).f3838a.K();
            }
        }
    }

    public final void K() {
        int u4 = u();
        W.M m4 = this.f3847B;
        W.M m5 = this.f3846A;
        boolean z = false;
        if (u4 != 1) {
            if (u4 == 2 || u4 == 3) {
                L();
                boolean z4 = this.f3886i0.f4152p;
                if (t() && !z4) {
                    z = true;
                }
                m5.c(z);
                m4.c(t());
                return;
            }
            if (u4 != 4) {
                throw new IllegalStateException();
            }
        }
        m5.c(false);
        m4.c(false);
    }

    public final void L() {
        this.f3877e.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f3898u;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = W.J.f3263a;
            Locale locale = Locale.US;
            String str2 = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f3874c0) {
                throw new IllegalStateException(str2);
            }
            AbstractC0108a.t("ExoPlayerImpl", str2, this.f3876d0 ? null : new IllegalStateException());
            this.f3876d0 = true;
        }
    }

    @Override // E0.e
    public final void g(int i4, long j4) {
        L();
        if (i4 == -1) {
            return;
        }
        AbstractC0124a.h(i4 >= 0);
        T.T t4 = this.f3886i0.f4139a;
        if (t4.p() || i4 < t4.o()) {
            b0.d dVar = this.f3897t;
            if (!dVar.f5277i) {
                C0255a g4 = dVar.g();
                dVar.f5277i = true;
                dVar.l(g4, -1, new b0.b(7));
            }
            this.f3855J++;
            if (w()) {
                AbstractC0108a.s("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C0134J c0134j = new C0134J(this.f3886i0);
                c0134j.c(1);
                C0130F c0130f = this.f3891l.f4248a;
                c0130f.f3889k.c(new R1.e(c0130f, 11, c0134j));
                return;
            }
            g0 g0Var = this.f3886i0;
            int i5 = g0Var.f4143e;
            if (i5 == 3 || (i5 == 4 && !t4.p())) {
                g0Var = this.f3886i0.h(2);
            }
            int m4 = m();
            g0 y4 = y(g0Var, t4, z(t4, i4, j4));
            this.f3892m.f3962h.a(3, new L(t4, i4, W.J.M(j4))).b();
            J(y4, 0, true, 1, p(y4), m4);
        }
    }

    public final T.C h() {
        T.T q4 = q();
        if (q4.p()) {
            return this.f3884h0;
        }
        C0107z c0107z = q4.m(m(), (T.S) this.f471b, 0L).f2692c;
        T.B a3 = this.f3884h0.a();
        T.C c4 = c0107z.f2902d;
        if (c4 != null) {
            v2.I i4 = c4.f2632A;
            byte[] bArr = c4.f2638f;
            CharSequence charSequence = c4.f2633a;
            if (charSequence != null) {
                a3.f2609a = charSequence;
            }
            CharSequence charSequence2 = c4.f2634b;
            if (charSequence2 != null) {
                a3.f2610b = charSequence2;
            }
            CharSequence charSequence3 = c4.f2635c;
            if (charSequence3 != null) {
                a3.f2611c = charSequence3;
            }
            CharSequence charSequence4 = c4.f2636d;
            if (charSequence4 != null) {
                a3.f2612d = charSequence4;
            }
            CharSequence charSequence5 = c4.f2637e;
            if (charSequence5 != null) {
                a3.f2613e = charSequence5;
            }
            if (bArr != null) {
                Integer num = c4.f2639g;
                a3.f2614f = bArr == null ? null : (byte[]) bArr.clone();
                a3.f2615g = num;
            }
            Integer num2 = c4.f2640h;
            if (num2 != null) {
                a3.f2616h = num2;
            }
            Integer num3 = c4.f2641i;
            if (num3 != null) {
                a3.f2617i = num3;
            }
            Integer num4 = c4.f2642j;
            if (num4 != null) {
                a3.f2618j = num4;
            }
            Boolean bool = c4.f2643k;
            if (bool != null) {
                a3.f2619k = bool;
            }
            Integer num5 = c4.f2644l;
            if (num5 != null) {
                a3.f2620l = num5;
            }
            Integer num6 = c4.f2645m;
            if (num6 != null) {
                a3.f2620l = num6;
            }
            Integer num7 = c4.n;
            if (num7 != null) {
                a3.f2621m = num7;
            }
            Integer num8 = c4.o;
            if (num8 != null) {
                a3.n = num8;
            }
            Integer num9 = c4.f2646p;
            if (num9 != null) {
                a3.o = num9;
            }
            Integer num10 = c4.f2647q;
            if (num10 != null) {
                a3.f2622p = num10;
            }
            Integer num11 = c4.f2648r;
            if (num11 != null) {
                a3.f2623q = num11;
            }
            CharSequence charSequence6 = c4.f2649s;
            if (charSequence6 != null) {
                a3.f2624r = charSequence6;
            }
            CharSequence charSequence7 = c4.f2650t;
            if (charSequence7 != null) {
                a3.f2625s = charSequence7;
            }
            CharSequence charSequence8 = c4.f2651u;
            if (charSequence8 != null) {
                a3.f2626t = charSequence8;
            }
            Integer num12 = c4.v;
            if (num12 != null) {
                a3.f2627u = num12;
            }
            Integer num13 = c4.f2652w;
            if (num13 != null) {
                a3.v = num13;
            }
            CharSequence charSequence9 = c4.f2653x;
            if (charSequence9 != null) {
                a3.f2628w = charSequence9;
            }
            CharSequence charSequence10 = c4.f2654y;
            if (charSequence10 != null) {
                a3.f2629x = charSequence10;
            }
            Integer num14 = c4.z;
            if (num14 != null) {
                a3.f2630y = num14;
            }
            if (!i4.isEmpty()) {
                a3.z = v2.I.k(i4);
            }
        }
        return new T.C(a3);
    }

    public final long i() {
        L();
        if (w()) {
            g0 g0Var = this.f3886i0;
            return g0Var.f4149k.equals(g0Var.f4140b) ? W.J.Z(this.f3886i0.f4153q) : s();
        }
        L();
        if (this.f3886i0.f4139a.p()) {
            return this.f3890k0;
        }
        g0 g0Var2 = this.f3886i0;
        long j4 = 0;
        if (g0Var2.f4149k.f14815d != g0Var2.f4140b.f14815d) {
            return W.J.Z(g0Var2.f4139a.m(m(), (T.S) this.f471b, 0L).f2702m);
        }
        long j5 = g0Var2.f4153q;
        if (this.f3886i0.f4149k.b()) {
            g0 g0Var3 = this.f3886i0;
            g0Var3.f4139a.g(g0Var3.f4149k.f14812a, this.f3893p).d(this.f3886i0.f4149k.f14813b);
        } else {
            j4 = j5;
        }
        g0 g0Var4 = this.f3886i0;
        T.T t4 = g0Var4.f4139a;
        Object obj = g0Var4.f4149k.f14812a;
        T.Q q4 = this.f3893p;
        t4.g(obj, q4);
        return W.J.Z(j4 + q4.f2685e);
    }

    public final long j(g0 g0Var) {
        C1353B c1353b = g0Var.f4140b;
        long j4 = g0Var.f4141c;
        T.T t4 = g0Var.f4139a;
        if (!c1353b.b()) {
            return W.J.Z(p(g0Var));
        }
        Object obj = g0Var.f4140b.f14812a;
        T.Q q4 = this.f3893p;
        t4.g(obj, q4);
        if (j4 == -9223372036854775807L) {
            return W.J.Z(t4.m(r(g0Var), (T.S) this.f471b, 0L).f2701l);
        }
        return W.J.Z(j4) + W.J.Z(q4.f2685e);
    }

    public final int k() {
        L();
        if (w()) {
            return this.f3886i0.f4140b.f14813b;
        }
        return -1;
    }

    public final int l() {
        L();
        if (w()) {
            return this.f3886i0.f4140b.f14814c;
        }
        return -1;
    }

    public final int m() {
        L();
        int r4 = r(this.f3886i0);
        if (r4 == -1) {
            return 0;
        }
        return r4;
    }

    public final int n() {
        L();
        if (!this.f3886i0.f4139a.p()) {
            g0 g0Var = this.f3886i0;
            return g0Var.f4139a.b(g0Var.f4140b.f14812a);
        }
        int i4 = this.f3888j0;
        if (i4 == -1) {
            return 0;
        }
        return i4;
    }

    public final long o() {
        L();
        return W.J.Z(p(this.f3886i0));
    }

    public final long p(g0 g0Var) {
        if (g0Var.f4139a.p()) {
            return W.J.M(this.f3890k0);
        }
        long l4 = g0Var.f4152p ? g0Var.l() : g0Var.f4155s;
        if (g0Var.f4140b.b()) {
            return l4;
        }
        T.T t4 = g0Var.f4139a;
        Object obj = g0Var.f4140b.f14812a;
        T.Q q4 = this.f3893p;
        t4.g(obj, q4);
        return l4 + q4.f2685e;
    }

    public final T.T q() {
        L();
        return this.f3886i0.f4139a;
    }

    public final int r(g0 g0Var) {
        return g0Var.f4139a.p() ? this.f3888j0 : g0Var.f4139a.g(g0Var.f4140b.f14812a, this.f3893p).f2683c;
    }

    public final long s() {
        L();
        if (!w()) {
            T.T q4 = q();
            if (q4.p()) {
                return -9223372036854775807L;
            }
            return W.J.Z(q4.m(m(), (T.S) this.f471b, 0L).f2702m);
        }
        g0 g0Var = this.f3886i0;
        C1353B c1353b = g0Var.f4140b;
        T.T t4 = g0Var.f4139a;
        Object obj = c1353b.f14812a;
        T.Q q5 = this.f3893p;
        t4.g(obj, q5);
        return W.J.Z(q5.a(c1353b.f14813b, c1353b.f14814c));
    }

    public final boolean t() {
        L();
        return this.f3886i0.f4150l;
    }

    public final int u() {
        L();
        return this.f3886i0.f4143e;
    }

    public final boolean w() {
        L();
        return this.f3886i0.f4140b.b();
    }

    public final g0 y(g0 g0Var, T.T t4, Pair pair) {
        List list;
        AbstractC0124a.h(t4.p() || pair != null);
        T.T t5 = g0Var.f4139a;
        long j4 = j(g0Var);
        g0 j5 = g0Var.j(t4);
        if (t4.p()) {
            C1353B c1353b = g0.f4138u;
            long M4 = W.J.M(this.f3890k0);
            g0 c4 = j5.d(c1353b, M4, M4, M4, 0L, q0.j0.f15033d, this.f3873c, v2.a0.f15605e).c(c1353b);
            c4.f4153q = c4.f4155s;
            return c4;
        }
        Object obj = j5.f4140b.f14812a;
        boolean equals = obj.equals(pair.first);
        C1353B c1353b2 = !equals ? new C1353B(pair.first) : j5.f4140b;
        long longValue = ((Long) pair.second).longValue();
        long M5 = W.J.M(j4);
        if (!t5.p()) {
            M5 -= t5.g(obj, this.f3893p).f2685e;
            if (equals && M5 - longValue == 1 && M5 == t5.g(obj, this.f3893p).f2684d) {
                M5--;
            }
        }
        if (!equals || longValue < M5) {
            C1353B c1353b3 = c1353b2;
            AbstractC0124a.t(!c1353b3.b());
            q0.j0 j0Var = !equals ? q0.j0.f15033d : j5.f4146h;
            t0.x xVar = !equals ? this.f3873c : j5.f4147i;
            if (equals) {
                list = j5.f4148j;
            } else {
                v2.G g4 = v2.I.f15571b;
                list = v2.a0.f15605e;
            }
            g0 c5 = j5.d(c1353b3, longValue, longValue, longValue, 0L, j0Var, xVar, list).c(c1353b3);
            c5.f4153q = longValue;
            return c5;
        }
        if (longValue != M5) {
            C1353B c1353b4 = c1353b2;
            AbstractC0124a.t(!c1353b4.b());
            long max = Math.max(0L, j5.f4154r - (longValue - M5));
            long j6 = j5.f4153q;
            if (j5.f4149k.equals(j5.f4140b)) {
                j6 = longValue + max;
            }
            g0 d4 = j5.d(c1353b4, longValue, longValue, longValue, max, j5.f4146h, j5.f4147i, j5.f4148j);
            d4.f4153q = j6;
            return d4;
        }
        int b4 = t4.b(j5.f4149k.f14812a);
        if (b4 != -1 && t4.f(b4, this.f3893p, false).f2683c == t4.g(c1353b2.f14812a, this.f3893p).f2683c) {
            return j5;
        }
        t4.g(c1353b2.f14812a, this.f3893p);
        long a3 = c1353b2.b() ? this.f3893p.a(c1353b2.f14813b, c1353b2.f14814c) : this.f3893p.f2684d;
        C1353B c1353b5 = c1353b2;
        g0 c6 = j5.d(c1353b5, j5.f4155s, j5.f4155s, j5.f4142d, a3 - j5.f4155s, j5.f4146h, j5.f4147i, j5.f4148j).c(c1353b5);
        c6.f4153q = a3;
        return c6;
    }

    public final Pair z(T.T t4, int i4, long j4) {
        if (t4.p()) {
            this.f3888j0 = i4;
            if (j4 == -9223372036854775807L) {
                j4 = 0;
            }
            this.f3890k0 = j4;
            return null;
        }
        if (i4 == -1 || i4 >= t4.o()) {
            i4 = t4.a(false);
            j4 = W.J.Z(t4.m(i4, (T.S) this.f471b, 0L).f2701l);
        }
        return t4.i((T.S) this.f471b, this.f3893p, i4, W.J.M(j4));
    }
}
