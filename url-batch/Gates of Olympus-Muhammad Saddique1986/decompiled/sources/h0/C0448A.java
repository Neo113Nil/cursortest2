package h0;

/* renamed from: h0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448A extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5853c;

    public C0448A(float f3) {
        super(3, false, false);
        this.f5853c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0448A) && Float.compare(this.f5853c, ((C0448A) obj).f5853c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5853c);
    }

    public final String toString() {
        return A.k.i(new StringBuilder("VerticalTo(y="), this.f5853c, ')');
    }
}
