package a3;

import M2.E;
import W2.InterfaceC0302y;
import Z2.InterfaceC0330f;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class n extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f4976k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4977l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f4978m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0331g f4979n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC0331g interfaceC0331g, C2.a aVar) {
        super(2, aVar);
        this.f4978m = oVar;
        this.f4979n = interfaceC0331g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((n) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        n nVar = new n(this.f4978m, this.f4979n, aVar);
        nVar.f4977l = obj;
        return nVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f4976k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f4977l;
            E e4 = new E();
            o oVar = this.f4978m;
            InterfaceC0330f interfaceC0330f = oVar.f4961j;
            m mVar = new m(e4, interfaceC0302y, oVar, this.f4979n, 0);
            this.f4976k = 1;
            if (interfaceC0330f.e(mVar, this) == aVar) {
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
