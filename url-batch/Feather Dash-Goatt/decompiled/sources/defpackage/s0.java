package defpackage;

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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class s0 implements Future {
    public static final boolean h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger i = Logger.getLogger(s0.class.getName());
    public static final m90 j;
    public static final Object k;
    public volatile Object d;
    public volatile o0 e;
    public volatile r0 g;

    static {
        m90 q0Var;
        try {
            q0Var = new p0(AtomicReferenceFieldUpdater.newUpdater(r0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(r0.class, r0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(s0.class, r0.class, "g"), AtomicReferenceFieldUpdater.newUpdater(s0.class, o0.class, "e"), AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            q0Var = new q0();
        }
        j = q0Var;
        if (th != null) {
            i.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        k = new Object();
    }

    public static void c(s0 s0Var) {
        r0 r0Var;
        o0 o0Var;
        do {
            r0Var = s0Var.g;
        } while (!j.u(s0Var, r0Var, r0.c));
        while (r0Var != null) {
            Thread thread = r0Var.a;
            if (thread != null) {
                r0Var.a = null;
                LockSupport.unpark(thread);
            }
            r0Var = r0Var.b;
        }
        s0Var.b();
        do {
            o0Var = s0Var.e;
        } while (!j.s(s0Var, o0Var));
        o0 o0Var2 = null;
        while (o0Var != null) {
            o0 o0Var3 = o0Var.a;
            o0Var.a = o0Var2;
            o0Var2 = o0Var;
            o0Var = o0Var3;
        }
        while (o0Var2 != null) {
            o0Var2 = o0Var2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                i.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof l0) {
            Throwable th = ((l0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof n0) {
            throw new ExecutionException(((n0) obj).a);
        }
        if (obj == k) {
            return null;
        }
        return obj;
    }

    public static Object e(s0 s0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = s0Var.get();
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
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object e = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(e == this ? "this future" : String.valueOf(e));
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
    public final boolean cancel(boolean z) {
        Object obj = this.d;
        if (obj == null) {
            if (j.t(this, obj, h ? new l0(new CancellationException("Future.cancel() was called."), z) : z ? l0.c : l0.d)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    public final void f(r0 r0Var) {
        r0Var.a = null;
        while (true) {
            r0 r0Var2 = this.g;
            if (r0Var2 == r0.c) {
                return;
            }
            r0 r0Var3 = null;
            while (r0Var2 != null) {
                r0 r0Var4 = r0Var2.b;
                if (r0Var2.a != null) {
                    r0Var3 = r0Var2;
                } else if (r0Var3 != null) {
                    r0Var3.b = r0Var4;
                    if (r0Var3.a == null) {
                        break;
                    }
                } else if (!j.u(this, r0Var2, r0Var4)) {
                    break;
                }
                r0Var2 = r0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        r0 r0Var = r0.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if (obj != null) {
            return d(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            r0 r0Var2 = this.g;
            if (r0Var2 != r0Var) {
                r0 r0Var3 = new r0();
                do {
                    m90 m90Var = j;
                    m90Var.G(r0Var3, r0Var2);
                    if (m90Var.u(this, r0Var2, r0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(r0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(r0Var3);
                    } else {
                        r0Var2 = this.g;
                    }
                } while (r0Var2 != r0Var);
            }
            return d(this.d);
        }
        while (nanos > 0) {
            Object obj3 = this.d;
            if (obj3 != null) {
                return d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String s0Var = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
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
        throw new TimeoutException(str + " for " + s0Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof l0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof l0) {
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

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        r0 r0Var = r0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if (obj2 != null) {
                return d(obj2);
            }
            r0 r0Var2 = this.g;
            if (r0Var2 != r0Var) {
                r0 r0Var3 = new r0();
                do {
                    m90 m90Var = j;
                    m90Var.G(r0Var3, r0Var2);
                    if (m90Var.u(this, r0Var2, r0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.d;
                            } else {
                                f(r0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    r0Var2 = this.g;
                } while (r0Var2 != r0Var);
            }
            return d(this.d);
        }
        throw new InterruptedException();
    }
}
