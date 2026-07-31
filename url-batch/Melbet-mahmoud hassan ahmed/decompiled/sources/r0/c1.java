package r0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import o2.q;
import q2.f;
import r0.b;
import r0.c1;
import r0.d;
import r0.m2;
import r0.m3;
import r0.o1;
import r0.r3;
import r0.t;
import r0.v2;
import r0.z2;
import t1.s0;
import t1.x;

/* loaded from: classes.dex */
final class c1 extends r0.e implements t {
    private final r0.d A;
    private final m3 B;
    private final x3 C;
    private final y3 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private j3 L;
    private t1.s0 M;
    private boolean N;
    private v2.b O;
    private f2 P;
    private f2 Q;
    private s1 R;
    private s1 S;
    private AudioTrack T;
    private Object U;
    private Surface V;
    private SurfaceHolder W;
    private q2.f X;
    private boolean Y;
    private TextureView Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f20509a0;

    /* renamed from: b, reason: collision with root package name */
    final m2.d0 f20510b;

    /* renamed from: b0, reason: collision with root package name */
    private int f20511b0;

    /* renamed from: c, reason: collision with root package name */
    final v2.b f20512c;

    /* renamed from: c0, reason: collision with root package name */
    private int f20513c0;

    /* renamed from: d, reason: collision with root package name */
    private final o2.g f20514d;

    /* renamed from: d0, reason: collision with root package name */
    private int f20515d0;

    /* renamed from: e, reason: collision with root package name */
    private final Context f20516e;

    /* renamed from: e0, reason: collision with root package name */
    private u0.e f20517e0;

    /* renamed from: f, reason: collision with root package name */
    private final v2 f20518f;

    /* renamed from: f0, reason: collision with root package name */
    private u0.e f20519f0;

    /* renamed from: g, reason: collision with root package name */
    private final e3[] f20520g;

    /* renamed from: g0, reason: collision with root package name */
    private int f20521g0;

    /* renamed from: h, reason: collision with root package name */
    private final m2.c0 f20522h;

    /* renamed from: h0, reason: collision with root package name */
    private t0.e f20523h0;

    /* renamed from: i, reason: collision with root package name */
    private final o2.n f20524i;

    /* renamed from: i0, reason: collision with root package name */
    private float f20525i0;

    /* renamed from: j, reason: collision with root package name */
    private final o1.f f20526j;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f20527j0;

    /* renamed from: k, reason: collision with root package name */
    private final o1 f20528k;

    /* renamed from: k0, reason: collision with root package name */
    private c2.e f20529k0;

    /* renamed from: l, reason: collision with root package name */
    private final o2.q<v2.d> f20530l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f20531l0;

    /* renamed from: m, reason: collision with root package name */
    private final CopyOnWriteArraySet<t.a> f20532m;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f20533m0;

    /* renamed from: n, reason: collision with root package name */
    private final r3.b f20534n;

    /* renamed from: n0, reason: collision with root package name */
    private o2.c0 f20535n0;

    /* renamed from: o, reason: collision with root package name */
    private final List<e> f20536o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f20537o0;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f20538p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f20539p0;

    /* renamed from: q, reason: collision with root package name */
    private final x.a f20540q;

    /* renamed from: q0, reason: collision with root package name */
    private p f20541q0;

    /* renamed from: r, reason: collision with root package name */
    private final s0.a f20542r;

    /* renamed from: r0, reason: collision with root package name */
    private p2.z f20543r0;

    /* renamed from: s, reason: collision with root package name */
    private final Looper f20544s;

    /* renamed from: s0, reason: collision with root package name */
    private f2 f20545s0;

    /* renamed from: t, reason: collision with root package name */
    private final n2.f f20546t;

    /* renamed from: t0, reason: collision with root package name */
    private s2 f20547t0;

    /* renamed from: u, reason: collision with root package name */
    private final long f20548u;

    /* renamed from: u0, reason: collision with root package name */
    private int f20549u0;

    /* renamed from: v, reason: collision with root package name */
    private final long f20550v;

    /* renamed from: v0, reason: collision with root package name */
    private int f20551v0;

    /* renamed from: w, reason: collision with root package name */
    private final o2.d f20552w;

    /* renamed from: w0, reason: collision with root package name */
    private long f20553w0;

    /* renamed from: x, reason: collision with root package name */
    private final c f20554x;

    /* renamed from: y, reason: collision with root package name */
    private final d f20555y;

    /* renamed from: z, reason: collision with root package name */
    private final r0.b f20556z;

    private static final class b {
        public static s0.u1 a(Context context, c1 c1Var, boolean z6) {
            s0.s1 B0 = s0.s1.B0(context);
            if (B0 == null) {
                o2.r.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new s0.u1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z6) {
                c1Var.Y0(B0);
            }
            return new s0.u1(B0.I0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements p2.x, t0.s, c2.n, j1.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, f.a, d.b, b.InterfaceC0127b, m3.b, t.a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void R(v2.d dVar) {
            dVar.e0(c1.this.P);
        }

        @Override // r0.m3.b
        public void A(int i7) {
            final p c12 = c1.c1(c1.this.B);
            if (c12.equals(c1.this.f20541q0)) {
                return;
            }
            c1.this.f20541q0 = c12;
            c1.this.f20530l.k(29, new q.a() { // from class: r0.i1
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).j0(p.this);
                }
            });
        }

        @Override // r0.t.a
        public /* synthetic */ void B(boolean z6) {
            s.a(this, z6);
        }

        @Override // t0.s
        public /* synthetic */ void C(s1 s1Var) {
            t0.h.a(this, s1Var);
        }

        @Override // r0.b.InterfaceC0127b
        public void D() {
            c1.this.k2(false, -1, 3);
        }

        @Override // r0.t.a
        public void E(boolean z6) {
            c1.this.n2();
        }

        @Override // p2.x
        public /* synthetic */ void F(s1 s1Var) {
            p2.m.a(this, s1Var);
        }

        @Override // r0.d.b
        public void G(float f7) {
            c1.this.b2();
        }

        @Override // r0.d.b
        public void a(int i7) {
            boolean p7 = c1.this.p();
            c1.this.k2(p7, i7, c1.m1(p7, i7));
        }

