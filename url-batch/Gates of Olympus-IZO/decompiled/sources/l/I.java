package l;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final float f5438a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5439b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5440c;

    public I(float f3, float f4, long j3) {
        this.f5438a = f3;
        this.f5439b = f4;
        this.f5440c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return Float.compare(this.f5438a, i3.f5438a) == 0 && Float.compare(this.f5439b, i3.f5439b) == 0 && this.f5440c == i3.f5440c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5440c) + AbstractC0080b.a(this.f5439b, Float.hashCode(this.f5438a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f5438a + ", distance=" + this.f5439b + ", duration=" + this.f5440c + ')';
    }
}
