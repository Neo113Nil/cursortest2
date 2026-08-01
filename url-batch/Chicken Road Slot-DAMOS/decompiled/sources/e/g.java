package e;

import kotlin.Unit;
import vd.n;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends nd.i implements n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f3746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z zVar, ld.a aVar) {
        super(3, aVar);
        this.f3746d = zVar;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        return new g(this.f3746d, (ld.a) obj3).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f6622d;
        cf.c.M(obj);
        this.f3746d.f10164d = true;
        return Unit.f5554a;
    }
}
