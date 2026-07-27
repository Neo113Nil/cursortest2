package f0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class v extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6452c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6453d;

    public v(float f4, float f5) {
        super(3, false, false);
        this.f6452c = f4;
        this.f6453d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f6452c, vVar.f6452c) == 0 && Float.compare(this.f6453d, vVar.f6453d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6453d) + (Float.hashCode(this.f6452c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f6452c);
        sb.append(", dy=");
        return AbstractC0017m.k(sb, this.f6453d, ')');
    }
}
