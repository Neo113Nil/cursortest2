package S0;

/* loaded from: classes.dex */
public final class h extends UnsupportedOperationException {

    /* renamed from: f, reason: collision with root package name */
    public final R0.c f2205f;

    public h(R0.c cVar) {
        this.f2205f = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f2205f));
    }
}
