package kotlin.coroutines.jvm.internal;

/* loaded from: classes.dex */
public abstract class j extends a {
    public j(y5.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == y5.h.f23481f)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // y5.d
    public y5.g getContext() {
        return y5.h.f23481f;
    }
}
