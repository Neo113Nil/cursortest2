package X1;

import V1.j;

/* loaded from: classes.dex */
public abstract class g extends a {
    public g(V1.d dVar) {
        super(dVar);
        if (dVar != null && dVar.t() != j.f4558d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // V1.d
    public final V1.i t() {
        return j.f4558d;
    }
}
