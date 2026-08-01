package b1;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f1645d = new c(1, 0, 1);

    @Override // b1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1638a == cVar.f1638a) {
                    if (this.f1639b == cVar.f1639b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // b1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1638a * 31) + this.f1639b;
    }

    @Override // b1.a
    public final boolean isEmpty() {
        return this.f1638a > this.f1639b;
    }

    @Override // b1.a
    public final String toString() {
        return this.f1638a + ".." + this.f1639b;
    }
}
