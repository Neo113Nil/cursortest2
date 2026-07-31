package h0;

/* renamed from: h0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470m extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5998c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5999d;

    public C0470m(float f3, float f4) {
        super(3, false, false);
        this.f5998c = f3;
        this.f5999d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0470m)) {
            return false;
        }
        C0470m c0470m = (C0470m) obj;
        return Float.compare(this.f5998c, c0470m.f5998c) == 0 && Float.compare(this.f5999d, c0470m.f5999d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5999d) + (Float.hashCode(this.f5998c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f5998c);
        sb.append(", y=");
        return A.k.i(sb, this.f5999d, ')');
    }
}
