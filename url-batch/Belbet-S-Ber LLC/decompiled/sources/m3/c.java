package m3;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends a {
    public static final c i = new c(1, 0, 1);

    @Override // m3.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f2735f == cVar.f2735f && this.f2736g == cVar.f2736g;
    }

    @Override // m3.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2735f * 31) + this.f2736g;
    }

    @Override // m3.a
    public final boolean isEmpty() {
        return this.f2735f > this.f2736g;
    }

    @Override // m3.a
    public final String toString() {
        return this.f2735f + ".." + this.f2736g;
    }
}
