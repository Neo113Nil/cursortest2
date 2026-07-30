package d6;

import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Throwable f2620f;

    public l(Throwable th) {
        r6.k.f(th, "exception");
        this.f2620f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return r6.k.a(this.f2620f, ((l) obj).f2620f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2620f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2620f + ')';
    }
}
