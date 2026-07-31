package h0;

/* renamed from: h0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476s extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6019c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6020d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6021e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6022f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6023g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6024h;

    public C0476s(float f3, float f4, float f5, float f6, float f7, float f8) {
        super(2, true, false);
        this.f6019c = f3;
        this.f6020d = f4;
        this.f6021e = f5;
        this.f6022f = f6;
        this.f6023g = f7;
        this.f6024h = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0476s)) {
            return false;
        }
        C0476s c0476s = (C0476s) obj;
        return Float.compare(this.f6019c, c0476s.f6019c) == 0 && Float.compare(this.f6020d, c0476s.f6020d) == 0 && Float.compare(this.f6021e, c0476s.f6021e) == 0 && Float.compare(this.f6022f, c0476s.f6022f) == 0 && Float.compare(this.f6023g, c0476s.f6023g) == 0 && Float.compare(this.f6024h, c0476s.f6024h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6024h) + A.k.a(this.f6023g, A.k.a(this.f6022f, A.k.a(this.f6021e, A.k.a(this.f6020d, Float.hashCode(this.f6019c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f6019c);
        sb.append(", dy1=");
        sb.append(this.f6020d);
        sb.append(", dx2=");
        sb.append(this.f6021e);
        sb.append(", dy2=");
        sb.append(this.f6022f);
        sb.append(", dx3=");
        sb.append(this.f6023g);
        sb.append(", dy3=");
        return A.k.i(sb, this.f6024h, ')');
    }
}
