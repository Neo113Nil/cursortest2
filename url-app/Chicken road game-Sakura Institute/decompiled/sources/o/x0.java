package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class x0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8900k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2.j f8901l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q f8902m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.s f8903n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(L2.c cVar, Q q2, l0.s sVar, C2.a aVar) {
        super(2, aVar);
        this.f8901l = (E2.j) cVar;
        this.f8902m = q2;
        this.f8903n = sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((x0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E2.j, L2.c] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new x0(this.f8901l, this.f8902m, this.f8903n, aVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E2.j, L2.c] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8900k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Y.c cVar = new Y.c(this.f8903n.f7925c);
            this.f8900k = 1;
            if (this.f8901l.g(this.f8902m, cVar, this) == aVar) {
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
