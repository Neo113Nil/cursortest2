package dev.zacsweers.metro;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LambdaProvider implements Provider {
    public final Function0 lambda;

    public final boolean equals(Object obj) {
        if (obj instanceof LambdaProvider) {
            return this.lambda.equals(((LambdaProvider) obj).lambda);
        }
        return false;
    }

    public final int hashCode() {
        return this.lambda.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.lambda.invoke();
    }

    public final String toString() {
        return "LambdaProvider(lambda=" + this.lambda + ")";
    }
}
