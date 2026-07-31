package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class q extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5019c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5020d;

    public q(float f3, float f4) {
        super(1, false, true);
        this.f5019c = f3;
        this.f5020d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f5019c, qVar.f5019c) == 0 && Float.compare(this.f5020d, qVar.f5020d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5020d) + (Float.hashCode(this.f5019c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f5019c);
        sb.append(", y=");
        return AbstractC0080b.j(sb, this.f5020d, ')');
    }
}
