package f1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class K extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f6505k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6506l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f6507m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n2, C2.a aVar) {
        super(2, aVar);
        this.f6507m = n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((K) j((C2.a) obj2, (P) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        K k4 = new K(this.f6507m, aVar);
        k4.f6506l = obj;
        return k4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6505k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            P p4 = (P) this.f6506l;
            this.f6505k = 1;
            if (N.a(this.f6507m, p4, this) == aVar) {
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
