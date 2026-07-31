package com.yandex.div.core.view2.divs;

import O1.Kd;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$bindPlainText$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ Kd $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivLineHeightTextView $this_bindPlainText;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindPlainText$callback$1(Kd kd, ExpressionResolver expressionResolver, DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext) {
        super(1);
        this.$newDiv = kd;
        this.$resolver = expressionResolver;
        this.this$0 = divTextBinder;
        this.$this_bindPlainText = divLineHeightTextView;
        this.$bindingContext = bindingContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m136invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m136invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        String str = (String) this.$newDiv.f3472W.evaluate(this.$resolver);
        this.this$0.applyPlainText(this.$this_bindPlainText, this.$bindingContext, this.$newDiv);
        this.this$0.applyHyphenation(this.$this_bindPlainText, str);
    }
}
