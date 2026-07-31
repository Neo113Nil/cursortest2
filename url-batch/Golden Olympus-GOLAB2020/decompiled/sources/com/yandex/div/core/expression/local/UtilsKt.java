package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class UtilsKt {
    @Nullable
    public static final ExpressionResolverImpl getAsImpl(@NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(expressionResolver, "<this>");
        if (expressionResolver instanceof ExpressionResolverImpl) {
            return (ExpressionResolverImpl) expressionResolver;
        }
        return null;
    }

    @Nullable
    public static final VariableController getVariableController(@NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(expressionResolver, "<this>");
        ExpressionResolverImpl asImpl = getAsImpl(expressionResolver);
        if (asImpl != null) {
            return asImpl.getVariableController();
        }
        return null;
    }
}
