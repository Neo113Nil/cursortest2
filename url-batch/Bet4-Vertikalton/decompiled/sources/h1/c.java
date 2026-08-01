package h1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // h1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f2517a == cVar.f2517a) {
                    if (this.f2518b == cVar.f2518b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // h1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2517a * 31) + this.f2518b;
    }

    @Override // h1.a
    public final boolean isEmpty() {
        return this.f2517a > this.f2518b;
    }

    @Override // h1.a
    public final String toString() {
        return this.f2517a + ".." + this.f2518b;
    }
}
