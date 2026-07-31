package m2;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5972a;

    public j(Throwable th) {
        this.f5972a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Z1.i.a(this.f5972a, ((j) obj).f5972a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f5972a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // m2.k
    public final String toString() {
        return "Closed(" + this.f5972a + ')';
    }
}
