package A;

import C0.C0031g;
import C0.G;
import C0.H;
import C0.K;
import C0.o;
import C0.q;
import S1.u;
import a.AbstractC0235a;
import java.util.List;
import x.N;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public C0031g f12a;

    /* renamed from: b, reason: collision with root package name */
    public K f13b;

    /* renamed from: c, reason: collision with root package name */
    public H0.d f14c;

    /* renamed from: d, reason: collision with root package name */
    public int f15d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16e;

    /* renamed from: f, reason: collision with root package name */
    public int f17f;

    /* renamed from: g, reason: collision with root package name */
    public int f18g;

    /* renamed from: h, reason: collision with root package name */
    public List f19h;

    /* renamed from: i, reason: collision with root package name */
    public b f20i;

    /* renamed from: k, reason: collision with root package name */
    public O0.b f22k;

    /* renamed from: l, reason: collision with root package name */
    public q f23l;

    /* renamed from: m, reason: collision with root package name */
    public O0.k f24m;

    /* renamed from: n, reason: collision with root package name */
    public H f25n;

    /* renamed from: j, reason: collision with root package name */
    public long f21j = a.f0a;

    /* renamed from: o, reason: collision with root package name */
    public int f26o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f27p = -1;

    public d(C0031g c0031g, K k3, H0.d dVar, int i3, boolean z3, int i4, int i5, List list) {
        this.f12a = c0031g;
        this.f13b = k3;
        this.f14c = dVar;
        this.f15d = i3;
        this.f16e = z3;
        this.f17f = i4;
        this.f18g = i5;
        this.f19h = list;
    }

    public final int a(int i3, O0.k kVar) {
        int i4 = this.f26o;
        int i5 = this.f27p;
        if (i3 == i4 && i4 != -1) {
            return i5;
        }
        int k3 = N.k(b(O2.d.a(0, i3, 0, Integer.MAX_VALUE), kVar).f622e);
        this.f26o = i3;
        this.f27p = k3;
        return k3;
    }

    public final o b(long j3, O0.k kVar) {
        q d3 = d(kVar);
        long L3 = O2.d.L(j3, this.f16e, this.f15d, d3.c());
        boolean z3 = this.f16e;
        int i3 = this.f15d;
        int i4 = this.f17f;
        int i5 = 1;
        if (z3 || !AbstractC0235a.v(i3, 2)) {
            if (i4 < 1) {
                i4 = 1;
            }
            i5 = i4;
        }
        return new o(d3, L3, i5, AbstractC0235a.v(this.f15d, 2));
    }

    public final void c(O0.b bVar) {
        long j3;
        O0.b bVar2 = this.f22k;
        if (bVar != null) {
            int i3 = a.f1b;
            j3 = a.a(bVar.a(), bVar.r());
        } else {
            j3 = a.f0a;
        }
        if (bVar2 == null) {
            this.f22k = bVar;
            this.f21j = j3;
        } else if (bVar == null || this.f21j != j3) {
            this.f22k = bVar;
            this.f21j = j3;
            this.f23l = null;
            this.f25n = null;
            this.f27p = -1;
            this.f26o = -1;
        }
    }

    public final q d(O0.k kVar) {
        q qVar = this.f23l;
        if (qVar == null || kVar != this.f24m || qVar.b()) {
            this.f24m = kVar;
            C0031g c0031g = this.f12a;
            K G3 = AbstractC0235a.G(this.f13b, kVar);
            O0.b bVar = this.f22k;
            f2.j.c(bVar);
            H0.d dVar = this.f14c;
            List list = this.f19h;
            if (list == null) {
                list = u.f4320d;
            }
            qVar = new q(c0031g, G3, list, bVar, dVar);
        }
        this.f23l = qVar;
        return qVar;
    }

    public final H e(O0.k kVar, long j3, o oVar) {
        float min = Math.min(oVar.f618a.c(), oVar.f621d);
        C0031g c0031g = this.f12a;
        K k3 = this.f13b;
        List list = this.f19h;
        if (list == null) {
            list = u.f4320d;
        }
        int i3 = this.f17f;
        boolean z3 = this.f16e;
        int i4 = this.f15d;
        O0.b bVar = this.f22k;
        f2.j.c(bVar);
        return new H(new G(c0031g, k3, list, i3, z3, i4, bVar, kVar, this.f14c, j3), oVar, O2.d.A(j3, O2.d.d(N.k(min), N.k(oVar.f622e))));
    }
}
