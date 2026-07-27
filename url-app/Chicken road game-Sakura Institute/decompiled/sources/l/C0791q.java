package l;

import A.AbstractC0017m;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791q extends AbstractC0792s {

    /* renamed from: a, reason: collision with root package name */
    public float f7829a;

    /* renamed from: b, reason: collision with root package name */
    public float f7830b;

    /* renamed from: c, reason: collision with root package name */
    public float f7831c;

    public C0791q(float f4, float f5, float f6) {
        this.f7829a = f4;
        this.f7830b = f5;
        this.f7831c = f6;
    }

    @Override // l.AbstractC0792s
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f7829a;
        }
        if (i2 == 1) {
            return this.f7830b;
        }
        if (i2 != 2) {
            return 0.0f;
        }
        return this.f7831c;
    }

    @Override // l.AbstractC0792s
    public final int b() {
        return 3;
    }

    @Override // l.AbstractC0792s
    public final AbstractC0792s c() {
        return new C0791q(0.0f, 0.0f, 0.0f);
    }

    @Override // l.AbstractC0792s
    public final void d() {
        this.f7829a = 0.0f;
        this.f7830b = 0.0f;
        this.f7831c = 0.0f;
    }

    @Override // l.AbstractC0792s
    public final void e(float f4, int i2) {
        if (i2 == 0) {
            this.f7829a = f4;
        } else if (i2 == 1) {
            this.f7830b = f4;
        } else {
            if (i2 != 2) {
                return;
            }
            this.f7831c = f4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0791q) {
            C0791q c0791q = (C0791q) obj;
            if (c0791q.f7829a == this.f7829a && c0791q.f7830b == this.f7830b && c0791q.f7831c == this.f7831c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7831c) + AbstractC0017m.a(this.f7830b, Float.hashCode(this.f7829a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f7829a + ", v2 = " + this.f7830b + ", v3 = " + this.f7831c;
    }
}
