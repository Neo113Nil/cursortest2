package f0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class y extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6462c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6463d;

    public y(float f4, float f5) {
        super(1, false, true);
        this.f6462c = f4;
        this.f6463d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f6462c, yVar.f6462c) == 0 && Float.compare(this.f6463d, yVar.f6463d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6463d) + (Float.hashCode(this.f6462c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f6462c);
        sb.append(", dy=");
        return AbstractC0017m.k(sb, this.f6463d, ')');
    }
}
