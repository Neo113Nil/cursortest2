package kotlinx.coroutines.flow.internal;

/* loaded from: classes5.dex */
public abstract class h {
    public static final int checkIndexOverflow(int i8) {
        if (i8 >= 0) {
            return i8;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void checkOwnership(AbortFlowException abortFlowException, kotlinx.coroutines.flow.f fVar) {
        if (abortFlowException.owner != fVar) {
            throw abortFlowException;
        }
    }
}
