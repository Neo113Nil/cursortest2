package s0;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;
import y2.C1333h;

/* loaded from: classes.dex */
public final class c1 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10183k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z2.P f10184l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1173v0 f10185m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Z2.P p4, C1173v0 c1173v0, C2.a aVar) {
        super(2, aVar);
        this.f10184l = p4;
        this.f10185m = c1173v0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((c1) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new c1(this.f10184l, this.f10185m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10183k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Z2.r rVar = new Z2.r(4, this.f10185m);
            this.f10183k = 1;
            if (this.f10184l.e(rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        throw new C1333h();
    }
}
