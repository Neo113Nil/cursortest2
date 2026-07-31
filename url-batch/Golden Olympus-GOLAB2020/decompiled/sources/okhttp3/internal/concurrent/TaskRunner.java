package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata
/* loaded from: classes3.dex */
public final class TaskRunner {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f42717h = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final TaskRunner f42718i = new TaskRunner(new RealBackend(Util.M(Util.f42597i + " TaskRunner", true)));

    /* renamed from: j, reason: collision with root package name */
    private static final Logger f42719j;

    /* renamed from: a, reason: collision with root package name */
    private final Backend f42720a;

    /* renamed from: b, reason: collision with root package name */
    private int f42721b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42722c;

    /* renamed from: d, reason: collision with root package name */
    private long f42723d;

    /* renamed from: e, reason: collision with root package name */
    private final List f42724e;

    /* renamed from: f, reason: collision with root package name */
    private final List f42725f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f42726g;

    @Metadata
    public interface Backend {
        void a(TaskRunner taskRunner);

        void b(TaskRunner taskRunner, long j4);

        void execute(Runnable runnable);

        long nanoTime();
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return TaskRunner.f42719j;
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class RealBackend implements Backend {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f42727a;

        public RealBackend(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f42727a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void a(TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void b(TaskRunner taskRunner, long j4) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j5 = j4 / 1000000;
            long j6 = j4 - (1000000 * j5);
            if (j5 > 0 || j4 > 0) {
                taskRunner.wait(j5, (int) j6);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f42727a.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f42719j = logger;
    }

    public TaskRunner(Backend backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f42720a = backend;
        this.f42721b = 10000;
        this.f42724e = new ArrayList();
        this.f42725f = new ArrayList();
        this.f42726g = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task d4;
                long j4;
                while (true) {
                    TaskRunner taskRunner = TaskRunner.this;
                    synchronized (taskRunner) {
                        d4 = taskRunner.d();
                    }
                    if (d4 == null) {
                        return;
                    }
                    TaskQueue d5 = d4.d();
                    Intrinsics.checkNotNull(d5);
                    TaskRunner taskRunner2 = TaskRunner.this;
                    boolean isLoggable = TaskRunner.f42717h.a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j4 = d5.h().g().nanoTime();
                        TaskLoggerKt.c(d4, d5, "starting");
                    } else {
                        j4 = -1;
                    }
                    try {
                        try {
                            taskRunner2.j(d4);
                            Unit unit = Unit.f41027a;
                            if (isLoggable) {
                                TaskLoggerKt.c(d4, d5, "finished run in " + TaskLoggerKt.b(d5.h().g().nanoTime() - j4));
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            TaskLoggerKt.c(d4, d5, "failed a run in " + TaskLoggerKt.b(d5.h().g().nanoTime() - j4));
                        }
                        throw th;
                    }
                }
            }
        };
    }

    private final void c(Task task, long j4) {
        if (Util.f42596h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        TaskQueue d4 = task.d();
        Intrinsics.checkNotNull(d4);
        if (d4.c() != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean d5 = d4.d();
        d4.m(false);
        d4.l(null);
        this.f42724e.remove(d4);
        if (j4 != -1 && !d5 && !d4.g()) {
            d4.k(task, j4, true);
        }
        if (d4.e().isEmpty()) {
            return;
        }
        this.f42725f.add(d4);
    }

    private final void e(Task task) {
        if (Util.f42596h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.g(-1L);
        TaskQueue d4 = task.d();
        Intrinsics.checkNotNull(d4);
        d4.e().remove(task);
        this.f42725f.remove(d4);
        d4.l(task);
        this.f42724e.add(d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Task task) {
        if (Util.f42596h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(task.b());
        try {
            long f4 = task.f();
            synchronized (this) {
                c(task, f4);
                Unit unit = Unit.f41027a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                c(task, -1L);
                Unit unit2 = Unit.f41027a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final Task d() {
        boolean z4;
        if (Util.f42596h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f42725f.isEmpty()) {
            long nanoTime = this.f42720a.nanoTime();
            Iterator it = this.f42725f.iterator();
            long j4 = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                Task task2 = (Task) ((TaskQueue) it.next()).e().get(0);
                long max = Math.max(0L, task2.c() - nanoTime);
                if (max > 0) {
                    j4 = Math.min(max, j4);
                } else {
                    if (task != null) {
                        z4 = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                e(task);
                if (z4 || (!this.f42722c && !this.f42725f.isEmpty())) {
                    this.f42720a.execute(this.f42726g);
                }
                return task;
            }
            if (this.f42722c) {
                if (j4 < this.f42723d - nanoTime) {
                    this.f42720a.a(this);
                }
                return null;
            }
            this.f42722c = true;
            this.f42723d = nanoTime + j4;
            try {
                try {
                    this.f42720a.b(this, j4);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.f42722c = false;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f42724e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((TaskQueue) this.f42724e.get(size)).b();
            }
        }
        for (int size2 = this.f42725f.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = (TaskQueue) this.f42725f.get(size2);
            taskQueue.b();
            if (taskQueue.e().isEmpty()) {
                this.f42725f.remove(size2);
            }
        }
    }

    public final Backend g() {
        return this.f42720a;
    }

    public final void h(TaskQueue taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (Util.f42596h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f42725f.remove(taskQueue);
            } else {
                Util.c(this.f42725f, taskQueue);
            }
        }
        if (this.f42722c) {
            this.f42720a.a(this);
        } else {
            this.f42720a.execute(this.f42726g);
        }
    }

    public final TaskQueue i() {
        int i4;
        synchronized (this) {
            i4 = this.f42721b;
            this.f42721b = i4 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i4);
        return new TaskQueue(this, sb.toString());
    }
}
