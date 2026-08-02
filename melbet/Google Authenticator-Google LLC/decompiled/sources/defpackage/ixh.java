package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixh {
    public static final Executor a(kvj kvjVar) {
        Executor e;
        kwm kwmVar = kvjVar instanceof kwm ? (kwm) kvjVar : null;
        return (kwmVar == null || (e = kwmVar.e()) == null) ? new kvz(kvjVar) : e;
    }

    public static final kvj b(Executor executor) {
        kvj kvjVar;
        kvz kvzVar = executor instanceof kvz ? (kvz) executor : null;
        return (kvzVar == null || (kvjVar = kvzVar.a) == null) ? new kwn(executor) : kvjVar;
    }

    public static final CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void d(kvy kvyVar, kqj kqjVar, boolean z) {
        Object o = kvyVar.o();
        Throwable r = kvyVar.r(o);
        Object X = r != null ? ixc.X(r) : kvyVar.n(o);
        if (!z) {
            kqjVar.ca(X);
            return;
        }
        lcc lccVar = (lcc) kqjVar;
        kqj kqjVar2 = lccVar.b;
        Object obj = lccVar.d;
        kqn bU = kqjVar2.bU();
        Object b = ldd.b(bU, obj);
        kya c = b != ldd.a ? kvi.c(kqjVar2, bU, b) : null;
        try {
            kqjVar2.ca(X);
            if (c == null || c.S()) {
                ldd.c(bU, b);
            }
        } catch (Throwable th) {
            if (c == null || c.S()) {
                ldd.c(bU, b);
            }
            throw th;
        }
    }

    public static final boolean e(int i) {
        return i == 1 || i == 2;
    }

    public static final Object f(long j, kqj kqjVar) {
        if (j > 0) {
            kuw kuwVar = new kuw(ixe.d(kqjVar), 1);
            kuwVar.y();
            if (j < Long.MAX_VALUE) {
                g(kuwVar.b).c(j, kuwVar);
            }
            Object l = kuwVar.l();
            if (l == kqp.a) {
                return l;
            }
        }
        return kow.a;
    }

    public static final kvu g(kqn kqnVar) {
        kql kqlVar = kqnVar.get(kqk.b);
        kvu kvuVar = kqlVar instanceof kvu ? (kvu) kqlVar : null;
        return kvuVar == null ? kvr.a : kvuVar;
    }
}
