package com.onesignal.common.threading;

import H5.AbstractC0161v;
import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import H5.S;
import H5.X;
import H5.n0;
import a1.AbstractC0223a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k5.InterfaceC0475e;
import k5.v;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

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
    private static volatile b pools = new b();
    private static final Object prewarmLock = new Object();

    public static final class b {
        private final InterfaceC0475e ioExecutorLazy = AbstractC0521b.x(f.INSTANCE);
        private final InterfaceC0475e serialIOExecutorLazy = AbstractC0521b.x(h.INSTANCE);
        private final InterfaceC0475e defaultExecutorLazy = AbstractC0521b.x(d.INSTANCE);
        private final InterfaceC0475e IO$delegate = AbstractC0521b.x(new C0010b());
        private final InterfaceC0475e Default$delegate = AbstractC0521b.x(new C0009a());
        private final InterfaceC0475e SerialIO$delegate = AbstractC0521b.x(new c());
        private final InterfaceC0475e ioScopeLazy = AbstractC0521b.x(new g());
        private final InterfaceC0475e defaultScopeLazy = AbstractC0521b.x(new e());
        private final InterfaceC0475e serialIOScopeLazy = AbstractC0521b.x(new i());

        /* renamed from: com.onesignal.common.threading.a$b$a, reason: collision with other inner class name */
        public static final class C0009a extends kotlin.jvm.internal.j implements InterfaceC0732a {
            public C0009a() {
                super(0);
            }

            @Override // x5.InterfaceC0732a
            public final AbstractC0161v invoke() {
                try {
                    return new S(b.this.getDefaultExecutor());
                } catch (Exception e4) {
                    com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Using fallback Dispatchers.Default dispatcher: " + e4.getMessage(), null, 2, null);
                    return F.f1027a;
                }
            }
        }

        /* renamed from: com.onesignal.common.threading.a$b$b, reason: collision with other inner class name */
        public static final class C0010b extends kotlin.jvm.internal.j implements InterfaceC0732a {
            public C0010b() {
                super(0);
            }

            @Override // x5.InterfaceC0732a
            public final AbstractC0161v invoke() {
                try {
                    return new S(b.this.getIoExecutor());
                } catch (Exception e4) {
                    com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Using fallback Dispatchers.IO dispatcher: " + e4.getMessage(), null, 2, null);
                    return F.f1029c;
                }
            }
        }

        public static final class c extends kotlin.jvm.internal.j implements InterfaceC0732a {
            public c() {
                super(0);
            }

            @Override // x5.InterfaceC0732a
            public final AbstractC0161v invoke() {
                try {
                    return new S(b.this.getSerialIOExecutor());
                } catch (Exception e4) {
                    com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Using fallback serialized Dispatchers.IO: " + e4.getMessage(), null, 2, null);
                    F.f1029c.getClass();
                    return O5.k.f1830h.I(1);
                }
            }
        }

        public static final class d extends kotlin.jvm.internal.j implements InterfaceC0732a {
            public static final d INSTANCE = new d();

            public d() {
                super(0);
            }

            @Override // x5.InterfaceC0732a
            public final ThreadPoolExecutor invoke() {
                try {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, a.KEEP_ALIVE_TIME_SECONDS, TimeUnit.SECONDS, new LinkedBlockingQueue(a.QUEUE_CAPACITY), new ThreadFactoryC0008a(a.DEFAULT_THREAD_NAME_PREFIX, 0, 2, null));
                    threadPoolExecutor.allowCoreThreadTimeOut(false);
                    return threadPoolExecutor;
                } catch (Exception e4) {
                    com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Failed to create Default executor: " + e4.getMessage(), null, 2, null);
                    throw e4;
                }
            }
        }

        public static final class e extends kotlin.jvm.internal.j implements InterfaceC0732a {
            public e() {
                super(0);
            }

            @Override // x5.InterfaceC0732a
            public final InterfaceC0163x invoke() {
                return AbstractC0165z.b(AbstractC0223a.D(new n0(), b.this.getDefault()));
            }
        }

        public static final class f extends kotlin.jvm.internal.j implements InterfaceC0732a {
            public static final f INSTANCE = new f();

            public f() {
                super(0);
            }

            @Override // x5.InterfaceC0732a
            public final ThreadPoolExecutor invoke() {
                try {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, a.KEEP_ALIVE_TIME_SECONDS, TimeUnit.SECONDS, new LinkedBlockingQueue(a.QUEUE_CAPACITY), new ThreadFactoryC0008a(a.IO_THREAD_NAME_PREFIX, 4));
                    threadPoolExecutor.allowCoreThreadTimeOut(false);
                    return threadPoolExecutor;
                } catch (Exception e4) {
                    com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Failed to create IO executor: " + e4.getMessage(), null, 2, null);
                    throw e4;
                }
            }
        }

        public static final class g extends kotlin.jvm.internal.j implements InterfaceC0732a {
            public g() {
                super(0);
            }

            @Override // x5.InterfaceC0732a
            public final InterfaceC0163x invoke() {
                return AbstractC0165z.b(AbstractC0223a.D(new n0(), b.this.getIO()));
            }
        }

        public static final class h extends kotlin.jvm.internal.j implements InterfaceC0732a {
            public static final h INSTANCE = new h();

            public h() {
                super(0);
            }

            @Override // x5.InterfaceC0732a
            public final ExecutorService invoke() {
                try {
                    return Executors.newSingleThreadExecutor(new ThreadFactoryC0008a(a.SERIAL_IO_THREAD_NAME, 4));
                } catch (Exception e4) {
                    com.onesignal.debug.internal.logging.b.error$default("OneSignalDispatchers: Failed to create SerialIO executor: " + e4.getMessage(), null, 2, null);
                    throw e4;
                }
            }
        }

        public static final class i extends kotlin.jvm.internal.j implements InterfaceC0732a {
            public i() {
                super(0);
            }

            @Override // x5.InterfaceC0732a
            public final InterfaceC0163x invoke() {
                return AbstractC0165z.b(AbstractC0223a.D(new n0(), b.this.getSerialIO()));
            }
        }

        public final AbstractC0161v getDefault() {
            return (AbstractC0161v) this.Default$delegate.getValue();
        }

        public final ThreadPoolExecutor getDefaultExecutor() {
            return (ThreadPoolExecutor) this.defaultExecutorLazy.getValue();
        }

        public final InterfaceC0475e getDefaultExecutorLazy() {
            return this.defaultExecutorLazy;
        }

        public final InterfaceC0163x getDefaultScope() {
            return (InterfaceC0163x) this.defaultScopeLazy.getValue();
        }

        public final InterfaceC0475e getDefaultScopeLazy() {
            return this.defaultScopeLazy;
        }

        public final AbstractC0161v getIO() {
            return (AbstractC0161v) this.IO$delegate.getValue();
        }

        public final InterfaceC0163x getIOScope() {
            return (InterfaceC0163x) this.ioScopeLazy.getValue();
        }

        public final ThreadPoolExecutor getIoExecutor() {
            return (ThreadPoolExecutor) this.ioExecutorLazy.getValue();
        }

        public final InterfaceC0475e getIoExecutorLazy() {
            return this.ioExecutorLazy;
        }

        public final InterfaceC0475e getIoScopeLazy() {
            return this.ioScopeLazy;
        }

        public final AbstractC0161v getSerialIO() {
            return (AbstractC0161v) this.SerialIO$delegate.getValue();
        }

        public final ExecutorService getSerialIOExecutor() {
            Object value = this.serialIOExecutorLazy.getValue();
            kotlin.jvm.internal.i.d(value, "<get-value>(...)");
            return (ExecutorService) value;
        }

        public final InterfaceC0475e getSerialIOExecutorLazy() {
            return this.serialIOExecutorLazy;
        }

        public final InterfaceC0163x getSerialIOScope() {
            return (InterfaceC0163x) this.serialIOScopeLazy.getValue();
        }

        public final InterfaceC0475e getSerialIOScopeLazy() {
            return this.serialIOScopeLazy;
        }

        public final void shutdown() {
            if (this.ioScopeLazy.isInitialized()) {
                try {
                    AbstractC0165z.c((InterfaceC0163x) this.ioScopeLazy.getValue());
                } catch (Throwable th) {
                    AbstractC0676f.f(th);
                }
            }
            if (this.defaultScopeLazy.isInitialized()) {
                try {
                    AbstractC0165z.c((InterfaceC0163x) this.defaultScopeLazy.getValue());
                } catch (Throwable th2) {
                    AbstractC0676f.f(th2);
                }
            }
            if (this.serialIOScopeLazy.isInitialized()) {
                try {
                    AbstractC0165z.c((InterfaceC0163x) this.serialIOScopeLazy.getValue());
                } catch (Throwable th3) {
                    AbstractC0676f.f(th3);
                }
            }
            if (this.ioExecutorLazy.isInitialized()) {
                try {
                    ((ThreadPoolExecutor) this.ioExecutorLazy.getValue()).shutdownNow();
                } catch (Throwable th4) {
                    AbstractC0676f.f(th4);
                }
            }
            if (this.defaultExecutorLazy.isInitialized()) {
                try {
                    ((ThreadPoolExecutor) this.defaultExecutorLazy.getValue()).shutdownNow();
                } catch (Throwable th5) {
                    AbstractC0676f.f(th5);
                }
            }
            if (this.serialIOExecutorLazy.isInitialized()) {
                try {
                    ((ExecutorService) this.serialIOExecutorLazy.getValue()).shutdownNow();
                } catch (Throwable th6) {
                    AbstractC0676f.f(th6);
                }
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.j implements InterfaceC0732a {
        final /* synthetic */ b $current;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.$current = bVar;
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.valueOf(this.$current.getIoExecutor().isShutdown());
        }
    }

    public static final class d extends kotlin.jvm.internal.j implements InterfaceC0732a {
        final /* synthetic */ b $current;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b bVar) {
            super(0);
            this.$current = bVar;
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.valueOf(this.$current.getDefaultExecutor().isShutdown());
        }
    }

    public static final class e extends kotlin.jvm.internal.j implements InterfaceC0732a {
        final /* synthetic */ b $current;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar) {
            super(0);
            this.$current = bVar;
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.valueOf(this.$current.getSerialIOExecutor().isShutdown());
        }
    }

    public static final class f extends kotlin.jvm.internal.j implements InterfaceC0732a {
        final /* synthetic */ b $current;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar) {
            super(0);
            this.$current = bVar;
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC0165z.k(this.$current.getIOScope()));
        }
    }

    public static final class g extends kotlin.jvm.internal.j implements InterfaceC0732a {
        final /* synthetic */ b $current;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar) {
            super(0);
            this.$current = bVar;
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC0165z.k(this.$current.getDefaultScope()));
        }
    }

    public static final class h extends kotlin.jvm.internal.j implements InterfaceC0732a {
        final /* synthetic */ b $current;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar) {
            super(0);
            this.$current = bVar;
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC0165z.k(this.$current.getSerialIOScope()));
        }
    }

    public static final class i extends q5.g implements InterfaceC0747p {
        final /* synthetic */ InterfaceC0743l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$block = interfaceC0743l;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new i(this.$block, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((i) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                InterfaceC0743l interfaceC0743l = this.$block;
                this.label = 1;
                if (interfaceC0743l.invoke(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }
    }

    public static final class j extends q5.g implements InterfaceC0747p {
        final /* synthetic */ InterfaceC0743l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$block = interfaceC0743l;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new j(this.$block, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((j) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                InterfaceC0743l interfaceC0743l = this.$block;
                this.label = 1;
                if (interfaceC0743l.invoke(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }
    }

    public static final class k extends q5.g implements InterfaceC0747p {
        final /* synthetic */ InterfaceC0743l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$block = interfaceC0743l;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new k(this.$block, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((k) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                InterfaceC0743l interfaceC0743l = this.$block;
                this.label = 1;
                if (interfaceC0743l.invoke(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }
    }

    public static final class l extends q5.g implements InterfaceC0743l {
        int label;

        public l(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new l(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((l) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class m extends q5.g implements InterfaceC0743l {
        int label;

        public m(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new m(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((m) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class n extends q5.g implements InterfaceC0743l {
        int label;

        public n(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new n(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((n) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prewarm$lambda$2() {
        try {
            a aVar = INSTANCE;
            aVar.launchOnIO(new l(null));
            aVar.launchOnDefault(new m(null));
            aVar.launchOnSerialIO(new n(null));
        } catch (Throwable th) {
            synchronized (prewarmLock) {
                prewarmStarted = false;
                com.onesignal.debug.internal.logging.b.warn("OneSignalDispatchers.prewarm failed: " + th.getMessage(), th);
            }
        }
    }

    public final String executorStatus$com_onesignal_core(String name, InterfaceC0732a isShutdown) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(isShutdown, "isShutdown");
        try {
            return ((Boolean) isShutdown.invoke()).booleanValue() ? "Shutdown" : "Active";
        } catch (Exception e4) {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(" Not initialized ");
            String message = e4.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            sb.append(message);
            return sb.toString();
        }
    }

    public final AbstractC0161v getDefault() {
        return pools.getDefault();
    }

    public final AbstractC0161v getIO() {
        return pools.getIO();
    }

    public final String getPerformanceMetrics$com_onesignal_core() {
        String str;
        BlockingQueue<Runnable> queue;
        try {
            b bVar = pools;
            ExecutorService serialIOExecutor = bVar.getSerialIOExecutor();
            ThreadPoolExecutor threadPoolExecutor = serialIOExecutor instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) serialIOExecutor : null;
            if (threadPoolExecutor == null || (queue = threadPoolExecutor.getQueue()) == null || (str = Integer.valueOf(queue.size()).toString()) == null) {
                str = "n/a";
            }
            ExecutorService serialIOExecutor2 = bVar.getSerialIOExecutor();
            ThreadPoolExecutor threadPoolExecutor2 = serialIOExecutor2 instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) serialIOExecutor2 : null;
            return F5.k.y("\n            OneSignalDispatchers Performance Metrics:\n            - IO Pool: " + bVar.getIoExecutor().getActiveCount() + '/' + bVar.getIoExecutor().getCorePoolSize() + " active/core threads\n            - IO Queue: " + bVar.getIoExecutor().getQueue().size() + " pending tasks\n            - Default Pool: " + bVar.getDefaultExecutor().getActiveCount() + '/' + bVar.getDefaultExecutor().getCorePoolSize() + " active/core threads\n            - Default Queue: " + bVar.getDefaultExecutor().getQueue().size() + " pending tasks\n            - SerialIO Queue: " + str + " pending tasks\n            - Total completed tasks: " + (bVar.getIoExecutor().getCompletedTaskCount() + bVar.getDefaultExecutor().getCompletedTaskCount() + (threadPoolExecutor2 != null ? threadPoolExecutor2.getCompletedTaskCount() : 0L)) + "\n            - Memory usage: ~" + ((bVar.getIoExecutor().getActiveCount() + bVar.getDefaultExecutor().getActiveCount() + 1) * 1024) + "KB (thread stacks, ~1MB each)\n            ");
        } catch (Exception e4) {
            return "OneSignalDispatchers not initialized or using fallback dispatchers " + e4.getMessage();
        }
    }

    public final AbstractC0161v getSerialIO() {
        return pools.getSerialIO();
    }

    public final String getStatus$com_onesignal_core() {
        b bVar = pools;
        return F5.k.y("\n            OneSignalDispatchers Status:\n            - IO Executor: " + executorStatus$com_onesignal_core("ioExecutor", new c(bVar)) + "\n            - Default Executor: " + executorStatus$com_onesignal_core("defaultExecutor", new d(bVar)) + "\n            - SerialIO Executor: " + executorStatus$com_onesignal_core("serialIOExecutor", new e(bVar)) + "\n            - IO Scope: " + scopeStatus$com_onesignal_core("IOScope", new f(bVar)) + "\n            - Default Scope: " + scopeStatus$com_onesignal_core("DefaultScope", new g(bVar)) + "\n            - SerialIO Scope: " + scopeStatus$com_onesignal_core("SerialIOScope", new h(bVar)) + "\n        ");
    }

    public final X launchOnDefault(InterfaceC0743l block) {
        kotlin.jvm.internal.i.e(block, "block");
        return AbstractC0165z.l(pools.getDefaultScope(), null, new i(block, null), 3);
    }

    public final X launchOnIO(InterfaceC0743l block) {
        kotlin.jvm.internal.i.e(block, "block");
        return AbstractC0165z.l(pools.getIOScope(), null, new j(block, null), 3);
    }

    public final X launchOnSerialIO(InterfaceC0743l block) {
        kotlin.jvm.internal.i.e(block, "block");
        return AbstractC0165z.l(pools.getSerialIOScope(), null, new k(block, null), 3);
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
            try {
                Thread thread = new Thread(new J0.a(1), "OneSignal-prewarm");
                thread.setDaemon(true);
                thread.setPriority(3);
                thread.start();
            } catch (Throwable th) {
                synchronized (prewarmLock) {
                    prewarmStarted = false;
                    com.onesignal.debug.internal.logging.b.warn("OneSignalDispatchers.prewarm failed to start daemon: " + th.getMessage(), th);
                }
            }
        }
    }

    public final void resetForTest$com_onesignal_core() {
        b bVar = pools;
        pools = new b();
        try {
            bVar.shutdown();
        } catch (Exception e4) {
            com.onesignal.debug.internal.logging.b.error("OneSignalDispatchers.resetForTest failed: " + e4.getMessage(), e4);
        }
        resetPrewarmForTest$com_onesignal_core();
    }

    public final void resetPrewarmForTest$com_onesignal_core() {
        synchronized (prewarmLock) {
            prewarmStarted = false;
        }
    }

    public final String scopeStatus$com_onesignal_core(String name, InterfaceC0732a isActive) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(isActive, "isActive");
        try {
            return ((Boolean) isActive.invoke()).booleanValue() ? "Active" : "Cancelled";
        } catch (Exception e4) {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(" Not initialized ");
            String message = e4.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            sb.append(message);
            return sb.toString();
        }
    }

    /* renamed from: com.onesignal.common.threading.a$a, reason: collision with other inner class name */
    public static final class ThreadFactoryC0008a implements ThreadFactory {
        private final String namePrefix;
        private final int priority;
        private final AtomicInteger threadNumber;

        public ThreadFactoryC0008a(String namePrefix, int i7) {
            kotlin.jvm.internal.i.e(namePrefix, "namePrefix");
            this.namePrefix = namePrefix;
            this.priority = i7;
            this.threadNumber = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r6) {
            kotlin.jvm.internal.i.e(r6, "r");
            Thread thread = new Thread(r6, this.namePrefix + '-' + this.threadNumber.getAndIncrement());
            thread.setDaemon(true);
            thread.setPriority(this.priority);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC0008a(String str, int i7, int i8, kotlin.jvm.internal.e eVar) {
            this(str, (i8 & 2) != 0 ? 5 : i7);
        }
    }
}
