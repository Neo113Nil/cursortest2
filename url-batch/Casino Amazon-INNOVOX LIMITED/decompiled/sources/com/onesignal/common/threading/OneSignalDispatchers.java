package com.onesignal.common.threading;

import androidx.webkit.Profile;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.core.BuildConfig;
import com.onesignal.debug.internal.logging.Logging;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: OneSignalDispatchers.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u00029:B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\"H\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0002\b%J\r\u0010&\u001a\u00020\u0004H\u0000¢\u0006\u0002\b'J)\u0010(\u001a\u00020)2\u001c\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0012\u0006\u0012\u0004\u0018\u00010\u00010+¢\u0006\u0002\u0010.J)\u0010/\u001a\u00020)2\u001c\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0012\u0006\u0012\u0004\u0018\u00010\u00010+¢\u0006\u0002\u0010.J)\u00100\u001a\u00020)2\u001c\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0012\u0006\u0012\u0004\u0018\u00010\u00010+¢\u0006\u0002\u0010.J\u0006\u00101\u001a\u00020-J\r\u00102\u001a\u00020-H\u0000¢\u0006\u0002\b3J\r\u00104\u001a\u00020-H\u0000¢\u0006\u0002\b5J#\u00106\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e0\"H\u0000¢\u0006\u0002\b8R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/onesignal/common/threading/OneSignalDispatchers;", "", "()V", "BASE_THREAD_NAME", "", "DEFAULT_CORE_POOL_SIZE", "", "DEFAULT_MAX_POOL_SIZE", "DEFAULT_THREAD_NAME_PREFIX", Profile.DEFAULT_PROFILE_NAME, "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "IO", "getIO", "IO_CORE_POOL_SIZE", "IO_MAX_POOL_SIZE", "IO_THREAD_NAME_PREFIX", "KEEP_ALIVE_TIME_SECONDS", "", "NOT_INITIALIZED", "QUEUE_CAPACITY", "SERIAL_IO_THREAD_NAME", "SerialIO", "getSerialIO", "UNKNOWN_ERROR", "pools", "Lcom/onesignal/common/threading/OneSignalDispatchers$Pools;", "prewarmLock", "prewarmStarted", "", "executorStatus", "name", "isShutdown", "Lkotlin/Function0;", "executorStatus$com_onesignal_core", "getPerformanceMetrics", "getPerformanceMetrics$com_onesignal_core", "getStatus", "getStatus$com_onesignal_core", "launchOnDefault", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "launchOnIO", "launchOnSerialIO", "prewarm", "resetForTest", "resetForTest$com_onesignal_core", "resetPrewarmForTest", "resetPrewarmForTest$com_onesignal_core", "scopeStatus", "isActive", "scopeStatus$com_onesignal_core", "OptimizedThreadFactory", "Pools", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
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
    private static volatile Pools pools = new Pools();
    private static final Object prewarmLock = new Object();

    private OneSignalDispatchers() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OneSignalDispatchers.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onesignal/common/threading/OneSignalDispatchers$OptimizedThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "namePrefix", "", "priority", "", "(Ljava/lang/String;I)V", "threadNumber", "Ljava/util/concurrent/atomic/AtomicInteger;", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class OptimizedThreadFactory implements ThreadFactory {
        private final String namePrefix;
        private final int priority;
        private final AtomicInteger threadNumber;

        public OptimizedThreadFactory(String namePrefix, int i) {
            Intrinsics.checkNotNullParameter(namePrefix, "namePrefix");
            this.namePrefix = namePrefix;
            this.priority = i;
            this.threadNumber = new AtomicInteger(1);
        }

        public /* synthetic */ OptimizedThreadFactory(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 5 : i);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r) {
            Intrinsics.checkNotNullParameter(r, "r");
            Thread thread = new Thread(r, this.namePrefix + '-' + this.threadNumber.getAndIncrement());
            thread.setDaemon(true);
            thread.setPriority(this.priority);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OneSignalDispatchers.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00100\u001a\u000201R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0010\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u001b\u0010\u0012\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001c¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010!\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001aR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u001c¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001f\u0010+\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010(0(0\u001c¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\u001c¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001e¨\u00062"}, d2 = {"Lcom/onesignal/common/threading/OneSignalDispatchers$Pools;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Default$delegate", "Lkotlin/Lazy;", "DefaultScope", "Lkotlinx/coroutines/CoroutineScope;", "getDefaultScope", "()Lkotlinx/coroutines/CoroutineScope;", "IO", "getIO", "IO$delegate", "IOScope", "getIOScope", "SerialIO", "getSerialIO", "SerialIO$delegate", "SerialIOScope", "getSerialIOScope", "defaultExecutor", "Ljava/util/concurrent/ThreadPoolExecutor;", "getDefaultExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "defaultExecutorLazy", "Lkotlin/Lazy;", "getDefaultExecutorLazy", "()Lkotlin/Lazy;", "defaultScopeLazy", "getDefaultScopeLazy", "ioExecutor", "getIoExecutor", "ioExecutorLazy", "getIoExecutorLazy", "ioScopeLazy", "getIoScopeLazy", "serialIOExecutor", "Ljava/util/concurrent/ExecutorService;", "getSerialIOExecutor", "()Ljava/util/concurrent/ExecutorService;", "serialIOExecutorLazy", "kotlin.jvm.PlatformType", "getSerialIOExecutorLazy", "serialIOScopeLazy", "getSerialIOScopeLazy", "shutdown", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Pools {
        private final Lazy<ThreadPoolExecutor> ioExecutorLazy = LazyKt.lazy(new Function0<ThreadPoolExecutor>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$Pools$ioExecutorLazy$1
            @Override // kotlin.jvm.functions.Function0
            public final ThreadPoolExecutor invoke() {
                try {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(200), new OneSignalDispatchers.OptimizedThreadFactory("OneSignal-IO", 4));
                    threadPoolExecutor.allowCoreThreadTimeOut(false);
                    return threadPoolExecutor;
                } catch (Exception e) {
                    Logging.error$default("OneSignalDispatchers: Failed to create IO executor: " + e.getMessage(), null, 2, null);
                    throw e;
                }
            }
        });
        private final Lazy<ExecutorService> serialIOExecutorLazy = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$Pools$serialIOExecutorLazy$1
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                try {
                    return Executors.newSingleThreadExecutor(new OneSignalDispatchers.OptimizedThreadFactory("OneSignal-SerialIO", 4));
                } catch (Exception e) {
                    Logging.error$default("OneSignalDispatchers: Failed to create SerialIO executor: " + e.getMessage(), null, 2, null);
                    throw e;
                }
            }
        });
        private final Lazy<ThreadPoolExecutor> defaultExecutorLazy = LazyKt.lazy(new Function0<ThreadPoolExecutor>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$Pools$defaultExecutorLazy$1
            @Override // kotlin.jvm.functions.Function0
            public final ThreadPoolExecutor invoke() {
                try {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(200), new OneSignalDispatchers.OptimizedThreadFactory("OneSignal-Default", 0, 2, null));
                    threadPoolExecutor.allowCoreThreadTimeOut(false);
                    return threadPoolExecutor;
                } catch (Exception e) {
                    Logging.error$default("OneSignalDispatchers: Failed to create Default executor: " + e.getMessage(), null, 2, null);
                    throw e;
                }
            }
        });

        /* renamed from: IO$delegate, reason: from kotlin metadata */
        private final Lazy IO = LazyKt.lazy(new Function0<CoroutineDispatcher>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$Pools$IO$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineDispatcher invoke() {
                try {
                    return ExecutorsKt.from((ExecutorService) OneSignalDispatchers.Pools.this.getIoExecutor());
                } catch (Exception e) {
                    Logging.error$default("OneSignalDispatchers: Using fallback Dispatchers.IO dispatcher: " + e.getMessage(), null, 2, null);
                    return Dispatchers.getIO();
                }
            }
        });

        /* renamed from: Default$delegate, reason: from kotlin metadata */
        private final Lazy Default = LazyKt.lazy(new Function0<CoroutineDispatcher>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$Pools$Default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineDispatcher invoke() {
                try {
                    return ExecutorsKt.from((ExecutorService) OneSignalDispatchers.Pools.this.getDefaultExecutor());
                } catch (Exception e) {
                    Logging.error$default("OneSignalDispatchers: Using fallback Dispatchers.Default dispatcher: " + e.getMessage(), null, 2, null);
                    return Dispatchers.getDefault();
                }
            }
        });

        /* renamed from: SerialIO$delegate, reason: from kotlin metadata */
        private final Lazy SerialIO = LazyKt.lazy(new Function0<CoroutineDispatcher>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$Pools$SerialIO$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineDispatcher invoke() {
                try {
                    return ExecutorsKt.from(OneSignalDispatchers.Pools.this.getSerialIOExecutor());
                } catch (Exception e) {
                    Logging.error$default("OneSignalDispatchers: Using fallback serialized Dispatchers.IO: " + e.getMessage(), null, 2, null);
                    return Dispatchers.getIO().limitedParallelism(1);
                }
            }
        });
        private final Lazy<CoroutineScope> ioScopeLazy = LazyKt.lazy(new Function0<CoroutineScope>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$Pools$ioScopeLazy$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineScope invoke() {
                return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(OneSignalDispatchers.Pools.this.getIO()));
            }
        });
        private final Lazy<CoroutineScope> defaultScopeLazy = LazyKt.lazy(new Function0<CoroutineScope>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$Pools$defaultScopeLazy$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineScope invoke() {
                return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(OneSignalDispatchers.Pools.this.getDefault()));
            }
        });
        private final Lazy<CoroutineScope> serialIOScopeLazy = LazyKt.lazy(new Function0<CoroutineScope>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$Pools$serialIOScopeLazy$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineScope invoke() {
                return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(OneSignalDispatchers.Pools.this.getSerialIO()));
            }
        });

        public final Lazy<ThreadPoolExecutor> getIoExecutorLazy() {
            return this.ioExecutorLazy;
        }

        public final ThreadPoolExecutor getIoExecutor() {
            return this.ioExecutorLazy.getValue();
        }

        public final Lazy<ExecutorService> getSerialIOExecutorLazy() {
            return this.serialIOExecutorLazy;
        }

        public final ExecutorService getSerialIOExecutor() {
            ExecutorService value = this.serialIOExecutorLazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            return value;
        }

        public final Lazy<ThreadPoolExecutor> getDefaultExecutorLazy() {
            return this.defaultExecutorLazy;
        }

        public final ThreadPoolExecutor getDefaultExecutor() {
            return this.defaultExecutorLazy.getValue();
        }

        public final CoroutineDispatcher getIO() {
            return (CoroutineDispatcher) this.IO.getValue();
        }

        public final CoroutineDispatcher getDefault() {
            return (CoroutineDispatcher) this.Default.getValue();
        }

        public final CoroutineDispatcher getSerialIO() {
            return (CoroutineDispatcher) this.SerialIO.getValue();
        }

        public final Lazy<CoroutineScope> getIoScopeLazy() {
            return this.ioScopeLazy;
        }

        public final CoroutineScope getIOScope() {
            return this.ioScopeLazy.getValue();
        }

        public final Lazy<CoroutineScope> getDefaultScopeLazy() {
            return this.defaultScopeLazy;
        }

        public final CoroutineScope getDefaultScope() {
            return this.defaultScopeLazy.getValue();
        }

        public final Lazy<CoroutineScope> getSerialIOScopeLazy() {
            return this.serialIOScopeLazy;
        }

        public final CoroutineScope getSerialIOScope() {
            return this.serialIOScopeLazy.getValue();
        }

        public final void shutdown() {
            if (this.ioScopeLazy.isInitialized()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Pools pools = this;
                    CoroutineScopeKt.cancel$default(this.ioScopeLazy.getValue(), null, 1, null);
                    Result.m3984constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th));
                }
            }
            if (this.defaultScopeLazy.isInitialized()) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    Pools pools2 = this;
                    CoroutineScopeKt.cancel$default(this.defaultScopeLazy.getValue(), null, 1, null);
                    Result.m3984constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th2));
                }
            }
            if (this.serialIOScopeLazy.isInitialized()) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    Pools pools3 = this;
                    CoroutineScopeKt.cancel$default(this.serialIOScopeLazy.getValue(), null, 1, null);
                    Result.m3984constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th3));
                }
            }
            if (this.ioExecutorLazy.isInitialized()) {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    Pools pools4 = this;
                    Result.m3984constructorimpl(this.ioExecutorLazy.getValue().shutdownNow());
                } catch (Throwable th4) {
                    Result.Companion companion8 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th4));
                }
            }
            if (this.defaultExecutorLazy.isInitialized()) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    Pools pools5 = this;
                    Result.m3984constructorimpl(this.defaultExecutorLazy.getValue().shutdownNow());
                } catch (Throwable th5) {
                    Result.Companion companion10 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th5));
                }
            }
            if (this.serialIOExecutorLazy.isInitialized()) {
                try {
                    Result.Companion companion11 = Result.INSTANCE;
                    Pools pools6 = this;
                    Result.m3984constructorimpl(this.serialIOExecutorLazy.getValue().shutdownNow());
                } catch (Throwable th6) {
                    Result.Companion companion12 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th6));
                }
            }
        }
    }

    public final CoroutineDispatcher getIO() {
        return pools.getIO();
    }

    public final CoroutineDispatcher getDefault() {
        return pools.getDefault();
    }

    public final CoroutineDispatcher getSerialIO() {
        return pools.getSerialIO();
    }

    public final Job launchOnIO(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(pools.getIOScope(), null, null, new OneSignalDispatchers$launchOnIO$1(block, null), 3, null);
        return launch$default;
    }

    public final Job launchOnDefault(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(pools.getDefaultScope(), null, null, new OneSignalDispatchers$launchOnDefault$1(block, null), 3, null);
        return launch$default;
    }

    public final Job launchOnSerialIO(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(pools.getSerialIOScope(), null, null, new OneSignalDispatchers$launchOnSerialIO$1(block, null), 3, null);
        return launch$default;
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
            Unit unit = Unit.INSTANCE;
            try {
                Thread thread = new Thread(new Runnable() { // from class: com.onesignal.common.threading.OneSignalDispatchers$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OneSignalDispatchers.prewarm$lambda$2();
                    }
                }, "OneSignal-prewarm");
                thread.setDaemon(true);
                thread.setPriority(3);
                thread.start();
            } catch (Throwable th) {
                synchronized (prewarmLock) {
                    prewarmStarted = false;
                    Unit unit2 = Unit.INSTANCE;
                    Logging.warn("OneSignalDispatchers.prewarm failed to start daemon: " + th.getMessage(), th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prewarm$lambda$2() {
        try {
            OneSignalDispatchers oneSignalDispatchers = INSTANCE;
            oneSignalDispatchers.launchOnIO(new OneSignalDispatchers$prewarm$prewarmThread$1$1(null));
            oneSignalDispatchers.launchOnDefault(new OneSignalDispatchers$prewarm$prewarmThread$1$2(null));
            oneSignalDispatchers.launchOnSerialIO(new OneSignalDispatchers$prewarm$prewarmThread$1$3(null));
        } catch (Throwable th) {
            synchronized (prewarmLock) {
                prewarmStarted = false;
                Unit unit = Unit.INSTANCE;
                Logging.warn("OneSignalDispatchers.prewarm failed: " + th.getMessage(), th);
            }
        }
    }

    public final void resetPrewarmForTest$com_onesignal_core() {
        synchronized (prewarmLock) {
            prewarmStarted = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void resetForTest$com_onesignal_core() {
        Pools pools2 = pools;
        pools = new Pools();
        try {
            pools2.shutdown();
        } catch (Exception e) {
            Logging.error("OneSignalDispatchers.resetForTest failed: " + e.getMessage(), e);
        }
        resetPrewarmForTest$com_onesignal_core();
    }

    public final String getPerformanceMetrics$com_onesignal_core() {
        String str;
        BlockingQueue<Runnable> queue;
        try {
            Pools pools2 = pools;
            ExecutorService serialIOExecutor = pools2.getSerialIOExecutor();
            ThreadPoolExecutor threadPoolExecutor = serialIOExecutor instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) serialIOExecutor : null;
            if (threadPoolExecutor == null || (queue = threadPoolExecutor.getQueue()) == null || (str = Integer.valueOf(queue.size()).toString()) == null) {
                str = "n/a";
            }
            ExecutorService serialIOExecutor2 = pools2.getSerialIOExecutor();
            ThreadPoolExecutor threadPoolExecutor2 = serialIOExecutor2 instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) serialIOExecutor2 : null;
            return StringsKt.trimIndent("\n            OneSignalDispatchers Performance Metrics:\n            - IO Pool: " + pools2.getIoExecutor().getActiveCount() + IOUtils.DIR_SEPARATOR_UNIX + pools2.getIoExecutor().getCorePoolSize() + " active/core threads\n            - IO Queue: " + pools2.getIoExecutor().getQueue().size() + " pending tasks\n            - Default Pool: " + pools2.getDefaultExecutor().getActiveCount() + IOUtils.DIR_SEPARATOR_UNIX + pools2.getDefaultExecutor().getCorePoolSize() + " active/core threads\n            - Default Queue: " + pools2.getDefaultExecutor().getQueue().size() + " pending tasks\n            - SerialIO Queue: " + str + " pending tasks\n            - Total completed tasks: " + (pools2.getIoExecutor().getCompletedTaskCount() + pools2.getDefaultExecutor().getCompletedTaskCount() + (threadPoolExecutor2 != null ? threadPoolExecutor2.getCompletedTaskCount() : 0L)) + "\n            - Memory usage: ~" + ((pools2.getIoExecutor().getActiveCount() + pools2.getDefaultExecutor().getActiveCount() + 1) * 1024) + "KB (thread stacks, ~1MB each)\n            ");
        } catch (Exception e) {
            return "OneSignalDispatchers not initialized or using fallback dispatchers " + e.getMessage();
        }
    }

    public final String getStatus$com_onesignal_core() {
        final Pools pools2 = pools;
        return StringsKt.trimIndent("\n            OneSignalDispatchers Status:\n            - IO Executor: " + executorStatus$com_onesignal_core("ioExecutor", new Function0<Boolean>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$getStatus$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(OneSignalDispatchers.Pools.this.getIoExecutor().isShutdown());
            }
        }) + "\n            - Default Executor: " + executorStatus$com_onesignal_core("defaultExecutor", new Function0<Boolean>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$getStatus$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(OneSignalDispatchers.Pools.this.getDefaultExecutor().isShutdown());
            }
        }) + "\n            - SerialIO Executor: " + executorStatus$com_onesignal_core("serialIOExecutor", new Function0<Boolean>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$getStatus$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(OneSignalDispatchers.Pools.this.getSerialIOExecutor().isShutdown());
            }
        }) + "\n            - IO Scope: " + scopeStatus$com_onesignal_core("IOScope", new Function0<Boolean>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$getStatus$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(CoroutineScopeKt.isActive(OneSignalDispatchers.Pools.this.getIOScope()));
            }
        }) + "\n            - Default Scope: " + scopeStatus$com_onesignal_core("DefaultScope", new Function0<Boolean>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$getStatus$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(CoroutineScopeKt.isActive(OneSignalDispatchers.Pools.this.getDefaultScope()));
            }
        }) + "\n            - SerialIO Scope: " + scopeStatus$com_onesignal_core("SerialIOScope", new Function0<Boolean>() { // from class: com.onesignal.common.threading.OneSignalDispatchers$getStatus$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(CoroutineScopeKt.isActive(OneSignalDispatchers.Pools.this.getSerialIOScope()));
            }
        }) + "\n        ");
    }

    public final String executorStatus$com_onesignal_core(String name, Function0<Boolean> isShutdown) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(isShutdown, "isShutdown");
        try {
            return isShutdown.invoke().booleanValue() ? "Shutdown" : "Active";
        } catch (Exception e) {
            StringBuilder append = new StringBuilder().append(name).append(" Not initialized ");
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return append.append(message).toString();
        }
    }

    public final String scopeStatus$com_onesignal_core(String name, Function0<Boolean> isActive) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(isActive, "isActive");
        try {
            return isActive.invoke().booleanValue() ? "Active" : "Cancelled";
        } catch (Exception e) {
            StringBuilder append = new StringBuilder().append(name).append(" Not initialized ");
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return append.append(message).toString();
        }
    }
}
