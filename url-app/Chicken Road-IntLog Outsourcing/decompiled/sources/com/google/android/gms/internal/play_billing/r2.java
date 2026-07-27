package com.google.android.gms.internal.play_billing;

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
public class r2 implements InterfaceFutureC0386y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5243d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f5244e = Logger.getLogger(r2.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0325d1 f5245f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5246g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5247a;

    /* renamed from: b, reason: collision with root package name */
    public volatile F1 f5248b;

    /* renamed from: c, reason: collision with root package name */
    public volatile q2 f5249c;

    static {
        AbstractC0325d1 p2Var;
        try {
            p2Var = new d2(AtomicReferenceFieldUpdater.newUpdater(q2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(q2.class, q2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r2.class, q2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(r2.class, F1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r2.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            p2Var = new p2(9);
        }
        Throwable th2 = th;
        f5245f = p2Var;
        if (th2 != null) {
            f5244e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f5246g = new Object();
    }

    public static void d(r2 r2Var) {
        q2 q2Var;
        F1 f12;
        F1 f13;
        F1 f14;
        do {
            q2Var = r2Var.f5249c;
        } while (!f5245f.I(r2Var, q2Var, q2.f5235c));
        while (true) {
            f12 = null;
            if (q2Var == null) {
                break;
            }
            Thread thread = q2Var.f5236a;
            if (thread != null) {
                q2Var.f5236a = null;
                LockSupport.unpark(thread);
            }
            q2Var = q2Var.f5237b;
        }
        do {
            f13 = r2Var.f5248b;
        } while (!f5245f.A(r2Var, f13, F1.f5048d));
        while (true) {
            f14 = f12;
            f12 = f13;
            if (f12 == null) {
                break;
            }
            f13 = f12.f5051c;
            f12.f5051c = f14;
        }
        while (f14 != null) {
            Runnable runnable = f14.f5049a;
            F1 f15 = f14.f5051c;
            f(runnable, f14.f5050b);
            f14 = f15;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f5244e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e3);
        }
    }

    public static final Object h(Object obj) {
        if (obj instanceof W0) {
            CancellationException cancellationException = ((W0) obj).f5120a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C0361p1) {
            throw new ExecutionException(((C0361p1) obj).f5233a);
        }
        if (obj == f5246g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0386y0
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        F1 f12 = this.f5248b;
        F1 f13 = F1.f5048d;
        if (f12 != f13) {
            F1 f14 = new F1(runnable, executor);
            do {
                f14.f5051c = f12;
                if (f5245f.A(this, f12, f14)) {
                    return;
                } else {
                    f12 = this.f5248b;
                }
            } while (f12 != f13);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f5247a;
        if (obj != null) {
            return false;
        }
        if (!f5245f.D(this, obj, f5243d ? new W0(new CancellationException("Future.cancel() was called.")) : z ? W0.f5118b : W0.f5119c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
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
            } catch (ExecutionException e6) {
                sb.append("FAILURE, cause=[");
                sb.append(e6.getCause());
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

    public final void g(q2 q2Var) {
        q2Var.f5236a = null;
        while (true) {
            q2 q2Var2 = this.f5249c;
            if (q2Var2 != q2.f5235c) {
                q2 q2Var3 = null;
                while (q2Var2 != null) {
                    q2 q2Var4 = q2Var2.f5237b;
                    if (q2Var2.f5236a != null) {
                        q2Var3 = q2Var2;
                    } else if (q2Var3 != null) {
                        q2Var3.f5237b = q2Var4;
                        if (q2Var3.f5236a == null) {
                            break;
                        }
                    } else if (!f5245f.I(this, q2Var2, q2Var4)) {
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
        Object obj2 = this.f5247a;
        if (obj2 != null) {
            return h(obj2);
        }
        q2 q2Var = this.f5249c;
        q2 q2Var2 = q2.f5235c;
        if (q2Var != q2Var2) {
            q2 q2Var3 = new q2();
            do {
                AbstractC0325d1 abstractC0325d1 = f5245f;
                abstractC0325d1.k(q2Var3, q2Var);
                if (abstractC0325d1.I(this, q2Var, q2Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(q2Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f5247a;
                    } while (obj == null);
                    return h(obj);
                }
                q2Var = this.f5249c;
            } while (q2Var != q2Var2);
        }
        return h(this.f5247a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5247a instanceof W0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5247a != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5247a instanceof W0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                concat = c();
            } catch (RuntimeException e3) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e3.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f5247a;
            if (obj != null) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                q2 q2Var = this.f5249c;
                q2 q2Var2 = q2.f5235c;
                if (q2Var != q2Var2) {
                    q2 q2Var3 = new q2();
                    do {
                        AbstractC0325d1 abstractC0325d1 = f5245f;
                        abstractC0325d1.k(q2Var3, q2Var);
                        if (abstractC0325d1.I(this, q2Var, q2Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5247a;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    g(q2Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(q2Var3);
                        } else {
                            q2Var = this.f5249c;
                        }
                    } while (q2Var != q2Var2);
                }
                return h(this.f5247a);
            }
            while (nanos > 0) {
                Object obj3 = this.f5247a;
                if (obj3 != null) {
                    return h(obj3);
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
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j6 = -nanos;
                long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(convert);
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
            throw new TimeoutException(str + " for " + r2Var);
        }
        throw new InterruptedException();
    }
}
