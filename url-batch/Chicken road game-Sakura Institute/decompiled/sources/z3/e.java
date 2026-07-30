package z3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: f, reason: collision with root package name */
    public final int f10076f;

    /* renamed from: g, reason: collision with root package name */
    public final Throwable f10077g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i7, Throwable th) {
        super(th);
        r6.i.f("callbackName", i7);
        this.f10076f = i7;
        this.f10077g = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f10077g;
    }
}
