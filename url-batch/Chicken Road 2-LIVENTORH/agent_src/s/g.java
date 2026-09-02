package s;

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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class g implements Future {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f3168j = Logger.getLogger(g.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static final h.a f3169k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f3170l;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f3171f;

    /* renamed from: g, reason: collision with root package name */
    public volatile c f3172g;

    /* renamed from: h, reason: collision with root package name */
    public volatile f f3173h;

    static {
        h.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "h"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "g"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f3169k = eVar;
        if (th != null) {
            f3168j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3170l = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f3173h;
        } while (!f3169k.j(gVar, fVar, f.f3165c));
        while (fVar != null) {
            Thread thread = fVar.f3166a;
            if (thread != null) {
                fVar.f3166a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f3167b;
        }
        do {
            cVar = gVar.f3172g;
        } while (!f3169k.h(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f3159a;
            cVar.f3159a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f3159a;
            try {
                throw null;
            } catch (RuntimeException e4) {
                f3168j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e4);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f3157a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3170l) {
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
            Object d = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d == this ? "this future" : String.valueOf(d));
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
        Object obj = this.f3171f;
        if (obj != null) {
            return false;
        }
        if (!f3169k.i(this, obj, i ? new a(z3, new CancellationException("Future.cancel() was called.")) : z3 ? a.f3155b : a.f3156c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f3166a = null;
        while (true) {
            f fVar2 = this.f3173h;
            if (fVar2 == f.f3165c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f3167b;
                if (fVar2.f3166a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f3167b = fVar4;
                    if (fVar3.f3166a == null) {
                        break;
                    }
                } else if (!f3169k.j(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        f fVar = f.f3165c;
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3171f;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f3173h;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    h.a aVar = f3169k;
                    aVar.X(fVar3, fVar2);
                    if (aVar.j(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3171f;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar2 = this.f3173h;
                    }
                } while (fVar2 != fVar);
            }
            return c(this.f3171f);
        }
        while (nanos > 0) {
            Object obj3 = this.f3171f;
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
            String f2 = w0.f(str, " (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = f2 + convert + " " + lowerCase;
                if (z3) {
                    str2 = w0.f(str2, ",");
                }
                f2 = w0.f(str2, " ");
            }
            if (z3) {
                f2 = f2 + nanos2 + " nanoseconds ";
            }
            str = w0.f(f2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(w0.f(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3171f instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3171f != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3171f instanceof a) {
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
        f fVar = f.f3165c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3171f;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar2 = this.f3173h;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    h.a aVar = f3169k;
                    aVar.X(fVar3, fVar2);
                    if (aVar.j(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3171f;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar2 = this.f3173h;
                } while (fVar2 != fVar);
            }
            return c(this.f3171f);
        }
        throw new InterruptedException();
    }
}
