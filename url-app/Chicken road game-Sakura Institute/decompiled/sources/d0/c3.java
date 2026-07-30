package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1881a = z0.u.f10057g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c3) {
            return z0.u.c(this.f1881a, ((c3) obj).f1881a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = z0.u.f10058h;
        return Long.hashCode(this.f1881a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) z0.u.i(this.f1881a)) + ", rippleAlpha=null)";
    }
}
