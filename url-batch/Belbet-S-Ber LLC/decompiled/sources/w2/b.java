package w2;

import java.io.Serializable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Throwable f3816f;

    public b(Throwable th) {
        this.f3816f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return i3.d.a(this.f3816f, ((b) obj).f3816f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3816f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3816f + ')';
    }
}
