package h0;

/* renamed from: h0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475r extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6012c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6013d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6014e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6015f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6016g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6017h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6018i;

    public C0475r(float f3, float f4, float f5, boolean z3, boolean z4, float f6, float f7) {
        super(3, false, false);
        this.f6012c = f3;
        this.f6013d = f4;
        this.f6014e = f5;
        this.f6015f = z3;
        this.f6016g = z4;
        this.f6017h = f6;
        this.f6018i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0475r)) {
            return false;
        }
        C0475r c0475r = (C0475r) obj;
        return Float.compare(this.f6012c, c0475r.f6012c) == 0 && Float.compare(this.f6013d, c0475r.f6013d) == 0 && Float.compare(this.f6014e, c0475r.f6014e) == 0 && this.f6015f == c0475r.f6015f && this.f6016g == c0475r.f6016g && Float.compare(this.f6017h, c0475r.f6017h) == 0 && Float.compare(this.f6018i, c0475r.f6018i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6018i) + A.k.a(this.f6017h, A.k.e(A.k.e(A.k.a(this.f6014e, A.k.a(this.f6013d, Float.hashCode(this.f6012c) * 31, 31), 31), 31, this.f6015f), 31, this.f6016g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f6012c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f6013d);
        sb.append(", theta=");
        sb.append(this.f6014e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f6015f);
        sb.append(", isPositiveArc=");
        sb.append(this.f6016g);
        sb.append(", arcStartDx=");
        sb.append(this.f6017h);
        sb.append(", arcStartDy=");
        return A.k.i(sb, this.f6018i, ')');
    }
}
