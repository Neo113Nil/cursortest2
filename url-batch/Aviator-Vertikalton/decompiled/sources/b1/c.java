package b1;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f1644d = new c(1, 0, 1);

    @Override // b1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1637a == cVar.f1637a) {
                    if (this.f1638b == cVar.f1638b) {
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
        return (this.f1637a * 31) + this.f1638b;
    }

    @Override // b1.a
    public final boolean isEmpty() {
        return this.f1637a > this.f1638b;
    }

    @Override // b1.a
    public final String toString() {
        return this.f1637a + ".." + this.f1638b;
    }
}
