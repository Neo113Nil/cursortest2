package e7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2879a;

    public j(Throwable th) {
        this.f2879a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return r6.k.a(this.f2879a, ((j) obj).f2879a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f2879a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // e7.k
    public final String toString() {
        return "Closed(" + this.f2879a + ')';
    }
}
