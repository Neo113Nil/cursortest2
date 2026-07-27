package com.onesignal.common.threading;

import B4.l;
import D4.AbstractC0020u;
import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import D4.X;
import a.AbstractC0169a;
import b1.RunnableC0264a;
import com.onesignal.debug.internal.logging.Logging;
import f4.InterfaceC0428e;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class OneSignalDispatchers {
    public static final String BASE_THREAD_NAME = "OneSignal";
    private static final int DEFAULT_CORE_POOL_SIZE = 2;
    private static final int DEFAULT_MAX_POOL_SIZE = 3;
    private static final String DEFAULT_THREAD_NAME_PREFIX = "OneSignal-Default";
    private static final int IO_CORE_POOL_SIZE = 2;
    private static final int IO_MAX_POOL_SIZE = 3;
    private static final String IO_THREAD_NAME_PREFIX = "OneSignal-IO";
    private static final long KEEP_ALIVE_TIME_SECONDS = 30;
    private static final String NOT_INITIALIZED = "Not initialized";
    private static final int QUEUE_CAPACITY = 200;
    private static final String SERIAL_IO_THREAD_NAME = "OneSignal-SerialIO";
    private static final String UNKNOWN_ERROR = "Unknown error";
    private static volatile boolean prewarmStarted;
    public static final OneSignalDispatchers INSTANCE = new OneSignalDispatchers();
    private static final InterfaceC0428e ioExecutor$delegate = AbstractC0169a.A(OneSignalDispatchers$ioExecutor$2.INSTANCE);
    private static final InterfaceC0428e serialIOExecutor$delegate = AbstractC0169a.A(OneSignalDispatchers$serialIOExecutor$2.INSTANCE);
    private static final InterfaceC0428e defaultExecutor$delegate = AbstractC0169a.A(OneSignalDispatchers$defaultExecutor$2.INSTANCE);
    private static final InterfaceC0428e IO$delegate = AbstractC0169a.A(OneSignalDispatchers$IO$2.INSTANCE);
    private static final InterfaceC0428e Default$delegate = AbstractC0169a.A(OneSignalDispatchers$Default$2.INSTANCE);
    private static final InterfaceC0428e SerialIO$delegate = AbstractC0169a.A(OneSignalDispatchers$SerialIO$2.INSTANCE);
    private static final InterfaceC0428e IOScope$delegate = AbstractC0169a.A(OneSignalDispatchers$IOScope$2.INSTANCE);
    private static final InterfaceC0428e DefaultScope$delegate = AbstractC0169a.A(OneSignalDispatchers$DefaultScope$2.INSTANCE);
    private static final InterfaceC0428e SerialIOScope$delegate = AbstractC0169a.A(OneSignalDispatchers$SerialIOScope$2.INSTANCE);
    private static final Object prewarmLock = new Object();

    private OneSignalDispatchers() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadPoolExecutor getDefaultExecutor() {
        return (ThreadPoolExecutor) defaultExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0022w getDefaultScope() {
        return (InterfaceC0022w) DefaultScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0022w getIOScope() {
        return (InterfaceC0022w) IOScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadPoolExecutor getIoExecutor() {
        return (ThreadPoolExecutor) ioExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExecutorService getSerialIOExecutor() {
        Object value = serialIOExecutor$delegate.getValue();
        i.d(value, "getValue(...)");
        return (ExecutorService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0022w getSerialIOScope() {
        return (InterfaceC0022w) SerialIOScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prewarm$lambda$1() {
        try {
            OneSignalDispatchers oneSignalDispatchers = INSTANCE;
            oneSignalDispatchers.launchOnIO(new OneSignalDispatchers$prewarm$prewarmThread$1$1(null));
            oneSignalDispatchers.launchOnDefault(new OneSignalDispatchers$prewarm$prewarmThread$1$2(null));
            oneSignalDispatchers.launchOnSerialIO(new OneSignalDispatchers$prewarm$prewarmThread$1$3(null));
        } catch (Exception e3) {
            Logging.warn$default("OneSignalDispatchers.prewarm failed: " + e3.getMessage(), null, 2, null);
        }
    }

    public final String executorStatus$com_onesignal_core(String name, InterfaceC1430a isShutdown) {
        i.e(name, "name");
        i.e(isShutdown, "isShutdown");
        try {
            return ((Boolean) isShutdown.invoke()).booleanValue() ? "Shutdown" : "Active";
        } catch (Exception e3) {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(" Not initialized ");
            String message = e3.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            sb.append(message);
            return sb.toString();
        }
    }

    public final AbstractC0020u getDefault() {
        return (AbstractC0020u) Default$delegate.getValue();
    }

    public final AbstractC0020u getIO() {
        return (AbstractC0020u) IO$delegate.getValue();
    }

    public final String getPerformanceMetrics$com_onesignal_core() {
        String str;
        BlockingQueue<Runnable> queue;
        try {
            ExecutorService serialIOExecutor = getSerialIOExecutor();
            ThreadPoolExecutor threadPoolExecutor = serialIOExecutor instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) serialIOExecutor : null;
            if (threadPoolExecutor == null || (queue = threadPoolExecutor.getQueue()) == null || (str = Integer.valueOf(queue.size()).toString()) == null) {
                str = "n/a";
            }
            ExecutorService serialIOExecutor2 = getSerialIOExecutor();
            ThreadPoolExecutor threadPoolExecutor2 = serialIOExecutor2 instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) serialIOExecutor2 : null;
            return l.E("\n            OneSignalDispatchers Performance Metrics:\n            - IO Pool: " + getIoExecutor().getActiveCount() + '/' + getIoExecutor().getCorePoolSize() + " active/core threads\n            - IO Queue: " + getIoExecutor().getQueue().size() + " pending tasks\n            - Default Pool: " + getDefaultExecutor().getActiveCount() + '/' + getDefaultExecutor().getCorePoolSize() + " active/core threads\n            - Default Queue: " + getDefaultExecutor().getQueue().size() + " pending tasks\n            - SerialIO Queue: " + str + " pending tasks\n            - Total completed tasks: " + (getIoExecutor().getCompletedTaskCount() + getDefaultExecutor().getCompletedTaskCount() + (threadPoolExecutor2 != null ? threadPoolExecutor2.getCompletedTaskCount() : 0L)) + "\n            - Memory usage: ~" + ((getIoExecutor().getActiveCount() + getDefaultExecutor().getActiveCount() + 1) * 1024) + "KB (thread stacks, ~1MB each)\n            ");
        } catch (Exception e3) {
            return "OneSignalDispatchers not initialized or using fallback dispatchers " + e3.getMessage();
        }
    }

    public final AbstractC0020u getSerialIO() {
        return (AbstractC0020u) SerialIO$delegate.getValue();
    }

    public final String getStatus$com_onesignal_core() {
        return l.E("\n            OneSignalDispatchers Status:\n            - IO Executor: " + executorStatus$com_onesignal_core("ioExecutor", OneSignalDispatchers$getStatus$1.INSTANCE) + "\n            - Default Executor: " + executorStatus$com_onesignal_core("defaultExecutor", OneSignalDispatchers$getStatus$2.INSTANCE) + "\n            - SerialIO Executor: " + executorStatus$com_onesignal_core("serialIOExecutor", OneSignalDispatchers$getStatus$3.INSTANCE) + "\n            - IO Scope: " + scopeStatus$com_onesignal_core("IOScope", OneSignalDispatchers$getStatus$4.INSTANCE) + "\n            - Default Scope: " + scopeStatus$com_onesignal_core("DefaultScope", OneSignalDispatchers$getStatus$5.INSTANCE) + "\n            - SerialIO Scope: " + scopeStatus$com_onesignal_core("SerialIOScope", OneSignalDispatchers$getStatus$6.INSTANCE) + "\n        ");
    }

    public final X launchOnDefault(InterfaceC1441l block) {
        i.e(block, "block");
        return AbstractC0024y.n(getDefaultScope(), null, 0, new OneSignalDispatchers$launchOnDefault$1(block, null), 3);
    }

    public final X launchOnIO(InterfaceC1441l block) {
        i.e(block, "block");
        return AbstractC0024y.n(getIOScope(), null, 0, new OneSignalDispatchers$launchOnIO$1(block, null), 3);
    }

    public final X launchOnSerialIO(InterfaceC1441l block) {
        i.e(block, "block");
        return AbstractC0024y.n(getSerialIOScope(), null, 0, new OneSignalDispatchers$launchOnSerialIO$1(block, null), 3);
    }

    public final void prewarm() {
        if (prewarmStarted) {
            return;
        }
        synchronized (prewarmLock) {
            if (prewarmStarted) {
                return;
            }
            prewarmStarted = true;
            Thread thread = new Thread(new RunnableC0264a(1), "OneSignal-prewarm");
            thread.setDaemon(true);
            thread.setPriority(3);
            thread.start();
        }
    }

    public final void resetPrewarmForTest$com_onesignal_core() {
        synchronized (prewarmLock) {
            prewarmStarted = false;
        }
    }

    public final String scopeStatus$com_onesignal_core(String name, InterfaceC1430a isActive) {
        i.e(name, "name");
        i.e(isActive, "isActive");
        try {
            return ((Boolean) isActive.invoke()).booleanValue() ? "Active" : "Cancelled";
        } catch (Exception e3) {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(" Not initialized ");
            String message = e3.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            sb.append(message);
            return sb.toString();
        }
    }

    public static final class OptimizedThreadFactory implements ThreadFactory {
        private final String namePrefix;
        private final int priority;
        private final AtomicInteger threadNumber;

        public OptimizedThreadFactory(String namePrefix, int i2) {
            i.e(namePrefix, "namePrefix");
            this.namePrefix = namePrefix;
            this.priority = i2;
            this.threadNumber = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r5) {
            i.e(r5, "r");
            Thread thread = new Thread(r5, this.namePrefix + '-' + this.threadNumber.getAndIncrement());
            thread.setDaemon(true);
            thread.setPriority(this.priority);
            return thread;
        }

        public /* synthetic */ OptimizedThreadFactory(String str, int i2, int i3, e eVar) {
            this(str, (i3 & 2) != 0 ? 5 : i2);
        }
    }
}
