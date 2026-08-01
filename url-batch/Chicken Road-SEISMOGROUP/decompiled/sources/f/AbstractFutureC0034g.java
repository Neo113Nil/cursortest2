package f;

import a.AbstractC0016a;
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

/* renamed from: f.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC0034g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f575d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f576e = Logger.getLogger(AbstractFutureC0034g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0016a f577f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f578g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f579a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0030c f580b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0033f f581c;

    static {
        AbstractC0016a c0032e;
        try {
            c0032e = new C0031d(AtomicReferenceFieldUpdater.newUpdater(C0033f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0033f.class, C0033f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0034g.class, C0033f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0034g.class, C0030c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0034g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0032e = new C0032e(19);
        }
        f577f = c0032e;
        if (th != null) {
            f576e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f578g = new Object();
    }

    public static void b(AbstractFutureC0034g abstractFutureC0034g) {
        C0033f c0033f;
        C0030c c0030c;
        do {
            c0033f = abstractFutureC0034g.f581c;
        } while (!f577f.g(abstractFutureC0034g, c0033f, C0033f.f572c));
        while (c0033f != null) {
            Thread thread = c0033f.f573a;
            if (thread != null) {
                c0033f.f573a = null;
                LockSupport.unpark(thread);
            }
            c0033f = c0033f.f574b;
        }
        do {
            c0030c = abstractFutureC0034g.f580b;
        } while (!f577f.e(abstractFutureC0034g, c0030c));
        C0030c c0030c2 = null;
        while (c0030c != null) {
            C0030c c0030c3 = c0030c.f566a;
            c0030c.f566a = c0030c2;
            c0030c2 = c0030c;
            c0030c = c0030c3;
        }
        while (c0030c2 != null) {
            c0030c2 = c0030c2.f566a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f576e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0028a) {
            CancellationException cancellationException = ((C0028a) obj).f564a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0029b) {
            ((AbstractC0029b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f578g) {
            return null;
        }
        return obj;
    }

    public static Object d(AbstractFutureC0034g abstractFutureC0034g) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC0034g.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
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
    public final boolean cancel(boolean z) {
        Object obj = this.f579a;
        if (obj != null) {
            return false;
        }
        if (!f577f.f(this, obj, f575d ? new C0028a(z, new CancellationException("Future.cancel() was called.")) : z ? C0028a.f562b : C0028a.f563c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C0033f c0033f) {
        c0033f.f573a = null;
        while (true) {
            C0033f c0033f2 = this.f581c;
            if (c0033f2 == C0033f.f572c) {
                return;
            }
            C0033f c0033f3 = null;
            while (c0033f2 != null) {
                C0033f c0033f4 = c0033f2.f574b;
                if (c0033f2.f573a != null) {
                    c0033f3 = c0033f2;
                } else if (c0033f3 != null) {
                    c0033f3.f574b = c0033f4;
                    if (c0033f3.f573a == null) {
                        break;
                    }
                } else if (!f577f.g(this, c0033f2, c0033f4)) {
                    break;
                }
                c0033f2 = c0033f4;
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
        Object obj = this.f579a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0033f c0033f = this.f581c;
            C0033f c0033f2 = C0033f.f572c;
            if (c0033f != c0033f2) {
                C0033f c0033f3 = new C0033f();
                do {
                    AbstractC0016a abstractC0016a = f577f;
                    abstractC0016a.y(c0033f3, c0033f);
                    if (abstractC0016a.g(this, c0033f, c0033f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(c0033f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f579a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(c0033f3);
                    } else {
                        c0033f = this.f581c;
                    }
                } while (c0033f != c0033f2);
            }
            return c(this.f579a);
        }
        while (nanos > 0) {
            Object obj3 = this.f579a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC0034g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractFutureC0034g);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f579a instanceof C0028a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f579a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f579a instanceof C0028a) {
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
            Object obj2 = this.f579a;
            if (obj2 != null) {
                return c(obj2);
            }
            C0033f c0033f = this.f581c;
            C0033f c0033f2 = C0033f.f572c;
            if (c0033f != c0033f2) {
                C0033f c0033f3 = new C0033f();
                do {
                    AbstractC0016a abstractC0016a = f577f;
                    abstractC0016a.y(c0033f3, c0033f);
                    if (abstractC0016a.g(this, c0033f, c0033f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f579a;
                            } else {
                                e(c0033f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c0033f = this.f581c;
                } while (c0033f != c0033f2);
            }
            return c(this.f579a);
        }
        throw new InterruptedException();
    }
}
