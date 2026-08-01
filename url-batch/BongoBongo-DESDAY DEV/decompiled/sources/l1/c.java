package l1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // l1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f2887a == cVar.f2887a) {
                    if (this.f2888b == cVar.f2888b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // l1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2887a * 31) + this.f2888b;
    }

    @Override // l1.a
    public final boolean isEmpty() {
        return this.f2887a > this.f2888b;
    }

    @Override // l1.a
    public final String toString() {
        return this.f2887a + ".." + this.f2888b;
    }
}
