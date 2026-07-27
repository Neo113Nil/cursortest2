package C;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.C0778d;
import l.u0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class D extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1044k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f1045l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1046m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u0 f1047n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f4, float f5, u0 u0Var, C2.a aVar) {
        super(2, aVar);
        this.f1045l = f4;
        this.f1046m = f5;
        this.f1047n = u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((D) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new D(this.f1045l, this.f1046m, this.f1047n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1044k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0778d c0778d = (C0778d) this.f1045l.f1053c;
            Float f4 = new Float(this.f1046m);
            this.f1044k = 1;
            if (C0778d.c(c0778d, f4, this.f1047n, null, this, 12) == aVar) {
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
