package h0;

/* loaded from: classes.dex */
public final class t extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6025c;

    public t(float f3) {
        super(3, false, false);
        this.f6025c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f6025c, ((t) obj).f6025c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6025c);
    }

    public final String toString() {
        return A.k.i(new StringBuilder("RelativeHorizontalTo(dx="), this.f6025c, ')');
    }
}
