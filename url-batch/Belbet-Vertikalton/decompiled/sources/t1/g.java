package t1;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4200a;

    public g(Throwable th) {
        this.f4200a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (j1.h.a(this.f4200a, ((g) obj).f4200a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f4200a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // t1.h
    public final String toString() {
        return "Closed(" + this.f4200a + ')';
    }
}
