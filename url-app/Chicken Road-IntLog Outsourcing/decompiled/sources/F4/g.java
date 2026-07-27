package F4;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f728a;

    public g(Throwable th) {
        this.f728a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (kotlin.jvm.internal.i.a(this.f728a, ((g) obj).f728a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f728a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // F4.h
    public final String toString() {
        return "Closed(" + this.f728a + ')';
    }
}
