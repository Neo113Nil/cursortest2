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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class v implements Future {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger j = Logger.getLogger(v.class.getName());
    public static final kr k;
    public static final Object l;
    public volatile Object f;
    public volatile r g;
    public volatile u h;

    static {
        kr tVar;
        try {
            tVar = new s(AtomicReferenceFieldUpdater.newUpdater(u.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(u.class, u.class, "b"), AtomicReferenceFieldUpdater.newUpdater(v.class, u.class, "h"), AtomicReferenceFieldUpdater.newUpdater(v.class, r.class, "g"), AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            tVar = new t();
        }
        k = tVar;
        if (th != null) {
            j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        l = new Object();
    }

    public static void b(v vVar) {
        u uVar;
        r rVar;
        do {
            uVar = vVar.h;
        } while (!k.f(vVar, uVar, u.c));
        while (uVar != null) {
            Thread thread = uVar.a;
            if (thread != null) {
                uVar.a = null;
                LockSupport.unpark(thread);
            }
            uVar = uVar.b;
        }
        do {
            rVar = vVar.g;
        } while (!k.d(vVar, rVar));
        r rVar2 = null;
        while (rVar != null) {
            r rVar3 = rVar.a;
            rVar.a = rVar2;
            rVar2 = rVar;
            rVar = rVar3;
        }
        while (rVar2 != null) {
            rVar2 = rVar2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof p) {
            Throwable th = ((p) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof q) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == l) {
            return null;
        }
        return obj;
    }

    public static Object d(v vVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = vVar.get();
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
        if (!k.e(this, obj, i ? new p(z, new CancellationException("Future.cancel() was called.")) : z ? p.b : p.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(u uVar) {
        uVar.a = null;
        while (true) {
            u uVar2 = this.h;
            if (uVar2 == u.c) {
                return;
            }
            u uVar3 = null;
            while (uVar2 != null) {
                u uVar4 = uVar2.b;
                if (uVar2.a != null) {
                    uVar3 = uVar2;
                } else if (uVar3 != null) {
                    uVar3.b = uVar4;
                    if (uVar3.a == null) {
                        break;
                    }
                } else if (!k.f(this, uVar2, uVar4)) {
                    break;
                }
                uVar2 = uVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        u uVar = u.c;
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
            u uVar2 = this.h;
            if (uVar2 != uVar) {
                u uVar3 = new u();
                do {
                    kr krVar = k;
                    krVar.R(uVar3, uVar2);
                    if (krVar.f(this, uVar2, uVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(uVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(uVar3);
                    } else {
                        uVar2 = this.h;
                    }
                } while (uVar2 != uVar);
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
        String vVar = toString();
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
        throw new TimeoutException(str + " for " + vVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f instanceof p;
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
        if (this.f instanceof p) {
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
        u uVar = u.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if (obj2 != null) {
                return c(obj2);
            }
            u uVar2 = this.h;
            if (uVar2 != uVar) {
                u uVar3 = new u();
                do {
                    kr krVar = k;
                    krVar.R(uVar3, uVar2);
                    if (krVar.f(this, uVar2, uVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                e(uVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    uVar2 = this.h;
                } while (uVar2 != uVar);
            }
            return c(this.f);
        }
        throw new InterruptedException();
    }
}
