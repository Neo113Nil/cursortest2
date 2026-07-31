package com.yandex.div.core.util.validator;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ExpressionValidator extends BaseValidator {

    @NotNull
    private final Function0<Boolean> calculateExpression;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressionValidator(boolean z4, @NotNull Function0<Boolean> calculateExpression) {
        super(z4);
        Intrinsics.checkNotNullParameter(calculateExpression, "calculateExpression");
        this.calculateExpression = calculateExpression;
    }

    @Override // com.yandex.div.core.util.validator.BaseValidator
    public boolean validate(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return (getAllowEmpty() && input.length() == 0) || ((Boolean) this.calculateExpression.invoke()).booleanValue();
    }
}
