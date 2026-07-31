package com.yandex.div.core.view2.divs;

import O1.AbstractC1078u7;
import W1.m;
import com.yandex.div.core.util.inputfilter.BaseInputFilter;
import com.yandex.div.core.util.inputfilter.ExpressionInputFilter;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.util.inputfilter.RegexInputFilter;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeFilters$updateFiltersData$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ List<AbstractC1078u7> $divFilters;
    final /* synthetic */ Function1<InputFiltersHolder, Unit> $onFiltersUpdate;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DivInputBinder$observeFilters$updateFiltersData$1(List<? extends AbstractC1078u7> list, Function1<? super InputFiltersHolder, Unit> function1, ExpressionResolver expressionResolver, DivInputBinder divInputBinder, BindingContext bindingContext) {
        super(1);
        this.$divFilters = list;
        this.$onFiltersUpdate = function1;
        this.$resolver = expressionResolver;
        this.this$0 = divInputBinder;
        this.$bindingContext = bindingContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m104invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m104invoke(@NotNull Object obj) {
        ErrorCollectors errorCollectors;
        BaseInputFilter baseInputFilter;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        List<AbstractC1078u7> list = this.$divFilters;
        ExpressionResolver expressionResolver = this.$resolver;
        DivInputBinder divInputBinder = this.this$0;
        BindingContext bindingContext = this.$bindingContext;
        ArrayList arrayList = new ArrayList();
        for (AbstractC1078u7 abstractC1078u7 : list) {
            if (abstractC1078u7 instanceof AbstractC1078u7.d) {
                try {
                    baseInputFilter = new RegexInputFilter((String) ((AbstractC1078u7.d) abstractC1078u7).c().f2460a.evaluate(expressionResolver));
                } catch (PatternSyntaxException e4) {
                    errorCollectors = divInputBinder.errorCollectors;
                    errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData()).logError(new IllegalArgumentException("Invalid regex pattern '" + e4.getPattern() + "'.", e4));
                    baseInputFilter = null;
                }
            } else {
                if (!(abstractC1078u7 instanceof AbstractC1078u7.c)) {
                    throw new m();
                }
                baseInputFilter = new ExpressionInputFilter(((AbstractC1078u7.c) abstractC1078u7).c().f8226a, expressionResolver);
            }
            if (baseInputFilter != null) {
                arrayList.add(baseInputFilter);
            }
        }
        this.$onFiltersUpdate.invoke(new InputFiltersHolder(arrayList));
    }
}
