package J7;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: w, reason: collision with root package name */
    public static final c f1471w = new c(1, 0, 1);

    @Override // J7.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        if (this.f1464n == cVar.f1464n) {
            return this.f1465u == cVar.f1465u;
        }
        return false;
    }

    @Override // J7.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1464n * 31) + this.f1465u;
    }

    @Override // J7.a
    public final boolean isEmpty() {
        return this.f1464n > this.f1465u;
    }

    @Override // J7.a
    public final String toString() {
        return this.f1464n + ".." + this.f1465u;
    }
}
