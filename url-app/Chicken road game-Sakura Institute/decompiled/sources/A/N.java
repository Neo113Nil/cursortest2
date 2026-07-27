package A;

import G.U0;
import G.X0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.C0778d;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class N extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f41k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f42l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X0 f43m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0778d f44n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(X0 x02, C0778d c0778d, C2.a aVar) {
        super(2, aVar);
        this.f43m = x02;
        this.f44n = c0778d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((N) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        N n2 = new N(this.f43m, this.f44n, aVar);
        n2.f42l = obj;
        return n2;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f41k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f42l;
            Z2.C c4 = new Z2.C(new U0(new K(this.f43m, 0), null));
            M m4 = new M(this.f44n, 0, interfaceC0302y);
            this.f41k = 1;
            if (c4.e(m4, this) == aVar) {
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
