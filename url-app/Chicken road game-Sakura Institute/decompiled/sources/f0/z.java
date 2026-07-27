package f0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class z extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6464c;

    public z(float f4) {
        super(3, false, false);
        this.f6464c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f6464c, ((z) obj).f6464c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6464c);
    }

    public final String toString() {
        return AbstractC0017m.k(new StringBuilder("RelativeVerticalTo(dy="), this.f6464c, ')');
    }
}
