package d0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f3276a;

    public c(float f3) {
        this.f3276a = f3;
        if (f3 < 0.0f || f3 > 100.0f) {
            a0.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // d0.a
    public final float a(long j, x2.c cVar) {
        return (this.f3276a / 100.0f) * j1.e.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f3276a, ((c) obj).f3276a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3276a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f3276a + "%)";
    }
}
