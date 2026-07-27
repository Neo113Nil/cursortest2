package n;

import A.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import m3.z;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class e extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8509k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8510l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f8511m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, C2.a aVar) {
        super(2, aVar);
        this.f8511m = oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((e) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        e eVar = new e(this.f8511m, aVar);
        eVar.f8510l = obj;
        return eVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f8509k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = (C0802C) this.f8510l;
            g0 g0Var = new g0(20, this.f8511m);
            this.f8509k = 1;
            Object g4 = z.g(c0802c, new f(g0Var, null), this);
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
