package f8;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class n implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public final g0 f3626f;

    public n(g0 g0Var) {
        r6.k.f(g0Var, "delegate");
        this.f3626f = g0Var;
    }

    @Override // f8.g0
    public final i0 a() {
        return this.f3626f.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3626f.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f3626f + ')';
    }
}
