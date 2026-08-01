package d1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f3294a;

    public b(float f3) {
        this.f3294a = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Float.compare(this.f3294a, ((b) obj).f3294a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3294a);
    }

    public final String toString() {
        return v4.a.l(new StringBuilder("Horizontal(bias="), this.f3294a, ')');
    }
}
