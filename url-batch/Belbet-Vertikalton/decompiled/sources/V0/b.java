package V0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f1323a;

    /* renamed from: b, reason: collision with root package name */
    public float f1324b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1325c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1326d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1327f;

    public b(float f2, float f3, float f4, float f5, int i, float f6) {
        this.f1323a = f2;
        this.f1324b = f3;
        this.f1325c = f4;
        this.f1326d = f5;
        this.e = i;
        this.f1327f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f1323a, bVar.f1323a) == 0 && Float.compare(this.f1324b, bVar.f1324b) == 0 && Float.compare(this.f1325c, bVar.f1325c) == 0 && Float.compare(this.f1326d, bVar.f1326d) == 0 && this.e == bVar.e && Float.compare(this.f1327f, bVar.f1327f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1327f) + ((Integer.hashCode(this.e) + ((Float.hashCode(this.f1326d) + ((Float.hashCode(this.f1325c) + ((Float.hashCode(this.f1324b) + (Float.hashCode(this.f1323a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Star(x=" + this.f1323a + ", y=" + this.f1324b + ", radius=" + this.f1325c + ", speed=" + this.f1326d + ", baseAlpha=" + this.e + ", twinklePhase=" + this.f1327f + ")";
    }
}
