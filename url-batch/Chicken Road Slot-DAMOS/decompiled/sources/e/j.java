package e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3752a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3753b;

    public j(long j, Object obj) {
        this.f3752a = obj;
        this.f3753b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f3752a.equals(jVar.f3752a) && this.f3753b == jVar.f3753b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3753b) + (this.f3752a.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.f3752a + ", compositeKey=" + this.f3753b + ')';
    }
}
