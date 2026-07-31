package h0;

import H2.AbstractC0080b;

/* renamed from: h0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417A extends AbstractC0418B {

    /* renamed from: c, reason: collision with root package name */
    public final float f4865c;

    public C0417A(float f3) {
        super(3, false, false);
        this.f4865c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0417A) && Float.compare(this.f4865c, ((C0417A) obj).f4865c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4865c);
    }

    public final String toString() {
        return AbstractC0080b.j(new StringBuilder("VerticalTo(y="), this.f4865c, ')');
    }
}
