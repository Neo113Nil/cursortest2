package G;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class R0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f2746k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z2.D f2747l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0215o0 f2748m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(Z2.D d4, C0215o0 c0215o0, C2.a aVar) {
        super(2, aVar);
        this.f2747l = d4;
        this.f2748m = c0215o0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((R0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new R0(this.f2747l, this.f2748m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f2746k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Q0 q02 = new Q0(this.f2748m, 1);
            this.f2746k = 1;
            if (this.f2747l.e(q02, this) == aVar) {
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
