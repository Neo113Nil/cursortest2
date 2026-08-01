package e6;

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
    public static final boolean f3944r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f3945s = Logger.getLogger(h.class.getName());

    /* renamed from: t, reason: collision with root package name */
    public static final c6.f f3946t;

    /* renamed from: u, reason: collision with root package name */
    public static final Object f3947u;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f3948d;

    /* renamed from: e, reason: collision with root package name */
    public volatile c f3949e;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f3950i;

    static {
        c6.f fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, yb.a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "i"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f3946t = fVar;
        if (th != null) {
            f3945s.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3947u = new Object();
    }

    public static void c(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f3950i;
            if (f3946t.j(hVar, gVar, g.f3941c)) {
                while (gVar != null) {
                    Thread thread = gVar.f3942a;
                    if (thread != null) {
                        gVar.f3942a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f3943b;
                }
                do {
                    cVar = hVar.f3949e;
                } while (!f3946t.h(hVar, cVar, c.f3930d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f3933c;
                    cVar3.f3933c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f3933c;
                    Runnable runnable = cVar2.f3931a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f3939d;
                        if (hVar.f3948d == eVar) {
                            if (f3946t.i(hVar, eVar, f(eVar.f3940e))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f3932b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f3945s.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f3927b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f3929a);
        }
        if (obj == f3947u) {
            return null;
        }
        return obj;
    }

    public static Object f(ListenableFuture listenableFuture) {
        Object obj;
        if (listenableFuture instanceof h) {
            Object obj2 = ((h) listenableFuture).f3948d;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar = (a) obj2;
            return aVar.f3926a ? aVar.f3927b != null ? new a(aVar.f3927b, false) : a.f3925d : obj2;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        boolean z10 = true;
        if ((!f3944r) && isCancelled) {
            return a.f3925d;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new a(e2, false);
                }
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
            } catch (ExecutionException e9) {
                return new b(e9.getCause());
            } catch (Throwable th2) {
                return new b(th2);
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f3947u : obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f3949e;
        c cVar2 = c.f3930d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f3933c = cVar;
                if (f3946t.h(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f3949e;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e2.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e9) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e9.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f3948d;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        a aVar = f3944r ? new a(new CancellationException("Future.cancel() was called."), z10) : z10 ? a.f3924c : a.f3925d;
        h hVar = this;
        boolean z11 = false;
        while (true) {
            if (f3946t.i(hVar, obj, aVar)) {
                c(hVar);
                if (!(obj instanceof e)) {
                    break;
                }
                ListenableFuture listenableFuture = ((e) obj).f3940e;
                if (!(listenableFuture instanceof h)) {
                    listenableFuture.cancel(z10);
                    break;
                }
                hVar = (h) listenableFuture;
                obj = hVar.f3948d;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z11 = true;
            } else {
                obj = hVar.f3948d;
                if (!(obj instanceof e)) {
                    return z11;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f3948d;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture = ((e) obj).f3940e;
            return v4.a.o(sb2, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z10;
        g gVar = g.f3941c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3948d;
        if ((obj != null) && (!(obj instanceof e))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f3950i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                z10 = true;
                do {
                    c6.f fVar = f3946t;
                    fVar.T(gVar3, gVar2);
                    if (fVar.j(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3948d;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(gVar3);
                    } else {
                        gVar2 = this.f3950i;
                    }
                } while (gVar2 != gVar);
            }
            return e(this.f3948d);
        }
        z10 = true;
        while (nanos > 0) {
            Object obj3 = this.f3948d;
            if ((obj3 != null ? z10 : false) && (!(obj3 instanceof e))) {
                return e(obj3);
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
            boolean z11 = (convert == 0 || nanos2 > 1000) ? z10 : false;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z11) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z11) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + hVar);
    }

    public final void h(g gVar) {
        gVar.f3942a = null;
        while (true) {
            g gVar2 = this.f3950i;
            if (gVar2 == g.f3941c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f3943b;
                if (gVar2.f3942a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f3943b = gVar4;
                    if (gVar3.f3942a == null) {
                        break;
                    }
                } else if (!f3946t.j(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3948d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f3948d != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f3948d instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = g();
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

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.f3941c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3948d;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar2 = this.f3950i;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    c6.f fVar = f3946t;
                    fVar.T(gVar3, gVar2);
                    if (fVar.j(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3948d;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar2 = this.f3950i;
                } while (gVar2 != gVar);
            }
            return e(this.f3948d);
        }
        throw new InterruptedException();
    }
}
