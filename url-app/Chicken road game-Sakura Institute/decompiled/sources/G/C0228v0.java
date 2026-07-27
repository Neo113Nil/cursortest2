package G;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: G.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228v0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f2945k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2946l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0234y0 f2947m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X f2948n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228v0(C0234y0 c0234y0, X x2, C2.a aVar) {
        super(2, aVar);
        this.f2947m = c0234y0;
        this.f2948n = x2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0228v0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0228v0 c0228v0 = new C0228v0(this.f2947m, this.f2948n, aVar);
        c0228v0.f2946l = obj;
        return c0228v0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f2945k;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
            return Unit.f7487a;
        }
        AbstractC1343r.b(obj);
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f2946l;
        this.f2945k = 1;
        this.f2947m.g(interfaceC0302y, this.f2948n, this);
        return aVar;
    }
}
