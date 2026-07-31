package d0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f2047a;

    public c(float f6) {
        this.f2047a = f6;
        if (f6 < 0.0f || f6 > 100.0f) {
            w.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // d0.a
    public final float a(long j7, r2.c cVar) {
        return (this.f2047a / 100.0f) * e1.e.b(j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f2047a, ((c) obj).f2047a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2047a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f2047a + "%)";
    }
}
