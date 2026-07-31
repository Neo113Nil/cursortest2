package m;

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630o extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f6859a;

    /* renamed from: b, reason: collision with root package name */
    public float f6860b;

    public C0630o(float f3, float f4) {
        this.f6859a = f3;
        this.f6860b = f4;
    }

    @Override // m.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f6859a;
        }
        if (i3 != 1) {
            return 0.0f;
        }
        return this.f6860b;
    }

    @Override // m.r
    public final int b() {
        return 2;
    }

    @Override // m.r
    public final r c() {
        return new C0630o(0.0f, 0.0f);
    }

    @Override // m.r
    public final void d() {
        this.f6859a = 0.0f;
        this.f6860b = 0.0f;
    }

    @Override // m.r
    public final void e(float f3, int i3) {
        if (i3 == 0) {
            this.f6859a = f3;
        } else {
            if (i3 != 1) {
                return;
            }
            this.f6860b = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0630o) {
            C0630o c0630o = (C0630o) obj;
            if (c0630o.f6859a == this.f6859a && c0630o.f6860b == this.f6860b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6860b) + (Float.hashCode(this.f6859a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f6859a + ", v2 = " + this.f6860b;
    }
}
