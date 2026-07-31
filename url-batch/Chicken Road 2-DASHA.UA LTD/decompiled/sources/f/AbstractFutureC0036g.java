package f;

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
public abstract class AbstractFutureC0036g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f519d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f520e = Logger.getLogger(AbstractFutureC0036g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final a.a f521f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f522g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f523a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0032c f524b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0035f f525c;

    static {
        a.a c0034e;
        try {
            c0034e = new C0033d(AtomicReferenceFieldUpdater.newUpdater(C0035f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0035f.class, C0035f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0036g.class, C0035f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0036g.class, C0032c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0036g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0034e = new C0034e();
        }
        f521f = c0034e;
        if (th != null) {
            f520e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f522g = new Object();
    }

    public static void b(AbstractFutureC0036g abstractFutureC0036g) {
        C0035f c0035f;
        C0032c c0032c;
        do {
            c0035f = abstractFutureC0036g.f525c;
        } while (!f521f.f(abstractFutureC0036g, c0035f, C0035f.f516c));
        while (c0035f != null) {
            Thread thread = c0035f.f517a;
            if (thread != null) {
                c0035f.f517a = null;
                LockSupport.unpark(thread);
            }
            c0035f = c0035f.f518b;
        }
        do {
            c0032c = abstractFutureC0036g.f524b;
        } while (!f521f.d(abstractFutureC0036g, c0032c));
        C0032c c0032c2 = null;
        while (c0032c != null) {
            C0032c c0032c3 = c0032c.f510a;
            c0032c.f510a = c0032c2;
            c0032c2 = c0032c;
            c0032c = c0032c3;
        }
        while (c0032c2 != null) {
            c0032c2 = c0032c2.f510a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f520e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0030a) {
            CancellationException cancellationException = ((C0030a) obj).f508a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0031b) {
            ((AbstractC0031b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f522g) {
            return null;
        }
        return obj;
    }

    public static Object d(AbstractFutureC0036g abstractFutureC0036g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC0036g.get();
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
        Object obj = this.f523a;
        if (obj != null) {
            return false;
        }
        if (!f521f.e(this, obj, f519d ? new C0030a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0030a.f506b : C0030a.f507c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C0035f c0035f) {
        c0035f.f517a = null;
        while (true) {
            C0035f c0035f2 = this.f525c;
            if (c0035f2 == C0035f.f516c) {
                return;
            }
            C0035f c0035f3 = null;
            while (c0035f2 != null) {
                C0035f c0035f4 = c0035f2.f518b;
                if (c0035f2.f517a != null) {
                    c0035f3 = c0035f2;
                } else if (c0035f3 != null) {
                    c0035f3.f518b = c0035f4;
                    if (c0035f3.f517a == null) {
                        break;
                    }
                } else if (!f521f.f(this, c0035f2, c0035f4)) {
                    break;
                }
                c0035f2 = c0035f4;
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
        Object obj = this.f523a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0035f c0035f = this.f525c;
            C0035f c0035f2 = C0035f.f516c;
            if (c0035f != c0035f2) {
                C0035f c0035f3 = new C0035f();
                do {
                    a.a aVar = f521f;
                    aVar.u(c0035f3, c0035f);
                    if (aVar.f(this, c0035f, c0035f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(c0035f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f523a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(c0035f3);
                    } else {
                        c0035f = this.f525c;
                    }
                } while (c0035f != c0035f2);
            }
            return c(this.f523a);
        }
        while (nanos > 0) {
            Object obj3 = this.f523a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC0036g = toString();
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
        throw new TimeoutException(str + " for " + abstractFutureC0036g);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f523a instanceof C0030a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f523a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f523a instanceof C0030a) {
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
            Object obj2 = this.f523a;
            if (obj2 != null) {
                return c(obj2);
            }
            C0035f c0035f = this.f525c;
            C0035f c0035f2 = C0035f.f516c;
            if (c0035f != c0035f2) {
                C0035f c0035f3 = new C0035f();
                do {
                    a.a aVar = f521f;
                    aVar.u(c0035f3, c0035f);
                    if (aVar.f(this, c0035f, c0035f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f523a;
                            } else {
                                e(c0035f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c0035f = this.f525c;
                } while (c0035f != c0035f2);
            }
            return c(this.f523a);
        }
        throw new InterruptedException();
    }
}
