package j6;

import h6.j;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g extends a {
    public g(h6.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f4661f) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // h6.d
    public final h6.i getContext() {
        return j.f4661f;
    }
}
