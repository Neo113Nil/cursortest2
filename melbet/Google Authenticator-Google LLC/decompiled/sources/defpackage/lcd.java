package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcd {
    public static final ldb a = new ldb("UNDEFINED");
    public static final ldb b = new ldb("REUSABLE_CLAIMED");

    public static final void a(kqj kqjVar, Object obj) {
        if (!(kqjVar instanceof lcc)) {
            kqjVar.ca(obj);
            return;
        }
        lcc lccVar = (lcc) kqjVar;
        Object b2 = ixg.b(obj);
        kvj kvjVar = lccVar.a;
        if (c(kvjVar, lccVar.bU())) {
            lccVar.c = b2;
            lccVar.e = 1;
            b(kvjVar, lccVar.bU(), lccVar);
            return;
        }
        boolean z = kvo.a;
        ThreadLocal threadLocal = kxv.a;
        kwf a2 = kxv.a();
        if (a2.p()) {
            lccVar.c = b2;
            lccVar.e = 1;
            a2.n(lccVar);
            return;
        }
        a2.o(true);
        try {
            kwu kwuVar = (kwu) lccVar.bU().get(kwu.d);
            if (kwuVar == null || kwuVar.t()) {
                kqj kqjVar2 = lccVar.b;
                Object obj2 = lccVar.d;
                kqn bU = kqjVar2.bU();
                Object b3 = ldd.b(bU, obj2);
                kya c = b3 != ldd.a ? kvi.c(kqjVar2, bU, b3) : null;
                try {
                    kqjVar2.ca(obj);
                } finally {
                    if (c == null || c.S()) {
                        ldd.c(bU, b3);
                    }
                }
            } else {
                lccVar.ca(ixc.X(kwuVar.p()));
            }
            while (a2.r()) {
            }
        } catch (Throwable th) {
            try {
                lccVar.G(th);
            } finally {
                a2.m(true);
            }
        }
    }

    public static final void b(kvj kvjVar, kqn kqnVar, Runnable runnable) {
        try {
            kvjVar.a(kqnVar, runnable);
        } catch (Throwable th) {
            throw new kvw(th, kvjVar, kqnVar);
        }
    }

    public static final boolean c(kvj kvjVar, kqn kqnVar) {
        try {
            return kvjVar.b(kqnVar);
        } catch (Throwable th) {
            throw new kvw(th, kvjVar, kqnVar);
        }
    }
}
