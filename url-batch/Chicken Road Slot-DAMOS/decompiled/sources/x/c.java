package x;

import ge.a0;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10176d;

    /* renamed from: e, reason: collision with root package name */
    public int f10177e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z.f f10178i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z.h f10179r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f10180s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(z.f fVar, z.h hVar, l lVar, ld.a aVar, int i3) {
        super(2, aVar);
        this.f10176d = i3;
        this.f10178i = fVar;
        this.f10179r = hVar;
        this.f10180s = lVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f10176d) {
            case 0:
                return new c(this.f10178i, this.f10179r, this.f10180s, aVar, 0);
            default:
                return new c(this.f10178i, this.f10179r, this.f10180s, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ge.x xVar = (ge.x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f10176d) {
        }
        return ((c) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10176d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f10177e;
                z.h hVar = this.f10179r;
                if (i3 == 0) {
                    cf.c.M(obj);
                    long j = m.f10201a;
                    this.f10177e = 1;
                    if (a0.i(j, this) == aVar) {
                    }
                } else if (i3 == 1) {
                    cf.c.M(obj);
                } else if (i3 != 2) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                    this.f10180s.Q = hVar;
                    break;
                }
                this.f10177e = 2;
                if (this.f10178i.a(hVar, this) == aVar) {
                }
                this.f10180s.Q = hVar;
                break;
            default:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f10177e;
                z.h hVar2 = this.f10179r;
                if (i10 == 0) {
                    cf.c.M(obj);
                    long j3 = m.f10201a;
                    this.f10177e = 1;
                    if (a0.i(j3, this) == aVar2) {
                    }
                } else if (i10 == 1) {
                    cf.c.M(obj);
                } else if (i10 != 2) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                    this.f10180s.M = hVar2;
                    break;
                }
                this.f10177e = 2;
                if (this.f10178i.a(hVar2, this) == aVar2) {
                }
                this.f10180s.M = hVar2;
                break;
        }
        return Unit.f5554a;
    }
}
