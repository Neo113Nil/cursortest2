package u;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f9542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f9543e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1.l f9544i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f9545r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0 f9546s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f9547t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x0.d f9548u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z0 z0Var, Function1 function1, d1.l lVar, h0 h0Var, i0 i0Var, Function2 function2, x0.d dVar, int i3) {
        super(2);
        this.f9542d = z0Var;
        this.f9543e = function1;
        this.f9544i = lVar;
        this.f9545r = h0Var;
        this.f9546s = i0Var;
        this.f9547t = function2;
        this.f9548u = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int z10 = n0.h.z(12582913);
        r.a(this.f9542d, this.f9543e, this.f9544i, this.f9545r, this.f9546s, this.f9547t, this.f9548u, (n0.i0) obj, z10);
        return Unit.f5554a;
    }
}
