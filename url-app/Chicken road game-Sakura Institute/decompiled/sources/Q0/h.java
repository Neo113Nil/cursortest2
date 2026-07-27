package Q0;

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

/* loaded from: classes.dex */
public abstract class h implements Future {

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f3932j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f3933k = Logger.getLogger(h.class.getName());

    /* renamed from: l, reason: collision with root package name */
    public static final j0.c f3934l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f3935m;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f3936d;

    /* renamed from: e, reason: collision with root package name */
    public volatile d f3937e;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f3938i;

    static {
        j0.c fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "i"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "e"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f3934l = fVar;
        if (th != null) {
            f3933k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3935m = new Object();
    }

    public static void e(h hVar) {
        g gVar;
        d dVar;
        do {
            gVar = hVar.f3938i;
        } while (!f3934l.q(hVar, gVar, g.f3929c));
        while (gVar != null) {
            Thread thread = gVar.f3930a;
            if (thread != null) {
                gVar.f3930a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f3931b;
        }
        hVar.c();
        do {
            dVar = hVar.f3937e;
        } while (!f3934l.o(hVar, dVar));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f3923a;
            dVar.f3923a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            dVar2 = dVar2.f3923a;
            try {
                throw null;
            } catch (RuntimeException e4) {
                f3933k.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e4);
            }
        }
    }

    public static Object h(Object obj) {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f3920b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f3921a);
        }
        if (obj == f3935m) {
            return null;
        }
        return obj;
    }

    public static Object j(h hVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object j4 = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(j4 == this ? "this future" : String.valueOf(j4));
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

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f3936d;
        if (obj != null) {
            return false;
        }
        if (!f3934l.p(this, obj, f3932j ? new a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? a.f3917c : a.f3918d)) {
            return false;
        }
        e(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3936d;
        if (obj != null) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar = this.f3938i;
            g gVar2 = g.f3929c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    j0.c cVar = f3934l;
                    cVar.G(gVar3, gVar);
                    if (cVar.q(this, gVar, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                l(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3936d;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        l(gVar3);
                    } else {
                        gVar = this.f3938i;
                    }
                } while (gVar != gVar2);
            }
            return h(this.f3936d);
        }
        while (nanos > 0) {
            Object obj3 = this.f3936d;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String hVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z4 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z4) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z4) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + hVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3936d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3936d != null;
    }

    public final void l(g gVar) {
        gVar.f3930a = null;
        while (true) {
            g gVar2 = this.f3938i;
            if (gVar2 == g.f3929c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f3931b;
                if (gVar2.f3930a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f3931b = gVar4;
                    if (gVar3.f3930a == null) {
                        break;
                    }
                } else if (!f3934l.q(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3936d instanceof a) {
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f3936d;
            if (obj2 != null) {
                return h(obj2);
            }
            g gVar = this.f3938i;
            g gVar2 = g.f3929c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    j0.c cVar = f3934l;
                    cVar.G(gVar3, gVar);
                    if (cVar.q(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3936d;
                            } else {
                                l(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    gVar = this.f3938i;
                } while (gVar != gVar2);
            }
            return h(this.f3936d);
        }
        throw new InterruptedException();
    }
}
