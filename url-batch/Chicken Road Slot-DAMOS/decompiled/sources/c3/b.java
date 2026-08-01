package c3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i3) {
        super(str);
        this.f1715d = i3;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f1715d) {
            case 0:
                synchronized (this) {
                }
                return this;
            case 1:
                synchronized (this) {
                }
                return this;
            case 2:
                synchronized (this) {
                }
                return this;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
