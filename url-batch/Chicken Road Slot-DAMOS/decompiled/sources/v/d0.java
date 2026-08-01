package v;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f9771d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9772e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9773i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f9774r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f9775s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z0 f9776t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f9777u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Object obj, Object obj2, h0 h0Var, z0 z0Var, float f3, ld.a aVar) {
        super(2, aVar);
        this.f9773i = obj;
        this.f9774r = obj2;
        this.f9775s = h0Var;
        this.f9776t = z0Var;
        this.f9777u = f3;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        d0 d0Var = new d0(this.f9773i, this.f9774r, this.f9775s, this.f9776t, this.f9777u, aVar);
        d0Var.f9772e = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f6622d;
        int i3 = this.f9771d;
        h0 h0Var = this.f9775s;
        if (i3 == 0) {
            cf.c.M(obj);
            ge.x xVar = (ge.x) this.f9772e;
            Object obj2 = this.f9773i;
            Object obj3 = this.f9774r;
            if (Intrinsics.a(obj2, obj3)) {
                h0Var.C = null;
                if (Intrinsics.a(h0Var.f9809i.getValue(), obj2)) {
                    return Unit.f5554a;
                }
            } else {
                h0.t(h0Var);
            }
            boolean a9 = Intrinsics.a(obj2, obj3);
            float f3 = this.f9777u;
            if (!a9) {
                z0 z0Var = this.f9776t;
                z0Var.p(obj2);
                z0Var.n(0L);
                h0Var.f9808e.setValue(obj2);
                z0Var.j(f3);
            }
            h0Var.C(f3);
            if (h0Var.B.i()) {
                ge.a0.s(xVar, null, new b5.d0(h0Var, null, 9), 3);
            } else {
                h0Var.A = Long.MIN_VALUE;
            }
            this.f9771d = 1;
            if (h0.w(h0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
        }
        h0Var.B();
        return Unit.f5554a;
    }
}
