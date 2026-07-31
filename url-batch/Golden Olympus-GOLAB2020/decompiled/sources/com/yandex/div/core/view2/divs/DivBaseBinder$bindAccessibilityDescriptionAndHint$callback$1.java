package com.yandex.div.core.view2.divs;

import O1.C0839h0;
import O1.InterfaceC0752c3;
import android.view.View;
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
final class DivBaseBinder$bindAccessibilityDescriptionAndHint$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ InterfaceC0752c3 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $this_bindAccessibilityDescriptionAndHint;
    final /* synthetic */ DivBaseBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBaseBinder$bindAccessibilityDescriptionAndHint$callback$1(DivBaseBinder divBaseBinder, View view, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divBaseBinder;
        this.$this_bindAccessibilityDescriptionAndHint = view;
        this.$newDiv = interfaceC0752c3;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m75invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m75invoke(@NotNull Object obj) {
        Expression expression;
        Expression expression2;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        DivBaseBinder divBaseBinder = this.this$0;
        View view = this.$this_bindAccessibilityDescriptionAndHint;
        C0839h0 d4 = this.$newDiv.d();
        String str = null;
        String str2 = (d4 == null || (expression2 = d4.f6315a) == null) ? null : (String) expression2.evaluate(this.$resolver);
        C0839h0 d5 = this.$newDiv.d();
        if (d5 != null && (expression = d5.f6316b) != null) {
            str = (String) expression.evaluate(this.$resolver);
        }
        divBaseBinder.applyAccessibilityDescriptionAndHint(view, str2, str);
    }
}
