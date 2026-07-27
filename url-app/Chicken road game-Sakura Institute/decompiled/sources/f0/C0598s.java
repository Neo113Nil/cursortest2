package f0;

import A.AbstractC0017m;

/* renamed from: f0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598s extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6443c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6444d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6445e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6446f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6447g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6448h;

    public C0598s(float f4, float f5, float f6, float f7, float f8, float f9) {
        super(2, true, false);
        this.f6443c = f4;
        this.f6444d = f5;
        this.f6445e = f6;
        this.f6446f = f7;
        this.f6447g = f8;
        this.f6448h = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0598s)) {
            return false;
        }
        C0598s c0598s = (C0598s) obj;
        return Float.compare(this.f6443c, c0598s.f6443c) == 0 && Float.compare(this.f6444d, c0598s.f6444d) == 0 && Float.compare(this.f6445e, c0598s.f6445e) == 0 && Float.compare(this.f6446f, c0598s.f6446f) == 0 && Float.compare(this.f6447g, c0598s.f6447g) == 0 && Float.compare(this.f6448h, c0598s.f6448h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6448h) + AbstractC0017m.a(this.f6447g, AbstractC0017m.a(this.f6446f, AbstractC0017m.a(this.f6445e, AbstractC0017m.a(this.f6444d, Float.hashCode(this.f6443c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f6443c);
        sb.append(", dy1=");
        sb.append(this.f6444d);
        sb.append(", dx2=");
        sb.append(this.f6445e);
        sb.append(", dy2=");
        sb.append(this.f6446f);
        sb.append(", dx3=");
        sb.append(this.f6447g);
        sb.append(", dy3=");
        return AbstractC0017m.k(sb, this.f6448h, ')');
    }
}
