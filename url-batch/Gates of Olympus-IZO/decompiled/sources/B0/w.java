package B0;

import H2.AbstractC0080b;
import b0.AbstractC0259J;
import b0.C0262M;
import b0.C0288u;
import d0.AbstractC0322c;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final L0.j f365a;

    /* renamed from: b, reason: collision with root package name */
    public final long f366b;

    /* renamed from: c, reason: collision with root package name */
    public final F0.l f367c;

    /* renamed from: d, reason: collision with root package name */
    public final F0.j f368d;

    /* renamed from: e, reason: collision with root package name */
    public final F0.k f369e;

    /* renamed from: f, reason: collision with root package name */
    public final F0.r f370f;

    /* renamed from: g, reason: collision with root package name */
    public final String f371g;

    /* renamed from: h, reason: collision with root package name */
    public final long f372h;

    /* renamed from: i, reason: collision with root package name */
    public final L0.a f373i;

    /* renamed from: j, reason: collision with root package name */
    public final L0.k f374j;

    /* renamed from: k, reason: collision with root package name */
    public final H0.b f375k;

    /* renamed from: l, reason: collision with root package name */
    public final long f376l;

    /* renamed from: m, reason: collision with root package name */
    public final L0.g f377m;

    /* renamed from: n, reason: collision with root package name */
    public final C0262M f378n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC0322c f379o;

    public w(long j3, long j4, F0.l lVar, F0.j jVar, F0.k kVar, F0.r rVar, String str, long j5, L0.a aVar, L0.k kVar2, H0.b bVar, long j6, L0.g gVar, C0262M c0262m, AbstractC0322c abstractC0322c) {
        this(j3 != 16 ? new L0.c(j3) : L0.i.f2686a, j4, lVar, jVar, kVar, rVar, str, j5, aVar, kVar2, bVar, j6, gVar, c0262m, abstractC0322c);
    }

    public final boolean a(w wVar) {
        if (this == wVar) {
            return true;
        }
        return M0.l.a(this.f366b, wVar.f366b) && Z1.i.a(this.f367c, wVar.f367c) && Z1.i.a(this.f368d, wVar.f368d) && Z1.i.a(this.f369e, wVar.f369e) && Z1.i.a(this.f370f, wVar.f370f) && Z1.i.a(this.f371g, wVar.f371g) && M0.l.a(this.f372h, wVar.f372h) && Z1.i.a(this.f373i, wVar.f373i) && Z1.i.a(this.f374j, wVar.f374j) && Z1.i.a(this.f375k, wVar.f375k) && C0288u.c(this.f376l, wVar.f376l) && Z1.i.a(null, null);
    }

    public final boolean b(w wVar) {
        return Z1.i.a(this.f365a, wVar.f365a) && Z1.i.a(this.f377m, wVar.f377m) && Z1.i.a(this.f378n, wVar.f378n) && Z1.i.a(this.f379o, wVar.f379o);
    }

    public final w c(w wVar) {
        if (wVar == null) {
            return this;
        }
        L0.j jVar = wVar.f365a;
        return x.a(this, jVar.b(), jVar.c(), jVar.a(), wVar.f366b, wVar.f367c, wVar.f368d, wVar.f369e, wVar.f370f, wVar.f371g, wVar.f372h, wVar.f373i, wVar.f374j, wVar.f375k, wVar.f376l, wVar.f377m, wVar.f378n, wVar.f379o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return a(wVar) && b(wVar);
    }

    public final int hashCode() {
        L0.j jVar = this.f365a;
        long b2 = jVar.b();
        int i3 = C0288u.f4297g;
        int hashCode = Long.hashCode(b2) * 31;
        AbstractC0259J c3 = jVar.c();
        int hashCode2 = (Float.hashCode(jVar.a()) + ((hashCode + (c3 != null ? c3.hashCode() : 0)) * 31)) * 31;
        M0.m[] mVarArr = M0.l.f2779b;
        int d3 = AbstractC0080b.d(hashCode2, 31, this.f366b);
        F0.l lVar = this.f367c;
        int i4 = (d3 + (lVar != null ? lVar.f1458d : 0)) * 31;
        F0.j jVar2 = this.f368d;
        int hashCode3 = (i4 + (jVar2 != null ? Integer.hashCode(jVar2.f1451a) : 0)) * 31;
        F0.k kVar = this.f369e;
        int hashCode4 = (hashCode3 + (kVar != null ? Integer.hashCode(kVar.f1452a) : 0)) * 31;
        F0.r rVar = this.f370f;
        int hashCode5 = (hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        String str = this.f371g;
        int d4 = AbstractC0080b.d((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f372h);
        L0.a aVar = this.f373i;
        int hashCode6 = (d4 + (aVar != null ? Float.hashCode(aVar.f2671a) : 0)) * 31;
        L0.k kVar2 = this.f374j;
        int hashCode7 = (hashCode6 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        H0.b bVar = this.f375k;
        int d5 = AbstractC0080b.d((hashCode7 + (bVar != null ? bVar.f1849d.hashCode() : 0)) * 31, 31, this.f376l);
        L0.g gVar = this.f377m;
        int i5 = (d5 + (gVar != null ? gVar.f2684a : 0)) * 31;
        C0262M c0262m = this.f378n;
        int hashCode8 = (i5 + (c0262m != null ? c0262m.hashCode() : 0)) * 961;
        AbstractC0322c abstractC0322c = this.f379o;
        return hashCode8 + (abstractC0322c != null ? abstractC0322c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        L0.j jVar = this.f365a;
        sb.append((Object) C0288u.i(jVar.b()));
        sb.append(", brush=");
        sb.append(jVar.c());
        sb.append(", alpha=");
        sb.append(jVar.a());
        sb.append(", fontSize=");
        sb.append((Object) M0.l.d(this.f366b));
        sb.append(", fontWeight=");
        sb.append(this.f367c);
        sb.append(", fontStyle=");
        sb.append(this.f368d);
        sb.append(", fontSynthesis=");
        sb.append(this.f369e);
        sb.append(", fontFamily=");
        sb.append(this.f370f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f371g);
        sb.append(", letterSpacing=");
        sb.append((Object) M0.l.d(this.f372h));
        sb.append(", baselineShift=");
        sb.append(this.f373i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f374j);
        sb.append(", localeList=");
        sb.append(this.f375k);
        sb.append(", background=");
        AbstractC0080b.q(this.f376l, sb, ", textDecoration=");
        sb.append(this.f377m);
        sb.append(", shadow=");
        sb.append(this.f378n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f379o);
        sb.append(')');
        return sb.toString();
    }

    public w(L0.j jVar, long j3, F0.l lVar, F0.j jVar2, F0.k kVar, F0.r rVar, String str, long j4, L0.a aVar, L0.k kVar2, H0.b bVar, long j5, L0.g gVar, C0262M c0262m, AbstractC0322c abstractC0322c) {
        this.f365a = jVar;
        this.f366b = j3;
        this.f367c = lVar;
        this.f368d = jVar2;
        this.f369e = kVar;
        this.f370f = rVar;
        this.f371g = str;
        this.f372h = j4;
        this.f373i = aVar;
        this.f374j = kVar2;
        this.f375k = bVar;
        this.f376l = j5;
        this.f377m = gVar;
        this.f378n = c0262m;
        this.f379o = abstractC0322c;
    }

    public w(long j3, long j4, F0.l lVar, F0.j jVar, F0.k kVar, F0.r rVar, String str, long j5, L0.a aVar, L0.k kVar2, H0.b bVar, long j6, L0.g gVar, C0262M c0262m, int i3) {
        this((i3 & 1) != 0 ? C0288u.f4296f : j3, (i3 & 2) != 0 ? M0.l.f2780c : j4, (i3 & 4) != 0 ? null : lVar, (i3 & 8) != 0 ? null : jVar, (i3 & 16) != 0 ? null : kVar, (i3 & 32) != 0 ? null : rVar, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? M0.l.f2780c : j5, (i3 & 256) != 0 ? null : aVar, (i3 & 512) != 0 ? null : kVar2, (i3 & 1024) != 0 ? null : bVar, (i3 & 2048) != 0 ? C0288u.f4296f : j6, (i3 & 4096) != 0 ? null : gVar, (i3 & 8192) != 0 ? null : c0262m, (AbstractC0322c) null);
    }
}
