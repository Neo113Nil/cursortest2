package x;

import kotlin.jvm.functions.Function0;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f10197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10198e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j2.g f10199i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function0 f10200r;

    public k(x xVar, boolean z10, j2.g gVar, Function0 function0) {
        this.f10197d = xVar;
        this.f10198e = z10;
        this.f10199i = gVar;
        this.f10200r = function0;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        i0 i0Var = (i0) obj2;
        ((Number) obj3).intValue();
        i0Var.W(-1525724089);
        Object L = i0Var.L();
        if (L == n0.k.f6729a) {
            L = new z.f();
            i0Var.g0(L);
        }
        z.f fVar = (z.f) L;
        n0.v vVar = u.f10212a;
        x xVar = this.f10197d;
        d1.l c10 = (xVar == null ? d1.i.f3304a : new v(fVar, xVar)).c(new i(fVar, null, this.f10198e, this.f10199i, this.f10200r));
        i0Var.p(false);
        return c10;
    }
}
