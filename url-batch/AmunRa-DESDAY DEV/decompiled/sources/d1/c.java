package d1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // d1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1982a == cVar.f1982a) {
                    if (this.f1983b == cVar.f1983b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // d1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1982a * 31) + this.f1983b;
    }

    @Override // d1.a
    public final boolean isEmpty() {
        return this.f1982a > this.f1983b;
    }

    @Override // d1.a
    public final String toString() {
        return this.f1982a + ".." + this.f1983b;
    }
}
