package l;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final float f6459a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6460b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6461c;

    public J(float f3, float f4, long j3) {
        this.f6459a = f3;
        this.f6460b = f4;
        this.f6461c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j3 = (J) obj;
        return Float.compare(this.f6459a, j3.f6459a) == 0 && Float.compare(this.f6460b, j3.f6460b) == 0 && this.f6461c == j3.f6461c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6461c) + A.k.a(this.f6460b, Float.hashCode(this.f6459a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f6459a + ", distance=" + this.f6460b + ", duration=" + this.f6461c + ')';
    }
}
