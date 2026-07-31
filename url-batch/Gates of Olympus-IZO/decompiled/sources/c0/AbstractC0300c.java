package c0;

import H2.AbstractC0080b;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0300c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4346a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4348c;

    public AbstractC0300c(String str, long j3, int i3) {
        this.f4346a = str;
        this.f4347b = j3;
        this.f4348c = i3;
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
        AbstractC0300c abstractC0300c = (AbstractC0300c) obj;
        if (this.f4348c == abstractC0300c.f4348c && Z1.i.a(this.f4346a, abstractC0300c.f4346a)) {
            return AbstractC0299b.a(this.f4347b, abstractC0300c.f4347b);
        }
        return false;
    }

    public abstract long f(float f3, float f4, float f5, float f6, AbstractC0300c abstractC0300c);

    public int hashCode() {
        int hashCode = this.f4346a.hashCode() * 31;
        int i3 = AbstractC0299b.f4345e;
        return AbstractC0080b.d(hashCode, 31, this.f4347b) + this.f4348c;
    }

    public final String toString() {
        return this.f4346a + " (id=" + this.f4348c + ", model=" + ((Object) AbstractC0299b.b(this.f4347b)) + ')';
    }
}
