package d1;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i3) {
        super(str);
        this.f3317d = i3;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f3317d) {
            case 0:
                setStackTrace(z1.b.f10690a);
                break;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(w.a.f10000a);
                break;
        }
        return this;
    }
}
