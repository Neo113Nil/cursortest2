package B;

import b0.C0352v;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f416a;

    /* renamed from: b, reason: collision with root package name */
    public final long f417b;

    public j0(long j3, long j4) {
        this.f416a = j3;
        this.f417b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return C0352v.c(this.f416a, j0Var.f416a) && C0352v.c(this.f417b, j0Var.f417b);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f417b) + (Long.hashCode(this.f416a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        A.k.p(this.f416a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C0352v.i(this.f417b));
        sb.append(')');
        return sb.toString();
    }
}
