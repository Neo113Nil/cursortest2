package f0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class u extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6450c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6451d;

    public u(float f4, float f5) {
        super(3, false, false);
        this.f6450c = f4;
        this.f6451d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f6450c, uVar.f6450c) == 0 && Float.compare(this.f6451d, uVar.f6451d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6451d) + (Float.hashCode(this.f6450c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f6450c);
        sb.append(", dy=");
        return AbstractC0017m.k(sb, this.f6451d, ')');
    }
}
