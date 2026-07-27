package f0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class w extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6454c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6455d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6456e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6457f;

    public w(float f4, float f5, float f6, float f7) {
        super(1, false, true);
        this.f6454c = f4;
        this.f6455d = f5;
        this.f6456e = f6;
        this.f6457f = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f6454c, wVar.f6454c) == 0 && Float.compare(this.f6455d, wVar.f6455d) == 0 && Float.compare(this.f6456e, wVar.f6456e) == 0 && Float.compare(this.f6457f, wVar.f6457f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6457f) + AbstractC0017m.a(this.f6456e, AbstractC0017m.a(this.f6455d, Float.hashCode(this.f6454c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f6454c);
        sb.append(", dy1=");
        sb.append(this.f6455d);
        sb.append(", dx2=");
        sb.append(this.f6456e);
        sb.append(", dy2=");
        return AbstractC0017m.k(sb, this.f6457f, ')');
    }
}
