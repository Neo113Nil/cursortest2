package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* loaded from: classes.dex */
public class r2 implements InterfaceFutureC0277y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2916d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f2917e = Logger.getLogger(r2.class.getName());
    public static final AbstractC0216d1 f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2918g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2919a;

    /* renamed from: b, reason: collision with root package name */
    public volatile F1 f2920b;

    /* renamed from: c, reason: collision with root package name */
    public volatile q2 f2921c;

    static {
        AbstractC0216d1 p2Var;
        try {
            p2Var = new d2(AtomicReferenceFieldUpdater.newUpdater(q2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(q2.class, q2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r2.class, q2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(r2.class, F1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r2.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            p2Var = new p2(9);
        }
        Throwable th2 = th;
        f = p2Var;
        if (th2 != null) {
            f2917e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f2918g = new Object();
    }

    public static void c(r2 r2Var) {
        q2 q2Var;
        F1 f12;
        F1 f13;
        F1 f14;
        do {
            q2Var = r2Var.f2921c;
        } while (!f.A(r2Var, q2Var, q2.f2908c));
        while (true) {
            f12 = null;
            if (q2Var == null) {
                break;
            }
            Thread thread = q2Var.f2909a;
            if (thread != null) {
                q2Var.f2909a = null;
                LockSupport.unpark(thread);
            }
            q2Var = q2Var.f2910b;
        }
        do {
            f13 = r2Var.f2920b;
        } while (!f.t(r2Var, f13, F1.f2732d));
        while (true) {
            f14 = f12;
            f12 = f13;
            if (f12 == null) {
                break;
            }
            f13 = f12.f2735c;
            f12.f2735c = f14;
        }
        while (f14 != null) {
            Runnable runnable = f14.f2733a;
            F1 f15 = f14.f2735c;
            e(runnable, f14.f2734b);
            f14 = f15;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f2917e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e3);
        }
    }

    public static final Object g(Object obj) {
        if (obj instanceof W0) {
            CancellationException cancellationException = ((W0) obj).f2808a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C0252p1) {
            throw new ExecutionException(((C0252p1) obj).f2906a);
        }
        if (obj == f2918g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0277y0
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        F1 f12 = this.f2920b;
        F1 f13 = F1.f2732d;
        if (f12 != f13) {
            F1 f14 = new F1(runnable, executor);
            do {
                f14.f2735c = f12;
                if (f.t(this, f12, f14)) {
                    return;
                } else {
                    f12 = this.f2920b;
                }
            } while (f12 != f13);
        }
        e(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f2919a;
        if (obj != null) {
            return false;
        }
        if (!f.v(this, obj, f2916d ? new W0(new CancellationException("Future.cancel() was called.")) : z ? W0.f2806b : W0.f2807c)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e4) {
                sb.append("FAILURE, cause=[");
                sb.append(e4.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void f(q2 q2Var) {
        q2Var.f2909a = null;
        while (true) {
            q2 q2Var2 = this.f2921c;
            if (q2Var2 != q2.f2908c) {
                q2 q2Var3 = null;
                while (q2Var2 != null) {
                    q2 q2Var4 = q2Var2.f2910b;
                    if (q2Var2.f2909a != null) {
                        q2Var3 = q2Var2;
                    } else if (q2Var3 != null) {
                        q2Var3.f2910b = q2Var4;
                        if (q2Var3.f2909a == null) {
                            break;
                        }
                    } else if (!f.A(this, q2Var2, q2Var4)) {
                        break;
                    }
                    q2Var2 = q2Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f2919a;
        if (obj2 != null) {
            return g(obj2);
        }
        q2 q2Var = this.f2921c;
        q2 q2Var2 = q2.f2908c;
        if (q2Var != q2Var2) {
            q2 q2Var3 = new q2();
            do {
                AbstractC0216d1 abstractC0216d1 = f;
                abstractC0216d1.i(q2Var3, q2Var);
                if (abstractC0216d1.A(this, q2Var, q2Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(q2Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f2919a;
                    } while (obj == null);
                    return g(obj);
                }
                q2Var = this.f2921c;
            } while (q2Var != q2Var2);
        }
        return g(this.f2919a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2919a instanceof W0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2919a != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2919a instanceof W0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e3) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e3.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f2919a;
            if (obj != null) {
                return g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                q2 q2Var = this.f2921c;
                q2 q2Var2 = q2.f2908c;
                if (q2Var != q2Var2) {
                    q2 q2Var3 = new q2();
                    do {
                        AbstractC0216d1 abstractC0216d1 = f;
                        abstractC0216d1.i(q2Var3, q2Var);
                        if (abstractC0216d1.A(this, q2Var, q2Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2919a;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    f(q2Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(q2Var3);
                        } else {
                            q2Var = this.f2921c;
                        }
                    } while (q2Var != q2Var2);
                }
                return g(this.f2919a);
            }
            while (nanos > 0) {
                Object obj3 = this.f2919a;
                if (obj3 != null) {
                    return g(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String r2Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                boolean z = true;
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(StringUtils.COMMA);
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
            throw new TimeoutException(AbstractC0033i.k(str, " for ", r2Var));
        }
        throw new InterruptedException();
    }
}
