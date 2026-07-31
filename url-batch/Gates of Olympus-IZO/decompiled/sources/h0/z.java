package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class z extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5049c;

    public z(float f3) {
        super(3, false, false);
        this.f5049c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f5049c, ((z) obj).f5049c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5049c);
    }

    public final String toString() {
        return AbstractC0080b.j(new StringBuilder("RelativeVerticalTo(dy="), this.f5049c, ')');
    }
}
