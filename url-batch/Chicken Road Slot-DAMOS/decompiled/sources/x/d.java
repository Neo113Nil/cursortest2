package x;

import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10181d;

    /* renamed from: e, reason: collision with root package name */
    public int f10182e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f10183i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z.h f10184r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, z.h hVar, ld.a aVar, int i3) {
        super(2, aVar);
        this.f10181d = i3;
        this.f10183i = lVar;
        this.f10184r = hVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f10181d) {
            case 0:
                return new d(this.f10183i, this.f10184r, aVar, 0);
            case 1:
                return new d(this.f10183i, this.f10184r, aVar, 1);
            case 2:
                return new d(this.f10183i, this.f10184r, aVar, 2);
            default:
                return new d(this.f10183i, this.f10184r, aVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ge.x xVar = (ge.x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f10181d) {
        }
        return ((d) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10181d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f10182e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    z.f fVar = this.f10183i.E;
                    if (fVar != null) {
                        z.g gVar = new z.g(this.f10184r);
                        this.f10182e = 1;
                        if (fVar.a(gVar, this) == aVar) {
                        }
                    }
                } else if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
            case 1:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f10182e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    z.f fVar2 = this.f10183i.E;
                    if (fVar2 != null) {
                        z.g gVar2 = new z.g(this.f10184r);
                        this.f10182e = 1;
                        if (fVar2.a(gVar2, this) == aVar2) {
                        }
                    }
                } else if (i10 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
            case 2:
                md.a aVar3 = md.a.f6622d;
                int i11 = this.f10182e;
                if (i11 == 0) {
                    cf.c.M(obj);
                    z.f fVar3 = this.f10183i.E;
                    if (fVar3 != null) {
                        this.f10182e = 1;
                        if (fVar3.a(this.f10184r, this) == aVar3) {
                        }
                    }
                } else if (i11 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
            default:
                md.a aVar4 = md.a.f6622d;
                int i12 = this.f10182e;
                if (i12 == 0) {
                    cf.c.M(obj);
                    z.f fVar4 = this.f10183i.E;
                    if (fVar4 != null) {
                        z.i iVar = new z.i(this.f10184r);
                        this.f10182e = 1;
                        if (fVar4.a(iVar, this) == aVar4) {
                        }
                    }
                } else if (i12 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
        }
        return Unit.f5554a;
    }
}
