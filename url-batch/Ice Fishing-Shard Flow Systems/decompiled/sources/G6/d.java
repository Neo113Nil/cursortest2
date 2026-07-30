package G6;

import B.f;
import C4.p;
import E6.e;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f858k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f859l;

    /* renamed from: a, reason: collision with root package name */
    public final f f860a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f861b;

    /* renamed from: c, reason: collision with root package name */
    public int f862c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f863d;

    /* renamed from: e, reason: collision with root package name */
    public long f864e;

    /* renamed from: f, reason: collision with root package name */
    public int f865f;

    /* renamed from: g, reason: collision with root package name */
    public int f866g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f867h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f868i;
    public final F.b j;

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f858k = logger;
        String name = e.f713b + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        f859l = new d(new f(new E6.d(name, true)));
    }

    public d(f backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        Logger logger = f858k;
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f860a = backend;
        this.f861b = logger;
        this.f862c = 10000;
        this.f867h = new ArrayList();
        this.f868i = new ArrayList();
        this.j = new F.b(2, this);
    }

    public static final void a(d dVar, a aVar, long j, boolean z7) {
        TimeZone timeZone = e.f712a;
        c cVar = aVar.f848c;
        Intrinsics.b(cVar);
        if (cVar.f855d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z8 = cVar.f857f;
        cVar.f857f = false;
        cVar.f855d = null;
        dVar.f867h.remove(cVar);
        if (j != -1 && !z8 && !cVar.f854c) {
            cVar.e(aVar, j, true);
        }
        if (cVar.f856e.isEmpty()) {
            return;
        }
        dVar.f868i.add(cVar);
        if (z7) {
            return;
        }
        dVar.e();
    }

    public final a b() {
        long j;
        a aVar;
        boolean z7;
        TimeZone timeZone = e.f712a;
        while (true) {
            ArrayList arrayList = this.f868i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j7 = Long.MAX_VALUE;
            int i2 = 0;
            a aVar2 = null;
            while (true) {
                if (i2 >= size) {
                    j = nanoTime;
                    aVar = null;
                    z7 = false;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                a aVar3 = (a) ((c) obj).f856e.get(0);
                j = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f849d - j);
                if (max > 0) {
                    j7 = Math.min(max, j7);
                } else {
                    if (aVar2 != null) {
                        z7 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.f867h;
            if (aVar2 != null) {
                TimeZone timeZone2 = e.f712a;
                aVar2.f849d = -1L;
                c cVar = aVar2.f848c;
                Intrinsics.b(cVar);
                cVar.f856e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f855d = aVar2;
                arrayList2.add(cVar);
                if (z7 || (!this.f863d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar2;
            }
            if (this.f863d) {
                if (j7 >= this.f864e - j) {
                    return aVar;
                }
                Intrinsics.checkNotNullParameter(this, "taskRunner");
                notify();
                return aVar;
            }
            this.f863d = true;
            this.f864e = j + j7;
            try {
                try {
                    Intrinsics.checkNotNullParameter(this, "taskRunner");
                    TimeZone timeZone3 = e.f712a;
                    if (j7 > 0) {
                        long j8 = j7 / 1000000;
                        long j9 = j7 - (1000000 * j8);
                        if (j8 > 0 || j7 > 0) {
                            wait(j8, (int) j9);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = e.f712a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.b();
                        if (cVar2.f856e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f863d = false;
            }
        }
    }

    public final void c(c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        TimeZone timeZone = e.f712a;
        if (taskQueue.f855d == null) {
            boolean isEmpty = taskQueue.f856e.isEmpty();
            ArrayList arrayList = this.f868i;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = E6.c.f709a;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (!this.f863d) {
            e();
        } else {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        }
    }

    public final c d() {
        int i2;
        synchronized (this) {
            i2 = this.f862c;
            this.f862c = i2 + 1;
        }
        return new c(this, p.g(i2, "Q"));
    }

    public final void e() {
        TimeZone timeZone = e.f712a;
        int i2 = this.f865f;
        if (i2 > this.f866g) {
            return;
        }
        this.f865f = i2 + 1;
        Intrinsics.checkNotNullParameter(this, "taskRunner");
        F.b runnable = this.j;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((ThreadPoolExecutor) this.f860a.f152e).execute(runnable);
    }
}
