package com.google.android.gms.internal.play_billing;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class Z extends N implements I {

    /* renamed from: h, reason: collision with root package name */
    public W f5929h;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f5930i;

    public static Object d(Object obj) {
        if (obj instanceof D) {
            Throwable th = ((D) obj).f5815b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (!(obj instanceof G)) {
            if (obj == N.f5887d) {
                return null;
            }
            return obj;
        }
        Throwable th2 = ((G) obj).f5836a;
        if (th2 != null) {
            throw new ExecutionException(th2);
        }
        N.f5888e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(G.f5835c.f5836a);
    }

    public static boolean f(Object obj) {
        return !(obj instanceof E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object g(W w4) {
        Object obj;
        Throwable b4;
        if (w4 instanceof I) {
            Object obj2 = ((Z) w4).f5891a;
            if (obj2 instanceof D) {
                D d4 = (D) obj2;
                if (d4.f5814a) {
                    Throwable th = d4.f5815b;
                    obj2 = th != null ? new D(th, false) : D.f5813d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((w4 instanceof AbstractC0299a0) && (b4 = ((AbstractC0299a0) w4).b()) != null) {
            return new G(b4);
        }
        boolean isCancelled = w4.isCancelled();
        boolean z = true;
        if ((!N.f5889f) && isCancelled) {
            D d5 = D.f5813d;
            Objects.requireNonNull(d5);
            return d5;
        }
        boolean z4 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = w4.get();
                        break;
                    } catch (Error e4) {
                        e = e4;
                        return new G(e);
                    }
                } catch (InterruptedException unused) {
                    z4 = z;
                } catch (Throwable th2) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e5) {
                e = e5;
                return new G(e);
            } catch (CancellationException e6) {
                return !isCancelled ? new G(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(w4)), e6)) : new D(e6, false);
            } catch (ExecutionException e7) {
                return isCancelled ? new D(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(w4)), e7), false) : new G(e7.getCause());
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new D(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(w4))), false) : obj == null ? N.f5887d : obj;
    }

    public static void i(Z z) {
        H h2;
        H h4 = null;
        while (true) {
            z.getClass();
            for (M M4 = N.f5890g.M(z); M4 != null; M4 = M4.f5875b) {
                Thread thread = M4.f5874a;
                if (thread != null) {
                    M4.f5874a = null;
                    LockSupport.unpark(thread);
                }
            }
            W w4 = z.f5929h;
            if ((z.f5891a instanceof D) & (w4 != null)) {
                Object obj = z.f5891a;
                w4.cancel((obj instanceof D) && ((D) obj).f5814a);
            }
            ScheduledFuture scheduledFuture = z.f5930i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            z.f5929h = null;
            z.f5930i = null;
            H h5 = h4;
            H K2 = N.f5890g.K(z);
            H h6 = h5;
            while (K2 != null) {
                H h7 = K2.f5848c;
                K2.f5848c = h6;
                h6 = K2;
                K2 = h7;
            }
            while (h6 != null) {
                Runnable runnable = h6.f5846a;
                h2 = h6.f5848c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof E) {
                    E e4 = (E) runnable;
                    z = e4.f5816a;
                    if (z.f5891a == e4) {
                        if (N.f5890g.R(z, e4, g(e4.f5817b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = h6.f5847b;
                    Objects.requireNonNull(executor);
                    j(runnable, executor);
                }
                h6 = h2;
            }
            return;
            h4 = h2;
        }
    }

    public static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            N.f5888e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.W
    public final void a(Runnable runnable, Executor executor) {
        H h2;
        H h4 = H.f5845d;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (h2 = this.f5892b) != h4) {
            H h5 = new H(runnable, executor);
            do {
                h5.f5848c = h2;
                if (N.f5890g.Q(this, h2, h5)) {
                    return;
                } else {
                    h2 = this.f5892b;
                }
            } while (h2 != h4);
        }
        j(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0299a0
    public final Throwable b() {
        if (!(this instanceof I)) {
            return null;
        }
        Object obj = this.f5891a;
        if (obj instanceof G) {
            return ((G) obj).f5836a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        D d4;
        Object obj = this.f5891a;
        if (!(obj instanceof E) && !(obj == null)) {
            return false;
        }
        if (N.f5889f) {
            d4 = new D(new CancellationException("Future.cancel() was called."), z);
        } else {
            d4 = z ? D.f5812c : D.f5813d;
            Objects.requireNonNull(d4);
        }
        Z z4 = this;
        boolean z5 = false;
        while (true) {
            if (N.f5890g.R(z4, obj, d4)) {
                i(z4);
                if (!(obj instanceof E)) {
                    break;
                }
                W w4 = ((E) obj).f5817b;
                if (!(w4 instanceof I)) {
                    w4.cancel(z);
                    break;
                }
                z4 = (Z) w4;
                obj = z4.f5891a;
                if (!(obj == null) && !(obj instanceof E)) {
                    break;
                }
                z5 = true;
            } else {
                obj = z4.f5891a;
                if (f(obj)) {
                    return z5;
                }
            }
        }
    }

    public final String e() {
        W w4 = this.f5929h;
        ScheduledFuture scheduledFuture = this.f5930i;
        if (w4 == null) {
            return null;
        }
        String a3 = AbstractC1514c.a("inputFuture=[", w4.toString(), "]");
        if (scheduledFuture == null) {
            return a3;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return a3;
        }
        return a3 + ", remaining delay=[" + delay + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        M m4 = M.f5873c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5891a;
        if ((obj2 != null) && f(obj2)) {
            return d(obj2);
        }
        M m5 = this.f5893c;
        if (m5 != m4) {
            M m6 = new M();
            do {
                O3.d dVar = N.f5890g;
                dVar.O(m6, m5);
                if (dVar.S(this, m5, m6)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            c(m6);
                            throw new InterruptedException();
                        }
                        obj = this.f5891a;
                    } while (!((obj != null) & f(obj)));
                    return d(obj);
                }
                m5 = this.f5893c;
            } while (m5 != m4);
        }
        Object obj3 = this.f5891a;
        Objects.requireNonNull(obj3);
        return d(obj3);
    }

    public final void h(StringBuilder sb) {
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
            } catch (ExecutionException e4) {
                sb.append("FAILURE, cause=[");
                sb.append(e4.getCause());
                sb.append("]");
                return;
            } catch (Exception e5) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e5.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5891a instanceof D;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f5891a;
        return (obj != null) & f(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r3.isEmpty() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f5891a instanceof D) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f5891a;
            if (obj instanceof E) {
                sb.append(", setFuture=[");
                W w4 = ((E) obj).f5817b;
                try {
                    if (w4 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(w4);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = e();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                h(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        long j5;
        M m4 = M.f5873c;
        long nanos = timeUnit.toNanos(j4);
        if (!Thread.interrupted()) {
            Object obj = this.f5891a;
            if ((obj != null) & f(obj)) {
                return d(obj);
            }
            long j6 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                M m5 = this.f5893c;
                if (m5 != m4) {
                    M m6 = new M();
                    while (true) {
                        O3.d dVar = N.f5890g;
                        dVar.O(m6, m5);
                        if (dVar.S(this, m5, m6)) {
                            j5 = j6;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5891a;
                                    if ((obj2 != null) & f(obj2)) {
                                        return d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    c(m6);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            c(m6);
                        } else {
                            long j7 = j6;
                            m5 = this.f5893c;
                            if (m5 == m4) {
                                break;
                            }
                            j6 = j7;
                        }
                    }
                }
                Object obj3 = this.f5891a;
                Objects.requireNonNull(obj3);
                return d(obj3);
            }
            j5 = 0;
            while (nanos > j5) {
                Object obj4 = this.f5891a;
                if ((obj4 != null) & f(obj4)) {
                    return d(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String z = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j5) {
                String concat = str.concat(" (plus ");
                long j8 = -nanos;
                long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit.toNanos(convert);
                boolean z4 = convert == j5 || nanos2 > 1000;
                if (convert > j5) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z4) {
                        str2 = str2.concat(StringUtils.COMMA);
                    }
                    concat = str2.concat(" ");
                }
                if (z4) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC1514c.b(str, " for ", z));
        }
        throw new InterruptedException();
    }
}
