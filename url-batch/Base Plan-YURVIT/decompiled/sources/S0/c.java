package S0;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f823e == cVar.f823e && this.f824f == cVar.f824f;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f823e * 31) + this.f824f;
    }

    public final boolean isEmpty() {
        return this.f823e > this.f824f;
    }

    public final String toString() {
        return this.f823e + ".." + this.f824f;
    }
}
