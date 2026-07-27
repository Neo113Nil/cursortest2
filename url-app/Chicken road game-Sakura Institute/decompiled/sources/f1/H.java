package f1;

import W2.C0292n;
import Z2.InterfaceC0330f;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class H extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f6498k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f6499l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(N n2, C2.a aVar) {
        super(2, aVar);
        this.f6499l = n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((H) j((C2.a) obj2, (InterfaceC0331g) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new H(this.f6499l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6498k;
        N n2 = this.f6499l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Y0.b bVar = n2.f6526n;
            this.f6498k = 1;
            Object h02 = ((C0292n) bVar.f4391j).h0(this);
            if (h02 != aVar) {
                h02 = Unit.f7487a;
            }
            if (h02 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                return Unit.f7487a;
            }
            AbstractC1343r.b(obj);
        }
        InterfaceC0330f f4 = Z2.H.f(n2.e().f6556c, -1);
        Z2.r rVar = new Z2.r(3, n2);
        this.f6498k = 2;
        if (f4.e(rVar, this) == aVar) {
            return aVar;
        }
        return Unit.f7487a;
    }
}
