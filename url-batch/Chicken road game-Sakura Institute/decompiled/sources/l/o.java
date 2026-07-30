package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends q {

    /* renamed from: a, reason: collision with root package name */
    public float f5592a;

    /* renamed from: b, reason: collision with root package name */
    public float f5593b;

    /* renamed from: c, reason: collision with root package name */
    public float f5594c;

    public o(float f9, float f10, float f11) {
        this.f5592a = f9;
        this.f5593b = f10;
        this.f5594c = f11;
    }

    @Override // l.q
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f5592a;
        }
        if (i7 == 1) {
            return this.f5593b;
        }
        if (i7 != 2) {
            return 0.0f;
        }
        return this.f5594c;
    }

    @Override // l.q
    public final int b() {
        return 3;
    }

    @Override // l.q
    public final q c() {
        return new o(0.0f, 0.0f, 0.0f);
    }

    @Override // l.q
    public final void d() {
        this.f5592a = 0.0f;
        this.f5593b = 0.0f;
        this.f5594c = 0.0f;
    }

    @Override // l.q
    public final void e(float f9, int i7) {
        if (i7 == 0) {
            this.f5592a = f9;
        } else if (i7 == 1) {
            this.f5593b = f9;
        } else {
            if (i7 != 2) {
                return;
            }
            this.f5594c = f9;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f5592a == this.f5592a && oVar.f5593b == this.f5593b && oVar.f5594c == this.f5594c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5594c) + a0.m.a(this.f5593b, Float.hashCode(this.f5592a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f5592a + ", v2 = " + this.f5593b + ", v3 = " + this.f5594c;
    }
}
