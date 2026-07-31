package r2;

import a2.AbstractC1241b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class w extends AbstractC3391a {

    /* renamed from: b, reason: collision with root package name */
    private final Function2 f43620b;

    public w(Function2 function2) {
        this.f43620b = function2;
    }

    @Override // r2.AbstractC3391a
    public Object g(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        Object invoke = this.f43620b.invoke(interfaceC3397g, dVar);
        return invoke == AbstractC1241b.f() ? invoke : Unit.f41027a;
    }
}
