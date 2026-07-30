package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: a, reason: collision with root package name */
    public float f5574a;

    /* renamed from: b, reason: collision with root package name */
    public float f5575b;

    public n(float f9, float f10) {
        this.f5574a = f9;
        this.f5575b = f10;
    }

    @Override // l.q
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f5574a;
        }
        if (i7 != 1) {
            return 0.0f;
        }
        return this.f5575b;
    }

    @Override // l.q
    public final int b() {
        return 2;
    }

    @Override // l.q
    public final q c() {
        return new n(0.0f, 0.0f);
    }

    @Override // l.q
    public final void d() {
        this.f5574a = 0.0f;
        this.f5575b = 0.0f;
    }

    @Override // l.q
    public final void e(float f9, int i7) {
        if (i7 == 0) {
            this.f5574a = f9;
        } else {
            if (i7 != 1) {
                return;
            }
            this.f5575b = f9;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f5574a == this.f5574a && nVar.f5575b == this.f5575b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5575b) + (Float.hashCode(this.f5574a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f5574a + ", v2 = " + this.f5575b;
    }
}
