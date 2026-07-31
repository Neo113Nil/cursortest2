package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata
/* loaded from: classes3.dex */
public final class TaskQueue {

    /* renamed from: a, reason: collision with root package name */
    private final TaskRunner f42708a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42709b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42710c;

    /* renamed from: d, reason: collision with root package name */
    private Task f42711d;

    /* renamed from: e, reason: collision with root package name */
    private final List f42712e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f42713f;

    @Metadata
    private static final class AwaitIdleTask extends Task {

        /* renamed from: e, reason: collision with root package name */
        private final CountDownLatch f42714e;

        public AwaitIdleTask() {
            super(Util.f42597i + " awaitIdle", false);
            this.f42714e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long f() {
            this.f42714e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f42708a = taskRunner;
        this.f42709b = name;
        this.f42712e = new ArrayList();
    }

    public static /* synthetic */ void j(TaskQueue taskQueue, Task task, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        taskQueue.i(task, j4);
    }

    public final void a() {
        if (Util.f42596h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f42708a) {
            try {
                if (b()) {
                    this.f42708a.h(this);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        Task task = this.f42711d;
        if (task != null) {
            Intrinsics.checkNotNull(task);
            if (task.a()) {
                this.f42713f = true;
            }
        }
        boolean z4 = false;
        for (int size = this.f42712e.size() - 1; -1 < size; size--) {
            if (((Task) this.f42712e.get(size)).a()) {
                Task task2 = (Task) this.f42712e.get(size);
                if (TaskRunner.f42717h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task2, this, "canceled");
                }
                this.f42712e.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    public final Task c() {
        return this.f42711d;
    }

    public final boolean d() {
        return this.f42713f;
    }

    public final List e() {
        return this.f42712e;
    }

    public final String f() {
        return this.f42709b;
    }

    public final boolean g() {
        return this.f42710c;
    }

    public final TaskRunner h() {
        return this.f42708a;
    }

    public final void i(Task task, long j4) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f42708a) {
            if (!this.f42710c) {
                if (k(task, j4, false)) {
                    this.f42708a.h(this);
                }
                Unit unit = Unit.f41027a;
            } else if (task.a()) {
                if (TaskRunner.f42717h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.f42717h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(Task task, long j4, boolean z4) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.e(this);
        long nanoTime = this.f42708a.g().nanoTime();
        long j5 = nanoTime + j4;
        int indexOf = this.f42712e.indexOf(task);
        if (indexOf != -1) {
            if (task.c() <= j5) {
                if (TaskRunner.f42717h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f42712e.remove(indexOf);
        }
        task.g(j5);
        if (TaskRunner.f42717h.a().isLoggable(Level.FINE)) {
            if (z4) {
                str = "run again after " + TaskLoggerKt.b(j5 - nanoTime);
            } else {
                str = "scheduled after " + TaskLoggerKt.b(j5 - nanoTime);
            }
            TaskLoggerKt.c(task, this, str);
        }
        Iterator it = this.f42712e.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (((Task) it.next()).c() - nanoTime > j4) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            i4 = this.f42712e.size();
        }
        this.f42712e.add(i4, task);
        return i4 == 0;
    }

    public final void l(Task task) {
        this.f42711d = task;
    }

    public final void m(boolean z4) {
        this.f42713f = z4;
    }

    public final void n() {
        if (Util.f42596h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f42708a) {
            try {
                this.f42710c = true;
                if (b()) {
                    this.f42708a.h(this);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f42709b;
    }
}
