package b6;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    public final x f3668a;

    /* renamed from: b, reason: collision with root package name */
    public final a6.e f3669b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3670c;

    /* renamed from: d, reason: collision with root package name */
    public long f3671d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f3672e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingDeque f3673f;

    public l(x xVar, a6.e taskRunner) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f3668a = xVar;
        this.f3669b = taskRunner;
        this.f3670c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f3671d = Long.MIN_VALUE;
        this.f3672e = new CopyOnWriteArrayList();
        this.f3673f = new LinkedBlockingDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0004, B:6:0x000c, B:12:0x001d, B:14:0x0023, B:21:0x0048, B:65:0x0052, B:68:0x005d, B:26:0x0065, B:28:0x006d, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:42:0x008e, B:45:0x0098, B:47:0x009c, B:50:0x00a2, B:51:0x00a6, B:53:0x00aa, B:54:0x00ab, B:57:0x00af, B:70:0x003d, B:72:0x00b8, B:73:0x00bf), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0004, B:6:0x000c, B:12:0x001d, B:14:0x0023, B:21:0x0048, B:65:0x0052, B:68:0x005d, B:26:0x0065, B:28:0x006d, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:42:0x008e, B:45:0x0098, B:47:0x009c, B:50:0x00a2, B:51:0x00a6, B:53:0x00aa, B:54:0x00ab, B:57:0x00af, B:70:0x003d, B:72:0x00b8, B:73:0x00bf), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0004, B:6:0x000c, B:12:0x001d, B:14:0x0023, B:21:0x0048, B:65:0x0052, B:68:0x005d, B:26:0x0065, B:28:0x006d, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:42:0x008e, B:45:0x0098, B:47:0x009c, B:50:0x00a2, B:51:0x00a6, B:53:0x00aa, B:54:0x00ab, B:57:0x00af, B:70:0x003d, B:72:0x00b8, B:73:0x00bf), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0065 A[SYNTHETIC] */
    @Override // b6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a() {
        v d7;
        Throwable th;
        w wVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3672e;
        IOException iOException = null;
        while (true) {
            try {
                boolean isEmpty = copyOnWriteArrayList.isEmpty();
                x xVar = this.f3668a;
                if (isEmpty && !xVar.e(null)) {
                    c();
                    kotlin.jvm.internal.i.b(iOException);
                    throw iOException;
                }
                if (xVar.h()) {
                    throw new IOException("Canceled");
                }
                a6.d dVar = this.f3669b.f3175a;
                long nanoTime = System.nanoTime();
                long j4 = this.f3671d - nanoTime;
                if (!copyOnWriteArrayList.isEmpty() && j4 > 0) {
                    d7 = null;
                    if (d7 != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (!copyOnWriteArrayList.isEmpty() && (d7 = (v) this.f3673f.poll(j4, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(d7.f3736a);
                            if (d7 != null) {
                            }
                        }
                        d7 = null;
                        if (d7 != null) {
                        }
                    }
                    w wVar2 = d7.f3736a;
                    boolean z5 = false;
                    if (d7.f3737b != null && d7.f3738c == null) {
                        c();
                        if (!wVar2.e()) {
                            d7 = wVar2.c();
                        }
                        if (d7.f3737b == null && d7.f3738c == null) {
                            z5 = true;
                        }
                        if (z5) {
                            return d7.f3736a.d();
                        }
                    }
                    th = d7.f3738c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            i6.g.a(iOException, th);
                        }
                    }
                    wVar = d7.f3737b;
                    if (wVar == null) {
                        xVar.c().addFirst(wVar);
                    }
                }
                d7 = d();
                j4 = this.f3670c;
                this.f3671d = nanoTime + j4;
                if (d7 != null) {
                }
                w wVar22 = d7.f3736a;
                boolean z52 = false;
                if (d7.f3737b != null && d7.f3738c == null) {
                }
                th = d7.f3738c;
                if (th != null) {
                }
                wVar = d7.f3737b;
                if (wVar == null) {
                }
            } finally {
                c();
            }
        }
    }

    @Override // b6.i
    public final x b() {
        return this.f3668a;
    }

    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3672e;
        Iterator it = copyOnWriteArrayList.iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            w wVar = (w) it.next();
            wVar.cancel();
            w a7 = wVar.a();
            if (a7 != null) {
                this.f3668a.c().addLast(a7);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final v d() {
        w jVar;
        x xVar = this.f3668a;
        if (xVar.e(null)) {
            try {
                jVar = xVar.d();
            } catch (Throwable th) {
                jVar = new j(th);
            }
            if (jVar.e()) {
                return new v(jVar, (Throwable) null, 6);
            }
            if (jVar instanceof j) {
                return ((j) jVar).f3665a;
            }
            this.f3672e.add(jVar);
            this.f3669b.d().d(new k(Y5.e.f3103b + " connect " + xVar.g().f2885h.f(), jVar, this), 0L);
        }
        return null;
    }
}
