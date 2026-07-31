package r;

/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i7) {
        super(str);
        this.f5819f = i7;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i7 = this.f5819f;
        synchronized (this) {
            switch (i7) {
            }
            return this;
        }
    }
}