        @Override // t0.s
        public void b(final boolean z6) {
            if (c1.this.f20527j0 == z6) {
                return;
            }
            c1.this.f20527j0 = z6;
            c1.this.f20530l.k(23, new q.a() { // from class: r0.k1
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).b(z6);
                }
            });
        }

        @Override // t0.s
        public void c(Exception exc) {
            c1.this.f20542r.c(exc);
        }

        @Override // p2.x
        public void d(String str) {
            c1.this.f20542r.d(str);
        }

        @Override // p2.x
        public void e(s1 s1Var, u0.i iVar) {
            c1.this.R = s1Var;
            c1.this.f20542r.e(s1Var, iVar);
        }

        @Override // p2.x
        public void f(Object obj, long j7) {
            c1.this.f20542r.f(obj, j7);
            if (c1.this.U == obj) {
                c1.this.f20530l.k(26, new q.a() { // from class: r0.l1
                    @Override // o2.q.a
                    public final void invoke(Object obj2) {
                        ((v2.d) obj2).L();
                    }
                });
            }
        }

        @Override // p2.x
        public void g(String str, long j7, long j8) {
            c1.this.f20542r.g(str, j7, j8);
        }

        @Override // t0.s
        public void h(u0.e eVar) {
            c1.this.f20519f0 = eVar;
            c1.this.f20542r.h(eVar);
        }

        @Override // c2.n
        public void i(final List<c2.b> list) {
            c1.this.f20530l.k(27, new q.a() { // from class: r0.g1
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).i(list);
                }
            });
        }

        @Override // q2.f.a
        public void j(Surface surface) {
            c1.this.g2(null);
        }

        @Override // t0.s
        public void k(long j7) {
            c1.this.f20542r.k(j7);
        }

        @Override // t0.s
        public void l(Exception exc) {
            c1.this.f20542r.l(exc);
        }

        @Override // t0.s
        public void m(s1 s1Var, u0.i iVar) {
            c1.this.S = s1Var;
            c1.this.f20542r.m(s1Var, iVar);
        }

        @Override // p2.x
        public void n(Exception exc) {
            c1.this.f20542r.n(exc);
        }

        @Override // p2.x
        public void o(u0.e eVar) {
            c1.this.f20542r.o(eVar);
            c1.this.R = null;
            c1.this.f20517e0 = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
            c1.this.f2(surfaceTexture);
            c1.this.V1(i7, i8);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            c1.this.g2(null);
            c1.this.V1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
            c1.this.V1(i7, i8);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // t0.s
        public void p(String str) {
            c1.this.f20542r.p(str);
        }

        @Override // t0.s
        public void q(String str, long j7, long j8) {
            c1.this.f20542r.q(str, j7, j8);
        }

        @Override // p2.x
        public void r(final p2.z zVar) {
            c1.this.f20543r0 = zVar;
            c1.this.f20530l.k(25, new q.a() { // from class: r0.h1
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).r(p2.z.this);
                }
            });
        }

        @Override // c2.n
        public void s(final c2.e eVar) {
            c1.this.f20529k0 = eVar;
            c1.this.f20530l.k(27, new q.a() { // from class: r0.e1
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).s(c2.e.this);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
            c1.this.V1(i8, i9);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (c1.this.Y) {
                c1.this.g2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (c1.this.Y) {
                c1.this.g2(null);
            }
            c1.this.V1(0, 0);
        }

        @Override // t0.s
        public void t(u0.e eVar) {
            c1.this.f20542r.t(eVar);
            c1.this.S = null;
            c1.this.f20519f0 = null;
        }

        @Override // j1.f
        public void u(final j1.a aVar) {
            c1 c1Var = c1.this;
            c1Var.f20545s0 = c1Var.f20545s0.b().I(aVar).F();
            f2 b12 = c1.this.b1();
            if (!b12.equals(c1.this.P)) {
                c1.this.P = b12;
                c1.this.f20530l.i(14, new q.a() { // from class: r0.j1
                    @Override // o2.q.a
                    public final void invoke(Object obj) {
                        c1.c.this.R((v2.d) obj);
                    }
                });
            }
            c1.this.f20530l.i(28, new q.a() { // from class: r0.f1
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).u(j1.a.this);
                }
            });
            c1.this.f20530l.f();
        }

        @Override // p2.x
        public void v(u0.e eVar) {
            c1.this.f20517e0 = eVar;
            c1.this.f20542r.v(eVar);
        }

        @Override // t0.s
        public void w(int i7, long j7, long j8) {
            c1.this.f20542r.w(i7, j7, j8);
        }

        @Override // p2.x
        public void x(int i7, long j7) {
            c1.this.f20542r.x(i7, j7);
        }

        @Override // p2.x
        public void y(long j7, int i7) {
            c1.this.f20542r.y(j7, i7);
        }

        @Override // r0.m3.b
        public void z(final int i7, final boolean z6) {
            c1.this.f20530l.k(30, new q.a() { // from class: r0.d1
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).m0(i7, z6);
                }
            });
        }
    }

    private static final class d implements p2.j, q2.a, z2.b {

        /* renamed from: f, reason: collision with root package name */
        private p2.j f20558f;

        /* renamed from: g, reason: collision with root package name */
        private q2.a f20559g;

        /* renamed from: h, reason: collision with root package name */
        private p2.j f20560h;

        /* renamed from: i, reason: collision with root package name */
        private q2.a f20561i;

        private d() {
        }

        @Override // q2.a
        public void b(long j7, float[] fArr) {
            q2.a aVar = this.f20561i;
            if (aVar != null) {
                aVar.b(j7, fArr);
            }
            q2.a aVar2 = this.f20559g;
            if (aVar2 != null) {
                aVar2.b(j7, fArr);
            }
        }

        @Override // p2.j
        public void d(long j7, long j8, s1 s1Var, MediaFormat mediaFormat) {
            p2.j jVar = this.f20560h;
            if (jVar != null) {
                jVar.d(j7, j8, s1Var, mediaFormat);
            }
            p2.j jVar2 = this.f20558f;
            if (jVar2 != null) {
                jVar2.d(j7, j8, s1Var, mediaFormat);
            }
        }

        @Override // q2.a
        public void e() {
            q2.a aVar = this.f20561i;
            if (aVar != null) {
                aVar.e();
            }
            q2.a aVar2 = this.f20559g;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        @Override // r0.z2.b
        public void p(int i7, Object obj) {
            q2.a cameraMotionListener;
            if (i7 == 7) {
                this.f20558f = (p2.j) obj;
                return;
            }
            if (i7 == 8) {
                this.f20559g = (q2.a) obj;
                return;
            }
            if (i7 != 10000) {
                return;
            }
            q2.f fVar = (q2.f) obj;
            if (fVar == null) {
                cameraMotionListener = null;
                this.f20560h = null;
            } else {
                this.f20560h = fVar.getVideoFrameMetadataListener();
                cameraMotionListener = fVar.getCameraMotionListener();
            }
            this.f20561i = cameraMotionListener;
        }
    }

    private static final class e implements k2 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f20562a;

        /* renamed from: b, reason: collision with root package name */
        private r3 f20563b;

        public e(Object obj, r3 r3Var) {
            this.f20562a = obj;
            this.f20563b = r3Var;
        }

        @Override // r0.k2
        public Object a() {
            return this.f20562a;
        }

        @Override // r0.k2
        public r3 b() {
            return this.f20563b;
        }
    }

    static {
        p1.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public c1(t.b bVar, v2 v2Var) {
        c1 c1Var;
        o2.g gVar = new o2.g();
        this.f20514d = gVar;
        try {
            o2.r.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + o2.m0.f19756e + "]");
            Context applicationContext = bVar.f21012a.getApplicationContext();
            this.f20516e = applicationContext;
            s0.a apply = bVar.f21020i.apply(bVar.f21013b);
            this.f20542r = apply;
            this.f20535n0 = bVar.f21022k;
            this.f20523h0 = bVar.f21023l;
            this.f20509a0 = bVar.f21028q;
            this.f20511b0 = bVar.f21029r;
            this.f20527j0 = bVar.f21027p;
            this.E = bVar.f21036y;
            c cVar = new c();
            this.f20554x = cVar;
            d dVar = new d();
            this.f20555y = dVar;
            Handler handler = new Handler(bVar.f21021j);
            e3[] a7 = bVar.f21015d.get().a(handler, cVar, cVar, cVar, cVar);
            this.f20520g = a7;
            o2.a.f(a7.length > 0);
            m2.c0 c0Var = bVar.f21017f.get();
            this.f20522h = c0Var;
            this.f20540q = bVar.f21016e.get();
            n2.f fVar = bVar.f21019h.get();
            this.f20546t = fVar;
            this.f20538p = bVar.f21030s;
            this.L = bVar.f21031t;
            this.f20548u = bVar.f21032u;
            this.f20550v = bVar.f21033v;
            this.N = bVar.f21037z;
            Looper looper = bVar.f21021j;
            this.f20544s = looper;
            o2.d dVar2 = bVar.f21013b;
            this.f20552w = dVar2;
            v2 v2Var2 = v2Var == null ? this : v2Var;
            this.f20518f = v2Var2;
            this.f20530l = new o2.q<>(looper, dVar2, new q.b() { // from class: r0.s0
                @Override // o2.q.b
                public final void a(Object obj, o2.l lVar) {
                    c1.this.v1((v2.d) obj, lVar);
                }
            });
            this.f20532m = new CopyOnWriteArraySet<>();
            this.f20536o = new ArrayList();
            this.M = new s0.a(0);
            m2.d0 d0Var = new m2.d0(new h3[a7.length], new m2.t[a7.length], w3.f21084g, null);
            this.f20510b = d0Var;
            this.f20534n = new r3.b();
            v2.b e7 = new v2.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).d(29, c0Var.d()).e();
            this.f20512c = e7;
            this.O = new v2.b.a().b(e7).a(4).a(10).e();
            this.f20524i = dVar2.c(looper, null);
            o1.f fVar2 = new o1.f() { // from class: r0.t0
                @Override // r0.o1.f
                public final void a(o1.e eVar) {
                    c1.this.x1(eVar);
                }
            };
            this.f20526j = fVar2;
            this.f20547t0 = s2.j(d0Var);
            apply.P(v2Var2, looper);
            int i7 = o2.m0.f19752a;
            try {
                o1 o1Var = new o1(a7, c0Var, d0Var, bVar.f21018g.get(), fVar, this.F, this.G, apply, this.L, bVar.f21034w, bVar.f21035x, this.N, looper, dVar2, fVar2, i7 < 31 ? new s0.u1() : b.a(applicationContext, this, bVar.A));
                c1Var = this;
                try {
                    c1Var.f20528k = o1Var;
                    c1Var.f20525i0 = 1.0f;
                    c1Var.F = 0;
                    f2 f2Var = f2.L;
                    c1Var.P = f2Var;
                    c1Var.Q = f2Var;
                    c1Var.f20545s0 = f2Var;
                    c1Var.f20549u0 = -1;
                    c1Var.f20521g0 = i7 < 21 ? c1Var.s1(0) : o2.m0.F(applicationContext);
                    c1Var.f20529k0 = c2.e.f1859g;
                    c1Var.f20531l0 = true;
                    c1Var.u(apply);
                    fVar.b(new Handler(looper), apply);
                    c1Var.Z0(cVar);
                    long j7 = bVar.f21014c;
                    if (j7 > 0) {
                        o1Var.v(j7);
                    }
                    r0.b bVar2 = new r0.b(bVar.f21012a, handler, cVar);
                    c1Var.f20556z = bVar2;
                    bVar2.b(bVar.f21026o);
                    r0.d dVar3 = new r0.d(bVar.f21012a, handler, cVar);
                    c1Var.A = dVar3;
                    dVar3.m(bVar.f21024m ? c1Var.f20523h0 : null);
                    m3 m3Var = new m3(bVar.f21012a, handler, cVar);
                    c1Var.B = m3Var;
                    m3Var.h(o2.m0.f0(c1Var.f20523h0.f21710h));
                    x3 x3Var = new x3(bVar.f21012a);
                    c1Var.C = x3Var;
                    x3Var.a(bVar.f21025n != 0);
                    y3 y3Var = new y3(bVar.f21012a);
                    c1Var.D = y3Var;
                    y3Var.a(bVar.f21025n == 2);
                    c1Var.f20541q0 = c1(m3Var);
                    c1Var.f20543r0 = p2.z.f20104j;
                    c0Var.h(c1Var.f20523h0);
                    c1Var.a2(1, 10, Integer.valueOf(c1Var.f20521g0));
                    c1Var.a2(2, 10, Integer.valueOf(c1Var.f20521g0));
                    c1Var.a2(1, 3, c1Var.f20523h0);
                    c1Var.a2(2, 4, Integer.valueOf(c1Var.f20509a0));
                    c1Var.a2(2, 5, Integer.valueOf(c1Var.f20511b0));
                    c1Var.a2(1, 9, Boolean.valueOf(c1Var.f20527j0));
                    c1Var.a2(2, 7, dVar);
                    c1Var.a2(6, 8, dVar);
                    gVar.e();
                } catch (Throwable th) {
                    th = th;
                    c1Var.f20514d.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c1Var = this;
            }
        } catch (Throwable th3) {
            th = th3;
            c1Var = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1(v2.d dVar) {
        dVar.T(this.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F1(s2 s2Var, int i7, v2.d dVar) {
        dVar.b0(s2Var.f20993a, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G1(int i7, v2.e eVar, v2.e eVar2, v2.d dVar) {
        dVar.F(i7);
        dVar.H(eVar, eVar2, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I1(s2 s2Var, v2.d dVar) {
        dVar.l0(s2Var.f20998f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J1(s2 s2Var, v2.d dVar) {
        dVar.i0(s2Var.f20998f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K1(s2 s2Var, v2.d dVar) {
        dVar.B(s2Var.f21001i.f18991d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M1(s2 s2Var, v2.d dVar) {
        dVar.E(s2Var.f20999g);
        dVar.K(s2Var.f20999g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N1(s2 s2Var, v2.d dVar) {
        dVar.A(s2Var.f21004l, s2Var.f20997e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O1(s2 s2Var, v2.d dVar) {
        dVar.V(s2Var.f20997e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P1(s2 s2Var, int i7, v2.d dVar) {
        dVar.W(s2Var.f21004l, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q1(s2 s2Var, v2.d dVar) {
        dVar.z(s2Var.f21005m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R1(s2 s2Var, v2.d dVar) {
        dVar.p0(t1(s2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S1(s2 s2Var, v2.d dVar) {
        dVar.j(s2Var.f21006n);
    }

    private s2 T1(s2 s2Var, r3 r3Var, Pair<Object, Long> pair) {
        long j7;
        o2.a.a(r3Var.u() || pair != null);
        r3 r3Var2 = s2Var.f20993a;
        s2 i7 = s2Var.i(r3Var);
        if (r3Var.u()) {
            x.b k7 = s2.k();
            long B0 = o2.m0.B0(this.f20553w0);
            s2 b7 = i7.c(k7, B0, B0, B0, 0L, t1.z0.f22273i, this.f20510b, m4.q.x()).b(k7);
            b7.f21008p = b7.f21010r;
            return b7;
        }
        Object obj = i7.f20994b.f22249a;
        boolean z6 = !obj.equals(((Pair) o2.m0.j(pair)).first);
        x.b bVar = z6 ? new x.b(pair.first) : i7.f20994b;
        long longValue = ((Long) pair.second).longValue();
        long B02 = o2.m0.B0(l());
        if (!r3Var2.u()) {
            B02 -= r3Var2.l(obj, this.f20534n).q();
        }
        if (z6 || longValue < B02) {
            o2.a.f(!bVar.b());
            s2 b8 = i7.c(bVar, longValue, longValue, longValue, 0L, z6 ? t1.z0.f22273i : i7.f21000h, z6 ? this.f20510b : i7.f21001i, z6 ? m4.q.x() : i7.f21002j).b(bVar);
            b8.f21008p = longValue;
            return b8;
        }
        if (longValue == B02) {
            int f7 = r3Var.f(i7.f21003k.f22249a);
            if (f7 == -1 || r3Var.j(f7, this.f20534n).f20914h != r3Var.l(bVar.f22249a, this.f20534n).f20914h) {
                r3Var.l(bVar.f22249a, this.f20534n);
                j7 = bVar.b() ? this.f20534n.e(bVar.f22250b, bVar.f22251c) : this.f20534n.f20915i;
                i7 = i7.c(bVar, i7.f21010r, i7.f21010r, i7.f20996d, j7 - i7.f21010r, i7.f21000h, i7.f21001i, i7.f21002j).b(bVar);
            }
            return i7;
        }
        o2.a.f(!bVar.b());
        long max = Math.max(0L, i7.f21009q - (longValue - B02));
        j7 = i7.f21008p;
        if (i7.f21003k.equals(i7.f20994b)) {
            j7 = longValue + max;
        }
        i7 = i7.c(bVar, longValue, longValue, longValue, max, i7.f21000h, i7.f21001i, i7.f21002j);
        i7.f21008p = j7;
        return i7;
    }

    private Pair<Object, Long> U1(r3 r3Var, int i7, long j7) {
        if (r3Var.u()) {
            this.f20549u0 = i7;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.f20553w0 = j7;
            this.f20551v0 = 0;
            return null;
        }
        if (i7 == -1 || i7 >= r3Var.t()) {
            i7 = r3Var.e(this.G);
            j7 = r3Var.r(i7, this.f20581a).d();
        }
        return r3Var.n(this.f20581a, this.f20534n, i7, o2.m0.B0(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V1(final int i7, final int i8) {
        if (i7 == this.f20513c0 && i8 == this.f20515d0) {
            return;
        }
        this.f20513c0 = i7;
        this.f20515d0 = i8;
        this.f20530l.k(24, new q.a() { // from class: r0.v0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((v2.d) obj).c0(i7, i8);
            }
        });
    }

    private long W1(r3 r3Var, x.b bVar, long j7) {
        r3Var.l(bVar.f22249a, this.f20534n);
        return j7 + this.f20534n.q();
    }

    private s2 X1(int i7, int i8) {
        boolean z6 = false;
        o2.a.a(i7 >= 0 && i8 >= i7 && i8 <= this.f20536o.size());
        int A = A();
        r3 I = I();
        int size = this.f20536o.size();
        this.H++;
        Y1(i7, i8);
        r3 d12 = d1();
        s2 T1 = T1(this.f20547t0, d12, l1(I, d12));
        int i9 = T1.f20997e;
        if (i9 != 1 && i9 != 4 && i7 < i8 && i8 == size && A >= T1.f20993a.t()) {
            z6 = true;
        }
        if (z6) {
            T1 = T1.g(4);
        }
        this.f20528k.p0(i7, i8, this.M);
        return T1;
    }

    private void Y1(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            this.f20536o.remove(i9);
        }
        this.M = this.M.b(i7, i8);
    }

    private void Z1() {
        if (this.X != null) {
            e1(this.f20555y).n(10000).m(null).l();
            this.X.d(this.f20554x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f20554x) {
                o2.r.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f20554x);
            this.W = null;
        }
    }

    private List<m2.c> a1(int i7, List<t1.x> list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            m2.c cVar = new m2.c(list.get(i8), this.f20538p);
            arrayList.add(cVar);
            this.f20536o.add(i8 + i7, new e(cVar.f20797b, cVar.f20796a.T()));
        }
        this.M = this.M.d(i7, arrayList.size());
        return arrayList;
    }

    private void a2(int i7, int i8, Object obj) {
        for (e3 e3Var : this.f20520g) {
            if (e3Var.j() == i7) {
                e1(e3Var).n(i8).m(obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f2 b1() {
        r3 I = I();
        if (I.u()) {
            return this.f20545s0;
        }
        return this.f20545s0.b().H(I.r(A(), this.f20581a).f20929h.f20396j).F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2() {
        a2(1, 2, Float.valueOf(this.f20525i0 * this.A.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p c1(m3 m3Var) {
        return new p(0, m3Var.d(), m3Var.c());
    }

    private r3 d1() {
        return new a3(this.f20536o, this.M);
    }

    private z2 e1(z2.b bVar) {
        int k12 = k1();
        o1 o1Var = this.f20528k;
        return new z2(o1Var, bVar, this.f20547t0.f20993a, k12 == -1 ? 0 : k12, this.f20552w, o1Var.D());
    }

    private void e2(List<t1.x> list, int i7, long j7, boolean z6) {
        int i8;
        long j8;
        int k12 = k1();
        long N = N();
        this.H++;
        if (!this.f20536o.isEmpty()) {
            Y1(0, this.f20536o.size());
        }
        List<m2.c> a12 = a1(0, list);
        r3 d12 = d1();
        if (!d12.u() && i7 >= d12.t()) {
            throw new w1(d12, i7, j7);
        }
        if (z6) {
            j8 = -9223372036854775807L;
            i8 = d12.e(this.G);
        } else if (i7 == -1) {
            i8 = k12;
            j8 = N;
        } else {
            i8 = i7;
            j8 = j7;
        }
        s2 T1 = T1(this.f20547t0, d12, U1(d12, i8, j8));
        int i9 = T1.f20997e;
        if (i8 != -1 && i9 != 1) {
            i9 = (d12.u() || i8 >= d12.t()) ? 4 : 2;
        }
        s2 g7 = T1.g(i9);
        this.f20528k.O0(a12, i8, o2.m0.B0(j8), this.M);
        l2(g7, 0, 1, false, (this.f20547t0.f20994b.f22249a.equals(g7.f20994b.f22249a) || this.f20547t0.f20993a.u()) ? false : true, 4, j1(g7), -1);
    }

    private Pair<Boolean, Integer> f1(s2 s2Var, s2 s2Var2, boolean z6, int i7, boolean z7) {
        r3 r3Var = s2Var2.f20993a;
        r3 r3Var2 = s2Var.f20993a;
        if (r3Var2.u() && r3Var.u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i8 = 3;
        if (r3Var2.u() != r3Var.u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (r3Var.r(r3Var.l(s2Var2.f20994b.f22249a, this.f20534n).f20914h, this.f20581a).f20927f.equals(r3Var2.r(r3Var2.l(s2Var.f20994b.f22249a, this.f20534n).f20914h, this.f20581a).f20927f)) {
            return (z6 && i7 == 0 && s2Var2.f20994b.f22252d < s2Var.f20994b.f22252d) ? new Pair<>(Boolean.TRUE, 0) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z6 && i7 == 0) {
            i8 = 1;
        } else if (z6 && i7 == 1) {
            i8 = 2;
        } else if (!z7) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        g2(surface);
        this.V = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g2(Object obj) {
        boolean z6;
        ArrayList arrayList = new ArrayList();
        e3[] e3VarArr = this.f20520g;
        int length = e3VarArr.length;
        int i7 = 0;
        while (true) {
            z6 = true;
            if (i7 >= length) {
                break;
            }
            e3 e3Var = e3VarArr[i7];
            if (e3Var.j() == 2) {
                arrayList.add(e1(e3Var).n(1).m(obj).l());
            }
            i7++;
        }
        Object obj2 = this.U;
        if (obj2 == null || obj2 == obj) {
            z6 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z2) it.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z6 = false;
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z6) {
            i2(false, r.j(new q1(3), 1003));
        }
    }

    private void i2(boolean z6, r rVar) {
        s2 b7;
        if (z6) {
            b7 = X1(0, this.f20536o.size()).e(null);
        } else {
            s2 s2Var = this.f20547t0;
            b7 = s2Var.b(s2Var.f20994b);
            b7.f21008p = b7.f21010r;
            b7.f21009q = 0L;
        }
        s2 g7 = b7.g(1);
        if (rVar != null) {
            g7 = g7.e(rVar);
        }
        s2 s2Var2 = g7;
        this.H++;
        this.f20528k.i1();
        l2(s2Var2, 0, 1, false, s2Var2.f20993a.u() && !this.f20547t0.f20993a.u(), 4, j1(s2Var2), -1);
    }

    private long j1(s2 s2Var) {
        return s2Var.f20993a.u() ? o2.m0.B0(this.f20553w0) : s2Var.f20994b.b() ? s2Var.f21010r : W1(s2Var.f20993a, s2Var.f20994b, s2Var.f21010r);
    }

    private void j2() {
        v2.b bVar = this.O;
        v2.b H = o2.m0.H(this.f20518f, this.f20512c);
        this.O = H;
        if (H.equals(bVar)) {
            return;
        }
        this.f20530l.i(13, new q.a() { // from class: r0.x0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                c1.this.E1((v2.d) obj);
            }
        });
    }

    private int k1() {
        if (this.f20547t0.f20993a.u()) {
            return this.f20549u0;
        }
        s2 s2Var = this.f20547t0;
        return s2Var.f20993a.l(s2Var.f20994b.f22249a, this.f20534n).f20914h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k2(boolean z6, int i7, int i8) {
        int i9 = 0;
        boolean z7 = z6 && i7 != -1;
        if (z7 && i7 != 1) {
            i9 = 1;
        }
        s2 s2Var = this.f20547t0;
        if (s2Var.f21004l == z7 && s2Var.f21005m == i9) {
            return;
        }
        this.H++;
        s2 d7 = s2Var.d(z7, i9);
        this.f20528k.R0(z7, i9);
        l2(d7, 0, i8, false, false, 5, -9223372036854775807L, -1);
    }

    private Pair<Object, Long> l1(r3 r3Var, r3 r3Var2) {
        long l7 = l();
        if (r3Var.u() || r3Var2.u()) {
            boolean z6 = !r3Var.u() && r3Var2.u();
            int k12 = z6 ? -1 : k1();
            if (z6) {
                l7 = -9223372036854775807L;
            }
            return U1(r3Var2, k12, l7);
        }
        Pair<Object, Long> n7 = r3Var.n(this.f20581a, this.f20534n, A(), o2.m0.B0(l7));
        Object obj = ((Pair) o2.m0.j(n7)).first;
        if (r3Var2.f(obj) != -1) {
            return n7;
        }
        Object A0 = o1.A0(this.f20581a, this.f20534n, this.F, this.G, obj, r3Var, r3Var2);
        if (A0 == null) {
            return U1(r3Var2, -1, -9223372036854775807L);
        }
        r3Var2.l(A0, this.f20534n);
        int i7 = this.f20534n.f20914h;
        return U1(r3Var2, i7, r3Var2.r(i7, this.f20581a).d());
    }

    private void l2(final s2 s2Var, final int i7, final int i8, boolean z6, boolean z7, final int i9, long j7, int i10) {
        s2 s2Var2 = this.f20547t0;
        this.f20547t0 = s2Var;
        Pair<Boolean, Integer> f12 = f1(s2Var, s2Var2, z7, i9, !s2Var2.f20993a.equals(s2Var.f20993a));
        boolean booleanValue = ((Boolean) f12.first).booleanValue();
        final int intValue = ((Integer) f12.second).intValue();
        f2 f2Var = this.P;
        if (booleanValue) {
            r3 = s2Var.f20993a.u() ? null : s2Var.f20993a.r(s2Var.f20993a.l(s2Var.f20994b.f22249a, this.f20534n).f20914h, this.f20581a).f20929h;
            this.f20545s0 = f2.L;
        }
        if (booleanValue || !s2Var2.f21002j.equals(s2Var.f21002j)) {
            this.f20545s0 = this.f20545s0.b().J(s2Var.f21002j).F();
            f2Var = b1();
        }
        boolean z8 = !f2Var.equals(this.P);
        this.P = f2Var;
        boolean z9 = s2Var2.f21004l != s2Var.f21004l;
        boolean z10 = s2Var2.f20997e != s2Var.f20997e;
        if (z10 || z9) {
            n2();
        }
        boolean z11 = s2Var2.f20999g;
        boolean z12 = s2Var.f20999g;
        boolean z13 = z11 != z12;
        if (z13) {
            m2(z12);
        }
        if (!s2Var2.f20993a.equals(s2Var.f20993a)) {
            this.f20530l.i(0, new q.a() { // from class: r0.k0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.F1(s2.this, i7, (v2.d) obj);
                }
            });
        }
        if (z7) {
            final v2.e p12 = p1(i9, s2Var2, i10);
            final v2.e o12 = o1(j7);
            this.f20530l.i(11, new q.a() { // from class: r0.w0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.G1(i9, p12, o12, (v2.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f20530l.i(1, new q.a() { // from class: r0.y0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).o0(a2.this, intValue);
                }
            });
        }
        if (s2Var2.f20998f != s2Var.f20998f) {
            this.f20530l.i(10, new q.a() { // from class: r0.a1
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.I1(s2.this, (v2.d) obj);
                }
            });
            if (s2Var.f20998f != null) {
                this.f20530l.i(10, new q.a() { // from class: r0.h0
                    @Override // o2.q.a
                    public final void invoke(Object obj) {
                        c1.J1(s2.this, (v2.d) obj);
                    }
                });
            }
        }
        m2.d0 d0Var = s2Var2.f21001i;
        m2.d0 d0Var2 = s2Var.f21001i;
        if (d0Var != d0Var2) {
            this.f20522h.e(d0Var2.f18992e);
            this.f20530l.i(2, new q.a() { // from class: r0.d0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.K1(s2.this, (v2.d) obj);
                }
            });
        }
        if (z8) {
            final f2 f2Var2 = this.P;
            this.f20530l.i(14, new q.a() { // from class: r0.z0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).e0(f2.this);
                }
            });
        }
        if (z13) {
            this.f20530l.i(3, new q.a() { // from class: r0.j0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.M1(s2.this, (v2.d) obj);
                }
            });
        }
        if (z10 || z9) {
            this.f20530l.i(-1, new q.a() { // from class: r0.i0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.N1(s2.this, (v2.d) obj);
                }
            });
        }
        if (z10) {
            this.f20530l.i(4, new q.a() { // from class: r0.b1
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.O1(s2.this, (v2.d) obj);
                }
            });
        }
        if (z9) {
            this.f20530l.i(5, new q.a() { // from class: r0.l0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.P1(s2.this, i8, (v2.d) obj);
                }
            });
        }
        if (s2Var2.f21005m != s2Var.f21005m) {
            this.f20530l.i(6, new q.a() { // from class: r0.e0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.Q1(s2.this, (v2.d) obj);
                }
            });
        }
        if (t1(s2Var2) != t1(s2Var)) {
            this.f20530l.i(7, new q.a() { // from class: r0.g0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.R1(s2.this, (v2.d) obj);
                }
            });
        }
        if (!s2Var2.f21006n.equals(s2Var.f21006n)) {
            this.f20530l.i(12, new q.a() { // from class: r0.f0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.S1(s2.this, (v2.d) obj);
                }
            });
        }
        if (z6) {
            this.f20530l.i(-1, new q.a() { // from class: r0.r0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).M();
                }
            });
        }
        j2();
        this.f20530l.f();
        if (s2Var2.f21007o != s2Var.f21007o) {
            Iterator<t.a> it = this.f20532m.iterator();
            while (it.hasNext()) {
                it.next().E(s2Var.f21007o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m1(boolean z6, int i7) {
        return (!z6 || i7 == 1) ? 1 : 2;
    }

    private void m2(boolean z6) {
        o2.c0 c0Var = this.f20535n0;
        if (c0Var != null) {
            if (z6 && !this.f20537o0) {
                c0Var.a(0);
                this.f20537o0 = true;
            } else {
                if (z6 || !this.f20537o0) {
                    return;
                }
                c0Var.b(0);
                this.f20537o0 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2() {
        int T = T();
        if (T != 1) {
            if (T == 2 || T == 3) {
                this.C.b(p() && !g1());
                this.D.b(p());
                return;
            } else if (T != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    private v2.e o1(long j7) {
        a2 a2Var;
        Object obj;
        int i7;
        int A = A();
        Object obj2 = null;
        if (this.f20547t0.f20993a.u()) {
            a2Var = null;
            obj = null;
            i7 = -1;
        } else {
            s2 s2Var = this.f20547t0;
            Object obj3 = s2Var.f20994b.f22249a;
            s2Var.f20993a.l(obj3, this.f20534n);
            i7 = this.f20547t0.f20993a.f(obj3);
            obj = obj3;
            obj2 = this.f20547t0.f20993a.r(A, this.f20581a).f20927f;
            a2Var = this.f20581a.f20929h;
        }
        long Y0 = o2.m0.Y0(j7);
        long Y02 = this.f20547t0.f20994b.b() ? o2.m0.Y0(q1(this.f20547t0)) : Y0;
        x.b bVar = this.f20547t0.f20994b;
        return new v2.e(obj2, A, a2Var, obj, i7, Y0, Y02, bVar.f22250b, bVar.f22251c);
    }

    private void o2() {
        this.f20514d.b();
        if (Thread.currentThread() != h1().getThread()) {
            String C = o2.m0.C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), h1().getThread().getName());
            if (this.f20531l0) {
                throw new IllegalStateException(C);
            }
            o2.r.j("ExoPlayerImpl", C, this.f20533m0 ? null : new IllegalStateException());
            this.f20533m0 = true;
        }
    }

    private v2.e p1(int i7, s2 s2Var, int i8) {
        int i9;
        Object obj;
        a2 a2Var;
        Object obj2;
        int i10;
        long j7;
        long j8;
        r3.b bVar = new r3.b();
        if (s2Var.f20993a.u()) {
            i9 = i8;
            obj = null;
            a2Var = null;
            obj2 = null;
            i10 = -1;
        } else {
            Object obj3 = s2Var.f20994b.f22249a;
            s2Var.f20993a.l(obj3, bVar);
            int i11 = bVar.f20914h;
            i9 = i11;
            obj2 = obj3;
            i10 = s2Var.f20993a.f(obj3);
            obj = s2Var.f20993a.r(i11, this.f20581a).f20927f;
            a2Var = this.f20581a.f20929h;
        }
        boolean b7 = s2Var.f20994b.b();
        if (i7 == 0) {
            if (b7) {
                x.b bVar2 = s2Var.f20994b;
                j7 = bVar.e(bVar2.f22250b, bVar2.f22251c);
                j8 = q1(s2Var);
            } else if (s2Var.f20994b.f22253e != -1) {
                j7 = q1(this.f20547t0);
                j8 = j7;
            } else {
                j8 = bVar.f20916j + bVar.f20915i;
                j7 = j8;
            }
        } else if (b7) {
            j7 = s2Var.f21010r;
            j8 = q1(s2Var);
        } else {
            j7 = bVar.f20916j + s2Var.f21010r;
            j8 = j7;
        }
        long Y0 = o2.m0.Y0(j7);
        long Y02 = o2.m0.Y0(j8);
        x.b bVar3 = s2Var.f20994b;
        return new v2.e(obj, i9, a2Var, obj2, i10, Y0, Y02, bVar3.f22250b, bVar3.f22251c);
    }

    private static long q1(s2 s2Var) {
        r3.d dVar = new r3.d();
        r3.b bVar = new r3.b();
        s2Var.f20993a.l(s2Var.f20994b.f22249a, bVar);
        return s2Var.f20995c == -9223372036854775807L ? s2Var.f20993a.r(bVar.f20914h, dVar).e() : bVar.q() + s2Var.f20995c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public void w1(o1.e eVar) {
        long j7;
        boolean z6;
        long j8;
        int i7 = this.H - eVar.f20862c;
        this.H = i7;
        boolean z7 = true;
        if (eVar.f20863d) {
            this.I = eVar.f20864e;
            this.J = true;
        }
        if (eVar.f20865f) {
            this.K = eVar.f20866g;
        }
        if (i7 == 0) {
            r3 r3Var = eVar.f20861b.f20993a;
            if (!this.f20547t0.f20993a.u() && r3Var.u()) {
                this.f20549u0 = -1;
                this.f20553w0 = 0L;
                this.f20551v0 = 0;
            }
            if (!r3Var.u()) {
                List<r3> J = ((a3) r3Var).J();
                o2.a.f(J.size() == this.f20536o.size());
                for (int i8 = 0; i8 < J.size(); i8++) {
                    this.f20536o.get(i8).f20563b = J.get(i8);
                }
            }
            if (this.J) {
                if (eVar.f20861b.f20994b.equals(this.f20547t0.f20994b) && eVar.f20861b.f20996d == this.f20547t0.f21010r) {
                    z7 = false;
                }
                if (z7) {
                    if (r3Var.u() || eVar.f20861b.f20994b.b()) {
                        j8 = eVar.f20861b.f20996d;
                    } else {
                        s2 s2Var = eVar.f20861b;
                        j8 = W1(r3Var, s2Var.f20994b, s2Var.f20996d);
                    }
                    j7 = j8;
                } else {
                    j7 = -9223372036854775807L;
                }
                z6 = z7;
            } else {
                j7 = -9223372036854775807L;
                z6 = false;
            }
            this.J = false;
            l2(eVar.f20861b, 1, this.K, false, z6, this.I, j7, -1);
        }
    }

    private int s1(int i7) {
        AudioTrack audioTrack = this.T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i7) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i7);
        }
        return this.T.getAudioSessionId();
    }

    private static boolean t1(s2 s2Var) {
        return s2Var.f20997e == 3 && s2Var.f21004l && s2Var.f21005m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(v2.d dVar, o2.l lVar) {
        dVar.G(this.f20518f, new v2.c(lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x1(final o1.e eVar) {
        this.f20524i.j(new Runnable() { // from class: r0.c0
            @Override // java.lang.Runnable
            public final void run() {
                c1.this.w1(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y1(v2.d dVar) {
        dVar.i0(r.j(new q1(1), 1003));
    }

    @Override // r0.v2
    public int A() {
        o2();
        int k12 = k1();
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    @Override // r0.v2
    public void B() {
        o2();
        h2(false);
    }

    @Override // r0.v2
    public int D() {
        o2();
        if (k()) {
            return this.f20547t0.f20994b.f22251c;
        }
        return -1;
    }

    @Override // r0.v2
    public int D0() {
        o2();
        return this.F;
    }

    @Override // r0.t
    public void F(final t0.e eVar, boolean z6) {
        o2();
        if (this.f20539p0) {
            return;
        }
        if (!o2.m0.c(this.f20523h0, eVar)) {
            this.f20523h0 = eVar;
            a2(1, 3, eVar);
            this.B.h(o2.m0.f0(eVar.f21710h));
            this.f20530l.i(20, new q.a() { // from class: r0.m0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).f0(t0.e.this);
                }
            });
        }
        this.A.m(z6 ? eVar : null);
        this.f20522h.h(eVar);
        boolean p7 = p();
        int p8 = this.A.p(p7, T());
        k2(p7, p8, m1(p7, p8));
        this.f20530l.f();
    }

    @Override // r0.v2
    public int G() {
        o2();
        return this.f20547t0.f21005m;
    }

    @Override // r0.v2
    public long H() {
        o2();
        if (!k()) {
            return b();
        }
        s2 s2Var = this.f20547t0;
        x.b bVar = s2Var.f20994b;
        s2Var.f20993a.l(bVar.f22249a, this.f20534n);
        return o2.m0.Y0(this.f20534n.e(bVar.f22250b, bVar.f22251c));
    }

    @Override // r0.v2
    public r3 I() {
        o2();
        return this.f20547t0.f20993a;
    }

    @Override // r0.t
    public int J() {
        o2();
        return this.f20521g0;
    }

    @Override // r0.v2
    public boolean L() {
        o2();
        return this.G;
    }

    @Override // r0.t
    public void M(t1.x xVar) {
        o2();
        c2(Collections.singletonList(xVar));
    }

    @Override // r0.v2
    public long N() {
        o2();
        return o2.m0.Y0(j1(this.f20547t0));
    }

    @Override // r0.v2
    public int T() {
        o2();
        return this.f20547t0.f20997e;
    }

    @Override // r0.v2
    public void W() {
        o2();
        boolean p7 = p();
        int p8 = this.A.p(p7, 2);
        k2(p7, p8, m1(p7, p8));
        s2 s2Var = this.f20547t0;
        if (s2Var.f20997e != 1) {
            return;
        }
        s2 e7 = s2Var.e(null);
        s2 g7 = e7.g(e7.f20993a.u() ? 4 : 2);
        this.H++;
        this.f20528k.k0();
        l2(g7, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // r0.v2
    public void X(final int i7) {
        o2();
        if (this.F != i7) {
            this.F = i7;
            this.f20528k.V0(i7);
            this.f20530l.i(8, new q.a() { // from class: r0.u0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).n0(i7);
                }
            });
            j2();
            this.f20530l.f();
        }
    }

    public void Y0(s0.c cVar) {
        o2.a.e(cVar);
        this.f20542r.D(cVar);
    }

    public void Z0(t.a aVar) {
        this.f20532m.add(aVar);
    }

    @Override // r0.v2
    public void a() {
        AudioTrack audioTrack;
        o2.r.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + o2.m0.f19756e + "] [" + p1.b() + "]");
        o2();
        if (o2.m0.f19752a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.f20556z.b(false);
        this.B.g();
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f20528k.m0()) {
            this.f20530l.k(10, new q.a() { // from class: r0.q0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    c1.y1((v2.d) obj);
                }
            });
        }
        this.f20530l.j();
        this.f20524i.i(null);
        this.f20546t.i(this.f20542r);
        s2 g7 = this.f20547t0.g(1);
        this.f20547t0 = g7;
        s2 b7 = g7.b(g7.f20994b);
        this.f20547t0 = b7;
        b7.f21008p = b7.f21010r;
        this.f20547t0.f21009q = 0L;
        this.f20542r.a();
        this.f20522h.f();
        Z1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.f20537o0) {
            ((o2.c0) o2.a.e(this.f20535n0)).b(0);
            this.f20537o0 = false;
        }
        this.f20529k0 = c2.e.f1859g;
        this.f20539p0 = true;
    }

    public void c2(List<t1.x> list) {
        o2();
        d2(list, true);
    }

    @Override // r0.v2
    public u2 d() {
        o2();
        return this.f20547t0.f21006n;
    }

    public void d2(List<t1.x> list, boolean z6) {
        o2();
        e2(list, -1, -9223372036854775807L, z6);
    }

    @Override // r0.v2
    public void e(u2 u2Var) {
        o2();
        if (u2Var == null) {
            u2Var = u2.f21046i;
        }
        if (this.f20547t0.f21006n.equals(u2Var)) {
            return;
        }
        s2 f7 = this.f20547t0.f(u2Var);
        this.H++;
        this.f20528k.T0(u2Var);
        l2(f7, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // r0.t
    public void f(final boolean z6) {
        o2();
        if (this.f20527j0 == z6) {
            return;
        }
        this.f20527j0 = z6;
        a2(1, 9, Boolean.valueOf(z6));
        this.f20530l.k(23, new q.a() { // from class: r0.p0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((v2.d) obj).b(z6);
            }
        });
    }

    @Override // r0.v2
    public void g(float f7) {
        o2();
        final float p7 = o2.m0.p(f7, 0.0f, 1.0f);
        if (this.f20525i0 == p7) {
            return;
        }
        this.f20525i0 = p7;
        b2();
        this.f20530l.k(22, new q.a() { // from class: r0.n0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((v2.d) obj).R(p7);
            }
        });
    }

    public boolean g1() {
        o2();
        return this.f20547t0.f21007o;
    }

    public Looper h1() {
        return this.f20544s;
    }

    public void h2(boolean z6) {
        o2();
        this.A.p(p(), 1);
        i2(z6, null);
        this.f20529k0 = c2.e.f1859g;
    }

    @Override // r0.v2
    public void i(boolean z6) {
        o2();
        int p7 = this.A.p(z6, T());
        k2(z6, p7, m1(z6, p7));
    }

    public long i1() {
        o2();
        if (this.f20547t0.f20993a.u()) {
            return this.f20553w0;
        }
        s2 s2Var = this.f20547t0;
        if (s2Var.f21003k.f22252d != s2Var.f20994b.f22252d) {
            return s2Var.f20993a.r(A(), this.f20581a).f();
        }
        long j7 = s2Var.f21008p;
        if (this.f20547t0.f21003k.b()) {
            s2 s2Var2 = this.f20547t0;
            r3.b l7 = s2Var2.f20993a.l(s2Var2.f21003k.f22249a, this.f20534n);
            long i7 = l7.i(this.f20547t0.f21003k.f22250b);
            j7 = i7 == Long.MIN_VALUE ? l7.f20915i : i7;
        }
        s2 s2Var3 = this.f20547t0;
        return o2.m0.Y0(W1(s2Var3.f20993a, s2Var3.f21003k, j7));
    }

    @Override // r0.v2
    public void j(Surface surface) {
        o2();
        Z1();
        g2(surface);
        int i7 = surface == null ? 0 : -1;
        V1(i7, i7);
    }

    @Override // r0.v2
    public boolean k() {
        o2();
        return this.f20547t0.f20994b.b();
    }

    @Override // r0.v2
    public long l() {
        o2();
        if (!k()) {
            return N();
        }
        s2 s2Var = this.f20547t0;
        s2Var.f20993a.l(s2Var.f20994b.f22249a, this.f20534n);
        s2 s2Var2 = this.f20547t0;
        return s2Var2.f20995c == -9223372036854775807L ? s2Var2.f20993a.r(A(), this.f20581a).d() : this.f20534n.p() + o2.m0.Y0(this.f20547t0.f20995c);
    }

    @Override // r0.v2
    public long m() {
        o2();
        return o2.m0.Y0(this.f20547t0.f21009q);
    }

    @Override // r0.v2
    public void n(int i7, long j7) {
        o2();
        this.f20542r.Z();
        r3 r3Var = this.f20547t0.f20993a;
        if (i7 < 0 || (!r3Var.u() && i7 >= r3Var.t())) {
            throw new w1(r3Var, i7, j7);
        }
        this.H++;
        if (k()) {
            o2.r.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            o1.e eVar = new o1.e(this.f20547t0);
            eVar.b(1);
            this.f20526j.a(eVar);
            return;
        }
        int i8 = T() != 1 ? 2 : 1;
        int A = A();
        s2 T1 = T1(this.f20547t0.g(i8), r3Var, U1(r3Var, i7, j7));
        this.f20528k.C0(r3Var, i7, o2.m0.B0(j7));
        l2(T1, 0, 1, true, true, 1, j1(T1), A);
    }

    @Override // r0.v2
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public r h() {
        o2();
        return this.f20547t0.f20998f;
    }

    @Override // r0.v2
    public long o() {
        o2();
        if (!k()) {
            return i1();
        }
        s2 s2Var = this.f20547t0;
        return s2Var.f21003k.equals(s2Var.f20994b) ? o2.m0.Y0(this.f20547t0.f21008p) : H();
    }

    @Override // r0.v2
    public boolean p() {
        o2();
        return this.f20547t0.f21004l;
    }

    @Override // r0.v2
    public void r(final boolean z6) {
        o2();
        if (this.G != z6) {
            this.G = z6;
            this.f20528k.Y0(z6);
            this.f20530l.i(9, new q.a() { // from class: r0.o0
                @Override // o2.q.a
                public final void invoke(Object obj) {
                    ((v2.d) obj).a0(z6);
                }
            });
            j2();
            this.f20530l.f();
        }
    }

    @Override // r0.t
    public s1 t() {
        o2();
        return this.R;
    }

    @Override // r0.v2
    public void u(v2.d dVar) {
        o2.a.e(dVar);
        this.f20530l.c(dVar);
    }

    @Override // r0.v2
    public w3 v() {
        o2();
        return this.f20547t0.f21001i.f18991d;
    }

    @Override // r0.t
    public void w(boolean z6) {
        o2();
        this.f20528k.w(z6);
        Iterator<t.a> it = this.f20532m.iterator();
        while (it.hasNext()) {
            it.next().B(z6);
        }
    }

    @Override // r0.v2
    public int y() {
        o2();
        if (this.f20547t0.f20993a.u()) {
            return this.f20551v0;
        }
        s2 s2Var = this.f20547t0;
        return s2Var.f20993a.f(s2Var.f20994b.f22249a);
    }

    @Override // r0.v2
    public int z() {
        o2();
        if (k()) {
            return this.f20547t0.f20994b.f22250b;
        }
        return -1;
    }
}
