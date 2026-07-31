package m;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632q extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f6870a;

    /* renamed from: b, reason: collision with root package name */
    public float f6871b;

    /* renamed from: c, reason: collision with root package name */
    public float f6872c;

    /* renamed from: d, reason: collision with root package name */
    public float f6873d;

    public C0632q(float f3, float f4, float f5, float f6) {
        this.f6870a = f3;
        this.f6871b = f4;
        this.f6872c = f5;
        this.f6873d = f6;
    }

    @Override // m.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f6870a;
        }
        if (i3 == 1) {
            return this.f6871b;
        }
        if (i3 == 2) {
            return this.f6872c;
        }
        if (i3 != 3) {
            return 0.0f;
        }
        return this.f6873d;
    }

    @Override // m.r
    public final int b() {
        return 4;
    }

    @Override // m.r
    public final r c() {
        return new C0632q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // m.r
    public final void d() {
        this.f6870a = 0.0f;
        this.f6871b = 0.0f;
        this.f6872c = 0.0f;
        this.f6873d = 0.0f;
    }

    @Override // m.r
    public final void e(float f3, int i3) {
        if (i3 == 0) {
            this.f6870a = f3;
            return;
        }
        if (i3 == 1) {
            this.f6871b = f3;
        } else if (i3 == 2) {
            this.f6872c = f3;
        } else {
            if (i3 != 3) {
                return;
            }
            this.f6873d = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0632q) {
            C0632q c0632q = (C0632q) obj;
            if (c0632q.f6870a == this.f6870a && c0632q.f6871b == this.f6871b && c0632q.f6872c == this.f6872c && c0632q.f6873d == this.f6873d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6873d) + A.k.a(this.f6872c, A.k.a(this.f6871b, Float.hashCode(this.f6870a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f6870a + ", v2 = " + this.f6871b + ", v3 = " + this.f6872c + ", v4 = " + this.f6873d;
    }
}
