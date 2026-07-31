package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class r extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5021c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5022d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5023e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5024f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5025g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5026h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5027i;

    public r(float f3, float f4, float f5, boolean z3, boolean z4, float f6, float f7) {
        super(3, false, false);
        this.f5021c = f3;
        this.f5022d = f4;
        this.f5023e = f5;
        this.f5024f = z3;
        this.f5025g = z4;
        this.f5026h = f6;
        this.f5027i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f5021c, rVar.f5021c) == 0 && Float.compare(this.f5022d, rVar.f5022d) == 0 && Float.compare(this.f5023e, rVar.f5023e) == 0 && this.f5024f == rVar.f5024f && this.f5025g == rVar.f5025g && Float.compare(this.f5026h, rVar.f5026h) == 0 && Float.compare(this.f5027i, rVar.f5027i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5027i) + AbstractC0080b.a(this.f5026h, AbstractC0080b.f(AbstractC0080b.f(AbstractC0080b.a(this.f5023e, AbstractC0080b.a(this.f5022d, Float.hashCode(this.f5021c) * 31, 31), 31), 31, this.f5024f), 31, this.f5025g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f5021c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f5022d);
        sb.append(", theta=");
        sb.append(this.f5023e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f5024f);
        sb.append(", isPositiveArc=");
        sb.append(this.f5025g);
        sb.append(", arcStartDx=");
        sb.append(this.f5026h);
        sb.append(", arcStartDy=");
        return AbstractC0080b.j(sb, this.f5027i, ')');
    }
}
