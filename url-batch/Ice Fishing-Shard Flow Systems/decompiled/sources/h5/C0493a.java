package h5;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493a extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f5282d;

    public C0493a(Throwable th) {
        super(th);
        this.f5282d = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5282d;
    }
}
