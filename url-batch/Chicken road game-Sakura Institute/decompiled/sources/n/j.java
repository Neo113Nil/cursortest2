package n;

import g0.g1;
import g0.t0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f6493a = g0.d.J(g.f6491a, t0.f3903k);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return r6.k.a((i) ((j) obj).f6493a.getValue(), (i) this.f6493a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((i) this.f6493a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((i) this.f6493a.getValue()) + ')';
    }
}
