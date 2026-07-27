package M;

import D4.C0016p;
import java.util.concurrent.CancellationException;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.j implements InterfaceC1445p {

    /* renamed from: e, reason: collision with root package name */
    public static final L f1598e = new L(2);

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        c0 msg = (c0) obj;
        Throwable th = (Throwable) obj2;
        kotlin.jvm.internal.i.e(msg, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        msg.f1664b.L(new C0016p(th, false));
        return f4.v.f5689a;
    }
}
