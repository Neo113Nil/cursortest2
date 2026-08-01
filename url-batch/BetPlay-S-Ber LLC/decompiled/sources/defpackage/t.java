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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class t implements Future {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger j = Logger.getLogger(t.class.getName());
    public static final l70 k;
    public static final Object l;
    public volatile Object f;
    public volatile p g;
    public volatile s h;

    static {
        l70 rVar;
        try {
            rVar = new q(AtomicReferenceFieldUpdater.newUpdater(s.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(s.class, s.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t.class, s.class, "h"), AtomicReferenceFieldUpdater.newUpdater(t.class, p.class, "g"), AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            rVar = new r();
        }
        k = rVar;
        if (th != null) {
            j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        l = new Object();
    }

    public static void b(t tVar) {
        s sVar;
        p pVar;
        do {
            sVar = tVar.h;
        } while (!k.e(tVar, sVar, s.c));
        while (sVar != null) {
            Thread thread = sVar.a;
            if (thread != null) {
                sVar.a = null;
                LockSupport.unpark(thread);
            }
            sVar = sVar.b;
        }
        do {
            pVar = tVar.g;
        } while (!k.c(tVar, pVar));
        p pVar2 = null;
        while (pVar != null) {
            p pVar3 = pVar.a;
            pVar.a = pVar2;
            pVar2 = pVar;
            pVar = pVar3;
        }
        while (pVar2 != null) {
            pVar2 = pVar2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof n) {
            Throwable th = ((n) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof o) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == l) {
            return null;
        }
        return obj;
    }

    public static Object d(t tVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = tVar.get();
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
            Object d = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d == this ? "this future" : String.valueOf(d));
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f;
        if (obj != null) {
            return false;
        }
        if (!k.d(this, obj, i ? new n(z, new CancellationException("Future.cancel() was called.")) : z ? n.b : n.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(s sVar) {
        sVar.a = null;
        while (true) {
            s sVar2 = this.h;
            if (sVar2 == s.c) {
                return;
            }
            s sVar3 = null;
            while (sVar2 != null) {
                s sVar4 = sVar2.b;
                if (sVar2.a != null) {
                    sVar3 = sVar2;
                } else if (sVar3 != null) {
                    sVar3.b = sVar4;
                    if (sVar3.a == null) {
                        break;
                    }
                } else if (!k.e(this, sVar2, sVar4)) {
                    break;
                }
                sVar2 = sVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        s sVar = s.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            s sVar2 = this.h;
            if (sVar2 != sVar) {
                s sVar3 = new s();
                do {
                    l70 l70Var = k;
                    l70Var.J(sVar3, sVar2);
                    if (l70Var.e(this, sVar2, sVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(sVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(sVar3);
                    } else {
                        sVar2 = this.h;
                    }
                } while (sVar2 != sVar);
            }
            return c(this.f);
        }
        while (nanos > 0) {
            Object obj3 = this.f;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String tVar = toString();
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
        throw new TimeoutException(str + " for " + tVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f instanceof n;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof n) {
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

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        s sVar = s.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if (obj2 != null) {
                return c(obj2);
            }
            s sVar2 = this.h;
            if (sVar2 != sVar) {
                s sVar3 = new s();
                do {
                    l70 l70Var = k;
                    l70Var.J(sVar3, sVar2);
                    if (l70Var.e(this, sVar2, sVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                e(sVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    sVar2 = this.h;
                } while (sVar2 != sVar);
            }
            return c(this.f);
        }
        throw new InterruptedException();
    }
}
