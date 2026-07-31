package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: a, reason: collision with root package name */
    public float f6337a;

    public l(float f6) {
        this.f6337a = f6;
    }

    @Override // r.p
    public final float a(int i) {
        if (i == 0) {
            return this.f6337a;
        }
        return 0.0f;
    }

    @Override // r.p
    public final int b() {
        return 1;
    }

    @Override // r.p
    public final p c() {
        return new l(0.0f);
    }

    @Override // r.p
    public final void d() {
        this.f6337a = 0.0f;
    }

    @Override // r.p
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f6337a = f6;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && ((l) obj).f6337a == this.f6337a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6337a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f6337a;
    }
}
