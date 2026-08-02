package r;

import E1.AbstractC0033i;
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

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f10253d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f10254e = Logger.getLogger(g.class.getName());
    public static final android.support.v4.media.session.a f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f10255g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f10256a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f10257b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f10258c;

    static {
        android.support.v4.media.session.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f = eVar;
        if (th != null) {
            f10254e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f10255g = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f10258c;
        } while (!f.h(gVar, fVar, f.f10250c));
        while (fVar != null) {
            Thread thread = fVar.f10251a;
            if (thread != null) {
                fVar.f10251a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f10252b;
        }
        do {
            cVar = gVar.f10257b;
        } while (!f.f(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f10245a;
            cVar.f10245a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f10245a;
            try {
                throw null;
            } catch (RuntimeException e3) {
                f10254e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e3);
            }
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof C1181a) {
            CancellationException cancellationException = ((C1181a) obj).f10243a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f10255g) {
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
            Object e3 = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(e3 == this ? "this future" : String.valueOf(e3));
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
    public final boolean cancel(boolean z) {
        Object obj = this.f10256a;
        if (obj != null) {
            return false;
        }
        if (!f.g(this, obj, f10253d ? new C1181a(z, new CancellationException("Future.cancel() was called.")) : z ? C1181a.f10241b : C1181a.f10242c)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void f(f fVar) {
        fVar.f10251a = null;
        while (true) {
            f fVar2 = this.f10258c;
            if (fVar2 == f.f10250c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f10252b;
                if (fVar2.f10251a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f10252b = fVar4;
                    if (fVar3.f10251a == null) {
                        break;
                    }
                } else if (!f.h(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f10256a;
        if (obj != null) {
            return d(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f10258c;
            f fVar2 = f.f10250c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    android.support.v4.media.session.a aVar = f;
                    aVar.F(fVar3, fVar);
                    if (aVar.h(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10256a;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(fVar3);
                    } else {
                        fVar = this.f10258c;
                    }
                } while (fVar != fVar2);
            }
            return d(this.f10256a);
        }
        while (nanos > 0) {
            Object obj3 = this.f10256a;
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
        String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String s3 = AbstractC0033i.s(str, " (plus ");
            long j4 = -nanos;
            long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = s3 + convert + " " + lowerCase;
                if (z) {
                    str2 = AbstractC0033i.s(str2, StringUtils.COMMA);
                }
                s3 = AbstractC0033i.s(str2, " ");
            }
            if (z) {
                s3 = s3 + nanos2 + " nanoseconds ";
            }
            str = AbstractC0033i.s(s3, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0033i.s(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC0033i.k(str, " for ", gVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10256a instanceof C1181a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f10256a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f10256a instanceof C1181a) {
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
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f10256a;
            if (obj2 != null) {
                return d(obj2);
            }
            f fVar = this.f10258c;
            f fVar2 = f.f10250c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    android.support.v4.media.session.a aVar = f;
                    aVar.F(fVar3, fVar);
                    if (aVar.h(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10256a;
                            } else {
                                f(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    fVar = this.f10258c;
                } while (fVar != fVar2);
            }
            return d(this.f10256a);
        }
        throw new InterruptedException();
    }
}
