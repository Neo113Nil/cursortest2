package A;

import H2.AbstractC0080b;
import b0.C0288u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f4a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5b;

    public c(long j3, long j4) {
        this.f4a = j3;
        this.f5b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C0288u.c(this.f4a, cVar.f4a) && C0288u.c(this.f5b, cVar.f5b);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f5b) + (Long.hashCode(this.f4a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0080b.q(this.f4a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C0288u.i(this.f5b));
        sb.append(')');
        return sb.toString();
    }
}
