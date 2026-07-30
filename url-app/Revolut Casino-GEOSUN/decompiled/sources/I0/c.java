package I0;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f409e == cVar.f409e) {
                    if (this.f410f == cVar.f410f) {
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
        return (this.f409e * 31) + this.f410f;
    }

    public final boolean isEmpty() {
        return this.f409e > this.f410f;
    }

    public final String toString() {
        return this.f409e + ".." + this.f410f;
    }
}
