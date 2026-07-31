package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class y extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5047c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5048d;

    public y(float f3, float f4) {
        super(1, false, true);
        this.f5047c = f3;
        this.f5048d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f5047c, yVar.f5047c) == 0 && Float.compare(this.f5048d, yVar.f5048d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5048d) + (Float.hashCode(this.f5047c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f5047c);
        sb.append(", dy=");
        return AbstractC0080b.j(sb, this.f5048d, ')');
    }
}
