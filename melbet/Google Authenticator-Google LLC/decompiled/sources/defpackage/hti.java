package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hti extends hun implements Runnable {
    hvi a;
    Object b;

    public hti(hvi hviVar, Object obj) {
        hviVar.getClass();
        this.a = hviVar;
        obj.getClass();
        this.b = obj;
    }

    public static hvi f(hvi hviVar, gzf gzfVar, Executor executor) {
        hth hthVar = new hth(hviVar, gzfVar);
        hviVar.c(hthVar, hnu.aD(executor, hthVar));
        return hthVar;
    }

    public static hvi g(hvi hviVar, htr htrVar, Executor executor) {
        htg htgVar = new htg(hviVar, htrVar);
        hviVar.c(htgVar, hnu.aD(executor, htgVar));
        return htgVar;
    }

    @Override // defpackage.hsw
    protected final String a() {
        hvi hviVar = this.a;
        Object obj = this.b;
        String a = super.a();
        String aa = hviVar != null ? a.aa(hviVar, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (a != null) {
                return aa.concat(a);
            }
            return null;
        }
        return aa + "function=[" + obj.toString() + "]";
    }

    @Override // defpackage.hsw
    protected final void b() {
        m(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object d(Object obj, Object obj2);

    public abstract void e(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        hvi hviVar = this.a;
        Object obj = this.b;
        if ((isCancelled() | (hviVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (hviVar.isCancelled()) {
            q(hviVar);
            return;
        }
        try {
            try {
                Object d = d(obj, hnu.aR(hviVar));
                this.b = null;
                e(d);
            } catch (Throwable th) {
                try {
                    hnu.az(th);
                    p(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            p(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            p(e2.getCause());
        } catch (Exception e3) {
            p(e3);
        }
    }
}
