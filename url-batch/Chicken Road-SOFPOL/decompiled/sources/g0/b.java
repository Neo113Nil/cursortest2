package g0;

import a0.q;
import f1.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f2807a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2808b;

    public b(long j7, long j8) {
        this.f2807a = j7;
        this.f2808b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.c(this.f2807a, bVar.f2807a) && s.c(this.f2808b, bVar.f2808b);
    }

    public final int hashCode() {
        int i = s.i;
        return Long.hashCode(this.f2808b) + (Long.hashCode(this.f2807a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        q.o(this.f2807a, sb, ", selectionBackgroundColor=");
        sb.append((Object) s.i(this.f2808b));
        sb.append(')');
        return sb.toString();
    }
}
