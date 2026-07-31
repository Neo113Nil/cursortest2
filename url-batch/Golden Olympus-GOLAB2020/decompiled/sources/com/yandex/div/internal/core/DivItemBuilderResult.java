package com.yandex.div.internal.core;

import O1.Z;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivItemBuilderResult {

    @NotNull
    private final Z div;

    @NotNull
    private final ExpressionResolver expressionResolver;

    public DivItemBuilderResult(@NotNull Z div, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        this.div = div;
        this.expressionResolver = expressionResolver;
    }

    @NotNull
    public final Z component1() {
        return this.div;
    }

    @NotNull
    public final ExpressionResolver component2() {
        return this.expressionResolver;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivItemBuilderResult)) {
            return false;
        }
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
        return Intrinsics.areEqual(this.div, divItemBuilderResult.div) && Intrinsics.areEqual(this.expressionResolver, divItemBuilderResult.expressionResolver);
    }

    @NotNull
    public final Z getDiv() {
        return this.div;
    }

    @NotNull
    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    public int hashCode() {
        return (this.div.hashCode() * 31) + this.expressionResolver.hashCode();
    }

    @NotNull
    public String toString() {
        return "DivItemBuilderResult(div=" + this.div + ", expressionResolver=" + this.expressionResolver + ')';
    }
}
