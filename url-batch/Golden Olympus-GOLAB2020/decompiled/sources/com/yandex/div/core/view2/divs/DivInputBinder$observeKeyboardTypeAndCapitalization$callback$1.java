package com.yandex.div.core.view2.divs;

import O1.C1060t7;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C1060t7 $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeKeyboardTypeAndCapitalization;
    final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1(C1060t7 c1060t7, ExpressionResolver expressionResolver, DivInputView divInputView, DivInputBinder divInputBinder) {
        super(1);
        this.$div = c1060t7;
        this.$resolver = expressionResolver;
        this.$this_observeKeyboardTypeAndCapitalization = divInputView;
        this.this$0 = divInputBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m108invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m108invoke(@NotNull Object obj) {
        int keyboardType;
        int capitalization;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        C1060t7.e eVar = (C1060t7.e) this.$div.f8001C.evaluate(this.$resolver);
        DivInputView divInputView = this.$this_observeKeyboardTypeAndCapitalization;
        keyboardType = this.this$0.getKeyboardType(eVar);
        capitalization = this.this$0.getCapitalization(this.$div, this.$resolver);
        divInputView.setInputType(keyboardType | capitalization);
        this.$this_observeKeyboardTypeAndCapitalization.setHorizontallyScrolling(eVar != C1060t7.e.MULTI_LINE_TEXT);
    }
}
