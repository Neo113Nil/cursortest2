package C;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.C0778d;
import l.u0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class E extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1048k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f1049l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u0 f1050m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f4, u0 u0Var, C2.a aVar) {
        super(2, aVar);
        this.f1049l = f4;
        this.f1050m = u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((E) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new E(this.f1049l, this.f1050m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1048k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0778d c0778d = (C0778d) this.f1049l.f1053c;
            Float f4 = new Float(0.0f);
            this.f1048k = 1;
            if (C0778d.c(c0778d, f4, this.f1050m, null, this, 12) == aVar) {
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
