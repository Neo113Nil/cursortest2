package a6;

import W4.o;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f3173k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f3174l;

    /* renamed from: a, reason: collision with root package name */
    public final d f3175a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f3176b;

    /* renamed from: c, reason: collision with root package name */
    public int f3177c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3178d;

    /* renamed from: e, reason: collision with root package name */
    public long f3179e;

    /* renamed from: f, reason: collision with root package name */
    public int f3180f;

    /* renamed from: g, reason: collision with root package name */
    public int f3181g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3182h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3183i;

    /* renamed from: j, reason: collision with root package name */
    public final A.b f3184j;

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        i.d(logger, "getLogger(...)");
        f3173k = logger;
        String name = Y5.e.f3103b + " TaskRunner";
        i.e(name, "name");
        Y5.d dVar = new Y5.d(name, true);
        d dVar2 = new d();
        dVar2.f3172f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), dVar);
        f3174l = new e(dVar2);
    }

    public e(d dVar) {
        Logger logger = f3173k;
        i.e(logger, "logger");
        this.f3175a = dVar;
        this.f3176b = logger;
        this.f3177c = 10000;
        this.f3182h = new ArrayList();
        this.f3183i = new ArrayList();
        this.f3184j = new A.b(11, this);
    }

    public static final void a(e eVar, a aVar, long j4, boolean z5) {
        TimeZone timeZone = Y5.e.f3102a;
        c cVar = aVar.f3162c;
        i.b(cVar);
        if (cVar.f3169d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z6 = cVar.f3171f;
        cVar.f3171f = false;
        cVar.f3169d = null;
        eVar.f3182h.remove(cVar);
        if (j4 != -1 && !z6 && !cVar.f3168c) {
            cVar.e(aVar, j4, true);
        }
        if (cVar.f3170e.isEmpty()) {
            return;
        }
        eVar.f3183i.add(cVar);
        if (z5) {
            return;
        }
        eVar.e();
    }

    public final a b() {
        long j4;
        a aVar;
        boolean z5;
        TimeZone timeZone = Y5.e.f3102a;
        while (true) {
            ArrayList arrayList = this.f3183i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j7 = Long.MAX_VALUE;
            int i7 = 0;
            a aVar2 = null;
            while (true) {
                if (i7 >= size) {
                    j4 = nanoTime;
                    aVar = null;
                    z5 = false;
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                a aVar3 = (a) ((c) obj).f3170e.get(0);
                j4 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f3163d - j4);
                if (max > 0) {
                    j7 = Math.min(max, j7);
                } else {
                    if (aVar2 != null) {
                        z5 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j4;
            }
            ArrayList arrayList2 = this.f3182h;
            if (aVar2 != null) {
                TimeZone timeZone2 = Y5.e.f3102a;
                aVar2.f3163d = -1L;
                c cVar = aVar2.f3162c;
                i.b(cVar);
                cVar.f3170e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f3169d = aVar2;
                arrayList2.add(cVar);
                if (z5 || (!this.f3178d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar2;
            }
            if (this.f3178d) {
                if (j7 >= this.f3179e - j4) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f3178d = true;
            this.f3179e = j4 + j7;
            try {
                try {
                    TimeZone timeZone3 = Y5.e.f3102a;
                    if (j7 > 0) {
                        long j8 = j7 / 1000000;
                        long j9 = j7 - (1000000 * j8);
                        if (j8 > 0 || j7 > 0) {
                            wait(j8, (int) j9);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = Y5.e.f3102a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.b();
                        if (cVar2.f3170e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f3178d = false;
            }
        }
    }

    public final void c(c taskQueue) {
        i.e(taskQueue, "taskQueue");
        TimeZone timeZone = Y5.e.f3102a;
        if (taskQueue.f3169d == null) {
            boolean isEmpty = taskQueue.f3170e.isEmpty();
            ArrayList arrayList = this.f3183i;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = Y5.c.f3099a;
                i.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f3178d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i7;
        synchronized (this) {
            i7 = this.f3177c;
            this.f3177c = i7 + 1;
        }
        return new c(this, o.c("Q", i7));
    }

    public final void e() {
        TimeZone timeZone = Y5.e.f3102a;
        int i7 = this.f3180f;
        if (i7 > this.f3181g) {
            return;
        }
        this.f3180f = i7 + 1;
        A.b runnable = this.f3184j;
        i.e(runnable, "runnable");
        ((ThreadPoolExecutor) this.f3175a.f3172f).execute(runnable);
    }
}
