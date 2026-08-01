package y;

import cf.c;
import kotlin.Unit;
import kotlin.collections.i0;
import nd.i;
import vd.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends i implements n {
    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            long j = ((j1.b) obj2).f4914a;
            return new a(3, (ld.a) obj3).invokeSuspend(Unit.f5554a);
        }
        i0.j();
        return null;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f6622d;
        c.M(obj);
        return Unit.f5554a;
    }
}
