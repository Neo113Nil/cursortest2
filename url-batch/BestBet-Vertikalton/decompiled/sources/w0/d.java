package w0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public float f4475a;

    /* renamed from: b, reason: collision with root package name */
    public float f4476b;

    /* renamed from: c, reason: collision with root package name */
    public float f4477c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4478e;

    /* renamed from: f, reason: collision with root package name */
    public int f4479f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4480g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f4475a, dVar.f4475a) == 0 && Float.compare(this.f4476b, dVar.f4476b) == 0 && Float.compare(this.f4477c, dVar.f4477c) == 0 && Float.compare(this.d, dVar.d) == 0 && Float.compare(this.f4478e, dVar.f4478e) == 0 && this.f4479f == dVar.f4479f && this.f4480g == dVar.f4480g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4480g) + ((Integer.hashCode(this.f4479f) + ((Float.hashCode(this.f4478e) + ((Float.hashCode(this.d) + ((Float.hashCode(this.f4477c) + ((Float.hashCode(this.f4476b) + (Float.hashCode(this.f4475a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Particle(x=" + this.f4475a + ", y=" + this.f4476b + ", vx=" + this.f4477c + ", vy=" + this.d + ", alpha=" + this.f4478e + ", color=" + this.f4479f + ", alive=" + this.f4480g + ")";
    }
}
