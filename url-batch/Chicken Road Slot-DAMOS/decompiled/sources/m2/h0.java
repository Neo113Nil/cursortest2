package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f6480d = new h0(0, null, null, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final a0 f6481a;

    /* renamed from: b, reason: collision with root package name */
    public final p f6482b;

    /* renamed from: c, reason: collision with root package name */
    public final s f6483c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(long j, p2.s sVar, p2.l lVar, long j3, long j10, int i3) {
        this(new a0(r1, (i3 & 2) != 0 ? x2.n.f10335c : j, (i3 & 4) != 0 ? null : sVar, null, null, (i3 & 32) != 0 ? null : lVar, null, (i3 & 128) != 0 ? x2.n.f10335c : j3, null, null, null, r1, null, null), new p(0, 0, (i3 & 131072) != 0 ? x2.n.f10335c : j10, null, null, null, 0, 0, null), null);
        long j11 = k1.p.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [m1.c] */
    public static h0 a(h0 h0Var, long j, p2.s sVar, p2.i iVar, long j3, m1.g gVar, long j10, w2.i iVar2, int i3) {
        s2.b bVar;
        long j11;
        long b10 = h0Var.f6481a.f6422a.b();
        long j12 = (i3 & 2) != 0 ? h0Var.f6481a.f6423b : j;
        p2.s sVar2 = (i3 & 4) != 0 ? h0Var.f6481a.f6424c : sVar;
        a0 a0Var = h0Var.f6481a;
        p2.o oVar = a0Var.f6425d;
        p2.p pVar = a0Var.f6426e;
        p2.i iVar3 = (i3 & 32) != 0 ? a0Var.f6427f : iVar;
        String str = a0Var.g;
        long j13 = (i3 & 128) != 0 ? a0Var.f6428h : j3;
        w2.a aVar = a0Var.f6429i;
        w2.p pVar2 = a0Var.j;
        s2.b bVar2 = a0Var.f6430k;
        long j14 = a0Var.f6431l;
        w2.l lVar = a0Var.f6432m;
        k1.e0 e0Var = a0Var.f6433n;
        m1.g gVar2 = (i3 & 16384) != 0 ? a0Var.f6434o : gVar;
        p pVar3 = h0Var.f6482b;
        int i10 = pVar3.f6501a;
        int i11 = pVar3.f6502b;
        if ((i3 & 131072) != 0) {
            bVar = bVar2;
            j11 = pVar3.f6503c;
        } else {
            bVar = bVar2;
            j11 = j10;
        }
        w2.q qVar = pVar3.f6504d;
        s sVar3 = (i3 & 524288) != 0 ? h0Var.f6483c : k0.c.f5293a;
        return new h0(new a0(k1.p.c(b10, a0Var.f6422a.b()) ? a0Var.f6422a : b10 != 16 ? new w2.c(b10) : w2.n.f10048a, j12, sVar2, oVar, pVar, iVar3, str, j13, aVar, pVar2, bVar, j14, lVar, e0Var, gVar2), new p(i10, i11, j11, qVar, sVar3 != null ? sVar3.f6513a : null, (i3 & 1048576) != 0 ? pVar3.f6506f : iVar2, pVar3.g, pVar3.f6507h, pVar3.f6508i), sVar3);
    }

    public static h0 c(h0 h0Var, long j, long j3, p2.s sVar, long j10, int i3, long j11, int i10) {
        long j12 = (i10 & 2) != 0 ? x2.n.f10335c : j3;
        p2.s sVar2 = (i10 & 4) != 0 ? null : sVar;
        long j13 = (i10 & 128) != 0 ? x2.n.f10335c : j10;
        long j14 = k1.p.g;
        int i11 = (32768 & i10) != 0 ? 0 : i3;
        long j15 = (i10 & 131072) != 0 ? x2.n.f10335c : j11;
        a0 a9 = b0.a(h0Var.f6481a, j, null, Float.NaN, j12, sVar2, null, null, null, null, j13, null, null, null, j14, null, null, null);
        p a10 = q.a(h0Var.f6482b, i11, 0, j15, null, null, null, 0, 0, null);
        return (h0Var.f6481a == a9 && h0Var.f6482b == a10) ? h0Var : new h0(a9, a10);
    }

    public final long b() {
        return this.f6481a.f6422a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.a(this.f6481a, h0Var.f6481a) && Intrinsics.a(this.f6482b, h0Var.f6482b) && Intrinsics.a(this.f6483c, h0Var.f6483c);
    }

    public final int hashCode() {
        int hashCode = (this.f6482b.hashCode() + (this.f6481a.hashCode() * 31)) * 31;
        s sVar = this.f6483c;
        return hashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) k1.p.h(b()));
        sb2.append(", brush=");
        a0 a0Var = this.f6481a;
        sb2.append(a0Var.f6422a.c());
        sb2.append(", alpha=");
        sb2.append(a0Var.f6422a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) x2.n.d(a0Var.f6423b));
        sb2.append(", fontWeight=");
        sb2.append(a0Var.f6424c);
        sb2.append(", fontStyle=");
        sb2.append(a0Var.f6425d);
        sb2.append(", fontSynthesis=");
        sb2.append(a0Var.f6426e);
        sb2.append(", fontFamily=");
        sb2.append(a0Var.f6427f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(a0Var.g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) x2.n.d(a0Var.f6428h));
        sb2.append(", baselineShift=");
        sb2.append(a0Var.f6429i);
        sb2.append(", textGeometricTransform=");
        sb2.append(a0Var.j);
        sb2.append(", localeList=");
        sb2.append(a0Var.f6430k);
        sb2.append(", background=");
        v4.a.t(a0Var.f6431l, sb2, ", textDecoration=");
        sb2.append(a0Var.f6432m);
        sb2.append(", shadow=");
        sb2.append(a0Var.f6433n);
        sb2.append(", drawStyle=");
        sb2.append(a0Var.f6434o);
        sb2.append(", textAlign=");
        p pVar = this.f6482b;
        sb2.append((Object) w2.k.a(pVar.f6501a));
        sb2.append(", textDirection=");
        sb2.append((Object) w2.m.a(pVar.f6502b));
        sb2.append(", lineHeight=");
        sb2.append((Object) x2.n.d(pVar.f6503c));
        sb2.append(", textIndent=");
        sb2.append(pVar.f6504d);
        sb2.append(", platformStyle=");
        sb2.append(this.f6483c);
        sb2.append(", lineHeightStyle=");
        sb2.append(pVar.f6506f);
        sb2.append(", lineBreak=");
        sb2.append((Object) w2.e.a(pVar.g));
        sb2.append(", hyphens=");
        sb2.append((Object) w2.d.a(pVar.f6507h));
        sb2.append(", textMotion=");
        sb2.append(pVar.f6508i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(a0 a0Var, p pVar) {
        this(a0Var, pVar, r0 == null ? null : new s(r0));
        a0Var.getClass();
        r rVar = pVar.f6505e;
    }

    public h0(a0 a0Var, p pVar, s sVar) {
        this.f6481a = a0Var;
        this.f6482b = pVar;
        this.f6483c = sVar;
    }
}
