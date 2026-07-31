package com.yandex.div.core.view2.divs;

import O1.EnumC1091v2;
import O1.EnumC1109w2;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivGifImageBinder$observeContentAlignment$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Expression<EnumC1091v2> $horizontalAlignment;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivGifImageView $this_observeContentAlignment;
    final /* synthetic */ Expression<EnumC1109w2> $verticalAlignment;
    final /* synthetic */ DivGifImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivGifImageBinder$observeContentAlignment$callback$1(DivGifImageBinder divGifImageBinder, DivGifImageView divGifImageView, ExpressionResolver expressionResolver, Expression<EnumC1091v2> expression, Expression<EnumC1109w2> expression2) {
        super(1);
        this.this$0 = divGifImageBinder;
        this.$this_observeContentAlignment = divGifImageView;
        this.$resolver = expressionResolver;
        this.$horizontalAlignment = expression;
        this.$verticalAlignment = expression2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m95invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m95invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyContentAlignment(this.$this_observeContentAlignment, this.$resolver, this.$horizontalAlignment, this.$verticalAlignment);
    }
}
