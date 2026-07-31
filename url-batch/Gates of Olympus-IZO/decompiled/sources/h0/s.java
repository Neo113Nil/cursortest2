package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class s extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5028c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5029d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5030e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5031f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5032g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5033h;

    public s(float f3, float f4, float f5, float f6, float f7, float f8) {
        super(2, true, false);
        this.f5028c = f3;
        this.f5029d = f4;
        this.f5030e = f5;
        this.f5031f = f6;
        this.f5032g = f7;
        this.f5033h = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f5028c, sVar.f5028c) == 0 && Float.compare(this.f5029d, sVar.f5029d) == 0 && Float.compare(this.f5030e, sVar.f5030e) == 0 && Float.compare(this.f5031f, sVar.f5031f) == 0 && Float.compare(this.f5032g, sVar.f5032g) == 0 && Float.compare(this.f5033h, sVar.f5033h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5033h) + AbstractC0080b.a(this.f5032g, AbstractC0080b.a(this.f5031f, AbstractC0080b.a(this.f5030e, AbstractC0080b.a(this.f5029d, Float.hashCode(this.f5028c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f5028c);
        sb.append(", dy1=");
        sb.append(this.f5029d);
        sb.append(", dx2=");
        sb.append(this.f5030e);
        sb.append(", dy2=");
        sb.append(this.f5031f);
        sb.append(", dx3=");
        sb.append(this.f5032g);
        sb.append(", dy3=");
        return AbstractC0080b.j(sb, this.f5033h, ')');
    }
}
