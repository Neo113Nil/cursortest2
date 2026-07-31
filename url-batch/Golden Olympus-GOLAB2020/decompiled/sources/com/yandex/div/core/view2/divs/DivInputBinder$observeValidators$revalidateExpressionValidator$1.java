package com.yandex.div.core.view2.divs;

import com.yandex.div.core.util.validator.ValidatorItemData;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeValidators$revalidateExpressionValidator$1 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeValidators;
    final /* synthetic */ List<ValidatorItemData> $validators;
    final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeValidators$revalidateExpressionValidator$1(DivInputBinder divInputBinder, List<ValidatorItemData> list, DivInputView divInputView, Div2View div2View, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divInputBinder;
        this.$validators = list;
        this.$this_observeValidators = divInputView;
        this.$divView = div2View;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.f41027a;
    }

    public final void invoke(int i4) {
        this.this$0.validate(this.$validators.get(i4), String.valueOf(this.$this_observeValidators.getText()), this.$this_observeValidators, this.$divView, this.$resolver);
    }
}
