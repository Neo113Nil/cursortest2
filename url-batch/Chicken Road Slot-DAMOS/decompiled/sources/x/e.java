package x;

import ge.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f10186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, ld.a aVar, int i3) {
        super(2, aVar);
        this.f10185d = i3;
        this.f10186e = lVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f10185d) {
            case 0:
                return new e(this.f10186e, aVar, 0);
            default:
                return new e(this.f10186e, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ge.x xVar = (ge.x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f10185d) {
        }
        return ((e) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f10185d;
        l lVar = this.f10186e;
        switch (i3) {
            case 0:
                md.a aVar = md.a.f6622d;
                cf.c.M(obj);
                if (lVar.N == null) {
                    z.c cVar = new z.c();
                    z.f fVar = lVar.E;
                    if (fVar != null) {
                        a0.s(lVar.w(), null, new a3.t(fVar, cVar, null, 20), 3);
                    }
                    lVar.N = cVar;
                }
                break;
            default:
                md.a aVar2 = md.a.f6622d;
                cf.c.M(obj);
                z.c cVar2 = lVar.N;
                if (cVar2 != null) {
                    z.d dVar = new z.d(cVar2);
                    z.f fVar2 = lVar.E;
                    if (fVar2 != null) {
                        a0.s(lVar.w(), null, new a3.t(fVar2, dVar, null, 21), 3);
                    }
                    lVar.N = null;
                }
                break;
        }
        return Unit.f5554a;
    }
}
