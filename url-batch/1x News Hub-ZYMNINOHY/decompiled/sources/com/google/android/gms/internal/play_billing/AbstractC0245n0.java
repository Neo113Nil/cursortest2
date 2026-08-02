package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0245n0 extends K0 implements InterfaceFutureC0277y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2887d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0274x0 f2888e;
    public static final AbstractC0216d1 f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2889g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2890a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0221f0 f2891b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0242m0 f2892c;

    static {
        boolean z;
        AbstractC0216d1 c0230i0;
        Throwable th;
        int i3 = 7;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f2887d = z;
        f2888e = new C0274x0(AbstractC0245n0.class);
        Throwable th2 = null;
        try {
            c0230i0 = new C0239l0(i3);
            th = null;
        } catch (Error | Exception e3) {
            try {
                th = e3;
                c0230i0 = new C0224g0(AtomicReferenceFieldUpdater.newUpdater(C0242m0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0242m0.class, C0242m0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0245n0.class, C0242m0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0245n0.class, C0221f0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0245n0.class, Object.class, "a"));
            } catch (Error | Exception e4) {
                th2 = e4;
                c0230i0 = new C0230i0(i3);
                th = e3;
            }
        }
        f = c0230i0;
        if (th2 != null) {
            C0274x0 c0274x0 = f2888e;
            Logger a3 = c0274x0.a();
            Level level = Level.SEVERE;
            a3.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            c0274x0.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f2889g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object e(InterfaceFutureC0277y0 interfaceFutureC0277y0) {
        Throwable th;
        if (interfaceFutureC0277y0 instanceof InterfaceC0233j0) {
            Object obj = ((AbstractC0245n0) interfaceFutureC0277y0).f2890a;
            if (obj instanceof C0212c0) {
                C0212c0 c0212c0 = (C0212c0) obj;
                if (c0212c0.f2837a) {
                    RuntimeException runtimeException = c0212c0.f2838b;
                    obj = runtimeException != null ? new C0212c0(false, runtimeException) : C0212c0.f2836d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if (interfaceFutureC0277y0 instanceof K0) {
            AbstractC0245n0 abstractC0245n0 = (AbstractC0245n0) ((K0) interfaceFutureC0277y0);
            abstractC0245n0.getClass();
            if (abstractC0245n0 instanceof InterfaceC0233j0) {
                Object obj2 = abstractC0245n0.f2890a;
                if (obj2 instanceof C0218e0) {
                    th = ((C0218e0) obj2).f2852a;
                    if (th != null) {
                        return new C0218e0(th);
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        boolean isCancelled = interfaceFutureC0277y0.isCancelled();
        if ((!f2887d) && isCancelled) {
            C0212c0 c0212c02 = C0212c0.f2836d;
            Objects.requireNonNull(c0212c02);
            return c0212c02;
        }
        try {
            try {
                try {
                    Object f3 = f(interfaceFutureC0277y0);
                    return isCancelled ? new C0212c0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC0277y0)))) : f3 == null ? f2889g : f3;
                } catch (Error | Exception e3) {
                    e = e3;
                    return new C0218e0(e);
                }
            } catch (Error e4) {
                e = e4;
                return new C0218e0(e);
            }
        } catch (CancellationException e5) {
            return !isCancelled ? new C0218e0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC0277y0)), e5)) : new C0212c0(false, e5);
        } catch (ExecutionException e6) {
            return isCancelled ? new C0212c0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC0277y0)), e6)) : new C0218e0(e6.getCause());
        }
    }

    public static Object f(InterfaceFutureC0277y0 interfaceFutureC0277y0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = interfaceFutureC0277y0.get();
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

    public static void h(AbstractC0245n0 abstractC0245n0) {
        C0221f0 c0221f0;
        C0221f0 c0221f02 = null;
        while (true) {
            for (C0242m0 o = f.o(abstractC0245n0); o != null; o = o.f2885b) {
                Thread thread = o.f2884a;
                if (thread != null) {
                    o.f2884a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC0245n0.c();
            C0221f0 c0221f03 = c0221f02;
            C0221f0 d3 = f.d(abstractC0245n0);
            C0221f0 c0221f04 = c0221f03;
            while (d3 != null) {
                C0221f0 c0221f05 = d3.f2858c;
                d3.f2858c = c0221f04;
                c0221f04 = d3;
                d3 = c0221f05;
            }
            while (c0221f04 != null) {
                Runnable runnable = c0221f04.f2856a;
                c0221f0 = c0221f04.f2858c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC0227h0) {
                    RunnableC0227h0 runnableC0227h0 = (RunnableC0227h0) runnable;
                    abstractC0245n0 = runnableC0227h0.f2866a;
                    if (abstractC0245n0.f2890a == runnableC0227h0) {
                        if (f.D(abstractC0245n0, runnableC0227h0, e(runnableC0227h0.f2867b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0221f04.f2857b;
                    Objects.requireNonNull(executor);
                    i(runnable, executor);
                }
                c0221f04 = c0221f0;
            }
            return;
            c0221f02 = c0221f0;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            f2888e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e3);
        }
    }

    public static final Object k(Object obj) {
        if (obj instanceof C0212c0) {
            RuntimeException runtimeException = ((C0212c0) obj).f2838b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C0218e0) {
            throw new ExecutionException(((C0218e0) obj).f2852a);
        }
        if (obj == f2889g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0277y0
    public final void a(Runnable runnable, Executor executor) {
        C0221f0 c0221f0;
        C0221f0 c0221f02;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (c0221f0 = this.f2891b) != (c0221f02 = C0221f0.f2855d)) {
            C0221f0 c0221f03 = new C0221f0(runnable, executor);
            do {
                c0221f03.f2858c = c0221f0;
                if (f.z(this, c0221f0, c0221f03)) {
                    return;
                } else {
                    c0221f0 = this.f2891b;
                }
            } while (c0221f0 != c0221f02);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        C0212c0 c0212c0;
        Object obj = this.f2890a;
        if (!(obj instanceof RunnableC0227h0) && !(obj == null)) {
            return false;
        }
        if (f2887d) {
            c0212c0 = new C0212c0(z, new CancellationException("Future.cancel() was called."));
        } else {
            c0212c0 = z ? C0212c0.f2835c : C0212c0.f2836d;
            Objects.requireNonNull(c0212c0);
        }
        AbstractC0245n0 abstractC0245n0 = this;
        boolean z2 = false;
        while (true) {
            if (f.D(abstractC0245n0, obj, c0212c0)) {
                h(abstractC0245n0);
                if (!(obj instanceof RunnableC0227h0)) {
                    break;
                }
                InterfaceFutureC0277y0 interfaceFutureC0277y0 = ((RunnableC0227h0) obj).f2867b;
                if (!(interfaceFutureC0277y0 instanceof InterfaceC0233j0)) {
                    interfaceFutureC0277y0.cancel(z);
                    break;
                }
                abstractC0245n0 = (AbstractC0245n0) interfaceFutureC0277y0;
                obj = abstractC0245n0.f2890a;
                if (!(obj == null) && !(obj instanceof RunnableC0227h0)) {
                    break;
                }
                z2 = true;
            } else {
                obj = abstractC0245n0.f2890a;
                if (!(obj instanceof RunnableC0227h0)) {
                    return z2;
                }
            }
        }
    }

    public final void d(Throwable th) {
        if (f.D(this, null, new C0218e0(th))) {
            h(this);
        }
    }

    public final void g(StringBuilder sb) {
        try {
            Object f3 = f(this);
            sb.append("SUCCESS, result=[");
            if (f3 == null) {
                sb.append("null");
            } else if (f3 == this) {
                sb.append("this future");
            } else {
                sb.append(f3.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(f3)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        } catch (Exception e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f2890a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC0227h0))) {
            return k(obj2);
        }
        C0242m0 c0242m0 = this.f2892c;
        C0242m0 c0242m02 = C0242m0.f2883c;
        if (c0242m0 != c0242m02) {
            C0242m0 c0242m03 = new C0242m0();
            do {
                AbstractC0216d1 abstractC0216d1 = f;
                abstractC0216d1.s(c0242m03, c0242m0);
                if (abstractC0216d1.F(this, c0242m0, c0242m03)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(c0242m03);
                            throw new InterruptedException();
                        }
                        obj = this.f2890a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC0227h0))));
                    return k(obj);
                }
                c0242m0 = this.f2892c;
            } while (c0242m0 != c0242m02);
        }
        Object obj3 = this.f2890a;
        Objects.requireNonNull(obj3);
        return k(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2890a instanceof C0212c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f2890a != null) & (!(r0 instanceof RunnableC0227h0));
    }

    public final void j(C0242m0 c0242m0) {
        c0242m0.f2884a = null;
        while (true) {
            C0242m0 c0242m02 = this.f2892c;
            if (c0242m02 != C0242m0.f2883c) {
                C0242m0 c0242m03 = null;
                while (c0242m02 != null) {
                    C0242m0 c0242m04 = c0242m02.f2885b;
                    if (c0242m02.f2884a != null) {
                        c0242m03 = c0242m02;
                    } else if (c0242m03 != null) {
                        c0242m03.f2885b = c0242m04;
                        if (c0242m03.f2884a == null) {
                            break;
                        }
                    } else if (!f.F(this, c0242m02, c0242m04)) {
                        break;
                    }
                    c0242m02 = c0242m04;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r3.isEmpty() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f2890a instanceof C0212c0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            g(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f2890a;
            if (obj instanceof RunnableC0227h0) {
                sb.append(", setFuture=[");
                InterfaceFutureC0277y0 interfaceFutureC0277y0 = ((RunnableC0227h0) obj).f2867b;
                try {
                    if (interfaceFutureC0277y0 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(interfaceFutureC0277y0);
                    }
                } catch (Exception e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append("]");
                    if (isDone()) {
                    }
                    sb.append("]");
                    return sb.toString();
                } catch (StackOverflowError e4) {
                    e = e4;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append("]");
                    if (isDone()) {
                    }
                    sb.append("]");
                    return sb.toString();
                }
                sb.append("]");
            } else {
                try {
                    concat = b();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Exception | StackOverflowError e5) {
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(e5.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                g(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        boolean z;
        long j4;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f2890a;
            if ((obj != null) & (!(obj instanceof RunnableC0227h0))) {
                return k(obj);
            }
            long j5 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C0242m0 c0242m0 = this.f2892c;
                C0242m0 c0242m02 = C0242m0.f2883c;
                if (c0242m0 != c0242m02) {
                    C0242m0 c0242m03 = new C0242m0();
                    z = true;
                    while (true) {
                        AbstractC0216d1 abstractC0216d1 = f;
                        abstractC0216d1.s(c0242m03, c0242m0);
                        if (abstractC0216d1.F(this, c0242m0, c0242m03)) {
                            j4 = j5;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2890a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC0227h0))) {
                                        return k(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    j(c0242m03);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            j(c0242m03);
                        } else {
                            long j6 = j5;
                            c0242m0 = this.f2892c;
                            if (c0242m0 == c0242m02) {
                                break;
                            }
                            j5 = j6;
                        }
                    }
                }
                Object obj3 = this.f2890a;
                Objects.requireNonNull(obj3);
                return k(obj3);
            }
            z = true;
            j4 = 0;
            while (nanos > j4) {
                Object obj4 = this.f2890a;
                if ((obj4 != null ? z : false) & (!(obj4 instanceof RunnableC0227h0))) {
                    return k(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC0245n0 = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j4) {
                String concat = str.concat(" (plus ");
                long j7 = -nanos;
                long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
                long nanos2 = j7 - timeUnit.toNanos(convert);
                if (convert != j4 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > j4) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(StringUtils.COMMA);
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC0033i.k(str, " for ", abstractC0245n0));
        }
        throw new InterruptedException();
    }
}
