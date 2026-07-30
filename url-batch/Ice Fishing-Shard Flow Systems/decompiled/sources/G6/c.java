package G6;

import B.f;
import E6.e;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f852a;

    /* renamed from: b, reason: collision with root package name */
    public final String f853b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f854c;

    /* renamed from: d, reason: collision with root package name */
    public a f855d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f856e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f857f;

    public c(d taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f852a = taskRunner;
        this.f853b = name;
        this.f856e = new ArrayList();
    }

    public static void c(c cVar, String name, Function0 block) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        cVar.d(new b(name, block), 0L);
    }

    public final void a() {
        d dVar = this.f852a;
        TimeZone timeZone = e.f712a;
        synchronized (dVar) {
            try {
                if (b()) {
                    this.f852a.c(this);
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f855d;
        if (aVar != null && aVar.f847b) {
            this.f857f = true;
        }
        ArrayList arrayList = this.f856e;
        boolean z7 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f847b) {
                Logger logger = this.f852a.f861b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    d4.c.d(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z7 = true;
            }
        }
        return z7;
    }

    public final void d(a task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f852a) {
            if (!this.f854c) {
                if (e(task, j, false)) {
                    this.f852a.c(this);
                }
                Unit unit = Unit.f6114a;
            } else if (task.f847b) {
                Logger logger = this.f852a.f861b;
                if (logger.isLoggable(Level.FINE)) {
                    d4.c.d(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f852a.f861b;
                if (logger2.isLoggable(Level.FINE)) {
                    d4.c.d(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(a task, long j, boolean z7) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        c cVar = task.f848c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f848c = this;
        }
        d dVar = this.f852a;
        f fVar = dVar.f860a;
        Logger logger = dVar.f861b;
        long nanoTime = System.nanoTime();
        long j7 = nanoTime + j;
        ArrayList arrayList = this.f856e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f849d <= j7) {
                if (logger.isLoggable(Level.FINE)) {
                    d4.c.d(logger, task, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.f849d = j7;
        if (logger.isLoggable(Level.FINE)) {
            d4.c.d(logger, task, this, z7 ? "run again after ".concat(d4.c.p(j7 - nanoTime)) : "scheduled after ".concat(d4.c.p(j7 - nanoTime)));
        }
        int size = arrayList.size();
        int i2 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i2 = -1;
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            if (((a) obj).f849d - nanoTime > j) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            i2 = arrayList.size();
        }
        arrayList.add(i2, task);
        return i2 == 0;
    }

    public final void f() {
        d dVar = this.f852a;
        TimeZone timeZone = e.f712a;
        synchronized (dVar) {
            try {
                this.f854c = true;
                if (b()) {
                    this.f852a.c(this);
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f853b;
    }
}
