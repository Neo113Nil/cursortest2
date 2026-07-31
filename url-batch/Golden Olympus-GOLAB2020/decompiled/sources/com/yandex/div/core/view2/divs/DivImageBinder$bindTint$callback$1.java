package com.yandex.div.core.view2.divs;

import O1.EnumC0770d3;
import O1.O6;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
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
final class DivImageBinder$bindTint$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ O6 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivImageView $this_bindTint;
    final /* synthetic */ DivImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivImageBinder$bindTint$callback$1(DivImageBinder divImageBinder, DivImageView divImageView, O6 o6, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divImageBinder;
        this.$this_bindTint = divImageView;
        this.$newDiv = o6;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m100invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m100invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        DivImageBinder divImageBinder = this.this$0;
        DivImageView divImageView = this.$this_bindTint;
        Expression expression = this.$newDiv.f4226P;
        divImageBinder.applyTint(divImageView, expression != null ? (Integer) expression.evaluate(this.$resolver) : null, (EnumC0770d3) this.$newDiv.f4227Q.evaluate(this.$resolver));
    }
}
