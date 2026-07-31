package t2;

import java.util.List;
import o2.H0;

/* loaded from: classes3.dex */
public abstract class w {
    private static final x a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new W1.f();
    }

    static /* synthetic */ x b(Throwable th, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(H0 h02) {
        return h02.p() instanceof x;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final H0 e(u uVar, List list) {
        try {
            return uVar.b(list);
        } catch (Throwable th) {
            return a(th, uVar.a());
        }
    }
}
