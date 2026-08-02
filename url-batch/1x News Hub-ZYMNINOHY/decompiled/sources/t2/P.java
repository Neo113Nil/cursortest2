package t2;

/* loaded from: classes.dex */
public final class P implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final l2.l f10390a;

    public P(l2.l lVar) {
        this.f10390a = lVar;
    }

    @Override // t2.Q
    public final void c(Throwable th) {
        this.f10390a.invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f10390a.getClass().getSimpleName() + '@' + AbstractC1212w.c(this) + ']';
    }
}
