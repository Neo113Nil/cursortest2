package v;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n0.j1;
import n0.w1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 extends nd.i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9741d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f9742e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f9743i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f9744r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z0 f9745s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h0 h0Var, Object obj, z0 z0Var, ld.a aVar) {
        super(1, aVar);
        this.f9743i = h0Var;
        this.f9744r = obj;
        this.f9745s = z0Var;
    }

    @Override // nd.a
    public final ld.a create(ld.a aVar) {
        switch (this.f9741d) {
            case 0:
                return new b0(this.f9745s, this.f9743i, this.f9744r, aVar);
            default:
                return new b0(this.f9743i, this.f9744r, this.f9745s, aVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ld.a aVar = (ld.a) obj;
        switch (this.f9741d) {
        }
        return ((b0) create(aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9741d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f9742e;
                z0 z0Var = this.f9745s;
                if (i3 == 0) {
                    cf.c.M(obj);
                    w1 w1Var = new w1(this.f9743i, this.f9744r, z0Var, (ld.a) null);
                    this.f9742e = 1;
                    if (ge.a0.h(w1Var, this) == aVar) {
                    }
                } else if (i3 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                z0Var.i();
                break;
            default:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f9742e;
                z0 z0Var2 = this.f9745s;
                if (i10 == 0) {
                    cf.c.M(obj);
                    h0 h0Var = this.f9743i;
                    h0Var.y();
                    j1 j1Var = h0Var.f9808e;
                    h0Var.A = Long.MIN_VALUE;
                    h0Var.C(0.0f);
                    Object value = h0Var.f9809i.getValue();
                    Object obj2 = this.f9744r;
                    float f3 = obj2.equals(value) ? -4.0f : obj2.equals(j1Var.getValue()) ? -5.0f : -3.0f;
                    z0Var2.p(obj2);
                    z0Var2.n(0L);
                    j1Var.setValue(obj2);
                    h0Var.C(0.0f);
                    h0Var.p(obj2);
                    z0Var2.j(f3);
                    if (f3 == -3.0f) {
                        this.f9742e = 1;
                        if (h0.w(h0Var, this) == aVar2) {
                        }
                    }
                } else if (i10 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                z0Var2.i();
                break;
        }
        return Unit.f5554a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z0 z0Var, h0 h0Var, Object obj, ld.a aVar) {
        super(1, aVar);
        this.f9745s = z0Var;
        this.f9743i = h0Var;
        this.f9744r = obj;
    }
}
