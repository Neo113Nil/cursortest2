package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.Objects;
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

/* renamed from: com.yandex.mobile.ads.impl.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractFutureC1886e<V> extends zo0 implements Future {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f25013e;

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f25014f;

    /* renamed from: g, reason: collision with root package name */
    private static final a f25015g;

    /* renamed from: h, reason: collision with root package name */
    private static final Object f25016h;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f25017b;

    /* renamed from: c, reason: collision with root package name */
    private volatile d f25018c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i f25019d;

    /* renamed from: com.yandex.mobile.ads.impl.e$a */
    private static abstract class a {
        abstract void a(i iVar, i iVar2);

        abstract void a(i iVar, Thread thread);

        abstract boolean a(AbstractFutureC1886e<?> abstractFutureC1886e, d dVar, d dVar2);

        abstract boolean a(AbstractFutureC1886e<?> abstractFutureC1886e, i iVar, i iVar2);

        abstract boolean a(AbstractFutureC1886e<?> abstractFutureC1886e, Object obj, Object obj2);

        private a() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$b */
    private static final class b {

        /* renamed from: b, reason: collision with root package name */
        static final b f25020b;

        /* renamed from: c, reason: collision with root package name */
        static final b f25021c;

        /* renamed from: a, reason: collision with root package name */
        final Throwable f25022a;

        static {
            if (AbstractFutureC1886e.f25013e) {
                f25021c = null;
                f25020b = null;
            } else {
                f25021c = new b(false, null);
                f25020b = new b(true, null);
            }
        }

        b(boolean z4, Throwable th) {
            this.f25022a = th;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final Throwable f25023a;

        /* renamed from: com.yandex.mobile.ads.impl.e$c$a */
        final class a extends Throwable {
            a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new a());
        }

        c(Throwable th) {
            this.f25023a = (Throwable) nj1.a(th);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$d */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f25024b = new d();

        /* renamed from: a, reason: collision with root package name */
        d f25025a;

        d() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$e, reason: collision with other inner class name */
    private static final class C0186e extends a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f25026a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f25027b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFutureC1886e, i> f25028c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFutureC1886e, d> f25029d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFutureC1886e, Object> f25030e;

        C0186e(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFutureC1886e, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFutureC1886e, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFutureC1886e, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f25026a = atomicReferenceFieldUpdater;
            this.f25027b = atomicReferenceFieldUpdater2;
            this.f25028c = atomicReferenceFieldUpdater3;
            this.f25029d = atomicReferenceFieldUpdater4;
            this.f25030e = atomicReferenceFieldUpdater5;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final boolean a(AbstractFutureC1886e<?> abstractFutureC1886e, d dVar, d dVar2) {
            return androidx.concurrent.futures.b.a(this.f25029d, abstractFutureC1886e, dVar, dVar2);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final boolean a(AbstractFutureC1886e<?> abstractFutureC1886e, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f25030e, abstractFutureC1886e, obj, obj2);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final boolean a(AbstractFutureC1886e<?> abstractFutureC1886e, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f25028c, abstractFutureC1886e, iVar, iVar2);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final void a(i iVar, i iVar2) {
            this.f25027b.lazySet(iVar, iVar2);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final void a(i iVar, Thread thread) {
            this.f25026a.lazySet(iVar, thread);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$f */
    private static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$g */
    private static final class g extends a {
        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final boolean a(AbstractFutureC1886e<?> abstractFutureC1886e, d dVar, d dVar2) {
            synchronized (abstractFutureC1886e) {
                try {
                    if (((AbstractFutureC1886e) abstractFutureC1886e).f25018c != dVar) {
                        return false;
                    }
                    ((AbstractFutureC1886e) abstractFutureC1886e).f25018c = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private g() {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final boolean a(AbstractFutureC1886e<?> abstractFutureC1886e, Object obj, Object obj2) {
            synchronized (abstractFutureC1886e) {
                try {
                    if (((AbstractFutureC1886e) abstractFutureC1886e).f25017b != obj) {
                        return false;
                    }
                    ((AbstractFutureC1886e) abstractFutureC1886e).f25017b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final boolean a(AbstractFutureC1886e<?> abstractFutureC1886e, i iVar, i iVar2) {
            synchronized (abstractFutureC1886e) {
                try {
                    if (((AbstractFutureC1886e) abstractFutureC1886e).f25019d != iVar) {
                        return false;
                    }
                    ((AbstractFutureC1886e) abstractFutureC1886e).f25019d = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final void a(i iVar, i iVar2) {
            iVar.f25033b = iVar2;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e.a
        final void a(i iVar, Thread thread) {
            iVar.f25032a = thread;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$h */
    static abstract class h<V> extends AbstractFutureC1886e<V> implements Future {
        h() {
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e, java.util.concurrent.Future
        public final boolean cancel(boolean z4) {
            return super.cancel(z4);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e, java.util.concurrent.Future
        public V get() {
            return (V) super.get();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e, java.util.concurrent.Future
        public final boolean isCancelled() {
            return ((AbstractFutureC1886e) this).f25017b instanceof b;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC1886e, java.util.concurrent.Future
        public final V get(long j4, TimeUnit timeUnit) {
            return (V) super.get(j4, timeUnit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z4;
        a gVar;
        try {
            z4 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z4 = false;
        }
        f25013e = z4;
        f25014f = Logger.getLogger(AbstractFutureC1886e.class.getName());
        Throwable th = null;
        Object[] objArr = 0;
        try {
            gVar = new C0186e(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1886e.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1886e.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1886e.class, Object.class, "b"));
        } catch (Throwable th2) {
            gVar = new g();
            th = th2;
        }
        f25015g = gVar;
        if (th != null) {
            f25014f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f25016h = new Object();
    }

    protected AbstractFutureC1886e() {
    }

    private void a(StringBuilder sb) {
        V v4;
        boolean z4 = false;
        while (true) {
            try {
                try {
                    v4 = get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th) {
                    if (z4) {
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
            } catch (ExecutionException e5) {
                sb.append("FAILURE, cause=[");
                sb.append(e5.getCause());
                sb.append(b9.i.f15552e);
                return;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        a(sb, v4);
        sb.append(b9.i.f15552e);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        b bVar;
        Object obj = this.f25017b;
        if ((obj == null) | (obj instanceof f)) {
            if (f25013e) {
                bVar = new b(z4, new CancellationException("Future.cancel() was called."));
            } else {
                bVar = z4 ? b.f25020b : b.f25021c;
                Objects.requireNonNull(bVar);
            }
            while (!f25015g.a((AbstractFutureC1886e<?>) this, obj, (Object) bVar)) {
                obj = this.f25017b;
                if (!(obj instanceof f)) {
                }
            }
            a((AbstractFutureC1886e<?>) this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get(long j4, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f25017b;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) a(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f25019d;
            if (iVar != i.f25031c) {
                i iVar2 = new i();
                do {
                    a aVar = f25015g;
                    aVar.a(iVar2, iVar);
                    if (aVar.a((AbstractFutureC1886e<?>) this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f25017b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) a(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        a(iVar2);
                    } else {
                        iVar = this.f25019d;
                    }
                } while (iVar != i.f25031c);
            }
            Object obj3 = this.f25017b;
            Objects.requireNonNull(obj3);
            return (V) a(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f25017b;
            if ((obj4 != null) && (!(obj4 instanceof f))) {
                return (V) a(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC1886e = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z4 = convert == 0 || nanos2 > 1000;
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
        throw new TimeoutException(str + " for " + abstractFutureC1886e);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f25017b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.f25017b != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f25017b;
            if (obj instanceof f) {
                sb.append(", setFuture=[");
                ((f) obj).getClass();
                try {
                    sb.append((Object) null);
                } catch (RuntimeException | StackOverflowError e4) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e4.getClass());
                }
                sb.append(b9.i.f15552e);
            } else {
                try {
                    str = x22.a(a());
                } catch (RuntimeException | StackOverflowError e5) {
                    str = "Exception thrown from implementation: " + e5.getClass();
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append(b9.i.f15552e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        sb.append(b9.i.f15552e);
        return sb.toString();
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$i */
    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f25031c = new i(0);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f25032a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f25033b;

        i() {
            AbstractFutureC1886e.f25015g.a(this, Thread.currentThread());
        }

        i(int i4) {
        }
    }

    protected boolean b(V v4) {
        if (!f25015g.a((AbstractFutureC1886e<?>) this, (Object) null, (Object) v4)) {
            return false;
        }
        a((AbstractFutureC1886e<?>) this);
        return true;
    }

    private void a(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private static void a(AbstractFutureC1886e<?> abstractFutureC1886e) {
        i iVar;
        d dVar;
        do {
            iVar = ((AbstractFutureC1886e) abstractFutureC1886e).f25019d;
        } while (!f25015g.a(abstractFutureC1886e, iVar, i.f25031c));
        while (iVar != null) {
            Thread thread = iVar.f25032a;
            if (thread != null) {
                iVar.f25032a = null;
                LockSupport.unpark(thread);
            }
            iVar = iVar.f25033b;
        }
        do {
            dVar = ((AbstractFutureC1886e) abstractFutureC1886e).f25018c;
        } while (!f25015g.a(abstractFutureC1886e, dVar, d.f25024b));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f25025a;
            dVar.f25025a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        if (dVar2 != null) {
            throw null;
        }
    }

    private static Object a(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == f25016h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f25023a);
        }
        Throwable th = ((b) obj).f25022a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private void a(i iVar) {
        iVar.f25032a = null;
        while (true) {
            i iVar2 = this.f25019d;
            if (iVar2 == i.f25031c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f25033b;
                if (iVar2.f25032a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f25033b = iVar4;
                    if (iVar3.f25032a == null) {
                        break;
                    }
                } else if (!f25015g.a((AbstractFutureC1886e<?>) this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f25017b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) a(obj2);
            }
            i iVar = this.f25019d;
            if (iVar != i.f25031c) {
                i iVar2 = new i();
                do {
                    a aVar = f25015g;
                    aVar.a(iVar2, iVar);
                    if (aVar.a((AbstractFutureC1886e<?>) this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f25017b;
                            } else {
                                a(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) a(obj);
                    }
                    iVar = this.f25019d;
                } while (iVar != i.f25031c);
            }
            Object obj3 = this.f25017b;
            Objects.requireNonNull(obj3);
            return (V) a(obj3);
        }
        throw new InterruptedException();
    }

    protected boolean a(Throwable th) {
        if (!f25015g.a((AbstractFutureC1886e<?>) this, (Object) null, (Object) new c(th))) {
            return false;
        }
        a((AbstractFutureC1886e<?>) this);
        return true;
    }
}
