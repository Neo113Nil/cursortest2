package A;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.C0778d;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class L extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f35k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0778d f36l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f37m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C0778d c0778d, long j4, C2.a aVar) {
        super(2, aVar);
        this.f36l = c0778d;
        this.f37m = j4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((L) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new L(this.f36l, this.f37m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f35k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Y.c cVar = new Y.c(this.f37m);
            l.X x2 = O.f48d;
            this.f35k = 1;
            if (C0778d.c(this.f36l, cVar, x2, null, this, 12) == aVar) {
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
