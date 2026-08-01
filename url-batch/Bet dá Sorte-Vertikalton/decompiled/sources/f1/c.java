package f1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // f1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f2296a == cVar.f2296a) {
                    if (this.f2297b == cVar.f2297b) {
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
        return (this.f2296a * 31) + this.f2297b;
    }

    @Override // f1.a
    public final boolean isEmpty() {
        return this.f2296a > this.f2297b;
    }

    @Override // f1.a
    public final String toString() {
        return this.f2296a + ".." + this.f2297b;
    }
}
