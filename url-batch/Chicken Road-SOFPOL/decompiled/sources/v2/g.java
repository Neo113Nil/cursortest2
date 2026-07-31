package v2;

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
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f7472g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f7473h = Logger.getLogger(g.class.getName());
    public static final o i;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f7474j;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f7475d;

    /* renamed from: e, reason: collision with root package name */
    public volatile c f7476e;

    /* renamed from: f, reason: collision with root package name */
    public volatile f f7477f;

    static {
        o eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "f"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        i = eVar;
        if (th != null) {
            f7473h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7474j = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f7477f;
        } while (!i.o(gVar, fVar, f.f7469c));
        while (fVar != null) {
            Thread thread = fVar.f7470a;
            if (thread != null) {
                fVar.f7470a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f7471b;
        }
        do {
            cVar = gVar.f7476e;
        } while (!i.m(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f7463a;
            cVar.f7463a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f7463a;
            try {
                throw null;
            } catch (RuntimeException e8) {
                f7473h.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e8);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f7461a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f7474j) {
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
            Object d8 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d8 == this ? "this future" : String.valueOf(d8));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f7475d;
        if (obj != null) {
            return false;
        }
        if (!i.n(this, obj, f7472g ? new a(new CancellationException("Future.cancel() was called."), z3) : z3 ? a.f7459b : a.f7460c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f7470a = null;
        while (true) {
            f fVar2 = this.f7477f;
            if (fVar2 == f.f7469c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f7471b;
                if (fVar2.f7470a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f7471b = fVar4;
                    if (fVar3.f7470a == null) {
                        break;
                    }
                } else if (!i.o(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        f fVar = f.f7469c;
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7475d;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f7477f;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    o oVar = i;
                    oVar.e0(fVar3, fVar2);
                    if (oVar.o(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7475d;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar2 = this.f7477f;
                    }
                } while (fVar2 != fVar);
            }
            return c(this.f7475d);
        }
        while (nanos > 0) {
            Object obj3 = this.f7475d;
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
        String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j8 = -nanos;
            long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z3) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z3) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7475d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7475d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7475d instanceof a) {
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
            } catch (RuntimeException e8) {
                str = "Exception thrown from implementation: " + e8.getClass();
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
        f fVar = f.f7469c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7475d;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar2 = this.f7477f;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    o oVar = i;
                    oVar.e0(fVar3, fVar2);
                    if (oVar.o(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7475d;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar2 = this.f7477f;
                } while (fVar2 != fVar);
            }
            return c(this.f7475d);
        }
        throw new InterruptedException();
    }
}
