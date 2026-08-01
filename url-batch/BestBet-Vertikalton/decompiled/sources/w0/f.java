package w0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f4483a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4484b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4485c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4486e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4487f;

    public f(float f2, float f3, float f4, float f5, float f6, int i) {
        this.f4483a = f2;
        this.f4484b = f3;
        this.f4485c = f4;
        this.d = f5;
        this.f4486e = f6;
        this.f4487f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f4483a, fVar.f4483a) == 0 && Float.compare(this.f4484b, fVar.f4484b) == 0 && Float.compare(this.f4485c, fVar.f4485c) == 0 && Float.compare(this.d, fVar.d) == 0 && Float.compare(this.f4486e, fVar.f4486e) == 0 && this.f4487f == fVar.f4487f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4487f) + ((Float.hashCode(this.f4486e) + ((Float.hashCode(this.d) + ((Float.hashCode(this.f4485c) + ((Float.hashCode(this.f4484b) + (Float.hashCode(this.f4483a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Star(xRatio=" + this.f4483a + ", yRatio=" + this.f4484b + ", radius=" + this.f4485c + ", phase=" + this.d + ", speed=" + this.f4486e + ", tint=" + this.f4487f + ")";
    }
}
