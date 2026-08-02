package kotlinx.coroutines;

/* loaded from: classes3.dex */
public abstract class ThreadLocalEventLoop {
    public static final ThreadLocal ref = new ThreadLocal();

    public static EventLoop getEventLoop$kotlinx_coroutines_core() {
        ThreadLocal threadLocal = ref;
        EventLoop eventLoop = (EventLoop) threadLocal.get();
        if (eventLoop != null) {
            return eventLoop;
        }
        BlockingEventLoop blockingEventLoop = new BlockingEventLoop(Thread.currentThread());
        threadLocal.set(blockingEventLoop);
        return blockingEventLoop;
    }
}
