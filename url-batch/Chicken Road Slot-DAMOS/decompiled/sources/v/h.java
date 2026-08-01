package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: a, reason: collision with root package name */
    public float f9807a;

    public h(float f3) {
        this.f9807a = f3;
    }

    @Override // v.l
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f9807a;
        }
        return 0.0f;
    }

    @Override // v.l
    public final int b() {
        return 1;
    }

    @Override // v.l
    public final l c() {
        return new h(0.0f);
    }

    @Override // v.l
    public final void d() {
        this.f9807a = 0.0f;
    }

    @Override // v.l
    public final void e(int i3, float f3) {
        if (i3 == 0) {
            this.f9807a = f3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h) && ((h) obj).f9807a == this.f9807a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9807a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f9807a;
    }
}
