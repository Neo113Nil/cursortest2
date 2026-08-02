package r;

import E.AbstractC0005f;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
import x.AbstractC1514c;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f15106d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f15107e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final V3.b f15108f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f15109g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f15110a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C1389c f15111b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f15112c;

    static {
        V3.b eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C1389c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f15108f = eVar;
        if (th != null) {
            f15107e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15109g = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        C1389c c1389c;
        do {
            fVar = gVar.f15112c;
        } while (!f15108f.i(gVar, fVar, f.f15103c));
        while (fVar != null) {
            Thread thread = fVar.f15104a;
            if (thread != null) {
                fVar.f15104a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f15105b;
        }
        do {
            c1389c = gVar.f15111b;
        } while (!f15108f.g(gVar, c1389c, C1389c.f15095c));
        C1389c c1389c2 = null;
        while (c1389c != null) {
            C1389c c1389c3 = c1389c.f15097b;
            c1389c.f15097b = c1389c2;
            c1389c2 = c1389c;
            c1389c = c1389c3;
        }
        while (c1389c2 != null) {
            C1389c c1389c4 = c1389c2.f15097b;
            Runnable runnable = c1389c2.f15096a;
            try {
                throw null;
            } catch (RuntimeException e4) {
                f15107e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor null", (Throwable) e4);
                c1389c2 = c1389c4;
            }
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof C1387a) {
            Throwable th = ((C1387a) obj).f15094a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC1388b) {
            ((AbstractC1388b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f15109g) {
            return null;
        }
        return obj;
    }

    public static Object e(g gVar) {
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

    public final void b(StringBuilder sb) {
        try {
            Object e4 = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(e4 == this ? "this future" : String.valueOf(e4));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f15110a;
        if (obj != null) {
            return false;
        }
        if (!f15108f.h(this, obj, f15106d ? new C1387a(new CancellationException("Future.cancel() was called."), z) : z ? C1387a.f15092b : C1387a.f15093c)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void f(f fVar) {
        fVar.f15104a = null;
        while (true) {
            f fVar2 = this.f15112c;
            if (fVar2 == f.f15103c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f15105b;
                if (fVar2.f15104a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f15105b = fVar4;
                    if (fVar3.f15104a == null) {
                        break;
                    }
                } else if (!f15108f.i(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        f fVar = f.f15103c;
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f15110a;
        if (obj != null) {
            return d(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f15112c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    V3.b bVar = f15108f;
                    bVar.v(fVar3, fVar2);
                    if (bVar.i(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f15110a;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(fVar3);
                    } else {
                        fVar2 = this.f15112c;
                    }
                } while (fVar2 != fVar);
            }
            return d(this.f15110a);
        }
        while (nanos > 0) {
            Object obj3 = this.f15110a;
            if (obj3 != null) {
                return d(obj3);
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
            String z = AbstractC0005f.z(str, " (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z4 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = z + convert + " " + lowerCase;
                if (z4) {
                    str2 = AbstractC0005f.z(str2, StringUtils.COMMA);
                }
                z = AbstractC0005f.z(str2, " ");
            }
            if (z4) {
                z = z + nanos2 + " nanoseconds ";
            }
            str = AbstractC0005f.z(z, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0005f.z(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC1514c.b(str, " for ", gVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15110a instanceof C1387a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15110a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15110a instanceof C1387a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
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
                b(sb);
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
        f fVar = f.f15103c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15110a;
            if (obj2 != null) {
                return d(obj2);
            }
            f fVar2 = this.f15112c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    V3.b bVar = f15108f;
                    bVar.v(fVar3, fVar2);
                    if (bVar.i(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15110a;
                            } else {
                                f(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    fVar2 = this.f15112c;
                } while (fVar2 != fVar);
            }
            return d(this.f15110a);
        }
        throw new InterruptedException();
    }
}
