package a2;

import z0.o0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final l2.m f347a;

    /* renamed from: b, reason: collision with root package name */
    public final long f348b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.k f349c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.i f350d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.j f351e;

    /* renamed from: f, reason: collision with root package name */
    public final f2.q f352f;

    /* renamed from: g, reason: collision with root package name */
    public final String f353g;

    /* renamed from: h, reason: collision with root package name */
    public final long f354h;

    /* renamed from: i, reason: collision with root package name */
    public final l2.a f355i;

    /* renamed from: j, reason: collision with root package name */
    public final l2.n f356j;

    /* renamed from: k, reason: collision with root package name */
    public final h2.b f357k;

    /* renamed from: l, reason: collision with root package name */
    public final long f358l;

    /* renamed from: m, reason: collision with root package name */
    public final l2.j f359m;

    /* renamed from: n, reason: collision with root package name */
    public final o0 f360n;

    /* renamed from: o, reason: collision with root package name */
    public final x f361o;

    /* renamed from: p, reason: collision with root package name */
    public final b1.f f362p;

    public d0(long j8, long j9, f2.k kVar, f2.i iVar, f2.j jVar, f2.q qVar, String str, long j10, l2.a aVar, l2.n nVar, h2.b bVar, long j11, l2.j jVar2, o0 o0Var, x xVar) {
        this(j8 != 16 ? new l2.c(j8) : l2.l.f5882a, j9, kVar, iVar, jVar, qVar, str, j10, aVar, nVar, bVar, j11, jVar2, o0Var, xVar, null);
    }

    public final boolean a(d0 d0Var) {
        if (this == d0Var) {
            return true;
        }
        return m2.m.a(this.f348b, d0Var.f348b) && r6.k.a(this.f349c, d0Var.f349c) && r6.k.a(this.f350d, d0Var.f350d) && r6.k.a(this.f351e, d0Var.f351e) && r6.k.a(this.f352f, d0Var.f352f) && r6.k.a(this.f353g, d0Var.f353g) && m2.m.a(this.f354h, d0Var.f354h) && r6.k.a(this.f355i, d0Var.f355i) && r6.k.a(this.f356j, d0Var.f356j) && r6.k.a(this.f357k, d0Var.f357k) && z0.u.c(this.f358l, d0Var.f358l) && r6.k.a(this.f361o, d0Var.f361o);
    }

    public final boolean b(d0 d0Var) {
        return r6.k.a(this.f347a, d0Var.f347a) && r6.k.a(this.f359m, d0Var.f359m) && r6.k.a(this.f360n, d0Var.f360n) && r6.k.a(this.f362p, d0Var.f362p);
    }

    public final d0 c(d0 d0Var) {
        if (d0Var == null) {
            return this;
        }
        l2.m mVar = d0Var.f347a;
        return e0.a(this, mVar.b(), mVar.c(), mVar.a(), d0Var.f348b, d0Var.f349c, d0Var.f350d, d0Var.f351e, d0Var.f352f, d0Var.f353g, d0Var.f354h, d0Var.f355i, d0Var.f356j, d0Var.f357k, d0Var.f358l, d0Var.f359m, d0Var.f360n, d0Var.f361o, d0Var.f362p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return a(d0Var) && b(d0Var);
    }

    public final int hashCode() {
        l2.m mVar = this.f347a;
        long b9 = mVar.b();
        int i7 = z0.u.f10058h;
        int hashCode = Long.hashCode(b9) * 31;
        z0.p c4 = mVar.c();
        int hashCode2 = (Float.hashCode(mVar.a()) + ((hashCode + (c4 != null ? c4.hashCode() : 0)) * 31)) * 31;
        m2.n[] nVarArr = m2.m.f6326b;
        int d8 = a0.m.d(hashCode2, 31, this.f348b);
        f2.k kVar = this.f349c;
        int i8 = (d8 + (kVar != null ? kVar.f3280f : 0)) * 31;
        f2.i iVar = this.f350d;
        int hashCode3 = (i8 + (iVar != null ? Integer.hashCode(iVar.f3275a) : 0)) * 31;
        f2.j jVar = this.f351e;
        int hashCode4 = (hashCode3 + (jVar != null ? Integer.hashCode(jVar.f3276a) : 0)) * 31;
        f2.q qVar = this.f352f;
        int hashCode5 = (hashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        String str = this.f353g;
        int d9 = a0.m.d((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f354h);
        l2.a aVar = this.f355i;
        int hashCode6 = (d9 + (aVar != null ? Float.hashCode(aVar.f5860a) : 0)) * 31;
        l2.n nVar = this.f356j;
        int hashCode7 = (hashCode6 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        h2.b bVar = this.f357k;
        int d10 = a0.m.d((hashCode7 + (bVar != null ? bVar.f4644f.hashCode() : 0)) * 31, 31, this.f358l);
        l2.j jVar2 = this.f359m;
        int i9 = (d10 + (jVar2 != null ? jVar2.f5880a : 0)) * 31;
        o0 o0Var = this.f360n;
        int hashCode8 = (i9 + (o0Var != null ? o0Var.hashCode() : 0)) * 31;
        x xVar = this.f361o;
        int hashCode9 = (hashCode8 + (xVar != null ? xVar.hashCode() : 0)) * 31;
        b1.f fVar = this.f362p;
        return hashCode9 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        l2.m mVar = this.f347a;
        sb.append((Object) z0.u.i(mVar.b()));
        sb.append(", brush=");
        sb.append(mVar.c());
        sb.append(", alpha=");
        sb.append(mVar.a());
        sb.append(", fontSize=");
        sb.append((Object) m2.m.d(this.f348b));
        sb.append(", fontWeight=");
        sb.append(this.f349c);
        sb.append(", fontStyle=");
        sb.append(this.f350d);
        sb.append(", fontSynthesis=");
        sb.append(this.f351e);
        sb.append(", fontFamily=");
        sb.append(this.f352f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f353g);
        sb.append(", letterSpacing=");
        sb.append((Object) m2.m.d(this.f354h));
        sb.append(", baselineShift=");
        sb.append(this.f355i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f356j);
        sb.append(", localeList=");
        sb.append(this.f357k);
        sb.append(", background=");
        a0.m.r(this.f358l, sb, ", textDecoration=");
        sb.append(this.f359m);
        sb.append(", shadow=");
        sb.append(this.f360n);
        sb.append(", platformStyle=");
        sb.append(this.f361o);
        sb.append(", drawStyle=");
        sb.append(this.f362p);
        sb.append(')');
        return sb.toString();
    }

    public d0(l2.m mVar, long j8, f2.k kVar, f2.i iVar, f2.j jVar, f2.q qVar, String str, long j9, l2.a aVar, l2.n nVar, h2.b bVar, long j10, l2.j jVar2, o0 o0Var, x xVar, b1.f fVar) {
        this.f347a = mVar;
        this.f348b = j8;
        this.f349c = kVar;
        this.f350d = iVar;
        this.f351e = jVar;
        this.f352f = qVar;
        this.f353g = str;
        this.f354h = j9;
        this.f355i = aVar;
        this.f356j = nVar;
        this.f357k = bVar;
        this.f358l = j10;
        this.f359m = jVar2;
        this.f360n = o0Var;
        this.f361o = xVar;
        this.f362p = fVar;
    }

    public d0(long j8, long j9, f2.k kVar, f2.i iVar, f2.j jVar, f2.q qVar, String str, long j10, l2.a aVar, l2.n nVar, h2.b bVar, long j11, l2.j jVar2, o0 o0Var, int i7) {
        this((i7 & 1) != 0 ? z0.u.f10057g : j8, (i7 & 2) != 0 ? m2.m.f6327c : j9, (i7 & 4) != 0 ? null : kVar, (i7 & 8) != 0 ? null : iVar, (i7 & 16) != 0 ? null : jVar, (i7 & 32) != 0 ? null : qVar, (i7 & 64) != 0 ? null : str, (i7 & 128) != 0 ? m2.m.f6327c : j10, (i7 & 256) != 0 ? null : aVar, (i7 & 512) != 0 ? null : nVar, (i7 & 1024) != 0 ? null : bVar, (i7 & 2048) != 0 ? z0.u.f10057g : j11, (i7 & 4096) != 0 ? null : jVar2, (i7 & 8192) != 0 ? null : o0Var, (x) null);
    }
}
