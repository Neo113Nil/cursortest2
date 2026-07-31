package u;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import w1.p1;
import w1.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x0 extends w1.l implements o1.c, s1, w1.j, p1 {
    public long A;
    public q1.s B;
    public t.j C;
    public i D;
    public final c5.x E;
    public final m0 F;
    public final i G;
    public final e1 H;
    public final k5.c I;
    public final g J;
    public b6.j0 K;
    public u0 L;
    public i0 M;

    /* renamed from: t, reason: collision with root package name */
    public j0 f7120t;

    /* renamed from: u, reason: collision with root package name */
    public r.s1 f7121u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7122v;

    /* renamed from: w, reason: collision with root package name */
    public v.j f7123w;

    /* renamed from: x, reason: collision with root package name */
    public c7.c f7124x;

    /* renamed from: y, reason: collision with root package name */
    public v.b f7125y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7126z;

    public x0(t.j jVar, i iVar, j0 j0Var, y0 y0Var, v.j jVar2, boolean z3, boolean z7) {
        r.s1 s1Var = r0.f7082a;
        this.f7120t = j0Var;
        this.f7121u = s1Var;
        this.f7122v = z3;
        this.f7123w = jVar2;
        this.A = 0L;
        this.C = jVar;
        this.D = iVar;
        c5.x xVar = new c5.x(5);
        this.E = xVar;
        m0 m0Var = new m0();
        m0Var.f7048r = z3;
        r0(m0Var);
        this.F = m0Var;
        i iVar2 = new i(new r.s(new b1.b(r0.f7085d)));
        this.G = iVar2;
        t.j jVar3 = this.C;
        i iVar3 = this.D;
        e1 e1Var = new e1(y0Var, jVar3, iVar3 == null ? iVar2 : iVar3, j0Var, z7, xVar, this, new u(this, 2));
        this.H = e1Var;
        k5.c cVar = new k5.c(e1Var, z3);
        this.I = cVar;
        g gVar = new g(j0Var, e1Var, z7);
        r0(gVar);
        this.J = gVar;
        r0(new p1.e(cVar, xVar));
        r0(new d1.n(2, null, 4));
        b0.f fVar = new b0.f();
        fVar.f1044r = gVar;
        r0(fVar);
        a0.t tVar = new a0.t(23, this);
        t.d0 d0Var = new t.d0();
        d0Var.f6763r = tVar;
        r0(d0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r9v6, types: [p6.a, q6.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u0(x0 x0Var, i6.c cVar) {
        w wVar;
        int i;
        a7.u uVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i8 = wVar.i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                wVar.i = i8 - Integer.MIN_VALUE;
                Object obj = wVar.f7111g;
                i = wVar.i;
                g6.c cVar2 = null;
                if (i != 0) {
                    s6.a.K(obj);
                    v.b bVar = x0Var.f7125y;
                    if (bVar != null) {
                        v.j jVar = x0Var.f7123w;
                        if (jVar != null) {
                            v.a aVar = new v.a(bVar);
                            wVar.i = 1;
                            Object b8 = jVar.b(aVar, wVar);
                            h6.a aVar2 = h6.a.f3204d;
                            if (b8 == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                    uVar = (a7.u) ((q6.j) x0Var.E.f1739f).b();
                    if (uVar == null) {
                        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
                    }
                    a7.x.n(uVar, null, new u0(x0Var, 0L, cVar2, 0), 3);
                    return c6.m.f1757a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s6.a.K(obj);
                x0Var.f7125y = null;
                uVar = (a7.u) ((q6.j) x0Var.E.f1739f).b();
                if (uVar == null) {
                }
            }
        }
        wVar = new w(x0Var, cVar);
        Object obj2 = wVar.f7111g;
        i = wVar.i;
        g6.c cVar22 = null;
        if (i != 0) {
        }
        x0Var.f7125y = null;
        uVar = (a7.u) ((q6.j) x0Var.E.f1739f).b();
        if (uVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r1.b(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v0(x0 x0Var, m mVar, i6.c cVar) {
        x xVar;
        int i;
        v.b bVar;
        v.j jVar;
        m mVar2;
        v.b bVar2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i8 = xVar.f7119k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                xVar.f7119k = i8 - Integer.MIN_VALUE;
                Object obj = xVar.i;
                i = xVar.f7119k;
                h6.a aVar = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj);
                    v.b bVar3 = x0Var.f7125y;
                    if (bVar3 != null && (r1 = x0Var.f7123w) != null) {
                        v.a aVar2 = new v.a(bVar3);
                        xVar.f7116g = mVar;
                        xVar.f7119k = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = xVar.f7117h;
                        mVar2 = xVar.f7116g;
                        s6.a.K(obj);
                        bVar = bVar2;
                        mVar = mVar2;
                        x0Var.f7125y = bVar;
                        long j7 = mVar.f7046a;
                        return c6.m.f1757a;
                    }
                    mVar = xVar.f7116g;
                    s6.a.K(obj);
                }
                bVar = new v.b();
                jVar = x0Var.f7123w;
                if (jVar != null) {
                    xVar.f7116g = mVar;
                    xVar.f7117h = bVar;
                    xVar.f7119k = 2;
                    if (jVar.b(bVar, xVar) != aVar) {
                        mVar2 = mVar;
                        bVar2 = bVar;
                        bVar = bVar2;
                        mVar = mVar2;
                    }
                    return aVar;
                }
                x0Var.f7125y = bVar;
                long j72 = mVar.f7046a;
                return c6.m.f1757a;
            }
        }
        xVar = new x(x0Var, cVar);
        Object obj2 = xVar.i;
        i = xVar.f7119k;
        h6.a aVar3 = h6.a.f3204d;
        if (i != 0) {
        }
        bVar = new v.b();
        jVar = x0Var.f7123w;
        if (jVar != null) {
        }
        x0Var.f7125y = bVar;
        long j722 = mVar.f7046a;
        return c6.m.f1757a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r9v4, types: [p6.a, q6.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w0(x0 x0Var, n nVar, i6.c cVar) {
        y yVar;
        int i;
        a7.u uVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i8 = yVar.f7129j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                yVar.f7129j = i8 - Integer.MIN_VALUE;
                Object obj = yVar.f7128h;
                i = yVar.f7129j;
                g6.c cVar2 = null;
                if (i != 0) {
                    s6.a.K(obj);
                    v.b bVar = x0Var.f7125y;
                    if (bVar != null) {
                        v.j jVar = x0Var.f7123w;
                        if (jVar != null) {
                            v.c cVar3 = new v.c(bVar);
                            yVar.f7127g = nVar;
                            yVar.f7129j = 1;
                            Object b8 = jVar.b(cVar3, yVar);
                            h6.a aVar = h6.a.f3204d;
                            if (b8 == aVar) {
                                return aVar;
                            }
                        }
                    }
                    long j7 = nVar.f7049a;
                    uVar = (a7.u) ((q6.j) x0Var.E.f1739f).b();
                    if (uVar == null) {
                        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
                    }
                    a7.x.n(uVar, null, new u0(x0Var, j7, cVar2, 0), 3);
                    return c6.m.f1757a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = yVar.f7127g;
                s6.a.K(obj);
                x0Var.f7125y = null;
                long j72 = nVar.f7049a;
                uVar = (a7.u) ((q6.j) x0Var.E.f1739f).b();
                if (uVar == null) {
                }
            }
        }
        yVar = new y(x0Var, cVar);
        Object obj2 = yVar.f7128h;
        i = yVar.f7129j;
        g6.c cVar22 = null;
        if (i != 0) {
        }
        x0Var.f7125y = null;
        long j722 = nVar.f7049a;
        uVar = (a7.u) ((q6.j) x0Var.E.f1739f).b();
        if (uVar == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // w1.p1
    public final void C(q1.f fVar, q1.g gVar, long j7) {
        g6.c cVar;
        long j8;
        ?? r02 = fVar.f5986a;
        int size = r02.size();
        int i = 0;
        while (true) {
            cVar = null;
            int i8 = 1;
            if (i >= size) {
                break;
            }
            if (((Boolean) this.f7121u.i((q1.k) r02.get(i))).booleanValue()) {
                if (this.f7122v && this.B == null) {
                    t.i iVar = new t.i(i8, this);
                    q1.f fVar2 = q1.q.f6022a;
                    q1.s sVar = new q1.s(null, null, iVar);
                    r0(sVar);
                    this.B = sVar;
                }
                q1.s sVar2 = this.B;
                if (sVar2 != null) {
                    sVar2.C(fVar, gVar, j7);
                }
            } else {
                i++;
            }
        }
        if (this.f7122v) {
            if (gVar == q1.g.f5988d && fVar.f5987b == 6) {
                if (this.M == null) {
                    if (!this.f8706d.f8718q) {
                        t1.a.b("Cannot get View because the Modifier node is not currently attached.");
                    }
                    this.M = new i0(this.H, new q3.k(9, ViewConfiguration.get(((View) w1.i0.a(w1.f.u(this))).getContext())), new t0(2, this, x0.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 0), w1.f.u(this).f7659y);
                }
                i0 i0Var = this.M;
                if (i0Var != null) {
                    a7.u f02 = f0();
                    if (((a7.h1) i0Var.f7021g) == null) {
                        i0Var.f7021g = a7.x.n(f02, null, new b0.d(i0Var, cVar, 12), 3);
                    }
                }
            }
            i0 i0Var2 = this.M;
            if (i0Var2 == null || gVar != q1.g.f5989e) {
                return;
            }
            int i9 = fVar.f5987b;
            ?? r32 = fVar.f5986a;
            if (i9 == 6) {
                int size2 = r32.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    if (((q1.k) r32.get(i10)).b()) {
                        return;
                    }
                }
                q3.k kVar = (q3.k) i0Var2.f7017c;
                r2.c cVar2 = (r2.c) i0Var2.f7019e;
                ViewConfiguration viewConfiguration = (ViewConfiguration) kVar.f6119e;
                int i11 = Build.VERSION.SDK_INT;
                float f6 = -(i11 > 26 ? q3.l.e(viewConfiguration) : cVar2.u(64));
                float f8 = -(i11 > 26 ? q3.l.b(viewConfiguration) : cVar2.u(64));
                e1.b bVar = new e1.b(0L);
                int size3 = r32.size();
                int i12 = 0;
                while (true) {
                    j8 = bVar.f2455a;
                    if (i12 >= size3) {
                        break;
                    }
                    bVar = new e1.b(e1.b.e(j8, ((q1.k) r32.get(i12)).f6002j));
                    i12++;
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 >> 32)) * f8) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) * f6) & 4294967295L);
                e1 e1Var = (e1) i0Var2.f7016b;
                float g3 = e1Var.g(e1Var.e(floatToRawIntBits));
                if ((g3 > 0.0f ? 1 : (g3 == 0.0f ? 0 : -1)) == 0 ? false : (g3 > 0.0f ? 1 : (g3 == 0.0f ? 0 : -1)) > 0 ? e1Var.f6962a.d() : e1Var.f6962a.a() ? !(((c7.c) i0Var2.f7020f).t(new d0(floatToRawIntBits, ((q1.k) d6.m.R(r32)).f5995b, false)) instanceof c7.i) : i0Var2.f7015a) {
                    int size4 = r32.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        ((q1.k) r32.get(i13)).a();
                    }
                }
            }
        }
    }

    @Override // o1.c
    public final boolean K(KeyEvent keyEvent) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        if (!this.f7122v) {
            return false;
        }
        if ((!o1.a.a(h0.a.c(keyEvent.getKeyCode()), o1.a.f5594n) && !o1.a.a(h0.a.c(keyEvent.getKeyCode()), o1.a.f5593m)) || m.a.E(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        j0 j0Var = this.H.f6965d;
        j0 j0Var2 = j0.f7027d;
        g gVar = this.J;
        if (j0Var == j0Var2) {
            int i = (int) (gVar.f6994y & 4294967295L);
            float f6 = o1.a.a(h0.a.c(keyEvent.getKeyCode()), o1.a.f5593m) ? i : -i;
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits2 = Float.floatToRawIntBits(f6);
        } else {
            int i8 = (int) (gVar.f6994y >> 32);
            floatToRawIntBits = Float.floatToRawIntBits(o1.a.a(h0.a.c(keyEvent.getKeyCode()), o1.a.f5593m) ? i8 : -i8);
            floatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
        }
        a7.x.n(f0(), null, new u0(this, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), null, 1), 3);
        return true;
    }

    @Override // w1.p1
    public final void S() {
        q1.s sVar = this.B;
        if (sVar != null) {
            sVar.S();
        }
    }

    @Override // w1.k
    public final void a() {
        S();
        if (this.f8718q) {
            r2.c cVar = w1.f.u(this).f7659y;
            i iVar = this.G;
            iVar.getClass();
            iVar.f7013a = new r.s(new b1.b(cVar));
        }
        i0 i0Var = this.M;
        if (i0Var != null) {
            i0Var.f7019e = w1.f.u(this).f7659y;
        }
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    @Override // o1.c
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    @Override // y0.l
    public final void j0() {
        if (this.f8718q) {
            r2.c cVar = w1.f.u(this).f7659y;
            i iVar = this.G;
            iVar.getClass();
            iVar.f7013a = new r.s(new b1.b(cVar));
        }
        i0 i0Var = this.M;
        if (i0Var != null) {
            i0Var.f7019e = w1.f.u(this).f7659y;
        }
    }

    @Override // y0.l
    public final void k0() {
        this.f7126z = false;
        x0();
        this.A = 0L;
    }

    @Override // w1.s1
    public final void q(d2.j jVar) {
        if (this.f7122v && (this.K == null || this.L == null)) {
            this.K = new b6.j0(9, this);
            this.L = new u0(this, null);
        }
        b6.j0 j0Var = this.K;
        if (j0Var != null) {
            w6.d[] dVarArr = d2.u.f2215a;
            jVar.e(d2.i.f2128d, new d2.a(null, j0Var));
        }
        u0 u0Var = this.L;
        if (u0Var != null) {
            w6.d[] dVarArr2 = d2.u.f2215a;
            jVar.e(d2.i.f2129e, u0Var);
        }
    }

    public final void x0() {
        v.b bVar = this.f7125y;
        if (bVar != null) {
            v.j jVar = this.f7123w;
            if (jVar != null) {
                jVar.c(new v.a(bVar));
            }
            this.f7125y = null;
        }
    }

    public final void y0(t.j jVar, i iVar, j0 j0Var, y0 y0Var, v.j jVar2, boolean z3, boolean z7) {
        boolean z8;
        q1.s sVar;
        boolean z9 = true;
        boolean z10 = false;
        if (this.f7122v != z3) {
            this.I.f4185a = z3;
            this.F.f7048r = z3;
            z8 = true;
        } else {
            z8 = false;
        }
        i iVar2 = iVar == null ? this.G : iVar;
        e1 e1Var = this.H;
        if (!q6.i.a(e1Var.f6962a, y0Var)) {
            e1Var.f6962a = y0Var;
            z10 = true;
        }
        e1Var.f6963b = jVar;
        if (e1Var.f6965d != j0Var) {
            e1Var.f6965d = j0Var;
            z10 = true;
        }
        if (e1Var.f6966e != z7) {
            e1Var.f6966e = z7;
            z10 = true;
        }
        e1Var.f6964c = iVar2;
        e1Var.f6967f = this.E;
        g gVar = this.J;
        gVar.f6987r = j0Var;
        gVar.f6989t = z7;
        this.C = jVar;
        this.D = iVar;
        r.s1 s1Var = r0.f7082a;
        j0 j0Var2 = e1Var.f6965d;
        j0 j0Var3 = j0.f7027d;
        if (j0Var2 != j0Var3) {
            j0Var3 = j0.f7028e;
        }
        this.f7121u = s1Var;
        if (this.f7122v != z3) {
            this.f7122v = z3;
            if (!z3) {
                x0();
                q1.s sVar2 = this.B;
                if (sVar2 != null) {
                    s0(sVar2);
                }
                this.B = null;
            }
            z10 = true;
        }
        if (!q6.i.a(this.f7123w, jVar2)) {
            x0();
            this.f7123w = jVar2;
        }
        if (this.f7120t != j0Var3) {
            this.f7120t = j0Var3;
        } else {
            z9 = z10;
        }
        if (z9 && (sVar = this.B) != null) {
            sVar.s0();
        }
        if (z8) {
            this.K = null;
            this.L = null;
            w1.f.n(this);
        }
    }
}
