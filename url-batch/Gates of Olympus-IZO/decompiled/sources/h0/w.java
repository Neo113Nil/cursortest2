package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class w extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5039c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5040d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5041e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5042f;

    public w(float f3, float f4, float f5, float f6) {
        super(1, false, true);
        this.f5039c = f3;
        this.f5040d = f4;
        this.f5041e = f5;
        this.f5042f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f5039c, wVar.f5039c) == 0 && Float.compare(this.f5040d, wVar.f5040d) == 0 && Float.compare(this.f5041e, wVar.f5041e) == 0 && Float.compare(this.f5042f, wVar.f5042f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5042f) + AbstractC0080b.a(this.f5041e, AbstractC0080b.a(this.f5040d, Float.hashCode(this.f5039c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f5039c);
        sb.append(", dy1=");
        sb.append(this.f5040d);
        sb.append(", dx2=");
        sb.append(this.f5041e);
        sb.append(", dy2=");
        return AbstractC0080b.j(sb, this.f5042f, ')');
    }
}
