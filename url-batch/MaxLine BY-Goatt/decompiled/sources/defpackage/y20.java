package defpackage;

import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y20 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public y20(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y20)) {
            return false;
        }
        y20 y20Var = (y20) obj;
        return aw.c(this.a, y20Var.a) && aw.c(this.b, y20Var.b) && aw.c(this.c, y20Var.c) && aw.c(this.d, y20Var.d) && aw.c(this.e, y20Var.e);
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        return Long.hashCode(this.e) + in1.h(in1.h(in1.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        in1.o(this.a, sb, ", textColor=");
        in1.o(this.b, sb, ", iconColor=");
        in1.o(this.c, sb, ", disabledTextColor=");
        in1.o(this.d, sb, ", disabledIconColor=");
        sb.append((Object) aw.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
