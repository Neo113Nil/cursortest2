package f8;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class r implements ListenableFuture {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f4170r;

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f4171s;

    /* renamed from: t, reason: collision with root package name */
    public static final i7.a f4172t;

    /* renamed from: u, reason: collision with root package name */
    public static final Object f4173u;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f4174d;

    /* renamed from: e, reason: collision with root package name */
    public volatile f f4175e;

    /* renamed from: i, reason: collision with root package name */
    public volatile q f4176i;

    static {
        boolean z10;
        Throwable th;
        i7.a iVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f4170r = z10;
        f4171s = Logger.getLogger(r.class.getName());
        int i3 = 10;
        Throwable th2 = null;
        try {
            iVar = new p(i3);
            th = null;
        } catch (Throwable th3) {
            th = th3;
            try {
                iVar = new g(AtomicReferenceFieldUpdater.newUpdater(q.class, Thread.class, yb.a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(q.class, q.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r.class, q.class, "i"), AtomicReferenceFieldUpdater.newUpdater(r.class, f.class, "e"), AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "d"));
            } catch (Throwable th4) {
                th2 = th4;
                iVar = new i(i3);
            }
        }
        f4172t = iVar;
        if (th2 != null) {
            Logger logger = f4171s;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        f4173u = new Object();
    }

    public static void e(r rVar) {
        f fVar = null;
        while (true) {
            for (q M = f4172t.M(rVar); M != null; M = M.f4167b) {
                Thread thread = M.f4166a;
                if (thread != null) {
                    M.f4166a = null;
                    LockSupport.unpark(thread);
                }
            }
            rVar.c();
            f fVar2 = fVar;
            f L = f4172t.L(rVar);
            f fVar3 = fVar2;
            while (L != null) {
                f fVar4 = L.f4139c;
                L.f4139c = fVar3;
                fVar3 = L;
                L = fVar4;
            }
            while (fVar3 != null) {
                fVar = fVar3.f4139c;
                Runnable runnable = fVar3.f4137a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof h) {
                    h hVar = (h) runnable;
                    rVar = hVar.f4148d;
                    if (rVar.f4174d == hVar) {
                        if (f4172t.r(rVar, hVar, h(hVar.f4149e))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = fVar3.f4138b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                fVar3 = fVar;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            f4171s.log(level, sb2.toString(), (Throwable) e2);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof d) {
            Throwable th = ((d) obj).f4127b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof e) {
            throw new ExecutionException(((e) obj).f4131a);
        }
        if (obj == f4173u) {
            return null;
        }
        return obj;
    }

    public static Object h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable o6;
        if (listenableFuture instanceof j) {
            Object obj2 = ((r) listenableFuture).f4174d;
            if (obj2 instanceof d) {
                d dVar = (d) obj2;
                if (dVar.f4126a) {
                    obj2 = dVar.f4127b != null ? new d(dVar.f4127b, false) : d.f4125d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((listenableFuture instanceof r) && (o6 = ((r) listenableFuture).o()) != null) {
            return new e(o6);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        boolean z10 = true;
        if ((!f4170r) && isCancelled) {
            d dVar2 = d.f4125d;
            Objects.requireNonNull(dVar2);
            return dVar2;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new d(e2, false);
                }
                String valueOf = String.valueOf(listenableFuture);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 77);
                sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb2.append(valueOf);
                return new e(new IllegalArgumentException(sb2.toString(), e2));
            } catch (ExecutionException e9) {
                if (!isCancelled) {
                    return new e(e9.getCause());
                }
                String valueOf2 = String.valueOf(listenableFuture);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 84);
                sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb3.append(valueOf2);
                return new d(new IllegalArgumentException(sb3.toString(), e9), false);
            } catch (Throwable th2) {
                return new e(th2);
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? f4173u : obj;
        }
        String valueOf3 = String.valueOf(listenableFuture);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 84);
        sb4.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb4.append(valueOf3);
        return new d(new IllegalArgumentException(sb4.toString()), false);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void a(Runnable runnable, Executor executor) {
        f fVar;
        f fVar2 = f.f4136d;
        i7.a.y(executor, "Executor was null.");
        if (!isDone() && (fVar = this.f4175e) != fVar2) {
            f fVar3 = new f(runnable, executor);
            do {
                fVar3.f4139c = fVar;
                if (f4172t.q(this, fVar, fVar3)) {
                    return;
                } else {
                    fVar = this.f4175e;
                }
            } while (fVar != fVar2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e2.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e9) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e9.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        d(sb2, obj);
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        d dVar;
        Object obj = this.f4174d;
        if (!(obj == null) && !(obj instanceof h)) {
            return false;
        }
        if (f4170r) {
            dVar = new d(new CancellationException("Future.cancel() was called."), z10);
        } else {
            dVar = z10 ? d.f4124c : d.f4125d;
            Objects.requireNonNull(dVar);
        }
        r rVar = this;
        boolean z11 = false;
        while (true) {
            if (f4172t.r(rVar, obj, dVar)) {
                if (z10) {
                    rVar.i();
                }
                e(rVar);
                if (!(obj instanceof h)) {
                    break;
                }
                ListenableFuture listenableFuture = ((h) obj).f4149e;
                if (!(listenableFuture instanceof j)) {
                    listenableFuture.cancel(z10);
                    break;
                }
                rVar = (r) listenableFuture;
                obj = rVar.f4174d;
                if (!(obj == null) && !(obj instanceof h)) {
                    break;
                }
                z11 = true;
            } else {
                obj = rVar.f4174d;
                if (!(obj instanceof h)) {
                    return z11;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        boolean z10;
        long j3;
        q qVar = q.f4165c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4174d;
        if ((obj != null) && (!(obj instanceof h))) {
            return g(obj);
        }
        long j10 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            q qVar2 = this.f4176i;
            if (qVar2 != qVar) {
                q qVar3 = new q();
                z10 = true;
                while (true) {
                    i7.a aVar = f4172t;
                    aVar.Y(qVar3, qVar2);
                    if (aVar.s(this, qVar2, qVar3)) {
                        j3 = j10;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(qVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4174d;
                            if ((obj2 != null) && (!(obj2 instanceof h))) {
                                return g(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(qVar3);
                    } else {
                        long j11 = j10;
                        qVar2 = this.f4176i;
                        if (qVar2 == qVar) {
                            break;
                        }
                        j10 = j11;
                    }
                }
            }
            Object obj3 = this.f4174d;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        z10 = true;
        j3 = 0;
        while (nanos > j3) {
            Object obj4 = this.f4174d;
            if ((obj4 != null ? z10 : false) && (!(obj4 instanceof h))) {
                return g(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String rVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb2.append("Waited ");
        sb2.append(j);
        sb2.append(" ");
        sb2.append(lowerCase2);
        String sb3 = sb2.toString();
        if (nanos + 1000 < j3) {
            String concat = sb3.concat(" (plus ");
            long j12 = -nanos;
            long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(convert);
            boolean z11 = (convert == j3 || nanos2 > 1000) ? z10 : false;
            if (convert > j3) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase).length() + concat.length() + 21);
                sb4.append(concat);
                sb4.append(convert);
                sb4.append(" ");
                sb4.append(lowerCase);
                String sb5 = sb4.toString();
                if (z11) {
                    sb5 = sb5.concat(",");
                }
                concat = sb5.concat(" ");
            }
            if (z11) {
                StringBuilder sb6 = new StringBuilder(concat.length() + 33);
                sb6.append(concat);
                sb6.append(nanos2);
                sb6.append(" nanoseconds ");
                concat = sb6.toString();
            }
            sb3 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb7 = new StringBuilder(String.valueOf(rVar).length() + sb3.length() + 5);
        sb7.append(sb3);
        sb7.append(" for ");
        sb7.append(rVar);
        throw new TimeoutException(sb7.toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f4174d instanceof d;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof h)) & (this.f4174d != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public final void k(q qVar) {
        qVar.f4166a = null;
        while (true) {
            q qVar2 = this.f4176i;
            if (qVar2 == q.f4165c) {
                return;
            }
            q qVar3 = null;
            while (qVar2 != null) {
                q qVar4 = qVar2.f4167b;
                if (qVar2.f4166a != null) {
                    qVar3 = qVar2;
                } else if (qVar3 != null) {
                    qVar3.f4167b = qVar4;
                    if (qVar3.f4166a == null) {
                        break;
                    }
                } else if (!f4172t.s(this, qVar2, qVar4)) {
                    break;
                }
                qVar2 = qVar4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = f4173u;
        }
        if (!f4172t.r(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!f4172t.r(this, null, new e(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean n(ListenableFuture listenableFuture) {
        e eVar;
        listenableFuture.getClass();
        Object obj = this.f4174d;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (f4172t.r(this, null, h(listenableFuture))) {
                    e(this);
                    return true;
                }
                return false;
            }
            h hVar = new h(this, listenableFuture);
            if (f4172t.r(this, null, hVar)) {
                try {
                    listenableFuture.a(hVar, d0.f4128d);
                    return true;
                } catch (Throwable th) {
                    try {
                        eVar = new e(th);
                    } catch (Throwable unused) {
                        eVar = e.f4130b;
                    }
                    f4172t.r(this, hVar, eVar);
                    return true;
                }
            }
            obj = this.f4174d;
        }
        if (obj instanceof d) {
            listenableFuture.cancel(((d) obj).f4126a);
        }
        return false;
    }

    public final Throwable o() {
        if (!(this instanceof j)) {
            return null;
        }
        Object obj = this.f4174d;
        if (obj instanceof e) {
            return ((e) obj).f4131a;
        }
        return null;
    }

    public final boolean p() {
        Object obj = this.f4174d;
        return (obj instanceof d) && ((d) obj).f4126a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb3.append(getClass().getSimpleName());
        } else {
            sb3.append(getClass().getName());
        }
        sb3.append('@');
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("[status=");
        if (isCancelled()) {
            sb3.append("CANCELLED");
        } else if (isDone()) {
            b(sb3);
        } else {
            int length = sb3.length();
            sb3.append("PENDING");
            Object obj = this.f4174d;
            if (obj instanceof h) {
                sb3.append(", setFuture=[");
                ListenableFuture listenableFuture = ((h) obj).f4149e;
                try {
                    if (listenableFuture == this) {
                        sb3.append("this future");
                    } else {
                        sb3.append(listenableFuture);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    sb3.append("Exception thrown from implementation: ");
                    sb3.append(e.getClass());
                    sb3.append("]");
                    if (isDone()) {
                    }
                    sb3.append("]");
                    return sb3.toString();
                } catch (StackOverflowError e9) {
                    e = e9;
                    sb3.append("Exception thrown from implementation: ");
                    sb3.append(e.getClass());
                    sb3.append("]");
                    if (isDone()) {
                    }
                    sb3.append("]");
                    return sb3.toString();
                }
                sb3.append("]");
            } else {
                try {
                    sb2 = j();
                    if (a8.h.a(sb2)) {
                        sb2 = null;
                    }
                } catch (RuntimeException | StackOverflowError e10) {
                    String valueOf = String.valueOf(e10.getClass());
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 38);
                    sb4.append("Exception thrown from implementation: ");
                    sb4.append(valueOf);
                    sb2 = sb4.toString();
                }
                if (sb2 != null) {
                    sb3.append(", info=[");
                    sb3.append(sb2);
                    sb3.append("]");
                }
            }
            if (isDone()) {
                sb3.delete(length, sb3.length());
                b(sb3);
            }
        }
        sb3.append("]");
        return sb3.toString();
    }

    public void c() {
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        q qVar = q.f4165c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4174d;
            if ((obj2 != null) & (!(obj2 instanceof h))) {
                return g(obj2);
            }
            q qVar2 = this.f4176i;
            if (qVar2 != qVar) {
                q qVar3 = new q();
                do {
                    i7.a aVar = f4172t;
                    aVar.Y(qVar3, qVar2);
                    if (aVar.s(this, qVar2, qVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4174d;
                            } else {
                                k(qVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof h))));
                        return g(obj);
                    }
                    qVar2 = this.f4176i;
                } while (qVar2 != qVar);
            }
            Object obj3 = this.f4174d;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
