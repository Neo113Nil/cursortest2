package A1;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final int f206d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i3, Throwable th) {
        super(th);
        A.k.s("callbackName", i3);
        this.f206d = i3;
        this.f207e = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f207e;
    }
}
