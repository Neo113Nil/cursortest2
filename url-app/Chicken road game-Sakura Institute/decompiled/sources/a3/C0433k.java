package a3;

import W2.InterfaceC0302y;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: a3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433k extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f4962k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f4963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0331g f4964m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4965n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0433k(o oVar, InterfaceC0331g interfaceC0331g, Object obj, C2.a aVar) {
        super(2, aVar);
        this.f4963l = oVar;
        this.f4964m = interfaceC0331g;
        this.f4965n = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0433k) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0433k(this.f4963l, this.f4964m, this.f4965n, aVar);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [E2.j, L2.c] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f4962k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            ?? r4 = this.f4963l.f4980k;
            this.f4962k = 1;
            if (r4.g(this.f4964m, this.f4965n, this) == aVar) {
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
