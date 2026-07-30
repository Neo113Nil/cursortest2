package a1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f215a;

    /* renamed from: b, reason: collision with root package name */
    public final long f216b;

    /* renamed from: c, reason: collision with root package name */
    public final int f217c;

    public c(int i7, long j8, String str) {
        this.f215a = str;
        this.f216b = j8;
        this.f217c = i7;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i7 < -1 || i7 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i7);

    public abstract float b(int i7);

    public boolean c() {
        return false;
    }

    public abstract long d(float f9, float f10, float f11);

    public abstract float e(float f9, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f217c == cVar.f217c && r6.k.a(this.f215a, cVar.f215a)) {
            return b.a(this.f216b, cVar.f216b);
        }
        return false;
    }

    public abstract long f(float f9, float f10, float f11, float f12, c cVar);

    public int hashCode() {
        int hashCode = this.f215a.hashCode() * 31;
        int i7 = b.f214e;
        return a0.m.d(hashCode, 31, this.f216b) + this.f217c;
    }

    public final String toString() {
        return this.f215a + " (id=" + this.f217c + ", model=" + ((Object) b.b(this.f216b)) + ')';
    }
}
