package ke;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends g {
    @Override // ke.e
    public final e e(CoroutineContext coroutineContext, int i3, ie.a aVar) {
        return new h(this.f5521r, coroutineContext, i3, aVar);
    }

    @Override // ke.e
    public final je.e f() {
        return this.f5521r;
    }

    @Override // ke.g
    public final Object h(je.f fVar, ld.a aVar) {
        Object c10 = this.f5521r.c(fVar, aVar);
        return c10 == md.a.f6622d ? c10 : Unit.f5554a;
    }
}
