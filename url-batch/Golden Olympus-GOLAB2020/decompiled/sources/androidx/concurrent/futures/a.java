package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
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
public abstract class a implements ListenableFuture {
    static final b ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile e listeners;
    volatile Object value;
    volatile i waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(a.class.getName());

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f11060c;

        /* renamed from: d, reason: collision with root package name */
        static final c f11061d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f11062a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f11063b;

        static {
            if (a.GENERATE_CANCELLATION_CAUSES) {
                f11061d = null;
                f11060c = null;
            } else {
                f11061d = new c(false, null);
                f11060c = new c(true, null);
            }
        }

        c(boolean z4, Throwable th) {
            this.f11062a = z4;
            this.f11063b = th;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f11064b = new d(new C0084a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f11065a;

        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0084a extends Throwable {
            C0084a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f11065a = (Throwable) a.checkNotNull(th);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f11066d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f11067a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f11068b;

        /* renamed from: c, reason: collision with root package name */
        e f11069c;

        e(Runnable runnable, Executor executor) {
            this.f11067a = runnable;
            this.f11068b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11070a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11071b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11072c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11073d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11074e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f11070a = atomicReferenceFieldUpdater;
            this.f11071b = atomicReferenceFieldUpdater2;
            this.f11072c = atomicReferenceFieldUpdater3;
            this.f11073d = atomicReferenceFieldUpdater4;
            this.f11074e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f11073d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f11074e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f11072c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f11071b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f11070a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final a f11075b;

        /* renamed from: c, reason: collision with root package name */
        final ListenableFuture f11076c;

        g(a aVar, ListenableFuture listenableFuture) {
            this.f11075b = aVar;
            this.f11076c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11075b.value != this) {
                return;
            }
            if (a.ATOMIC_HELPER.b(this.f11075b, this, a.getFutureValue(this.f11076c))) {
                a.complete(this.f11075b);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.listeners != eVar) {
                        return false;
                    }
                    aVar.listeners = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.value != obj) {
                        return false;
                    }
                    aVar.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.waiters != iVar) {
                        return false;
                    }
                    aVar.waiters = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f11079b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f11078a = thread;
        }
    }

    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f11077c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f11078a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f11079b;

        i(boolean z4) {
        }

        void a(i iVar) {
            a.ATOMIC_HELPER.d(this, iVar);
        }

        void b() {
            Thread thread = this.f11078a;
            if (thread != null) {
                this.f11078a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.ATOMIC_HELPER.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        ATOMIC_HELPER = hVar;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(uninterruptibly));
            sb.append(b9.i.f15552e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append(b9.i.f15552e);
        }
    }

    private static CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e c(e eVar) {
        e eVar2;
        do {
            eVar2 = this.listeners;
        } while (!ATOMIC_HELPER.a(this, eVar2, e.f11066d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f11069c;
            eVar4.f11069c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static <T> T checkNotNull(T t4) {
        t4.getClass();
        return t4;
    }

    static void complete(a aVar) {
        e eVar = null;
        while (true) {
            aVar.f();
            aVar.afterDone();
            e c4 = aVar.c(eVar);
            while (c4 != null) {
                eVar = c4.f11069c;
                Runnable runnable = c4.f11067a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f11075b;
                    if (aVar.value == gVar) {
                        if (ATOMIC_HELPER.b(aVar, gVar, getFutureValue(gVar.f11076c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    d(runnable, c4.f11068b);
                }
                c4 = eVar;
            }
            return;
        }
    }

    private static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    private Object e(Object obj) {
        if (obj instanceof c) {
            throw b("Task was cancelled.", ((c) obj).f11063b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f11065a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    private void f() {
        i iVar;
        do {
            iVar = this.waiters;
        } while (!ATOMIC_HELPER.c(this, iVar, i.f11077c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f11079b;
        }
    }

    private void g(i iVar) {
        iVar.f11078a = null;
        while (true) {
            i iVar2 = this.waiters;
            if (iVar2 == i.f11077c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f11079b;
                if (iVar2.f11078a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f11079b = iVar4;
                    if (iVar3.f11078a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof a) {
            Object obj = ((a) listenableFuture).value;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f11062a ? cVar.f11063b != null ? new c(false, cVar.f11063b) : c.f11061d : obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return c.f11061d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e4) {
            if (isCancelled) {
                return new c(false, e4);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e4));
        } catch (ExecutionException e5) {
            return new d(e5.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static <V> V getUninterruptibly(Future<V> future) {
        V v4;
        boolean z4 = false;
        while (true) {
            try {
                v4 = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return v4;
    }

    private String h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        e eVar = this.listeners;
        if (eVar != e.f11066d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f11069c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != e.f11066d);
        }
        d(runnable, executor);
    }

    protected void afterDone() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z4) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = GENERATE_CANCELLATION_CAUSES ? new c(z4, new CancellationException("Future.cancel() was called.")) : z4 ? c.f11060c : c.f11061d;
        a aVar = this;
        boolean z5 = false;
        while (true) {
            if (ATOMIC_HELPER.b(aVar, obj, cVar)) {
                if (z4) {
                    aVar.interruptTask();
                }
                complete(aVar);
                if (!(obj instanceof g)) {
                    break;
                }
                ListenableFuture listenableFuture = ((g) obj).f11076c;
                if (!(listenableFuture instanceof a)) {
                    listenableFuture.cancel(z4);
                    break;
                }
                aVar = (a) listenableFuture;
                obj = aVar.value;
                if (!(obj == null) && !(obj instanceof g)) {
                    break;
                }
                z5 = true;
            } else {
                obj = aVar.value;
                if (!(obj instanceof g)) {
                    return z5;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof g))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            i iVar = this.waiters;
            if (iVar != i.f11077c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (ATOMIC_HELPER.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        g(iVar2);
                    } else {
                        iVar = this.waiters;
                    }
                } while (iVar != i.f11077c);
            }
            return e(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + SPIN_THRESHOLD_NANOS < 0) {
            String str2 = str + " (plus ";
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z4 = convert == 0 || nanos2 > SPIN_THRESHOLD_NANOS;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z4) {
                    str3 = str3 + StringUtils.COMMA;
                }
                str2 = str3 + " ";
            }
            if (z4) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    protected void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.value != null);
    }

    final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String pendingToString() {
        Object obj = this.value;
        if (obj instanceof g) {
            return "setFuture=[" + h(((g) obj).f11076c) + b9.i.f15552e;
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    protected boolean setFuture(ListenableFuture<Object> listenableFuture) {
        d dVar;
        checkNotNull(listenableFuture);
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!ATOMIC_HELPER.b(this, null, getFutureValue(listenableFuture))) {
                    return false;
                }
                complete(this);
                return true;
            }
            g gVar = new g(this, listenableFuture);
            if (ATOMIC_HELPER.b(this, null, gVar)) {
                try {
                    listenableFuture.addListener(gVar, androidx.concurrent.futures.d.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f11064b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).f11062a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append(b9.i.f15552e);
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(b9.i.f15552e);
        return sb.toString();
    }

    protected final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).f11062a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return e(obj2);
            }
            i iVar = this.waiters;
            if (iVar != i.f11077c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (ATOMIC_HELPER.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                g(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return e(obj);
                    }
                    iVar = this.waiters;
                } while (iVar != i.f11077c);
            }
            return e(this.value);
        }
        throw new InterruptedException();
    }
}
