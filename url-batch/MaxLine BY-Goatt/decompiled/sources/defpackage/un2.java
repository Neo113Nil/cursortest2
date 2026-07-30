package defpackage;

import com.facebook.internal.Utility;
import defpackage.q13;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class un2 implements ud {
    public final pv2 a;
    public final long b;
    public final jq0 c;
    public final fq0 d;
    public final gq0 e;
    public final ip0 f;
    public final String g;
    public final long h;
    public final nn i;
    public final qv2 j;
    public final sf1 k;
    public final long l;
    public final xt2 m;
    public final dk2 n;
    public final e22 o;
    public final ae0 p;

    public un2(long j, long j2, jq0 jq0Var, fq0 fq0Var, gq0 gq0Var, ip0 ip0Var, String str, long j3, nn nnVar, qv2 qv2Var, sf1 sf1Var, long j4, xt2 xt2Var, dk2 dk2Var, int i) {
        this((i & 1) != 0 ? aw.g : j, (i & 2) != 0 ? sw2.c : j2, (i & 4) != 0 ? null : jq0Var, (i & 8) != 0 ? null : fq0Var, (i & 16) != 0 ? null : gq0Var, (i & 32) != 0 ? null : ip0Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? sw2.c : j3, (i & 256) != 0 ? null : nnVar, (i & 512) != 0 ? null : qv2Var, (i & 1024) != 0 ? null : sf1Var, (i & 2048) != 0 ? aw.g : j4, (i & 4096) != 0 ? null : xt2Var, (i & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? null : dk2Var, (e22) null);
    }

    public final boolean a(un2 un2Var) {
        if (this == un2Var) {
            return true;
        }
        return sw2.a(this.b, un2Var.b) && Intrinsics.b(this.c, un2Var.c) && Intrinsics.b(this.d, un2Var.d) && Intrinsics.b(this.e, un2Var.e) && Intrinsics.b(this.f, un2Var.f) && Intrinsics.b(this.g, un2Var.g) && sw2.a(this.h, un2Var.h) && Intrinsics.b(this.i, un2Var.i) && Intrinsics.b(this.j, un2Var.j) && Intrinsics.b(this.k, un2Var.k) && aw.c(this.l, un2Var.l) && Intrinsics.b(this.o, un2Var.o);
    }

    public final boolean b(un2 un2Var) {
        return Intrinsics.b(this.a, un2Var.a) && Intrinsics.b(this.m, un2Var.m) && Intrinsics.b(this.n, un2Var.n) && Intrinsics.b(this.p, un2Var.p);
    }

    public final un2 c(un2 un2Var) {
        if (un2Var == null) {
            return this;
        }
        pv2 pv2Var = un2Var.a;
        return vn2.a(this, pv2Var.b(), pv2Var.c(), pv2Var.a(), un2Var.b, un2Var.c, un2Var.d, un2Var.e, un2Var.f, un2Var.g, un2Var.h, un2Var.i, un2Var.j, un2Var.k, un2Var.l, un2Var.m, un2Var.n, un2Var.o, un2Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un2)) {
            return false;
        }
        un2 un2Var = (un2) obj;
        return a(un2Var) && b(un2Var);
    }

    public final int hashCode() {
        pv2 pv2Var = this.a;
        long b = pv2Var.b();
        int i = aw.h;
        q13.a aVar = q13.m;
        int hashCode = Long.hashCode(b) * 31;
        cq c = pv2Var.c();
        int hashCode2 = (Float.hashCode(pv2Var.a()) + ((hashCode + (c != null ? c.hashCode() : 0)) * 31)) * 31;
        tw2[] tw2VarArr = sw2.b;
        int h = in1.h(hashCode2, 31, this.b);
        jq0 jq0Var = this.c;
        int i2 = (h + (jq0Var != null ? jq0Var.m : 0)) * 31;
        fq0 fq0Var = this.d;
        int hashCode3 = (i2 + (fq0Var != null ? Integer.hashCode(fq0Var.a) : 0)) * 31;
        gq0 gq0Var = this.e;
        int hashCode4 = (hashCode3 + (gq0Var != null ? Integer.hashCode(gq0Var.a) : 0)) * 31;
        ip0 ip0Var = this.f;
        int hashCode5 = (hashCode4 + (ip0Var != null ? ip0Var.hashCode() : 0)) * 31;
        String str = this.g;
        int h2 = in1.h((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        nn nnVar = this.i;
        int hashCode6 = (h2 + (nnVar != null ? Float.hashCode(nnVar.a) : 0)) * 31;
        qv2 qv2Var = this.j;
        int hashCode7 = (hashCode6 + (qv2Var != null ? qv2Var.hashCode() : 0)) * 31;
        sf1 sf1Var = this.k;
        int h3 = in1.h((hashCode7 + (sf1Var != null ? sf1Var.m.hashCode() : 0)) * 31, 31, this.l);
        xt2 xt2Var = this.m;
        int i3 = (h3 + (xt2Var != null ? xt2Var.a : 0)) * 31;
        dk2 dk2Var = this.n;
        int hashCode8 = (i3 + (dk2Var != null ? dk2Var.hashCode() : 0)) * 31;
        e22 e22Var = this.o;
        int hashCode9 = (hashCode8 + (e22Var != null ? e22Var.hashCode() : 0)) * 31;
        ae0 ae0Var = this.p;
        return hashCode9 + (ae0Var != null ? ae0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        pv2 pv2Var = this.a;
        sb.append((Object) aw.i(pv2Var.b()));
        sb.append(", brush=");
        sb.append(pv2Var.c());
        sb.append(", alpha=");
        sb.append(pv2Var.a());
        sb.append(", fontSize=");
        sb.append((Object) sw2.d(this.b));
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
        sb.append((Object) sw2.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        in1.o(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public un2(pv2 pv2Var, long j, jq0 jq0Var, fq0 fq0Var, gq0 gq0Var, ip0 ip0Var, String str, long j2, nn nnVar, qv2 qv2Var, sf1 sf1Var, long j3, xt2 xt2Var, dk2 dk2Var, e22 e22Var, ae0 ae0Var) {
        this.a = pv2Var;
        this.b = j;
        this.c = jq0Var;
        this.d = fq0Var;
        this.e = gq0Var;
        this.f = ip0Var;
        this.g = str;
        this.h = j2;
        this.i = nnVar;
        this.j = qv2Var;
        this.k = sf1Var;
        this.l = j3;
        this.m = xt2Var;
        this.n = dk2Var;
        this.o = e22Var;
        this.p = ae0Var;
    }

    public un2(long j, long j2, jq0 jq0Var, fq0 fq0Var, gq0 gq0Var, ip0 ip0Var, String str, long j3, nn nnVar, qv2 qv2Var, sf1 sf1Var, long j4, xt2 xt2Var, dk2 dk2Var, e22 e22Var) {
        this(j != 16 ? new mw(j) : ov2.a, j2, jq0Var, fq0Var, gq0Var, ip0Var, str, j3, nnVar, qv2Var, sf1Var, j4, xt2Var, dk2Var, e22Var, null);
    }
}
