package a0;

import A.k;
import h2.AbstractC0508a;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239d {

    /* renamed from: e, reason: collision with root package name */
    public static final C0239d f4723e = new C0239d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f4724a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4725b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4726c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4727d;

    public C0239d(float f3, float f4, float f5, float f6) {
        this.f4724a = f3;
        this.f4725b = f4;
        this.f4726c = f5;
        this.f4727d = f6;
    }

    public final long a() {
        return l0.c.e((c() / 2.0f) + this.f4724a, (b() / 2.0f) + this.f4725b);
    }

    public final float b() {
        return this.f4727d - this.f4725b;
    }

    public final float c() {
        return this.f4726c - this.f4724a;
    }

    public final C0239d d(C0239d c0239d) {
        return new C0239d(Math.max(this.f4724a, c0239d.f4724a), Math.max(this.f4725b, c0239d.f4725b), Math.min(this.f4726c, c0239d.f4726c), Math.min(this.f4727d, c0239d.f4727d));
    }

    public final boolean e() {
        return this.f4724a >= this.f4726c || this.f4725b >= this.f4727d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0239d)) {
            return false;
        }
        C0239d c0239d = (C0239d) obj;
        return Float.compare(this.f4724a, c0239d.f4724a) == 0 && Float.compare(this.f4725b, c0239d.f4725b) == 0 && Float.compare(this.f4726c, c0239d.f4726c) == 0 && Float.compare(this.f4727d, c0239d.f4727d) == 0;
    }

    public final boolean f(C0239d c0239d) {
        return this.f4726c > c0239d.f4724a && c0239d.f4726c > this.f4724a && this.f4727d > c0239d.f4725b && c0239d.f4727d > this.f4725b;
    }

    public final C0239d g(float f3, float f4) {
        return new C0239d(this.f4724a + f3, this.f4725b + f4, this.f4726c + f3, this.f4727d + f4);
    }

    public final C0239d h(long j3) {
        return new C0239d(C0238c.d(j3) + this.f4724a, C0238c.e(j3) + this.f4725b, C0238c.d(j3) + this.f4726c, C0238c.e(j3) + this.f4727d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4727d) + k.a(this.f4726c, k.a(this.f4725b, Float.hashCode(this.f4724a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC0508a.Y(this.f4724a) + ", " + AbstractC0508a.Y(this.f4725b) + ", " + AbstractC0508a.Y(this.f4726c) + ", " + AbstractC0508a.Y(this.f4727d) + ')';
    }
}
