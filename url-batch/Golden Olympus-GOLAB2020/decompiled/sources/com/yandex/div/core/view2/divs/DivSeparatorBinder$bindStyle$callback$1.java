package com.yandex.div.core.view2.divs;

import O1.Ab;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivSeparatorBinder$bindStyle$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Ab.c $newStyle;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivSeparatorView $this_bindStyle;
    final /* synthetic */ DivSeparatorBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSeparatorBinder$bindStyle$callback$1(DivSeparatorBinder divSeparatorBinder, DivSeparatorView divSeparatorView, Ab.c cVar, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divSeparatorBinder;
        this.$this_bindStyle = divSeparatorView;
        this.$newStyle = cVar;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m118invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m118invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyStyle(this.$this_bindStyle, this.$newStyle, this.$resolver);
    }
}
