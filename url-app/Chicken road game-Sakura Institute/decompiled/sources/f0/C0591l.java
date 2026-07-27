package f0;

import A.AbstractC0017m;

/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591l extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6421c;

    public C0591l(float f4) {
        super(3, false, false);
        this.f6421c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0591l) && Float.compare(this.f6421c, ((C0591l) obj).f6421c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6421c);
    }

    public final String toString() {
        return AbstractC0017m.k(new StringBuilder("HorizontalTo(x="), this.f6421c, ')');
    }
}
