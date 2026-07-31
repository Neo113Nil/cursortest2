package com.google.android.gms.internal.ads;

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
public abstract class ga3<V> extends uc3 implements cc3<V> {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f5516i;

    /* renamed from: j, reason: collision with root package name */
    private static final Logger f5517j;

    /* renamed from: k, reason: collision with root package name */
    private static final u93 f5518k;

    /* renamed from: l, reason: collision with root package name */
    private static final Object f5519l;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f5520f;

    /* renamed from: g, reason: collision with root package name */
    private volatile x93 f5521g;

    /* renamed from: h, reason: collision with root package name */
    private volatile fa3 f5522h;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z6;
        Throwable th;
        Throwable th2;
        u93 aa3Var;
        try {
            z6 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z6 = false;
        }
        f5516i = z6;
        f5517j = Logger.getLogger(ga3.class.getName());
        Object[] objArr = 0;
        try {
            aa3Var = new ea3(null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                aa3Var = new y93(AtomicReferenceFieldUpdater.newUpdater(fa3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(fa3.class, fa3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ga3.class, fa3.class, "h"), AtomicReferenceFieldUpdater.newUpdater(ga3.class, x93.class, "g"), AtomicReferenceFieldUpdater.newUpdater(ga3.class, Object.class, "f"));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                aa3Var = new aa3(objArr == true ? 1 : 0);
            }
        }
        f5518k = aa3Var;
        if (th != null) {
            Logger logger = f5517j;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f5519l = new Object();
    }

    protected ga3() {
    }

    private final void A(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object h7 = h(this);
            sb.append("SUCCESS, result=[");
            if (h7 == null) {
                hexString = "null";
            } else if (h7 == this) {
                hexString = "this future";
            } else {
                sb.append(h7.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(h7));
            }
            sb.append(hexString);
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

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void B(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f5520f;
        if (!(obj instanceof z93)) {
            try {
                concat = b53.a(i());
            } catch (RuntimeException | StackOverflowError e7) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e7.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
            }
            if (isDone()) {
                return;
            }
            sb.delete(length, sb.length());
            A(sb);
            return;
        }
        sb.append(", setFuture=[");
        C(sb, ((z93) obj).f15038g);
        sb.append("]");
        if (isDone()) {
        }
    }

    private final void C(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e7) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e7.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(ga3<?> ga3Var) {
        x93 x93Var;
        x93 x93Var2;
        x93 x93Var3 = null;
        while (true) {
            fa3 fa3Var = ((ga3) ga3Var).f5522h;
            if (f5518k.e(ga3Var, fa3Var, fa3.f5066c)) {
                while (fa3Var != null) {
                    Thread thread = fa3Var.f5067a;
                    if (thread != null) {
                        fa3Var.f5067a = null;
                        LockSupport.unpark(thread);
                    }
                    fa3Var = fa3Var.f5068b;
                }
                ga3Var.j();
                do {
                    x93Var = ((ga3) ga3Var).f5521g;
                } while (!f5518k.c(ga3Var, x93Var, x93.f14099d));
                while (true) {
                    x93Var2 = x93Var3;
                    x93Var3 = x93Var;
                    if (x93Var3 == null) {
                        break;
                    }
                    x93Var = x93Var3.f14102c;
                    x93Var3.f14102c = x93Var2;
                }
                while (x93Var2 != null) {
                    x93Var3 = x93Var2.f14102c;
                    Runnable runnable = x93Var2.f14100a;
                    runnable.getClass();
                    if (runnable instanceof z93) {
                        z93 z93Var = (z93) runnable;
                        ga3Var = z93Var.f15037f;
                        if (((ga3) ga3Var).f5520f == z93Var) {
                            if (f5518k.d(ga3Var, z93Var, g(z93Var.f15038g))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = x93Var2.f14101b;
                        executor.getClass();
                        c(runnable, executor);
                    }
                    x93Var2 = x93Var3;
                }
                return;
            }
        }
    }

    private static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            Logger logger = f5517j;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e7);
        }
    }

