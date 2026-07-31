package com.yandex.div.core.view2.divs;

import O1.EnumC0791e6;
import android.widget.TextView;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Incorrect field signature: TT; */
@Metadata
/* loaded from: classes2.dex */
final class TextViewExtensionsKt$observeTypeface$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Expression<String> $fontFamily;
    final /* synthetic */ Expression<JSONObject> $fontVariations;
    final /* synthetic */ Expression<EnumC0791e6> $fontWeight;
    final /* synthetic */ Expression<Long> $fontWeightValue;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ TextView $this_observeTypeface;
    final /* synthetic */ DivTypefaceResolver $typefaceResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/String;>;Lcom/yandex/div/json/expressions/Expression<LO1/e6;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
    TextViewExtensionsKt$observeTypeface$callback$1(TextView textView, Expression expression, Expression expression2, Expression expression3, Expression expression4, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_observeTypeface = textView;
        this.$fontFamily = expression;
        this.$fontWeight = expression2;
        this.$fontWeightValue = expression3;
        this.$fontVariations = expression4;
        this.$typefaceResolver = divTypefaceResolver;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m145invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m145invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        TextViewExtensionsKt.applyTypeface(this.$this_observeTypeface, this.$fontFamily, this.$fontWeight, this.$fontWeightValue, this.$fontVariations, this.$typefaceResolver, this.$resolver);
    }
}
