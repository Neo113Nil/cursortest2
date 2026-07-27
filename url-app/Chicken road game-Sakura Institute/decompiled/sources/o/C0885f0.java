package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885f0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8764k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8765l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f8766m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0885f0(C0891i0 c0891i0, long j4, C2.a aVar) {
        super(2, aVar);
        this.f8765l = c0891i0;
        this.f8766m = j4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0885f0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0885f0(this.f8765l, this.f8766m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8764k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0908r0 c0908r0 = this.f8765l.f8791I;
            m.b0 b0Var = m.b0.f8080e;
            C0883e0 c0883e0 = new C0883e0(this.f8766m, null);
            this.f8764k = 1;
            if (c0908r0.e(b0Var, c0883e0, this) == aVar) {
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
