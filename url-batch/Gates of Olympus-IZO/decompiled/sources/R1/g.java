package R1;

import P1.j;

/* loaded from: classes.dex */
public abstract class g extends a {
    public g(P1.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f3073d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // P1.d
    public final P1.i getContext() {
        return j.f3073d;
    }
}
