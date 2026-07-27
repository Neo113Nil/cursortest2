package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class D0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8609k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f8610l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(Q q2, C2.a aVar) {
        super(2, aVar);
        this.f8610l = q2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((D0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new D0(this.f8610l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8609k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f8609k = 1;
            if (this.f8610l.a(this) == aVar) {
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
