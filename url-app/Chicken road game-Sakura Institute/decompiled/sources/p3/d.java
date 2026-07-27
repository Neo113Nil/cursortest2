package p3;

import A.AbstractC0017m;
import G1.j;
import f1.C0607a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final d f9128h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f9129i;

    /* renamed from: a, reason: collision with root package name */
    public final C0607a f9130a;

    /* renamed from: b, reason: collision with root package name */
    public int f9131b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9132c;

    /* renamed from: d, reason: collision with root package name */
    public long f9133d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9134e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9135f;

    /* renamed from: g, reason: collision with root package name */
    public final j f9136g;

    static {
        String name = n3.b.f8564g + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        f9128h = new d(new C0607a(new n3.a(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f9129i = logger;
    }

    public d(C0607a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f9130a = backend;
        this.f9131b = 10000;
        this.f9134e = new ArrayList();
        this.f9135f = new ArrayList();
        this.f9136g = new j(8, this);
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = n3.b.f8558a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f9116a);
        try {
            long a4 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a4);
                Unit unit = Unit.f7487a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                Unit unit2 = Unit.f7487a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j4) {
        byte[] bArr = n3.b.f8558a;
        c cVar = aVar.f9118c;
        Intrinsics.c(cVar);
        if (cVar.f9125d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z4 = cVar.f9127f;
        cVar.f9127f = false;
        cVar.f9125d = null;
        this.f9134e.remove(cVar);
        if (j4 != -1 && !z4 && !cVar.f9124c) {
            cVar.d(aVar, j4, true);
        }
        if (cVar.f9126e.isEmpty()) {
            return;
        }
        this.f9135f.add(cVar);
    }

    public final a c() {
        boolean z4;
        d taskRunner = this;
        byte[] bArr = n3.b.f8558a;
        while (true) {
            ArrayList arrayList = taskRunner.f9135f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0607a c0607a = taskRunner.f9130a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j4 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    taskRunner = this;
                    z4 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f9126e.get(0);
                long max = Math.max(0L, aVar2.f9119d - nanoTime);
                if (max > 0) {
                    j4 = Math.min(max, j4);
                } else {
                    if (aVar != null) {
                        taskRunner = this;
                        z4 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = taskRunner.f9134e;
            if (aVar != null) {
                byte[] bArr2 = n3.b.f8558a;
                aVar.f9119d = -1L;
                c cVar = aVar.f9118c;
                Intrinsics.c(cVar);
                cVar.f9126e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f9125d = aVar;
                arrayList2.add(cVar);
                if (z4 || (!taskRunner.f9132c && !arrayList.isEmpty())) {
                    j runnable = taskRunner.f9136g;
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    ((ThreadPoolExecutor) c0607a.f6561e).execute(runnable);
                }
                return aVar;
            }
            if (taskRunner.f9132c) {
                if (j4 < taskRunner.f9133d - nanoTime) {
                    Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
                    notify();
                }
                return null;
            }
            taskRunner.f9132c = true;
            taskRunner.f9133d = nanoTime + j4;
            try {
                try {
                    Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
                    long j5 = j4 / 1000000;
                    long j6 = j4 - (1000000 * j5);
                    if (j5 > 0 || j4 > 0) {
                        taskRunner.wait(j5, (int) j6);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    int i2 = -1;
                    for (int size2 = arrayList.size() - 1; i2 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f9126e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                taskRunner.f9132c = false;
            }
        }
    }

    public final void d(c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = n3.b.f8558a;
        if (taskQueue.f9125d == null) {
            boolean isEmpty = taskQueue.f9126e.isEmpty();
            ArrayList arrayList = this.f9135f;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z4 = this.f9132c;
        C0607a c0607a = this.f9130a;
        if (z4) {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        } else {
            j runnable = this.f9136g;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            ((ThreadPoolExecutor) c0607a.f6561e).execute(runnable);
        }
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f9131b;
            this.f9131b = i2 + 1;
        }
        return new c(this, AbstractC0017m.g(i2, "Q"));
    }
}
