package f0;

import A.AbstractC0017m;

/* renamed from: f0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597r extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6436c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6437d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6438e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6439f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6440g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6441h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6442i;

    public C0597r(float f4, float f5, float f6, boolean z4, boolean z5, float f7, float f8) {
        super(3, false, false);
        this.f6436c = f4;
        this.f6437d = f5;
        this.f6438e = f6;
        this.f6439f = z4;
        this.f6440g = z5;
        this.f6441h = f7;
        this.f6442i = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0597r)) {
            return false;
        }
        C0597r c0597r = (C0597r) obj;
        return Float.compare(this.f6436c, c0597r.f6436c) == 0 && Float.compare(this.f6437d, c0597r.f6437d) == 0 && Float.compare(this.f6438e, c0597r.f6438e) == 0 && this.f6439f == c0597r.f6439f && this.f6440g == c0597r.f6440g && Float.compare(this.f6441h, c0597r.f6441h) == 0 && Float.compare(this.f6442i, c0597r.f6442i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6442i) + AbstractC0017m.a(this.f6441h, AbstractC0017m.d(AbstractC0017m.d(AbstractC0017m.a(this.f6438e, AbstractC0017m.a(this.f6437d, Float.hashCode(this.f6436c) * 31, 31), 31), 31, this.f6439f), 31, this.f6440g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f6436c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f6437d);
        sb.append(", theta=");
        sb.append(this.f6438e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f6439f);
        sb.append(", isPositiveArc=");
        sb.append(this.f6440g);
        sb.append(", arcStartDx=");
        sb.append(this.f6441h);
        sb.append(", arcStartDy=");
        return AbstractC0017m.k(sb, this.f6442i, ')');
    }
}
