package com.yandex.div.core.view2.divs;

import android.widget.TextView;
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
final class TextViewExtensionsKt$observeLetterSpacing$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Expression<Long> $newFontSize;
    final /* synthetic */ Expression<Double> $newLetterSpacing;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ TextView $this_observeLetterSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextViewExtensionsKt$observeLetterSpacing$callback$1(TextView textView, Expression<Double> expression, Expression<Long> expression2, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_observeLetterSpacing = textView;
        this.$newLetterSpacing = expression;
        this.$newFontSize = expression2;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m143invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m143invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        TextViewExtensionsKt.applyLetterSpacing(this.$this_observeLetterSpacing, this.$newLetterSpacing, this.$newFontSize, this.$resolver);
    }
}
