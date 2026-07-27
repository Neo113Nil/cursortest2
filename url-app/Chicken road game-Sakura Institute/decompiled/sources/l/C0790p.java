package l;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790p extends AbstractC0792s {

    /* renamed from: a, reason: collision with root package name */
    public float f7823a;

    /* renamed from: b, reason: collision with root package name */
    public float f7824b;

    public C0790p(float f4, float f5) {
        this.f7823a = f4;
        this.f7824b = f5;
    }

    @Override // l.AbstractC0792s
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f7823a;
        }
        if (i2 != 1) {
            return 0.0f;
        }
        return this.f7824b;
    }

    @Override // l.AbstractC0792s
    public final int b() {
        return 2;
    }

    @Override // l.AbstractC0792s
    public final AbstractC0792s c() {
        return new C0790p(0.0f, 0.0f);
    }

    @Override // l.AbstractC0792s
    public final void d() {
        this.f7823a = 0.0f;
        this.f7824b = 0.0f;
    }

    @Override // l.AbstractC0792s
    public final void e(float f4, int i2) {
        if (i2 == 0) {
            this.f7823a = f4;
        } else {
            if (i2 != 1) {
                return;
            }
            this.f7824b = f4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0790p) {
            C0790p c0790p = (C0790p) obj;
            if (c0790p.f7823a == this.f7823a && c0790p.f7824b == this.f7824b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7824b) + (Float.hashCode(this.f7823a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f7823a + ", v2 = " + this.f7824b;
    }
}
