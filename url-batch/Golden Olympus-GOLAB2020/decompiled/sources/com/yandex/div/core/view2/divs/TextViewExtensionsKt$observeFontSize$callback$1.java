package com.yandex.div.core.view2.divs;

import O1.EnumC0779dc;
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
final class TextViewExtensionsKt$observeFontSize$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Expression<Long> $newFontSize;
    final /* synthetic */ Expression<EnumC0779dc> $newFontSizeUnit;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ TextView $this_observeFontSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextViewExtensionsKt$observeFontSize$callback$1(TextView textView, Expression<Long> expression, Expression<EnumC0779dc> expression2, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_observeFontSize = textView;
        this.$newFontSize = expression;
        this.$newFontSizeUnit = expression2;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m142invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m142invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        TextViewExtensionsKt.applyFontSize(this.$this_observeFontSize, this.$newFontSize, this.$newFontSizeUnit, this.$resolver);
    }
}
