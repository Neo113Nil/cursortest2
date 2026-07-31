package com.yandex.div.core.util.inputfilter;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ExpressionInputFilter implements BaseInputFilter {

    @NotNull
    private final Expression<Boolean> condition;

    @NotNull
    private final ExpressionResolver resolver;

    public ExpressionInputFilter(@NotNull Expression<Boolean> condition, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.condition = condition;
        this.resolver = resolver;
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.condition.evaluate(this.resolver).booleanValue();
    }
}
