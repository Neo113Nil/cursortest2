package defpackage;

import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g01 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public g01(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g01)) {
            return false;
        }
        g01 g01Var = (g01) obj;
        return aw.c(this.a, g01Var.a) && aw.c(this.b, g01Var.b) && aw.c(this.c, g01Var.c) && aw.c(this.d, g01Var.d);
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        return Long.hashCode(this.d) + in1.h(in1.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
