package F1;

/* loaded from: classes.dex */
public final class g extends UnsupportedOperationException {

    /* renamed from: d, reason: collision with root package name */
    public final E1.d f2636d;

    public g(E1.d dVar) {
        this.f2636d = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f2636d));
    }
}
