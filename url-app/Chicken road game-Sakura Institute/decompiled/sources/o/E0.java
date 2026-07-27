package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class E0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8613k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L2.c f8614l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q f8615m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.s f8616n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(L2.c cVar, Q q2, l0.s sVar, C2.a aVar) {
        super(2, aVar);
        this.f8614l = cVar;
        this.f8615m = q2;
        this.f8616n = sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((E0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new E0(this.f8614l, this.f8615m, this.f8616n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8613k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Y.c cVar = new Y.c(this.f8616n.f7925c);
            this.f8613k = 1;
            if (this.f8614l.g(this.f8615m, cVar, this) == aVar) {
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
