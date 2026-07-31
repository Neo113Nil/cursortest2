package h0;

/* renamed from: h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466i extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5983c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5984d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5985e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5986f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5987g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5988h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5989i;

    public C0466i(float f3, float f4, float f5, boolean z3, boolean z4, float f6, float f7) {
        super(3, false, false);
        this.f5983c = f3;
        this.f5984d = f4;
        this.f5985e = f5;
        this.f5986f = z3;
        this.f5987g = z4;
        this.f5988h = f6;
        this.f5989i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0466i)) {
            return false;
        }
        C0466i c0466i = (C0466i) obj;
        return Float.compare(this.f5983c, c0466i.f5983c) == 0 && Float.compare(this.f5984d, c0466i.f5984d) == 0 && Float.compare(this.f5985e, c0466i.f5985e) == 0 && this.f5986f == c0466i.f5986f && this.f5987g == c0466i.f5987g && Float.compare(this.f5988h, c0466i.f5988h) == 0 && Float.compare(this.f5989i, c0466i.f5989i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5989i) + A.k.a(this.f5988h, A.k.e(A.k.e(A.k.a(this.f5985e, A.k.a(this.f5984d, Float.hashCode(this.f5983c) * 31, 31), 31), 31, this.f5986f), 31, this.f5987g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f5983c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f5984d);
        sb.append(", theta=");
        sb.append(this.f5985e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f5986f);
        sb.append(", isPositiveArc=");
        sb.append(this.f5987g);
        sb.append(", arcStartX=");
        sb.append(this.f5988h);
        sb.append(", arcStartY=");
        return A.k.i(sb, this.f5989i, ')');
    }
}
