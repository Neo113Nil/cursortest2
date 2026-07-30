package f;

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

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f258e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f259f = Logger.getLogger(g.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final a.a f260g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f261h;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f262b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f263c;

    /* renamed from: d, reason: collision with root package name */
    public volatile f f264d;

    static {
        a.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "d"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f260g = eVar;
        if (th != null) {
            f259f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f261h = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f264d;
        } while (!f260g.f(gVar, fVar, f.f255c));
        while (fVar != null) {
            Thread thread = fVar.f256a;
            if (thread != null) {
                fVar.f256a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f257b;
        }
        do {
            cVar = gVar.f263c;
        } while (!f260g.d(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f249a;
            cVar.f249a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f249a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f259f.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f247a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f261h) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d2 == this ? "this future" : String.valueOf(d2));
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
    public final boolean cancel(boolean z2) {
        Object obj = this.f262b;
        if (obj != null) {
            return false;
        }
        if (!f260g.e(this, obj, f258e ? new a(new CancellationException("Future.cancel() was called."), z2) : z2 ? a.f245b : a.f246c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f256a = null;
        while (true) {
            f fVar2 = this.f264d;
            if (fVar2 == f.f255c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f257b;
                if (fVar2.f256a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f257b = fVar4;
                    if (fVar3.f256a == null) {
                        break;
                    }
                } else if (!f260g.f(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        f fVar = f.f255c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f262b;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f264d;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    a.a aVar = f260g;
                    aVar.t(fVar3, fVar2);
                    if (aVar.f(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f262b;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar2 = this.f264d;
                    }
                } while (fVar2 != fVar);
            }
            return c(this.f262b);
        }
        while (nanos > 0) {
            Object obj3 = this.f262b;
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
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z2) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z2) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f262b instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f262b != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f262b instanceof a) {
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
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
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
        f fVar = f.f255c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f262b;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar2 = this.f264d;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    a.a aVar = f260g;
                    aVar.t(fVar3, fVar2);
                    if (aVar.f(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f262b;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar2 = this.f264d;
                } while (fVar2 != fVar);
            }
            return c(this.f262b);
        }
        throw new InterruptedException();
    }
}
