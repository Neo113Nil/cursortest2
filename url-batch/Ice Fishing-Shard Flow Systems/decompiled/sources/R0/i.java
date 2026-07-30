package R0;

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
import p3.C0827a;

/* loaded from: classes.dex */
public abstract class i implements O1.a {

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f2391l = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f2392m = Logger.getLogger(i.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public static final P0.f f2393n;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f2394o;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f2395d;

    /* renamed from: e, reason: collision with root package name */
    public volatile d f2396e;

    /* renamed from: i, reason: collision with root package name */
    public volatile h f2397i;

    static {
        P0.f gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, C0827a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "i"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "e"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f2393n = gVar;
        if (th != null) {
            f2392m.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2394o = new Object();
    }

    public static void c(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f2397i;
            if (f2393n.j(iVar, hVar, h.f2388c)) {
                while (hVar != null) {
                    Thread thread = hVar.f2389a;
                    if (thread != null) {
                        hVar.f2389a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f2390b;
                }
                do {
                    dVar = iVar.f2396e;
                } while (!f2393n.f(iVar, dVar, d.f2377d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f2380c;
                    dVar3.f2380c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f2380c;
                    Runnable runnable = dVar2.f2378a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f2386d;
                        if (iVar.f2395d == fVar) {
                            if (f2393n.h(iVar, fVar, f(fVar.f2387e))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f2379b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f2392m.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f2373b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f2376a);
        }
        if (obj == f2394o) {
            return null;
        }
        return obj;
    }

    public static Object f(O1.a aVar) {
        Object obj;
        if (aVar instanceof i) {
            Object obj2 = ((i) aVar).f2395d;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar2 = (a) obj2;
            return aVar2.f2372a ? aVar2.f2373b != null ? new a(aVar2.f2373b, false) : a.f2371d : obj2;
        }
        boolean isCancelled = aVar.isCancelled();
        boolean z7 = true;
        if ((!f2391l) && isCancelled) {
            return a.f2371d;
        }
        boolean z8 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z8 = z7;
                } catch (Throwable th) {
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e7) {
                if (isCancelled) {
                    return new a(e7, false);
                }
                return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e7));
            } catch (ExecutionException e8) {
                return new c(e8.getCause());
            } catch (Throwable th2) {
                return new c(th2);
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f2394o : obj;
    }

    @Override // O1.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f2396e;
        d dVar2 = d.f2377d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f2380c = dVar;
                if (f2393n.f(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f2396e;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e7) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e7.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e8) {
                sb.append("FAILURE, cause=[");
                sb.append(e8.getCause());
                sb.append("]");
                return;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f2395d;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        a aVar = f2391l ? new a(new CancellationException("Future.cancel() was called."), z7) : z7 ? a.f2370c : a.f2371d;
        i iVar = this;
        boolean z8 = false;
        while (true) {
            if (f2393n.h(iVar, obj, aVar)) {
                c(iVar);
                if (!(obj instanceof f)) {
                    break;
                }
                O1.a aVar2 = ((f) obj).f2387e;
                if (!(aVar2 instanceof i)) {
                    aVar2.cancel(z7);
                    break;
                }
                iVar = (i) aVar2;
                obj = iVar.f2395d;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z8 = true;
            } else {
                obj = iVar.f2395d;
                if (!(obj instanceof f)) {
                    return z8;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f2395d;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            O1.a aVar = ((f) obj).f2387e;
            return r4.f.f(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z7;
        h hVar = h.f2388c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2395d;
        if ((obj != null) && (!(obj instanceof f))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar2 = this.f2397i;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z7 = true;
                do {
                    P0.f fVar = f2393n;
                    fVar.B(hVar3, hVar2);
                    if (fVar.j(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2395d;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(hVar3);
                    } else {
                        hVar2 = this.f2397i;
                    }
                } while (hVar2 != hVar);
            }
            return e(this.f2395d);
        }
        z7 = true;
        while (nanos > 0) {
            Object obj3 = this.f2395d;
            if ((obj3 != null ? z7 : false) && (!(obj3 instanceof f))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String iVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String c7 = r4.f.c(str, " (plus ");
            long j7 = -nanos;
            long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(convert);
            boolean z8 = (convert == 0 || nanos2 > 1000) ? z7 : false;
            if (convert > 0) {
                String str2 = c7 + convert + " " + lowerCase;
                if (z8) {
                    str2 = r4.f.c(str2, ",");
                }
                c7 = r4.f.c(str2, " ");
            }
            if (z8) {
                c7 = c7 + nanos2 + " nanoseconds ";
            }
            str = r4.f.c(c7, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(r4.f.c(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + iVar);
    }

    public final void h(h hVar) {
        hVar.f2389a = null;
        while (true) {
            h hVar2 = this.f2397i;
            if (hVar2 == h.f2388c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f2390b;
                if (hVar2.f2389a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f2390b = hVar4;
                    if (hVar3.f2389a == null) {
                        break;
                    }
                } else if (!f2393n.j(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2395d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f2395d != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2395d instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        h hVar = h.f2388c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2395d;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar2 = this.f2397i;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    P0.f fVar = f2393n;
                    fVar.B(hVar3, hVar2);
                    if (fVar.j(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2395d;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar2 = this.f2397i;
                } while (hVar2 != hVar);
            }
            return e(this.f2395d);
        }
        throw new InterruptedException();
    }
}
