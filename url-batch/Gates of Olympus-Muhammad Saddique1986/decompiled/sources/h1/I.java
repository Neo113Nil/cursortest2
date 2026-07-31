package h1;

import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import q2.C0829p;

/* loaded from: classes.dex */
public final class I extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public static final I f6077e = new I(2);

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        O o3 = (O) obj;
        Throwable th = (Throwable) obj2;
        f2.j.f(o3, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        o3.f6105b.V(new C0829p(th, false));
        return R1.y.f4171a;
    }
}
