package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class u extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5035c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5036d;

    public u(float f3, float f4) {
        super(3, false, false);
        this.f5035c = f3;
        this.f5036d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f5035c, uVar.f5035c) == 0 && Float.compare(this.f5036d, uVar.f5036d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5036d) + (Float.hashCode(this.f5035c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f5035c);
        sb.append(", dy=");
        return AbstractC0080b.j(sb, this.f5036d, ')');
    }
}
