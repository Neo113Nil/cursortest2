package p;

import i1.r;
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
    public static final boolean f3762d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f3763e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final r f3764f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f3765g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f3766a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f3767b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f3768c;

    static {
        r eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f3764f = eVar;
        if (th != null) {
            f3763e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3765g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f3768c;
        } while (!f3764f.d(gVar, fVar, f.f3759c));
        while (fVar != null) {
            Thread thread = fVar.f3760a;
            if (thread != null) {
                fVar.f3760a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f3761b;
        }
        do {
            cVar = gVar.f3767b;
        } while (!f3764f.b(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f3754a;
            cVar.f3754a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f3754a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f3763e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0310a) {
            CancellationException cancellationException = ((C0310a) obj).f3752a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0311b) {
            ((AbstractC0311b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3765g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d2 == this ? "this future" : String.valueOf(d2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f3766a;
        if (obj != null) {
            return false;
        }
        if (!f3764f.c(this, obj, f3762d ? new C0310a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0310a.f3750b : C0310a.f3751c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f3760a = null;
        while (true) {
            f fVar2 = this.f3768c;
            if (fVar2 == f.f3759c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f3761b;
                if (fVar2.f3760a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f3761b = fVar4;
                    if (fVar3.f3760a == null) {
                        break;
                    }
                } else if (!f3764f.d(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3766a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f3768c;
            f fVar2 = f.f3759c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    r rVar = f3764f;
                    rVar.o(fVar3, fVar);
                    if (rVar.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3766a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f3768c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f3766a);
        }
        while (nanos > 0) {
            Object obj3 = this.f3766a;
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
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String e2 = X0.e.e(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = e2 + convert + " " + lowerCase;
                if (z2) {
                    str2 = X0.e.e(str2, ",");
                }
                e2 = X0.e.e(str2, " ");
            }
            if (z2) {
                e2 = e2 + nanos2 + " nanoseconds ";
            }
            str = X0.e.e(e2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(X0.e.e(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3766a instanceof C0310a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3766a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3766a instanceof C0310a) {
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
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
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
            Object obj2 = this.f3766a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f3768c;
            f fVar2 = f.f3759c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    r rVar = f3764f;
                    rVar.o(fVar3, fVar);
                    if (rVar.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3766a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f3768c;
                } while (fVar != fVar2);
            }
            return c(this.f3766a);
        }
        throw new InterruptedException();
    }
}
