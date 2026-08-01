package n0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends CancellationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i3) {
        super("rememberCoroutineScope left the composition");
        switch (i3) {
            case 1:
                super("The coroutine scope left the composition");
                break;
            default:
                break;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(x0.i.f10235a);
        return this;
    }
}
