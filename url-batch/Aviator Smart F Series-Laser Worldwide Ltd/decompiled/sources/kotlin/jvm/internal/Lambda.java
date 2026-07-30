package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class Lambda<R> implements q, Serializable {
    private final int arity;

    public Lambda(int i8) {
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.q
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String renderLambdaToString = u.renderLambdaToString((Lambda) this);
        s.checkNotNullExpressionValue(renderLambdaToString, "renderLambdaToString(this)");
        return renderLambdaToString;
    }
}
