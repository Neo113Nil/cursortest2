package l;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789o extends AbstractC0792s {

    /* renamed from: a, reason: collision with root package name */
    public float f7819a;

    public C0789o(float f4) {
        this.f7819a = f4;
    }

    @Override // l.AbstractC0792s
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f7819a;
        }
        return 0.0f;
    }

    @Override // l.AbstractC0792s
    public final int b() {
        return 1;
    }

    @Override // l.AbstractC0792s
    public final AbstractC0792s c() {
        return new C0789o(0.0f);
    }

    @Override // l.AbstractC0792s
    public final void d() {
        this.f7819a = 0.0f;
    }

    @Override // l.AbstractC0792s
    public final void e(float f4, int i2) {
        if (i2 == 0) {
            this.f7819a = f4;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0789o) && ((C0789o) obj).f7819a == this.f7819a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7819a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f7819a;
    }
}
