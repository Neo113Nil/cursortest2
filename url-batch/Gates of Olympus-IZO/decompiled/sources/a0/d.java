package a0;

import H2.AbstractC0080b;
import I2.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f3490e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f3491a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3492b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3493c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3494d;

    public d(float f3, float f4, float f5, float f6) {
        this.f3491a = f3;
        this.f3492b = f4;
        this.f3493c = f5;
        this.f3494d = f6;
    }

    public final long a() {
        return l.f((c() / 2.0f) + this.f3491a, (b() / 2.0f) + this.f3492b);
    }

    public final float b() {
        return this.f3494d - this.f3492b;
    }

    public final float c() {
        return this.f3493c - this.f3491a;
    }

    public final d d(float f3, float f4) {
        return new d(this.f3491a + f3, this.f3492b + f4, this.f3493c + f3, this.f3494d + f4);
    }

    public final d e(long j3) {
        return new d(c.d(j3) + this.f3491a, c.e(j3) + this.f3492b, c.d(j3) + this.f3493c, c.e(j3) + this.f3494d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f3491a, dVar.f3491a) == 0 && Float.compare(this.f3492b, dVar.f3492b) == 0 && Float.compare(this.f3493c, dVar.f3493c) == 0 && Float.compare(this.f3494d, dVar.f3494d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3494d) + AbstractC0080b.a(this.f3493c, AbstractC0080b.a(this.f3492b, Float.hashCode(this.f3491a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + I2.d.N(this.f3491a) + ", " + I2.d.N(this.f3492b) + ", " + I2.d.N(this.f3493c) + ", " + I2.d.N(this.f3494d) + ')';
    }
}
