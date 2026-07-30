package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pw2 {
    public static final pw2 d = new pw2(0, 0, null, null, 0, 0, 0, 16777215);
    public final un2 a;
    public final ez1 b;
    public final j22 c;

    public pw2(long j, long j2, jq0 jq0Var, mp0 mp0Var, long j3, int i, long j4, int i2) {
        this(new un2((i2 & 1) != 0 ? aw.g : j, (i2 & 2) != 0 ? sw2.c : j2, (i2 & 4) != 0 ? null : jq0Var, (fq0) null, (gq0) null, (i2 & 32) != 0 ? null : mp0Var, (String) null, (i2 & 128) != 0 ? sw2.c : j3, (nn) null, (qv2) null, (sf1) null, aw.g, (xt2) null, (dk2) null, (e22) null), new ez1((32768 & i2) != 0 ? Integer.MIN_VALUE : i, Integer.MIN_VALUE, (i2 & 131072) != 0 ? sw2.c : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public static pw2 a(pw2 pw2Var, long j, long j2, jq0 jq0Var, ip0 ip0Var, long j3, long j4, ud1 ud1Var, int i) {
        nn nnVar;
        qv2 qv2Var;
        long j5;
        j22 j22Var = ll3.c;
        long b = (i & 1) != 0 ? pw2Var.a.a.b() : j;
        long j6 = (i & 2) != 0 ? pw2Var.a.b : j2;
        jq0 jq0Var2 = (i & 4) != 0 ? pw2Var.a.c : jq0Var;
        un2 un2Var = pw2Var.a;
        fq0 fq0Var = un2Var.d;
        gq0 gq0Var = un2Var.e;
        ip0 ip0Var2 = (i & 32) != 0 ? un2Var.f : ip0Var;
        String str = un2Var.g;
        long j7 = (i & 128) != 0 ? un2Var.h : j3;
        nn nnVar2 = un2Var.i;
        qv2 qv2Var2 = un2Var.j;
        sf1 sf1Var = un2Var.k;
        long j8 = un2Var.l;
        xt2 xt2Var = un2Var.m;
        dk2 dk2Var = un2Var.n;
        ae0 ae0Var = un2Var.p;
        ez1 ez1Var = pw2Var.b;
        int i2 = ez1Var.a;
        int i3 = ez1Var.b;
        if ((i & 131072) != 0) {
            nnVar = nnVar2;
            qv2Var = qv2Var2;
            j5 = ez1Var.c;
        } else {
            nnVar = nnVar2;
            qv2Var = qv2Var2;
            j5 = j4;
        }
        rv2 rv2Var = ez1Var.d;
        j22 j22Var2 = (i & 524288) != 0 ? pw2Var.c : j22Var;
        return new pw2(new un2(aw.c(b, un2Var.a.b()) ? un2Var.a : b != 16 ? new mw(b) : ov2.a, j6, jq0Var2, fq0Var, gq0Var, ip0Var2, str, j7, nnVar, qv2Var, sf1Var, j8, xt2Var, dk2Var, j22Var2 != null ? j22Var2.a : null, ae0Var), new ez1(i2, i3, j5, rv2Var, j22Var2 != null ? j22Var2.b : null, (i & 1048576) != 0 ? ez1Var.f : ud1Var, ez1Var.g, ez1Var.h, ez1Var.i), j22Var2);
    }

    public static pw2 e(pw2 pw2Var, long j, long j2, jq0 jq0Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? sw2.c : j2;
        jq0 jq0Var2 = (i2 & 4) != 0 ? null : jq0Var;
        long j6 = (i2 & 128) != 0 ? sw2.c : j3;
        long j7 = aw.g;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j8 = (i2 & 131072) != 0 ? sw2.c : j4;
        un2 a = vn2.a(pw2Var.a, j, null, Float.NaN, j5, jq0Var2, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        ez1 a2 = fz1.a(pw2Var.b, i3, Integer.MIN_VALUE, j8, null, null, null, 0, Integer.MIN_VALUE, null);
        return (pw2Var.a == a && pw2Var.b == a2) ? pw2Var : new pw2(a, a2);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(pw2 pw2Var) {
        if (this != pw2Var) {
            return Intrinsics.b(this.b, pw2Var.b) && this.a.a(pw2Var.a);
        }
        return true;
    }

    public final pw2 d(pw2 pw2Var) {
        return (pw2Var == null || pw2Var.equals(d)) ? this : new pw2(this.a.c(pw2Var.a), this.b.a(pw2Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw2)) {
            return false;
        }
        pw2 pw2Var = (pw2) obj;
        return Intrinsics.b(this.a, pw2Var.a) && Intrinsics.b(this.b, pw2Var.b) && Intrinsics.b(this.c, pw2Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        j22 j22Var = this.c;
        return hashCode + (j22Var != null ? j22Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) aw.i(b()));
        sb.append(", brush=");
        un2 un2Var = this.a;
        sb.append(un2Var.a.c());
        sb.append(", alpha=");
        sb.append(un2Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) sw2.d(un2Var.b));
        sb.append(", fontWeight=");
        sb.append(un2Var.c);
        sb.append(", fontStyle=");
        sb.append(un2Var.d);
        sb.append(", fontSynthesis=");
        sb.append(un2Var.e);
        sb.append(", fontFamily=");
        sb.append(un2Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(un2Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) sw2.d(un2Var.h));
        sb.append(", baselineShift=");
        sb.append(un2Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(un2Var.j);
        sb.append(", localeList=");
        sb.append(un2Var.k);
        sb.append(", background=");
        in1.o(un2Var.l, sb, ", textDecoration=");
        sb.append(un2Var.m);
        sb.append(", shadow=");
        sb.append(un2Var.n);
        sb.append(", drawStyle=");
        sb.append(un2Var.p);
        sb.append(", textAlign=");
        ez1 ez1Var = this.b;
        sb.append((Object) ut2.a(ez1Var.a));
        sb.append(", textDirection=");
        sb.append((Object) au2.a(ez1Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) sw2.d(ez1Var.c));
        sb.append(", textIndent=");
        sb.append(ez1Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(ez1Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) pd1.a(ez1Var.g));
        sb.append(", hyphens=");
        sb.append((Object) mz0.a(ez1Var.h));
        sb.append(", textMotion=");
        sb.append(ez1Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pw2(un2 un2Var, ez1 ez1Var) {
        this(un2Var, ez1Var, (r0 == null && r1 == null) ? null : new j22(r0, r1));
        e22 e22Var = un2Var.o;
        a22 a22Var = ez1Var.e;
    }

    public pw2(un2 un2Var, ez1 ez1Var, j22 j22Var) {
        this.a = un2Var;
        this.b = ez1Var;
        this.c = j22Var;
    }
}
