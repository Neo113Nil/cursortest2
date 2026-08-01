package v;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 extends nd.i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f9786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9787e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9788i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f9789r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z0 f9790s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f9791t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Object obj, Object obj2, h0 h0Var, z0 z0Var, float f3, ld.a aVar) {
        super(1, aVar);
        this.f9787e = obj;
        this.f9788i = obj2;
        this.f9789r = h0Var;
        this.f9790s = z0Var;
        this.f9791t = f3;
    }

    @Override // nd.a
    public final ld.a create(ld.a aVar) {
        return new e0(this.f9787e, this.f9788i, this.f9789r, this.f9790s, this.f9791t, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e0) create((ld.a) obj)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f6622d;
        int i3 = this.f9786d;
        if (i3 == 0) {
            cf.c.M(obj);
            d0 d0Var = new d0(this.f9787e, this.f9788i, this.f9789r, this.f9790s, this.f9791t, null);
            this.f9786d = 1;
            if (ge.a0.h(d0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
        }
        return Unit.f5554a;
    }
}
