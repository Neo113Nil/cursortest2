package p;

import G1.AbstractC0001b;
import c1.AbstractC0091d;
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
    public static final Logger f3618e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0091d f3619f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f3620g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f3621a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0297c f3622b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f3623c;

    static {
        AbstractC0091d eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C0297c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f3619f = eVar;
        if (th != null) {
            f3618e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3620g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        C0297c c0297c;
        do {
            fVar = gVar.f3623c;
        } while (!f3619f.d(gVar, fVar, f.f3615c));
        while (fVar != null) {
            Thread thread = fVar.f3616a;
            if (thread != null) {
                fVar.f3616a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f3617b;
        }
        do {
            c0297c = gVar.f3622b;
        } while (!f3619f.b(gVar, c0297c));
        C0297c c0297c2 = null;
        while (c0297c != null) {
            C0297c c0297c3 = c0297c.f3611a;
            c0297c.f3611a = c0297c2;
            c0297c2 = c0297c;
            c0297c = c0297c3;
        }
        while (c0297c2 != null) {
            c0297c2 = c0297c2.f3611a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f3618e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0295a) {
            CancellationException cancellationException = ((C0295a) obj).f3609a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0296b) {
            ((AbstractC0296b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3620g) {
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
        Object obj = this.f3621a;
        if (obj != null) {
            return false;
        }
        if (!f3619f.c(this, obj, d ? new C0295a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0295a.f3607b : C0295a.f3608c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f3616a = null;
        while (true) {
            f fVar2 = this.f3623c;
            if (fVar2 == f.f3615c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f3617b;
                if (fVar2.f3616a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f3617b = fVar4;
                    if (fVar3.f3616a == null) {
                        break;
                    }
                } else if (!f3619f.d(this, fVar2, fVar4)) {
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
        Object obj = this.f3621a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f3623c;
            f fVar2 = f.f3615c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0091d abstractC0091d = f3619f;
                    abstractC0091d.p(fVar3, fVar);
                    if (abstractC0091d.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3621a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f3623c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f3621a);
        }
        while (nanos > 0) {
            Object obj3 = this.f3621a;
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
            String g2 = AbstractC0001b.g(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = g2 + convert + " " + lowerCase;
                if (z2) {
                    str2 = AbstractC0001b.g(str2, ",");
                }
                g2 = AbstractC0001b.g(str2, " ");
            }
            if (z2) {
                g2 = g2 + nanos2 + " nanoseconds ";
            }
            str = AbstractC0001b.g(g2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0001b.g(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3621a instanceof C0295a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3621a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3621a instanceof C0295a) {
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
            Object obj2 = this.f3621a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f3623c;
            f fVar2 = f.f3615c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0091d abstractC0091d = f3619f;
                    abstractC0091d.p(fVar3, fVar);
                    if (abstractC0091d.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3621a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f3623c;
                } while (fVar != fVar2);
            }
            return c(this.f3621a);
        }
        throw new InterruptedException();
    }
}
