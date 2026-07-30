package defpackage;

import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jq1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public jq1(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jq1)) {
            return false;
        }
        jq1 jq1Var = (jq1) obj;
        return aw.c(this.a, jq1Var.a) && aw.c(this.d, jq1Var.d) && aw.c(this.b, jq1Var.b) && aw.c(this.e, jq1Var.e) && aw.c(this.c, jq1Var.c) && aw.c(this.f, jq1Var.f) && aw.c(this.g, jq1Var.g);
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        return Long.hashCode(this.g) + in1.h(in1.h(in1.h(in1.h(in1.h(Long.hashCode(this.a) * 31, 31, this.d), 31, this.b), 31, this.e), 31, this.c), 31, this.f);
    }
}
