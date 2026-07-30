package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public abstract class z {
    public abstract b getAtomicOp();

    public abstract Object perform(Object obj);

    public String toString() {
        return kotlinx.coroutines.k0.getClassSimpleName(this) + '@' + kotlinx.coroutines.k0.getHexAddress(this);
    }
}
