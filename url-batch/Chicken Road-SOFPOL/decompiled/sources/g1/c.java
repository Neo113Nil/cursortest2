package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2818a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2820c;

    public c(String str, long j7, int i) {
        this.f2818a = str;
        this.f2819b = j7;
        this.f2820c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f6, float f8, float f9);

    public abstract float e(float f6, float f8, float f9);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2820c == cVar.f2820c && q6.i.a(this.f2818a, cVar.f2818a)) {
            return b.a(this.f2819b, cVar.f2819b);
        }
        return false;
    }

    public abstract long f(float f6, float f8, float f9, float f10, c cVar);

    public int hashCode() {
        int hashCode = this.f2818a.hashCode() * 31;
        int i = b.f2817e;
        return a0.q.c(hashCode, 31, this.f2819b) + this.f2820c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2818a);
        sb.append(" (id=");
        sb.append(this.f2820c);
        sb.append(", model=");
        long j7 = b.f2813a;
        long j8 = this.f2819b;
        sb.append((Object) (b.a(j8, j7) ? "Rgb" : b.a(j8, b.f2814b) ? "Xyz" : b.a(j8, b.f2815c) ? "Lab" : b.a(j8, b.f2816d) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
