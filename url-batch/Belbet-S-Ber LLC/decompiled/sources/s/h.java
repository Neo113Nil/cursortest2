package s;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class h implements Future {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f3229j = Logger.getLogger(h.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static final a f3230k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f3231l;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f3232f;

    /* renamed from: g, reason: collision with root package name */
    public volatile d f3233g;
    public volatile g h;

    static {
        a fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "h"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "g"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f3230k = fVar;
        if (th != null) {
            f3229j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3231l = new Object();
    }

    public static void b(h hVar) {
        g gVar;
        d dVar;
        do {
            gVar = hVar.h;
        } while (!f3230k.h(hVar, gVar, g.f3226c));
        while (gVar != null) {
            Thread thread = gVar.f3227a;
            if (thread != null) {
                gVar.f3227a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f3228b;
        }
        do {
            dVar = hVar.f3233g;
        } while (!f3230k.f(hVar, dVar));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f3221a;
            dVar.f3221a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            dVar2 = dVar2.f3221a;
            try {
                throw null;
            } catch (RuntimeException e4) {
                f3229j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e4);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f3219a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3231l) {
            return null;
        }
        return obj;
    }

    public static Object d(h hVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d == this ? "this future" : String.valueOf(d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f3232f;
        if (obj != null) {
            return false;
        }
        if (!f3230k.g(this, obj, i ? new b(z4, new CancellationException("Future.cancel() was called.")) : z4 ? b.f3217b : b.f3218c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(g gVar) {
        gVar.f3227a = null;
        while (true) {
            g gVar2 = this.h;
            if (gVar2 == g.f3226c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f3228b;
                if (gVar2.f3227a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f3228b = gVar4;
                    if (gVar3.f3227a == null) {
                        break;
                    }
                } else if (!f3230k.h(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        g gVar = g.f3226c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3232f;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.h;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    a aVar = f3230k;
                    aVar.x(gVar3, gVar2);
                    if (aVar.h(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3232f;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(gVar3);
                    } else {
                        gVar2 = this.h;
                    }
                } while (gVar2 != gVar);
            }
            return c(this.f3232f);
        }
        while (nanos > 0) {
            Object obj3 = this.f3232f;
            if (obj3 != null) {
                return c(obj3);
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
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String g3 = a4.b.g(str, " (plus ");
            long j4 = -nanos;
            long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(convert);
            boolean z4 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = g3 + convert + " " + lowerCase;
                if (z4) {
                    str2 = a4.b.g(str2, ",");
                }
                g3 = a4.b.g(str2, " ");
            }
            if (z4) {
                g3 = g3 + nanos2 + " nanoseconds ";
            }
            str = a4.b.g(g3, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(a4.b.g(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + hVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3232f instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3232f != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3232f instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
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
                a(sb);
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
        g gVar = g.f3226c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3232f;
            if (obj2 != null) {
                return c(obj2);
            }
            g gVar2 = this.h;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    a aVar = f3230k;
                    aVar.x(gVar3, gVar2);
                    if (aVar.h(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3232f;
                            } else {
                                e(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    gVar2 = this.h;
                } while (gVar2 != gVar);
            }
            return c(this.f3232f);
        }
        throw new InterruptedException();
    }
}
