package h0;

import H2.AbstractC0080b;

/* renamed from: h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428i extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f4992c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4993d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4994e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4995f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4996g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4997h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4998i;

    public C0428i(float f3, float f4, float f5, boolean z3, boolean z4, float f6, float f7) {
        super(3, false, false);
        this.f4992c = f3;
        this.f4993d = f4;
        this.f4994e = f5;
        this.f4995f = z3;
        this.f4996g = z4;
        this.f4997h = f6;
        this.f4998i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0428i)) {
            return false;
        }
        C0428i c0428i = (C0428i) obj;
        return Float.compare(this.f4992c, c0428i.f4992c) == 0 && Float.compare(this.f4993d, c0428i.f4993d) == 0 && Float.compare(this.f4994e, c0428i.f4994e) == 0 && this.f4995f == c0428i.f4995f && this.f4996g == c0428i.f4996g && Float.compare(this.f4997h, c0428i.f4997h) == 0 && Float.compare(this.f4998i, c0428i.f4998i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4998i) + AbstractC0080b.a(this.f4997h, AbstractC0080b.f(AbstractC0080b.f(AbstractC0080b.a(this.f4994e, AbstractC0080b.a(this.f4993d, Float.hashCode(this.f4992c) * 31, 31), 31), 31, this.f4995f), 31, this.f4996g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f4992c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f4993d);
        sb.append(", theta=");
        sb.append(this.f4994e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f4995f);
        sb.append(", isPositiveArc=");
        sb.append(this.f4996g);
        sb.append(", arcStartX=");
        sb.append(this.f4997h);
        sb.append(", arcStartY=");
        return AbstractC0080b.j(sb, this.f4998i, ')');
    }
}
