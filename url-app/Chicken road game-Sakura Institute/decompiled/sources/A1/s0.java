package A1;

import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class s0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q.v f664k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q.v f665l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f666m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Q.v vVar, Q.v vVar2, InterfaceC0191c0 interfaceC0191c0, C2.a aVar) {
        super(2, aVar);
        this.f664k = vVar;
        this.f665l = vVar2;
        this.f666m = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((s0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new s0(this.f664k, this.f665l, this.f666m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        Q.v vVar = this.f664k;
        int size = vVar.size();
        InterfaceC0191c0 interfaceC0191c0 = this.f666m;
        if (size != u3.d.g(interfaceC0191c0)) {
            vVar.clear();
            int g4 = u3.d.g(interfaceC0191c0);
            for (int i2 = 0; i2 < g4; i2++) {
                vVar.add(null);
            }
            Q.v vVar2 = this.f665l;
            vVar2.clear();
            int g5 = u3.d.g(interfaceC0191c0);
            for (int i4 = 0; i4 < g5; i4++) {
                vVar2.add(null);
            }
        }
        return Unit.f7487a;
    }
}
