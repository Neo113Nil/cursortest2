package l;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class r extends AbstractC0792s {

    /* renamed from: a, reason: collision with root package name */
    public float f7834a;

    /* renamed from: b, reason: collision with root package name */
    public float f7835b;

    /* renamed from: c, reason: collision with root package name */
    public float f7836c;

    /* renamed from: d, reason: collision with root package name */
    public float f7837d;

    public r(float f4, float f5, float f6, float f7) {
        this.f7834a = f4;
        this.f7835b = f5;
        this.f7836c = f6;
        this.f7837d = f7;
    }

    @Override // l.AbstractC0792s
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f7834a;
        }
        if (i2 == 1) {
            return this.f7835b;
        }
        if (i2 == 2) {
            return this.f7836c;
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return this.f7837d;
    }

    @Override // l.AbstractC0792s
    public final int b() {
        return 4;
    }

    @Override // l.AbstractC0792s
    public final AbstractC0792s c() {
        return new r(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // l.AbstractC0792s
    public final void d() {
        this.f7834a = 0.0f;
        this.f7835b = 0.0f;
        this.f7836c = 0.0f;
        this.f7837d = 0.0f;
    }

    @Override // l.AbstractC0792s
    public final void e(float f4, int i2) {
        if (i2 == 0) {
            this.f7834a = f4;
            return;
        }
        if (i2 == 1) {
            this.f7835b = f4;
        } else if (i2 == 2) {
            this.f7836c = f4;
        } else {
            if (i2 != 3) {
                return;
            }
            this.f7837d = f4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.f7834a == this.f7834a && rVar.f7835b == this.f7835b && rVar.f7836c == this.f7836c && rVar.f7837d == this.f7837d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7837d) + AbstractC0017m.a(this.f7836c, AbstractC0017m.a(this.f7835b, Float.hashCode(this.f7834a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f7834a + ", v2 = " + this.f7835b + ", v3 = " + this.f7836c + ", v4 = " + this.f7837d;
    }
}
