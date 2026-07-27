package A1;

import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class t0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f697k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f698l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f699m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, C2.a aVar) {
        super(2, aVar);
        this.f698l = interfaceC0191c0;
        this.f699m = interfaceC0191c02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((t0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new t0(this.f698l, this.f699m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f697k;
        if (i2 != 0 && i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1343r.b(obj);
        do {
            InterfaceC0191c0 interfaceC0191c0 = this.f698l;
            if (((Long) interfaceC0191c0.getValue()) == null) {
                return Unit.f7487a;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l4 = (Long) interfaceC0191c0.getValue();
            Intrinsics.c(l4);
            this.f699m.setValue(Long.valueOf(currentTimeMillis - l4.longValue()));
            this.f697k = 1;
        } while (W2.F.a(16L, this) != aVar);
        return aVar;
    }
}
