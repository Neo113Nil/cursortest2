package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: a, reason: collision with root package name */
    public float f6365a;

    /* renamed from: b, reason: collision with root package name */
    public float f6366b;

    /* renamed from: c, reason: collision with root package name */
    public float f6367c;

    public n(float f6, float f8, float f9) {
        this.f6365a = f6;
        this.f6366b = f8;
        this.f6367c = f9;
    }

    @Override // r.p
    public final float a(int i) {
        if (i == 0) {
            return this.f6365a;
        }
        if (i == 1) {
            return this.f6366b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f6367c;
    }

    @Override // r.p
    public final int b() {
        return 3;
    }

    @Override // r.p
    public final p c() {
        return new n(0.0f, 0.0f, 0.0f);
    }

    @Override // r.p
    public final void d() {
        this.f6365a = 0.0f;
        this.f6366b = 0.0f;
        this.f6367c = 0.0f;
    }

    @Override // r.p
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f6365a = f6;
        } else if (i == 1) {
            this.f6366b = f6;
        } else {
            if (i != 2) {
                return;
            }
            this.f6367c = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f6365a == this.f6365a && nVar.f6366b == this.f6366b && nVar.f6367c == this.f6367c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6367c) + a0.q.a(this.f6366b, Float.hashCode(this.f6365a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f6365a + ", v2 = " + this.f6366b + ", v3 = " + this.f6367c;
    }
}
