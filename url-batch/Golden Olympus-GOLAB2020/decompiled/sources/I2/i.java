package I2;

/* loaded from: classes3.dex */
public class i extends IllegalStateException {

    /* renamed from: b, reason: collision with root package name */
    private Throwable f786b;

    public i(String str, Throwable th) {
        super(str);
        this.f786b = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f786b;
    }
}
