package D;

import M0.C0056n;
import java.util.concurrent.CancellationException;
import u0.C0247g;

/* loaded from: classes.dex */
public final class N extends F0.j implements E0.p {

    /* renamed from: f, reason: collision with root package name */
    public static final N f111f = new N(2);

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        Throwable th = (Throwable) obj2;
        F0.i.e(e0Var, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        e0Var.f182b.I(new C0056n(th, false));
        return C0247g.f3005a;
    }
}
