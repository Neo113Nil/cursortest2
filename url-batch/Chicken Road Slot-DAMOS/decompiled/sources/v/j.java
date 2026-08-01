package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public float f9823a;

    /* renamed from: b, reason: collision with root package name */
    public float f9824b;

    /* renamed from: c, reason: collision with root package name */
    public float f9825c;

    public j(float f3, float f10, float f11) {
        this.f9823a = f3;
        this.f9824b = f10;
        this.f9825c = f11;
    }

    @Override // v.l
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f9823a;
        }
        if (i3 == 1) {
            return this.f9824b;
        }
        if (i3 != 2) {
            return 0.0f;
        }
        return this.f9825c;
    }

    @Override // v.l
    public final int b() {
        return 3;
    }

    @Override // v.l
    public final l c() {
        return new j(0.0f, 0.0f, 0.0f);
    }

    @Override // v.l
    public final void d() {
        this.f9823a = 0.0f;
        this.f9824b = 0.0f;
        this.f9825c = 0.0f;
    }

    @Override // v.l
    public final void e(int i3, float f3) {
        if (i3 == 0) {
            this.f9823a = f3;
        } else if (i3 == 1) {
            this.f9824b = f3;
        } else {
            if (i3 != 2) {
                return;
            }
            this.f9825c = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f9823a == this.f9823a && jVar.f9824b == this.f9824b && jVar.f9825c == this.f9825c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9825c) + n0.l.b(this.f9824b, Float.hashCode(this.f9823a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f9823a + ", v2 = " + this.f9824b + ", v3 = " + this.f9825c;
    }
}
