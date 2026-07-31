package m;

import H2.AbstractC0080b;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607q extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f5832a;

    /* renamed from: b, reason: collision with root package name */
    public float f5833b;

    /* renamed from: c, reason: collision with root package name */
    public float f5834c;

    /* renamed from: d, reason: collision with root package name */
    public float f5835d;

    public C0607q(float f3, float f4, float f5, float f6) {
        this.f5832a = f3;
        this.f5833b = f4;
        this.f5834c = f5;
        this.f5835d = f6;
    }

    @Override // m.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f5832a;
        }
        if (i3 == 1) {
            return this.f5833b;
        }
        if (i3 == 2) {
            return this.f5834c;
        }
        if (i3 != 3) {
            return 0.0f;
        }
        return this.f5835d;
    }

    @Override // m.r
    public final int b() {
        return 4;
    }

    @Override // m.r
    public final r c() {
        return new C0607q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // m.r
    public final void d() {
        this.f5832a = 0.0f;
        this.f5833b = 0.0f;
        this.f5834c = 0.0f;
        this.f5835d = 0.0f;
    }

    @Override // m.r
    public final void e(float f3, int i3) {
        if (i3 == 0) {
            this.f5832a = f3;
            return;
        }
        if (i3 == 1) {
            this.f5833b = f3;
        } else if (i3 == 2) {
            this.f5834c = f3;
        } else {
            if (i3 != 3) {
                return;
            }
            this.f5835d = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0607q) {
            C0607q c0607q = (C0607q) obj;
            if (c0607q.f5832a == this.f5832a && c0607q.f5833b == this.f5833b && c0607q.f5834c == this.f5834c && c0607q.f5835d == this.f5835d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5835d) + AbstractC0080b.a(this.f5834c, AbstractC0080b.a(this.f5833b, Float.hashCode(this.f5832a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f5832a + ", v2 = " + this.f5833b + ", v3 = " + this.f5834c + ", v4 = " + this.f5835d;
    }
}
