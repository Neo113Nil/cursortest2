package z;

import a2.k0;
import a2.t;
import e6.u;
import m2.k;
import w.g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f9950a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f9951b;

    /* renamed from: c, reason: collision with root package name */
    public f2.d f9952c;

    /* renamed from: d, reason: collision with root package name */
    public int f9953d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9954e;

    /* renamed from: f, reason: collision with root package name */
    public int f9955f;

    /* renamed from: g, reason: collision with root package name */
    public int f9956g;

    /* renamed from: i, reason: collision with root package name */
    public m2.b f9958i;

    /* renamed from: j, reason: collision with root package name */
    public a2.b f9959j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9960k;

    /* renamed from: m, reason: collision with root package name */
    public b f9962m;

    /* renamed from: n, reason: collision with root package name */
    public t f9963n;

    /* renamed from: o, reason: collision with root package name */
    public k f9964o;

    /* renamed from: h, reason: collision with root package name */
    public long f9957h = a.f9938a;

    /* renamed from: l, reason: collision with root package name */
    public long f9961l = j1.c.G(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f9965p = r4.a.z(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f9966q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f9967r = -1;

    public d(String str, k0 k0Var, f2.d dVar, int i7, boolean z8, int i8, int i9) {
        this.f9950a = str;
        this.f9951b = k0Var;
        this.f9952c = dVar;
        this.f9953d = i7;
        this.f9954e = z8;
        this.f9955f = i8;
        this.f9956g = i9;
    }

    public final int a(int i7, k kVar) {
        int i8 = this.f9966q;
        int i9 = this.f9967r;
        if (i7 == i8 && i8 != -1) {
            return i9;
        }
        int k8 = g0.k(b(r4.a.b(0, i7, 0, Integer.MAX_VALUE), kVar).b());
        this.f9966q = i7;
        this.f9967r = k8;
        return k8;
    }

    public final a2.b b(long j8, k kVar) {
        t d8 = d(kVar);
        boolean z8 = this.f9954e;
        int i7 = this.f9953d;
        float c4 = d8.c();
        int h3 = ((z8 || i7 == 2) && m2.a.d(j8)) ? m2.a.h(j8) : Integer.MAX_VALUE;
        if (m2.a.j(j8) != h3) {
            h3 = v1.g.e(g0.k(c4), m2.a.j(j8), h3);
        }
        int g9 = m2.a.g(j8);
        int min = Math.min(0, 262142);
        int min2 = h3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(h3, 262142);
        int l8 = r4.a.l(min2 == Integer.MAX_VALUE ? min : min2);
        long b9 = r4.a.b(min, min2, Math.min(l8, 0), g9 != Integer.MAX_VALUE ? Math.min(l8, g9) : Integer.MAX_VALUE);
        boolean z9 = this.f9954e;
        int i8 = this.f9953d;
        int i9 = this.f9955f;
        return new a2.b((i2.d) d8, ((z9 || i8 != 2) && i9 >= 1) ? i9 : 1, i8 == 2, b9);
    }

    public final void c(m2.b bVar) {
        long j8;
        m2.b bVar2 = this.f9958i;
        if (bVar != null) {
            int i7 = a.f9939b;
            j8 = a.a(bVar.a(), bVar.m());
        } else {
            j8 = a.f9938a;
        }
        if (bVar2 == null) {
            this.f9958i = bVar;
            this.f9957h = j8;
            return;
        }
        if (bVar == null || this.f9957h != j8) {
            this.f9958i = bVar;
            this.f9957h = j8;
            this.f9959j = null;
            this.f9963n = null;
            this.f9964o = null;
            this.f9966q = -1;
            this.f9967r = -1;
            this.f9965p = r4.a.z(0, 0, 0, 0);
            this.f9961l = j1.c.G(0, 0);
            this.f9960k = false;
        }
    }

    public final t d(k kVar) {
        t tVar = this.f9963n;
        if (tVar == null || kVar != this.f9964o || tVar.b()) {
            this.f9964o = kVar;
            String str = this.f9950a;
            k0 J = t6.a.J(this.f9951b, kVar);
            m2.b bVar = this.f9958i;
            r6.k.c(bVar);
            f2.d dVar = this.f9952c;
            u uVar = u.f2826f;
            tVar = new i2.d(str, J, uVar, uVar, dVar, bVar);
        }
        this.f9963n = tVar;
        return tVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f9959j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j8 = this.f9957h;
        int i7 = a.f9939b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j8 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j8 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
