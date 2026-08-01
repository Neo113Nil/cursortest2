package q;

import Z.V;
import h0.d0;
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
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f3491e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f3492f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f3493g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f3494a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f3495b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f3496c;

    static {
        d0 eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f3492f = eVar;
        if (th != null) {
            f3491e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3493g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f3496c;
        } while (!f3492f.d(gVar, fVar, f.f3488c));
        while (fVar != null) {
            Thread thread = fVar.f3489a;
            if (thread != null) {
                fVar.f3489a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f3490b;
        }
        do {
            cVar = gVar.f3495b;
        } while (!f3492f.b(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f3483a;
            cVar.f3483a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f3483a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f3491e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0283a) {
            CancellationException cancellationException = ((C0283a) obj).f3481a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0284b) {
            ((AbstractC0284b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3493g) {
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
        Object obj = this.f3494a;
        if (obj != null) {
            return false;
        }
        if (!f3492f.c(this, obj, d ? new C0283a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0283a.f3479b : C0283a.f3480c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f3489a = null;
        while (true) {
            f fVar2 = this.f3496c;
            if (fVar2 == f.f3488c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f3490b;
                if (fVar2.f3489a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f3490b = fVar4;
                    if (fVar3.f3489a == null) {
                        break;
                    }
                } else if (!f3492f.d(this, fVar2, fVar4)) {
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
        Object obj = this.f3494a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f3496c;
            f fVar2 = f.f3488c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    d0 d0Var = f3492f;
                    d0Var.o(fVar3, fVar);
                    if (d0Var.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3494a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f3496c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f3494a);
        }
        while (nanos > 0) {
            Object obj3 = this.f3494a;
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
            String f2 = V.f(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = f2 + convert + " " + lowerCase;
                if (z2) {
                    str2 = V.f(str2, ",");
                }
                f2 = V.f(str2, " ");
            }
            if (z2) {
                f2 = f2 + nanos2 + " nanoseconds ";
            }
            str = V.f(f2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(V.f(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3494a instanceof C0283a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3494a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3494a instanceof C0283a) {
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
            Object obj2 = this.f3494a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f3496c;
            f fVar2 = f.f3488c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    d0 d0Var = f3492f;
                    d0Var.o(fVar3, fVar);
                    if (d0Var.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3494a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f3496c;
                } while (fVar != fVar2);
            }
            return c(this.f3494a);
        }
        throw new InterruptedException();
    }
}
