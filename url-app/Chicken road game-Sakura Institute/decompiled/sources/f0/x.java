package f0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class x extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6458c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6459d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6460e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6461f;

    public x(float f4, float f5, float f6, float f7) {
        super(2, true, false);
        this.f6458c = f4;
        this.f6459d = f5;
        this.f6460e = f6;
        this.f6461f = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f6458c, xVar.f6458c) == 0 && Float.compare(this.f6459d, xVar.f6459d) == 0 && Float.compare(this.f6460e, xVar.f6460e) == 0 && Float.compare(this.f6461f, xVar.f6461f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6461f) + AbstractC0017m.a(this.f6460e, AbstractC0017m.a(this.f6459d, Float.hashCode(this.f6458c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f6458c);
        sb.append(", dy1=");
        sb.append(this.f6459d);
        sb.append(", dx2=");
        sb.append(this.f6460e);
        sb.append(", dy2=");
        return AbstractC0017m.k(sb, this.f6461f, ')');
    }
}
