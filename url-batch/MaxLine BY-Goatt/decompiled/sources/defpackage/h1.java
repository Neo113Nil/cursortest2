package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class h1 implements bf1 {
    static final y0 ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile c1 listeners;
    volatile Object value;
    volatile g1 waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(h1.class.getName());

    static {
        y0 f1Var;
        try {
            f1Var = new d1(AtomicReferenceFieldUpdater.newUpdater(g1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g1.class, g1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h1.class, g1.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(h1.class, c1.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            f1Var = new f1();
        }
        ATOMIC_HELPER = f1Var;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof z0) {
            Throwable th = ((z0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b1) {
            throw new ExecutionException(((b1) obj).a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void complete(h1 h1Var) {
        c1 c1Var;
        c1 c1Var2;
        c1 c1Var3 = null;
        while (true) {
            g1 g1Var = h1Var.waiters;
            if (ATOMIC_HELPER.c(h1Var, g1Var, g1.c)) {
                while (g1Var != null) {
                    Thread thread = g1Var.a;
                    if (thread != null) {
                        g1Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    g1Var = g1Var.b;
                }
                h1Var.afterDone();
                do {
                    c1Var = h1Var.listeners;
                } while (!ATOMIC_HELPER.a(h1Var, c1Var, c1.d));
                while (true) {
                    c1Var2 = c1Var3;
                    c1Var3 = c1Var;
                    if (c1Var3 == null) {
                        break;
                    }
                    c1Var = c1Var3.c;
                    c1Var3.c = c1Var2;
                }
                while (c1Var2 != null) {
                    c1Var3 = c1Var2.c;
                    Runnable runnable = c1Var2.a;
                    if (runnable instanceof e1) {
                        e1 e1Var = (e1) runnable;
                        h1Var = e1Var.m;
                        if (h1Var.value == e1Var) {
                            if (ATOMIC_HELPER.b(h1Var, e1Var, getFutureValue(e1Var.n))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, c1Var2.b);
                    }
                    c1Var2 = c1Var3;
                }
                return;
            }
        }
    }

    public static Object getFutureValue(bf1 bf1Var) {
        if (bf1Var instanceof h1) {
            Object obj = ((h1) bf1Var).value;
            if (!(obj instanceof z0)) {
                return obj;
            }
            z0 z0Var = (z0) obj;
            return z0Var.a ? z0Var.b != null ? new z0(z0Var.b, false) : z0.d : obj;
        }
        boolean isCancelled = bf1Var.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return z0.d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(bf1Var);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new z0(e, false);
            }
            return new b1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bf1Var, e));
        } catch (ExecutionException e2) {
            return new b1(e2.getCause());
        } catch (Throwable th) {
            return new b1(th);
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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
        return v;
    }

    public final void a(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(uninterruptibly == this ? "this future" : String.valueOf(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // defpackage.bf1
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        c1 c1Var = this.listeners;
        c1 c1Var2 = c1.d;
        if (c1Var != c1Var2) {
            c1 c1Var3 = new c1(runnable, executor);
            do {
                c1Var3.c = c1Var;
                if (ATOMIC_HELPER.a(this, c1Var, c1Var3)) {
                    return;
                } else {
                    c1Var = this.listeners;
                }
            } while (c1Var != c1Var2);
        }
        b(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof e1)) {
            return false;
        }
        z0 z0Var = GENERATE_CANCELLATION_CAUSES ? new z0(new CancellationException("Future.cancel() was called."), z) : z ? z0.c : z0.d;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.b(this, obj, z0Var)) {
                if (z) {
                    this.interruptTask();
                }
                complete(this);
                if (!(obj instanceof e1)) {
                    break;
                }
                bf1 bf1Var = ((e1) obj).n;
                if (!(bf1Var instanceof h1)) {
                    bf1Var.cancel(z);
                    break;
                }
                this = (h1) bf1Var;
                obj = this.value;
                if (!(obj == null) && !(obj instanceof e1)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.value;
                if (!(obj instanceof e1)) {
                    return z2;
                }
            }
        }
    }

    public final void d(g1 g1Var) {
        g1Var.a = null;
        while (true) {
            g1 g1Var2 = this.waiters;
            if (g1Var2 == g1.c) {
                return;
            }
            g1 g1Var3 = null;
            while (g1Var2 != null) {
                g1 g1Var4 = g1Var2.b;
                if (g1Var2.a != null) {
                    g1Var3 = g1Var2;
                } else if (g1Var3 != null) {
                    g1Var3.b = g1Var4;
                    if (g1Var3.a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.c(this, g1Var2, g1Var4)) {
                    break;
                }
                g1Var2 = g1Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        g1 g1Var = g1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof e1))) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            g1 g1Var2 = this.waiters;
            if (g1Var2 != g1Var) {
                g1 g1Var3 = new g1();
                z = true;
                do {
                    y0 y0Var = ATOMIC_HELPER;
                    y0Var.d(g1Var3, g1Var2);
                    if (y0Var.c(this, g1Var2, g1Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                d(g1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof e1))) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        d(g1Var3);
                    } else {
                        g1Var2 = this.waiters;
                    }
                } while (g1Var2 != g1Var);
            }
            return c(this.value);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof e1))) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String h1Var = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + SPIN_THRESHOLD_NANOS < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z2 = (convert == 0 || nanos2 > SPIN_THRESHOLD_NANOS) ? z : false;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z2) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z2) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + h1Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof z0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r2 instanceof e1)) & (this.value != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof e1) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            bf1 bf1Var = ((e1) obj).n;
            return q40.p(sb, bf1Var == this ? "this future" : String.valueOf(bf1Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, null, new b1((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setFuture(bf1 bf1Var) {
        b1 b1Var;
        checkNotNull(bf1Var);
        Object obj = this.value;
        if (obj == null) {
            if (bf1Var.isDone()) {
                if (ATOMIC_HELPER.b(this, null, getFutureValue(bf1Var))) {
                    complete(this);
                    return true;
                }
                return false;
            }
            e1 e1Var = new e1(this, bf1Var);
            if (ATOMIC_HELPER.b(this, null, e1Var)) {
                try {
                    bf1Var.addListener(e1Var, ib0.m);
                    return true;
                } catch (Throwable th) {
                    try {
                        b1Var = new b1(th);
                    } catch (Throwable unused) {
                        b1Var = b1.b;
                    }
                    ATOMIC_HELPER.b(this, e1Var, b1Var);
                    return true;
                }
            }
            obj = this.value;
        }
        if (obj instanceof z0) {
            bf1Var.cancel(((z0) obj).a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
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

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof z0) && ((z0) obj).a;
    }

    public void afterDone() {
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g1 g1Var = g1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof e1))) {
                return c(obj2);
            }
            g1 g1Var2 = this.waiters;
            if (g1Var2 != g1Var) {
                g1 g1Var3 = new g1();
                do {
                    y0 y0Var = ATOMIC_HELPER;
                    y0Var.d(g1Var3, g1Var2);
                    if (y0Var.c(this, g1Var2, g1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                d(g1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e1))));
                        return c(obj);
                    }
                    g1Var2 = this.waiters;
                } while (g1Var2 != g1Var);
            }
            return c(this.value);
        }
        throw new InterruptedException();
    }
}
