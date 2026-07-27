package t;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m.C0842o;
import r0.AbstractC1065f;
import r0.a0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class g extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10625k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f10626l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0842o f10627m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, C0842o c0842o, C2.a aVar) {
        super(2, aVar);
        this.f10626l = iVar;
        this.f10627m = c0842o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((g) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new g(this.f10626l, this.f10627m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        InterfaceC1197a interfaceC1197a;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10625k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            i iVar = this.f10626l;
            if (iVar.f3990s) {
                if (iVar.f3978d.f3990s) {
                    interfaceC1197a = (InterfaceC1197a) AbstractC1065f.j(iVar, i.f10633v);
                    if (interfaceC1197a == null) {
                        interfaceC1197a = new j(iVar);
                    }
                } else {
                    interfaceC1197a = null;
                }
                if (interfaceC1197a != null) {
                    a0 u4 = AbstractC1065f.u(iVar);
                    this.f10625k = 1;
                    if (interfaceC1197a.j(u4, this.f10627m, this) == aVar) {
                        return aVar;
                    }
                }
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
