package f0;

import A.AbstractC0017m;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588i extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6407c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6408d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6409e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6410f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6411g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6412h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6413i;

    public C0588i(float f4, float f5, float f6, boolean z4, boolean z5, float f7, float f8) {
        super(3, false, false);
        this.f6407c = f4;
        this.f6408d = f5;
        this.f6409e = f6;
        this.f6410f = z4;
        this.f6411g = z5;
        this.f6412h = f7;
        this.f6413i = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0588i)) {
            return false;
        }
        C0588i c0588i = (C0588i) obj;
        return Float.compare(this.f6407c, c0588i.f6407c) == 0 && Float.compare(this.f6408d, c0588i.f6408d) == 0 && Float.compare(this.f6409e, c0588i.f6409e) == 0 && this.f6410f == c0588i.f6410f && this.f6411g == c0588i.f6411g && Float.compare(this.f6412h, c0588i.f6412h) == 0 && Float.compare(this.f6413i, c0588i.f6413i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6413i) + AbstractC0017m.a(this.f6412h, AbstractC0017m.d(AbstractC0017m.d(AbstractC0017m.a(this.f6409e, AbstractC0017m.a(this.f6408d, Float.hashCode(this.f6407c) * 31, 31), 31), 31, this.f6410f), 31, this.f6411g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f6407c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f6408d);
        sb.append(", theta=");
        sb.append(this.f6409e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f6410f);
        sb.append(", isPositiveArc=");
        sb.append(this.f6411g);
        sb.append(", arcStartX=");
        sb.append(this.f6412h);
        sb.append(", arcStartY=");
        return AbstractC0017m.k(sb, this.f6413i, ')');
    }
}
