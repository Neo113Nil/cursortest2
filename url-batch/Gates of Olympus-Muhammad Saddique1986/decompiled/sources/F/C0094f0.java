package F;

/* renamed from: F.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094f0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1533a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1534b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1535c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1536d;

    public C0094f0(float f3, float f4, float f5, float f6) {
        this.f1533a = f3;
        this.f1534b = f4;
        this.f1535c = f5;
        this.f1536d = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0094f0)) {
            return false;
        }
        C0094f0 c0094f0 = (C0094f0) obj;
        if (O0.e.a(this.f1533a, c0094f0.f1533a) && O0.e.a(this.f1534b, c0094f0.f1534b) && O0.e.a(this.f1535c, c0094f0.f1535c)) {
            return O0.e.a(this.f1536d, c0094f0.f1536d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1536d) + A.k.a(this.f1535c, A.k.a(this.f1534b, Float.hashCode(this.f1533a) * 31, 31), 31);
    }
}
