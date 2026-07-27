package A;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class c0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f113k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w.Y f115m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(w.Y y4, C2.a aVar) {
        super(2, aVar);
        this.f115m = y4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((c0) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        c0 c0Var = new c0(this.f115m, aVar);
        c0Var.f114l = obj;
        return c0Var;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f113k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = (C0802C) this.f114l;
            this.f113k = 1;
            Object d4 = W2.B.d(new w.T(c0802c, this.f115m, null), this);
            if (d4 != obj2) {
                d4 = Unit.f7487a;
            }
            if (d4 == obj2) {
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
