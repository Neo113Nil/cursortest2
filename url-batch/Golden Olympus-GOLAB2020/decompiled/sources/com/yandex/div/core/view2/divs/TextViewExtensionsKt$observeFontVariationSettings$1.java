package com.yandex.div.core.view2.divs;

import O1.EnumC0791e6;
import android.widget.TextView;
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
final class TextViewExtensionsKt$observeFontVariationSettings$1 extends s implements Function1<JSONObject, Unit> {
    final /* synthetic */ Expression<JSONObject> $newFontVariationSettings;
    final /* synthetic */ Expression<EnumC0791e6> $newFontWeight;
    final /* synthetic */ Expression<Long> $newFontWeightValue;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ TextView $this_observeFontVariationSettings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<LO1/e6;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
    TextViewExtensionsKt$observeFontVariationSettings$1(TextView textView, Expression expression, Expression expression2, Expression expression3, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_observeFontVariationSettings = textView;
        this.$newFontWeight = expression;
        this.$newFontWeightValue = expression2;
        this.$newFontVariationSettings = expression3;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextViewExtensionsKt.applyFontVariationSettings(this.$this_observeFontVariationSettings, this.$newFontWeight, this.$newFontWeightValue, this.$newFontVariationSettings, this.$resolver);
    }
}
