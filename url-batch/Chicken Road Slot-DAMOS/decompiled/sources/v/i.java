package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: a, reason: collision with root package name */
    public float f9819a;

    /* renamed from: b, reason: collision with root package name */
    public float f9820b;

    public i(float f3, float f10) {
        this.f9819a = f3;
        this.f9820b = f10;
    }

    @Override // v.l
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f9819a;
        }
        if (i3 != 1) {
            return 0.0f;
        }
        return this.f9820b;
    }

    @Override // v.l
    public final int b() {
        return 2;
    }

    @Override // v.l
    public final l c() {
        return new i(0.0f, 0.0f);
    }

    @Override // v.l
    public final void d() {
        this.f9819a = 0.0f;
        this.f9820b = 0.0f;
    }

    @Override // v.l
    public final void e(int i3, float f3) {
        if (i3 == 0) {
            this.f9819a = f3;
        } else {
            if (i3 != 1) {
                return;
            }
            this.f9820b = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f9819a == this.f9819a && iVar.f9820b == this.f9820b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9820b) + (Float.hashCode(this.f9819a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f9819a + ", v2 = " + this.f9820b;
    }
}
