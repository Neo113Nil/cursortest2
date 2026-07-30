package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes4.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements q {
    private final int arity;

    public RestrictedSuspendLambda(int i8, kotlin.coroutines.c cVar) {
        super(cVar);
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.q
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String renderLambdaToString = u.renderLambdaToString(this);
        s.checkNotNullExpressionValue(renderLambdaToString, "renderLambdaToString(this)");
        return renderLambdaToString;
    }

    public RestrictedSuspendLambda(int i8) {
        this(i8, null);
    }
}
