package l;

import a.AbstractC0069a;
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

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC0188g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2694d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f2695e = Logger.getLogger(AbstractFutureC0188g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0069a f2696f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2697g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2698a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0184c f2699b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0187f f2700c;

    static {
        AbstractC0069a c0186e;
        try {
            c0186e = new C0185d(AtomicReferenceFieldUpdater.newUpdater(C0187f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0187f.class, C0187f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0188g.class, C0187f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0188g.class, C0184c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0188g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0186e = new C0186e();
        }
        f2696f = c0186e;
        if (th != null) {
            f2695e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2697g = new Object();
    }

    public static void b(AbstractFutureC0188g abstractFutureC0188g) {
        C0187f c0187f;
        C0184c c0184c;
        do {
            c0187f = abstractFutureC0188g.f2700c;
        } while (!f2696f.e(abstractFutureC0188g, c0187f, C0187f.f2691c));
        while (c0187f != null) {
            Thread thread = c0187f.f2692a;
            if (thread != null) {
                c0187f.f2692a = null;
                LockSupport.unpark(thread);
            }
            c0187f = c0187f.f2693b;
        }
        do {
            c0184c = abstractFutureC0188g.f2699b;
        } while (!f2696f.c(abstractFutureC0188g, c0184c));
        C0184c c0184c2 = null;
        while (c0184c != null) {
            C0184c c0184c3 = c0184c.f2685a;
            c0184c.f2685a = c0184c2;
            c0184c2 = c0184c;
            c0184c = c0184c3;
        }
        while (c0184c2 != null) {
            c0184c2 = c0184c2.f2685a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f2695e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0182a) {
            CancellationException cancellationException = ((C0182a) obj).f2683a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0183b) {
            ((AbstractC0183b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f2697g) {
            return null;
        }
        return obj;
    }

    public static Object d(AbstractFutureC0188g abstractFutureC0188g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC0188g.get();
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
        Object obj = this.f2698a;
        if (obj != null) {
            return false;
        }
        if (!f2696f.d(this, obj, f2694d ? new C0182a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0182a.f2681b : C0182a.f2682c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C0187f c0187f) {
        c0187f.f2692a = null;
        while (true) {
            C0187f c0187f2 = this.f2700c;
            if (c0187f2 == C0187f.f2691c) {
                return;
            }
            C0187f c0187f3 = null;
            while (c0187f2 != null) {
                C0187f c0187f4 = c0187f2.f2693b;
                if (c0187f2.f2692a != null) {
                    c0187f3 = c0187f2;
                } else if (c0187f3 != null) {
                    c0187f3.f2693b = c0187f4;
                    if (c0187f3.f2692a == null) {
                        break;
                    }
                } else if (!f2696f.e(this, c0187f2, c0187f4)) {
                    break;
                }
                c0187f2 = c0187f4;
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
        Object obj = this.f2698a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0187f c0187f = this.f2700c;
            C0187f c0187f2 = C0187f.f2691c;
            if (c0187f != c0187f2) {
                C0187f c0187f3 = new C0187f();
                do {
                    AbstractC0069a abstractC0069a = f2696f;
                    abstractC0069a.y(c0187f3, c0187f);
                    if (abstractC0069a.e(this, c0187f, c0187f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(c0187f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2698a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(c0187f3);
                    } else {
                        c0187f = this.f2700c;
                    }
                } while (c0187f != c0187f2);
            }
            return c(this.f2698a);
        }
        while (nanos > 0) {
            Object obj3 = this.f2698a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC0188g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z2) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z2) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractFutureC0188g);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2698a instanceof C0182a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2698a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2698a instanceof C0182a) {
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
            Object obj2 = this.f2698a;
            if (obj2 != null) {
                return c(obj2);
            }
            C0187f c0187f = this.f2700c;
            C0187f c0187f2 = C0187f.f2691c;
            if (c0187f != c0187f2) {
                C0187f c0187f3 = new C0187f();
                do {
                    AbstractC0069a abstractC0069a = f2696f;
                    abstractC0069a.y(c0187f3, c0187f);
                    if (abstractC0069a.e(this, c0187f, c0187f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2698a;
                            } else {
                                e(c0187f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c0187f = this.f2700c;
                } while (c0187f != c0187f2);
            }
            return c(this.f2698a);
        }
        throw new InterruptedException();
    }
}
