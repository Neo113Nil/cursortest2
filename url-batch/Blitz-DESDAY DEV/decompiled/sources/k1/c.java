package k1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // k1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f2838a == cVar.f2838a) {
                    if (this.f2839b == cVar.f2839b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // k1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2838a * 31) + this.f2839b;
    }

    @Override // k1.a
    public final boolean isEmpty() {
        return this.f2838a > this.f2839b;
    }

    @Override // k1.a
    public final String toString() {
        return this.f2838a + ".." + this.f2839b;
    }
}
