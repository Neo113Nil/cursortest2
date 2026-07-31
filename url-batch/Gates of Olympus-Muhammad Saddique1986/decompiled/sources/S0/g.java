package S0;

import h2.AbstractC0508a;
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

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4299d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f4300e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0508a f4301f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f4302g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f4303a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f4304b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f4305c;

    static {
        AbstractC0508a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f4301f = eVar;
        if (th != null) {
            f4300e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4302g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f4305c;
        } while (!f4301f.t(gVar, fVar, f.f4296c));
        while (fVar != null) {
            Thread thread = fVar.f4297a;
            if (thread != null) {
                fVar.f4297a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f4298b;
        }
        do {
            cVar = gVar.f4304b;
        } while (!f4301f.r(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f4290a;
            cVar.f4290a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f4290a;
            try {
                throw null;
            } catch (RuntimeException e3) {
                f4300e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e3);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f4288a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f4302g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d3 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d3 == this ? "this future" : String.valueOf(d3));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f4303a;
        if (obj != null) {
            return false;
        }
        if (!f4301f.s(this, obj, f4299d ? new a(z3, new CancellationException("Future.cancel() was called.")) : z3 ? a.f4286b : a.f4287c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f4297a = null;
        while (true) {
            f fVar2 = this.f4305c;
            if (fVar2 == f.f4296c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f4298b;
                if (fVar2.f4297a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f4298b = fVar4;
                    if (fVar3.f4297a == null) {
                        break;
                    }
                } else if (!f4301f.t(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4303a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f4305c;
            f fVar2 = f.f4296c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0508a abstractC0508a = f4301f;
                    abstractC0508a.M(fVar3, fVar);
                    if (abstractC0508a.t(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4303a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f4305c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f4303a);
        }
        while (nanos > 0) {
            Object obj3 = this.f4303a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j4 = -nanos;
            long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z3) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z3) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4303a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4303a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4303a instanceof a) {
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
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f4303a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f4305c;
            f fVar2 = f.f4296c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0508a abstractC0508a = f4301f;
                    abstractC0508a.M(fVar3, fVar);
                    if (abstractC0508a.t(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4303a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f4305c;
                } while (fVar != fVar2);
            }
            return c(this.f4303a);
        }
        throw new InterruptedException();
    }
}
