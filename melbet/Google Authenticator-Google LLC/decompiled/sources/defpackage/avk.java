package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avk {
    public static final String a = asq.b("WorkerWrapper");

    public static final Object a(hvi hviVar, asp aspVar, kqj kqjVar) {
        try {
            if (hviVar.isDone()) {
                return b(hviVar);
            }
            kuw kuwVar = new kuw(ixe.d(kqjVar), 1);
            kuwVar.y();
            hviVar.c(new auf(hviVar, (kuv) kuwVar, 0), asf.a);
            kuwVar.b(new avj(aspVar, hviVar));
            return kuwVar.l();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Object b(Future future) {
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

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}
