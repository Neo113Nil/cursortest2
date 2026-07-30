package kotlinx.coroutines;

/* loaded from: classes3.dex */
public abstract class v1 extends CoroutineDispatcher {
    public abstract v1 getImmediate();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i8) {
        kotlinx.coroutines.internal.q.checkParallelism(i8);
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        return k0.getClassSimpleName(this) + '@' + k0.getHexAddress(this);
    }

    protected final String toStringInternalImpl() {
        v1 v1Var;
        v1 main = t0.getMain();
        if (this == main) {
            return "Dispatchers.Main";
        }
        try {
            v1Var = main.getImmediate();
        } catch (UnsupportedOperationException unused) {
            v1Var = null;
        }
        if (this == v1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
