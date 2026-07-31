package h0;

/* renamed from: h0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474q extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6010c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6011d;

    public C0474q(float f3, float f4) {
        super(1, false, true);
        this.f6010c = f3;
        this.f6011d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0474q)) {
            return false;
        }
        C0474q c0474q = (C0474q) obj;
        return Float.compare(this.f6010c, c0474q.f6010c) == 0 && Float.compare(this.f6011d, c0474q.f6011d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6011d) + (Float.hashCode(this.f6010c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f6010c);
        sb.append(", y=");
        return A.k.i(sb, this.f6011d, ')');
    }
}
