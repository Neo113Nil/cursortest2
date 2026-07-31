package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class p extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5015c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5016d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5017e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5018f;

    public p(float f3, float f4, float f5, float f6) {
        super(2, true, false);
        this.f5015c = f3;
        this.f5016d = f4;
        this.f5017e = f5;
        this.f5018f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f5015c, pVar.f5015c) == 0 && Float.compare(this.f5016d, pVar.f5016d) == 0 && Float.compare(this.f5017e, pVar.f5017e) == 0 && Float.compare(this.f5018f, pVar.f5018f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5018f) + AbstractC0080b.a(this.f5017e, AbstractC0080b.a(this.f5016d, Float.hashCode(this.f5015c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f5015c);
        sb.append(", y1=");
        sb.append(this.f5016d);
        sb.append(", x2=");
        sb.append(this.f5017e);
        sb.append(", y2=");
        return AbstractC0080b.j(sb, this.f5018f, ')');
    }
}
