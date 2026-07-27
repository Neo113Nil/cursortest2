package C;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class o extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1107k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f1108l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, C2.a aVar) {
        super(2, aVar);
        this.f1108l = pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((o) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        o oVar = new o(this.f1108l, aVar);
        oVar.f1107k = obj;
        return oVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        return W2.B.m((InterfaceC0302y) this.f1107k, null, null, new n(this.f1108l, null), 3);
    }
}
