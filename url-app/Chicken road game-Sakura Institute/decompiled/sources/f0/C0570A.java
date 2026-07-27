package f0;

import A.AbstractC0017m;

/* renamed from: f0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570A extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6277c;

    public C0570A(float f4) {
        super(3, false, false);
        this.f6277c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0570A) && Float.compare(this.f6277c, ((C0570A) obj).f6277c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6277c);
    }

    public final String toString() {
        return AbstractC0017m.k(new StringBuilder("VerticalTo(y="), this.f6277c, ')');
    }
}
