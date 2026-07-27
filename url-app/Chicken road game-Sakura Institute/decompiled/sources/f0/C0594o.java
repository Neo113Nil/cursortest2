package f0;

import A.AbstractC0017m;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594o extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6426c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6427d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6428e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6429f;

    public C0594o(float f4, float f5, float f6, float f7) {
        super(1, false, true);
        this.f6426c = f4;
        this.f6427d = f5;
        this.f6428e = f6;
        this.f6429f = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0594o)) {
            return false;
        }
        C0594o c0594o = (C0594o) obj;
        return Float.compare(this.f6426c, c0594o.f6426c) == 0 && Float.compare(this.f6427d, c0594o.f6427d) == 0 && Float.compare(this.f6428e, c0594o.f6428e) == 0 && Float.compare(this.f6429f, c0594o.f6429f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6429f) + AbstractC0017m.a(this.f6428e, AbstractC0017m.a(this.f6427d, Float.hashCode(this.f6426c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f6426c);
        sb.append(", y1=");
        sb.append(this.f6427d);
        sb.append(", x2=");
        sb.append(this.f6428e);
        sb.append(", y2=");
        return AbstractC0017m.k(sb, this.f6429f, ')');
    }
}
