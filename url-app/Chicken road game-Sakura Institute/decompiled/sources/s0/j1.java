package s0;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class j1 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10243k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l1 f10244l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, C2.a aVar) {
        super(2, aVar);
        this.f10244l = l1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((j1) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new j1(this.f10244l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10243k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C1166s c1166s = this.f10244l.f10258d;
            this.f10243k = 1;
            Object c4 = c1166s.f10372t.c(this);
            if (c4 != aVar) {
                c4 = Unit.f7487a;
            }
            if (c4 == aVar) {
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
