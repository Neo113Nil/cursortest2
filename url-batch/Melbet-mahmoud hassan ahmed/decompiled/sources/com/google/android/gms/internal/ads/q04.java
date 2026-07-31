package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q04 implements r80, i14, nb4, d64, z84, w24 {

    /* renamed from: f, reason: collision with root package name */
    private final xv1 f10506f;

    /* renamed from: g, reason: collision with root package name */
    private final pf0 f10507g;

    /* renamed from: h, reason: collision with root package name */
    private final hh0 f10508h;

    /* renamed from: i, reason: collision with root package name */
    private final p04 f10509i;

    /* renamed from: j, reason: collision with root package name */
    private final SparseArray<r04> f10510j;

    /* renamed from: k, reason: collision with root package name */
    private nb2<s04> f10511k;

    /* renamed from: l, reason: collision with root package name */
    private ub0 f10512l;

    /* renamed from: m, reason: collision with root package name */
    private h52 f10513m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f10514n;

    public q04(xv1 xv1Var) {
        this.f10506f = xv1Var;
        this.f10511k = new nb2<>(n13.a(), xv1Var, new l92() { // from class: com.google.android.gms.internal.ads.k04
            @Override // com.google.android.gms.internal.ads.l92
            public final void a(Object obj, yb4 yb4Var) {
            }
        });
        pf0 pf0Var = new pf0();
        this.f10507g = pf0Var;
        this.f10508h = new hh0();
        this.f10509i = new p04(pf0Var);
        this.f10510j = new SparseArray<>();
    }

    public static /* synthetic */ void H(q04 q04Var) {
        final r04 F = q04Var.F();
        q04Var.P(F, 1036, new k82() { // from class: com.google.android.gms.internal.ads.m04
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
        q04Var.f10511k.e();
    }

    private final r04 T(s54 s54Var) {
        Objects.requireNonNull(this.f10512l);
        ei0 a7 = s54Var == null ? null : this.f10509i.a(s54Var);
        if (s54Var != null && a7 != null) {
            return G(a7, a7.n(s54Var.f5772a, this.f10507g).f10218c, s54Var);
        }
        int e7 = ((lx3) this.f10512l).e();
        ei0 o7 = this.f10512l.o();
        if (e7 >= o7.c()) {
            o7 = ei0.f4614a;
        }
        return G(o7, e7, null);
    }

    private final r04 U(int i7, s54 s54Var) {
        ub0 ub0Var = this.f10512l;
        Objects.requireNonNull(ub0Var);
        if (s54Var != null) {
            return this.f10509i.a(s54Var) != null ? T(s54Var) : G(ei0.f4614a, i7, s54Var);
        }
        ei0 o7 = ub0Var.o();
        if (i7 >= o7.c()) {
            o7 = ei0.f4614a;
        }
        return G(o7, i7, null);
    }

    private final r04 V() {
        return T(this.f10509i.d());
    }

    private final r04 W() {
        return T(this.f10509i.e());
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void A(int i7, s54 s54Var, final p54 p54Var) {
        final r04 U = U(i7, s54Var);
        P(U, 1004, new k82() { // from class: com.google.android.gms.internal.ads.uz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void B(final String str) {
        final r04 W = W();
        P(W, 1024, new k82() { // from class: com.google.android.gms.internal.ads.a04
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void C(final long j7) {
        final r04 W = W();
        P(W, 1011, new k82(j7) { // from class: com.google.android.gms.internal.ads.zy3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void D(int i7, s54 s54Var, final k54 k54Var, final p54 p54Var) {
        final r04 U = U(i7, s54Var);
        P(U, 1002, new k82() { // from class: com.google.android.gms.internal.ads.qz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void E(final c0 c0Var, final de3 de3Var) {
        final r04 W = W();
        P(W, 1022, new k82() { // from class: com.google.android.gms.internal.ads.cz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
                ((s04) obj).o(r04.this, c0Var, de3Var);
            }
        });
    }

    protected final r04 F() {
        return T(this.f10509i.b());
    }

    protected final r04 G(ei0 ei0Var, int i7, s54 s54Var) {
        s54 s54Var2 = true == ei0Var.o() ? null : s54Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = ei0Var.equals(this.f10512l.o()) && i7 == ((lx3) this.f10512l).e();
        long j7 = 0;
        if (s54Var2 == null || !s54Var2.b()) {
            if (z6) {
                j7 = this.f10512l.i();
            } else if (!ei0Var.o()) {
                long j8 = ei0Var.e(i7, this.f10508h, 0L).f6258k;
                j7 = nz3.d(0L);
            }
        } else if (z6 && this.f10512l.b() == s54Var2.f5773b && this.f10512l.d() == s54Var2.f5774c) {
            j7 = this.f10512l.j();
        }
        return new r04(elapsedRealtime, ei0Var, i7, s54Var2, j7, this.f10512l.o(), ((lx3) this.f10512l).e(), this.f10509i.b(), this.f10512l.j(), this.f10512l.k());
    }

    public final void I(s04 s04Var) {
        this.f10511k.b(s04Var);
    }

    final /* synthetic */ void J(ub0 ub0Var, s04 s04Var, yb4 yb4Var) {
        SparseArray<r04> sparseArray = this.f10510j;
        SparseArray sparseArray2 = new SparseArray(yb4Var.b());
        for (int i7 = 0; i7 < yb4Var.b(); i7++) {
            int a7 = yb4Var.a(i7);
            r04 r04Var = sparseArray.get(a7);
            Objects.requireNonNull(r04Var);
            sparseArray2.append(a7, r04Var);
        }
    }

    public final void K() {
        if (this.f10514n) {
            return;
        }
        final r04 F = F();
        this.f10514n = true;
        P(F, -1, new k82() { // from class: com.google.android.gms.internal.ads.qy3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    public final void L() {
        h52 h52Var = this.f10513m;
        wu1.b(h52Var);
        h52Var.F(new Runnable() { // from class: com.google.android.gms.internal.ads.l04
            @Override // java.lang.Runnable
            public final void run() {
                q04.H(q04.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void M(final String str) {
        final r04 W = W();
        P(W, 1013, new k82() { // from class: com.google.android.gms.internal.ads.zz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    public final void N(s04 s04Var) {
        this.f10511k.f(s04Var);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void O(final int i7) {
        final r04 F = F();
        P(F, 4, new k82() { // from class: com.google.android.gms.internal.ads.ry3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
                ((s04) obj).A(r04.this, i7);
            }
        });
    }

    protected final void P(r04 r04Var, int i7, k82<s04> k82Var) {
        this.f10510j.put(i7, r04Var);
        nb2<s04> nb2Var = this.f10511k;
        nb2Var.d(i7, k82Var);
        nb2Var.c();
    }

    public final void Q(final ub0 ub0Var, Looper looper) {
        e73 e73Var;
        boolean z6 = true;
        if (this.f10512l != null) {
            e73Var = this.f10509i.f9978b;
            if (!e73Var.isEmpty()) {
                z6 = false;
            }
        }
        wu1.f(z6);
        this.f10512l = ub0Var;
        this.f10513m = this.f10506f.a(looper, null);
        this.f10511k = this.f10511k.a(looper, new l92() { // from class: com.google.android.gms.internal.ads.j04
            @Override // com.google.android.gms.internal.ads.l92
            public final void a(Object obj, yb4 yb4Var) {
                q04.this.J(ub0Var, (s04) obj, yb4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void R(final int i7) {
        final r04 F = F();
        P(F, 6, new k82(i7) { // from class: com.google.android.gms.internal.ads.sy3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    public final void S(List<s54> list, s54 s54Var) {
        p04 p04Var = this.f10509i;
        ub0 ub0Var = this.f10512l;
        Objects.requireNonNull(ub0Var);
        p04Var.h(list, s54Var, ub0Var);
    }

    @Override // com.google.android.gms.internal.ads.r80, com.google.android.gms.internal.ads.i14
    public final void a(final boolean z6) {
        final r04 W = W();
        P(W, 1017, new k82(z6) { // from class: com.google.android.gms.internal.ads.f04
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r80, com.google.android.gms.internal.ads.nb4
    public final void b(final ry0 ry0Var) {
        final r04 W = W();
        P(W, 1028, new k82() { // from class: com.google.android.gms.internal.ads.kz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
                r04 r04Var = r04.this;
                ry0 ry0Var2 = ry0Var;
                ((s04) obj).u(r04Var, ry0Var2);
                int i7 = ry0Var2.f11567a;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void b0(final boolean z6) {
        final r04 F = F();
        P(F, 3, new k82(z6) { // from class: com.google.android.gms.internal.ads.d04
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void c(final long j7, final int i7) {
        final r04 V = V();
        P(V, 1026, new k82(j7, i7) { // from class: com.google.android.gms.internal.ads.az3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void c0(final e30 e30Var) {
        final r04 F = F();
        P(F, 12, new k82() { // from class: com.google.android.gms.internal.ads.gz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.z84
    public final void d(final int i7, final long j7, final long j8) {
        final r04 T = T(this.f10509i.c());
        P(T, 1006, new k82(i7, j7, j8) { // from class: com.google.android.gms.internal.ads.xy3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void d0(final boolean z6, final int i7) {
        final r04 F = F();
        P(F, 5, new k82(z6, i7) { // from class: com.google.android.gms.internal.ads.h04
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void e(final cd3 cd3Var) {
        final r04 W = W();
        P(W, 1020, new k82() { // from class: com.google.android.gms.internal.ads.pz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void e0(final ta0 ta0Var, final ta0 ta0Var2, final int i7) {
        if (i7 == 1) {
            this.f10514n = false;
            i7 = 1;
        }
        p04 p04Var = this.f10509i;
        ub0 ub0Var = this.f10512l;
        Objects.requireNonNull(ub0Var);
        p04Var.g(ub0Var);
        final r04 F = F();
        P(F, 11, new k82(i7, ta0Var, ta0Var2) { // from class: com.google.android.gms.internal.ads.yy3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ta0 f14863b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ta0 f14864c;

            {
                this.f14863b = ta0Var;
                this.f14864c = ta0Var2;
            }

            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void f(final cd3 cd3Var) {
        final r04 W = W();
        P(W, 1008, new k82() { // from class: com.google.android.gms.internal.ads.mz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void f0(ei0 ei0Var, final int i7) {
        p04 p04Var = this.f10509i;
        ub0 ub0Var = this.f10512l;
        Objects.requireNonNull(ub0Var);
        p04Var.i(ub0Var);
        final r04 F = F();
        P(F, 0, new k82(i7) { // from class: com.google.android.gms.internal.ads.ty3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r80
    public final /* synthetic */ void g(int i7, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void g0(final boolean z6, final int i7) {
        final r04 F = F();
        P(F, -1, new k82(z6, i7) { // from class: com.google.android.gms.internal.ads.i04
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void h(int i7, s54 s54Var, final k54 k54Var, final p54 p54Var) {
        final r04 U = U(i7, s54Var);
        P(U, 1001, new k82() { // from class: com.google.android.gms.internal.ads.rz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void h0(final pw0 pw0Var) {
        final r04 F = F();
        P(F, 2, new k82() { // from class: com.google.android.gms.internal.ads.jz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void i(final Exception exc) {
        final r04 W = W();
        P(W, 1018, new k82() { // from class: com.google.android.gms.internal.ads.wz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void i0(final z60 z60Var) {
        final r04 F = F();
        P(F, 13, new k82() { // from class: com.google.android.gms.internal.ads.hz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void j(final int i7, final long j7) {
        final r04 V = V();
        P(V, 1023, new k82() { // from class: com.google.android.gms.internal.ads.vy3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
                ((s04) obj).r(r04.this, i7, j7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void j0(final fu fuVar) {
        final r04 F = F();
        P(F, 14, new k82() { // from class: com.google.android.gms.internal.ads.ez3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void k(final String str, final long j7, final long j8) {
        final r04 W = W();
        P(W, 1009, new k82(str, j8, j7) { // from class: com.google.android.gms.internal.ads.b04

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f3149b;

            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void k0(final zo zoVar, final int i7) {
        final r04 F = F();
        P(F, 1, new k82(zoVar, i7) { // from class: com.google.android.gms.internal.ads.dz3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zo f4406b;

            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void l(final Exception exc) {
        final r04 W = W();
        P(W, 1038, new k82() { // from class: com.google.android.gms.internal.ads.xz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void l0(final hm0 hm0Var, final in0 in0Var) {
        final r04 F = F();
        P(F, 2, new k82() { // from class: com.google.android.gms.internal.ads.iz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r80
    public final /* synthetic */ void m() {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void m0(final boolean z6) {
        final r04 F = F();
        P(F, 7, new k82(z6) { // from class: com.google.android.gms.internal.ads.e04
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void n(final cd3 cd3Var) {
        final r04 V = V();
        P(V, 1014, new k82() { // from class: com.google.android.gms.internal.ads.lz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void n0(final c10 c10Var) {
        gv gvVar;
        final r04 r04Var = null;
        if ((c10Var instanceof ll3) && (gvVar = ((ll3) c10Var).f8014n) != null) {
            r04Var = T(new s54(gvVar));
        }
        if (r04Var == null) {
            r04Var = F();
        }
        P(r04Var, 10, new k82() { // from class: com.google.android.gms.internal.ads.fz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
                ((s04) obj).q(r04.this, c10Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void o() {
        final r04 F = F();
        P(F, -1, new k82() { // from class: com.google.android.gms.internal.ads.g04
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void p(final int i7, final long j7, final long j8) {
        final r04 W = W();
        P(W, 1012, new k82(i7, j7, j8) { // from class: com.google.android.gms.internal.ads.wy3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void q(final cd3 cd3Var) {
        final r04 V = V();
        P(V, 1025, new k82() { // from class: com.google.android.gms.internal.ads.oz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void r(int i7, s54 s54Var, final k54 k54Var, final p54 p54Var) {
        final r04 U = U(i7, s54Var);
        P(U, 1000, new k82() { // from class: com.google.android.gms.internal.ads.sz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void s(final String str, final long j7, final long j8) {
        final r04 W = W();
        P(W, 1021, new k82(str, j8, j7) { // from class: com.google.android.gms.internal.ads.c04

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f3677b;

            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r80
    public final /* synthetic */ void t(r34 r34Var) {
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void u(int i7, s54 s54Var, final k54 k54Var, final p54 p54Var, final IOException iOException, final boolean z6) {
        final r04 U = U(i7, s54Var);
        P(U, 1003, new k82() { // from class: com.google.android.gms.internal.ads.tz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
                ((s04) obj).z(r04.this, k54Var, p54Var, iOException, z6);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r80
    public final void v(final float f7) {
        final r04 W = W();
        P(W, 1019, new k82(f7) { // from class: com.google.android.gms.internal.ads.n04
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void w(final Object obj, final long j7) {
        final r04 W = W();
        P(W, 1027, new k82() { // from class: com.google.android.gms.internal.ads.yz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj2) {
                ((s04) obj2).x(r04.this, obj, j7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r80
    public final void x(final int i7, final int i8) {
        final r04 W = W();
        P(W, 1029, new k82(i7, i8) { // from class: com.google.android.gms.internal.ads.uy3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void y(final c0 c0Var, final de3 de3Var) {
        final r04 W = W();
        P(W, 1010, new k82() { // from class: com.google.android.gms.internal.ads.bz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
                ((s04) obj).d(r04.this, c0Var, de3Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void z(final Exception exc) {
        final r04 W = W();
        P(W, 1037, new k82() { // from class: com.google.android.gms.internal.ads.vz3
            @Override // com.google.android.gms.internal.ads.k82
            public final void c(Object obj) {
            }
        });
    }
}
