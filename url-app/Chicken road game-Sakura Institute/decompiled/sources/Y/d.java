package Y;

import A.AbstractC0017m;
import a.AbstractC0345a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f4373e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f4374a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4375b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4376c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4377d;

    public d(float f4, float f5, float f6, float f7) {
        this.f4374a = f4;
        this.f4375b = f5;
        this.f4376c = f6;
        this.f4377d = f7;
    }

    public final long a() {
        return AbstractC0345a.c((c() / 2.0f) + this.f4374a, (b() / 2.0f) + this.f4375b);
    }

    public final float b() {
        return this.f4377d - this.f4375b;
    }

    public final float c() {
        return this.f4376c - this.f4374a;
    }

    public final d d(d dVar) {
        return new d(Math.max(this.f4374a, dVar.f4374a), Math.max(this.f4375b, dVar.f4375b), Math.min(this.f4376c, dVar.f4376c), Math.min(this.f4377d, dVar.f4377d));
    }

    public final boolean e() {
        return this.f4374a >= this.f4376c || this.f4375b >= this.f4377d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f4374a, dVar.f4374a) == 0 && Float.compare(this.f4375b, dVar.f4375b) == 0 && Float.compare(this.f4376c, dVar.f4376c) == 0 && Float.compare(this.f4377d, dVar.f4377d) == 0;
    }

    public final boolean f(d dVar) {
        return this.f4376c > dVar.f4374a && dVar.f4376c > this.f4374a && this.f4377d > dVar.f4375b && dVar.f4377d > this.f4375b;
    }

    public final d g(float f4, float f5) {
        return new d(this.f4374a + f4, this.f4375b + f5, this.f4376c + f4, this.f4377d + f5);
    }

    public final d h(long j4) {
        return new d(c.d(j4) + this.f4374a, c.e(j4) + this.f4375b, c.d(j4) + this.f4376c, c.e(j4) + this.f4377d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4377d) + AbstractC0017m.a(this.f4376c, AbstractC0017m.a(this.f4375b, Float.hashCode(this.f4374a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + M1.a.W(this.f4374a) + ", " + M1.a.W(this.f4375b) + ", " + M1.a.W(this.f4376c) + ", " + M1.a.W(this.f4377d) + ')';
    }
}
