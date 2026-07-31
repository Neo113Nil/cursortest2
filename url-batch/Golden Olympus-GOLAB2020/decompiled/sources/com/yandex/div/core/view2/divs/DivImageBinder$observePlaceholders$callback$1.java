package com.yandex.div.core.view2.divs;

import O1.O6;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivImageBinder$observePlaceholders$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ ErrorCollector $errorCollector;
    final /* synthetic */ O6 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivImageView $this_observePlaceholders;
    final /* synthetic */ DivImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivImageBinder$observePlaceholders$callback$1(DivImageView divImageView, DivImageBinder divImageBinder, BindingContext bindingContext, O6 o6, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        super(1);
        this.$this_observePlaceholders = divImageView;
        this.this$0 = divImageBinder;
        this.$bindingContext = bindingContext;
        this.$newDiv = o6;
        this.$resolver = expressionResolver;
        this.$errorCollector = errorCollector;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m101invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m101invoke(@NotNull Object obj) {
        boolean isHighPriorityShow;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        if (this.$this_observePlaceholders.isImageLoaded()) {
            return;
        }
        DivImageBinder divImageBinder = this.this$0;
        DivImageView divImageView = this.$this_observePlaceholders;
        BindingContext bindingContext = this.$bindingContext;
        O6 o6 = this.$newDiv;
        isHighPriorityShow = divImageBinder.isHighPriorityShow(this.$resolver, divImageView, o6);
        divImageBinder.applyPlaceholders(divImageView, bindingContext, o6, isHighPriorityShow, this.$errorCollector);
    }
}
