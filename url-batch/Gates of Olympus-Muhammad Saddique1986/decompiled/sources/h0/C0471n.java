package h0;

/* renamed from: h0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471n extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6000c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6001d;

    public C0471n(float f3, float f4) {
        super(3, false, false);
        this.f6000c = f3;
        this.f6001d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0471n)) {
            return false;
        }
        C0471n c0471n = (C0471n) obj;
        return Float.compare(this.f6000c, c0471n.f6000c) == 0 && Float.compare(this.f6001d, c0471n.f6001d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6001d) + (Float.hashCode(this.f6000c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f6000c);
        sb.append(", y=");
        return A.k.i(sb, this.f6001d, ')');
    }
}
