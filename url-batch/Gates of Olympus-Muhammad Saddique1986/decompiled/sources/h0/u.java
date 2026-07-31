package h0;

/* loaded from: classes.dex */
public final class u extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6026c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6027d;

    public u(float f3, float f4) {
        super(3, false, false);
        this.f6026c = f3;
        this.f6027d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f6026c, uVar.f6026c) == 0 && Float.compare(this.f6027d, uVar.f6027d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6027d) + (Float.hashCode(this.f6026c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f6026c);
        sb.append(", dy=");
        return A.k.i(sb, this.f6027d, ')');
    }
}
