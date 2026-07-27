package A0;

import A.AbstractC0017m;
import Z.C0323u;
import Z.O;
import b0.AbstractC0497e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: d, reason: collision with root package name */
    public static final L f302d = new L(0, 0, null, null, 0, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final D f303a;

    /* renamed from: b, reason: collision with root package name */
    public final u f304b;

    /* renamed from: c, reason: collision with root package name */
    public final y f305c;

    public L(D d4, u uVar, y yVar) {
        this.f303a = d4;
        this.f304b = uVar;
        this.f305c = yVar;
    }

    public static L a(L l4, long j4, long j5, F0.k kVar, F0.r rVar, long j6, int i2, long j7, y yVar, L0.g gVar, int i4) {
        H0.b bVar;
        int i5;
        long j8;
        long j9;
        L0.n cVar;
        long b4 = (i4 & 1) != 0 ? l4.f303a.f256a.b() : j4;
        long j10 = (i4 & 2) != 0 ? l4.f303a.f257b : j5;
        F0.k kVar2 = (i4 & 4) != 0 ? l4.f303a.f258c : kVar;
        D d4 = l4.f303a;
        F0.i iVar = d4.f259d;
        F0.j jVar = d4.f260e;
        F0.r rVar2 = (i4 & 32) != 0 ? d4.f261f : rVar;
        String str = d4.f262g;
        long j11 = (i4 & 128) != 0 ? d4.f263h : j6;
        L0.a aVar = d4.f264i;
        L0.o oVar = d4.f265j;
        H0.b bVar2 = d4.f266k;
        long j12 = j11;
        long j13 = d4.f267l;
        L0.j jVar2 = d4.f268m;
        O o4 = d4.f269n;
        AbstractC0497e abstractC0497e = d4.f271p;
        if ((i4 & 32768) != 0) {
            bVar = bVar2;
            i5 = l4.f304b.f376a;
        } else {
            bVar = bVar2;
            i5 = i2;
        }
        u uVar = l4.f304b;
        int i6 = uVar.f377b;
        if ((i4 & 131072) != 0) {
            j8 = j13;
            j9 = uVar.f378c;
        } else {
            j8 = j13;
            j9 = j7;
        }
        L0.p pVar = uVar.f379d;
        y yVar2 = (524288 & i4) != 0 ? l4.f305c : yVar;
        L0.g gVar2 = (i4 & 1048576) != 0 ? uVar.f381f : gVar;
        int i7 = uVar.f382g;
        L0.g gVar3 = gVar2;
        int i8 = uVar.f383h;
        L0.q qVar = uVar.f384i;
        if (C0323u.c(b4, d4.f256a.b())) {
            cVar = d4.f256a;
        } else {
            cVar = b4 != 16 ? new L0.c(b4) : L0.l.f3515a;
        }
        return new L(new D(cVar, j10, kVar2, iVar, jVar, rVar2, str, j12, aVar, oVar, bVar, j8, jVar2, o4, yVar2 != null ? yVar2.f390a : null, abstractC0497e), new u(i5, i6, j9, pVar, yVar2 != null ? yVar2.f391b : null, gVar3, i7, i8, qVar), yVar2);
    }

    public static L e(L l4, long j4, long j5, F0.k kVar, F0.i iVar, F0.r rVar, long j6, L0.j jVar, int i2, long j7, int i4) {
        long j8 = (i4 & 2) != 0 ? M0.m.f3560c : j5;
        F0.k kVar2 = (i4 & 4) != 0 ? null : kVar;
        F0.i iVar2 = (i4 & 8) != 0 ? null : iVar;
        F0.r rVar2 = (i4 & 32) != 0 ? null : rVar;
        long j9 = (i4 & 128) != 0 ? M0.m.f3560c : j6;
        long j10 = C0323u.f4547g;
        L0.j jVar2 = (i4 & 4096) != 0 ? null : jVar;
        int i5 = (32768 & i4) != 0 ? Integer.MIN_VALUE : i2;
        long j11 = (i4 & 131072) != 0 ? M0.m.f3560c : j7;
        D a4 = F.a(l4.f303a, j4, null, Float.NaN, j8, kVar2, iVar2, null, rVar2, null, j9, null, null, null, j10, jVar2, null, null, null);
        u a5 = v.a(l4.f304b, i5, Integer.MIN_VALUE, j11, null, null, null, 0, Integer.MIN_VALUE, null);
        return (l4.f303a == a4 && l4.f304b == a5) ? l4 : new L(a4, a5);
    }

    public final long b() {
        return this.f303a.f256a.b();
    }

    public final boolean c(L l4) {
        if (this != l4) {
            if (!Intrinsics.a(this.f304b, l4.f304b) || !this.f303a.a(l4.f303a)) {
                return false;
            }
        }
        return true;
    }

    public final L d(L l4) {
        return (l4 == null || l4.equals(f302d)) ? this : new L(this.f303a.c(l4.f303a), this.f304b.a(l4.f304b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l4 = (L) obj;
        return Intrinsics.a(this.f303a, l4.f303a) && Intrinsics.a(this.f304b, l4.f304b) && Intrinsics.a(this.f305c, l4.f305c);
    }

    public final int hashCode() {
        int hashCode = (this.f304b.hashCode() + (this.f303a.hashCode() * 31)) * 31;
        y yVar = this.f305c;
        return hashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C0323u.i(b()));
        sb.append(", brush=");
        D d4 = this.f303a;
        sb.append(d4.f256a.c());
        sb.append(", alpha=");
        sb.append(d4.f256a.a());
        sb.append(", fontSize=");
        sb.append((Object) M0.m.d(d4.f257b));
        sb.append(", fontWeight=");
        sb.append(d4.f258c);
        sb.append(", fontStyle=");
        sb.append(d4.f259d);
        sb.append(", fontSynthesis=");
        sb.append(d4.f260e);
        sb.append(", fontFamily=");
        sb.append(d4.f261f);
        sb.append(", fontFeatureSettings=");
        sb.append(d4.f262g);
        sb.append(", letterSpacing=");
        sb.append((Object) M0.m.d(d4.f263h));
        sb.append(", baselineShift=");
        sb.append(d4.f264i);
        sb.append(", textGeometricTransform=");
        sb.append(d4.f265j);
        sb.append(", localeList=");
        sb.append(d4.f266k);
        sb.append(", background=");
        AbstractC0017m.s(d4.f267l, sb, ", textDecoration=");
        sb.append(d4.f268m);
        sb.append(", shadow=");
        sb.append(d4.f269n);
        sb.append(", drawStyle=");
        sb.append(d4.f271p);
        sb.append(", textAlign=");
        u uVar = this.f304b;
        sb.append((Object) L0.i.b(uVar.f376a));
        sb.append(", textDirection=");
        sb.append((Object) L0.k.b(uVar.f377b));
        sb.append(", lineHeight=");
        sb.append((Object) M0.m.d(uVar.f378c));
        sb.append(", textIndent=");
        sb.append(uVar.f379d);
        sb.append(", platformStyle=");
        sb.append(this.f305c);
        sb.append(", lineHeightStyle=");
        sb.append(uVar.f381f);
        sb.append(", lineBreak=");
        sb.append((Object) L0.e.a(uVar.f382g));
        sb.append(", hyphens=");
        sb.append((Object) L0.d.b(uVar.f383h));
        sb.append(", textMotion=");
        sb.append(uVar.f384i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L(D d4, u uVar) {
        this(d4, uVar, (r0 == null && r1 == null) ? null : new y(r0, r1));
        x xVar = d4.f270o;
        w wVar = uVar.f380e;
    }

    public L(long j4, long j5, F0.k kVar, F0.m mVar, long j6, int i2, long j7, int i4) {
        this(new D((i4 & 1) != 0 ? C0323u.f4547g : j4, (i4 & 2) != 0 ? M0.m.f3560c : j5, (i4 & 4) != 0 ? null : kVar, (F0.i) null, (F0.j) null, (i4 & 32) != 0 ? null : mVar, (String) null, (i4 & 128) != 0 ? M0.m.f3560c : j6, (L0.a) null, (L0.o) null, (H0.b) null, C0323u.f4547g, (L0.j) null, (O) null, (x) null, (AbstractC0497e) null), new u((32768 & i4) != 0 ? Integer.MIN_VALUE : i2, Integer.MIN_VALUE, (i4 & 131072) != 0 ? M0.m.f3560c : j7, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
