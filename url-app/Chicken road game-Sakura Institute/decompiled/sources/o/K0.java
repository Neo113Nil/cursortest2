package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class K0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8652k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L2.c f8653l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q f8654m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.s f8655n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(L2.c cVar, Q q2, l0.s sVar, C2.a aVar) {
        super(2, aVar);
        this.f8653l = cVar;
        this.f8654m = q2;
        this.f8655n = sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((K0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new K0(this.f8653l, this.f8654m, this.f8655n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8652k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Y.c cVar = new Y.c(this.f8655n.f7925c);
            this.f8652k = 1;
            if (this.f8653l.g(this.f8654m, cVar, this) == aVar) {
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
