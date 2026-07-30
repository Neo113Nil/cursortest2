package X5;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class h extends a {
    public h(V5.b bVar) {
        super(bVar);
        if (bVar != null && bVar.getContext() != kotlin.coroutines.g.f6146d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // V5.b
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f6146d;
    }
}
