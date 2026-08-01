package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k2 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6740d;

    /* renamed from: e, reason: collision with root package name */
    public int f6741e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6742i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function2 f6743r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z0 f6744s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Function2 function2, z0 z0Var, ld.a aVar, int i3) {
        super(2, aVar);
        this.f6740d = i3;
        this.f6743r = function2;
        this.f6744s = z0Var;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f6740d) {
            case 0:
                k2 k2Var = new k2(this.f6743r, this.f6744s, aVar, 0);
                k2Var.f6742i = obj;
                return k2Var;
            default:
                k2 k2Var2 = new k2(this.f6743r, this.f6744s, aVar, 1);
                k2Var2.f6742i = obj;
                return k2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ge.x xVar = (ge.x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f6740d) {
        }
        return ((k2) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6740d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f6741e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    o1 o1Var = new o1(this.f6744s, ((ge.x) this.f6742i).h());
                    this.f6741e = 1;
                    if (this.f6743r.invoke(o1Var, this) == aVar) {
                    }
                } else if (i3 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
            default:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f6741e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    o1 o1Var2 = new o1(this.f6744s, ((ge.x) this.f6742i).h());
                    this.f6741e = 1;
                    if (this.f6743r.invoke(o1Var2, this) == aVar2) {
                    }
                } else if (i10 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
        }
        return Unit.f5554a;
    }
}
