package w;

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
import p3.C0827a;

/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0987g implements O1.a {

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f8272l = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f8273m = Logger.getLogger(AbstractC0987g.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public static final P0.f f8274n;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f8275o;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f8276d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C0983c f8277e;

    /* renamed from: i, reason: collision with root package name */
    public volatile C0986f f8278i;

    static {
        P0.f c0985e;
        try {
            c0985e = new C0984d(AtomicReferenceFieldUpdater.newUpdater(C0986f.class, Thread.class, C0827a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(C0986f.class, C0986f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0987g.class, C0986f.class, "i"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0987g.class, C0983c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0987g.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0985e = new C0985e();
        }
        f8274n = c0985e;
        if (th != null) {
            f8273m.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8275o = new Object();
    }

    public static void d(AbstractC0987g abstractC0987g) {
        C0986f c0986f;
        C0983c c0983c;
        C0983c c0983c2;
        C0983c c0983c3;
        do {
            c0986f = abstractC0987g.f8278i;
        } while (!f8274n.k(abstractC0987g, c0986f, C0986f.f8269c));
        while (true) {
            c0983c = null;
            if (c0986f == null) {
                break;
            }
            Thread thread = c0986f.f8270a;
            if (thread != null) {
                c0986f.f8270a = null;
                LockSupport.unpark(thread);
            }
            c0986f = c0986f.f8271b;
        }
        abstractC0987g.c();
        do {
            c0983c2 = abstractC0987g.f8277e;
        } while (!f8274n.g(abstractC0987g, c0983c2, C0983c.f8260d));
        while (true) {
            c0983c3 = c0983c;
            c0983c = c0983c2;
            if (c0983c == null) {
                break;
            }
            c0983c2 = c0983c.f8263c;
            c0983c.f8263c = c0983c3;
        }
        while (c0983c3 != null) {
            C0983c c0983c4 = c0983c3.f8263c;
            e(c0983c3.f8261a, c0983c3.f8262b);
            c0983c3 = c0983c4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f8273m.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof C0981a) {
            Throwable th = ((C0981a) obj).f8258b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0982b) {
            throw new ExecutionException(((C0982b) obj).f8259a);
        }
        if (obj == f8275o) {
            return null;
        }
        return obj;
    }

    public static Object g(AbstractC0987g abstractC0987g) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = abstractC0987g.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // O1.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C0983c c0983c = this.f8277e;
        C0983c c0983c2 = C0983c.f8260d;
        if (c0983c != c0983c2) {
            C0983c c0983c3 = new C0983c(runnable, executor);
            do {
                c0983c3.f8263c = c0983c;
                if (f8274n.g(this, c0983c, c0983c3)) {
                    return;
                } else {
                    c0983c = this.f8277e;
                }
            } while (c0983c != c0983c2);
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
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f8276d;
        if (obj == null) {
            if (f8274n.i(this, obj, f8272l ? new C0981a(new CancellationException("Future.cancel() was called."), z7) : z7 ? C0981a.f8255c : C0981a.f8256d)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        C0986f c0986f = C0986f.f8269c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8276d;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0986f c0986f2 = this.f8278i;
            if (c0986f2 != c0986f) {
                C0986f c0986f3 = new C0986f();
                do {
                    P0.f fVar = f8274n;
                    fVar.C(c0986f3, c0986f2);
                    if (fVar.k(this, c0986f2, c0986f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(c0986f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8276d;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(c0986f3);
                    } else {
                        c0986f2 = this.f8278i;
                    }
                } while (c0986f2 != c0986f);
            }
            return f(this.f8276d);
        }
        while (nanos > 0) {
            Object obj3 = this.f8276d;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC0987g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String c7 = r4.f.c(str, " (plus ");
            long j7 = -nanos;
            long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(convert);
            boolean z7 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = c7 + convert + " " + lowerCase;
                if (z7) {
                    str2 = r4.f.c(str2, ",");
                }
                c7 = r4.f.c(str2, " ");
            }
            if (z7) {
                c7 = c7 + nanos2 + " nanoseconds ";
            }
            str = r4.f.c(c7, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(r4.f.c(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + abstractC0987g);
    }

    public final void h(C0986f c0986f) {
        c0986f.f8270a = null;
        while (true) {
            C0986f c0986f2 = this.f8278i;
            if (c0986f2 == C0986f.f8269c) {
                return;
            }
            C0986f c0986f3 = null;
            while (c0986f2 != null) {
                C0986f c0986f4 = c0986f2.f8271b;
                if (c0986f2.f8270a != null) {
                    c0986f3 = c0986f2;
                } else if (c0986f3 != null) {
                    c0986f3.f8271b = c0986f4;
                    if (c0986f3.f8270a == null) {
                        break;
                    }
                } else if (!f8274n.k(this, c0986f2, c0986f4)) {
                    break;
                }
                c0986f2 = c0986f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8276d instanceof C0981a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8276d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f8276d instanceof C0981a) {
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
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
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
        C0986f c0986f = C0986f.f8269c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8276d;
            if (obj2 != null) {
                return f(obj2);
            }
            C0986f c0986f2 = this.f8278i;
            if (c0986f2 != c0986f) {
                C0986f c0986f3 = new C0986f();
                do {
                    P0.f fVar = f8274n;
                    fVar.C(c0986f3, c0986f2);
                    if (fVar.k(this, c0986f2, c0986f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8276d;
                            } else {
                                h(c0986f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    c0986f2 = this.f8278i;
                } while (c0986f2 != c0986f);
            }
            return f(this.f8276d);
        }
        throw new InterruptedException();
    }
}
