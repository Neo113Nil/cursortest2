package A;

import Z.C0323u;
import y2.y;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f160a;

    /* renamed from: b, reason: collision with root package name */
    public final long f161b;

    public k0(long j4, long j5) {
        this.f160a = j4;
        this.f161b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return C0323u.c(this.f160a, k0Var.f160a) && C0323u.c(this.f161b, k0Var.f161b);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Long.hashCode(this.f161b) + (Long.hashCode(this.f160a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0017m.s(this.f160a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C0323u.i(this.f161b));
        sb.append(')');
        return sb.toString();
    }
}
