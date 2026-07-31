package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a<V> implements p4.a<V> {

    /* renamed from: i, reason: collision with root package name */
    static final boolean f1555i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j, reason: collision with root package name */
    private static final Logger f1556j = Logger.getLogger(a.class.getName());

    /* renamed from: k, reason: collision with root package name */
    static final b f1557k;

    /* renamed from: l, reason: collision with root package name */
    private static final Object f1558l;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f1559f;

    /* renamed from: g, reason: collision with root package name */
    volatile e f1560g;

    /* renamed from: h, reason: collision with root package name */
    volatile i f1561h;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f1562c;

        /* renamed from: d, reason: collision with root package name */
        static final c f1563d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f1564a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f1565b;

        static {
            if (a.f1555i) {
                f1563d = null;
                f1562c = null;
            } else {
                f1563d = new c(false, null);
                f1562c = new c(true, null);
            }
        }

        c(boolean z6, Throwable th) {
            this.f1564a = z6;
            this.f1565b = th;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f1566b = new d(new C0033a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f1567a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0033a extends Throwable {
            C0033a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1567a = (Throwable) a.f(th);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f1568d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f1569a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f1570b;

        /* renamed from: c, reason: collision with root package name */
        e f1571c;

        e(Runnable runnable, Executor executor) {
            this.f1569a = runnable;
            this.f1570b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f1572a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f1573b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f1574c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1575d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1576e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1572a = atomicReferenceFieldUpdater;
            this.f1573b = atomicReferenceFieldUpdater2;
            this.f1574c = atomicReferenceFieldUpdater3;
            this.f1575d = atomicReferenceFieldUpdater4;
            this.f1576e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.work.impl.utils.futures.b.a(this.f1575d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.work.impl.utils.futures.b.a(this.f1576e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.work.impl.utils.futures.b.a(this.f1574c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f1573b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f1572a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final a<V> f1577f;

        /* renamed from: g, reason: collision with root package name */
        final p4.a<? extends V> f1578g;

        g(a<V> aVar, p4.a<? extends V> aVar2) {
            this.f1577f = aVar;
            this.f1578g = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1577f.f1559f != this) {
                return;
            }
            if (a.f1557k.b(this.f1577f, this, a.k(this.f1578g))) {
                a.h(this.f1577f);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1560g != eVar) {
                    return false;
                }
                aVar.f1560g = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1559f != obj) {
                    return false;
                }
                aVar.f1559f = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1561h != iVar) {
                    return false;
                }
                aVar.f1561h = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f1581b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f1580a = thread;
        }
    }

    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f1579c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f1580a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f1581b;

        i() {
            a.f1557k.e(this, Thread.currentThread());
        }

        i(boolean z6) {
        }

        void a(i iVar) {
            a.f1557k.d(this, iVar);
        }

        void b() {
            Thread thread = this.f1580a;
            if (thread != null) {
                this.f1580a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "h"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "g"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f1557k = hVar;
        if (th != null) {
            f1556j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1558l = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object l7 = l(this);
            sb.append("SUCCESS, result=[");
            sb.append(t(l7));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append(str);
        }
    }

    private static CancellationException e(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T f(T t6) {
        Objects.requireNonNull(t6);
        return t6;
    }

    private e g(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1560g;
        } while (!f1557k.a(this, eVar2, e.f1568d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1571c;
            eVar4.f1571c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void h(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.o();
            aVar.c();
            e g7 = aVar.g(eVar);
            while (g7 != null) {
                eVar = g7.f1571c;
                Runnable runnable = g7.f1569a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f1577f;
                    if (aVar.f1559f == gVar) {
                        if (f1557k.b(aVar, gVar, k(gVar.f1578g))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i(runnable, g7.f1570b);
                }
                g7 = eVar;
            }
            return;
        }
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f1556j.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V j(Object obj) {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).f1565b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1567a);
        }
        if (obj == f1558l) {
            return null;
        }
        return obj;
    }

    static Object k(p4.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f1559f;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f1564a ? cVar.f1565b != null ? new c(false, cVar.f1565b) : c.f1563d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f1555i) && isCancelled) {
            return c.f1563d;
        }
        try {
            Object l7 = l(aVar);
            return l7 == null ? f1558l : l7;
        } catch (CancellationException e7) {
            if (isCancelled) {
                return new c(false, e7);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e7));
        } catch (ExecutionException e8) {
            return new d(e8.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V l(Future<V> future) {
        V v6;
        boolean z6 = false;
        while (true) {
            try {
                v6 = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return v6;
    }

    private void o() {
        i iVar;
        do {
            iVar = this.f1561h;
        } while (!f1557k.c(this, iVar, i.f1579c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1581b;
        }
    }

    private void p(i iVar) {
        iVar.f1580a = null;
        while (true) {
            i iVar2 = this.f1561h;
            if (iVar2 == i.f1579c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1581b;
                if (iVar2.f1580a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1581b = iVar4;
                    if (iVar3.f1580a == null) {
                        break;
                    }
                } else if (!f1557k.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.f1559f;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f1555i ? new c(z6, new CancellationException("Future.cancel() was called.")) : z6 ? c.f1562c : c.f1563d;
        boolean z7 = false;
        a<V> aVar = this;
        while (true) {
            if (f1557k.b(aVar, obj, cVar)) {
                if (z6) {
                    aVar.m();
                }
                h(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                p4.a<? extends V> aVar2 = ((g) obj).f1578g;
                if (!(aVar2 instanceof a)) {
                    aVar2.cancel(z6);
                    return true;
                }
                aVar = (a) aVar2;
                obj = aVar.f1559f;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z7 = true;
            } else {
                obj = aVar.f1559f;
                if (!(obj instanceof g)) {
                    return z7;
                }
            }
        }
    }

    @Override // p4.a
    public final void d(Runnable runnable, Executor executor) {
        f(runnable);
        f(executor);
        e eVar = this.f1560g;
        if (eVar != e.f1568d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1571c = eVar;
                if (f1557k.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f1560g;
                }
            } while (eVar != e.f1568d);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f1559f;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return j(obj2);
        }
        i iVar = this.f1561h;
        if (iVar != i.f1579c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f1557k.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            p(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f1559f;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return j(obj);
                }
                iVar = this.f1561h;
            } while (iVar != i.f1579c);
        }
        return j(this.f1559f);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1559f;
        if ((obj != null) && (!(obj instanceof g))) {
            return j(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f1561h;
            if (iVar != i.f1579c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1557k.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1559f;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return j(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(iVar2);
                    } else {
                        iVar = this.f1561h;
                    }
                } while (iVar != i.f1579c);
            }
            return j(this.f1559f);
        }
        while (nanos > 0) {
            Object obj3 = this.f1559f;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return j(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String timeUnit2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = timeUnit2.toLowerCase(locale);
        String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j8 = -nanos;
            long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(convert);
            boolean z6 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z6) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z6) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1559f instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f1559f != null);
    }

    protected void m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String n() {
        Object obj = this.f1559f;
        if (obj instanceof g) {
            return "setFuture=[" + t(((g) obj).f1578g) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean q(V v6) {
        if (v6 == null) {
            v6 = (V) f1558l;
        }
        if (!f1557k.b(this, null, v6)) {
            return false;
        }
        h(this);
        return true;
    }

    protected boolean r(Throwable th) {
        if (!f1557k.b(this, null, new d((Throwable) f(th)))) {
            return false;
        }
        h(this);
        return true;
    }

    protected boolean s(p4.a<? extends V> aVar) {
        d dVar;
        f(aVar);
        Object obj = this.f1559f;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f1557k.b(this, null, k(aVar))) {
                    return false;
                }
                h(this);
                return true;
            }
            g gVar = new g(this, aVar);
            if (f1557k.b(this, null, gVar)) {
                try {
                    aVar.d(gVar, androidx.work.impl.utils.futures.c.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f1566b;
                    }
                    f1557k.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f1559f;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f1564a);
        }
        return false;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = n();
                } catch (RuntimeException e7) {
                    str = "Exception thrown from implementation: " + e7.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "CANCELLED" : "PENDING";
            }
            a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
