package com.yandex.div.core.view2.divs;

import O1.Kd;
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
final class DivTextBinder$bindEllipsize$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Kd $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivLineHeightTextView $this_bindEllipsize;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindEllipsize$callback$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView, Kd kd, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindEllipsize = divLineHeightTextView;
        this.$newDiv = kd;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m132invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m132invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyEllipsize(this.$this_bindEllipsize, this.$newDiv, this.$resolver);
    }
}
