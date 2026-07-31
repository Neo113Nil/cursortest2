package A;

import C0.C0026b;
import C0.K;
import C0.t;
import S1.u;
import a.AbstractC0235a;
import x.N;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f28a;

    /* renamed from: b, reason: collision with root package name */
    public K f29b;

    /* renamed from: c, reason: collision with root package name */
    public H0.d f30c;

    /* renamed from: d, reason: collision with root package name */
    public int f31d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32e;

    /* renamed from: f, reason: collision with root package name */
    public int f33f;

    /* renamed from: g, reason: collision with root package name */
    public int f34g;

    /* renamed from: i, reason: collision with root package name */
    public O0.b f36i;

    /* renamed from: j, reason: collision with root package name */
    public C0026b f37j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f38k;

    /* renamed from: m, reason: collision with root package name */
    public b f40m;

    /* renamed from: n, reason: collision with root package name */
    public t f41n;

    /* renamed from: o, reason: collision with root package name */
    public O0.k f42o;

    /* renamed from: h, reason: collision with root package name */
    public long f35h = a.f0a;

    /* renamed from: l, reason: collision with root package name */
    public long f39l = O2.d.d(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f43p = O2.d.H(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f44q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f45r = -1;

    public e(String str, K k3, H0.d dVar, int i3, boolean z3, int i4, int i5) {
        this.f28a = str;
        this.f29b = k3;
        this.f30c = dVar;
        this.f31d = i3;
        this.f32e = z3;
        this.f33f = i4;
        this.f34g = i5;
    }

    public final int a(int i3, O0.k kVar) {
        int i4 = this.f44q;
        int i5 = this.f45r;
        if (i3 == i4 && i4 != -1) {
            return i5;
        }
        int k3 = N.k(b(O2.d.a(0, i3, 0, Integer.MAX_VALUE), kVar).b());
        this.f44q = i3;
        this.f45r = k3;
        return k3;
    }

    public final C0026b b(long j3, O0.k kVar) {
        int i3;
        t d3 = d(kVar);
        long L3 = O2.d.L(j3, this.f32e, this.f31d, d3.c());
        boolean z3 = this.f32e;
        int i4 = this.f31d;
        int i5 = this.f33f;
        if (z3 || !AbstractC0235a.v(i4, 2)) {
            if (i5 < 1) {
                i5 = 1;
            }
            i3 = i5;
        } else {
            i3 = 1;
        }
        return new C0026b((K0.c) d3, i3, AbstractC0235a.v(this.f31d, 2), L3);
    }

    public final void c(O0.b bVar) {
        long j3;
        O0.b bVar2 = this.f36i;
        if (bVar != null) {
            int i3 = a.f1b;
            j3 = a.a(bVar.a(), bVar.r());
        } else {
            j3 = a.f0a;
        }
        if (bVar2 == null) {
            this.f36i = bVar;
            this.f35h = j3;
            return;
        }
        if (bVar == null || this.f35h != j3) {
            this.f36i = bVar;
            this.f35h = j3;
            this.f37j = null;
            this.f41n = null;
            this.f42o = null;
            this.f44q = -1;
            this.f45r = -1;
            this.f43p = O2.d.H(0, 0, 0, 0);
            this.f39l = O2.d.d(0, 0);
            this.f38k = false;
        }
    }

    public final t d(O0.k kVar) {
        t tVar = this.f41n;
        if (tVar == null || kVar != this.f42o || tVar.b()) {
            this.f42o = kVar;
            String str = this.f28a;
            K G3 = AbstractC0235a.G(this.f29b, kVar);
            O0.b bVar = this.f36i;
            f2.j.c(bVar);
            H0.d dVar = this.f30c;
            u uVar = u.f4320d;
            tVar = new K0.c(str, G3, uVar, uVar, dVar, bVar);
        }
        this.f41n = tVar;
        return tVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f37j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j3 = this.f35h;
        int i3 = a.f1b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j3 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j3 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
