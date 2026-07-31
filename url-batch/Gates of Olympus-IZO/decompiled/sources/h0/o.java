package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class o extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5011c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5012d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5013e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5014f;

    public o(float f3, float f4, float f5, float f6) {
        super(1, false, true);
        this.f5011c = f3;
        this.f5012d = f4;
        this.f5013e = f5;
        this.f5014f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f5011c, oVar.f5011c) == 0 && Float.compare(this.f5012d, oVar.f5012d) == 0 && Float.compare(this.f5013e, oVar.f5013e) == 0 && Float.compare(this.f5014f, oVar.f5014f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5014f) + AbstractC0080b.a(this.f5013e, AbstractC0080b.a(this.f5012d, Float.hashCode(this.f5011c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f5011c);
        sb.append(", y1=");
        sb.append(this.f5012d);
        sb.append(", x2=");
        sb.append(this.f5013e);
        sb.append(", y2=");
        return AbstractC0080b.j(sb, this.f5014f, ')');
    }
}
