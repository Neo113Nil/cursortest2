package d2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3405a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3406b;

    public e1(long j, long j3) {
        this.f3405a = j;
        this.f3406b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return x2.k.a(this.f3405a, e1Var.f3405a) && this.f3406b == e1Var.f3406b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3406b) + (Long.hashCode(this.f3405a) * 31);
    }
}
