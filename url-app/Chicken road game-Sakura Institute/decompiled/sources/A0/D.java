package A0;

import A.AbstractC0017m;
import Z.AbstractC0319p;
import Z.C0323u;
import Z.O;
import b0.AbstractC0497e;
import kotlin.jvm.internal.Intrinsics;
import y2.y;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final L0.n f256a;

    /* renamed from: b, reason: collision with root package name */
    public final long f257b;

    /* renamed from: c, reason: collision with root package name */
    public final F0.k f258c;

    /* renamed from: d, reason: collision with root package name */
    public final F0.i f259d;

    /* renamed from: e, reason: collision with root package name */
    public final F0.j f260e;

    /* renamed from: f, reason: collision with root package name */
    public final F0.r f261f;

    /* renamed from: g, reason: collision with root package name */
    public final String f262g;

    /* renamed from: h, reason: collision with root package name */
    public final long f263h;

    /* renamed from: i, reason: collision with root package name */
    public final L0.a f264i;

    /* renamed from: j, reason: collision with root package name */
    public final L0.o f265j;

    /* renamed from: k, reason: collision with root package name */
    public final H0.b f266k;

    /* renamed from: l, reason: collision with root package name */
    public final long f267l;

    /* renamed from: m, reason: collision with root package name */
    public final L0.j f268m;

    /* renamed from: n, reason: collision with root package name */
    public final O f269n;

    /* renamed from: o, reason: collision with root package name */
    public final x f270o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0497e f271p;

    public D(long j4, long j5, F0.k kVar, F0.i iVar, F0.j jVar, F0.r rVar, String str, long j6, L0.a aVar, L0.o oVar, H0.b bVar, long j7, L0.j jVar2, O o4, x xVar, AbstractC0497e abstractC0497e) {
        this(j4 != 16 ? new L0.c(j4) : L0.l.f3515a, j5, kVar, iVar, jVar, rVar, str, j6, aVar, oVar, bVar, j7, jVar2, o4, xVar, abstractC0497e);
    }

    public final boolean a(D d4) {
        if (this == d4) {
            return true;
        }
        return M0.m.a(this.f257b, d4.f257b) && Intrinsics.a(this.f258c, d4.f258c) && Intrinsics.a(this.f259d, d4.f259d) && Intrinsics.a(this.f260e, d4.f260e) && Intrinsics.a(this.f261f, d4.f261f) && Intrinsics.a(this.f262g, d4.f262g) && M0.m.a(this.f263h, d4.f263h) && Intrinsics.a(this.f264i, d4.f264i) && Intrinsics.a(this.f265j, d4.f265j) && Intrinsics.a(this.f266k, d4.f266k) && C0323u.c(this.f267l, d4.f267l) && Intrinsics.a(this.f270o, d4.f270o);
    }

    public final boolean b(D d4) {
        return Intrinsics.a(this.f256a, d4.f256a) && Intrinsics.a(this.f268m, d4.f268m) && Intrinsics.a(this.f269n, d4.f269n) && Intrinsics.a(this.f271p, d4.f271p);
    }

    public final D c(D d4) {
        if (d4 == null) {
            return this;
        }
        L0.n nVar = d4.f256a;
        return F.a(this, nVar.b(), nVar.c(), nVar.a(), d4.f257b, d4.f258c, d4.f259d, d4.f260e, d4.f261f, d4.f262g, d4.f263h, d4.f264i, d4.f265j, d4.f266k, d4.f267l, d4.f268m, d4.f269n, d4.f270o, d4.f271p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        return a(d4) && b(d4);
    }

    public final int hashCode() {
        L0.n nVar = this.f256a;
        long b4 = nVar.b();
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        int hashCode = Long.hashCode(b4) * 31;
        AbstractC0319p c4 = nVar.c();
        int hashCode2 = (Float.hashCode(nVar.a()) + ((hashCode + (c4 != null ? c4.hashCode() : 0)) * 31)) * 31;
        M0.n[] nVarArr = M0.m.f3559b;
        int c5 = AbstractC0017m.c(hashCode2, 31, this.f257b);
        F0.k kVar = this.f258c;
        int i4 = (c5 + (kVar != null ? kVar.f2618d : 0)) * 31;
        F0.i iVar = this.f259d;
        int hashCode3 = (i4 + (iVar != null ? Integer.hashCode(iVar.f2611a) : 0)) * 31;
        F0.j jVar = this.f260e;
        int hashCode4 = (hashCode3 + (jVar != null ? Integer.hashCode(jVar.f2612a) : 0)) * 31;
        F0.r rVar = this.f261f;
        int hashCode5 = (hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        String str = this.f262g;
        int c6 = AbstractC0017m.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f263h);
        L0.a aVar2 = this.f264i;
        int hashCode6 = (c6 + (aVar2 != null ? Float.hashCode(aVar2.f3493a) : 0)) * 31;
        L0.o oVar = this.f265j;
        int hashCode7 = (hashCode6 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        H0.b bVar = this.f266k;
        int c7 = AbstractC0017m.c((hashCode7 + (bVar != null ? bVar.f3226d.hashCode() : 0)) * 31, 31, this.f267l);
        L0.j jVar2 = this.f268m;
        int i5 = (c7 + (jVar2 != null ? jVar2.f3513a : 0)) * 31;
        O o4 = this.f269n;
        int hashCode8 = (i5 + (o4 != null ? o4.hashCode() : 0)) * 31;
        x xVar = this.f270o;
        int hashCode9 = (hashCode8 + (xVar != null ? xVar.hashCode() : 0)) * 31;
        AbstractC0497e abstractC0497e = this.f271p;
        return hashCode9 + (abstractC0497e != null ? abstractC0497e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        L0.n nVar = this.f256a;
        sb.append((Object) C0323u.i(nVar.b()));
        sb.append(", brush=");
        sb.append(nVar.c());
        sb.append(", alpha=");
        sb.append(nVar.a());
        sb.append(", fontSize=");
        sb.append((Object) M0.m.d(this.f257b));
        sb.append(", fontWeight=");
        sb.append(this.f258c);
        sb.append(", fontStyle=");
        sb.append(this.f259d);
        sb.append(", fontSynthesis=");
        sb.append(this.f260e);
        sb.append(", fontFamily=");
        sb.append(this.f261f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f262g);
        sb.append(", letterSpacing=");
        sb.append((Object) M0.m.d(this.f263h));
        sb.append(", baselineShift=");
        sb.append(this.f264i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f265j);
        sb.append(", localeList=");
        sb.append(this.f266k);
        sb.append(", background=");
        AbstractC0017m.s(this.f267l, sb, ", textDecoration=");
        sb.append(this.f268m);
        sb.append(", shadow=");
        sb.append(this.f269n);
        sb.append(", platformStyle=");
        sb.append(this.f270o);
        sb.append(", drawStyle=");
        sb.append(this.f271p);
        sb.append(')');
        return sb.toString();
    }

    public D(L0.n nVar, long j4, F0.k kVar, F0.i iVar, F0.j jVar, F0.r rVar, String str, long j5, L0.a aVar, L0.o oVar, H0.b bVar, long j6, L0.j jVar2, O o4, x xVar, AbstractC0497e abstractC0497e) {
        this.f256a = nVar;
        this.f257b = j4;
        this.f258c = kVar;
        this.f259d = iVar;
        this.f260e = jVar;
        this.f261f = rVar;
        this.f262g = str;
        this.f263h = j5;
        this.f264i = aVar;
        this.f265j = oVar;
        this.f266k = bVar;
        this.f267l = j6;
        this.f268m = jVar2;
        this.f269n = o4;
        this.f270o = xVar;
        this.f271p = abstractC0497e;
    }

    public D(long j4, long j5, F0.k kVar, F0.i iVar, F0.j jVar, F0.r rVar, String str, long j6, L0.a aVar, L0.o oVar, H0.b bVar, long j7, L0.j jVar2, O o4, int i2) {
        this((i2 & 1) != 0 ? C0323u.f4547g : j4, (i2 & 2) != 0 ? M0.m.f3560c : j5, (i2 & 4) != 0 ? null : kVar, (i2 & 8) != 0 ? null : iVar, (i2 & 16) != 0 ? null : jVar, (i2 & 32) != 0 ? null : rVar, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? M0.m.f3560c : j6, (i2 & 256) != 0 ? null : aVar, (i2 & 512) != 0 ? null : oVar, (i2 & 1024) != 0 ? null : bVar, (i2 & 2048) != 0 ? C0323u.f4547g : j7, (i2 & 4096) != 0 ? null : jVar2, (i2 & 8192) != 0 ? null : o4, (x) null, (AbstractC0497e) null);
    }
}
