package O0;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f741a;

    public g(Throwable th) {
        this.f741a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (F0.i.a(this.f741a, ((g) obj).f741a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f741a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // O0.h
    public final String toString() {
        return "Closed(" + this.f741a + ')';
    }
}
