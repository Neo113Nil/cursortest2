package s2;

import a2.AbstractC1241b;
import kotlin.Unit;
import r2.InterfaceC3397g;

/* loaded from: classes3.dex */
public final class w implements InterfaceC3397g {

    /* renamed from: b, reason: collision with root package name */
    private final q2.u f46031b;

    public w(q2.u uVar) {
        this.f46031b = uVar;
    }

    @Override // r2.InterfaceC3397g
    public Object emit(Object obj, kotlin.coroutines.d dVar) {
        Object s4 = this.f46031b.s(obj, dVar);
        return s4 == AbstractC1241b.f() ? s4 : Unit.f41027a;
    }
}
