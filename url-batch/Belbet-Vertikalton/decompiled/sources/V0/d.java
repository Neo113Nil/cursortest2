package V0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public float f1333a;

    /* renamed from: b, reason: collision with root package name */
    public float f1334b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1335c;

    /* renamed from: d, reason: collision with root package name */
    public float f1336d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public float f1337f = 1.0f;

    public d(float f2, float f3, float f4, float f5, int i) {
        this.f1333a = f2;
        this.f1334b = f3;
        this.f1335c = f4;
        this.f1336d = f5;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f1333a, dVar.f1333a) == 0 && Float.compare(this.f1334b, dVar.f1334b) == 0 && Float.compare(this.f1335c, dVar.f1335c) == 0 && Float.compare(this.f1336d, dVar.f1336d) == 0 && this.e == dVar.e && Float.compare(this.f1337f, dVar.f1337f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1337f) + ((Integer.hashCode(this.e) + ((Float.hashCode(this.f1336d) + ((Float.hashCode(this.f1335c) + ((Float.hashCode(this.f1334b) + (Float.hashCode(this.f1333a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Particle(x=" + this.f1333a + ", y=" + this.f1334b + ", vx=" + this.f1335c + ", vy=" + this.f1336d + ", color=" + this.e + ", life=" + this.f1337f + ")";
    }
}
