package ke;

import ge.a0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends g {

    /* renamed from: s, reason: collision with root package name */
    public final nd.i f5536s;

    /* JADX WARN: Multi-variable type inference failed */
    public l(vd.n nVar, je.e eVar, CoroutineContext coroutineContext, int i3, ie.a aVar) {
        super(eVar, coroutineContext, i3, aVar);
        this.f5536s = (nd.i) nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [nd.i, vd.n] */
    @Override // ke.e
    public final e e(CoroutineContext coroutineContext, int i3, ie.a aVar) {
        return new l(this.f5536s, this.f5521r, coroutineContext, i3, aVar);
    }

    @Override // ke.g
    public final Object h(je.f fVar, ld.a aVar) {
        Object h10 = a0.h(new i(this, fVar, null), aVar);
        return h10 == md.a.f6622d ? h10 : Unit.f5554a;
    }
}
