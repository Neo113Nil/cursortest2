package h0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class l extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5006c;

    public l(float f3) {
        super(3, false, false);
        this.f5006c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f5006c, ((l) obj).f5006c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5006c);
    }

    public final String toString() {
        return AbstractC0080b.j(new StringBuilder("HorizontalTo(x="), this.f5006c, ')');
    }
}
