package x;

import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10172d;

    /* renamed from: e, reason: collision with root package name */
    public int f10173e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z.f f10174i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z.h f10175r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z.h hVar, z.f fVar, ld.a aVar) {
        super(2, aVar);
        this.f10172d = 0;
        this.f10175r = hVar;
        this.f10174i = fVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f10172d) {
            case 0:
                return new b(this.f10175r, this.f10174i, aVar);
            case 1:
                return new b(this.f10174i, this.f10175r, aVar, 1);
            default:
                return new b(this.f10174i, this.f10175r, aVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ge.x xVar = (ge.x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f10172d) {
        }
        return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10172d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f10173e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    z.i iVar = new z.i(this.f10175r);
                    this.f10173e = 1;
                    if (this.f10174i.a(iVar, this) == aVar) {
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
                int i10 = this.f10173e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    this.f10173e = 1;
                    if (this.f10174i.a(this.f10175r, this) == aVar2) {
                    }
                } else if (i10 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
            default:
                md.a aVar3 = md.a.f6622d;
                int i11 = this.f10173e;
                if (i11 == 0) {
                    cf.c.M(obj);
                    this.f10173e = 1;
                    if (this.f10174i.a(this.f10175r, this) == aVar3) {
                    }
                } else if (i11 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
        }
        return Unit.f5554a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(z.f fVar, z.h hVar, ld.a aVar, int i3) {
        super(2, aVar);
        this.f10172d = i3;
        this.f10174i = fVar;
        this.f10175r = hVar;
    }
}
