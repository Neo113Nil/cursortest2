package o1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // o1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f3595a == cVar.f3595a) {
                    if (this.f3596b == cVar.f3596b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // o1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3595a * 31) + this.f3596b;
    }

    @Override // o1.a
    public final boolean isEmpty() {
        return this.f3595a > this.f3596b;
    }

    @Override // o1.a
    public final String toString() {
        return this.f3595a + ".." + this.f3596b;
    }
}
