package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nh1 {
    public final long a;
    public final long b;

    public nh1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh1)) {
            return false;
        }
        nh1 nh1Var = (nh1) obj;
        return hi.c(this.a, nh1Var.a) && hi.c(this.b, nh1Var.b);
    }

    public final int hashCode() {
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        qy0.r(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) hi.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
