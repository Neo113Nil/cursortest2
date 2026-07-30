package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class th1 {
    public static final th1 d = new th1(0, null, 0, 0, 16777215);
    public final jc1 a;
    public final uu0 b;
    public final kx0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public th1(long j, x20 x20Var, long j2, long j3, int i) {
        this(new jc1(r1, (i & 2) != 0 ? wh1.c : j, (i & 4) != 0 ? null : x20Var, null, null, (i & 32) != 0 ? null : w10.d, null, (i & 128) != 0 ? wh1.c : j2, null, null, null, r1, null, null), new uu0(0, 0, (i & 131072) != 0 ? wh1.c : j3, null, null, null, 0, 0, null), null);
        long j4 = hi.g;
    }

    public static th1 a(th1 th1Var, long j, x20 x20Var, w10 w10Var, long j2, long j3, jh0 jh0Var, int i) {
        ad adVar;
        ah1 ah1Var;
        long j4;
        kx0 kx0Var = mo.f;
        long c = th1Var.a.a.c();
        long j5 = (i & 2) != 0 ? th1Var.a.b : j;
        x20 x20Var2 = (i & 4) != 0 ? th1Var.a.c : x20Var;
        jc1 jc1Var = th1Var.a;
        t20 t20Var = jc1Var.d;
        u20 u20Var = jc1Var.e;
        w10 w10Var2 = (i & 32) != 0 ? jc1Var.f : w10Var;
        String str = jc1Var.g;
        long j6 = (i & 128) != 0 ? jc1Var.h : j2;
        ad adVar2 = jc1Var.i;
        ah1 ah1Var2 = jc1Var.j;
        mi0 mi0Var = jc1Var.k;
        long j7 = jc1Var.l;
        wg1 wg1Var = jc1Var.m;
        s91 s91Var = jc1Var.n;
        p4 p4Var = jc1Var.o;
        uu0 uu0Var = th1Var.b;
        int i2 = uu0Var.a;
        int i3 = uu0Var.b;
        if ((i & 131072) != 0) {
            adVar = adVar2;
            ah1Var = ah1Var2;
            j4 = uu0Var.c;
        } else {
            adVar = adVar2;
            ah1Var = ah1Var2;
            j4 = j3;
        }
        bh1 bh1Var = uu0Var.d;
        kx0 kx0Var2 = (i & 524288) != 0 ? th1Var.c : kx0Var;
        return new th1(new jc1(hi.c(c, jc1Var.a.c()) ? jc1Var.a : c != 16 ? new ui(c) : j50.C, j5, x20Var2, t20Var, u20Var, w10Var2, str, j6, adVar, ah1Var, mi0Var, j7, wg1Var, s91Var, p4Var), new uu0(i2, i3, j4, bh1Var, kx0Var2 != null ? kx0Var2.a : null, (i & 1048576) != 0 ? uu0Var.f : jh0Var, uu0Var.g, uu0Var.h, uu0Var.i), kx0Var2);
    }

    public static th1 c(th1 th1Var, long j, long j2, x20 x20Var, w10 w10Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? wh1.c : j2;
        x20 x20Var2 = (i2 & 4) != 0 ? null : x20Var;
        w10 w10Var2 = (i2 & 32) != 0 ? null : w10Var;
        long j6 = (i2 & 128) != 0 ? wh1.c : j3;
        long j7 = hi.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? wh1.c : j4;
        jc1 a = kc1.a(th1Var.a, j, null, Float.NaN, j5, x20Var2, null, null, w10Var2, null, j6, null, null, null, j7, null, null, null);
        uu0 a2 = vu0.a(th1Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (th1Var.a == a && th1Var.b == a2) ? th1Var : new th1(a, a2);
    }

    public final long b() {
        return this.a.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th1)) {
            return false;
        }
        th1 th1Var = (th1) obj;
        return Intrinsics.a(this.a, th1Var.a) && Intrinsics.a(this.b, th1Var.b) && Intrinsics.a(this.c, th1Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kx0 kx0Var = this.c;
        return hashCode + (kx0Var != null ? kx0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) hi.i(b()));
        sb.append(", brush=");
        jc1 jc1Var = this.a;
        sb.append(jc1Var.a.j());
        sb.append(", alpha=");
        sb.append(jc1Var.a.k());
        sb.append(", fontSize=");
        sb.append((Object) wh1.d(jc1Var.b));
        sb.append(", fontWeight=");
        sb.append(jc1Var.c);
        sb.append(", fontStyle=");
        sb.append(jc1Var.d);
        sb.append(", fontSynthesis=");
        sb.append(jc1Var.e);
        sb.append(", fontFamily=");
        sb.append(jc1Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(jc1Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) wh1.d(jc1Var.h));
        sb.append(", baselineShift=");
        sb.append(jc1Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(jc1Var.j);
        sb.append(", localeList=");
        sb.append(jc1Var.k);
        sb.append(", background=");
        qy0.r(jc1Var.l, sb, ", textDecoration=");
        sb.append(jc1Var.m);
        sb.append(", shadow=");
        sb.append(jc1Var.n);
        sb.append(", drawStyle=");
        sb.append(jc1Var.o);
        sb.append(", textAlign=");
        uu0 uu0Var = this.b;
        sb.append((Object) tg1.a(uu0Var.a));
        sb.append(", textDirection=");
        sb.append((Object) yg1.a(uu0Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) wh1.d(uu0Var.c));
        sb.append(", textIndent=");
        sb.append(uu0Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(uu0Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) eh0.a(uu0Var.g));
        sb.append(", hyphens=");
        sb.append((Object) s60.a(uu0Var.h));
        sb.append(", textMotion=");
        sb.append(uu0Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public th1(jc1 jc1Var, uu0 uu0Var) {
        this(jc1Var, uu0Var, r0 == null ? null : new kx0(r0));
        jc1Var.getClass();
        hx0 hx0Var = uu0Var.e;
    }

    public th1(jc1 jc1Var, uu0 uu0Var, kx0 kx0Var) {
        this.a = jc1Var;
        this.b = uu0Var;
        this.c = kx0Var;
    }
}
