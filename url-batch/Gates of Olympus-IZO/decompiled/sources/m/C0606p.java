package m;

import H2.AbstractC0080b;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606p extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f5827a;

    /* renamed from: b, reason: collision with root package name */
    public float f5828b;

    /* renamed from: c, reason: collision with root package name */
    public float f5829c;

    public C0606p(float f3, float f4, float f5) {
        this.f5827a = f3;
        this.f5828b = f4;
        this.f5829c = f5;
    }

    @Override // m.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f5827a;
        }
        if (i3 == 1) {
            return this.f5828b;
        }
        if (i3 != 2) {
            return 0.0f;
        }
        return this.f5829c;
    }

    @Override // m.r
    public final int b() {
        return 3;
    }

    @Override // m.r
    public final r c() {
        return new C0606p(0.0f, 0.0f, 0.0f);
    }

    @Override // m.r
    public final void d() {
        this.f5827a = 0.0f;
        this.f5828b = 0.0f;
        this.f5829c = 0.0f;
    }

    @Override // m.r
    public final void e(float f3, int i3) {
        if (i3 == 0) {
            this.f5827a = f3;
        } else if (i3 == 1) {
            this.f5828b = f3;
        } else {
            if (i3 != 2) {
                return;
            }
            this.f5829c = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0606p) {
            C0606p c0606p = (C0606p) obj;
            if (c0606p.f5827a == this.f5827a && c0606p.f5828b == this.f5828b && c0606p.f5829c == this.f5829c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5829c) + AbstractC0080b.a(this.f5828b, Float.hashCode(this.f5827a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f5827a + ", v2 = " + this.f5828b + ", v3 = " + this.f5829c;
    }
}
