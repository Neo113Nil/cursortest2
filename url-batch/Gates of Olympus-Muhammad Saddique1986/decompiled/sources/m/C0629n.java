package m;

/* renamed from: m.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629n extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f6855a;

    public C0629n(float f3) {
        this.f6855a = f3;
    }

    @Override // m.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f6855a;
        }
        return 0.0f;
    }

    @Override // m.r
    public final int b() {
        return 1;
    }

    @Override // m.r
    public final r c() {
        return new C0629n(0.0f);
    }

    @Override // m.r
    public final void d() {
        this.f6855a = 0.0f;
    }

    @Override // m.r
    public final void e(float f3, int i3) {
        if (i3 == 0) {
            this.f6855a = f3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0629n) && ((C0629n) obj).f6855a == this.f6855a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6855a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f6855a;
    }
}
