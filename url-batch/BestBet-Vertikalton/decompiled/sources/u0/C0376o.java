package u0;

/* renamed from: u0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376o extends AbstractC0377p {

    /* renamed from: a, reason: collision with root package name */
    public final float f4201a;

    public C0376o(float f2) {
        this.f4201a = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0376o) && Float.compare(this.f4201a, ((C0376o) obj).f4201a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4201a);
    }

    public final String toString() {
        return "Partial(multiplier=" + this.f4201a + ")";
    }
}
