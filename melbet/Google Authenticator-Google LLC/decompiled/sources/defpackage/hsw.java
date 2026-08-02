package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hsw extends hte {
    private static Object d(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    hnu.ay();
                }
                throw th;
            }
        }
        if (z) {
            hnu.ay();
        }
        return obj;
    }

    private static Object e(Object obj) {
        return obj == null ? j : obj;
    }

    private final void f(StringBuilder sb) {
        try {
            Object d = d(this);
            sb.append("SUCCESS, result=[");
            if (d == null) {
                sb.append("null");
            } else if (d == this) {
                sb.append("this future");
            } else {
                sb.append(d.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(d)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            k.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    static Object h(Object obj) {
        if (obj instanceof hsp) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((hsp) obj).d);
            throw cancellationException;
        }
        if (obj instanceof hss) {
            throw new ExecutionException(((hss) obj).b);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(hvi hviVar) {
        Throwable j;
        if (hviVar instanceof hsu) {
            Object obj = ((hsw) hviVar).valueField;
            if (obj instanceof hsp) {
                hsp hspVar = (hsp) obj;
                if (hspVar.c) {
                    Throwable th = hspVar.d;
                    obj = th != null ? new hsp(false, th) : hsp.b;
                }
            }
            obj.getClass();
            return obj;
        }
        if ((hviVar instanceof hwf) && (j = ((hwf) hviVar).j()) != null) {
            return new hss(j);
        }
        boolean isCancelled = hviVar.isCancelled();
        if ((!l) && isCancelled) {
            hsp hspVar2 = hsp.b;
            hspVar2.getClass();
            return hspVar2;
        }
        try {
            Object d = d(hviVar);
            if (!isCancelled) {
                return e(d);
            }
            return new hsp(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(hviVar)));
        } catch (Error | Exception e) {
            return new hss(e);
        } catch (CancellationException e2) {
            return !isCancelled ? new hss(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(hviVar))), e2)) : new hsp(false, e2);
        } catch (ExecutionException e3) {
            return isCancelled ? new hsp(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(hviVar))), e3)) : new hss(e3.getCause());
        }
    }

    public static void k(hsw hswVar, boolean z) {
        hst hstVar = null;
        while (true) {
            for (htd b = hte.m.b(hswVar, htd.a); b != null; b = b.next) {
                Thread thread = b.thread;
                if (thread != null) {
                    b.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                hswVar.l();
            }
            hswVar.b();
            hst hstVar2 = hstVar;
            hst a = hte.m.a(hswVar, hst.a);
            hst hstVar3 = hstVar2;
            while (a != null) {
                hst hstVar4 = a.next;
                a.next = hstVar3;
                hstVar3 = a;
                a = hstVar4;
            }
            while (hstVar3 != null) {
                Runnable runnable = hstVar3.b;
                hstVar = hstVar3.next;
                runnable.getClass();
                if (runnable instanceof hsq) {
                    hsq hsqVar = (hsq) runnable;
                    hswVar = hsqVar.a;
                    if (hswVar.valueField == hsqVar && u(hswVar, hsqVar, i(hsqVar.b))) {
                        break;
                    }
                } else {
                    Executor executor = hstVar3.c;
                    executor.getClass();
                    g(runnable, executor);
                }
                hstVar3 = hstVar;
            }
            return;
            z = false;
        }
    }

    static boolean n(Object obj) {
        return !(obj instanceof hsq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.hvi
    public void c(Runnable runnable, Executor executor) {
        hst hstVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (hstVar = this.listenersField) != hst.a) {
            hst hstVar2 = new hst(runnable, executor);
            do {
                hstVar2.next = hstVar;
                if (hte.m.e(this, hstVar, hstVar2)) {
                    return;
                } else {
                    hstVar = this.listenersField;
                }
            } while (hstVar != hst.a);
        }
        g(runnable, executor);
    }

    public boolean cancel(boolean z) {
        hsp hspVar;
        Object obj = this.valueField;
        if (!(obj instanceof hsq) && !(obj == null)) {
            return false;
        }
        if (l) {
            hspVar = new hsp(z, new CancellationException("Future.cancel() was called."));
        } else {
            hspVar = z ? hsp.a : hsp.b;
            hspVar.getClass();
        }
        boolean z2 = false;
        while (true) {
            if (u(this, obj, hspVar)) {
                k(this, z);
                if (!(obj instanceof hsq)) {
                    break;
                }
                hvi hviVar = ((hsq) obj).b;
                if (!(hviVar instanceof hsu)) {
                    hviVar.cancel(z);
                    break;
                }
                this = (hsw) hviVar;
                obj = this.valueField;
                if (!(obj == null) && !(obj instanceof hsq)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = this.valueField;
                if (n(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return s();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof hsp;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & n(obj);
    }

    @Override // defpackage.hwf
    public final Throwable j() {
        if (!(this instanceof hsu)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof hss) {
            return ((hss) obj).b;
        }
        return null;
    }

    public final void m(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(r());
        }
    }

    public final boolean o(Object obj) {
        if (!u(this, null, e(obj))) {
            return false;
        }
        k(this, false);
        return true;
    }

    public final boolean p(Throwable th) {
        if (!u(this, null, new hss(th))) {
            return false;
        }
        k(this, false);
        return true;
    }

    public final boolean q(hvi hviVar) {
        hss hssVar;
        hviVar.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (hviVar.isDone()) {
                if (!u(this, null, i(hviVar))) {
                    return false;
                }
                k(this, false);
                return true;
            }
            hsq hsqVar = new hsq(this, hviVar);
            if (u(this, null, hsqVar)) {
                try {
                    hviVar.c(hsqVar, huf.a);
                } catch (Throwable th) {
                    try {
                        hssVar = new hss(th);
                    } catch (Error | Exception unused) {
                        hssVar = hss.a;
                    }
                    u(this, hsqVar, hssVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof hsp) {
            hviVar.cancel(((hsp) obj).c);
        }
        return false;
    }

    protected final boolean r() {
        Object obj = this.valueField;
        return (obj instanceof hsp) && ((hsp) obj).c;
    }

    public String toString() {
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
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof hsq) {
                sb.append(", setFuture=[");
                hvi hviVar = ((hsq) obj).b;
                try {
                    if (hviVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(hviVar);
                    }
                } catch (Throwable th) {
                    hnu.aA(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = hoq.Q(a());
                } catch (Throwable th2) {
                    hnu.aA(th2);
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(th2.getClass())));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                f(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return t(j, timeUnit);
    }

    protected void b() {
    }

    protected void l() {
    }
}
