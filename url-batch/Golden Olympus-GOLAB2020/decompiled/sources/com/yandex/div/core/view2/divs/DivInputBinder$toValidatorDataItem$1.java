package com.yandex.div.core.view2.divs;

import O1.C0847h8;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$toValidatorDataItem$1 extends s implements Function0<Boolean> {
    final /* synthetic */ C0847h8 $expressionValidator;
    final /* synthetic */ ExpressionResolver $resolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$toValidatorDataItem$1(C0847h8 c0847h8, ExpressionResolver expressionResolver) {
        super(0);
        this.$expressionValidator = c0847h8;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        return (Boolean) this.$expressionValidator.f6377b.evaluate(this.$resolver);
    }
}
