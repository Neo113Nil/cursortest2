package b1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f990d;

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f990d) {
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                synchronized (this) {
                    setStackTrace(new StackTraceElement[0]);
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, int i3) {
        super(str);
        this.f990d = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, Throwable th, int i3) {
        super(str, th);
        this.f990d = i3;
    }
}
