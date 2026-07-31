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
final class DivInputBinder$observeSelectAllOnFocus$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C1060t7 $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeSelectAllOnFocus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeSelectAllOnFocus$callback$1(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_observeSelectAllOnFocus = divInputView;
        this.$div = c1060t7;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m115invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m115invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.$this_observeSelectAllOnFocus.setSelectAllOnFocus(((Boolean) this.$div.f8013O.evaluate(this.$resolver)).booleanValue());
    }
}
