package defpackage;

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

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rl implements hvi {
    static final rc b;
    public static final /* synthetic */ int c = 0;
    private static final Object e;
    volatile rg listeners;
    volatile Object value;
    volatile rk waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger d = Logger.getLogger(rl.class.getName());

    static {
        rc rjVar;
        try {
            rjVar = new rh(AtomicReferenceFieldUpdater.newUpdater(rk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(rk.class, rk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(rl.class, rk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(rl.class, rg.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(rl.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            rjVar = new rj();
        }
        b = rjVar;
        if (th != null) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new Object();
    }

    protected rl() {
    }

    static Object a(hvi hviVar) {
        if (hviVar instanceof rl) {
            Object obj = ((rl) hviVar).value;
            if (!(obj instanceof rd)) {
                return obj;
            }
            rd rdVar = (rd) obj;
            if (!rdVar.c) {
                return obj;
            }
            Throwable th = rdVar.d;
            return th != null ? new rd(false, th) : rd.b;
        }
        boolean isCancelled = hviVar.isCancelled();
        if ((!a) && isCancelled) {
            return rd.b;
        }
        try {
            Object n = a.n(hviVar);
            return n == null ? e : n;
        } catch (CancellationException e2) {
            return !isCancelled ? new rf(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(hviVar))), e2)) : new rd(false, e2);
        } catch (ExecutionException e3) {
            return new rf(e3.getCause());
        } catch (Throwable th2) {
            return new rf(th2);
        }
    }

    static void d(rl rlVar) {
        rg rgVar;
        rg rgVar2;
        rg rgVar3 = null;
        while (true) {
            rk rkVar = rlVar.waiters;
            if (b.e(rlVar, rkVar, rk.a)) {
                while (rkVar != null) {
                    Thread thread = rkVar.thread;
                    if (thread != null) {
                        rkVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    rkVar = rkVar.next;
                }
                do {
                    rgVar = rlVar.listeners;
                } while (!b.c(rlVar, rgVar, rg.a));
                while (true) {
                    rgVar2 = rgVar3;
                    rgVar3 = rgVar;
                    if (rgVar3 == null) {
                        break;
                    }
                    rgVar = rgVar3.next;
                    rgVar3.next = rgVar2;
                }
                while (rgVar2 != null) {
                    Runnable runnable = rgVar2.b;
                    rg rgVar4 = rgVar2.next;
                    if (runnable instanceof ri) {
                        ri riVar = (ri) runnable;
                        rlVar = riVar.a;
                        if (rlVar.value == riVar) {
                            if (b.d(rlVar, riVar, a(riVar.b))) {
                                rgVar3 = rgVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i(runnable, rgVar2.c);
                    }
                    rgVar2 = rgVar4;
                }
                return;
            }
        }
    }

    static void f(Object obj) {
        obj.getClass();
    }

    private final String g(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void h(StringBuilder sb) {
        try {
            Object n = a.n(this);
            sb.append("SUCCESS, result=[");
            sb.append(g(n));
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

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            d.log(Level.SEVERE, "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e2);
        }
    }

    private final void j(rk rkVar) {
        rkVar.thread = null;
        while (true) {
            rk rkVar2 = this.waiters;
            if (rkVar2 != rk.a) {
                rk rkVar3 = null;
                while (rkVar2 != null) {
                    rk rkVar4 = rkVar2.next;
                    if (rkVar2.thread != null) {
                        rkVar3 = rkVar2;
                    } else if (rkVar3 != null) {
                        rkVar3.next = rkVar4;
                        if (rkVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, rkVar2, rkVar4)) {
                        break;
                    }
                    rkVar2 = rkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object k(Object obj) {
        if (obj instanceof rd) {
            Throwable th = ((rd) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof rf) {
            throw new ExecutionException(((rf) obj).b);
        }
        if (obj == e) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String b() {
        Object obj = this.value;
        if (obj instanceof ri) {
            return "setFuture=[" + g(((ri) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.hvi
    public final void c(Runnable runnable, Executor executor) {
        f(runnable);
        f(executor);
        rg rgVar = this.listeners;
        if (rgVar != rg.a) {
            rg rgVar2 = new rg(runnable, executor);
            do {
                rgVar2.next = rgVar;
                if (b.c(this, rgVar, rgVar2)) {
                    return;
                } else {
                    rgVar = this.listeners;
                }
            } while (rgVar != rg.a);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj instanceof ri) && !(obj == null)) {
            return false;
        }
        rd rdVar = a ? new rd(z, new CancellationException("Future.cancel() was called.")) : z ? rd.a : rd.b;
        boolean z2 = false;
        while (true) {
            if (b.d(this, obj, rdVar)) {
                d(this);
                if (!(obj instanceof ri)) {
                    break;
                }
                hvi hviVar = ((ri) obj).b;
                if (!(hviVar instanceof rl)) {
                    hviVar.cancel(z);
                    break;
                }
                this = (rl) hviVar;
                obj = this.value;
                if (!(obj == null) && !(obj instanceof ri)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = this.value;
                if (!(obj instanceof ri)) {
                    return z2;
                }
            }
        }
        return true;
    }

    protected boolean e(Object obj) {
        if (obj == null) {
            obj = e;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof ri))) {
            return k(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            rk rkVar = this.waiters;
            if (rkVar != rk.a) {
                rk rkVar2 = new rk();
                do {
                    rkVar2.a(rkVar);
                    if (b.e(this, rkVar, rkVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(rkVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof ri))) {
                                return k(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(rkVar2);
                    } else {
                        rkVar = this.waiters;
                    }
                } while (rkVar != rk.a);
            }
            return k(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof ri))) {
                return k(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String rlVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(a.ag(rlVar, str, " for "));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof rd;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r2 instanceof ri));
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e2.getClass())));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                h(sb);
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
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof ri))) {
                return k(obj2);
            }
            rk rkVar = this.waiters;
            if (rkVar != rk.a) {
                rk rkVar2 = new rk();
                do {
                    rkVar2.a(rkVar);
                    if (b.e(this, rkVar, rkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                j(rkVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof ri))));
                        return k(obj);
                    }
                    rkVar = this.waiters;
                } while (rkVar != rk.a);
            }
            return k(this.value);
        }
        throw new InterruptedException();
    }
}
