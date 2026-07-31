package d0;

import r2.f;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f2046a;

    public b(float f6) {
        this.f2046a = f6;
    }

    @Override // d0.a
    public final float a(long j7, r2.c cVar) {
        return cVar.u(this.f2046a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.a(this.f2046a, ((b) obj).f2046a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2046a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f2046a + ".dp)";
    }
}
