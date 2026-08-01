package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7942c;

    public t(float f3) {
        super(3);
        this.f7942c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f7942c, ((t) obj).f7942c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7942c);
    }

    public final String toString() {
        return v4.a.l(new StringBuilder("RelativeHorizontalTo(dx="), this.f7942c, ')');
    }
}
