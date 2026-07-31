package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class v extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5037c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5038d;

    public v(float f3, float f4) {
        super(3, false, false);
        this.f5037c = f3;
        this.f5038d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f5037c, vVar.f5037c) == 0 && Float.compare(this.f5038d, vVar.f5038d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5038d) + (Float.hashCode(this.f5037c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f5037c);
        sb.append(", dy=");
        return AbstractC0080b.j(sb, this.f5038d, ')');
    }
}
