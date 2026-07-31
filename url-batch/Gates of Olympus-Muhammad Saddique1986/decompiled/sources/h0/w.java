package h0;

/* loaded from: classes.dex */
public final class w extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6030c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6031d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6032e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6033f;

    public w(float f3, float f4, float f5, float f6) {
        super(1, false, true);
        this.f6030c = f3;
        this.f6031d = f4;
        this.f6032e = f5;
        this.f6033f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f6030c, wVar.f6030c) == 0 && Float.compare(this.f6031d, wVar.f6031d) == 0 && Float.compare(this.f6032e, wVar.f6032e) == 0 && Float.compare(this.f6033f, wVar.f6033f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6033f) + A.k.a(this.f6032e, A.k.a(this.f6031d, Float.hashCode(this.f6030c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f6030c);
        sb.append(", dy1=");
        sb.append(this.f6031d);
        sb.append(", dx2=");
        sb.append(this.f6032e);
        sb.append(", dy2=");
        return A.k.i(sb, this.f6033f, ')');
    }
}
