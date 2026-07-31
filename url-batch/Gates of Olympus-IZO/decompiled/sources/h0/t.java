package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class t extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5034c;

    public t(float f3) {
        super(3, false, false);
        this.f5034c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f5034c, ((t) obj).f5034c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5034c);
    }

    public final String toString() {
        return AbstractC0080b.j(new StringBuilder("RelativeHorizontalTo(dx="), this.f5034c, ')');
    }
}
