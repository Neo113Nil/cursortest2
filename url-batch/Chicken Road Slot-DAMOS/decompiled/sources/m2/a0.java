package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final w2.o f6422a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6423b;

    /* renamed from: c, reason: collision with root package name */
    public final p2.s f6424c;

    /* renamed from: d, reason: collision with root package name */
    public final p2.o f6425d;

    /* renamed from: e, reason: collision with root package name */
    public final p2.p f6426e;

    /* renamed from: f, reason: collision with root package name */
    public final p2.i f6427f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6428h;

    /* renamed from: i, reason: collision with root package name */
    public final w2.a f6429i;
    public final w2.p j;

    /* renamed from: k, reason: collision with root package name */
    public final s2.b f6430k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6431l;

    /* renamed from: m, reason: collision with root package name */
    public final w2.l f6432m;

    /* renamed from: n, reason: collision with root package name */
    public final k1.e0 f6433n;

    /* renamed from: o, reason: collision with root package name */
    public final m1.c f6434o;

    public a0(long j, long j3, p2.s sVar, p2.o oVar, p2.p pVar, p2.i iVar, String str, long j10, w2.a aVar, w2.p pVar2, s2.b bVar, long j11, w2.l lVar, k1.e0 e0Var, int i3) {
        this((i3 & 1) != 0 ? k1.p.g : j, (i3 & 2) != 0 ? x2.n.f10335c : j3, (i3 & 4) != 0 ? null : sVar, (i3 & 8) != 0 ? null : oVar, (i3 & 16) != 0 ? null : pVar, (i3 & 32) != 0 ? null : iVar, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? x2.n.f10335c : j10, (i3 & 256) != 0 ? null : aVar, (i3 & 512) != 0 ? null : pVar2, (i3 & 1024) != 0 ? null : bVar, (i3 & 2048) != 0 ? k1.p.g : j11, (i3 & 4096) != 0 ? null : lVar, (i3 & 8192) != 0 ? null : e0Var);
    }

    public final boolean a(a0 a0Var) {
        if (this == a0Var) {
            return true;
        }
        return x2.n.a(this.f6423b, a0Var.f6423b) && Intrinsics.a(this.f6424c, a0Var.f6424c) && Intrinsics.a(this.f6425d, a0Var.f6425d) && Intrinsics.a(this.f6426e, a0Var.f6426e) && Intrinsics.a(this.f6427f, a0Var.f6427f) && Intrinsics.a(this.g, a0Var.g) && x2.n.a(this.f6428h, a0Var.f6428h) && Intrinsics.a(this.f6429i, a0Var.f6429i) && Intrinsics.a(this.j, a0Var.j) && Intrinsics.a(this.f6430k, a0Var.f6430k) && k1.p.c(this.f6431l, a0Var.f6431l);
    }

    public final boolean b(a0 a0Var) {
        return Intrinsics.a(this.f6422a, a0Var.f6422a) && Intrinsics.a(this.f6432m, a0Var.f6432m) && Intrinsics.a(this.f6433n, a0Var.f6433n) && Intrinsics.a(this.f6434o, a0Var.f6434o);
    }

    public final a0 c(a0 a0Var) {
        if (a0Var == null) {
            return this;
        }
        w2.o oVar = a0Var.f6422a;
        return b0.a(this, oVar.b(), oVar.c(), oVar.a(), a0Var.f6423b, a0Var.f6424c, a0Var.f6425d, a0Var.f6426e, a0Var.f6427f, a0Var.g, a0Var.f6428h, a0Var.f6429i, a0Var.j, a0Var.f6430k, a0Var.f6431l, a0Var.f6432m, a0Var.f6433n, a0Var.f6434o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return a(a0Var) && b(a0Var);
    }

    public final int hashCode() {
        w2.o oVar = this.f6422a;
        long b10 = oVar.b();
        int i3 = k1.p.f5341h;
        hd.z zVar = hd.a0.f4495e;
        int hashCode = Long.hashCode(b10) * 31;
        k1.v c10 = oVar.c();
        int hashCode2 = (Float.hashCode(oVar.a()) + ((hashCode + (c10 != null ? c10.hashCode() : 0)) * 31)) * 31;
        x2.o[] oVarArr = x2.n.f10334b;
        int c11 = n0.l.c(hashCode2, 31, this.f6423b);
        p2.s sVar = this.f6424c;
        int i10 = (c11 + (sVar != null ? sVar.f7648d : 0)) * 31;
        p2.o oVar2 = this.f6425d;
        int hashCode3 = (i10 + (oVar2 != null ? Integer.hashCode(oVar2.f7639a) : 0)) * 31;
        p2.p pVar = this.f6426e;
        int hashCode4 = (hashCode3 + (pVar != null ? Integer.hashCode(pVar.f7640a) : 0)) * 31;
        p2.i iVar = this.f6427f;
        int hashCode5 = (hashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = this.g;
        int c12 = n0.l.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f6428h);
        w2.a aVar = this.f6429i;
        int hashCode6 = (c12 + (aVar != null ? Float.hashCode(aVar.f10023a) : 0)) * 31;
        w2.p pVar2 = this.j;
        int hashCode7 = (hashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        s2.b bVar = this.f6430k;
        int c13 = n0.l.c((hashCode7 + (bVar != null ? bVar.f8410d.hashCode() : 0)) * 31, 31, this.f6431l);
        w2.l lVar = this.f6432m;
        int i11 = (c13 + (lVar != null ? lVar.f10046a : 0)) * 31;
        k1.e0 e0Var = this.f6433n;
        int hashCode8 = (i11 + (e0Var != null ? e0Var.hashCode() : 0)) * 961;
        m1.c cVar = this.f6434o;
        return hashCode8 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        w2.o oVar = this.f6422a;
        sb2.append((Object) k1.p.h(oVar.b()));
        sb2.append(", brush=");
        sb2.append(oVar.c());
        sb2.append(", alpha=");
        sb2.append(oVar.a());
        sb2.append(", fontSize=");
        sb2.append((Object) x2.n.d(this.f6423b));
        sb2.append(", fontWeight=");
        sb2.append(this.f6424c);
        sb2.append(", fontStyle=");
        sb2.append(this.f6425d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f6426e);
        sb2.append(", fontFamily=");
        sb2.append(this.f6427f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) x2.n.d(this.f6428h));
        sb2.append(", baselineShift=");
        sb2.append(this.f6429i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.j);
        sb2.append(", localeList=");
        sb2.append(this.f6430k);
        sb2.append(", background=");
        v4.a.t(this.f6431l, sb2, ", textDecoration=");
        sb2.append(this.f6432m);
        sb2.append(", shadow=");
        sb2.append(this.f6433n);
        sb2.append(", platformStyle=null, drawStyle=");
        sb2.append(this.f6434o);
        sb2.append(')');
        return sb2.toString();
    }

    public a0(w2.o oVar, long j, p2.s sVar, p2.o oVar2, p2.p pVar, p2.i iVar, String str, long j3, w2.a aVar, w2.p pVar2, s2.b bVar, long j10, w2.l lVar, k1.e0 e0Var, m1.c cVar) {
        this.f6422a = oVar;
        this.f6423b = j;
        this.f6424c = sVar;
        this.f6425d = oVar2;
        this.f6426e = pVar;
        this.f6427f = iVar;
        this.g = str;
        this.f6428h = j3;
        this.f6429i = aVar;
        this.j = pVar2;
        this.f6430k = bVar;
        this.f6431l = j10;
        this.f6432m = lVar;
        this.f6433n = e0Var;
        this.f6434o = cVar;
    }

    public a0(long j, long j3, p2.s sVar, p2.o oVar, p2.p pVar, p2.i iVar, String str, long j10, w2.a aVar, w2.p pVar2, s2.b bVar, long j11, w2.l lVar, k1.e0 e0Var) {
        this(j != 16 ? new w2.c(j) : w2.n.f10048a, j3, sVar, oVar, pVar, iVar, str, j10, aVar, pVar2, bVar, j11, lVar, e0Var, (m1.c) null);
    }
}
