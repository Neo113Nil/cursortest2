package a2;

import z0.o0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f411d = new k0(0, 0, null, 0, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final d0 f412a;

    /* renamed from: b, reason: collision with root package name */
    public final u f413b;

    /* renamed from: c, reason: collision with root package name */
    public final y f414c;

    public k0(d0 d0Var, u uVar, y yVar) {
        this.f412a = d0Var;
        this.f413b = uVar;
        this.f414c = yVar;
    }

    public static k0 a(k0 k0Var, long j8, long j9, f2.k kVar, f2.q qVar, long j10, long j11, l2.g gVar, int i7) {
        long b9 = (i7 & 1) != 0 ? k0Var.f412a.f347a.b() : j8;
        long j12 = (i7 & 2) != 0 ? k0Var.f412a.f348b : j9;
        f2.k kVar2 = (i7 & 4) != 0 ? k0Var.f412a.f349c : kVar;
        d0 d0Var = k0Var.f412a;
        f2.i iVar = d0Var.f350d;
        f2.j jVar = d0Var.f351e;
        f2.q qVar2 = (i7 & 32) != 0 ? d0Var.f352f : qVar;
        String str = d0Var.f353g;
        long j13 = (i7 & 128) != 0 ? d0Var.f354h : j10;
        l2.a aVar = d0Var.f355i;
        l2.n nVar = d0Var.f356j;
        h2.b bVar = d0Var.f357k;
        long j14 = d0Var.f358l;
        l2.j jVar2 = d0Var.f359m;
        o0 o0Var = d0Var.f360n;
        b1.f fVar = d0Var.f362p;
        u uVar = k0Var.f413b;
        int i8 = uVar.f450a;
        int i9 = uVar.f451b;
        long j15 = (i7 & 131072) != 0 ? uVar.f452c : j11;
        l2.o oVar = uVar.f453d;
        y yVar = (i7 & 524288) != 0 ? k0Var.f414c : e0.a.f2665a;
        return new k0(new d0(z0.u.c(b9, d0Var.f347a.b()) ? d0Var.f347a : b9 != 16 ? new l2.c(b9) : l2.l.f5882a, j12, kVar2, iVar, jVar, qVar2, str, j13, aVar, nVar, bVar, j14, jVar2, o0Var, yVar != null ? yVar.f464a : null, fVar), new u(i8, i9, j15, oVar, yVar != null ? yVar.f465b : null, (i7 & 1048576) != 0 ? uVar.f455f : gVar, uVar.f456g, uVar.f457h, uVar.f458i), yVar);
    }

    public static k0 e(k0 k0Var, long j8, long j9, long j10, l2.j jVar, int i7, long j11, int i8) {
        long j12 = (i8 & 2) != 0 ? m2.m.f6327c : j9;
        long j13 = (i8 & 128) != 0 ? m2.m.f6327c : j10;
        long j14 = z0.u.f10057g;
        l2.j jVar2 = (i8 & 4096) != 0 ? null : jVar;
        int i9 = (32768 & i8) != 0 ? Integer.MIN_VALUE : i7;
        long j15 = (i8 & 131072) != 0 ? m2.m.f6327c : j11;
        d0 a3 = e0.a(k0Var.f412a, j8, null, Float.NaN, j12, null, null, null, null, null, j13, null, null, null, j14, jVar2, null, null, null);
        u a9 = v.a(k0Var.f413b, i9, Integer.MIN_VALUE, j15, null, null, null, 0, Integer.MIN_VALUE, null);
        return (k0Var.f412a == a3 && k0Var.f413b == a9) ? k0Var : new k0(a3, a9);
    }

    public final long b() {
        return this.f412a.f347a.b();
    }

    public final boolean c(k0 k0Var) {
        if (this != k0Var) {
            return r6.k.a(this.f413b, k0Var.f413b) && this.f412a.a(k0Var.f412a);
        }
        return true;
    }

    public final k0 d(k0 k0Var) {
        return (k0Var == null || k0Var.equals(f411d)) ? this : new k0(this.f412a.c(k0Var.f412a), this.f413b.a(k0Var.f413b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return r6.k.a(this.f412a, k0Var.f412a) && r6.k.a(this.f413b, k0Var.f413b) && r6.k.a(this.f414c, k0Var.f414c);
    }

    public final int hashCode() {
        int hashCode = (this.f413b.hashCode() + (this.f412a.hashCode() * 31)) * 31;
        y yVar = this.f414c;
        return hashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) z0.u.i(b()));
        sb.append(", brush=");
        d0 d0Var = this.f412a;
        sb.append(d0Var.f347a.c());
        sb.append(", alpha=");
        sb.append(d0Var.f347a.a());
        sb.append(", fontSize=");
        sb.append((Object) m2.m.d(d0Var.f348b));
        sb.append(", fontWeight=");
        sb.append(d0Var.f349c);
        sb.append(", fontStyle=");
        sb.append(d0Var.f350d);
        sb.append(", fontSynthesis=");
        sb.append(d0Var.f351e);
        sb.append(", fontFamily=");
        sb.append(d0Var.f352f);
        sb.append(", fontFeatureSettings=");
        sb.append(d0Var.f353g);
        sb.append(", letterSpacing=");
        sb.append((Object) m2.m.d(d0Var.f354h));
        sb.append(", baselineShift=");
        sb.append(d0Var.f355i);
        sb.append(", textGeometricTransform=");
        sb.append(d0Var.f356j);
        sb.append(", localeList=");
        sb.append(d0Var.f357k);
        sb.append(", background=");
        a0.m.r(d0Var.f358l, sb, ", textDecoration=");
        sb.append(d0Var.f359m);
        sb.append(", shadow=");
        sb.append(d0Var.f360n);
        sb.append(", drawStyle=");
        sb.append(d0Var.f362p);
        sb.append(", textAlign=");
        u uVar = this.f413b;
        sb.append((Object) l2.i.a(uVar.f450a));
        sb.append(", textDirection=");
        sb.append((Object) l2.k.a(uVar.f451b));
        sb.append(", lineHeight=");
        sb.append((Object) m2.m.d(uVar.f452c));
        sb.append(", textIndent=");
        sb.append(uVar.f453d);
        sb.append(", platformStyle=");
        sb.append(this.f414c);
        sb.append(", lineHeightStyle=");
        sb.append(uVar.f455f);
        sb.append(", lineBreak=");
        sb.append((Object) l2.e.a(uVar.f456g));
        sb.append(", hyphens=");
        sb.append((Object) l2.d.a(uVar.f457h));
        sb.append(", textMotion=");
        sb.append(uVar.f458i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(d0 d0Var, u uVar) {
        this(d0Var, uVar, (r0 == null && r1 == null) ? null : new y(r0, r1));
        x xVar = d0Var.f361o;
        w wVar = uVar.f454e;
    }

    public k0(long j8, long j9, f2.k kVar, long j10, int i7, long j11, int i8) {
        this(new d0((i8 & 1) != 0 ? z0.u.f10057g : j8, (i8 & 2) != 0 ? m2.m.f6327c : j9, (i8 & 4) != 0 ? null : kVar, (f2.i) null, (f2.j) null, (f2.q) null, (String) null, (i8 & 128) != 0 ? m2.m.f6327c : j10, (l2.a) null, (l2.n) null, (h2.b) null, z0.u.f10057g, (l2.j) null, (o0) null, (x) null), new u((32768 & i8) != 0 ? Integer.MIN_VALUE : i7, Integer.MIN_VALUE, (i8 & 131072) != 0 ? m2.m.f6327c : j11, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
