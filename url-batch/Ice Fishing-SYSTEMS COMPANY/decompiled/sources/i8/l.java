package i8;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l implements i {

    /* renamed from: n, reason: collision with root package name */
    public final x f38378n;

    /* renamed from: u, reason: collision with root package name */
    public final h8.e f38379u;

    /* renamed from: v, reason: collision with root package name */
    public final long f38380v;

    /* renamed from: w, reason: collision with root package name */
    public long f38381w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f38382x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedBlockingDeque f38383y;

    public l(x xVar, h8.e taskRunner) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        this.f38378n = xVar;
        this.f38379u = taskRunner;
        this.f38380v = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f38381w = Long.MIN_VALUE;
        this.f38382x = new CopyOnWriteArrayList();
        this.f38383y = new LinkedBlockingDeque();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38382x;
        Iterator it = copyOnWriteArrayList.iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            w wVar = (w) it.next();
            wVar.cancel();
            w a9 = wVar.a();
            if (a9 != null) {
                this.f38378n.e().addLast(a9);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final v b() {
        w jVar;
        x xVar = this.f38378n;
        if (xVar.a(null)) {
            try {
                jVar = xVar.g();
            } catch (Throwable th) {
                jVar = new j(th);
            }
            if (jVar.isReady()) {
                return new v(jVar, (Throwable) null, 6);
            }
            if (jVar instanceof j) {
                return ((j) jVar).f38375a;
            }
            this.f38382x.add(jVar);
            this.f38379u.d().d(new k(f8.d.f37816b + " connect " + xVar.c().f37351h.f(), jVar, this), 0L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[SYNTHETIC] */
    @Override // i8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r f() {
        v b9;
        Throwable th;
        e eVar;
        IOException iOException = null;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f38382x;
            try {
                boolean isEmpty = copyOnWriteArrayList.isEmpty();
                x xVar = this.f38378n;
                if (isEmpty && !xVar.a(null)) {
                    a();
                    kotlin.jvm.internal.h.b(iOException);
                    throw iOException;
                }
                if (xVar.d()) {
                    throw new IOException("Canceled");
                }
                h8.d dVar = this.f38379u.f38264a;
                long nanoTime = System.nanoTime();
                long j9 = this.f38381w - nanoTime;
                if (!copyOnWriteArrayList.isEmpty() && j9 > 0) {
                    b9 = null;
                    if (b9 != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (!copyOnWriteArrayList.isEmpty() && (b9 = (v) this.f38383y.poll(j9, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(b9.f38445a);
                            if (b9 != null) {
                            }
                        }
                        b9 = null;
                        if (b9 != null) {
                        }
                    }
                    w wVar = b9.f38445a;
                    boolean z8 = false;
                    if (b9.f38446b != null && b9.f38447c == null) {
                        a();
                        if (!wVar.isReady()) {
                            b9 = wVar.f();
                        }
                        if (b9.f38446b == null && b9.f38447c == null) {
                            z8 = true;
                        }
                        if (z8) {
                            r b10 = b9.f38445a.b();
                            a();
                            return b10;
                        }
                    }
                    th = b9.f38447c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            com.bumptech.glide.d.b(iOException, th);
                        }
                    }
                    eVar = b9.f38446b;
                    if (eVar == null) {
                        xVar.e().addFirst(eVar);
                    }
                }
                b9 = b();
                j9 = this.f38380v;
                this.f38381w = nanoTime + j9;
                if (b9 != null) {
                }
                w wVar2 = b9.f38445a;
                boolean z82 = false;
                if (b9.f38446b != null && b9.f38447c == null) {
                }
                th = b9.f38447c;
                if (th != null) {
                }
                eVar = b9.f38446b;
                if (eVar == null) {
                }
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    @Override // i8.i
    public final x j() {
        return this.f38378n;
    }
}
