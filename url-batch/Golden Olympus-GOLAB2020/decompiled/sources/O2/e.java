package O2;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private d f8940a;

    protected abstract d a();

    public synchronized d b() {
        try {
            if (this.f8940a == null) {
                this.f8940a = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8940a;
    }
}
