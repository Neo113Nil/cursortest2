package E2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class h extends a {
    public h(C2.a aVar) {
        super(aVar);
        if (aVar != null && aVar.p() != kotlin.coroutines.i.f7498d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // C2.a
    public final CoroutineContext p() {
        return kotlin.coroutines.i.f7498d;
    }
}
