package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lbr implements hvi {
    public final hvw a = new hvw();
    public boolean b;
    private final kwu c;

    public lbr(kwu kwuVar) {
        this.c = kwuVar;
    }

    private static final void a(Object obj) {
        if (obj instanceof lbq) {
            throw new CancellationException().initCause(((lbq) obj).a);
        }
    }

    @Override // defpackage.hvi
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.a.cancel(z)) {
            return false;
        }
        this.c.s(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object s = this.a.s();
        a(s);
        return s;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        hvw hvwVar = this.a;
        if (hvwVar.isCancelled()) {
            return true;
        }
        if (!isDone() || this.b) {
            return false;
        }
        try {
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.b = true;
        }
        return a.n(hvwVar) instanceof lbq;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        boolean isDone = isDone();
        hvw hvwVar = this.a;
        if (isDone) {
            try {
                Object n = a.n(hvwVar);
                if (n instanceof lbq) {
                    sb.append("CANCELLED, cause=[" + ((lbq) n).a + "]");
                } else {
                    sb.append(a.ab(n, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + hvwVar + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object t = this.a.t(j, timeUnit);
        a(t);
        return t;
    }
}
