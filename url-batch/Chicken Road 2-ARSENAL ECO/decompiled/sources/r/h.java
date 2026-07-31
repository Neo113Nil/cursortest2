package r;

import W4.o;
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
import l1.InterfaceFutureC0490a;

/* loaded from: classes.dex */
public abstract class h implements InterfaceFutureC0490a {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f5833i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f5834j = Logger.getLogger(h.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static final A3.c f5835k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f5836l;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f5837f;

    /* renamed from: g, reason: collision with root package name */
    public volatile d f5838g;

    /* renamed from: h, reason: collision with root package name */
    public volatile g f5839h;

    static {
        A3.c fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, N2.a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "h"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "g"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f(17);
        }
        f5835k = fVar;
        if (th != null) {
            f5834j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5836l = new Object();
    }

    public static void d(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f5839h;
        } while (!f5835k.C(hVar, gVar, g.f5830c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f5831a;
            if (thread != null) {
                gVar.f5831a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f5832b;
        }
        hVar.c();
        do {
            dVar2 = hVar.f5838g;
        } while (!f5835k.A(hVar, dVar2, d.f5821d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f5824c;
            dVar.f5824c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f5824c;
            e(dVar3.f5822a, dVar3.f5823b);
            dVar3 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f5834j.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof C0608a) {
            Throwable th = ((C0608a) obj).f5818b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f5820a);
        }
        if (obj == f5836l) {
            return null;
        }
        return obj;
    }

    public static Object g(h hVar) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // l1.InterfaceFutureC0490a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f5838g;
        d dVar2 = d.f5821d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f5824c = dVar;
                if (f5835k.A(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f5838g;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g7 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g7 == this ? "this future" : String.valueOf(g7));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f5837f;
        if (obj == null) {
            if (f5835k.B(this, obj, f5833i ? new C0608a(new CancellationException("Future.cancel() was called."), z5) : z5 ? C0608a.f5815c : C0608a.f5816d)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        g gVar = g.f5830c;
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5837f;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f5839h;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    A3.c cVar = f5835k;
                    cVar.V(gVar3, gVar2);
                    if (cVar.C(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5837f;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(gVar3);
                    } else {
                        gVar2 = this.f5839h;
                    }
                } while (gVar2 != gVar);
            }
            return f(this.f5837f);
        }
        while (nanos > 0) {
            Object obj3 = this.f5837f;
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
        String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String d7 = o.d(str, " (plus ");
            long j7 = -nanos;
            long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(convert);
            boolean z5 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = d7 + convert + " " + lowerCase;
                if (z5) {
                    str2 = o.d(str2, ",");
                }
                d7 = o.d(str2, " ");
            }
            if (z5) {
                d7 = d7 + nanos2 + " nanoseconds ";
            }
            str = o.d(d7, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(o.d(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + hVar);
    }

    public final void h(g gVar) {
        gVar.f5831a = null;
        while (true) {
            g gVar2 = this.f5839h;
            if (gVar2 == g.f5830c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f5832b;
                if (gVar2.f5831a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f5832b = gVar4;
                    if (gVar3.f5831a == null) {
                        break;
                    }
                } else if (!f5835k.C(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5837f instanceof C0608a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5837f != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5837f instanceof C0608a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
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

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.f5830c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5837f;
            if (obj2 != null) {
                return f(obj2);
            }
            g gVar2 = this.f5839h;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    A3.c cVar = f5835k;
                    cVar.V(gVar3, gVar2);
                    if (cVar.C(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5837f;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    gVar2 = this.f5839h;
                } while (gVar2 != gVar);
            }
            return f(this.f5837f);
        }
        throw new InterruptedException();
    }
}
