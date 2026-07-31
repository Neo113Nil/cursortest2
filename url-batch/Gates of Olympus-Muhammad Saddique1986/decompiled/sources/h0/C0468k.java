package h0;

/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468k extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5991c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5992d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5993e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5994f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5995g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5996h;

    public C0468k(float f3, float f4, float f5, float f6, float f7, float f8) {
        super(2, true, false);
        this.f5991c = f3;
        this.f5992d = f4;
        this.f5993e = f5;
        this.f5994f = f6;
        this.f5995g = f7;
        this.f5996h = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0468k)) {
            return false;
        }
        C0468k c0468k = (C0468k) obj;
        return Float.compare(this.f5991c, c0468k.f5991c) == 0 && Float.compare(this.f5992d, c0468k.f5992d) == 0 && Float.compare(this.f5993e, c0468k.f5993e) == 0 && Float.compare(this.f5994f, c0468k.f5994f) == 0 && Float.compare(this.f5995g, c0468k.f5995g) == 0 && Float.compare(this.f5996h, c0468k.f5996h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5996h) + A.k.a(this.f5995g, A.k.a(this.f5994f, A.k.a(this.f5993e, A.k.a(this.f5992d, Float.hashCode(this.f5991c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f5991c);
        sb.append(", y1=");
        sb.append(this.f5992d);
        sb.append(", x2=");
        sb.append(this.f5993e);
        sb.append(", y2=");
        sb.append(this.f5994f);
        sb.append(", x3=");
        sb.append(this.f5995g);
        sb.append(", y3=");
        return A.k.i(sb, this.f5996h, ')');
    }
}
