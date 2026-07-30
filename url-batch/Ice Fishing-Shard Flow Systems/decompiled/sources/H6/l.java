package H6;

import R5.C0164d;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    public final x f1058a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.d f1059b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1060c;

    /* renamed from: d, reason: collision with root package name */
    public long f1061d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f1062e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingDeque f1063f;

    public l(x routePlanner, G6.d taskRunner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f1058a = routePlanner;
        this.f1059b = taskRunner;
        this.f1060c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f1061d = Long.MIN_VALUE;
        this.f1062e = new CopyOnWriteArrayList();
        B.f fVar = taskRunner.f860a;
        LinkedBlockingDeque queue = new LinkedBlockingDeque();
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.f1063f = queue;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0004, B:6:0x000c, B:12:0x001d, B:14:0x0023, B:21:0x0048, B:65:0x0052, B:68:0x005d, B:26:0x0065, B:28:0x006d, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:42:0x008e, B:45:0x0098, B:47:0x009c, B:50:0x00a2, B:51:0x00a6, B:53:0x00aa, B:54:0x00ab, B:57:0x00af, B:70:0x003d, B:72:0x00b8, B:73:0x00bf), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0004, B:6:0x000c, B:12:0x001d, B:14:0x0023, B:21:0x0048, B:65:0x0052, B:68:0x005d, B:26:0x0065, B:28:0x006d, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:42:0x008e, B:45:0x0098, B:47:0x009c, B:50:0x00a2, B:51:0x00a6, B:53:0x00aa, B:54:0x00ab, B:57:0x00af, B:70:0x003d, B:72:0x00b8, B:73:0x00bf), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0004, B:6:0x000c, B:12:0x001d, B:14:0x0023, B:21:0x0048, B:65:0x0052, B:68:0x005d, B:26:0x0065, B:28:0x006d, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:42:0x008e, B:45:0x0098, B:47:0x009c, B:50:0x00a2, B:51:0x00a6, B:53:0x00aa, B:54:0x00ab, B:57:0x00af, B:70:0x003d, B:72:0x00b8, B:73:0x00bf), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0065 A[SYNTHETIC] */
    @Override // H6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a() {
        v d7;
        Throwable th;
        w wVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1062e;
        IOException iOException = null;
        while (true) {
            try {
                boolean isEmpty = copyOnWriteArrayList.isEmpty();
                x xVar = this.f1058a;
                if (isEmpty && !xVar.b(null)) {
                    b();
                    Intrinsics.b(iOException);
                    throw iOException;
                }
                if (xVar.g()) {
                    throw new IOException("Canceled");
                }
                B.f fVar = this.f1059b.f860a;
                long nanoTime = System.nanoTime();
                long j = this.f1061d - nanoTime;
                if (!copyOnWriteArrayList.isEmpty() && j > 0) {
                    d7 = null;
                    if (d7 != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (!copyOnWriteArrayList.isEmpty() && (d7 = (v) this.f1063f.poll(j, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(d7.f1122a);
                            if (d7 != null) {
                            }
                        }
                        d7 = null;
                        if (d7 != null) {
                        }
                    }
                    w wVar2 = d7.f1122a;
                    boolean z7 = false;
                    if (d7.f1123b != null && d7.f1124c == null) {
                        b();
                        if (!wVar2.e()) {
                            d7 = wVar2.b();
                        }
                        if (d7.f1123b == null && d7.f1124c == null) {
                            z7 = true;
                        }
                        if (z7) {
                            return d7.f1122a.c();
                        }
                    }
                    th = d7.f1124c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            C0164d.a(iOException, th);
                        }
                    }
                    wVar = d7.f1123b;
                    if (wVar == null) {
                        xVar.d().addFirst(wVar);
                    }
                }
                d7 = d();
                j = this.f1060c;
                this.f1061d = nanoTime + j;
                if (d7 != null) {
                }
                w wVar22 = d7.f1122a;
                boolean z72 = false;
                if (d7.f1123b != null && d7.f1124c == null) {
                }
                th = d7.f1124c;
                if (th != null) {
                }
                wVar = d7.f1123b;
                if (wVar == null) {
                }
            } finally {
                b();
            }
        }
    }

    public final void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1062e;
        Iterator it = copyOnWriteArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            w wVar = (w) it.next();
            wVar.cancel();
            w a7 = wVar.a();
            if (a7 != null) {
                this.f1058a.d().addLast(a7);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // H6.i
    public final x c() {
        return this.f1058a;
    }

    public final v d() {
        w jVar;
        x xVar = this.f1058a;
        if (xVar.b(null)) {
            try {
                jVar = xVar.e();
            } catch (Throwable th) {
                jVar = new j(th);
            }
            if (jVar.e()) {
                return new v(jVar, (Throwable) null, 6);
            }
            if (jVar instanceof j) {
                return ((j) jVar).f1055a;
            }
            this.f1062e.add(jVar);
            this.f1059b.d().d(new k(E6.e.f713b + " connect " + xVar.f().f463h.f(), jVar, this), 0L);
        }
        return null;
    }
}
