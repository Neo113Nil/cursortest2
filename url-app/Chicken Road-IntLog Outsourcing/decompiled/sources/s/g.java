package s;

import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements J1.a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11741d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f11742e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final K1.b f11743f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f11744g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f11745a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C1411c f11746b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f11747c;

    static {
        K1.b eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C1411c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f11743f = eVar;
        if (th != null) {
            f11742e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f11744g = new Object();
    }

    public static void e(g gVar) {
        f fVar;
        C1411c c1411c;
        C1411c c1411c2;
        C1411c c1411c3;
        do {
            fVar = gVar.f11747c;
        } while (!f11743f.J(gVar, fVar, f.f11738c));
        while (true) {
            c1411c = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f11739a;
            if (thread != null) {
                fVar.f11739a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f11740b;
        }
        gVar.d();
        do {
            c1411c2 = gVar.f11746b;
        } while (!f11743f.F(gVar, c1411c2, C1411c.f11729d));
        while (true) {
            c1411c3 = c1411c;
            c1411c = c1411c2;
            if (c1411c == null) {
                break;
            }
            c1411c2 = c1411c.f11732c;
            c1411c.f11732c = c1411c3;
        }
        while (c1411c3 != null) {
            C1411c c1411c4 = c1411c3.f11732c;
            f(c1411c3.f11730a, c1411c3.f11731b);
            c1411c3 = c1411c4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f11742e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof C1409a) {
            CancellationException cancellationException = ((C1409a) obj).f11727b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C1410b) {
            throw new ExecutionException(((C1410b) obj).f11728a);
        }
        if (obj == f11744g) {
            return null;
        }
        return obj;
    }

    public static Object h(g gVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = gVar.get();
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

    @Override // J1.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C1411c c1411c = this.f11746b;
        C1411c c1411c2 = C1411c.f11729d;
        if (c1411c != c1411c2) {
            C1411c c1411c3 = new C1411c(runnable, executor);
            do {
                c1411c3.f11732c = c1411c;
                if (f11743f.F(this, c1411c, c1411c3)) {
                    return;
                } else {
                    c1411c = this.f11746b;
                }
            } while (c1411c != c1411c2);
        }
        f(runnable, executor);
    }

    public final void c(StringBuilder sb) {
        try {
            Object h3 = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(h3 == this ? "this future" : String.valueOf(h3));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f11745a;
        if (obj != null) {
            return false;
        }
        if (!f11743f.H(this, obj, f11741d ? new C1409a(z, new CancellationException("Future.cancel() was called.")) : z ? C1409a.f11724c : C1409a.f11725d)) {
            return false;
        }
        e(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f11745a;
        if (obj != null) {
            return g(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f11747c;
            f fVar2 = f.f11738c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    K1.b bVar = f11743f;
                    bVar.c0(fVar3, fVar);
                    if (bVar.J(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11745a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(fVar3);
                    } else {
                        fVar = this.f11747c;
                    }
                } while (fVar != fVar2);
            }
            return g(this.f11745a);
        }
        while (nanos > 0) {
            Object obj3 = this.f11745a;
            if (obj3 != null) {
                return g(obj3);
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
            String e3 = AbstractC0279e.e(str, " (plus ");
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = e3 + convert + " " + lowerCase;
                if (z) {
                    str2 = AbstractC0279e.e(str2, StringUtils.COMMA);
                }
                e3 = AbstractC0279e.e(str2, " ");
            }
            if (z) {
                e3 = e3 + nanos2 + " nanoseconds ";
            }
            str = AbstractC0279e.e(e3, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0279e.e(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    public final void i(f fVar) {
        fVar.f11739a = null;
        while (true) {
            f fVar2 = this.f11747c;
            if (fVar2 == f.f11738c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f11740b;
                if (fVar2.f11739a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f11740b = fVar4;
                    if (fVar3.f11739a == null) {
                        break;
                    }
                } else if (!f11743f.J(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11745a instanceof C1409a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11745a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f11745a instanceof C1409a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11745a;
            if (obj2 != null) {
                return g(obj2);
            }
            f fVar = this.f11747c;
            f fVar2 = f.f11738c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    K1.b bVar = f11743f;
                    bVar.c0(fVar3, fVar);
                    if (bVar.J(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11745a;
                            } else {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    fVar = this.f11747c;
                } while (fVar != fVar2);
            }
            return g(this.f11745a);
        }
        throw new InterruptedException();
    }
}
