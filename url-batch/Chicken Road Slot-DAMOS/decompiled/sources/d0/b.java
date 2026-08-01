package d0;

import x2.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f3275a;

    public b(float f3) {
        this.f3275a = f3;
    }

    @Override // d0.a
    public final float a(long j, x2.c cVar) {
        return cVar.n(this.f3275a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.b(this.f3275a, ((b) obj).f3275a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3275a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f3275a + ".dp)";
    }
}
