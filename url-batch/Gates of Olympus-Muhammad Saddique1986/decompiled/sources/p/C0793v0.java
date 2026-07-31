package p;

import a0.C0238c;
import e2.InterfaceC0426e;
import t0.AbstractC0993f;

/* renamed from: p.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793v0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0778n0 f7778a;

    /* renamed from: b, reason: collision with root package name */
    public n.l0 f7779b;

    /* renamed from: c, reason: collision with root package name */
    public C0775m f7780c;

    /* renamed from: d, reason: collision with root package name */
    public P f7781d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7782e;

    /* renamed from: f, reason: collision with root package name */
    public G1.m f7783f;

    /* renamed from: g, reason: collision with root package name */
    public int f7784g = 1;

    /* renamed from: h, reason: collision with root package name */
    public U f7785h = androidx.compose.foundation.gestures.a.f4801a;

    /* renamed from: i, reason: collision with root package name */
    public final C0787s0 f7786i = new C0787s0(this);

    /* renamed from: j, reason: collision with root package name */
    public final A0.l f7787j = new A0.l(29, this);

    public C0793v0(InterfaceC0778n0 interfaceC0778n0, n.l0 l0Var, C0775m c0775m, P p3, boolean z3, G1.m mVar) {
        this.f7778a = interfaceC0778n0;
        this.f7779b = l0Var;
        this.f7780c = c0775m;
        this.f7781d = p3;
        this.f7782e = z3;
        this.f7783f = mVar;
    }

    public static final long a(C0793v0 c0793v0, U u3, long j3, int i3) {
        long j4;
        m0.e eVar = (m0.e) c0793v0.f7783f.f2116b;
        m0.e eVar2 = null;
        m0.e eVar3 = (eVar == null || !eVar.f4501p) ? null : (m0.e) AbstractC0993f.k(eVar);
        long j5 = 0;
        long C02 = eVar3 != null ? eVar3.C0(j3, i3) : 0L;
        long g3 = C0238c.g(j3, C02);
        long d3 = c0793v0.d(c0793v0.g(u3.a(c0793v0.f(c0793v0.d(C0238c.a(g3, 0.0f, c0793v0.f7781d == P.f7568e ? 1 : 2))))));
        long g4 = C0238c.g(g3, d3);
        m0.e eVar4 = (m0.e) c0793v0.f7783f.f2116b;
        if (eVar4 != null && eVar4.f4501p) {
            eVar2 = (m0.e) AbstractC0993f.k(eVar4);
        }
        m0.e eVar5 = eVar2;
        if (eVar5 != null) {
            j4 = d3;
            j5 = eVar5.A0(d3, g4, i3);
        } else {
            j4 = d3;
        }
        return C0238c.h(C0238c.h(C02, j4), j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j3, X1.c cVar) {
        C0782p0 c0782p0;
        int i3;
        f2.t tVar;
        if (cVar instanceof C0782p0) {
            c0782p0 = (C0782p0) cVar;
            int i4 = c0782p0.f7748j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0782p0.f7748j = i4 - Integer.MIN_VALUE;
                Object obj = c0782p0.f7746h;
                Object obj2 = W1.a.f4608d;
                i3 = c0782p0.f7748j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    f2.t tVar2 = new f2.t();
                    tVar2.f5831d = j3;
                    n.e0 e0Var = n.e0.f7122d;
                    InterfaceC0426e c0785r0 = new C0785r0(this, tVar2, j3, null);
                    c0782p0.f7745g = tVar2;
                    c0782p0.f7748j = 1;
                    if (e(e0Var, c0785r0, c0782p0) == obj2) {
                        return obj2;
                    }
                    tVar = tVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = c0782p0.f7745g;
                    R1.a.e(obj);
                }
                return new O0.o(tVar.f5831d);
            }
        }
        c0782p0 = new C0782p0(this, cVar);
        Object obj3 = c0782p0.f7746h;
        Object obj22 = W1.a.f4608d;
        i3 = c0782p0.f7748j;
        if (i3 != 0) {
        }
        return new O0.o(tVar.f5831d);
    }

    public final float c(float f3) {
        return this.f7782e ? f3 * (-1) : f3;
    }

    public final long d(long j3) {
        return this.f7782e ? C0238c.i(j3, -1.0f) : j3;
    }

    public final Object e(n.e0 e0Var, InterfaceC0426e interfaceC0426e, X1.c cVar) {
        Object d3 = this.f7778a.d(e0Var, new C0791u0(this, interfaceC0426e, null), cVar);
        return d3 == W1.a.f4608d ? d3 : R1.y.f4171a;
    }

    public final float f(long j3) {
        return this.f7781d == P.f7568e ? C0238c.d(j3) : C0238c.e(j3);
    }

    public final long g(float f3) {
        if (f3 == 0.0f) {
            return 0L;
        }
        return this.f7781d == P.f7568e ? l0.c.e(f3, 0.0f) : l0.c.e(0.0f, f3);
    }
}
