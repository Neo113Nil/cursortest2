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

/* JADX WARN: Incorrect field signature: TT; */
@Metadata
/* loaded from: classes2.dex */
final class TextViewExtensionsKt$observeLineHeight$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Expression<EnumC0779dc> $newFontSizeUnit;
    final /* synthetic */ Expression<Long> $newLineHeight;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ TextView $this_observeLineHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<LO1/dc;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
    TextViewExtensionsKt$observeLineHeight$callback$1(TextView textView, Expression expression, Expression expression2, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_observeLineHeight = textView;
        this.$newLineHeight = expression;
        this.$newFontSizeUnit = expression2;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m144invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m144invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        TextViewExtensionsKt.applyLineHeight(this.$this_observeLineHeight, this.$newLineHeight, this.$newFontSizeUnit, this.$resolver);
    }
}
