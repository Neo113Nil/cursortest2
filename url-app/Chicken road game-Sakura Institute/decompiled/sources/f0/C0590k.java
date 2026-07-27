package f0;

import A.AbstractC0017m;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590k extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6415c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6416d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6417e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6418f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6419g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6420h;

    public C0590k(float f4, float f5, float f6, float f7, float f8, float f9) {
        super(2, true, false);
        this.f6415c = f4;
        this.f6416d = f5;
        this.f6417e = f6;
        this.f6418f = f7;
        this.f6419g = f8;
        this.f6420h = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0590k)) {
            return false;
        }
        C0590k c0590k = (C0590k) obj;
        return Float.compare(this.f6415c, c0590k.f6415c) == 0 && Float.compare(this.f6416d, c0590k.f6416d) == 0 && Float.compare(this.f6417e, c0590k.f6417e) == 0 && Float.compare(this.f6418f, c0590k.f6418f) == 0 && Float.compare(this.f6419g, c0590k.f6419g) == 0 && Float.compare(this.f6420h, c0590k.f6420h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6420h) + AbstractC0017m.a(this.f6419g, AbstractC0017m.a(this.f6418f, AbstractC0017m.a(this.f6417e, AbstractC0017m.a(this.f6416d, Float.hashCode(this.f6415c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f6415c);
        sb.append(", y1=");
        sb.append(this.f6416d);
        sb.append(", x2=");
        sb.append(this.f6417e);
        sb.append(", y2=");
        sb.append(this.f6418f);
        sb.append(", x3=");
        sb.append(this.f6419g);
        sb.append(", y3=");
        return AbstractC0017m.k(sb, this.f6420h, ')');
    }
}
