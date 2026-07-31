package a6;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f3166a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3167b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3168c;

    /* renamed from: d, reason: collision with root package name */
    public a f3169d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3170e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3171f;

    public c(e eVar, String name) {
        i.e(name, "name");
        this.f3166a = eVar;
        this.f3167b = name;
        this.f3170e = new ArrayList();
    }

    public static void c(c cVar, String name, InterfaceC0732a block) {
        cVar.getClass();
        i.e(name, "name");
        i.e(block, "block");
        cVar.d(new b(name, block), 0L);
    }

    public final void a() {
        e eVar = this.f3166a;
        TimeZone timeZone = Y5.e.f3102a;
        synchronized (eVar) {
            if (b()) {
                this.f3166a.c(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f3169d;
        if (aVar != null && aVar.f3161b) {
            this.f3171f = true;
        }
        ArrayList arrayList = this.f3170e;
        boolean z5 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3161b) {
                Logger logger = this.f3166a.f3176b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0676f.a(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z5 = true;
            }
        }
        return z5;
    }

    public final void d(a task, long j4) {
        i.e(task, "task");
        synchronized (this.f3166a) {
            if (!this.f3168c) {
                if (e(task, j4, false)) {
                    this.f3166a.c(this);
                }
            } else if (task.f3161b) {
                Logger logger = this.f3166a.f3176b;
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0676f.a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f3166a.f3176b;
                if (logger2.isLoggable(Level.FINE)) {
                    AbstractC0676f.a(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(a task, long j4, boolean z5) {
        Logger logger = this.f3166a.f3176b;
        i.e(task, "task");
        c cVar = task.f3162c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f3162c = this;
        }
        long nanoTime = System.nanoTime();
        long j7 = nanoTime + j4;
        ArrayList arrayList = this.f3170e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f3163d <= j7) {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0676f.a(logger, task, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.f3163d = j7;
        if (logger.isLoggable(Level.FINE)) {
            AbstractC0676f.a(logger, task, this, z5 ? "run again after ".concat(AbstractC0676f.g(j7 - nanoTime)) : "scheduled after ".concat(AbstractC0676f.g(j7 - nanoTime)));
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i7 = -1;
                break;
            }
            Object obj = arrayList.get(i8);
            i8++;
            if (((a) obj).f3163d - nanoTime > j4) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            i7 = arrayList.size();
        }
        arrayList.add(i7, task);
        return i7 == 0;
    }

    public final void f() {
        e eVar = this.f3166a;
        TimeZone timeZone = Y5.e.f3102a;
        synchronized (eVar) {
            this.f3168c = true;
            if (b()) {
                this.f3166a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f3167b;
    }
}
