package t1;

import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import Z2.S;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s1.C1193i;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class l extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f10668k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f10669l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q.v f10670m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC0191c0 interfaceC0191c0, p pVar, Q.v vVar, C2.a aVar) {
        super(2, aVar);
        this.f10668k = interfaceC0191c0;
        this.f10669l = pVar;
        this.f10670m = vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((l) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new l(this.f10668k, this.f10669l, this.f10670m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        for (C1193i c1193i : (Set) this.f10668k.getValue()) {
            p pVar = this.f10669l;
            if (!((List) ((S) pVar.b().f10531e.f4611d).getValue()).contains(c1193i) && !this.f10670m.contains(c1193i)) {
                pVar.b().b(c1193i);
            }
        }
        return Unit.f7487a;
    }
}
