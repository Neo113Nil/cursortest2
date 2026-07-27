package X4;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final y f3577a;

    /* renamed from: b, reason: collision with root package name */
    public final W4.d f3578b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3579c;

    /* renamed from: d, reason: collision with root package name */
    public long f3580d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f3581e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingDeque f3582f;

    public m(y yVar, W4.d taskRunner) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f3577a = yVar;
        this.f3578b = taskRunner;
        this.f3579c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f3580d = Long.MIN_VALUE;
        this.f3581e = new CopyOnWriteArrayList();
        this.f3582f = new LinkedBlockingDeque();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3581e;
        Iterator it = copyOnWriteArrayList.iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            x xVar = (x) it.next();
            xVar.cancel();
            x a6 = xVar.a();
            if (a6 != null) {
                this.f3577a.d().addLast(a6);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[SYNTHETIC] */
    @Override // X4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s b() {
        w d6;
        Throwable th;
        x xVar;
        IOException iOException = null;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3581e;
            try {
                boolean isEmpty = copyOnWriteArrayList.isEmpty();
                y yVar = this.f3577a;
                if (isEmpty && !yVar.f(null)) {
                    a();
                    kotlin.jvm.internal.i.b(iOException);
                    throw iOException;
                }
                if (yVar.h()) {
                    throw new IOException("Canceled");
                }
                V0.j jVar = this.f3578b.f3434a;
                long nanoTime = System.nanoTime();
                long j2 = this.f3580d - nanoTime;
                if (!copyOnWriteArrayList.isEmpty() && j2 > 0) {
                    d6 = null;
                    if (d6 != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (!copyOnWriteArrayList.isEmpty() && (d6 = (w) this.f3582f.poll(j2, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(d6.f3648a);
                            if (d6 != null) {
                            }
                        }
                        d6 = null;
                        if (d6 != null) {
                        }
                    }
                    x xVar2 = d6.f3648a;
                    boolean z = false;
                    if (d6.f3649b != null && d6.f3650c == null) {
                        a();
                        if (!xVar2.e()) {
                            d6 = xVar2.b();
                        }
                        if (d6.f3649b == null && d6.f3650c == null) {
                            z = true;
                        }
                        if (z) {
                            s c2 = d6.f3648a.c();
                            a();
                            return c2;
                        }
                    }
                    th = d6.f3650c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            K1.b.C(iOException, th);
                        }
                    }
                    xVar = d6.f3649b;
                    if (xVar == null) {
                        yVar.d().addFirst(xVar);
                    }
                }
                d6 = d();
                j2 = this.f3579c;
                this.f3580d = nanoTime + j2;
                if (d6 != null) {
                }
                x xVar22 = d6.f3648a;
                boolean z5 = false;
                if (d6.f3649b != null && d6.f3650c == null) {
                }
                th = d6.f3650c;
                if (th != null) {
                }
                xVar = d6.f3649b;
                if (xVar == null) {
                }
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    @Override // X4.j
    public final y c() {
        return this.f3577a;
    }

    public final w d() {
        x kVar;
        y yVar = this.f3577a;
        if (yVar.f(null)) {
            try {
                kVar = yVar.e();
            } catch (Throwable th) {
                kVar = new k(th);
            }
            if (kVar.e()) {
                return new w(kVar, (Throwable) null, 6);
            }
            if (kVar instanceof k) {
                return ((k) kVar).f3574a;
            }
            this.f3581e.add(kVar);
            this.f3578b.d().d(new l(U4.e.f3180b + " connect " + yVar.g().f2824h.f(), kVar, this), 0L);
        }
        return null;
    }
}
