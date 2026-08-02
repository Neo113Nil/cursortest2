package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements FunctionBase {
    private final int arity;

    public RestrictedSuspendLambda(int i, Continuation continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final String toString() {
        return getCompletion() == null ? Reflection.factory.renderLambdaToString(this) : super.toString();
    }
}
