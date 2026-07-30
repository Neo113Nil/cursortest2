package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
final class j extends l {
    private final Future<?> future;

    public j(Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.l, kotlinx.coroutines.m, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.future + ']';
    }

    @Override // kotlinx.coroutines.m
    public void invoke(Throwable th) {
        if (th != null) {
            this.future.cancel(false);
        }
    }
}
