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
import x.AbstractC1514c;

/* loaded from: classes.dex */
public class G1 implements W {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5838d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f5839e = Logger.getLogger(G1.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final U.i f5840f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5841g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5842a;

    /* renamed from: b, reason: collision with root package name */
    public volatile U0 f5843b;

    /* renamed from: c, reason: collision with root package name */
    public volatile F1 f5844c;

    static {
        U.i e12;
        try {
            e12 = new s1(AtomicReferenceFieldUpdater.newUpdater(F1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(F1.class, F1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(G1.class, F1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(G1.class, U0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(G1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            e12 = new E1();
        }
        Throwable th2 = th;
        f5840f = e12;
        if (th2 != null) {
            f5839e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f5841g = new Object();
    }

    public static void c(G1 g12) {
        F1 f12;
        U.i iVar;
        U0 u02;
        U0 u03;
        U0 u04;
        do {
            f12 = g12.f5844c;
            iVar = f5840f;
        } while (!iVar.N(g12, f12, F1.f5831c));
        while (true) {
            u02 = null;
            if (f12 == null) {
                break;
            }
            Thread thread = f12.f5832a;
            if (thread != null) {
                f12.f5832a = null;
                LockSupport.unpark(thread);
            }
            f12 = f12.f5833b;
        }
        do {
            u03 = g12.f5843b;
        } while (!iVar.K(g12, u03, U0.f5915d));
        while (true) {
            u04 = u02;
            u02 = u03;
            if (u02 == null) {
                break;
            }
            u03 = u02.f5918c;
            u02.f5918c = u04;
        }
        while (u04 != null) {
            Runnable runnable = u04.f5916a;
            U0 u05 = u04.f5918c;
            e(runnable, u04.f5917b);
            u04 = u05;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f5839e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e4);
        }
    }

    public static final Object g(Object obj) {
        if (obj instanceof C0332l0) {
            Throwable th = ((C0332l0) obj).f5970a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof G0) {
            throw new ExecutionException(((G0) obj).f5837a);
        }
        if (obj == f5841g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.W
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        U0 u02 = this.f5843b;
        U0 u03 = U0.f5915d;
        if (u02 != u03) {
            U0 u04 = new U0(runnable, executor);
            do {
                u04.f5918c = u02;
                if (f5840f.K(this, u02, u04)) {
                    return;
                } else {
                    u02 = this.f5843b;
                }
            } while (u02 != u03);
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
        Object obj = this.f5842a;
        if (obj != null) {
            return false;
        }
        if (!f5840f.M(this, obj, f5838d ? new C0332l0(new CancellationException("Future.cancel() was called.")) : z ? C0332l0.f5968b : C0332l0.f5969c)) {
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
            } catch (RuntimeException e4) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e4.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e5) {
                sb.append("FAILURE, cause=[");
                sb.append(e5.getCause());
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

    public final void f(F1 f12) {
        f12.f5832a = null;
        while (true) {
            F1 f13 = this.f5844c;
            if (f13 != F1.f5831c) {
                F1 f14 = null;
                while (f13 != null) {
                    F1 f15 = f13.f5833b;
                    if (f13.f5832a != null) {
                        f14 = f13;
                    } else if (f14 != null) {
                        f14.f5833b = f15;
                        if (f14.f5832a == null) {
                            break;
                        }
                    } else if (!f5840f.N(this, f13, f15)) {
                        break;
                    }
                    f13 = f15;
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
        Object obj2 = this.f5842a;
        if (obj2 != null) {
            return g(obj2);
        }
        F1 f12 = this.f5844c;
        F1 f13 = F1.f5831c;
        if (f12 != f13) {
            F1 f14 = new F1();
            do {
                U.i iVar = f5840f;
                iVar.H(f14, f12);
                if (iVar.N(this, f12, f14)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(f14);
                            throw new InterruptedException();
                        }
                        obj = this.f5842a;
                    } while (obj == null);
                    return g(obj);
                }
                f12 = this.f5844c;
            } while (f12 != f13);
        }
        return g(this.f5842a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5842a instanceof C0332l0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5842a != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5842a instanceof C0332l0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e4) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e4.getClass()));
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
    public final Object get(long j4, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4);
        if (!Thread.interrupted()) {
            Object obj = this.f5842a;
            if (obj != null) {
                return g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                F1 f12 = this.f5844c;
                F1 f13 = F1.f5831c;
                if (f12 != f13) {
                    F1 f14 = new F1();
                    do {
                        U.i iVar = f5840f;
                        iVar.H(f14, f12);
                        if (iVar.N(this, f12, f14)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5842a;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    f(f14);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(f14);
                        } else {
                            f12 = this.f5844c;
                        }
                    } while (f12 != f13);
                }
                return g(this.f5842a);
            }
            while (nanos > 0) {
                Object obj3 = this.f5842a;
                if (obj3 != null) {
                    return g(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String g12 = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j5 = -nanos;
                long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(convert);
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
            throw new TimeoutException(AbstractC1514c.b(str, " for ", g12));
        }
        throw new InterruptedException();
    }
}
