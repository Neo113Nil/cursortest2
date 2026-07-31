package s2;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f8410a;

    public l(Throwable th) {
        this.f8410a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (f2.j.a(this.f8410a, ((l) obj).f8410a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f8410a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // s2.m
    public final String toString() {
        return "Closed(" + this.f8410a + ')';
    }
}
