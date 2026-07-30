package k;

import l.v1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f5227a;

    public j0(v1 v1Var) {
        this.f5227a = v1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return Float.compare(0.0f, 0.0f) == 0 && this.f5227a.equals(((j0) obj).f5227a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5227a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f5227a + ')';
    }
}
