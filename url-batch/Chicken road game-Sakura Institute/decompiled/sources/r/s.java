package r;

import c0.w;
import c7.a0;
import d6.z;
import g0.d1;
import g0.g1;
import g0.t0;
import g0.z0;
import l.x1;
import l1.x;
import m.p0;
import o.y0;
import r1.d0;
import s.h0;
import s.j0;
import s.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements y0 {

    /* renamed from: w, reason: collision with root package name */
    public static final androidx.room.c f7673w;

    /* renamed from: a, reason: collision with root package name */
    public final q7.j f7674a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7675b;

    /* renamed from: c, reason: collision with root package name */
    public l f7676c;

    /* renamed from: d, reason: collision with root package name */
    public final w f7677d;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f7678e;

    /* renamed from: f, reason: collision with root package name */
    public final p.j f7679f;

    /* renamed from: g, reason: collision with root package name */
    public float f7680g;

    /* renamed from: h, reason: collision with root package name */
    public final o.m f7681h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7682i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f7683j;

    /* renamed from: k, reason: collision with root package name */
    public final p f7684k;

    /* renamed from: l, reason: collision with root package name */
    public final s.c f7685l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f7686m;

    /* renamed from: n, reason: collision with root package name */
    public final l1.i f7687n;

    /* renamed from: o, reason: collision with root package name */
    public final y f7688o;

    /* renamed from: p, reason: collision with root package name */
    public final x f7689p;

    /* renamed from: q, reason: collision with root package name */
    public final s.v f7690q;

    /* renamed from: r, reason: collision with root package name */
    public final z0 f7691r;

    /* renamed from: s, reason: collision with root package name */
    public final g1 f7692s;

    /* renamed from: t, reason: collision with root package name */
    public final g1 f7693t;

    /* renamed from: u, reason: collision with root package name */
    public final z0 f7694u;

    /* renamed from: v, reason: collision with root package name */
    public l.l f7695v;

    static {
        k kVar = k.f7627i;
        a2.a aVar = new a2.a(n.f7661g);
        r6.y.d(1, kVar);
        androidx.room.c cVar = p0.m.f7013a;
        f7673w = new androidx.room.c(aVar, 28, kVar);
    }

    public s(int i7, int i8) {
        q7.j jVar = new q7.j();
        jVar.f7563a = -1;
        this.f7674a = jVar;
        w wVar = new w();
        wVar.f1514b = g0.d.I(i7);
        wVar.f1515c = g0.d.I(i8);
        wVar.f1517e = new s.t(i7);
        this.f7677d = wVar;
        l lVar = v.f7697b;
        t0 t0Var = t0.f3900h;
        this.f7678e = g0.d.J(lVar, t0Var);
        this.f7679f = new p.j();
        this.f7681h = new o.m(new c1.a(25, this));
        this.f7682i = true;
        this.f7684k = new p(this);
        this.f7685l = new s.c();
        this.f7686m = new androidx.compose.foundation.lazy.layout.a();
        this.f7687n = new l1.i(2);
        this.f7688o = new y(new o(this, i7));
        this.f7689p = new x(10, this);
        this.f7690q = new s.v();
        z zVar = z.f2639a;
        this.f7691r = g0.d.J(zVar, t0Var);
        Boolean bool = Boolean.FALSE;
        t0 t0Var2 = t0.f3903k;
        this.f7692s = g0.d.J(bool, t0Var2);
        this.f7693t = g0.d.J(bool, t0Var2);
        this.f7694u = g0.d.J(zVar, t0Var);
        this.f7695v = new l.l(x1.f5722a, Float.valueOf(0.0f), new l.m(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // o.y0
    public final boolean a() {
        return ((Boolean) this.f7693t.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r8.b(r6, r7, r0) != r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // o.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(p0 p0Var, q6.e eVar, j6.c cVar) {
        q qVar;
        int i7;
        s sVar;
        q6.e eVar2;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i8 = qVar.f7669k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.f7669k = i8 - Integer.MIN_VALUE;
                Object obj = qVar.f7667i;
                i7 = qVar.f7669k;
                i6.a aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    qVar.f7664f = this;
                    qVar.f7665g = p0Var;
                    qVar.f7666h = (j6.i) eVar;
                    qVar.f7669k = 1;
                    if (this.f7685l.l(qVar) != aVar) {
                        sVar = this;
                        eVar2 = eVar;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return z.f2639a;
                }
                q6.e eVar3 = (q6.e) qVar.f7666h;
                p0Var = qVar.f7665g;
                sVar = qVar.f7664f;
                d6.a.e(obj);
                eVar2 = eVar3;
                o.m mVar = sVar.f7681h;
                qVar.f7664f = null;
                qVar.f7665g = null;
                qVar.f7666h = null;
                qVar.f7669k = 2;
            }
        }
        qVar = new q(this, cVar);
        Object obj2 = qVar.f7667i;
        i7 = qVar.f7669k;
        i6.a aVar2 = i6.a.f4956f;
        if (i7 != 0) {
        }
        o.m mVar2 = sVar.f7681h;
        qVar.f7664f = null;
        qVar.f7665g = null;
        qVar.f7666h = null;
        qVar.f7669k = 2;
    }

    @Override // o.y0
    public final boolean c() {
        return this.f7681h.c();
    }

    @Override // o.y0
    public final boolean d() {
        return ((Boolean) this.f7692s.getValue()).booleanValue();
    }

    @Override // o.y0
    public final float e(float f9) {
        return this.f7681h.e(f9);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(l lVar, boolean z8, boolean z9) {
        m mVar = lVar.f7629a;
        if (!z8 && this.f7675b) {
            this.f7676c = lVar;
            return;
        }
        if (z8) {
            this.f7675b = true;
        }
        ?? r42 = lVar.f7638j;
        this.f7693t.setValue(Boolean.valueOf(((mVar != null ? mVar.f7646a : 0) == 0 && lVar.f7630b == 0) ? false : true));
        this.f7692s.setValue(Boolean.valueOf(lVar.f7631c));
        this.f7680g -= lVar.f7632d;
        this.f7678e.setValue(lVar);
        w wVar = this.f7677d;
        h6.d dVar = null;
        if (z9) {
            int i7 = lVar.f7630b;
            if (i7 < 0.0f) {
                wVar.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i7 + ')').toString());
            }
            ((d1) wVar.f1515c).f(i7);
        } else {
            wVar.getClass();
            wVar.f1516d = mVar != null ? mVar.f7652g : null;
            if (wVar.f1513a || lVar.f7641m > 0) {
                wVar.f1513a = true;
                int i8 = lVar.f7630b;
                if (i8 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i8 + ')').toString());
                }
                wVar.g(mVar != null ? mVar.f7646a : 0, i8);
            }
            if (this.f7682i) {
                q7.j jVar = this.f7674a;
                if (jVar.f7563a != -1 && !r42.isEmpty()) {
                    if (jVar.f7563a != (jVar.f7564b ? ((m) e6.l.n0(r42)).f7646a + 1 : ((m) e6.l.h0(r42)).f7646a - 1)) {
                        jVar.f7563a = -1;
                        s.x xVar = (s.x) jVar.f7565c;
                        if (xVar != null) {
                            xVar.cancel();
                        }
                        jVar.f7565c = null;
                    }
                }
            }
        }
        if (z8) {
            float f9 = lVar.f7633e;
            m2.b bVar = lVar.f7636h;
            h7.c cVar = lVar.f7635g;
            if (f9 <= bVar.y(v.f7696a)) {
                return;
            }
            q0.g c4 = q0.r.c();
            q6.c f10 = c4 != null ? c4.f() : null;
            q0.g d8 = q0.r.d(c4);
            try {
                float floatValue = ((Number) this.f7695v.f5563g.getValue()).floatValue();
                l.l lVar2 = this.f7695v;
                boolean z10 = lVar2.f5567k;
                if (z10) {
                    this.f7695v = new l.l(lVar2.f5562f, Float.valueOf(floatValue - f9), new l.m(((l.m) lVar2.f5564h).f5569a), lVar2.f5565i, lVar2.f5566j, z10);
                    a0.p(cVar, null, null, new r(this, dVar, 1), 3);
                } else {
                    this.f7695v = new l.l(x1.f5722a, Float.valueOf(-f9), null, 60);
                    a0.p(cVar, null, null, new r(this, dVar, 2), 3);
                }
                q0.r.f(c4, d8, f10);
            } catch (Throwable th) {
                q0.r.f(c4, d8, f10);
                throw th;
            }
        }
    }

    public final l g() {
        return (l) this.f7678e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f9, l lVar) {
        s.x xVar;
        s.x xVar2;
        s.f fVar;
        s.x xVar3;
        if (this.f7682i) {
            ?? r02 = lVar.f7638j;
            ?? r12 = lVar.f7638j;
            if (r02.isEmpty()) {
                return;
            }
            boolean z8 = f9 < 0.0f;
            int i7 = z8 ? ((m) e6.l.n0(r12)).f7646a + 1 : ((m) e6.l.h0(r12)).f7646a - 1;
            if (i7 < 0 || i7 >= lVar.f7641m) {
                return;
            }
            q7.j jVar = this.f7674a;
            if (i7 != jVar.f7563a) {
                if (jVar.f7564b != z8 && (xVar3 = (s.x) jVar.f7565c) != null) {
                    xVar3.cancel();
                }
                jVar.f7564b = z8;
                jVar.f7563a = i7;
                s sVar = (s) this.f7689p.f5847g;
                q0.g c4 = q0.r.c();
                q6.c f10 = c4 != null ? c4.f() : null;
                q0.g d8 = q0.r.d(c4);
                try {
                    long j8 = ((l) sVar.f7678e.getValue()).f7637i;
                    q0.r.f(c4, d8, f10);
                    y yVar = sVar.f7688o;
                    b1.b bVar = yVar.f8072c;
                    if (bVar != null) {
                        h0 h0Var = new h0(bVar, i7, j8, yVar.f8071b);
                        ((j0) bVar.f1232i).d(h0Var);
                        fVar = h0Var;
                    } else {
                        fVar = s.f.f8001f;
                    }
                    jVar.f7565c = fVar;
                } catch (Throwable th) {
                    q0.r.f(c4, d8, f10);
                    throw th;
                }
            }
            if (!z8) {
                if (lVar.f7639k - ((m) e6.l.h0(r12)).f7655j >= f9 || (xVar = (s.x) jVar.f7565c) == null) {
                    return;
                }
                xVar.a();
                return;
            }
            m mVar = (m) e6.l.n0(r12);
            if (((mVar.f7655j + mVar.f7656k) + lVar.f7644p) - lVar.f7640l >= (-f9) || (xVar2 = (s.x) jVar.f7565c) == null) {
                return;
            }
            xVar2.a();
        }
    }
}
