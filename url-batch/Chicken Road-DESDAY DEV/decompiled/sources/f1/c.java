package f1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // f1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f2254a == cVar.f2254a) {
                    if (this.f2255b == cVar.f2255b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // f1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2254a * 31) + this.f2255b;
    }

    @Override // f1.a
    public final boolean isEmpty() {
        return this.f2254a > this.f2255b;
    }

    @Override // f1.a
    public final String toString() {
        return this.f2254a + ".." + this.f2255b;
    }
}
