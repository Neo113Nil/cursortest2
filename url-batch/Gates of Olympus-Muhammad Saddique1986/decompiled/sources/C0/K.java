package C0;

import b0.C0352v;
import b0.P;
import d0.AbstractC0404e;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: d, reason: collision with root package name */
    public static final K f570d = new K(0, 0, null, 0, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final D f571a;

    /* renamed from: b, reason: collision with root package name */
    public final u f572b;

    /* renamed from: c, reason: collision with root package name */
    public final y f573c;

    public K(D d3, u uVar, y yVar) {
        this.f571a = d3;
        this.f572b = uVar;
        this.f573c = yVar;
    }

    public static K a(K k3, long j3, long j4, H0.k kVar, H0.q qVar, long j5, long j6, y yVar, N0.g gVar, int i3) {
        long j7;
        long j8;
        N0.m cVar;
        long b3 = (i3 & 1) != 0 ? k3.f571a.f525a.b() : j3;
        long j9 = (i3 & 2) != 0 ? k3.f571a.f526b : j4;
        H0.k kVar2 = (i3 & 4) != 0 ? k3.f571a.f527c : kVar;
        D d3 = k3.f571a;
        H0.i iVar = d3.f528d;
        H0.j jVar = d3.f529e;
        H0.q qVar2 = (i3 & 32) != 0 ? d3.f530f : qVar;
        String str = d3.f531g;
        long j10 = (i3 & 128) != 0 ? d3.f532h : j5;
        N0.a aVar = d3.f533i;
        N0.n nVar = d3.f534j;
        J0.b bVar = d3.f535k;
        long j11 = j10;
        long j12 = d3.f536l;
        N0.j jVar2 = d3.f537m;
        P p3 = d3.f538n;
        AbstractC0404e abstractC0404e = d3.f540p;
        u uVar = k3.f572b;
        int i4 = uVar.f644a;
        int i5 = uVar.f645b;
        if ((i3 & 131072) != 0) {
            j7 = j12;
            j8 = uVar.f646c;
        } else {
            j7 = j12;
            j8 = j6;
        }
        N0.o oVar = uVar.f647d;
        y yVar2 = (524288 & i3) != 0 ? k3.f573c : yVar;
        N0.g gVar2 = (i3 & 1048576) != 0 ? uVar.f649f : gVar;
        int i6 = uVar.f650g;
        N0.g gVar3 = gVar2;
        int i7 = uVar.f651h;
        N0.p pVar = uVar.f652i;
        if (C0352v.c(b3, d3.f525a.b())) {
            cVar = d3.f525a;
        } else {
            cVar = b3 != 16 ? new N0.c(b3) : N0.l.f3553a;
        }
        return new K(new D(cVar, j9, kVar2, iVar, jVar, qVar2, str, j11, aVar, nVar, bVar, j7, jVar2, p3, yVar2 != null ? yVar2.f658a : null, abstractC0404e), new u(i4, i5, j8, oVar, yVar2 != null ? yVar2.f659b : null, gVar3, i6, i7, pVar), yVar2);
    }

    public static K e(K k3, long j3, long j4, H0.k kVar, H0.i iVar, H0.q qVar, long j5, N0.j jVar, int i3, long j6, int i4) {
        long j7 = (i4 & 2) != 0 ? O0.m.f3746c : j4;
        H0.k kVar2 = (i4 & 4) != 0 ? null : kVar;
        H0.i iVar2 = (i4 & 8) != 0 ? null : iVar;
        H0.q qVar2 = (i4 & 32) != 0 ? null : qVar;
        long j8 = (i4 & 128) != 0 ? O0.m.f3746c : j5;
        long j9 = C0352v.f5439g;
        N0.j jVar2 = (i4 & 4096) != 0 ? null : jVar;
        int i5 = (32768 & i4) != 0 ? Integer.MIN_VALUE : i3;
        long j10 = (i4 & 131072) != 0 ? O0.m.f3746c : j6;
        D a3 = E.a(k3.f571a, j3, null, Float.NaN, j7, kVar2, iVar2, null, qVar2, null, j8, null, null, null, j9, jVar2, null, null, null);
        u a4 = v.a(k3.f572b, i5, Integer.MIN_VALUE, j10, null, null, null, 0, Integer.MIN_VALUE, null);
        return (k3.f571a == a3 && k3.f572b == a4) ? k3 : new K(a3, a4);
    }

    public final long b() {
        return this.f571a.f525a.b();
    }

    public final boolean c(K k3) {
        if (this != k3) {
            if (!f2.j.a(this.f572b, k3.f572b) || !this.f571a.a(k3.f571a)) {
                return false;
            }
        }
        return true;
    }

    public final K d(K k3) {
        return (k3 == null || k3.equals(f570d)) ? this : new K(this.f571a.c(k3.f571a), this.f572b.a(k3.f572b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        return f2.j.a(this.f571a, k3.f571a) && f2.j.a(this.f572b, k3.f572b) && f2.j.a(this.f573c, k3.f573c);
    }

    public final int hashCode() {
        int hashCode = (this.f572b.hashCode() + (this.f571a.hashCode() * 31)) * 31;
        y yVar = this.f573c;
        return hashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C0352v.i(b()));
        sb.append(", brush=");
        D d3 = this.f571a;
        sb.append(d3.f525a.c());
        sb.append(", alpha=");
        sb.append(d3.f525a.a());
        sb.append(", fontSize=");
        sb.append((Object) O0.m.d(d3.f526b));
        sb.append(", fontWeight=");
        sb.append(d3.f527c);
        sb.append(", fontStyle=");
        sb.append(d3.f528d);
        sb.append(", fontSynthesis=");
        sb.append(d3.f529e);
        sb.append(", fontFamily=");
        sb.append(d3.f530f);
        sb.append(", fontFeatureSettings=");
        sb.append(d3.f531g);
        sb.append(", letterSpacing=");
        sb.append((Object) O0.m.d(d3.f532h));
        sb.append(", baselineShift=");
        sb.append(d3.f533i);
        sb.append(", textGeometricTransform=");
        sb.append(d3.f534j);
        sb.append(", localeList=");
        sb.append(d3.f535k);
        sb.append(", background=");
        A.k.p(d3.f536l, sb, ", textDecoration=");
        sb.append(d3.f537m);
        sb.append(", shadow=");
        sb.append(d3.f538n);
        sb.append(", drawStyle=");
        sb.append(d3.f540p);
        sb.append(", textAlign=");
        u uVar = this.f572b;
        sb.append((Object) N0.i.b(uVar.f644a));
        sb.append(", textDirection=");
        sb.append((Object) N0.k.b(uVar.f645b));
        sb.append(", lineHeight=");
        sb.append((Object) O0.m.d(uVar.f646c));
        sb.append(", textIndent=");
        sb.append(uVar.f647d);
        sb.append(", platformStyle=");
        sb.append(this.f573c);
        sb.append(", lineHeightStyle=");
        sb.append(uVar.f649f);
        sb.append(", lineBreak=");
        sb.append((Object) N0.e.a(uVar.f650g));
        sb.append(", hyphens=");
        sb.append((Object) N0.d.b(uVar.f651h));
        sb.append(", textMotion=");
        sb.append(uVar.f652i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public K(D d3, u uVar) {
        this(d3, uVar, (r0 == null && r1 == null) ? null : new y(r0, r1));
        x xVar = d3.f539o;
        w wVar = uVar.f648e;
    }

    public K(long j3, long j4, H0.k kVar, long j5, int i3, long j6, int i4) {
        this(new D((i4 & 1) != 0 ? C0352v.f5439g : j3, (i4 & 2) != 0 ? O0.m.f3746c : j4, (i4 & 4) != 0 ? null : kVar, (H0.i) null, (H0.j) null, (H0.q) null, (String) null, (i4 & 128) != 0 ? O0.m.f3746c : j5, (N0.a) null, (N0.n) null, (J0.b) null, C0352v.f5439g, (N0.j) null, (P) null, (x) null, (AbstractC0404e) null), new u((32768 & i4) != 0 ? Integer.MIN_VALUE : i3, Integer.MIN_VALUE, (i4 & 131072) != 0 ? O0.m.f3746c : j6, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
