package w0;

import N.p;
import W4.o;
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
import l1.InterfaceFutureC0490a;

/* loaded from: classes.dex */
public abstract class h implements InterfaceFutureC0490a {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f6169i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f6170j = Logger.getLogger(h.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static final i6.g f6171k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f6172l;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f6173f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C0711c f6174g;

    /* renamed from: h, reason: collision with root package name */
    public volatile g f6175h;

    static {
        i6.g fVar;
        try {
            fVar = new C0712d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, N2.a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "h"), AtomicReferenceFieldUpdater.newUpdater(h.class, C0711c.class, "g"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f6171k = fVar;
        if (th != null) {
            f6170j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f6172l = new Object();
    }

    public static void c(h hVar) {
        C0711c c0711c;
        C0711c c0711c2;
        C0711c c0711c3 = null;
        while (true) {
            g gVar = hVar.f6175h;
            if (f6171k.f(hVar, gVar, g.f6166c)) {
                while (gVar != null) {
                    Thread thread = gVar.f6167a;
                    if (thread != null) {
                        gVar.f6167a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f6168b;
                }
                do {
                    c0711c = hVar.f6174g;
                } while (!f6171k.d(hVar, c0711c, C0711c.f6155d));
                while (true) {
                    c0711c2 = c0711c3;
                    c0711c3 = c0711c;
                    if (c0711c3 == null) {
                        break;
                    }
                    c0711c = c0711c3.f6158c;
                    c0711c3.f6158c = c0711c2;
                }
                while (c0711c2 != null) {
                    c0711c3 = c0711c2.f6158c;
                    Runnable runnable = c0711c2.f6156a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f6164f;
                        if (hVar.f6173f == eVar) {
                            if (f6171k.e(hVar, eVar, f(eVar.f6165g))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, c0711c2.f6157b);
                    }
                    c0711c2 = c0711c3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f6170j.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof C0709a) {
            Throwable th = ((C0709a) obj).f6152b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0710b) {
            throw new ExecutionException(((C0710b) obj).f6154a);
        }
        if (obj == f6172l) {
            return null;
        }
        return obj;
    }

    public static Object f(InterfaceFutureC0490a interfaceFutureC0490a) {
        Object obj;
        if (interfaceFutureC0490a instanceof h) {
            Object obj2 = ((h) interfaceFutureC0490a).f6173f;
            if (!(obj2 instanceof C0709a)) {
                return obj2;
            }
            C0709a c0709a = (C0709a) obj2;
            return c0709a.f6151a ? c0709a.f6152b != null ? new C0709a(c0709a.f6152b, false) : C0709a.f6150d : obj2;
        }
        boolean isCancelled = interfaceFutureC0490a.isCancelled();
        boolean z5 = true;
        if ((!f6169i) && isCancelled) {
            return C0709a.f6150d;
        }
        boolean z6 = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC0490a.get();
                    break;
                } catch (InterruptedException unused) {
                    z6 = z5;
                } catch (Throwable th) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e4) {
                if (isCancelled) {
                    return new C0709a(e4, false);
                }
                return new C0710b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC0490a, e4));
            } catch (ExecutionException e7) {
                return new C0710b(e7.getCause());
            } catch (Throwable th2) {
                return new C0710b(th2);
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f6172l : obj;
    }

    @Override // l1.InterfaceFutureC0490a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C0711c c0711c = this.f6174g;
        C0711c c0711c2 = C0711c.f6155d;
        if (c0711c != c0711c2) {
            C0711c c0711c3 = new C0711c(runnable, executor);
            do {
                c0711c3.f6158c = c0711c;
                if (f6171k.d(this, c0711c, c0711c3)) {
                    return;
                } else {
                    c0711c = this.f6174g;
                }
            } while (c0711c != c0711c2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z5 = true;
                } catch (Throwable th) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e4) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e4.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e7) {
                sb.append("FAILURE, cause=[");
                sb.append(e7.getCause());
                sb.append("]");
                return;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f6173f;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        C0709a c0709a = f6169i ? new C0709a(new CancellationException("Future.cancel() was called."), z5) : z5 ? C0709a.f6149c : C0709a.f6150d;
        h hVar = this;
        boolean z6 = false;
        while (true) {
            if (f6171k.e(hVar, obj, c0709a)) {
                c(hVar);
                if (!(obj instanceof e)) {
                    break;
                }
                InterfaceFutureC0490a interfaceFutureC0490a = ((e) obj).f6165g;
                if (!(interfaceFutureC0490a instanceof h)) {
                    interfaceFutureC0490a.cancel(z5);
                    break;
                }
                hVar = (h) interfaceFutureC0490a;
                obj = hVar.f6173f;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z6 = true;
            } else {
                obj = hVar.f6173f;
                if (!(obj instanceof e)) {
                    return z6;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f6173f;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC0490a interfaceFutureC0490a = ((e) obj).f6165g;
            return p.b(sb, interfaceFutureC0490a == this ? "this future" : String.valueOf(interfaceFutureC0490a), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        boolean z5;
        g gVar = g.f6166c;
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6173f;
        if ((obj != null) && (!(obj instanceof e))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f6175h;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                z5 = true;
                do {
                    i6.g gVar4 = f6171k;
                    gVar4.t(gVar3, gVar2);
                    if (gVar4.f(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6173f;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(gVar3);
                    } else {
                        gVar2 = this.f6175h;
                    }
                } while (gVar2 != gVar);
            }
            return e(this.f6173f);
        }
        z5 = true;
        while (nanos > 0) {
            Object obj3 = this.f6173f;
            if ((obj3 != null ? z5 : false) && (!(obj3 instanceof e))) {
                return e(obj3);
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
            String d7 = o.d(str, " (plus ");
            long j7 = -nanos;
            long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(convert);
            boolean z6 = (convert == 0 || nanos2 > 1000) ? z5 : false;
            if (convert > 0) {
                String str2 = d7 + convert + " " + lowerCase;
                if (z6) {
                    str2 = o.d(str2, ",");
                }
                d7 = o.d(str2, " ");
            }
            if (z6) {
                d7 = d7 + nanos2 + " nanoseconds ";
            }
            str = o.d(d7, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(o.d(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + hVar);
    }

    public final void h(g gVar) {
        gVar.f6167a = null;
        while (true) {
            g gVar2 = this.f6175h;
            if (gVar2 == g.f6166c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f6168b;
                if (gVar2.f6167a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f6168b = gVar4;
                    if (gVar3.f6167a == null) {
                        break;
                    }
                } else if (!f6171k.f(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6173f instanceof C0709a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f6173f != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f6173f instanceof C0709a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = g();
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
        g gVar = g.f6166c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6173f;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar2 = this.f6175h;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    i6.g gVar4 = f6171k;
                    gVar4.t(gVar3, gVar2);
                    if (gVar4.f(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6173f;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar2 = this.f6175h;
                } while (gVar2 != gVar);
            }
            return e(this.f6173f);
        }
        throw new InterruptedException();
    }
}
