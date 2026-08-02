package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hso extends hun implements Runnable {
    hvi a;
    Class b;
    Object c;

    public hso(hvi hviVar, Class cls, Object obj) {
        hviVar.getClass();
        this.a = hviVar;
        this.b = cls;
        this.c = obj;
    }

    public static hvi f(hvi hviVar, Class cls, gzf gzfVar, Executor executor) {
        hsn hsnVar = new hsn(hviVar, cls, gzfVar);
        hviVar.c(hsnVar, hnu.aD(executor, hsnVar));
        return hsnVar;
    }

    public static hvi g(hvi hviVar, Class cls, htr htrVar, Executor executor) {
        hsm hsmVar = new hsm(hviVar, cls, htrVar);
        hviVar.c(hsmVar, hnu.aD(executor, hsmVar));
        return hsmVar;
    }

    @Override // defpackage.hsw
    protected final String a() {
        hvi hviVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String a = super.a();
        String aa = hviVar != null ? a.aa(hviVar, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (a != null) {
                return aa.concat(a);
            }
            return null;
        }
        return aa + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // defpackage.hsw
    protected final void b() {
        m(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract Object d(Object obj, Throwable th);

    public abstract void e(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        hvi hviVar = this.a;
        Class cls = this.b;
        Object obj2 = this.c;
        if (((obj2 == null) || ((hviVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = hviVar instanceof hwf ? ((hwf) hviVar).j() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(hviVar.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = hnu.aR(hviVar);
            if (th != null) {
                o(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                q(hviVar);
                return;
            }
            try {
                Object d = d(obj2, th);
                this.b = null;
                this.c = null;
                e(d);
                return;
            } catch (Throwable th2) {
                try {
                    hnu.az(th2);
                    p(th2);
                    return;
                } finally {
                    this.b = null;
                    this.c = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }
}
