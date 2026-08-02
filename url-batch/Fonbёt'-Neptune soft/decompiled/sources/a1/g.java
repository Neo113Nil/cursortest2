package a1;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1325a;

    public g(Throwable th) {
        this.f1325a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (Q0.h.a(this.f1325a, ((g) obj).f1325a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f1325a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // a1.h
    public final String toString() {
        return "Closed(" + this.f1325a + ')';
    }
}
