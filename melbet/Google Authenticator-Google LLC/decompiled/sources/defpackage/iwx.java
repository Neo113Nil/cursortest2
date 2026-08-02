package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwx {
    public static kbq a(jxr jxrVar) {
        jxrVar.getClass();
        if (!jxrVar.i()) {
            return null;
        }
        Throwable c = jxrVar.c();
        if (c == null) {
            return kbq.c.e("io.grpc.Context was cancelled without error");
        }
        if (c instanceof TimeoutException) {
            return kbq.e.e(c.getMessage()).d(c);
        }
        kbq c2 = kbq.c(c);
        return (kbn.UNKNOWN.equals(c2.o) && c2.q == c) ? kbq.c.e("Context cancelled").d(c) : c2.d(c);
    }
}
