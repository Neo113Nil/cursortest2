package x3;

import d2.r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10401d;

    /* renamed from: e, reason: collision with root package name */
    public int f10402e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f10403i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(z zVar, ld.a aVar, int i3) {
        super(2, aVar);
        this.f10401d = i3;
        this.f10403i = zVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f10401d) {
            case 0:
                return new l(this.f10403i, aVar, 0);
            case 1:
                return new l(this.f10403i, aVar, 1);
            default:
                return new l(this.f10403i, aVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10401d) {
        }
        return ((l) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10401d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f10402e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    this.f10402e = 1;
                    if (z.d(this.f10403i, this) == aVar) {
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
            case 1:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f10402e;
                z zVar = this.f10403i;
                if (i10 == 0) {
                    cf.c.M(obj);
                    c6.n nVar = zVar.f10503w;
                    this.f10402e = 1;
                    Object f02 = ((ge.n) nVar.f1834e).f0(this);
                    if (f02 != aVar2) {
                        f02 = Unit.f5554a;
                    }
                    if (f02 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                je.e f3 = je.b0.f(zVar.i().f10453c, -1);
                r1 r1Var = new r1(5, zVar);
                this.f10402e = 2;
                if (f3.c(r1Var, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f5554a;
            default:
                z zVar2 = this.f10403i;
                a0 a0Var = zVar2.f10502v;
                md.a aVar3 = md.a.f6622d;
                int i11 = this.f10402e;
                try {
                    if (i11 == 0) {
                        cf.c.M(obj);
                        if (a0Var.a() instanceof l0) {
                            return a0Var.a();
                        }
                        this.f10402e = 1;
                        if (z.e(zVar2, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                cf.c.M(obj);
                                return (t0) obj;
                            }
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    this.f10402e = 2;
                    obj = z.f(zVar2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (t0) obj;
                } catch (Throwable th) {
                    return new o0(th, -1);
                }
        }
    }
}
