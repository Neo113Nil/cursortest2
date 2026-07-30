package com.onesignal.common.threading;

import R5.InterfaceC0168h;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0786t;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import n6.S;
import n6.X;
import n6.m0;
import u6.ExecutorC0952d;

/* loaded from: classes.dex */
public final class a {
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
    public static final a INSTANCE = new a();
    private static final InterfaceC0168h ioExecutor$delegate = R5.i.b(o.INSTANCE);
    private static final InterfaceC0168h serialIOExecutor$delegate = R5.i.b(v.INSTANCE);
    private static final InterfaceC0168h defaultExecutor$delegate = R5.i.b(h.INSTANCE);
    private static final InterfaceC0168h IO$delegate = R5.i.b(c.INSTANCE);
    private static final InterfaceC0168h Default$delegate = R5.i.b(C0008a.INSTANCE);
    private static final InterfaceC0168h SerialIO$delegate = R5.i.b(f.INSTANCE);
    private static final InterfaceC0168h IOScope$delegate = R5.i.b(d.INSTANCE);
    private static final InterfaceC0168h DefaultScope$delegate = R5.i.b(b.INSTANCE);
    private static final InterfaceC0168h SerialIOScope$delegate = R5.i.b(g.INSTANCE);
    private static final Object prewarmLock = new Object();

    /* renamed from: com.onesignal.common.threading.a$a, reason: collision with other inner class name */
    public static final class C0008a extends kotlin.jvm.internal.p implements Function0 {
        public static final C0008a INSTANCE = new C0008a();

        public C0008a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC0786t invoke() {
            try {
                return new S(a.INSTANCE.getDefaultExecutor());
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Using fallback Dispatchers.Default dispatcher: " + e7.getMessage(), null, 2, null);
                return F.f7011a;
            }
        }
    }

