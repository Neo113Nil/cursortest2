package C5;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public static final c f235i = new c(1, 0, 1);

    @Override // C5.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f228f == cVar.f228f && this.f229g == cVar.f229g;
    }

    @Override // C5.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f228f * 31) + this.f229g;
    }

    @Override // C5.a
    public final boolean isEmpty() {
        return this.f228f > this.f229g;
    }

    @Override // C5.a
    public final String toString() {
        return this.f228f + ".." + this.f229g;
    }
}
