package a7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends UnsupportedOperationException {

    /* renamed from: d, reason: collision with root package name */
    public final z6.d f336d;

    public n(z6.d dVar) {
        this.f336d = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f336d));
    }
}