    public static final class b extends kotlin.jvm.internal.p implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC0789w invoke() {
            return AbstractC0792z.b(kotlin.coroutines.e.c(new m0(), a.INSTANCE.getDefault()));
        }
    }

    public static final class c extends kotlin.jvm.internal.p implements Function0 {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC0786t invoke() {
            try {
                return new S(a.INSTANCE.getIoExecutor());
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Using fallback Dispatchers.IO dispatcher: " + e7.getMessage(), null, 2, null);
                return ExecutorC0952d.f8106i;
            }
        }
    }

    public static final class d extends kotlin.jvm.internal.p implements Function0 {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC0789w invoke() {
            return AbstractC0792z.b(kotlin.coroutines.e.c(new m0(), a.INSTANCE.getIO()));
        }
    }

    public static final class f extends kotlin.jvm.internal.p implements Function0 {
        public static final f INSTANCE = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC0786t invoke() {
            try {
                return new S(a.INSTANCE.getSerialIOExecutor());
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Using fallback serialized Dispatchers.IO: " + e7.getMessage(), null, 2, null);
                return ExecutorC0952d.f8106i.H(1);
            }
        }
    }

    public static final class g extends kotlin.jvm.internal.p implements Function0 {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC0789w invoke() {
            return AbstractC0792z.b(kotlin.coroutines.e.c(new m0(), a.INSTANCE.getSerialIO()));
        }
    }

    public static final class h extends kotlin.jvm.internal.p implements Function0 {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ThreadPoolExecutor invoke() {
            try {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, a.KEEP_ALIVE_TIME_SECONDS, TimeUnit.SECONDS, new LinkedBlockingQueue(a.QUEUE_CAPACITY), new e(a.DEFAULT_THREAD_NAME_PREFIX, 0, 2, null));
                threadPoolExecutor.allowCoreThreadTimeOut(false);
                return threadPoolExecutor;
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Failed to create Default executor: " + e7.getMessage(), null, 2, null);
                throw e7;
            }
        }
    }

    public static final class i extends kotlin.jvm.internal.p implements Function0 {
        public static final i INSTANCE = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(a.INSTANCE.getIoExecutor().isShutdown());
        }
    }

    public static final class j extends kotlin.jvm.internal.p implements Function0 {
        public static final j INSTANCE = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(a.INSTANCE.getDefaultExecutor().isShutdown());
        }
    }

    public static final class k extends kotlin.jvm.internal.p implements Function0 {
        public static final k INSTANCE = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(a.INSTANCE.getSerialIOExecutor().isShutdown());
        }
    }

    public static final class l extends kotlin.jvm.internal.p implements Function0 {
        public static final l INSTANCE = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC0792z.k(a.INSTANCE.getIOScope()));
        }
    }

    public static final class m extends kotlin.jvm.internal.p implements Function0 {
        public static final m INSTANCE = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC0792z.k(a.INSTANCE.getDefaultScope()));
        }
    }

    public static final class n extends kotlin.jvm.internal.p implements Function0 {
        public static final n INSTANCE = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC0792z.k(a.INSTANCE.getSerialIOScope()));
        }
    }

    public static final class o extends kotlin.jvm.internal.p implements Function0 {
        public static final o INSTANCE = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ThreadPoolExecutor invoke() {
            try {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, a.KEEP_ALIVE_TIME_SECONDS, TimeUnit.SECONDS, new LinkedBlockingQueue(a.QUEUE_CAPACITY), new e(a.IO_THREAD_NAME_PREFIX, 4));
                threadPoolExecutor.allowCoreThreadTimeOut(false);
                return threadPoolExecutor;
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Failed to create IO executor: " + e7.getMessage(), null, 2, null);
                throw e7;
            }
        }
    }

    public static final class p extends X5.j implements Function2 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
            super(2, bVar);
            this.$block = function1;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new p(this.$block, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                Function1<V5.b, Object> function1 = this.$block;
                this.label = 1;
                if (function1.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((p) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class q extends X5.j implements Function2 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
            super(2, bVar);
            this.$block = function1;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new q(this.$block, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                Function1<V5.b, Object> function1 = this.$block;
                this.label = 1;
                if (function1.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((q) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class r extends X5.j implements Function2 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
            super(2, bVar);
            this.$block = function1;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new r(this.$block, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                Function1<V5.b, Object> function1 = this.$block;
                this.label = 1;
                if (function1.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((r) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class s extends X5.j implements Function1 {
        int label;

        public s(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new s(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((s) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return Unit.f6114a;
        }
    }

    public static final class t extends X5.j implements Function1 {
        int label;

        public t(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new t(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((t) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return Unit.f6114a;
        }
    }

    public static final class u extends X5.j implements Function1 {
        int label;

        public u(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new u(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((u) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return Unit.f6114a;
        }
    }

    public static final class v extends kotlin.jvm.internal.p implements Function0 {
        public static final v INSTANCE = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            try {
                return Executors.newSingleThreadExecutor(new e(a.SERIAL_IO_THREAD_NAME, 4));
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Failed to create SerialIO executor: " + e7.getMessage(), null, 2, null);
                throw e7;
            }
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadPoolExecutor getDefaultExecutor() {
        return (ThreadPoolExecutor) defaultExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0789w getDefaultScope() {
        return (InterfaceC0789w) DefaultScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0789w getIOScope() {
        return (InterfaceC0789w) IOScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadPoolExecutor getIoExecutor() {
        return (ThreadPoolExecutor) ioExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExecutorService getSerialIOExecutor() {
        Object value = serialIOExecutor$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ExecutorService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0789w getSerialIOScope() {
        return (InterfaceC0789w) SerialIOScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prewarm$lambda$2() {
        try {
            a aVar = INSTANCE;
            aVar.launchOnIO(new s(null));
            aVar.launchOnDefault(new t(null));
            aVar.launchOnSerialIO(new u(null));
        } catch (Throwable th) {
            synchronized (prewarmLock) {
                prewarmStarted = false;
                Unit unit = Unit.f6114a;
                com.onesignal.debug.internal.logging.b.warn("OneSignalDispatchers.prewarm failed: " + th.getMessage(), th);
            }
        }
    }

    public final String executorStatus$com_onesignal_core(String name, Function0<Boolean> isShutdown) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(isShutdown, "isShutdown");
        try {
            return ((Boolean) isShutdown.invoke()).booleanValue() ? "Shutdown" : "Active";
        } catch (Exception e7) {
            StringBuilder l7 = C4.p.l(name, " Not initialized ");
            String message = e7.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            l7.append(message);
            return l7.toString();
        }
    }

    public final AbstractC0786t getDefault() {
        return (AbstractC0786t) Default$delegate.getValue();
    }

    public final AbstractC0786t getIO() {
        return (AbstractC0786t) IO$delegate.getValue();
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
            return kotlin.text.j.b("\n            OneSignalDispatchers Performance Metrics:\n            - IO Pool: " + getIoExecutor().getActiveCount() + '/' + getIoExecutor().getCorePoolSize() + " active/core threads\n            - IO Queue: " + getIoExecutor().getQueue().size() + " pending tasks\n            - Default Pool: " + getDefaultExecutor().getActiveCount() + '/' + getDefaultExecutor().getCorePoolSize() + " active/core threads\n            - Default Queue: " + getDefaultExecutor().getQueue().size() + " pending tasks\n            - SerialIO Queue: " + str + " pending tasks\n            - Total completed tasks: " + (getIoExecutor().getCompletedTaskCount() + getDefaultExecutor().getCompletedTaskCount() + (threadPoolExecutor2 != null ? threadPoolExecutor2.getCompletedTaskCount() : 0L)) + "\n            - Memory usage: ~" + ((getIoExecutor().getActiveCount() + getDefaultExecutor().getActiveCount() + 1) * 1024) + "KB (thread stacks, ~1MB each)\n            ");
        } catch (Exception e7) {
            return "OneSignalDispatchers not initialized or using fallback dispatchers " + e7.getMessage();
        }
    }

    public final AbstractC0786t getSerialIO() {
        return (AbstractC0786t) SerialIO$delegate.getValue();
    }

    public final String getStatus$com_onesignal_core() {
        return kotlin.text.j.b("\n            OneSignalDispatchers Status:\n            - IO Executor: " + executorStatus$com_onesignal_core("ioExecutor", i.INSTANCE) + "\n            - Default Executor: " + executorStatus$com_onesignal_core("defaultExecutor", j.INSTANCE) + "\n            - SerialIO Executor: " + executorStatus$com_onesignal_core("serialIOExecutor", k.INSTANCE) + "\n            - IO Scope: " + scopeStatus$com_onesignal_core("IOScope", l.INSTANCE) + "\n            - Default Scope: " + scopeStatus$com_onesignal_core("DefaultScope", m.INSTANCE) + "\n            - SerialIO Scope: " + scopeStatus$com_onesignal_core("SerialIOScope", n.INSTANCE) + "\n        ");
    }

    public final X launchOnDefault(Function1<? super V5.b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return AbstractC0792z.l(getDefaultScope(), null, new p(block, null), 3);
    }

    public final X launchOnIO(Function1<? super V5.b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return AbstractC0792z.l(getIOScope(), null, new q(block, null), 3);
    }

    public final X launchOnSerialIO(Function1<? super V5.b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return AbstractC0792z.l(getSerialIOScope(), null, new r(block, null), 3);
    }

    public final void prewarm() {
        if (prewarmStarted) {
            return;
        }
        synchronized (prewarmLock) {
            if (prewarmStarted) {
                return;
            }
            int i2 = 1;
            prewarmStarted = true;
            Unit unit = Unit.f6114a;
            try {
                Thread thread = new Thread(new com.appsflyer.internal.p(i2), "OneSignal-prewarm");
                thread.setDaemon(true);
                thread.setPriority(3);
                thread.start();
            } catch (Throwable th) {
                synchronized (prewarmLock) {
                    prewarmStarted = false;
                    Unit unit2 = Unit.f6114a;
                    com.onesignal.debug.internal.logging.b.warn("OneSignalDispatchers.prewarm failed to start daemon: " + th.getMessage(), th);
                }
            }
        }
    }

    public final void resetPrewarmForTest$com_onesignal_core() {
        synchronized (prewarmLock) {
            prewarmStarted = false;
            Unit unit = Unit.f6114a;
        }
    }

    public final String scopeStatus$com_onesignal_core(String name, Function0<Boolean> isActive) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(isActive, "isActive");
        try {
            return ((Boolean) isActive.invoke()).booleanValue() ? "Active" : "Cancelled";
        } catch (Exception e7) {
            StringBuilder l7 = C4.p.l(name, " Not initialized ");
            String message = e7.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            l7.append(message);
            return l7.toString();
        }
    }

    public static final class e implements ThreadFactory {
        private final String namePrefix;
        private final int priority;
        private final AtomicInteger threadNumber;

        public e(String namePrefix, int i2) {
            Intrinsics.checkNotNullParameter(namePrefix, "namePrefix");
            this.namePrefix = namePrefix;
            this.priority = i2;
            this.threadNumber = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r7) {
            Intrinsics.checkNotNullParameter(r7, "r");
            Thread thread = new Thread(r7, this.namePrefix + '-' + this.threadNumber.getAndIncrement());
            thread.setDaemon(true);
            thread.setPriority(this.priority);
            return thread;
        }

        public /* synthetic */ e(String str, int i2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i5 & 2) != 0 ? 5 : i2);
        }
    }
}
