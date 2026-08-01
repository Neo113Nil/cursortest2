package a3;

import d2.c1;
import d2.d1;
import d2.k1;
import d2.q2;
import d2.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f247e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f248i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f249r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r2 r2Var, c1 c1Var, Function2 function2) {
        super(2);
        this.f246d = 3;
        this.f247e = r2Var;
        this.f248i = c1Var;
        this.f249r = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f246d) {
            case 0:
                ((Number) obj2).intValue();
                o.b((Function1) this.f247e, (d1.l) this.f249r, (Function1) this.f248i, (i0) obj, n0.h.z(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                k7.e.b((Function0) this.f247e, (b3.o) this.f248i, (x0.d) this.f249r, (i0) obj, n0.h.z(385));
                break;
            case 2:
                ((Number) obj2).intValue();
                d1.a((d2.v) this.f247e, (k1) this.f248i, (Function2) this.f249r, (i0) obj, n0.h.z(1));
                break;
            default:
                i0 i0Var = (i0) obj;
                int intValue = ((Number) obj2).intValue();
                r2 r2Var = (r2) this.f247e;
                if (i0Var.O(intValue & 1, (intValue & 3) != 2)) {
                    d2.v vVar = r2Var.f3523d;
                    boolean h10 = i0Var.h(r2Var);
                    Object L = i0Var.L();
                    ld.a aVar = null;
                    n0.e eVar = n0.k.f6729a;
                    if (h10 || L == eVar) {
                        L = new q2(r2Var, aVar, 0);
                        i0Var.g0(L);
                    }
                    n0.h.f(vVar, (Function2) L, i0Var);
                    boolean h11 = i0Var.h(r2Var);
                    Object L2 = i0Var.L();
                    if (h11 || L2 == eVar) {
                        L2 = new q2(r2Var, aVar, 1);
                        i0Var.g0(L2);
                    }
                    n0.h.f(vVar, (Function2) L2, i0Var);
                    ((c1) this.f248i).a(vVar, (Function2) this.f249r, i0Var, 0);
                } else {
                    i0Var.R();
                }
                break;
        }
        return Unit.f5554a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, Function2 function2, int i3, int i10) {
        super(2);
        this.f246d = i10;
        this.f247e = obj;
        this.f248i = obj2;
        this.f249r = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Function1 function1, d1.l lVar, Function1 function12, int i3) {
        super(2);
        this.f246d = 0;
        this.f247e = function1;
        this.f249r = lVar;
        this.f248i = function12;
    }
}
