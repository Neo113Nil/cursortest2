package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends q {

    /* renamed from: a, reason: collision with root package name */
    public float f5569a;

    public m(float f9) {
        this.f5569a = f9;
    }

    @Override // l.q
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f5569a;
        }
        return 0.0f;
    }

    @Override // l.q
    public final int b() {
        return 1;
    }

    @Override // l.q
    public final q c() {
        return new m(0.0f);
    }

    @Override // l.q
    public final void d() {
        this.f5569a = 0.0f;
    }

    @Override // l.q
    public final void e(float f9, int i7) {
        if (i7 == 0) {
            this.f5569a = f9;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && ((m) obj).f5569a == this.f5569a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5569a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f5569a;
    }
}
