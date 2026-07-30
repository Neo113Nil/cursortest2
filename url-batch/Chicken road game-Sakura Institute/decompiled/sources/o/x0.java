package o;

import android.view.KeyEvent;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x0 extends r1.m implements r1.c1, x0.l, j1.d, r1.n1, r1.l1, r1.k {
    public boolean A;
    public l1.d0 B;
    public m.w0 C;
    public k D;
    public final b1.b E;
    public final o0 F;
    public final k G;
    public final f1 H;
    public final m4.z I;
    public final i J;
    public a K;
    public a2.a L;
    public u0 M;

    /* renamed from: u, reason: collision with root package name */
    public j0 f6792u;

    /* renamed from: v, reason: collision with root package name */
    public r6.l f6793v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6794w;

    /* renamed from: x, reason: collision with root package name */
    public p.j f6795x;

    /* renamed from: y, reason: collision with root package name */
    public e7.e f6796y;

    /* renamed from: z, reason: collision with root package name */
    public p.b f6797z;

    public x0(m.w0 w0Var, k kVar, j0 j0Var, y0 y0Var, p.j jVar, boolean z8, boolean z9) {
        e eVar = e.f6595i;
        this.f6792u = j0Var;
        this.f6793v = eVar;
        this.f6794w = z8;
        this.f6795x = jVar;
        this.C = w0Var;
        this.D = kVar;
        b1.b bVar = new b1.b(9);
        this.E = bVar;
        o0 o0Var = new o0();
        o0Var.f6710s = z8;
        A0(o0Var);
        this.F = o0Var;
        k kVar2 = new k(new l.w(new b6.c(androidx.compose.foundation.gestures.a.f615c)));
        this.G = kVar2;
        m.w0 w0Var2 = this.C;
        k kVar3 = this.D;
        f1 f1Var = new f1(y0Var, w0Var2, kVar3 == null ? kVar2 : kVar3, j0Var, z9, bVar);
        this.H = f1Var;
        m4.z zVar = new m4.z(f1Var, z8);
        this.I = zVar;
        i iVar = new i(j0Var, f1Var, z9);
        A0(iVar);
        this.J = iVar;
        A0(new k1.e(zVar, bVar));
        A0(new x0.r());
        t.g gVar = new t.g();
        gVar.f8726s = iVar;
        A0(gVar);
        c1.a aVar = new c1.a(21, this);
        m.c0 c0Var = new m.c0();
        c0Var.f6125s = aVar;
        A0(c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D0(x0 x0Var, j6.c cVar) {
        b0 b0Var;
        int i7;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i8 = b0Var.f6567i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                b0Var.f6567i = i8 - Integer.MIN_VALUE;
                Object obj = b0Var.f6565g;
                i7 = b0Var.f6567i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    p.b bVar = x0Var.f6797z;
                    if (bVar != null) {
                        p.j jVar = x0Var.f6795x;
                        if (jVar != null) {
                            p.a aVar = new p.a(bVar);
                            b0Var.f6564f = x0Var;
                            b0Var.f6567i = 1;
                            Object b9 = jVar.b(aVar, b0Var);
                            i6.a aVar2 = i6.a.f4956f;
                            if (b9 == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                    x0Var.I0(0L);
                    return d6.z.f2639a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x0Var = b0Var.f6564f;
                d6.a.e(obj);
                x0Var.f6797z = null;
                x0Var.I0(0L);
                return d6.z.f2639a;
            }
        }
        b0Var = new b0(x0Var, cVar);
        Object obj2 = b0Var.f6565g;
        i7 = b0Var.f6567i;
        if (i7 != 0) {
        }
        x0Var.f6797z = null;
        x0Var.I0(0L);
        return d6.z.f2639a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r1.b(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E0(x0 x0Var, p pVar, j6.c cVar) {
        c0 c0Var;
        int i7;
        p.b bVar;
        p.j jVar;
        x0 x0Var2;
        p.b bVar2;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i8 = c0Var.f6578k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0Var.f6578k = i8 - Integer.MIN_VALUE;
                Object obj = c0Var.f6576i;
                i7 = c0Var.f6578k;
                i6.a aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    p.b bVar3 = x0Var.f6797z;
                    if (bVar3 != null && (r1 = x0Var.f6795x) != null) {
                        p.a aVar2 = new p.a(bVar3);
                        c0Var.f6573f = x0Var;
                        c0Var.f6574g = pVar;
                        c0Var.f6578k = 1;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = c0Var.f6575h;
                        pVar = c0Var.f6574g;
                        x0Var2 = c0Var.f6573f;
                        d6.a.e(obj);
                        bVar = bVar2;
                        x0Var = x0Var2;
                        x0Var.f6797z = bVar;
                        long j8 = pVar.f6715a;
                        x0Var.getClass();
                        return d6.z.f2639a;
                    }
                    pVar = c0Var.f6574g;
                    x0Var = c0Var.f6573f;
                    d6.a.e(obj);
                }
                bVar = new p.b();
                jVar = x0Var.f6795x;
                if (jVar != null) {
                    c0Var.f6573f = x0Var;
                    c0Var.f6574g = pVar;
                    c0Var.f6575h = bVar;
                    c0Var.f6578k = 2;
                    if (jVar.b(bVar, c0Var) != aVar) {
                        x0Var2 = x0Var;
                        bVar2 = bVar;
                        bVar = bVar2;
                        x0Var = x0Var2;
                    }
                    return aVar;
                }
                x0Var.f6797z = bVar;
                long j82 = pVar.f6715a;
                x0Var.getClass();
                return d6.z.f2639a;
            }
        }
        c0Var = new c0(x0Var, cVar);
        Object obj2 = c0Var.f6576i;
        i7 = c0Var.f6578k;
        i6.a aVar3 = i6.a.f4956f;
        if (i7 != 0) {
        }
        bVar = new p.b();
        jVar = x0Var.f6795x;
        if (jVar != null) {
        }
        x0Var.f6797z = bVar;
        long j822 = pVar.f6715a;
        x0Var.getClass();
        return d6.z.f2639a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F0(x0 x0Var, q qVar, j6.c cVar) {
        d0 d0Var;
        int i7;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i8 = d0Var.f6592j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                d0Var.f6592j = i8 - Integer.MIN_VALUE;
                Object obj = d0Var.f6590h;
                i7 = d0Var.f6592j;
                if (i7 != 0) {
                    d6.a.e(obj);
                    p.b bVar = x0Var.f6797z;
                    if (bVar != null) {
                        p.j jVar = x0Var.f6795x;
                        if (jVar != null) {
                            p.c cVar2 = new p.c(bVar);
                            d0Var.f6588f = x0Var;
                            d0Var.f6589g = qVar;
                            d0Var.f6592j = 1;
                            Object b9 = jVar.b(cVar2, d0Var);
                            i6.a aVar = i6.a.f4956f;
                            if (b9 == aVar) {
                                return aVar;
                            }
                        }
                    }
                    x0Var.I0(qVar.f6717a);
                    return d6.z.f2639a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = d0Var.f6589g;
                x0Var = d0Var.f6588f;
                d6.a.e(obj);
                x0Var.f6797z = null;
                x0Var.I0(qVar.f6717a);
                return d6.z.f2639a;
            }
        }
        d0Var = new d0(x0Var, cVar);
        Object obj2 = d0Var.f6590h;
        i7 = d0Var.f6592j;
        if (i7 != 0) {
        }
        x0Var.f6797z = null;
        x0Var.I0(qVar.f6717a);
        return d6.z.f2639a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [q6.c, r6.l] */
    @Override // r1.l1
    public final void A(l1.j jVar, l1.k kVar, long j8) {
        long j9;
        ?? r02 = jVar.f5812a;
        int size = r02.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            if (((Boolean) this.f6793v.f((l1.v) r02.get(i7))).booleanValue()) {
                if (this.f6794w && this.B == null) {
                    a0.e0 e0Var = new a0.e0(this, (h6.d) null, 20);
                    l1.j jVar2 = l1.a0.f5772a;
                    l1.d0 d0Var = new l1.d0(null, null, e0Var);
                    A0(d0Var);
                    this.B = d0Var;
                }
                l1.d0 d0Var2 = this.B;
                if (d0Var2 != null) {
                    d0Var2.A(jVar, kVar, j8);
                }
            } else {
                i7++;
            }
        }
        if (kVar == l1.k.f5816g && jVar.f5814c == 6) {
            ?? r12 = jVar.f5812a;
            int size2 = r12.size();
            for (int i8 = 0; i8 < size2; i8++) {
                if (((l1.v) r12.get(i8)).b()) {
                    return;
                }
            }
            r6.k.c(this.K);
            m2.b bVar = r1.f.t(this).f7735v;
            y0.c cVar = new y0.c(0L);
            int size3 = r12.size();
            int i9 = 0;
            while (true) {
                j9 = cVar.f9778a;
                if (i9 >= size3) {
                    break;
                }
                cVar = new y0.c(y0.c.h(j9, ((l1.v) r12.get(i9)).f5839j));
                i9++;
            }
            c7.a0.p(o0(), null, null, new u0(this, y0.c.i(j9, -bVar.y(64)), null, 2), 3);
            int size4 = r12.size();
            for (int i10 = 0; i10 < size4; i10++) {
                ((l1.v) r12.get(i10)).a();
            }
        }
    }

    @Override // x0.l
    public final void E(x0.i iVar) {
        iVar.b(false);
    }

    public final void G0() {
        p.b bVar = this.f6797z;
        if (bVar != null) {
            p.j jVar = this.f6795x;
            if (jVar != null) {
                jVar.c(new p.a(bVar));
            }
            this.f6797z = null;
        }
    }

    @Override // r1.c1
    public final void I() {
        r1.f.q(this, new a0(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [q6.a, r6.l] */
    public final void I0(long j8) {
        c7.x xVar = (c7.x) ((r6.l) this.E.f1231h).a();
        if (xVar == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        c7.a0.p(xVar, null, null, new u0(this, j8, null, 0), 3);
    }

    @Override // j1.d
    public final boolean O(KeyEvent keyEvent) {
        long a3;
        if (!this.f6794w) {
            return false;
        }
        if ((!j1.a.a(j1.c.Y(keyEvent), j1.a.f4982l) && !j1.a.a(r4.a.d(keyEvent.getKeyCode()), j1.a.f4981k)) || j1.c.e0(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        j0 j0Var = this.H.f6612d;
        j0 j0Var2 = j0.f6657f;
        i iVar = this.J;
        if (j0Var == j0Var2) {
            int i7 = (int) (iVar.f6642z & 4294967295L);
            a3 = u3.r.a(0.0f, j1.a.a(r4.a.d(keyEvent.getKeyCode()), j1.a.f4981k) ? i7 : -i7);
        } else {
            int i8 = (int) (iVar.f6642z >> 32);
            a3 = u3.r.a(j1.a.a(r4.a.d(keyEvent.getKeyCode()), j1.a.f4981k) ? i8 : -i8, 0.0f);
        }
        c7.a0.p(o0(), null, null, new u0(this, a3, null, 1), 3);
        return true;
    }

    @Override // r1.n1
    public final void S(y1.i iVar) {
        if (this.f6794w && (this.L == null || this.M == null)) {
            this.L = new a2.a(6, this);
            this.M = new u0(this, null);
        }
        a2.a aVar = this.L;
        if (aVar != null) {
            x6.e[] eVarArr = y1.r.f9886a;
            iVar.m(y1.h.f9809d, new y1.a(null, aVar));
        }
        u0 u0Var = this.M;
        if (u0Var != null) {
            x6.e[] eVarArr2 = y1.r.f9886a;
            iVar.m(y1.h.f9810e, u0Var);
        }
    }

    @Override // r1.l1
    public final void a0() {
        l1.d0 d0Var = this.B;
        if (d0Var != null) {
            d0Var.a0();
        }
    }

    @Override // j1.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    @Override // s0.n
    public final void s0() {
        r1.f.q(this, new a0(this, 2));
        this.K = a.f6557a;
    }

    @Override // s0.n
    public final void t0() {
        this.A = false;
        G0();
    }

    public final void H0(long j8) {
    }
}
