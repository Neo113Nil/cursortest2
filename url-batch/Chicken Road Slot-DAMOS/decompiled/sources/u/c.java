package u;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.j1;
import v.u0;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f9483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9484e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f9485i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f9486r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b1.w f9487s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0.d f9488t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z0 z0Var, Object obj, Function1 function1, o oVar, b1.w wVar, x0.d dVar) {
        super(2);
        this.f9483d = z0Var;
        this.f9484e = obj;
        this.f9485i = function1;
        this.f9486r = oVar;
        this.f9487s = wVar;
        this.f9488t = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n0.i0 i0Var = (n0.i0) obj;
        int intValue = ((Number) obj2).intValue();
        if (i0Var.O(intValue & 1, (intValue & 3) != 2)) {
            Object L = i0Var.L();
            Function1 function1 = this.f9485i;
            o oVar = this.f9486r;
            n0.e eVar = n0.k.f6729a;
            if (L == eVar) {
                L = (v) function1.invoke(oVar);
                i0Var.g0(L);
            }
            v vVar = (v) L;
            z0 z0Var = this.f9483d;
            u0 f3 = z0Var.f();
            j1 j1Var = z0Var.f9920d;
            Object c10 = f3.c();
            Object obj3 = this.f9484e;
            boolean g = i0Var.g(Intrinsics.a(c10, obj3));
            Object L2 = i0Var.L();
            if (g || L2 == eVar) {
                L2 = Intrinsics.a(z0Var.f().c(), obj3) ? i0.f9518b : ((v) function1.invoke(oVar)).f9552b;
                i0Var.g0(L2);
            }
            i0 i0Var2 = (i0) L2;
            Object L3 = i0Var.L();
            if (L3 == eVar) {
                L3 = new j(Intrinsics.a(obj3, j1Var.getValue()));
                i0Var.g0(L3);
            }
            j jVar = (j) L3;
            h0 h0Var = vVar.f9551a;
            boolean h10 = i0Var.h(vVar);
            Object L4 = i0Var.L();
            if (h10 || L4 == eVar) {
                L4 = new a(vVar);
                i0Var.g0(L4);
            }
            d1.l j = a2.q.j((vd.n) L4);
            jVar.f9521a.setValue(Boolean.valueOf(Intrinsics.a(obj3, j1Var.getValue())));
            d1.l c11 = j.c(jVar);
            boolean h11 = i0Var.h(obj3);
            Object L5 = i0Var.L();
            if (h11 || L5 == eVar) {
                L5 = new a3.e(23, obj3);
                i0Var.g0(L5);
            }
            Function1 function12 = (Function1) L5;
            boolean f10 = i0Var.f(i0Var2);
            Object L6 = i0Var.L();
            if (f10 || L6 == eVar) {
                L6 = new b3.e(6, i0Var2);
                i0Var.g0(L6);
            }
            r.a(this.f9483d, function12, c11, h0Var, i0Var2, (Function2) L6, x0.i.d(-143346359, new b(this.f9487s, obj3, oVar, this.f9488t), i0Var), i0Var, 12582912);
        } else {
            i0Var.R();
        }
        return Unit.f5554a;
    }
}
