package z;

import a0.a0;
import a0.h0;
import a0.k0;
import a0.m0;
import a0.n0;
import a0.p0;
import a0.q0;
import a0.t;
import a7.u;
import a7.x;
import b6.j0;
import g2.v;
import m0.e1;
import m0.h1;
import m0.v0;
import m0.z0;
import r.r1;
import r.s1;
import u.y0;
import w1.f0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p implements y0 {

    /* renamed from: x, reason: collision with root package name */
    public static final a0 f9076x;

    /* renamed from: a, reason: collision with root package name */
    public final a f9077a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9078b;

    /* renamed from: c, reason: collision with root package name */
    public k f9079c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9080d;

    /* renamed from: e, reason: collision with root package name */
    public final i0.h f9081e;

    /* renamed from: f, reason: collision with root package name */
    public final h1 f9082f;

    /* renamed from: g, reason: collision with root package name */
    public final v.j f9083g;

    /* renamed from: h, reason: collision with root package name */
    public float f9084h;
    public final l.r i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f9085j;

    /* renamed from: k, reason: collision with root package name */
    public f0 f9086k;

    /* renamed from: l, reason: collision with root package name */
    public final n f9087l;

    /* renamed from: m, reason: collision with root package name */
    public final a0.f f9088m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f9089n;

    /* renamed from: o, reason: collision with root package name */
    public final a0.l f9090o;

    /* renamed from: p, reason: collision with root package name */
    public final n0 f9091p;

    /* renamed from: q, reason: collision with root package name */
    public final q3.k f9092q;

    /* renamed from: r, reason: collision with root package name */
    public final k0 f9093r;

    /* renamed from: s, reason: collision with root package name */
    public final z0 f9094s;

    /* renamed from: t, reason: collision with root package name */
    public final h1 f9095t;

    /* renamed from: u, reason: collision with root package name */
    public final h1 f9096u;

    /* renamed from: v, reason: collision with root package name */
    public final z0 f9097v;

    /* renamed from: w, reason: collision with root package name */
    public final a0 f9098w;

    static {
        v vVar = new v(16);
        s1 s1Var = new s1(26);
        j0 j0Var = new j0(10, vVar);
        q6.v.c(1, s1Var);
        f9076x = new a0(21, j0Var, s1Var);
    }

    public p(int i, int i8) {
        a aVar = new a();
        aVar.f8995a = -1;
        aVar.f8998d = -1;
        this.f9077a = aVar;
        i0.h hVar = new i0.h();
        hVar.f3283b = new e1(i);
        hVar.f3284c = new e1(i8);
        hVar.f3286e = new h0(i);
        this.f9081e = hVar;
        k kVar = r.f9099a;
        v0 v0Var = v0.f5133f;
        this.f9082f = new h1(kVar, v0Var);
        this.f9083g = new v.j();
        this.i = new l.r(new t(29, this));
        this.f9085j = true;
        this.f9087l = new n(this);
        this.f9088m = new a0.f();
        this.f9089n = new androidx.compose.foundation.lazy.layout.b();
        this.f9090o = new a0.l(0);
        this.f9091p = new n0(new m(this, i));
        this.f9092q = new q3.k(18, this);
        this.f9093r = new k0();
        c6.m mVar = c6.m.f1757a;
        this.f9094s = new h1(mVar, v0Var);
        Boolean bool = Boolean.FALSE;
        this.f9095t = m0.b.q(bool);
        this.f9096u = m0.b.q(bool);
        this.f9097v = new h1(mVar, v0Var);
        a0 a0Var = new a0(1, false);
        r1 r1Var = r.d.f6262j;
        Float valueOf = Float.valueOf(0.0f);
        a0Var.f12f = new r.k(r1Var, valueOf, (r.p) r1Var.f6413a.i(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f9098w = a0Var;
    }

    @Override // u.y0
    public final boolean a() {
        return ((Boolean) this.f9096u.getValue()).booleanValue();
    }

    @Override // u.y0
    public final boolean b() {
        return this.i.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r5.i.c(r6, r7, r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r5.f9088m.f(r0) == r4) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // u.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t.j0 j0Var, p6.e eVar, i6.c cVar) {
        o oVar;
        int i;
        p6.e eVar2;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i8 = oVar.f9075k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                oVar.f9075k = i8 - Integer.MIN_VALUE;
                Object obj = oVar.i;
                i = oVar.f9075k;
                h6.a aVar = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj);
                    oVar.f9072g = j0Var;
                    oVar.f9073h = (i6.i) eVar;
                    oVar.f9075k = 1;
                    eVar2 = eVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s6.a.K(obj);
                        return c6.m.f1757a;
                    }
                    p6.e eVar3 = (p6.e) oVar.f9073h;
                    j0Var = oVar.f9072g;
                    s6.a.K(obj);
                    eVar2 = eVar3;
                }
                oVar.f9072g = null;
                oVar.f9073h = null;
                oVar.f9075k = 2;
            }
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.i;
        i = oVar.f9075k;
        h6.a aVar2 = h6.a.f3204d;
        if (i != 0) {
        }
        oVar.f9072g = null;
        oVar.f9073h = null;
        oVar.f9075k = 2;
    }

    @Override // u.y0
    public final boolean d() {
        return ((Boolean) this.f9095t.getValue()).booleanValue();
    }

    @Override // u.y0
    public final float e(float f6) {
        return this.i.e(f6);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(k kVar, boolean z3, boolean z7) {
        String str;
        long j7;
        w0.f e8;
        p6.c e9;
        w0.f h8;
        r1 r1Var = r.d.f6262j;
        ?? r32 = kVar.f9049k;
        int i = kVar.f9052n;
        int i8 = kVar.f9041b;
        l lVar = kVar.f9040a;
        this.f9091p.f121e = r32.size();
        a0 a0Var = this.f9098w;
        i0.h hVar = this.f9081e;
        g6.c cVar = null;
        if (!z3 && this.f9078b) {
            this.f9079c = kVar;
            e8 = w0.q.e();
            e9 = e8 != null ? e8.e() : null;
            h8 = w0.q.h(e8);
            try {
                if (((Number) ((r.k) a0Var.f12f).f6331e.getValue()).floatValue() != 0.0f && lVar != null && lVar.f9056a == ((e1) hVar.f3283b).g() && i8 == ((e1) hVar.f3284c).g()) {
                    a7.h1 h1Var = (a7.h1) a0Var.f11e;
                    if (h1Var != null) {
                        h1Var.a(null);
                    }
                    a0Var.f12f = new r.k(r1Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                w0.q.k(e8, h8, e9);
            }
        }
        if (z3) {
            this.f9078b = true;
        }
        this.f9096u.setValue(Boolean.valueOf(((lVar != null ? lVar.f9056a : 0) == 0 && i8 == 0) ? false : true));
        this.f9095t.setValue(Boolean.valueOf(kVar.f9042c));
        this.f9084h -= kVar.f9043d;
        this.f9082f.setValue(kVar);
        if (z7) {
            hVar.getClass();
            if (!(((float) i8) >= 0.0f)) {
                w.a.c("scrollOffset should be non-negative");
            }
            ((e1) hVar.f3284c).h(i8);
        } else {
            l lVar2 = (l) d6.m.S(r32);
            l lVar3 = (l) d6.m.Y(r32);
            if (lVar2 != null) {
                str = "scrollOffset should be non-negative";
                j7 = lVar2.f9056a;
            } else {
                str = "scrollOffset should be non-negative";
                j7 = -1;
            }
            r2.o.s0("firstVisibleItem:index", j7);
            r2.o.s0("lastVisibleItem:index", lVar3 != null ? lVar3.f9056a : -1L);
            hVar.getClass();
            hVar.f3285d = lVar != null ? lVar.f9061f : null;
            if (hVar.f3282a || i > 0) {
                hVar.f3282a = true;
                if (!(((float) i8) >= 0.0f)) {
                    w.a.c(str);
                }
                hVar.b(lVar != null ? lVar.f9056a : 0, i8);
            }
            if (this.f9085j) {
                a aVar = this.f9077a;
                int i9 = aVar.f8995a;
                boolean z8 = aVar.f8997c;
                if (i9 != -1 && !r32.isEmpty() && i9 != a.a(kVar, z8)) {
                    aVar.f8995a = -1;
                    m0 m0Var = aVar.f8996b;
                    if (m0Var != null) {
                        m0Var.cancel();
                    }
                    aVar.f8996b = null;
                }
                int i10 = aVar.f8998d;
                if (i10 != -1 && aVar.f8999e != 0.0f && i10 != i && !r32.isEmpty()) {
                    int a8 = a.a(kVar, aVar.f8999e < 0.0f);
                    if (a8 >= 0 && a8 < i) {
                        aVar.f8995a = a8;
                        aVar.f8996b = q3.k.r(this.f9092q, a8);
                    }
                }
                aVar.f8998d = i;
            }
        }
        if (z3) {
            float f6 = kVar.f9045f;
            r2.c cVar2 = kVar.i;
            u uVar = kVar.f9047h;
            a0Var.getClass();
            if (f6 <= cVar2.u(q0.f133a)) {
                return;
            }
            e8 = w0.q.e();
            e9 = e8 != null ? e8.e() : null;
            h8 = w0.q.h(e8);
            try {
                float floatValue = ((Number) ((r.k) a0Var.f12f).f6331e.getValue()).floatValue();
                a7.h1 h1Var2 = (a7.h1) a0Var.f11e;
                if (h1Var2 != null) {
                    h1Var2.a(null);
                }
                r.k kVar2 = (r.k) a0Var.f12f;
                if (kVar2.i) {
                    a0Var.f12f = r.d.g(kVar2, floatValue - f6);
                } else {
                    a0Var.f12f = new r.k(r1Var, Float.valueOf(-f6), null, 60);
                }
                a0Var.f11e = x.n(uVar, null, new p0(a0Var, cVar, 0), 3);
            } finally {
            }
        }
    }

    public final k g() {
        return (k) this.f9082f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f6, k kVar) {
        m0 m0Var;
        m0 m0Var2;
        if (this.f9085j) {
            ?? r02 = kVar.f9049k;
            ?? r12 = kVar.f9049k;
            boolean isEmpty = r02.isEmpty();
            a aVar = this.f9077a;
            if (!isEmpty) {
                boolean z3 = f6 < 0.0f;
                int a8 = a.a(kVar, z3);
                if (a8 >= 0 && a8 < kVar.f9052n) {
                    if (a8 != aVar.f8995a) {
                        if (aVar.f8997c != z3) {
                            aVar.f8995a = -1;
                            m0 m0Var3 = aVar.f8996b;
                            if (m0Var3 != null) {
                                m0Var3.cancel();
                            }
                            aVar.f8996b = null;
                        }
                        aVar.f8997c = z3;
                        aVar.f8995a = a8;
                        aVar.f8996b = q3.k.r(this.f9092q, a8);
                    }
                    if (z3) {
                        l lVar = (l) d6.m.X(r12);
                        if (((lVar.i + lVar.f9064j) + kVar.f9055q) - kVar.f9051m < (-f6) && (m0Var2 = aVar.f8996b) != null) {
                            m0Var2.a();
                        }
                    } else if (kVar.f9050l - ((l) d6.m.R(r12)).i < f6 && (m0Var = aVar.f8996b) != null) {
                        m0Var.a();
                    }
                }
            }
            aVar.f8999e = f6;
        }
    }
}
