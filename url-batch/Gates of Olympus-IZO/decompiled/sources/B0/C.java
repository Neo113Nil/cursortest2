package B0;

import H2.AbstractC0080b;
import b0.C0262M;
import b0.C0288u;
import d0.AbstractC0322c;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final C f234d;

    /* renamed from: a, reason: collision with root package name */
    public final w f235a;

    /* renamed from: b, reason: collision with root package name */
    public final o f236b;

    /* renamed from: c, reason: collision with root package name */
    public final r f237c;

    static {
        long j3 = C0288u.f4296f;
        long j4 = M0.l.f2780c;
        f234d = new C(new w(j3, j4, (F0.l) null, (F0.j) null, (F0.k) null, (F0.r) null, (String) null, j4, (L0.a) null, (L0.k) null, (H0.b) null, j3, (L0.g) null, (C0262M) null, (AbstractC0322c) null), new o(Integer.MIN_VALUE, Integer.MIN_VALUE, j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public C(w wVar, o oVar, r rVar) {
        this.f235a = wVar;
        this.f236b = oVar;
        this.f237c = rVar;
    }

    public static C a(C c3, long j3, F0.l lVar, F0.r rVar, long j4, long j5, r rVar2, L0.e eVar, int i3) {
        long j6;
        long j7;
        L0.j cVar;
        long b2 = c3.f235a.f365a.b();
        long j8 = (i3 & 2) != 0 ? c3.f235a.f366b : j3;
        F0.l lVar2 = (i3 & 4) != 0 ? c3.f235a.f367c : lVar;
        w wVar = c3.f235a;
        F0.j jVar = wVar.f368d;
        F0.k kVar = wVar.f369e;
        F0.r rVar3 = (i3 & 32) != 0 ? wVar.f370f : rVar;
        String str = wVar.f371g;
        long j9 = (i3 & 128) != 0 ? wVar.f372h : j4;
        L0.a aVar = wVar.f373i;
        L0.k kVar2 = wVar.f374j;
        H0.b bVar = wVar.f375k;
        long j10 = j9;
        long j11 = wVar.f376l;
        L0.g gVar = wVar.f377m;
        C0262M c0262m = wVar.f378n;
        AbstractC0322c abstractC0322c = wVar.f379o;
        o oVar = c3.f236b;
        int i4 = oVar.f288a;
        int i5 = oVar.f289b;
        if ((i3 & 131072) != 0) {
            j6 = j11;
            j7 = oVar.f290c;
        } else {
            j6 = j11;
            j7 = j5;
        }
        L0.l lVar3 = oVar.f291d;
        r rVar4 = (524288 & i3) != 0 ? c3.f237c : rVar2;
        L0.e eVar2 = (i3 & 1048576) != 0 ? oVar.f293f : eVar;
        int i6 = oVar.f294g;
        int i7 = oVar.f295h;
        L0.m mVar = oVar.f296i;
        if (C0288u.c(b2, wVar.f365a.b())) {
            cVar = wVar.f365a;
        } else {
            cVar = b2 != 16 ? new L0.c(b2) : L0.i.f2686a;
        }
        return new C(new w(cVar, j8, lVar2, jVar, kVar, rVar3, str, j10, aVar, kVar2, bVar, j6, gVar, c0262m, abstractC0322c), new o(i4, i5, j7, lVar3, rVar4 != null ? rVar4.f299a : null, eVar2, i6, i7, mVar), rVar4);
    }

    public static C d(C c3, long j3, long j4, F0.l lVar, F0.j jVar, F0.r rVar, long j5, L0.g gVar, int i3, long j6, int i4) {
        long j7 = (i4 & 2) != 0 ? M0.l.f2780c : j4;
        F0.l lVar2 = (i4 & 4) != 0 ? null : lVar;
        F0.j jVar2 = (i4 & 8) != 0 ? null : jVar;
        F0.r rVar2 = (i4 & 32) != 0 ? null : rVar;
        long j8 = (i4 & 128) != 0 ? M0.l.f2780c : j5;
        long j9 = C0288u.f4296f;
        L0.g gVar2 = (i4 & 4096) != 0 ? null : gVar;
        int i5 = (32768 & i4) != 0 ? Integer.MIN_VALUE : i3;
        long j10 = (i4 & 131072) != 0 ? M0.l.f2780c : j6;
        w a3 = x.a(c3.f235a, j3, null, Float.NaN, j7, lVar2, jVar2, null, rVar2, null, j8, null, null, null, j9, gVar2, null, null);
        o a4 = p.a(c3.f236b, i5, Integer.MIN_VALUE, j10, null, null, null, 0, Integer.MIN_VALUE, null);
        return (c3.f235a == a3 && c3.f236b == a4) ? c3 : new C(a3, a4);
    }

    public final long b() {
        return this.f235a.f365a.b();
    }

    public final C c(C c3) {
        return (c3 == null || c3.equals(f234d)) ? this : new C(this.f235a.c(c3.f235a), this.f236b.a(c3.f236b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        return Z1.i.a(this.f235a, c3.f235a) && Z1.i.a(this.f236b, c3.f236b) && Z1.i.a(this.f237c, c3.f237c);
    }

    public final int hashCode() {
        int hashCode = (this.f236b.hashCode() + (this.f235a.hashCode() * 31)) * 31;
        r rVar = this.f237c;
        return hashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C0288u.i(b()));
        sb.append(", brush=");
        w wVar = this.f235a;
        sb.append(wVar.f365a.c());
        sb.append(", alpha=");
        sb.append(wVar.f365a.a());
        sb.append(", fontSize=");
        sb.append((Object) M0.l.d(wVar.f366b));
        sb.append(", fontWeight=");
        sb.append(wVar.f367c);
        sb.append(", fontStyle=");
        sb.append(wVar.f368d);
        sb.append(", fontSynthesis=");
        sb.append(wVar.f369e);
        sb.append(", fontFamily=");
        sb.append(wVar.f370f);
        sb.append(", fontFeatureSettings=");
        sb.append(wVar.f371g);
        sb.append(", letterSpacing=");
        sb.append((Object) M0.l.d(wVar.f372h));
        sb.append(", baselineShift=");
        sb.append(wVar.f373i);
        sb.append(", textGeometricTransform=");
        sb.append(wVar.f374j);
        sb.append(", localeList=");
        sb.append(wVar.f375k);
        sb.append(", background=");
        AbstractC0080b.q(wVar.f376l, sb, ", textDecoration=");
        sb.append(wVar.f377m);
        sb.append(", shadow=");
        sb.append(wVar.f378n);
        sb.append(", drawStyle=");
        sb.append(wVar.f379o);
        sb.append(", textAlign=");
        o oVar = this.f236b;
        sb.append((Object) L0.f.b(oVar.f288a));
        sb.append(", textDirection=");
        sb.append((Object) L0.h.b(oVar.f289b));
        sb.append(", lineHeight=");
        sb.append((Object) M0.l.d(oVar.f290c));
        sb.append(", textIndent=");
        sb.append(oVar.f291d);
        sb.append(", platformStyle=");
        sb.append(this.f237c);
        sb.append(", lineHeightStyle=");
        sb.append(oVar.f293f);
        sb.append(", lineBreak=");
        sb.append((Object) I2.d.M(oVar.f294g));
        sb.append(", hyphens=");
        sb.append((Object) I2.l.S(oVar.f295h));
        sb.append(", textMotion=");
        sb.append(oVar.f296i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C(w wVar, o oVar) {
        this(wVar, oVar, r0 == null ? null : new r(r0));
        wVar.getClass();
        q qVar = oVar.f292e;
    }
}
