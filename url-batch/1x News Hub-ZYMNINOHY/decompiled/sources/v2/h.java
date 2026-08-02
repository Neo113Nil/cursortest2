package v2;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f10608a;

    public h(Throwable th) {
        this.f10608a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.j.a(this.f10608a, ((h) obj).f10608a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f10608a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // v2.i
    public final String toString() {
        return "Closed(" + this.f10608a + ')';
    }
}
