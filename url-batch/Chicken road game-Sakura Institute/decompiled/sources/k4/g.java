package k4;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends UnsupportedOperationException {

    /* renamed from: f, reason: collision with root package name */
    public final j4.d f5358f;

    public g(j4.d dVar) {
        this.f5358f = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f5358f));
    }
}
