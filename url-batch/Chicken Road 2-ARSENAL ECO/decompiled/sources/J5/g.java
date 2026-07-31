package J5;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1327a;

    public g(Throwable th) {
        this.f1327a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.i.a(this.f1327a, ((g) obj).f1327a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f1327a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // J5.h
    public final String toString() {
        return "Closed(" + this.f1327a + ')';
    }
}
