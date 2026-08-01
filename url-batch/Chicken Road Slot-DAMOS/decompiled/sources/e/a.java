package e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3734a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3735b;

    public a(long j, Object obj) {
        this.f3734a = obj;
        this.f3735b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3734a.equals(aVar.f3734a) && this.f3735b == aVar.f3735b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3735b) + (this.f3734a.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f3734a + ", compositeKey=" + this.f3735b + ')';
    }
}
