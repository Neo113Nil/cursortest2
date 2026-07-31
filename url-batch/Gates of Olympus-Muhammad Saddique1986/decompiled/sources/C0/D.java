package C0;

import b0.AbstractC0347p;
import b0.C0352v;
import b0.P;
import d0.AbstractC0404e;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final N0.m f525a;

    /* renamed from: b, reason: collision with root package name */
    public final long f526b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.k f527c;

    /* renamed from: d, reason: collision with root package name */
    public final H0.i f528d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.j f529e;

    /* renamed from: f, reason: collision with root package name */
    public final H0.q f530f;

    /* renamed from: g, reason: collision with root package name */
    public final String f531g;

    /* renamed from: h, reason: collision with root package name */
    public final long f532h;

    /* renamed from: i, reason: collision with root package name */
    public final N0.a f533i;

    /* renamed from: j, reason: collision with root package name */
    public final N0.n f534j;

    /* renamed from: k, reason: collision with root package name */
    public final J0.b f535k;

    /* renamed from: l, reason: collision with root package name */
    public final long f536l;

    /* renamed from: m, reason: collision with root package name */
    public final N0.j f537m;

    /* renamed from: n, reason: collision with root package name */
    public final P f538n;

    /* renamed from: o, reason: collision with root package name */
    public final x f539o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0404e f540p;

    public D(long j3, long j4, H0.k kVar, H0.i iVar, H0.j jVar, H0.q qVar, String str, long j5, N0.a aVar, N0.n nVar, J0.b bVar, long j6, N0.j jVar2, P p3, x xVar, AbstractC0404e abstractC0404e) {
        this(j3 != 16 ? new N0.c(j3) : N0.l.f3553a, j4, kVar, iVar, jVar, qVar, str, j5, aVar, nVar, bVar, j6, jVar2, p3, xVar, abstractC0404e);
    }

    public final boolean a(D d3) {
        if (this == d3) {
            return true;
        }
        return O0.m.a(this.f526b, d3.f526b) && f2.j.a(this.f527c, d3.f527c) && f2.j.a(this.f528d, d3.f528d) && f2.j.a(this.f529e, d3.f529e) && f2.j.a(this.f530f, d3.f530f) && f2.j.a(this.f531g, d3.f531g) && O0.m.a(this.f532h, d3.f532h) && f2.j.a(this.f533i, d3.f533i) && f2.j.a(this.f534j, d3.f534j) && f2.j.a(this.f535k, d3.f535k) && C0352v.c(this.f536l, d3.f536l) && f2.j.a(this.f539o, d3.f539o);
    }

    public final boolean b(D d3) {
        return f2.j.a(this.f525a, d3.f525a) && f2.j.a(this.f537m, d3.f537m) && f2.j.a(this.f538n, d3.f538n) && f2.j.a(this.f540p, d3.f540p);
    }

    public final D c(D d3) {
        if (d3 == null) {
            return this;
        }
        N0.m mVar = d3.f525a;
        return E.a(this, mVar.b(), mVar.c(), mVar.a(), d3.f526b, d3.f527c, d3.f528d, d3.f529e, d3.f530f, d3.f531g, d3.f532h, d3.f533i, d3.f534j, d3.f535k, d3.f536l, d3.f537m, d3.f538n, d3.f539o, d3.f540p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d3 = (D) obj;
        return a(d3) && b(d3);
    }

    public final int hashCode() {
        N0.m mVar = this.f525a;
        long b3 = mVar.b();
        int i3 = C0352v.f5440h;
        int hashCode = Long.hashCode(b3) * 31;
        AbstractC0347p c2 = mVar.c();
        int hashCode2 = (Float.hashCode(mVar.a()) + ((hashCode + (c2 != null ? c2.hashCode() : 0)) * 31)) * 31;
        O0.n[] nVarArr = O0.m.f3745b;
        int c3 = A.k.c(hashCode2, 31, this.f526b);
        H0.k kVar = this.f527c;
        int i4 = (c3 + (kVar != null ? kVar.f2601d : 0)) * 31;
        H0.i iVar = this.f528d;
        int hashCode3 = (i4 + (iVar != null ? Integer.hashCode(iVar.f2594a) : 0)) * 31;
        H0.j jVar = this.f529e;
        int hashCode4 = (hashCode3 + (jVar != null ? Integer.hashCode(jVar.f2595a) : 0)) * 31;
        H0.q qVar = this.f530f;
        int hashCode5 = (hashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        String str = this.f531g;
        int c4 = A.k.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f532h);
        N0.a aVar = this.f533i;
        int hashCode6 = (c4 + (aVar != null ? Float.hashCode(aVar.f3531a) : 0)) * 31;
        N0.n nVar = this.f534j;
        int hashCode7 = (hashCode6 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        J0.b bVar = this.f535k;
        int c5 = A.k.c((hashCode7 + (bVar != null ? bVar.f3156d.hashCode() : 0)) * 31, 31, this.f536l);
        N0.j jVar2 = this.f537m;
        int i5 = (c5 + (jVar2 != null ? jVar2.f3551a : 0)) * 31;
        P p3 = this.f538n;
        int hashCode8 = (i5 + (p3 != null ? p3.hashCode() : 0)) * 31;
        x xVar = this.f539o;
        int hashCode9 = (hashCode8 + (xVar != null ? xVar.hashCode() : 0)) * 31;
        AbstractC0404e abstractC0404e = this.f540p;
        return hashCode9 + (abstractC0404e != null ? abstractC0404e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        N0.m mVar = this.f525a;
        sb.append((Object) C0352v.i(mVar.b()));
        sb.append(", brush=");
        sb.append(mVar.c());
        sb.append(", alpha=");
        sb.append(mVar.a());
        sb.append(", fontSize=");
        sb.append((Object) O0.m.d(this.f526b));
        sb.append(", fontWeight=");
        sb.append(this.f527c);
        sb.append(", fontStyle=");
        sb.append(this.f528d);
        sb.append(", fontSynthesis=");
        sb.append(this.f529e);
        sb.append(", fontFamily=");
        sb.append(this.f530f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f531g);
        sb.append(", letterSpacing=");
        sb.append((Object) O0.m.d(this.f532h));
        sb.append(", baselineShift=");
        sb.append(this.f533i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f534j);
        sb.append(", localeList=");
        sb.append(this.f535k);
        sb.append(", background=");
        A.k.p(this.f536l, sb, ", textDecoration=");
        sb.append(this.f537m);
        sb.append(", shadow=");
        sb.append(this.f538n);
        sb.append(", platformStyle=");
        sb.append(this.f539o);
        sb.append(", drawStyle=");
        sb.append(this.f540p);
        sb.append(')');
        return sb.toString();
    }

    public D(N0.m mVar, long j3, H0.k kVar, H0.i iVar, H0.j jVar, H0.q qVar, String str, long j4, N0.a aVar, N0.n nVar, J0.b bVar, long j5, N0.j jVar2, P p3, x xVar, AbstractC0404e abstractC0404e) {
        this.f525a = mVar;
        this.f526b = j3;
        this.f527c = kVar;
        this.f528d = iVar;
        this.f529e = jVar;
        this.f530f = qVar;
        this.f531g = str;
        this.f532h = j4;
        this.f533i = aVar;
        this.f534j = nVar;
        this.f535k = bVar;
        this.f536l = j5;
        this.f537m = jVar2;
        this.f538n = p3;
        this.f539o = xVar;
        this.f540p = abstractC0404e;
    }

    public D(long j3, long j4, H0.k kVar, H0.i iVar, H0.j jVar, H0.q qVar, String str, long j5, N0.a aVar, N0.n nVar, J0.b bVar, long j6, N0.j jVar2, P p3, int i3) {
        this((i3 & 1) != 0 ? C0352v.f5439g : j3, (i3 & 2) != 0 ? O0.m.f3746c : j4, (i3 & 4) != 0 ? null : kVar, (i3 & 8) != 0 ? null : iVar, (i3 & 16) != 0 ? null : jVar, (i3 & 32) != 0 ? null : qVar, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? O0.m.f3746c : j5, (i3 & 256) != 0 ? null : aVar, (i3 & 512) != 0 ? null : nVar, (i3 & 1024) != 0 ? null : bVar, (i3 & 2048) != 0 ? C0352v.f5439g : j6, (i3 & 4096) != 0 ? null : jVar2, (i3 & 8192) != 0 ? null : p3, (x) null, (AbstractC0404e) null);
    }
}
