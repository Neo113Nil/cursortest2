package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class k extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5000c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5001d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5002e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5003f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5004g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5005h;

    public k(float f3, float f4, float f5, float f6, float f7, float f8) {
        super(2, true, false);
        this.f5000c = f3;
        this.f5001d = f4;
        this.f5002e = f5;
        this.f5003f = f6;
        this.f5004g = f7;
        this.f5005h = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f5000c, kVar.f5000c) == 0 && Float.compare(this.f5001d, kVar.f5001d) == 0 && Float.compare(this.f5002e, kVar.f5002e) == 0 && Float.compare(this.f5003f, kVar.f5003f) == 0 && Float.compare(this.f5004g, kVar.f5004g) == 0 && Float.compare(this.f5005h, kVar.f5005h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5005h) + AbstractC0080b.a(this.f5004g, AbstractC0080b.a(this.f5003f, AbstractC0080b.a(this.f5002e, AbstractC0080b.a(this.f5001d, Float.hashCode(this.f5000c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f5000c);
        sb.append(", y1=");
        sb.append(this.f5001d);
        sb.append(", x2=");
        sb.append(this.f5002e);
        sb.append(", y2=");
        sb.append(this.f5003f);
        sb.append(", x3=");
        sb.append(this.f5004g);
        sb.append(", y3=");
        return AbstractC0080b.j(sb, this.f5005h, ')');
    }
}
