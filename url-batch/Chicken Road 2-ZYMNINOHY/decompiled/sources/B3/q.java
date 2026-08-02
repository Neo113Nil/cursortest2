package B3;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class q implements A3.e {

    /* renamed from: a, reason: collision with root package name */
    public final z3.r f249a;

    public q(z3.p pVar) {
        this.f249a = pVar;
    }

    @Override // A3.e
    public final Object emit(Object obj, InterfaceC0425c interfaceC0425c) {
        Object d4 = this.f249a.d((h3.c) interfaceC0425c, obj);
        return d4 == EnumC0441a.f9038a ? d4 : C0297i.f5732a;
    }
}
