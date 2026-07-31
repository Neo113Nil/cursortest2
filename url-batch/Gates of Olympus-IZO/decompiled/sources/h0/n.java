package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class n extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5009c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5010d;

    public n(float f3, float f4) {
        super(3, false, false);
        this.f5009c = f3;
        this.f5010d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f5009c, nVar.f5009c) == 0 && Float.compare(this.f5010d, nVar.f5010d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5010d) + (Float.hashCode(this.f5009c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f5009c);
        sb.append(", y=");
        return AbstractC0080b.j(sb, this.f5010d, ')');
    }
}
