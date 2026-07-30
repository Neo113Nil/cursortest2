package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes4.dex */
public abstract class SuspendLambda extends ContinuationImpl implements q {
    private final int arity;

    public SuspendLambda(int i8, kotlin.coroutines.c cVar) {
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

    public SuspendLambda(int i8) {
        this(i8, null);
    }
}
