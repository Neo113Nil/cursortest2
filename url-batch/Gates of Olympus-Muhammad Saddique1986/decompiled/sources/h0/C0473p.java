package h0;

/* renamed from: h0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473p extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6006c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6007d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6008e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6009f;

    public C0473p(float f3, float f4, float f5, float f6) {
        super(2, true, false);
        this.f6006c = f3;
        this.f6007d = f4;
        this.f6008e = f5;
        this.f6009f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0473p)) {
            return false;
        }
        C0473p c0473p = (C0473p) obj;
        return Float.compare(this.f6006c, c0473p.f6006c) == 0 && Float.compare(this.f6007d, c0473p.f6007d) == 0 && Float.compare(this.f6008e, c0473p.f6008e) == 0 && Float.compare(this.f6009f, c0473p.f6009f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6009f) + A.k.a(this.f6008e, A.k.a(this.f6007d, Float.hashCode(this.f6006c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f6006c);
        sb.append(", y1=");
        sb.append(this.f6007d);
        sb.append(", x2=");
        sb.append(this.f6008e);
        sb.append(", y2=");
        return A.k.i(sb, this.f6009f, ')');
    }
}
