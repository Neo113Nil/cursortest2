package p2;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f10225d = new c(1, 0, 1);

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        if (this.f10218a == cVar.f10218a) {
            return this.f10219b == cVar.f10219b;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f10218a * 31) + this.f10219b;
    }

    public final boolean isEmpty() {
        return this.f10218a > this.f10219b;
    }

    public final String toString() {
        return this.f10218a + ".." + this.f10219b;
    }
}
