package o4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n4.h f7485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f7486e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.j f7487i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b1.w f7488r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f7489s;

    public m(n4.h hVar, o oVar, a1.j jVar, b1.w wVar, n nVar) {
        this.f7485d = hVar;
        this.f7486e = oVar;
        this.f7487i = jVar;
        this.f7488r = wVar;
        this.f7489s = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && i0Var.A()) {
            i0Var.R();
        } else {
            n4.h hVar = this.f7485d;
            boolean h10 = i0Var.h(hVar);
            o oVar = this.f7486e;
            boolean h11 = h10 | i0Var.h(oVar);
            Object L = i0Var.L();
            if (h11 || L == n0.k.f6729a) {
                L = new a1.g(this.f7488r, hVar, oVar, 2);
                i0Var.g0(L);
            }
            n0.h.d(hVar, (Function1) L, i0Var);
            a.a.d(hVar, this.f7487i, x0.i.d(-497631156, new j0.q(1, this.f7489s, hVar), i0Var), i0Var, 384);
        }
        return Unit.f5554a;
    }
}
