package m;

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605o extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f5811a;

    /* renamed from: b, reason: collision with root package name */
    public float f5812b;

    public C0605o(float f3, float f4) {
        this.f5811a = f3;
        this.f5812b = f4;
    }

    @Override // m.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f5811a;
        }
        if (i3 != 1) {
            return 0.0f;
        }
        return this.f5812b;
    }

    @Override // m.r
    public final int b() {
        return 2;
    }

    @Override // m.r
    public final r c() {
        return new C0605o(0.0f, 0.0f);
    }

    @Override // m.r
    public final void d() {
        this.f5811a = 0.0f;
        this.f5812b = 0.0f;
    }

    @Override // m.r
    public final void e(float f3, int i3) {
        if (i3 == 0) {
            this.f5811a = f3;
        } else {
            if (i3 != 1) {
                return;
            }
            this.f5812b = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0605o) {
            C0605o c0605o = (C0605o) obj;
            if (c0605o.f5811a == this.f5811a && c0605o.f5812b == this.f5812b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5812b) + (Float.hashCode(this.f5811a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f5811a + ", v2 = " + this.f5812b;
    }
}
