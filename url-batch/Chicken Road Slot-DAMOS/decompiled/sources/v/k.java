package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public float f9828a;

    /* renamed from: b, reason: collision with root package name */
    public float f9829b;

    /* renamed from: c, reason: collision with root package name */
    public float f9830c;

    /* renamed from: d, reason: collision with root package name */
    public float f9831d;

    public k(float f3, float f10, float f11, float f12) {
        this.f9828a = f3;
        this.f9829b = f10;
        this.f9830c = f11;
        this.f9831d = f12;
    }

    @Override // v.l
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f9828a;
        }
        if (i3 == 1) {
            return this.f9829b;
        }
        if (i3 == 2) {
            return this.f9830c;
        }
        if (i3 != 3) {
            return 0.0f;
        }
        return this.f9831d;
    }

    @Override // v.l
    public final int b() {
        return 4;
    }

    @Override // v.l
    public final l c() {
        return new k(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // v.l
    public final void d() {
        this.f9828a = 0.0f;
        this.f9829b = 0.0f;
        this.f9830c = 0.0f;
        this.f9831d = 0.0f;
    }

    @Override // v.l
    public final void e(int i3, float f3) {
        if (i3 == 0) {
            this.f9828a = f3;
            return;
        }
        if (i3 == 1) {
            this.f9829b = f3;
        } else if (i3 == 2) {
            this.f9830c = f3;
        } else {
            if (i3 != 3) {
                return;
            }
            this.f9831d = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f9828a == this.f9828a && kVar.f9829b == this.f9829b && kVar.f9830c == this.f9830c && kVar.f9831d == this.f9831d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9831d) + n0.l.b(this.f9830c, n0.l.b(this.f9829b, Float.hashCode(this.f9828a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f9828a + ", v2 = " + this.f9829b + ", v3 = " + this.f9830c + ", v4 = " + this.f9831d;
    }
}
