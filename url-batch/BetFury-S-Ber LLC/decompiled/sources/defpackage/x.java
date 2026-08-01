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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class x implements Future {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger j = Logger.getLogger(x.class.getName());
    public static final mv k;
    public static final Object l;
    public volatile Object f;
    public volatile t g;
    public volatile w h;

    static {
        mv vVar;
        try {
            vVar = new u(AtomicReferenceFieldUpdater.newUpdater(w.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(w.class, w.class, "b"), AtomicReferenceFieldUpdater.newUpdater(x.class, w.class, "h"), AtomicReferenceFieldUpdater.newUpdater(x.class, t.class, "g"), AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            vVar = new v();
        }
        k = vVar;
        if (th != null) {
            j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        l = new Object();
    }

    public static void b(x xVar) {
        w wVar;
        t tVar;
        do {
            wVar = xVar.h;
        } while (!k.f(xVar, wVar, w.c));
        while (wVar != null) {
            Thread thread = wVar.a;
            if (thread != null) {
                wVar.a = null;
                LockSupport.unpark(thread);
            }
            wVar = wVar.b;
        }
        do {
            tVar = xVar.g;
        } while (!k.d(xVar, tVar));
        t tVar2 = null;
        while (tVar != null) {
            t tVar3 = tVar.a;
            tVar.a = tVar2;
            tVar2 = tVar;
            tVar = tVar3;
        }
        while (tVar2 != null) {
            tVar2 = tVar2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof r) {
            Throwable th = ((r) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof s) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == l) {
            return null;
        }
        return obj;
    }

    public static Object d(x xVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = xVar.get();
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
        if (!k.e(this, obj, i ? new r(new CancellationException("Future.cancel() was called."), z) : z ? r.b : r.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(w wVar) {
        wVar.a = null;
        while (true) {
            w wVar2 = this.h;
            if (wVar2 == w.c) {
                return;
            }
            w wVar3 = null;
            while (wVar2 != null) {
                w wVar4 = wVar2.b;
                if (wVar2.a != null) {
                    wVar3 = wVar2;
                } else if (wVar3 != null) {
                    wVar3.b = wVar4;
                    if (wVar3.a == null) {
                        break;
                    }
                } else if (!k.f(this, wVar2, wVar4)) {
                    break;
                }
                wVar2 = wVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        w wVar = w.c;
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
            w wVar2 = this.h;
            if (wVar2 != wVar) {
                w wVar3 = new w();
                do {
                    mv mvVar = k;
                    mvVar.J(wVar3, wVar2);
                    if (mvVar.f(this, wVar2, wVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(wVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(wVar3);
                    } else {
                        wVar2 = this.h;
                    }
                } while (wVar2 != wVar);
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
        String xVar = toString();
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
        throw new TimeoutException(str + " for " + xVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f instanceof r;
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
        if (this.f instanceof r) {
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
        w wVar = w.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if (obj2 != null) {
                return c(obj2);
            }
            w wVar2 = this.h;
            if (wVar2 != wVar) {
                w wVar3 = new w();
                do {
                    mv mvVar = k;
                    mvVar.J(wVar3, wVar2);
                    if (mvVar.f(this, wVar2, wVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                e(wVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    wVar2 = this.h;
                } while (wVar2 != wVar);
            }
            return c(this.f);
        }
        throw new InterruptedException();
    }
}
