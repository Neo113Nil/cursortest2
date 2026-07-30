package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
final class k extends r1 {
    private final Future<?> future;

    public k(Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.d0
    public void invoke(Throwable th) {
        if (th != null) {
            this.future.cancel(false);
        }
    }
}
