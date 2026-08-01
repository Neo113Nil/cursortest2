package u;

import v.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f9522a;

    public j0(a1 a1Var) {
        this.f9522a = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return Float.compare(0.0f, 0.0f) == 0 && this.f9522a.equals(((j0) obj).f9522a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9522a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f9522a + ')';
    }
}
