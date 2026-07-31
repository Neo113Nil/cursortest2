package h0;

/* renamed from: h0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472o extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6002c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6003d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6004e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6005f;

    public C0472o(float f3, float f4, float f5, float f6) {
        super(1, false, true);
        this.f6002c = f3;
        this.f6003d = f4;
        this.f6004e = f5;
        this.f6005f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0472o)) {
            return false;
        }
        C0472o c0472o = (C0472o) obj;
        return Float.compare(this.f6002c, c0472o.f6002c) == 0 && Float.compare(this.f6003d, c0472o.f6003d) == 0 && Float.compare(this.f6004e, c0472o.f6004e) == 0 && Float.compare(this.f6005f, c0472o.f6005f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6005f) + A.k.a(this.f6004e, A.k.a(this.f6003d, Float.hashCode(this.f6002c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f6002c);
        sb.append(", y1=");
        sb.append(this.f6003d);
        sb.append(", x2=");
        sb.append(this.f6004e);
        sb.append(", y2=");
        return A.k.i(sb, this.f6005f, ')');
    }
}
