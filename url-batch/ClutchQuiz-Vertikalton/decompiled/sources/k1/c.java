package k1;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f2818a == cVar.f2818a) {
                    if (this.f2819b == cVar.f2819b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2818a * 31) + this.f2819b;
    }

    public final boolean isEmpty() {
        return this.f2818a > this.f2819b;
    }

    public final String toString() {
        return this.f2818a + ".." + this.f2819b;
    }
}
