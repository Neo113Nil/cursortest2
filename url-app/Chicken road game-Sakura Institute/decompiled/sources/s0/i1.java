package s0;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class i1 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10238k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l1 f10239l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(l1 l1Var, C2.a aVar) {
        super(2, aVar);
        this.f10239l = l1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((i1) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new i1(this.f10239l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10238k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C1166s c1166s = this.f10239l.f10258d;
            this.f10238k = 1;
            Object d4 = c1166s.f10370s.d(this);
            if (d4 != aVar) {
                d4 = Unit.f7487a;
            }
            if (d4 == aVar) {
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
