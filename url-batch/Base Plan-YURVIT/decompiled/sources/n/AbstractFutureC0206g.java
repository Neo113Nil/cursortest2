package n;

import androidx.datastore.preferences.protobuf.k0;
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

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC0206g implements Future {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f2904h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f2905i = Logger.getLogger(AbstractFutureC0206g.class.getName());

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f2906j;

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2907k;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2908e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C0202c f2909f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C0205f f2910g;

    static {
        k0 c0204e;
        try {
            c0204e = new C0203d(AtomicReferenceFieldUpdater.newUpdater(C0205f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0205f.class, C0205f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0206g.class, C0205f.class, "g"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0206g.class, C0202c.class, "f"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0206g.class, Object.class, "e"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0204e = new C0204e();
        }
        f2906j = c0204e;
        if (th != null) {
            f2905i.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2907k = new Object();
    }

    public static void b(AbstractFutureC0206g abstractFutureC0206g) {
        C0205f c0205f;
        C0202c c0202c;
        do {
            c0205f = abstractFutureC0206g.f2910g;
        } while (!f2906j.g(abstractFutureC0206g, c0205f, C0205f.f2901c));
        while (c0205f != null) {
            Thread thread = c0205f.f2902a;
            if (thread != null) {
                c0205f.f2902a = null;
                LockSupport.unpark(thread);
            }
            c0205f = c0205f.f2903b;
        }
        do {
            c0202c = abstractFutureC0206g.f2909f;
        } while (!f2906j.e(abstractFutureC0206g, c0202c));
        C0202c c0202c2 = null;
        while (c0202c != null) {
            C0202c c0202c3 = c0202c.f2895a;
            c0202c.f2895a = c0202c2;
            c0202c2 = c0202c;
            c0202c = c0202c3;
        }
        while (c0202c2 != null) {
            c0202c2 = c0202c2.f2895a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f2905i.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0200a) {
            Throwable th = ((C0200a) obj).f2893a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0201b) {
            ((AbstractC0201b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f2907k) {
            return null;
        }
        return obj;
    }

    public static Object d(AbstractFutureC0206g abstractFutureC0206g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC0206g.get();
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
        Object obj = this.f2908e;
        if (obj != null) {
            return false;
        }
        if (!f2906j.f(this, obj, f2904h ? new C0200a(new CancellationException("Future.cancel() was called."), z2) : z2 ? C0200a.f2891b : C0200a.f2892c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C0205f c0205f) {
        c0205f.f2902a = null;
        while (true) {
            C0205f c0205f2 = this.f2910g;
            if (c0205f2 == C0205f.f2901c) {
                return;
            }
            C0205f c0205f3 = null;
            while (c0205f2 != null) {
                C0205f c0205f4 = c0205f2.f2903b;
                if (c0205f2.f2902a != null) {
                    c0205f3 = c0205f2;
                } else if (c0205f3 != null) {
                    c0205f3.f2903b = c0205f4;
                    if (c0205f3.f2902a == null) {
                        break;
                    }
                } else if (!f2906j.g(this, c0205f2, c0205f4)) {
                    break;
                }
                c0205f2 = c0205f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        C0205f c0205f = C0205f.f2901c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2908e;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0205f c0205f2 = this.f2910g;
            if (c0205f2 != c0205f) {
                C0205f c0205f3 = new C0205f();
                do {
                    k0 k0Var = f2906j;
                    k0Var.y(c0205f3, c0205f2);
                    if (k0Var.g(this, c0205f2, c0205f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(c0205f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2908e;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(c0205f3);
                    } else {
                        c0205f2 = this.f2910g;
                    }
                } while (c0205f2 != c0205f);
            }
            return c(this.f2908e);
        }
        while (nanos > 0) {
            Object obj3 = this.f2908e;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC0206g = toString();
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
        throw new TimeoutException(str + " for " + abstractFutureC0206g);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2908e instanceof C0200a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2908e != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2908e instanceof C0200a) {
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
        C0205f c0205f = C0205f.f2901c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2908e;
            if (obj2 != null) {
                return c(obj2);
            }
            C0205f c0205f2 = this.f2910g;
            if (c0205f2 != c0205f) {
                C0205f c0205f3 = new C0205f();
                do {
                    k0 k0Var = f2906j;
                    k0Var.y(c0205f3, c0205f2);
                    if (k0Var.g(this, c0205f2, c0205f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2908e;
                            } else {
                                e(c0205f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c0205f2 = this.f2910g;
                } while (c0205f2 != c0205f);
            }
            return c(this.f2908e);
        }
        throw new InterruptedException();
    }
}
