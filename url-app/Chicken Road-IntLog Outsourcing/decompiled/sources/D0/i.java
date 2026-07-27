package D0;

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
public abstract class i implements J1.a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f424d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f425e = Logger.getLogger(i.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final K1.b f426f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f427g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f428a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f429b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f430c;

    static {
        K1.b gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f426f = gVar;
        if (th != null) {
            f425e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f427g = new Object();
    }

    public static void d(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f430c;
            if (f426f.I(iVar, hVar, h.f421c)) {
                while (hVar != null) {
                    Thread thread = hVar.f422a;
                    if (thread != null) {
                        hVar.f422a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f423b;
                }
                do {
                    dVar = iVar.f429b;
                } while (!f426f.E(iVar, dVar, d.f410d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f413c;
                    dVar3.f413c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f413c;
                    Runnable runnable = dVar2.f411a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f419a;
                        if (iVar.f428a == fVar) {
                            if (f426f.G(iVar, fVar, g(fVar.f420b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        e(runnable, dVar2.f412b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f425e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f406b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f409a);
        }
        if (obj == f427g) {
            return null;
        }
        return obj;
    }

    public static Object g(J1.a aVar) {
        if (aVar instanceof i) {
            Object obj = ((i) aVar).f428a;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar2 = (a) obj;
            return aVar2.f405a ? aVar2.f406b != null ? new a(false, aVar2.f406b) : a.f404d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f424d) && isCancelled) {
            return a.f404d;
        }
        try {
            Object h3 = h(aVar);
            return h3 == null ? f427g : h3;
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new a(false, e3);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e3));
        } catch (ExecutionException e6) {
            return new c(e6.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object h(J1.a aVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = aVar.get();
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
        d dVar = this.f429b;
        d dVar2 = d.f410d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f413c = dVar;
                if (f426f.E(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f429b;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
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
        Object obj = this.f428a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        a aVar = f424d ? new a(z, new CancellationException("Future.cancel() was called.")) : z ? a.f403c : a.f404d;
        i iVar = this;
        boolean z5 = false;
        while (true) {
            if (f426f.G(iVar, obj, aVar)) {
                d(iVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                J1.a aVar2 = ((f) obj).f420b;
                if (!(aVar2 instanceof i)) {
                    aVar2.cancel(z);
                    return true;
                }
                iVar = (i) aVar2;
                obj = iVar.f428a;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z5 = true;
            } else {
                obj = iVar.f428a;
                if (!(obj instanceof f)) {
                    return z5;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:33:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j2, TimeUnit timeUnit) {
        long j6;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f428a;
        if ((obj != null) && (!(obj instanceof f))) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f430c;
            h hVar2 = h.f421c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    K1.b bVar = f426f;
                    bVar.b0(hVar3, hVar);
                    if (bVar.I(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f428a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(hVar3);
                        j6 = 0;
                        if (nanos <= j6) {
                            String iVar = toString();
                            String obj3 = timeUnit.toString();
                            Locale locale = Locale.ROOT;
                            String lowerCase = obj3.toLowerCase(locale);
                            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
                            if (nanos + 1000 < 0) {
                                String e3 = AbstractC0279e.e(str, " (plus ");
                                long j7 = -nanos;
                                long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
                                long nanos2 = j7 - timeUnit.toNanos(convert);
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
                            throw new TimeoutException(str + " for " + iVar);
                        }
                        Object obj4 = this.f428a;
                        if ((obj4 != null) && (!(obj4 instanceof f))) {
                            return f(obj4);
                        }
                        if (Thread.interrupted()) {
                            throw new InterruptedException();
                        }
                        nanos = nanoTime - System.nanoTime();
                        j6 = 0;
                        if (nanos <= j6) {
                        }
                    } else {
                        hVar = this.f430c;
                    }
                } while (hVar != hVar2);
            }
            return f(this.f428a);
        }
        j6 = 0;
        if (nanos <= j6) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String i() {
        Object obj = this.f428a;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            J1.a aVar = ((f) obj).f420b;
            return AbstractC0279e.h(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f428a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f428a != null);
    }

    public final void j(h hVar) {
        hVar.f422a = null;
        while (true) {
            h hVar2 = this.f430c;
            if (hVar2 == h.f421c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f423b;
                if (hVar2.f422a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f423b = hVar4;
                    if (hVar3.f422a == null) {
                        break;
                    }
                } else if (!f426f.I(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f428a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            try {
                str = i();
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

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f428a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return f(obj2);
            }
            h hVar = this.f430c;
            h hVar2 = h.f421c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    K1.b bVar = f426f;
                    bVar.b0(hVar3, hVar);
                    if (bVar.I(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f428a;
                            } else {
                                j(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return f(obj);
                    }
                    hVar = this.f430c;
                } while (hVar != hVar2);
            }
            return f(this.f428a);
        }
        throw new InterruptedException();
    }
}
