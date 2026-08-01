package je;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5237d;

    /* renamed from: e, reason: collision with root package name */
    public int f5238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i3, int i10, ld.a aVar) {
        super(i3, aVar);
        this.f5237d = i10;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f5237d) {
            case 0:
                v vVar = new v(2, 0, aVar);
                vVar.f5238e = ((Number) obj).intValue();
                return vVar;
            default:
                return new v(2, 1, aVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5237d) {
            case 0:
                return ((v) create(Integer.valueOf(((Number) obj).intValue()), (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                return ((v) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
        }
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5237d) {
            case 0:
                int i3 = this.f5238e;
                md.a aVar = md.a.f6622d;
                cf.c.M(obj);
                return Boolean.valueOf(i3 > 0);
            default:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f5238e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    qb.n notifications = ((v9.a) v9.c.f9999a.getValue()).getNotifications();
                    this.f5238e = 1;
                    if (notifications.requestPermission(true, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
        }
    }
}
