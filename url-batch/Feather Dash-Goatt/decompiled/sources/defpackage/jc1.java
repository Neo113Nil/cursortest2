package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jc1 implements w7 {
    public final zg1 a;
    public final long b;
    public final x20 c;
    public final t20 d;
    public final u20 e;
    public final w10 f;
    public final String g;
    public final long h;
    public final ad i;
    public final ah1 j;
    public final mi0 k;
    public final long l;
    public final wg1 m;
    public final s91 n;
    public final p4 o;

    public jc1(long j, long j2, x20 x20Var, t20 t20Var, u20 u20Var, w10 w10Var, String str, long j3, ad adVar, ah1 ah1Var, mi0 mi0Var, long j4, wg1 wg1Var, s91 s91Var, int i) {
        this((i & 1) != 0 ? hi.g : j, (i & 2) != 0 ? wh1.c : j2, (i & 4) != 0 ? null : x20Var, (i & 8) != 0 ? null : t20Var, (i & 16) != 0 ? null : u20Var, (i & 32) != 0 ? null : w10Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? wh1.c : j3, (i & 256) != 0 ? null : adVar, (i & 512) != 0 ? null : ah1Var, (i & 1024) != 0 ? null : mi0Var, (i & 2048) != 0 ? hi.g : j4, (i & 4096) != 0 ? null : wg1Var, (i & 8192) != 0 ? null : s91Var);
    }

    public final boolean a(jc1 jc1Var) {
        if (this == jc1Var) {
            return true;
        }
        return wh1.a(this.b, jc1Var.b) && Intrinsics.a(this.c, jc1Var.c) && Intrinsics.a(this.d, jc1Var.d) && Intrinsics.a(this.e, jc1Var.e) && Intrinsics.a(this.f, jc1Var.f) && Intrinsics.a(this.g, jc1Var.g) && wh1.a(this.h, jc1Var.h) && Intrinsics.a(this.i, jc1Var.i) && Intrinsics.a(this.j, jc1Var.j) && Intrinsics.a(this.k, jc1Var.k) && hi.c(this.l, jc1Var.l);
    }

    public final boolean b(jc1 jc1Var) {
        return Intrinsics.a(this.a, jc1Var.a) && Intrinsics.a(this.m, jc1Var.m) && Intrinsics.a(this.n, jc1Var.n) && Intrinsics.a(this.o, jc1Var.o);
    }

    public final jc1 c(jc1 jc1Var) {
        if (jc1Var == null) {
            return this;
        }
        zg1 zg1Var = jc1Var.a;
        return kc1.a(this, zg1Var.c(), zg1Var.j(), zg1Var.k(), jc1Var.b, jc1Var.c, jc1Var.d, jc1Var.e, jc1Var.f, jc1Var.g, jc1Var.h, jc1Var.i, jc1Var.j, jc1Var.k, jc1Var.l, jc1Var.m, jc1Var.n, jc1Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc1)) {
            return false;
        }
        jc1 jc1Var = (jc1) obj;
        return a(jc1Var) && b(jc1Var);
    }

    public final int hashCode() {
        zg1 zg1Var = this.a;
        long c = zg1Var.c();
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        int hashCode = Long.hashCode(c) * 31;
        op j = zg1Var.j();
        int hashCode2 = (Float.hashCode(zg1Var.k()) + ((hashCode + (j != null ? j.hashCode() : 0)) * 31)) * 31;
        xh1[] xh1VarArr = wh1.b;
        int e = qy0.e(this.b, hashCode2, 31);
        x20 x20Var = this.c;
        int i2 = (e + (x20Var != null ? x20Var.d : 0)) * 31;
        t20 t20Var = this.d;
        int hashCode3 = (i2 + (t20Var != null ? Integer.hashCode(t20Var.a) : 0)) * 31;
        u20 u20Var = this.e;
        int hashCode4 = (hashCode3 + (u20Var != null ? Integer.hashCode(u20Var.a) : 0)) * 31;
        w10 w10Var = this.f;
        int hashCode5 = (hashCode4 + (w10Var != null ? w10Var.hashCode() : 0)) * 31;
        String str = this.g;
        int e2 = qy0.e(this.h, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        ad adVar = this.i;
        int hashCode6 = (e2 + (adVar != null ? Float.hashCode(adVar.a) : 0)) * 31;
        ah1 ah1Var = this.j;
        int hashCode7 = (hashCode6 + (ah1Var != null ? ah1Var.hashCode() : 0)) * 31;
        mi0 mi0Var = this.k;
        int e3 = qy0.e(this.l, (hashCode7 + (mi0Var != null ? mi0Var.d.hashCode() : 0)) * 31, 31);
        wg1 wg1Var = this.m;
        int i3 = (e3 + (wg1Var != null ? wg1Var.a : 0)) * 31;
        s91 s91Var = this.n;
        int hashCode8 = (i3 + (s91Var != null ? s91Var.hashCode() : 0)) * 961;
        p4 p4Var = this.o;
        return hashCode8 + (p4Var != null ? p4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        zg1 zg1Var = this.a;
        sb.append((Object) hi.i(zg1Var.c()));
        sb.append(", brush=");
        sb.append(zg1Var.j());
        sb.append(", alpha=");
        sb.append(zg1Var.k());
        sb.append(", fontSize=");
        sb.append((Object) wh1.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) wh1.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        qy0.r(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.o);
        sb.append(')');
        return sb.toString();
    }

    public jc1(zg1 zg1Var, long j, x20 x20Var, t20 t20Var, u20 u20Var, w10 w10Var, String str, long j2, ad adVar, ah1 ah1Var, mi0 mi0Var, long j3, wg1 wg1Var, s91 s91Var, p4 p4Var) {
        this.a = zg1Var;
        this.b = j;
        this.c = x20Var;
        this.d = t20Var;
        this.e = u20Var;
        this.f = w10Var;
        this.g = str;
        this.h = j2;
        this.i = adVar;
        this.j = ah1Var;
        this.k = mi0Var;
        this.l = j3;
        this.m = wg1Var;
        this.n = s91Var;
        this.o = p4Var;
    }

    public jc1(long j, long j2, x20 x20Var, t20 t20Var, u20 u20Var, w10 w10Var, String str, long j3, ad adVar, ah1 ah1Var, mi0 mi0Var, long j4, wg1 wg1Var, s91 s91Var) {
        this(j != 16 ? new ui(j) : j50.C, j2, x20Var, t20Var, u20Var, w10Var, str, j3, adVar, ah1Var, mi0Var, j4, wg1Var, s91Var, (p4) null);
    }
}
