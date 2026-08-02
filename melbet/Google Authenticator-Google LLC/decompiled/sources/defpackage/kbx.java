package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kbx extends jxq {
    private static final Logger b = Logger.getLogger(kbx.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.jxq
    public final jxr a() {
        jxr jxrVar = (jxr) a.get();
        return jxrVar == null ? jxr.d : jxrVar;
    }

    @Override // defpackage.jxq
    public final jxr b(jxr jxrVar) {
        jxr a2 = a();
        a.set(jxrVar);
        return a2;
    }

    @Override // defpackage.jxq
    public final void c(jxr jxrVar, jxr jxrVar2) {
        if (a() != jxrVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (jxrVar2 != jxr.d) {
            a.set(jxrVar2);
        } else {
            a.set(null);
        }
    }
}
