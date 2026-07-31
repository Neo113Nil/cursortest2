package c7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1798a;

    public h(Throwable th) {
        this.f1798a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return q6.i.a(this.f1798a, ((h) obj).f1798a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f1798a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // c7.i
    public final String toString() {
        return "Closed(" + this.f1798a + ')';
    }
}
