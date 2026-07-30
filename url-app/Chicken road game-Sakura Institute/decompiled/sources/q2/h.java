package q2;

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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class h implements Future {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f7504i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f7505j = Logger.getLogger(h.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static final a8.d f7506k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f7507l;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f7508f;

    /* renamed from: g, reason: collision with root package name */
    public volatile d f7509g;

    /* renamed from: h, reason: collision with root package name */
    public volatile g f7510h;

    static {
        a8.d fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "h"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "g"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f7506k = fVar;
        if (th != null) {
            f7505j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7507l = new Object();
    }

    public static void g(h hVar) {
        g gVar;
        d dVar;
        do {
            gVar = hVar.f7510h;
        } while (!f7506k.s(hVar, gVar, g.f7501c));
        while (gVar != null) {
            Thread thread = gVar.f7502a;
            if (thread != null) {
                gVar.f7502a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f7503b;
        }
        hVar.e();
        do {
            dVar = hVar.f7509g;
        } while (!f7506k.q(hVar, dVar));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f7495a;
            dVar.f7495a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            dVar2 = dVar2.f7495a;
            try {
                throw null;
            } catch (RuntimeException e9) {
                f7505j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e9);
            }
        }
    }

    public static Object h(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f7492b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f7493a);
        }
        if (obj == f7507l) {
            return null;
        }
        return obj;
    }

    public static Object l(h hVar) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object l8 = l(this);
            sb.append("SUCCESS, result=[");
            sb.append(l8 == this ? "this future" : String.valueOf(l8));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        Object obj = this.f7508f;
        if (obj == null) {
            if (f7506k.r(this, obj, f7504i ? new a(new CancellationException("Future.cancel() was called."), z8) : z8 ? a.f7489c : a.f7490d)) {
                g(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        g gVar = g.f7501c;
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7508f;
        if (obj != null) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f7510h;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    a8.d dVar = f7506k;
                    dVar.R(gVar3, gVar2);
                    if (dVar.s(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7508f;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m(gVar3);
                    } else {
                        gVar2 = this.f7510h;
                    }
                } while (gVar2 != gVar);
            }
            return h(this.f7508f);
        }
        while (nanos > 0) {
            Object obj3 = this.f7508f;
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
        String str = "Waited " + j8 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j9 = -nanos;
            long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(convert);
            boolean z8 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z8) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z8) {
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
        return this.f7508f instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7508f != null;
    }

    public final void m(g gVar) {
        gVar.f7502a = null;
        while (true) {
            g gVar2 = this.f7510h;
            if (gVar2 == g.f7501c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f7503b;
                if (gVar2.f7502a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f7503b = gVar4;
                    if (gVar3.f7502a == null) {
                        break;
                    }
                } else if (!f7506k.s(this, gVar2, gVar4)) {
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
        if (this.f7508f instanceof a) {
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
            } catch (RuntimeException e9) {
                str = "Exception thrown from implementation: " + e9.getClass();
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
        g gVar = g.f7501c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7508f;
            if (obj2 != null) {
                return h(obj2);
            }
            g gVar2 = this.f7510h;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    a8.d dVar = f7506k;
                    dVar.R(gVar3, gVar2);
                    if (dVar.s(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7508f;
                            } else {
                                m(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    gVar2 = this.f7510h;
                } while (gVar2 != gVar);
            }
            return h(this.f7508f);
        }
        throw new InterruptedException();
    }

    public void e() {
    }
}
