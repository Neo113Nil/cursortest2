package u;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends wd.p implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1.w f9478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9479e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f9480i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.d f9481r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b1.w wVar, Object obj, o oVar, x0.d dVar) {
        super(3);
        this.f9478d = wVar;
        this.f9479e = obj;
        this.f9480i = oVar;
        this.f9481r = dVar;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj;
        n0.i0 i0Var = (n0.i0) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? i0Var.f(sVar) : i0Var.h(sVar) ? 4 : 2;
        }
        if (i0Var.O(intValue & 1, (intValue & 19) != 18)) {
            b1.w wVar = this.f9478d;
            boolean f3 = i0Var.f(wVar);
            Object obj4 = this.f9479e;
            boolean h10 = f3 | i0Var.h(obj4);
            o oVar = this.f9480i;
            boolean h11 = h10 | i0Var.h(oVar);
            Object L = i0Var.L();
            n0.e eVar = n0.k.f6729a;
            if (h11 || L == eVar) {
                L = new a3.i(wVar, obj4, oVar, 3);
                i0Var.g0(L);
            }
            n0.h.d(sVar, (Function1) L, i0Var);
            s.h0 h0Var = oVar.f9539d;
            sVar.getClass();
            h0Var.m(obj4, ((t) sVar).f9549a);
            Object L2 = i0Var.L();
            if (L2 == eVar) {
                L2 = new i();
                i0Var.g0(L2);
            }
            this.f9481r.c((i) L2, obj4, i0Var, 0);
        } else {
            i0Var.R();
        }
        return Unit.f5554a;
    }
}
