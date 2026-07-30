package n;

import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final long f6492a;

    public h(long j8) {
        this.f6492a = j8;
        if (!r.h(j8)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return y0.c.b(this.f6492a, ((h) obj).f6492a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6492a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) y0.c.j(this.f6492a)) + ')';
    }
}
