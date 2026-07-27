package f1;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605F extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f6493k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f6494l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0605F(N n2, C2.a aVar) {
        super(2, aVar);
        this.f6494l = n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0605F) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0605F(this.f6494l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6493k;
        N n2 = this.f6494l;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                if (n2.f6525m.w() instanceof O) {
                    return n2.f6525m.w();
                }
                this.f6493k = 1;
                if (n2.f(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                    return (Y) obj;
                }
                AbstractC1343r.b(obj);
            }
            this.f6493k = 2;
            obj = N.b(n2, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (Y) obj;
        } catch (Throwable th) {
            return new Q(th, -1);
        }
    }
}
