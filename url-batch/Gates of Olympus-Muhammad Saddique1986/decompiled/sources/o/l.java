package o;

import a0.C0238c;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final long f7418a;

    public l(long j3) {
        this.f7418a = j3;
        if (!l0.c.D(j3)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return C0238c.b(this.f7418a, ((l) obj).f7418a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f7418a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) C0238c.j(this.f7418a)) + ')';
    }
}
