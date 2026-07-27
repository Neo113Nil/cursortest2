package f1;

import W2.r0;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621o extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r0 f6609k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0621o(r0 r0Var, C2.a aVar) {
        super(2, aVar);
        this.f6609k = r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0621o) j((C2.a) obj2, (InterfaceC0331g) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0621o(this.f6609k, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        this.f6609k.h();
        return Unit.f7487a;
    }
}
