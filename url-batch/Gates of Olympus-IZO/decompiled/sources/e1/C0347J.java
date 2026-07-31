package e1;

import java.util.concurrent.CancellationException;
import k2.C0544p;

/* renamed from: e1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347J extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final C0347J f4624e = new C0347J(2);

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        P p = (P) obj;
        Throwable th = (Throwable) obj2;
        Z1.i.f(p, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        p.f4652b.R(new C0544p(th, false));
        return L1.z.f2729a;
    }
}
