package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class m extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5007c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5008d;

    public m(float f3, float f4) {
        super(3, false, false);
        this.f5007c = f3;
        this.f5008d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f5007c, mVar.f5007c) == 0 && Float.compare(this.f5008d, mVar.f5008d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5008d) + (Float.hashCode(this.f5007c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f5007c);
        sb.append(", y=");
        return AbstractC0080b.j(sb, this.f5008d, ')');
    }
}
