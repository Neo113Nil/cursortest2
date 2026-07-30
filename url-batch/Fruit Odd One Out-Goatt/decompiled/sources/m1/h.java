package m1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f875a;

    public h(Throwable th) {
        this.f875a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f875a.equals(((h) obj).f875a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f875a.hashCode();
    }

    @Override // m1.i
    public final String toString() {
        return "Closed(" + this.f875a + ')';
    }
}
