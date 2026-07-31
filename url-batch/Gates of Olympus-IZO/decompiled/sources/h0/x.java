package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class x extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5043c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5044d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5045e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5046f;

    public x(float f3, float f4, float f5, float f6) {
        super(2, true, false);
        this.f5043c = f3;
        this.f5044d = f4;
        this.f5045e = f5;
        this.f5046f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f5043c, xVar.f5043c) == 0 && Float.compare(this.f5044d, xVar.f5044d) == 0 && Float.compare(this.f5045e, xVar.f5045e) == 0 && Float.compare(this.f5046f, xVar.f5046f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5046f) + AbstractC0080b.a(this.f5045e, AbstractC0080b.a(this.f5044d, Float.hashCode(this.f5043c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f5043c);
        sb.append(", dy1=");
        sb.append(this.f5044d);
        sb.append(", dx2=");
        sb.append(this.f5045e);
        sb.append(", dy2=");
        return AbstractC0080b.j(sb, this.f5046f, ')');
    }
}
