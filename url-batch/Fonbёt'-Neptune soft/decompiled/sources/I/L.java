package I;

import Y0.C0120n;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class L extends Q0.i implements P0.p {

    /* renamed from: f, reason: collision with root package name */
    public static final L f554f = new L(2);

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        Throwable th = (Throwable) obj2;
        Q0.h.e(c0Var, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        c0Var.f620b.K(new C0120n(th, false));
        return F0.h.f469a;
    }
}
