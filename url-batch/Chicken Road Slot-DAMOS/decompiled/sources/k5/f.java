package k5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final g f5413d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f5414e;

    public f(g gVar, Throwable th) {
        super(th);
        this.f5413d = gVar;
        this.f5414e = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5414e;
    }
}
