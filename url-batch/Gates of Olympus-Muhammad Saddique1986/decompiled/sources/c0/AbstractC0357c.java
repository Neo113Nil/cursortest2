package c0;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0357c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5471a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5472b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5473c;

    public AbstractC0357c(String str, long j3, int i3) {
        this.f5471a = str;
        this.f5472b = j3;
        this.f5473c = i3;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i3 < -1 || i3 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i3);

    public abstract float b(int i3);

    public boolean c() {
        return false;
    }

    public abstract long d(float f3, float f4, float f5);

    public abstract float e(float f3, float f4, float f5);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0357c abstractC0357c = (AbstractC0357c) obj;
        if (this.f5473c == abstractC0357c.f5473c && f2.j.a(this.f5471a, abstractC0357c.f5471a)) {
            return AbstractC0356b.a(this.f5472b, abstractC0357c.f5472b);
        }
        return false;
    }

    public abstract long f(float f3, float f4, float f5, float f6, AbstractC0357c abstractC0357c);

    public int hashCode() {
        int hashCode = this.f5471a.hashCode() * 31;
        int i3 = AbstractC0356b.f5470e;
        return A.k.c(hashCode, 31, this.f5472b) + this.f5473c;
    }

    public final String toString() {
        return this.f5471a + " (id=" + this.f5473c + ", model=" + ((Object) AbstractC0356b.b(this.f5472b)) + ')';
    }
}
