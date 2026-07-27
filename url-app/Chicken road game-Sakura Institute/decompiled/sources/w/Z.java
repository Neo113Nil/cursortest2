package w;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class Z extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11129k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y.n f11130l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(y.n nVar, C2.a aVar) {
        super(2, aVar);
        this.f11130l = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((Z) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new Z(this.f11130l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f11129k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f11129k = 1;
            y.n nVar = this.f11130l;
            nVar.getClass();
            Object d4 = W2.B.d(new y.m(nVar, null), this);
            if (d4 != obj2) {
                d4 = Unit.f7487a;
            }
            if (d4 == obj2) {
                return obj2;
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
