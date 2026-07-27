package l;

import G.C0192d;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class k0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public float f7786k;

    /* renamed from: l, reason: collision with root package name */
    public int f7787l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7788m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m0 f7789n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, C2.a aVar) {
        super(2, aVar);
        this.f7789n = m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((k0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        k0 k0Var = new k0(this.f7789n, aVar);
        k0Var.f7788m = obj;
        return k0Var;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        float h4;
        InterfaceC0302y interfaceC0302y;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7787l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y2 = (InterfaceC0302y) this.f7788m;
            h4 = AbstractC0779e.h(interfaceC0302y2.q());
            interfaceC0302y = interfaceC0302y2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h4 = this.f7786k;
            interfaceC0302y = (InterfaceC0302y) this.f7788m;
            AbstractC1343r.b(obj);
        }
        while (W2.B.k(interfaceC0302y)) {
            E.i iVar = new E.i(this.f7789n, h4);
            this.f7788m = interfaceC0302y;
            this.f7786k = h4;
            this.f7787l = 1;
            CoroutineContext coroutineContext = this.f2311e;
            Intrinsics.c(coroutineContext);
            if (C0192d.F(coroutineContext).f(iVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f7487a;
    }
}
