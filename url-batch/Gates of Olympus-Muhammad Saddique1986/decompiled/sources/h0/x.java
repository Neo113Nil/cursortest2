package h0;

/* loaded from: classes.dex */
public final class x extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6034c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6035d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6036e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6037f;

    public x(float f3, float f4, float f5, float f6) {
        super(2, true, false);
        this.f6034c = f3;
        this.f6035d = f4;
        this.f6036e = f5;
        this.f6037f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f6034c, xVar.f6034c) == 0 && Float.compare(this.f6035d, xVar.f6035d) == 0 && Float.compare(this.f6036e, xVar.f6036e) == 0 && Float.compare(this.f6037f, xVar.f6037f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6037f) + A.k.a(this.f6036e, A.k.a(this.f6035d, Float.hashCode(this.f6034c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f6034c);
        sb.append(", dy1=");
        sb.append(this.f6035d);
        sb.append(", dx2=");
        sb.append(this.f6036e);
        sb.append(", dy2=");
        return A.k.i(sb, this.f6037f, ')');
    }
}
