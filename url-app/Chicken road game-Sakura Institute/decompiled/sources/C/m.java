package C;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class m extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1103k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f1104l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, C2.a aVar) {
        super(2, aVar);
        this.f1104l = pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((m) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        m mVar = new m(this.f1104l, aVar);
        mVar.f1103k = obj;
        return mVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f1103k;
        p pVar = this.f1104l;
        W2.B.m(interfaceC0302y, null, null, new j(pVar, null), 3);
        W2.B.m(interfaceC0302y, null, null, new k(pVar, null), 3);
        return W2.B.m(interfaceC0302y, null, null, new l(pVar, null), 3);
    }
}
