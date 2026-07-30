package r1;

/* loaded from: classes.dex */
public final class n extends UnsupportedOperationException {

    /* renamed from: d, reason: collision with root package name */
    public final q1.d f7458d;

    public n(q1.d dVar) {
        this.f7458d = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f7458d));
    }
}
