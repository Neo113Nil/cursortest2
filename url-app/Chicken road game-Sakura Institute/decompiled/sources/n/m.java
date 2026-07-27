package n;

import a.AbstractC0345a;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final long f8539a;

    public m(long j4) {
        this.f8539a = j4;
        if (!AbstractC0345a.z(j4)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return Y.c.b(this.f8539a, ((m) obj).f8539a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8539a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) Y.c.j(this.f8539a)) + ')';
    }
}
