package z3;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f16328a;

    public h(Throwable th) {
        this.f16328a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.i.a(this.f16328a, ((h) obj).f16328a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f16328a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // z3.i
    public final String toString() {
        return "Closed(" + this.f16328a + ')';
    }
}
