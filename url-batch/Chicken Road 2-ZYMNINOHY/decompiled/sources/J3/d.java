package J3;

import a2.i;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import t1.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final i f1208h = new i(12);

    /* renamed from: i, reason: collision with root package name */
    public static final d f1209i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f1210j;

    /* renamed from: a, reason: collision with root package name */
    public final h f1211a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1213c;

    /* renamed from: d, reason: collision with root package name */
    public long f1214d;

    /* renamed from: b, reason: collision with root package name */
    public int f1212b = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1215e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1216f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final B.b f1217g = new B.b(5, this);

    static {
        String name = kotlin.jvm.internal.i.h(" TaskRunner", H3.b.f1108f);
        kotlin.jvm.internal.i.e(name, "name");
        f1209i = new d(new h(new H3.a(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        kotlin.jvm.internal.i.d(logger, "getLogger(TaskRunner::class.java.name)");
        f1210j = logger;
    }

    public d(h hVar) {
        this.f1211a = hVar;
    }

    public static final void a(d dVar, a aVar) {
        byte[] bArr = H3.b.f1103a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f1196a);
        try {
            long a3 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a3);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j4) {
        byte[] bArr = H3.b.f1103a;
        c cVar = aVar.f1198c;
        kotlin.jvm.internal.i.b(cVar);
        if (cVar.f1205d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = cVar.f1207f;
        cVar.f1207f = false;
        cVar.f1205d = null;
        this.f1215e.remove(cVar);
        if (j4 != -1 && !z && !cVar.f1204c) {
            cVar.d(aVar, j4, true);
        }
        if (cVar.f1206e.isEmpty()) {
            return;
        }
        this.f1216f.add(cVar);
    }

    public final a c() {
        long j4;
        a aVar;
        boolean z;
        byte[] bArr = H3.b.f1103a;
        while (true) {
            ArrayList arrayList = this.f1216f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j5 = Long.MAX_VALUE;
            int i4 = 0;
            a aVar2 = null;
            while (true) {
                if (i4 >= size) {
                    j4 = nanoTime;
                    aVar = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                a aVar3 = (a) ((c) obj).f1206e.get(0);
                j4 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f1199d - j4);
                if (max > 0) {
                    j5 = Math.min(max, j5);
                } else {
                    if (aVar2 != null) {
                        z = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j4;
            }
            ArrayList arrayList2 = this.f1215e;
            if (aVar2 != null) {
                byte[] bArr2 = H3.b.f1103a;
                aVar2.f1199d = -1L;
                c cVar = aVar2.f1198c;
                kotlin.jvm.internal.i.b(cVar);
                cVar.f1206e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f1205d = aVar2;
                arrayList2.add(cVar);
                if (z || (!this.f1213c && !arrayList.isEmpty())) {
                    B.b runnable = this.f1217g;
                    kotlin.jvm.internal.i.e(runnable, "runnable");
                    ((ThreadPoolExecutor) this.f1211a.f15398b).execute(runnable);
                }
                return aVar2;
            }
            if (this.f1213c) {
                if (j5 >= this.f1214d - j4) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f1213c = true;
            this.f1214d = j4 + j5;
            try {
                try {
                    long j6 = j5 / 1000000;
                    long j7 = j5 - (1000000 * j6);
                    if (j6 > 0 || j5 > 0) {
                        wait(j6, (int) j7);
                    }
                } catch (InterruptedException unused) {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i5 = size2 - 1;
                            ((c) arrayList2.get(size2)).b();
                            if (i5 < 0) {
                                break;
                            }
                            size2 = i5;
                        }
                    }
                    int size3 = arrayList.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i6 = size3 - 1;
                            c cVar2 = (c) arrayList.get(size3);
                            cVar2.b();
                            if (cVar2.f1206e.isEmpty()) {
                                arrayList.remove(size3);
                            }
                            if (i6 < 0) {
                                break;
                            }
                            size3 = i6;
                        }
                    }
                }
            } finally {
                this.f1213c = false;
            }
        }
    }

    public final void d(c taskQueue) {
        kotlin.jvm.internal.i.e(taskQueue, "taskQueue");
        byte[] bArr = H3.b.f1103a;
        if (taskQueue.f1205d == null) {
            boolean isEmpty = taskQueue.f1206e.isEmpty();
            ArrayList arrayList = this.f1216f;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                kotlin.jvm.internal.i.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f1213c) {
            notify();
            return;
        }
        B.b runnable = this.f1217g;
        kotlin.jvm.internal.i.e(runnable, "runnable");
        ((ThreadPoolExecutor) this.f1211a.f15398b).execute(runnable);
    }

    public final c e() {
        int i4;
        synchronized (this) {
            i4 = this.f1212b;
            this.f1212b = i4 + 1;
        }
        return new c(this, kotlin.jvm.internal.i.h(Integer.valueOf(i4), "Q"));
    }
}
