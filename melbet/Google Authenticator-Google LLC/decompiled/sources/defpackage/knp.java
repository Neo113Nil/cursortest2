package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knp {
    public static final jwv a;
    private static final Logger b = Logger.getLogger(knp.class.getName());

    static {
        if (!hoq.S(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = new jwv("internal-stub-type", null);
    }

    private knp() {
    }

    public static hvi a(iws iwsVar, Object obj) {
        knm knmVar = new knm(iwsVar);
        c(iwsVar, obj, new knn(knmVar));
        return knmVar;
    }

    private static RuntimeException b(iws iwsVar, Throwable th) {
        try {
            iwsVar.r(null, th);
        } catch (Error | RuntimeException e) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void c(iws iwsVar, Object obj, knn knnVar) {
        iwsVar.a(knnVar, new kaa());
        knnVar.a.a.d(2);
        try {
            iwsVar.e(obj);
            iwsVar.c();
        } catch (Error | RuntimeException e) {
            throw b(iwsVar, e);
        }
    }
}
