package k;

import D.C0127e0;
import G.C0215o0;
import G.InterfaceC0191c0;
import G.U0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.m0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class p extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f7316k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7317l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0 f7318m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f7319n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m0 m0Var, InterfaceC0191c0 interfaceC0191c0, C2.a aVar) {
        super(2, aVar);
        this.f7318m = m0Var;
        this.f7319n = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((p) j((C2.a) obj2, (C0215o0) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        p pVar = new p(this.f7318m, this.f7319n, aVar);
        pVar.f7317l = obj;
        return pVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7316k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0215o0 c0215o0 = (C0215o0) this.f7317l;
            m0 m0Var = this.f7318m;
            Z2.C c4 = new Z2.C(new U0(new C0749o(m0Var, 0), null));
            C0127e0 c0127e0 = new C0127e0(c0215o0, m0Var, this.f7319n, 4);
            this.f7316k = 1;
            if (c4.e(c0127e0, this) == aVar) {
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
