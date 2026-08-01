package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q2 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3512d;

    /* renamed from: e, reason: collision with root package name */
    public int f3513e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r2 f3514i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(r2 r2Var, ld.a aVar, int i3) {
        super(2, aVar);
        this.f3512d = i3;
        this.f3514i = r2Var;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f3512d) {
            case 0:
                return new q2(this.f3514i, aVar, 0);
            default:
                return new q2(this.f3514i, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ge.x xVar = (ge.x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f3512d) {
        }
        return ((q2) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3512d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f3513e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    v vVar = this.f3514i.f3523d;
                    this.f3513e = 1;
                    Object f3 = vVar.M.f(this);
                    if (f3 != aVar) {
                        f3 = Unit.f5554a;
                    }
                    if (f3 == aVar) {
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
                int i10 = this.f3513e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    v vVar2 = this.f3514i.f3523d;
                    this.f3513e = 1;
                    Object b10 = vVar2.N.b(this);
                    if (b10 != aVar2) {
                        b10 = Unit.f5554a;
                    }
                    if (b10 == aVar2) {
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
