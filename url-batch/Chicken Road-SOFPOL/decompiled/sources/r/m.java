package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: a, reason: collision with root package name */
    public float f6357a;

    /* renamed from: b, reason: collision with root package name */
    public float f6358b;

    public m(float f6, float f8) {
        this.f6357a = f6;
        this.f6358b = f8;
    }

    @Override // r.p
    public final float a(int i) {
        if (i == 0) {
            return this.f6357a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f6358b;
    }

    @Override // r.p
    public final int b() {
        return 2;
    }

    @Override // r.p
    public final p c() {
        return new m(0.0f, 0.0f);
    }

    @Override // r.p
    public final void d() {
        this.f6357a = 0.0f;
        this.f6358b = 0.0f;
    }

    @Override // r.p
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f6357a = f6;
        } else {
            if (i != 1) {
                return;
            }
            this.f6358b = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f6357a == this.f6357a && mVar.f6358b == this.f6358b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6358b) + (Float.hashCode(this.f6357a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f6357a + ", v2 = " + this.f6358b;
    }
}
