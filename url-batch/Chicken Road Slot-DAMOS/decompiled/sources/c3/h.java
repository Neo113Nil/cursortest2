package c3;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h implements ListenableFuture {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f1729r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f1730s = Logger.getLogger(h.class.getName());

    /* renamed from: t, reason: collision with root package name */
    public static final k7.e f1731t;

    /* renamed from: u, reason: collision with root package name */
    public static final Object f1732u;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f1733d;

    /* renamed from: e, reason: collision with root package name */
    public volatile d f1734e;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f1735i;

    static {
        k7.e fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, yb.a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "i"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "e"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f1731t = fVar;
        if (th != null) {
            f1730s.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1732u = new Object();
    }

    public static void d(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f1735i;
        } while (!f1731t.h(hVar, gVar, g.f1726c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f1727a;
            if (thread != null) {
                gVar.f1727a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f1728b;
        }
        hVar.c();
        do {
            dVar2 = hVar.f1734e;
        } while (!f1731t.f(hVar, dVar2, d.f1717d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f1720c;
            dVar.f1720c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f1720c;
            e(dVar3.f1718a, dVar3.f1719b);
            dVar3 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f1730s.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f1714b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f1716a);
        }
        if (obj == f1732u) {
            return null;
        }
        return obj;
    }

    public static Object g(h hVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f1734e;
        d dVar2 = d.f1717d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f1720c = dVar;
                if (f1731t.f(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f1734e;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        try {
            Object g = g(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(g == this ? "this future" : String.valueOf(g));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e2.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e9.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f1733d;
        if (obj == null) {
            if (f1731t.g(this, obj, f1729r ? new a(new CancellationException("Future.cancel() was called."), z10) : z10 ? a.f1711c : a.f1712d)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        g gVar = g.f1726c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1733d;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f1735i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    k7.e eVar = f1731t;
                    eVar.H(gVar3, gVar2);
                    if (eVar.h(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1733d;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(gVar3);
                    } else {
                        gVar2 = this.f1735i;
                    }
                } while (gVar2 != gVar);
            }
            return f(this.f1733d);
        }
        while (nanos > 0) {
            Object obj3 = this.f1733d;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String hVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z10 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z10) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z10) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(g gVar) {
        gVar.f1727a = null;
        while (true) {
            g gVar2 = this.f1735i;
            if (gVar2 == g.f1726c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f1728b;
                if (gVar2.f1727a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f1728b = gVar4;
                    if (gVar3.f1727a == null) {
                        break;
                    }
                } else if (!f1731t.h(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1733d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1733d != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f1732u;
        }
        if (!f1731t.g(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f1731t.g(this, null, new c(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f1733d instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = h();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.f1726c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1733d;
            if (obj2 != null) {
                return f(obj2);
            }
            g gVar2 = this.f1735i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    k7.e eVar = f1731t;
                    eVar.H(gVar3, gVar2);
                    if (eVar.h(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1733d;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    gVar2 = this.f1735i;
                } while (gVar2 != gVar);
            }
            return f(this.f1733d);
        }
        throw new InterruptedException();
    }
}
