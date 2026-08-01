package i1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // i1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f2518a == cVar.f2518a) {
                    if (this.f2519b == cVar.f2519b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // i1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2518a * 31) + this.f2519b;
    }

    @Override // i1.a
    public final boolean isEmpty() {
        return this.f2518a > this.f2519b;
    }

    @Override // i1.a
    public final String toString() {
        return this.f2518a + ".." + this.f2519b;
    }
}
