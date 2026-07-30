package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: a, reason: collision with root package name */
    public float f5598a;

    /* renamed from: b, reason: collision with root package name */
    public float f5599b;

    /* renamed from: c, reason: collision with root package name */
    public float f5600c;

    /* renamed from: d, reason: collision with root package name */
    public float f5601d;

    public p(float f9, float f10, float f11, float f12) {
        this.f5598a = f9;
        this.f5599b = f10;
        this.f5600c = f11;
        this.f5601d = f12;
    }

    @Override // l.q
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f5598a;
        }
        if (i7 == 1) {
            return this.f5599b;
        }
        if (i7 == 2) {
            return this.f5600c;
        }
        if (i7 != 3) {
            return 0.0f;
        }
        return this.f5601d;
    }

    @Override // l.q
    public final int b() {
        return 4;
    }

    @Override // l.q
    public final q c() {
        return new p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // l.q
    public final void d() {
        this.f5598a = 0.0f;
        this.f5599b = 0.0f;
        this.f5600c = 0.0f;
        this.f5601d = 0.0f;
    }

    @Override // l.q
    public final void e(float f9, int i7) {
        if (i7 == 0) {
            this.f5598a = f9;
            return;
        }
        if (i7 == 1) {
            this.f5599b = f9;
        } else if (i7 == 2) {
            this.f5600c = f9;
        } else {
            if (i7 != 3) {
                return;
            }
            this.f5601d = f9;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f5598a == this.f5598a && pVar.f5599b == this.f5599b && pVar.f5600c == this.f5600c && pVar.f5601d == this.f5601d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5601d) + a0.m.a(this.f5600c, a0.m.a(this.f5599b, Float.hashCode(this.f5598a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f5598a + ", v2 = " + this.f5599b + ", v3 = " + this.f5600c + ", v4 = " + this.f5601d;
    }
}
