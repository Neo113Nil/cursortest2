package h0;

/* loaded from: classes.dex */
public final class y extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6038c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6039d;

    public y(float f3, float f4) {
        super(1, false, true);
        this.f6038c = f3;
        this.f6039d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f6038c, yVar.f6038c) == 0 && Float.compare(this.f6039d, yVar.f6039d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6039d) + (Float.hashCode(this.f6038c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f6038c);
        sb.append(", dy=");
        return A.k.i(sb, this.f6039d, ')');
    }
}
