package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class BlockingEventLoop extends EventLoopImplBase {
    public final Thread thread;

    public BlockingEventLoop(Thread thread) {
        this.thread = thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final Thread getThread() {
        return this.thread;
    }
}
