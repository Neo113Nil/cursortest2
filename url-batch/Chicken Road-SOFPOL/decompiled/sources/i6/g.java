package i6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class g extends a {
    public g(g6.c cVar) {
        super(cVar);
        if (cVar != null && cVar.f() != g6.i.f3046d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // g6.c
    public final g6.h f() {
        return g6.i.f3046d;
    }
}
