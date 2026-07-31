package ru.rustore.sdk.reactive.core;

import W1.h;
import W1.i;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class Dispatchers {
    private static final int CORE_POOL_SIZE = 3;
    private static final long KEEP_ALIVE_TIME_SEC = 10;

    @NotNull
    public static final Dispatchers INSTANCE = new Dispatchers();

    @NotNull
    private static final h scheduler$delegate = i.b(Dispatchers$scheduler$2.INSTANCE);

    @NotNull
    private static final h threadPool$delegate = i.b(Dispatchers$threadPool$2.INSTANCE);

    @NotNull
    private static final h mainDispatcher$delegate = i.b(Dispatchers$mainDispatcher$2.INSTANCE);

    @NotNull
    private static final h ioDispatcher$delegate = i.b(Dispatchers$ioDispatcher$2.INSTANCE);

    @NotNull
    private static final Dispatcher trampoline = TrampolineDispatcher.INSTANCE;

    private Dispatchers() {
    }

    private final Dispatcher getIoDispatcher() {
        return (Dispatcher) ioDispatcher$delegate.getValue();
    }

    private final Dispatcher getMainDispatcher() {
        return (Dispatcher) mainDispatcher$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledThreadPoolExecutor getScheduler() {
        return (ScheduledThreadPoolExecutor) scheduler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadPoolExecutor getThreadPool() {
        return (ThreadPoolExecutor) threadPool$delegate.getValue();
    }

    @NotNull
    public final Dispatcher getIo() {
        Dispatcher io2 = DispatchersPlugin.INSTANCE.getIo();
        return io2 == null ? getIoDispatcher() : io2;
    }

    @NotNull
    public final Dispatcher getMain() {
        Dispatcher main = DispatchersPlugin.INSTANCE.getMain();
        return main == null ? getMainDispatcher() : main;
    }

    @NotNull
    public final Dispatcher getTrampoline() {
        return trampoline;
    }
}
