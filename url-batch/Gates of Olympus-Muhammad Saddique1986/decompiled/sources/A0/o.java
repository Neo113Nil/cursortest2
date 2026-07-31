package A0;

import e2.InterfaceC0424c;
import t0.E;

/* loaded from: classes.dex */
public final class o extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public static final o f138e = new o(1);

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        i o3 = ((E) obj).o();
        boolean z3 = false;
        if (o3 != null && o3.f130e) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
