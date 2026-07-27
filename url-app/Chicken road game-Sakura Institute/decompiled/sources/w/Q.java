package w;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class Q extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11079k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0802C f11080l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f11081m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(C0802C c0802c, Y y4, C2.a aVar) {
        super(2, aVar);
        this.f11080l = c0802c;
        this.f11081m = y4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((Q) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new Q(this.f11080l, this.f11081m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f11079k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f11079k = 1;
            Object g4 = m3.z.g(this.f11080l, new V(this.f11081m, null), this);
            if (g4 != obj2) {
                g4 = Unit.f7487a;
            }
            if (g4 == obj2) {
                return obj2;
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
