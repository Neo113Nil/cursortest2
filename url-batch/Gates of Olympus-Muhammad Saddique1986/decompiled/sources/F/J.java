package F;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final float f1197a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1198b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1199c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1200d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1201e;

    public J(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f1197a = f3;
        this.f1198b = f4;
        this.f1199c = f5;
        this.f1200d = f6;
        this.f1201e = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J)) {
            return false;
        }
        J j3 = (J) obj;
        return O0.e.a(this.f1197a, j3.f1197a) && O0.e.a(this.f1198b, j3.f1198b) && O0.e.a(this.f1199c, j3.f1199c) && O0.e.a(this.f1200d, j3.f1200d) && O0.e.a(this.f1201e, j3.f1201e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1201e) + A.k.a(this.f1200d, A.k.a(this.f1199c, A.k.a(this.f1198b, Float.hashCode(this.f1197a) * 31, 31), 31), 31);
    }
}
