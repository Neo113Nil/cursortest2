package m;

/* renamed from: m.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604n extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f5808a;

    public C0604n(float f3) {
        this.f5808a = f3;
    }

    @Override // m.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f5808a;
        }
        return 0.0f;
    }

    @Override // m.r
    public final int b() {
        return 1;
    }

    @Override // m.r
    public final r c() {
        return new C0604n(0.0f);
    }

    @Override // m.r
    public final void d() {
        this.f5808a = 0.0f;
    }

    @Override // m.r
    public final void e(float f3, int i3) {
        if (i3 == 0) {
            this.f5808a = f3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0604n) && ((C0604n) obj).f5808a == this.f5808a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5808a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f5808a;
    }
}
