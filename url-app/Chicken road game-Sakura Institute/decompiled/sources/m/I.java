package m;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class I extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8022k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f8023l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j4, C2.a aVar) {
        super(2, aVar);
        this.f8023l = j4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((I) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new I(this.f8023l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8022k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f8022k = 1;
            if (m3.u.i(this.f8023l, null, this) == aVar) {
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
