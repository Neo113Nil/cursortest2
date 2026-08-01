package nd;

import kotlin.coroutines.CoroutineContext;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g extends a {
    public g(ld.a aVar) {
        super(aVar);
        if (aVar == null || aVar.getContext() == kotlin.coroutines.g.f5592d) {
            return;
        }
        a1.e("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // ld.a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f5592d;
    }
}
