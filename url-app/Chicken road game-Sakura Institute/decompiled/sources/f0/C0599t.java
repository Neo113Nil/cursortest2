package f0;

import A.AbstractC0017m;

/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599t extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6449c;

    public C0599t(float f4) {
        super(3, false, false);
        this.f6449c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0599t) && Float.compare(this.f6449c, ((C0599t) obj).f6449c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6449c);
    }

    public final String toString() {
        return AbstractC0017m.k(new StringBuilder("RelativeHorizontalTo(dx="), this.f6449c, ')');
    }
}
