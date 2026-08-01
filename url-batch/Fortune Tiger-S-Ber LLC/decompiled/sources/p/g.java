package p;

import androidx.fragment.app.w0;
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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f3011i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f3012j = Logger.getLogger(g.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static final m0.a f3013k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f3014l;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f3015f;
    public volatile c g;
    public volatile f h;

    static {
        m0.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "h"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "g"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f3013k = eVar;
        if (th != null) {
            f3012j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3014l = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.h;
        } while (!f3013k.f(gVar, fVar, f.c));
        while (fVar != null) {
            Thread thread = fVar.f3009a;
            if (thread != null) {
                fVar.f3009a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f3010b;
        }
        do {
            cVar = gVar.g;
        } while (!f3013k.d(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f3004a;
            cVar.f3004a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f3004a;
            try {
                throw null;
            } catch (RuntimeException e4) {
                f3012j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e4);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f3002a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3014l) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d4 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d4 == this ? "this future" : String.valueOf(d4));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f3015f;
        if (obj != null) {
            return false;
        }
        if (!f3013k.e(this, obj, f3011i ? new a(z3, new CancellationException("Future.cancel() was called.")) : z3 ? a.f3001b : a.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f3009a = null;
        while (true) {
            f fVar2 = this.h;
            if (fVar2 == f.c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f3010b;
                if (fVar2.f3009a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f3010b = fVar4;
                    if (fVar3.f3009a == null) {
                        break;
                    }
                } else if (!f3013k.f(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        f fVar = f.c;
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3015f;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.h;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    m0.a aVar = f3013k;
                    aVar.v(fVar3, fVar2);
                    if (aVar.f(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3015f;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar2 = this.h;
                    }
                } while (fVar2 != fVar);
            }
            return c(this.f3015f);
        }
        while (nanos > 0) {
            Object obj3 = this.f3015f;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String f4 = w0.f(str, " (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = f4 + convert + " " + lowerCase;
                if (z3) {
                    str2 = w0.f(str2, ",");
                }
                f4 = w0.f(str2, " ");
            }
            if (z3) {
                f4 = f4 + nanos2 + " nanoseconds ";
            }
            str = w0.f(f4, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(w0.f(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3015f instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3015f != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3015f instanceof a) {
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
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
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
        f fVar = f.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3015f;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar2 = this.h;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    m0.a aVar = f3013k;
                    aVar.v(fVar3, fVar2);
                    if (aVar.f(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3015f;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar2 = this.h;
                } while (fVar2 != fVar);
            }
            return c(this.f3015f);
        }
        throw new InterruptedException();
    }
}
