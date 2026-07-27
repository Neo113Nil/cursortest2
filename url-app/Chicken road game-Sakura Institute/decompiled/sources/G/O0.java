package G;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class O0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f2730k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2731l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f2732m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f2733n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(Function2 function2, InterfaceC0191c0 interfaceC0191c0, C2.a aVar) {
        super(2, aVar);
        this.f2732m = function2;
        this.f2733n = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((O0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        O0 o0 = new O0(this.f2732m, this.f2733n, aVar);
        o0.f2731l = obj;
        return o0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f2730k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0215o0 c0215o0 = new C0215o0(this.f2733n, ((InterfaceC0302y) this.f2731l).q());
            this.f2730k = 1;
            if (this.f2732m.h(c0215o0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
