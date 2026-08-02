package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes9.dex */
public final class ThreadState extends JobNode {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _state$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadState.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public DisposableHandle cancelHandle;
    public final Thread targetThread = Thread.currentThread();

    public static void invalidState(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final void clearInterrupt() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _state$volatile$FU;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        invalidState(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                DisposableHandle disposableHandle = this.cancelHandle;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = _state$volatile$FU;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                invalidState(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.targetThread.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }
}
