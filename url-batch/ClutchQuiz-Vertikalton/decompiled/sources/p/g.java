package p;

import X.V;
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
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f3382e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final h0.g f3383f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f3384g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f3385a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0309c f3386b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f3387c;

    static {
        h0.g eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C0309c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f3383f = eVar;
        if (th != null) {
            f3382e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3384g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        C0309c c0309c;
        do {
            fVar = gVar.f3387c;
        } while (!f3383f.c(gVar, fVar, f.f3379c));
        while (fVar != null) {
            Thread thread = fVar.f3380a;
            if (thread != null) {
                fVar.f3380a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f3381b;
        }
        do {
            c0309c = gVar.f3386b;
        } while (!f3383f.a(gVar, c0309c));
        C0309c c0309c2 = null;
        while (c0309c != null) {
            C0309c c0309c3 = c0309c.f3375a;
            c0309c.f3375a = c0309c2;
            c0309c2 = c0309c;
            c0309c = c0309c3;
        }
        while (c0309c2 != null) {
            c0309c2 = c0309c2.f3375a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f3382e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0307a) {
            CancellationException cancellationException = ((C0307a) obj).f3373a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0308b) {
            ((AbstractC0308b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3384g) {
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
        Object obj = this.f3385a;
        if (obj != null) {
            return false;
        }
        if (!f3383f.b(this, obj, d ? new C0307a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0307a.f3371b : C0307a.f3372c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f3380a = null;
        while (true) {
            f fVar2 = this.f3387c;
            if (fVar2 == f.f3379c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f3381b;
                if (fVar2.f3380a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f3381b = fVar4;
                    if (fVar3.f3380a == null) {
                        break;
                    }
                } else if (!f3383f.c(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3385a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f3387c;
            f fVar2 = f.f3379c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    h0.g gVar = f3383f;
                    gVar.i(fVar3, fVar);
                    if (gVar.c(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3385a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f3387c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f3385a);
        }
        while (nanos > 0) {
            Object obj3 = this.f3385a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar2 = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String e2 = V.e(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = e2 + convert + " " + lowerCase;
                if (z2) {
                    str2 = V.e(str2, ",");
                }
                e2 = V.e(str2, " ");
            }
            if (z2) {
                e2 = e2 + nanos2 + " nanoseconds ";
            }
            str = V.e(e2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(V.e(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar2);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3385a instanceof C0307a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3385a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3385a instanceof C0307a) {
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f3385a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f3387c;
            f fVar2 = f.f3379c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    h0.g gVar = f3383f;
                    gVar.i(fVar3, fVar);
                    if (gVar.c(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3385a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f3387c;
                } while (fVar != fVar2);
            }
            return c(this.f3385a);
        }
        throw new InterruptedException();
    }
}
