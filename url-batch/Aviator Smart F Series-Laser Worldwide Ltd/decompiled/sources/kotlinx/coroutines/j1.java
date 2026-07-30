package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
final class j1 extends m1 {
    private static final AtomicIntegerFieldUpdater _invoked$FU = AtomicIntegerFieldUpdater.newUpdater(j1.class, "_invoked");
    private volatile int _invoked;
    private final f6.l handler;

    public j1(f6.l lVar) {
        this.handler = lVar;
    }

    @Override // kotlinx.coroutines.m1, kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.d0
    public void invoke(Throwable th) {
        if (_invoked$FU.compareAndSet(this, 0, 1)) {
            this.handler.invoke(th);
        }
    }
}
