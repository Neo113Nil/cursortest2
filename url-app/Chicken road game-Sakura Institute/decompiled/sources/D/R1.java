package D;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class R1 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1614k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S1 f1615l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(S1 s12, C2.a aVar) {
        super(2, aVar);
        this.f1615l = s12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((R1) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new R1(this.f1615l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1614k;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
            return Unit.f7487a;
        }
        AbstractC1343r.b(obj);
        M2.C c4 = new M2.C();
        S1 s12 = this.f1615l;
        Z2.G g4 = s12.f1619t.f8972a;
        A.M m4 = new A.M(c4, 3, s12);
        this.f1614k = 1;
        g4.getClass();
        Z2.G.m(g4, m4, this);
        return aVar;
    }
}
