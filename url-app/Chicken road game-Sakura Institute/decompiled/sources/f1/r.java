package f1;

import W2.EnumC0303z;
import W2.r0;
import Z2.C0335k;
import c.C0524d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class r extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f6613k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6614l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f6615m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(N n2, C2.a aVar) {
        super(2, aVar);
        this.f6615m = n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((r) j((C2.a) obj2, (Y2.q) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        r rVar = new r(this.f6615m, aVar);
        rVar.f6614l = obj;
        return rVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6613k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Y2.q qVar = (Y2.q) this.f6614l;
            EnumC0303z enumC0303z = EnumC0303z.f4305e;
            N n2 = this.f6615m;
            r0 m4 = W2.B.m(qVar, null, enumC0303z, new C0623q(n2, null), 1);
            C0335k c0335k = new C0335k(new E.e(new C0621o(m4, null), 1, n2.f6523k), new C0524d(m4, null, 1));
            Z2.r rVar = new Z2.r(1, qVar);
            this.f6613k = 1;
            if (c0335k.e(rVar, this) == aVar) {
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
