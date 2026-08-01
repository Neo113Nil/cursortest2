package j3;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends a {
    public static final c i = new c(1, 0, 1);

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f1977f == cVar.f1977f && this.f1978g == cVar.f1978g;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1977f * 31) + this.f1978g;
    }

    public final boolean isEmpty() {
        return this.f1977f > this.f1978g;
    }

    public final String toString() {
        return this.f1977f + ".." + this.f1978g;
    }
}
