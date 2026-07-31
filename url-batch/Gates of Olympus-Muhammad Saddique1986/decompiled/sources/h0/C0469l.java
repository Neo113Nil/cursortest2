package h0;

/* renamed from: h0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469l extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f5997c;

    public C0469l(float f3) {
        super(3, false, false);
        this.f5997c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0469l) && Float.compare(this.f5997c, ((C0469l) obj).f5997c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5997c);
    }

    public final String toString() {
        return A.k.i(new StringBuilder("HorizontalTo(x="), this.f5997c, ')');
    }
}