    private final void e(fa3 fa3Var) {
        fa3Var.f5067a = null;
        while (true) {
            fa3 fa3Var2 = this.f5522h;
            if (fa3Var2 != fa3.f5066c) {
                fa3 fa3Var3 = null;
                while (fa3Var2 != null) {
                    fa3 fa3Var4 = fa3Var2.f5068b;
                    if (fa3Var2.f5067a != null) {
                        fa3Var3 = fa3Var2;
                    } else if (fa3Var3 != null) {
                        fa3Var3.f5068b = fa3Var4;
                        if (fa3Var3.f5067a == null) {
                            break;
                        }
                    } else if (!f5518k.e(this, fa3Var2, fa3Var4)) {
                        break;
                    }
                    fa3Var2 = fa3Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V f(Object obj) {
        if (obj instanceof v93) {
            Throwable th = ((v93) obj).f13175b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof w93) {
            throw new ExecutionException(((w93) obj).f13775a);
        }
        if (obj == f5519l) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object g(cc3<?> cc3Var) {
        Throwable a7;
        if (cc3Var instanceof ba3) {
            Object obj = ((ga3) cc3Var).f5520f;
            if (obj instanceof v93) {
                v93 v93Var = (v93) obj;
                if (v93Var.f13174a) {
                    Throwable th = v93Var.f13175b;
                    obj = th != null ? new v93(false, th) : v93.f13173d;
                }
            }
            obj.getClass();
            return obj;
        }
        if ((cc3Var instanceof uc3) && (a7 = ((uc3) cc3Var).a()) != null) {
            return new w93(a7);
        }
        boolean isCancelled = cc3Var.isCancelled();
        if ((!f5516i) && isCancelled) {
            v93 v93Var2 = v93.f13173d;
            v93Var2.getClass();
            return v93Var2;
        }
        try {
            Object h7 = h(cc3Var);
            if (!isCancelled) {
                return h7 == null ? f5519l : h7;
            }
            String valueOf = String.valueOf(cc3Var);
            StringBuilder sb = new StringBuilder(valueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new v93(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e7) {
            return !isCancelled ? new w93(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(cc3Var)), e7)) : new v93(false, e7);
        } catch (ExecutionException e8) {
            return isCancelled ? new v93(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(cc3Var)), e8)) : new w93(e8.getCause());
        } catch (Throwable th2) {
            return new w93(th2);
        }
    }

    private static <V> V h(Future<V> future) {
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

    @Override // com.google.android.gms.internal.ads.uc3
    protected final Throwable a() {
        if (!(this instanceof ba3)) {
            return null;
        }
        Object obj = this.f5520f;
        if (obj instanceof w93) {
            return ((w93) obj).f13775a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cc3
    public void b(Runnable runnable, Executor executor) {
        x93 x93Var;
        q43.c(runnable, "Runnable was null.");
        q43.c(executor, "Executor was null.");
        if (!isDone() && (x93Var = this.f5521g) != x93.f14099d) {
            x93 x93Var2 = new x93(runnable, executor);
            do {
                x93Var2.f14102c = x93Var;
                if (f5518k.c(this, x93Var, x93Var2)) {
                    return;
                } else {
                    x93Var = this.f5521g;
                }
            } while (x93Var != x93.f14099d);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        v93 v93Var;
        Object obj = this.f5520f;
        if (!(obj == null) && !(obj instanceof z93)) {
            return false;
        }
        if (f5516i) {
            v93Var = new v93(z6, new CancellationException("Future.cancel() was called."));
        } else {
            v93Var = z6 ? v93.f13172c : v93.f13173d;
            v93Var.getClass();
        }
        boolean z7 = false;
        ga3<V> ga3Var = this;
        while (true) {
            if (f5518k.d(ga3Var, obj, v93Var)) {
                if (z6) {
                    ga3Var.t();
                }
                D(ga3Var);
                if (!(obj instanceof z93)) {
                    break;
                }
                cc3<? extends V> cc3Var = ((z93) obj).f15038g;
                if (!(cc3Var instanceof ba3)) {
                    cc3Var.cancel(z6);
                    break;
                }
                ga3Var = (ga3) cc3Var;
                obj = ga3Var.f5520f;
                if (!(obj == null) && !(obj instanceof z93)) {
                    break;
                }
                z7 = true;
            } else {
                obj = ga3Var.f5520f;
                if (!(obj instanceof z93)) {
                    return z7;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5520f;
        if ((obj2 != null) && (!(obj2 instanceof z93))) {
            return (V) f(obj2);
        }
        fa3 fa3Var = this.f5522h;
        if (fa3Var != fa3.f5066c) {
            fa3 fa3Var2 = new fa3();
            do {
                u93 u93Var = f5518k;
                u93Var.a(fa3Var2, fa3Var);
                if (u93Var.e(this, fa3Var, fa3Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            e(fa3Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f5520f;
                    } while (!((obj != null) & (!(obj instanceof z93))));
                    return (V) f(obj);
                }
                fa3Var = this.f5522h;
            } while (fa3Var != fa3.f5066c);
        }
        Object obj3 = this.f5520f;
        obj3.getClass();
        return (V) f(obj3);
    }

    @Override // java.util.concurrent.Future
    public V get(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5520f;
        boolean z6 = true;
        if ((obj != null) && (!(obj instanceof z93))) {
            return (V) f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            fa3 fa3Var = this.f5522h;
            if (fa3Var != fa3.f5066c) {
                fa3 fa3Var2 = new fa3();
                do {
                    u93 u93Var = f5518k;
                    u93Var.a(fa3Var2, fa3Var);
                    if (u93Var.e(this, fa3Var, fa3Var2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                e(fa3Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5520f;
                            if ((obj2 != null) && (!(obj2 instanceof z93))) {
                                return (V) f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fa3Var2);
                    } else {
                        fa3Var = this.f5522h;
                    }
                } while (fa3Var != fa3.f5066c);
            }
            Object obj3 = this.f5520f;
            obj3.getClass();
            return (V) f(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f5520f;
            if ((obj4 != null) && (!(obj4 instanceof z93))) {
                return (V) f(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String ga3Var = toString();
        String timeUnit2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = timeUnit2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j7);
        sb.append(" ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j8 = -nanos;
            long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z6 = false;
            }
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb3.append(valueOf);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z6) {
                    sb4 = sb4.concat(",");
                }
                concat = String.valueOf(sb4).concat(" ");
            }
            if (z6) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                sb5.append(valueOf2);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = String.valueOf(concat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(ga3Var).length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(ga3Var);
        throw new TimeoutException(sb6.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f5520f instanceof v93;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof z93)) & (this.f5520f != null);
    }

    protected void j() {
    }

    protected void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            A(sb);
        } else {
            B(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    final void u(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(z());
        }
    }

    protected boolean w(V v6) {
        if (v6 == null) {
            v6 = (V) f5519l;
        }
        if (!f5518k.d(this, null, v6)) {
            return false;
        }
        D(this);
        return true;
    }

    protected boolean x(Throwable th) {
        Objects.requireNonNull(th);
        if (!f5518k.d(this, null, new w93(th))) {
            return false;
        }
        D(this);
        return true;
    }

    protected final boolean y(cc3<? extends V> cc3Var) {
        w93 w93Var;
        Objects.requireNonNull(cc3Var);
        Object obj = this.f5520f;
        if (obj == null) {
            if (cc3Var.isDone()) {
                if (!f5518k.d(this, null, g(cc3Var))) {
                    return false;
                }
                D(this);
                return true;
            }
            z93 z93Var = new z93(this, cc3Var);
            if (f5518k.d(this, null, z93Var)) {
                try {
                    cc3Var.b(z93Var, fb3.INSTANCE);
                } catch (Throwable th) {
                    try {
                        w93Var = new w93(th);
                    } catch (Throwable unused) {
                        w93Var = w93.f13774b;
                    }
                    f5518k.d(this, z93Var, w93Var);
                }
                return true;
            }
            obj = this.f5520f;
        }
        if (obj instanceof v93) {
            cc3Var.cancel(((v93) obj).f13174a);
        }
        return false;
    }

    protected final boolean z() {
        Object obj = this.f5520f;
        return (obj instanceof v93) && ((v93) obj).f13174a;
    }
}
