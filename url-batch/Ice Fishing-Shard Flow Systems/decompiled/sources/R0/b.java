package R0;

/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i2) {
        super(str);
        this.f2374d = i2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i2 = this.f2374d;
        synchronized (this) {
            switch (i2) {
            }
            return this;
        }
    }
}
