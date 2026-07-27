package f1;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;
import y2.C1333h;

/* renamed from: f1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623q extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f6611k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f6612l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0623q(N n2, C2.a aVar) {
        super(2, aVar);
        this.f6612l = n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((C0623q) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0623q(this.f6612l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6611k;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
            throw new C1333h();
        }
        AbstractC1343r.b(obj);
        Z2.A a4 = this.f6612l.f6522j;
        C0622p c0622p = C0622p.f6610d;
        this.f6611k = 1;
        a4.f4610d.e(c0622p, this);
        return aVar;
    }
}
