package com.yandex.div.core.view2.divs;

import O1.C0720a7;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivIndicatorBinder$bind$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C0720a7 $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivPagerIndicatorView $this_bind;
    final /* synthetic */ DivIndicatorBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivIndicatorBinder$bind$callback$1(DivIndicatorBinder divIndicatorBinder, DivPagerIndicatorView divPagerIndicatorView, ExpressionResolver expressionResolver, C0720a7 c0720a7) {
        super(1);
        this.this$0 = divIndicatorBinder;
        this.$this_bind = divPagerIndicatorView;
        this.$resolver = expressionResolver;
        this.$div = c0720a7;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m102invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m102invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyStyle(this.$this_bind, this.$resolver, this.$div);
    }
}
