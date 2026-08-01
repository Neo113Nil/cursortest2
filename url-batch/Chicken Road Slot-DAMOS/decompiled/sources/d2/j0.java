package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i3, int i10, ld.a aVar) {
        super(i3, aVar);
        this.f3446d = i10;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f3446d) {
            case 0:
                return new j0(2, 0, aVar);
            case 1:
                return new j0(2, 1, aVar);
            default:
                return new j0(2, 2, aVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3446d) {
            case 0:
                return ((j0) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 1:
                return ((j0) create((je.e) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                return ((j0) create((je.f) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
        }
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3446d) {
            case 0:
                md.a aVar = md.a.f6622d;
                cf.c.M(obj);
                break;
            case 1:
                md.a aVar2 = md.a.f6622d;
                cf.c.M(obj);
                break;
            default:
                md.a aVar3 = md.a.f6622d;
                cf.c.M(obj);
                break;
        }
        return Unit.f5554a;
    }
}
