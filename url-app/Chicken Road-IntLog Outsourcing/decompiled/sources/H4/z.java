package H4;

import k4.InterfaceC1218d;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class z implements G4.e {

    /* renamed from: a, reason: collision with root package name */
    public final F4.q f1211a;

    public z(F4.q qVar) {
        this.f1211a = qVar;
    }

    @Override // G4.e
    public final Object b(Object obj, InterfaceC1218d interfaceC1218d) {
        Object i2 = ((F4.p) this.f1211a).f739d.i(obj, interfaceC1218d);
        return i2 == EnumC1260a.f11058a ? i2 : f4.v.f5689a;
    }
}
