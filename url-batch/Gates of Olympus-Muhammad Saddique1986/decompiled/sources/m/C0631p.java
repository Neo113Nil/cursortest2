package m;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631p extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f6865a;

    /* renamed from: b, reason: collision with root package name */
    public float f6866b;

    /* renamed from: c, reason: collision with root package name */
    public float f6867c;

    public C0631p(float f3, float f4, float f5) {
        this.f6865a = f3;
        this.f6866b = f4;
        this.f6867c = f5;
    }

    @Override // m.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f6865a;
        }
        if (i3 == 1) {
            return this.f6866b;
        }
        if (i3 != 2) {
            return 0.0f;
        }
        return this.f6867c;
    }

    @Override // m.r
    public final int b() {
        return 3;
    }

    @Override // m.r
    public final r c() {
        return new C0631p(0.0f, 0.0f, 0.0f);
    }

    @Override // m.r
    public final void d() {
        this.f6865a = 0.0f;
        this.f6866b = 0.0f;
        this.f6867c = 0.0f;
    }

    @Override // m.r
    public final void e(float f3, int i3) {
        if (i3 == 0) {
            this.f6865a = f3;
        } else if (i3 == 1) {
            this.f6866b = f3;
        } else {
            if (i3 != 2) {
                return;
            }
            this.f6867c = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0631p) {
            C0631p c0631p = (C0631p) obj;
            if (c0631p.f6865a == this.f6865a && c0631p.f6866b == this.f6866b && c0631p.f6867c == this.f6867c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6867c) + A.k.a(this.f6866b, Float.hashCode(this.f6865a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f6865a + ", v2 = " + this.f6866b + ", v3 = " + this.f6867c;
    }
}
