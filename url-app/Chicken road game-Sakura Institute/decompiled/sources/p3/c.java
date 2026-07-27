package p3;

import f1.C0607a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.z;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f9122a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9123b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9124c;

    /* renamed from: d, reason: collision with root package name */
    public a f9125d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9126e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9127f;

    public c(d taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f9122a = taskRunner;
        this.f9123b = name;
        this.f9126e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = n3.b.f8558a;
        synchronized (this.f9122a) {
            try {
                if (b()) {
                    this.f9122a.d(this);
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f9125d;
        if (aVar != null && aVar.f9117b) {
            this.f9127f = true;
        }
        ArrayList arrayList = this.f9126e;
        boolean z4 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f9117b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.f9129i.isLoggable(Level.FINE)) {
                    z.e(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    public final void c(a task, long j4) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f9122a) {
            if (!this.f9124c) {
                if (d(task, j4, false)) {
                    this.f9122a.d(this);
                }
                Unit unit = Unit.f7487a;
            } else if (task.f9117b) {
                if (d.f9129i.isLoggable(Level.FINE)) {
                    z.e(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.f9129i.isLoggable(Level.FINE)) {
                    z.e(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a task, long j4, boolean z4) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        c cVar = task.f9118c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f9118c = this;
        }
        C0607a c0607a = this.f9122a.f9130a;
        long nanoTime = System.nanoTime();
        long j5 = nanoTime + j4;
        ArrayList arrayList = this.f9126e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f9119d <= j5) {
                if (d.f9129i.isLoggable(Level.FINE)) {
                    z.e(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f9119d = j5;
        if (d.f9129i.isLoggable(Level.FINE)) {
            z.e(task, this, z4 ? "run again after ".concat(z.l(j5 - nanoTime)) : "scheduled after ".concat(z.l(j5 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((a) it.next()).f9119d - nanoTime > j4) {
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

    public final void e() {
        byte[] bArr = n3.b.f8558a;
        synchronized (this.f9122a) {
            try {
                this.f9124c = true;
                if (b()) {
                    this.f9122a.d(this);
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f9123b;
    }
}
