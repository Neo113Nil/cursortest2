package defpackage;

import java.lang.ref.Reference;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htz {
    public static final boolean b;
    public final htx c;
    public static final hvh a = new hvh(htz.class);
    private static final int d = new int[]{1, 2}[0];

    static {
        boolean z = true;
        try {
            Reference.class.getMethod("reachabilityFence", Object.class).invoke(null, htz.class);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            z = false;
        } catch (InvocationTargetException e) {
            hag.b(e.getCause());
            throw new AssertionError(e.getCause());
        }
        b = z;
    }

    public htz(hvi hviVar, htu htuVar) {
        this.c = new htx(hvc.v(hviVar), htuVar);
        htw.b.add(new htw(this));
    }

    public static void d(AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable != null) {
            try {
                executor.execute(new gfm(autoCloseable, 19));
            } catch (RejectedExecutionException e) {
                hvh hvhVar = a;
                if (hvhVar.a().isLoggable(Level.WARNING)) {
                    hvhVar.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                d(autoCloseable, huf.a);
            }
        }
    }

    public static void e(Object obj) {
        int i = d;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                if (b) {
                    Reference.reachabilityFence(obj);
                    return;
                }
                return;
            } else if (i2 == 1) {
                return;
            }
        }
        throw null;
    }

    private final htz g(hvc hvcVar) {
        try {
            htz htzVar = new htz(hvcVar);
            this.c.a(htzVar.c.b);
            return htzVar;
        } finally {
            e(this);
        }
    }

    public final htz a(htv htvVar, Executor executor) {
        return g((hvc) hti.g(this.c.c, new hts(this, htvVar, 0), executor));
    }

    public final htz b(htt httVar, Executor executor) {
        return g((hvc) hti.g(this.c.c, new hts(this, httVar, 2), executor));
    }

    public final hvi c() {
        try {
            return hnu.aK(hti.f(this.c.c, new gzg(null), huf.a));
        } finally {
            e(this);
        }
    }

    public final hvc f() {
        try {
            return this.c.e();
        } finally {
            e(this);
        }
    }

    public final String toString() {
        return this.c.toString();
    }

    public htz(hvi hviVar) {
        this(hviVar, new htu());
    }
}
