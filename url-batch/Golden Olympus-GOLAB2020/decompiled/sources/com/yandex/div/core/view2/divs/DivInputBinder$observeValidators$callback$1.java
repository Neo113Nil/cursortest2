package com.yandex.div.core.view2.divs;

import O1.AbstractC0775d8;
import O1.C1060t7;
import com.yandex.div.core.util.validator.ValidatorItemData;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeValidators$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C1060t7 $div;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ ErrorCollector $errorCollector;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeValidators;
    final /* synthetic */ List<ValidatorItemData> $validators;
    final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeValidators$callback$1(List<ValidatorItemData> list, C1060t7 c1060t7, DivInputBinder divInputBinder, ExpressionResolver expressionResolver, ErrorCollector errorCollector, DivInputView divInputView, Div2View div2View) {
        super(1);
        this.$validators = list;
        this.$div = c1060t7;
        this.this$0 = divInputBinder;
        this.$resolver = expressionResolver;
        this.$errorCollector = errorCollector;
        this.$this_observeValidators = divInputView;
        this.$divView = div2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m117invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m117invoke(@NotNull Object obj) {
        ValidatorItemData validatorDataItem;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.$validators.clear();
        List list = this.$div.f8026a0;
        if (list != null) {
            DivInputBinder divInputBinder = this.this$0;
            ExpressionResolver expressionResolver = this.$resolver;
            ErrorCollector errorCollector = this.$errorCollector;
            List<ValidatorItemData> list2 = this.$validators;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                validatorDataItem = divInputBinder.toValidatorDataItem((AbstractC0775d8) it.next(), expressionResolver, errorCollector);
                if (validatorDataItem != null) {
                    list2.add(validatorDataItem);
                }
            }
            List<ValidatorItemData> list3 = this.$validators;
            DivInputBinder divInputBinder2 = this.this$0;
            DivInputView divInputView = this.$this_observeValidators;
            Div2View div2View = this.$divView;
            ExpressionResolver expressionResolver2 = this.$resolver;
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                divInputBinder2.validate((ValidatorItemData) it2.next(), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver2);
            }
        }
    }
}
