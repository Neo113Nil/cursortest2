package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixl {
    public static final void a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.Y(i, "Expected positive parallelism level, but got "));
        }
    }

    public static final void b(kqn kqnVar, Throwable th) {
        Iterator it = lbz.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(kqnVar, th);
            } catch (lce unused) {
                return;
            } catch (Throwable th2) {
                lbz.a(kvp.h(th, th2));
            }
        }
        try {
            koc.b(th, new lcb(kqnVar));
        } catch (Throwable unused2) {
        }
        lbz.a(th);
    }

    public static final Object c(hvi hviVar, kqj kqjVar) {
        try {
            if (hviVar.isDone()) {
                return a.n(hviVar);
            }
            kuw kuwVar = new kuw(ixe.d(kqjVar), 1);
            kuwVar.y();
            hviVar.c(new auf(hviVar, (kuv) kuwVar, 5), huf.a);
            kuwVar.b(new kzc(hviVar, 2));
            Object l = kuwVar.l();
            if (l == kqp.a) {
                kqjVar.getClass();
            }
            return l;
        } catch (ExecutionException e) {
            throw d(e);
        }
    }

    public static final Throwable d(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static /* synthetic */ hvi e(kvm kvmVar, krx krxVar) {
        boolean e = kvp.e(1);
        kqo kqoVar = kqo.a;
        if (e) {
            "DEFAULT".toString();
            throw new IllegalArgumentException("DEFAULT".concat(" start is not supported"));
        }
        lbs lbsVar = new lbs(kvi.b(kvmVar, kqoVar));
        kvp.d(1, krxVar, lbsVar, lbsVar);
        return lbsVar.b;
    }

    public static final Object f(kzr kzrVar, kzq[] kzqVarArr, kri kriVar, kry kryVar, kqj kqjVar) {
        lax laxVar = new lax(kzqVarArr, kriVar, kryVar, kzrVar, null);
        laz lazVar = new laz(kqjVar.bU(), kqjVar);
        Object j = jav.j(lazVar, true, lazVar, laxVar);
        return j == kqp.a ? j : kow.a;
    }
}
