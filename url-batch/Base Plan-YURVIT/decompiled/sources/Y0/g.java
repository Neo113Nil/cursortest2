package Y0;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1041a;

    public g(Throwable th) {
        this.f1041a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return P0.h.a(this.f1041a, ((g) obj).f1041a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f1041a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // Y0.h
    public final String toString() {
        return "Closed(" + this.f1041a + ')';
    }
}
