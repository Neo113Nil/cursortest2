package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public float f6372a;

    /* renamed from: b, reason: collision with root package name */
    public float f6373b;

    /* renamed from: c, reason: collision with root package name */
    public float f6374c;

    /* renamed from: d, reason: collision with root package name */
    public float f6375d;

    public o(float f6, float f8, float f9, float f10) {
        this.f6372a = f6;
        this.f6373b = f8;
        this.f6374c = f9;
        this.f6375d = f10;
    }

    @Override // r.p
    public final float a(int i) {
        if (i == 0) {
            return this.f6372a;
        }
        if (i == 1) {
            return this.f6373b;
        }
        if (i == 2) {
            return this.f6374c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f6375d;
    }

    @Override // r.p
    public final int b() {
        return 4;
    }

    @Override // r.p
    public final p c() {
        return new o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // r.p
    public final void d() {
        this.f6372a = 0.0f;
        this.f6373b = 0.0f;
        this.f6374c = 0.0f;
        this.f6375d = 0.0f;
    }

    @Override // r.p
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f6372a = f6;
            return;
        }
        if (i == 1) {
            this.f6373b = f6;
        } else if (i == 2) {
            this.f6374c = f6;
        } else {
            if (i != 3) {
                return;
            }
            this.f6375d = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f6372a == this.f6372a && oVar.f6373b == this.f6373b && oVar.f6374c == this.f6374c && oVar.f6375d == this.f6375d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6375d) + a0.q.a(this.f6374c, a0.q.a(this.f6373b, Float.hashCode(this.f6372a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f6372a + ", v2 = " + this.f6373b + ", v3 = " + this.f6374c + ", v4 = " + this.f6375d;
    }
}
