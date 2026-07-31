package h0;

/* loaded from: classes.dex */
public final class v extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6028c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6029d;

    public v(float f3, float f4) {
        super(3, false, false);
        this.f6028c = f3;
        this.f6029d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f6028c, vVar.f6028c) == 0 && Float.compare(this.f6029d, vVar.f6029d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6029d) + (Float.hashCode(this.f6028c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f6028c);
        sb.append(", dy=");
        return A.k.i(sb, this.f6029d, ')');
    }
}
