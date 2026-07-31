package com.yandex.div.core.view2.divs;

import O1.EnumC0779dc;
import O1.EnumC0791e6;
import android.os.Build;
import android.util.DisplayMetrics;
import android.widget.TextView;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class TextViewExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFontSize(TextView textView, Expression<Long> expression, Expression<EnumC0779dc> expression2, ExpressionResolver expressionResolver) {
        textView.setTextSize(BaseDivViewExtensionsKt.toAndroidUnit(expression2.evaluate(expressionResolver)), expression.evaluate(expressionResolver).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFontVariationSettings(TextView textView, Expression<EnumC0791e6> expression, Expression<Long> expression2, Expression<JSONObject> expression3, ExpressionResolver expressionResolver) {
        textView.setFontVariationSettings(getFontVariations(expression, expression2, expression3, expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyLetterSpacing(TextView textView, Expression<Double> expression, Expression<Long> expression2, ExpressionResolver expressionResolver) {
        textView.setLetterSpacing(((float) expression.evaluate(expressionResolver).doubleValue()) / expression2.evaluate(expressionResolver).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends TextView & FixedLineHeightView> void applyLineHeight(T t4, Expression<Long> expression, Expression<EnumC0779dc> expression2, ExpressionResolver expressionResolver) {
        int i4;
        T t5 = t4;
        if (expression != null) {
            Long valueOf = Long.valueOf(expression.evaluate(expressionResolver).longValue());
            DisplayMetrics displayMetrics = t4.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            i4 = BaseDivViewExtensionsKt.unitToPx(valueOf, displayMetrics, expression2.evaluate(expressionResolver));
        } else {
            i4 = -1;
        }
        t5.setFixedLineHeight(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyTypeface(TextView textView, Expression<String> expression, Expression<EnumC0791e6> expression2, Expression<Long> expression3, Expression<JSONObject> expression4, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        Integer num;
        int i4;
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(expression != null ? expression.evaluate(expressionResolver) : null);
        EnumC0791e6 evaluate = expression2.evaluate(expressionResolver);
        if (expression3 != null) {
            long longValue = expression3.evaluate(expressionResolver).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        textView.setTypeface(DivTypefaceResolverKt.getTypeface(evaluate, num, typefaceProvider));
        if (getSupportFontVariations() && typefaceProvider.isVariable()) {
            textView.setFontVariationSettings(null);
            applyFontVariationSettings(textView, expression2, expression3, expression4, expressionResolver);
        }
    }

    @NotNull
    public static final String getFontVariations(@NotNull Expression<EnumC0791e6> fontWeight, @Nullable Expression<Long> expression, @Nullable Expression<JSONObject> expression2, @NotNull ExpressionResolver resolver) {
        Integer num;
        int i4;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        EnumC0791e6 evaluate = fontWeight.evaluate(resolver);
        if (expression != null) {
            long longValue = expression.evaluate(resolver).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        return getFontVariations(evaluate, num, expression2 != null ? expression2.evaluate(resolver) : null);
    }

    public static final boolean getSupportFontVariations() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private static final String getVariation(String str, Number number) {
        return '\'' + str + "' " + number;
    }

    public static final <T extends TextView & FixedLineHeightView & ExpressionSubscriber> void observeBaseTextProperties(@NotNull T t4, @NotNull Expression<Long> newFontSize, @NotNull Expression<EnumC0779dc> newFontSizeUnit, @NotNull Expression<Double> newLetterSpacing, @NotNull Expression<Integer> newTextColor, @Nullable Expression<Long> expression, @Nullable Expression<String> expression2, @NotNull Expression<EnumC0791e6> newFontWeight, @Nullable Expression<Long> expression3, @Nullable Expression<JSONObject> expression4, @Nullable Expression<Long> expression5, @Nullable Expression<EnumC0779dc> expression6, @Nullable Expression<Double> expression7, @Nullable Expression<Integer> expression8, @Nullable Expression<Long> expression9, @Nullable Expression<String> expression10, @Nullable Expression<EnumC0791e6> expression11, @Nullable Expression<Long> expression12, @Nullable Expression<JSONObject> expression13, @NotNull DivTypefaceResolver typefaceResolver, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(newFontSize, "newFontSize");
        Intrinsics.checkNotNullParameter(newFontSizeUnit, "newFontSizeUnit");
        Intrinsics.checkNotNullParameter(newLetterSpacing, "newLetterSpacing");
        Intrinsics.checkNotNullParameter(newTextColor, "newTextColor");
        Intrinsics.checkNotNullParameter(newFontWeight, "newFontWeight");
        Intrinsics.checkNotNullParameter(typefaceResolver, "typefaceResolver");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        T t5 = t4;
        observeFontSize(t4, newFontSize, newFontSizeUnit, expression5, expression6, resolver, t5);
        observeLetterSpacing(t4, newLetterSpacing, newFontSize, expression7, expression5, resolver, t5);
        observeTextColor(t4, newTextColor, expression8, resolver);
        observeLineHeight(t4, expression, newFontSizeUnit, expression9, expression6, resolver, t5);
        observeTypeface(t4, expression2, newFontWeight, expression3, expression4, expression10, expression11, expression12, expression13, typefaceResolver, resolver);
    }

    public static final void observeFontSize(@NotNull TextView textView, @NotNull Expression<Long> newFontSize, @NotNull Expression<EnumC0779dc> newFontSizeUnit, @Nullable Expression<Long> expression, @Nullable Expression<EnumC0779dc> expression2, @NotNull ExpressionResolver resolver, @NotNull ExpressionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(newFontSize, "newFontSize");
        Intrinsics.checkNotNullParameter(newFontSizeUnit, "newFontSizeUnit");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (ExpressionsKt.equalsToConstant(newFontSize, expression) && ExpressionsKt.equalsToConstant(newFontSizeUnit, expression2)) {
            return;
        }
        applyFontSize(textView, newFontSize, newFontSizeUnit, resolver);
        if (ExpressionsKt.isConstant(newFontSize) && ExpressionsKt.isConstant(newFontSizeUnit)) {
            return;
        }
        TextViewExtensionsKt$observeFontSize$callback$1 textViewExtensionsKt$observeFontSize$callback$1 = new TextViewExtensionsKt$observeFontSize$callback$1(textView, newFontSize, newFontSizeUnit, resolver);
        subscriber.addSubscription(newFontSize.observe(resolver, textViewExtensionsKt$observeFontSize$callback$1));
        subscriber.addSubscription(newFontSizeUnit.observe(resolver, textViewExtensionsKt$observeFontSize$callback$1));
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeFontVariationSettings(@NotNull T t4, @NotNull Expression<EnumC0791e6> newFontWeight, @Nullable Expression<Long> expression, @Nullable Expression<JSONObject> expression2, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(newFontWeight, "newFontWeight");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!getSupportFontVariations() || ExpressionsKt.isConstantOrNull(expression2)) {
            return;
        }
        t4.addSubscription(expression2 != null ? expression2.observe(resolver, new TextViewExtensionsKt$observeFontVariationSettings$1(t4, newFontWeight, expression, expression2, resolver)) : null);
    }

    public static final void observeLetterSpacing(@NotNull TextView textView, @NotNull Expression<Double> newLetterSpacing, @NotNull Expression<Long> newFontSize, @Nullable Expression<Double> expression, @Nullable Expression<Long> expression2, @NotNull ExpressionResolver resolver, @NotNull ExpressionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(newLetterSpacing, "newLetterSpacing");
        Intrinsics.checkNotNullParameter(newFontSize, "newFontSize");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (ExpressionsKt.equalsToConstant(newLetterSpacing, expression) && ExpressionsKt.equalsToConstant(newFontSize, expression2)) {
            return;
        }
        applyLetterSpacing(textView, newLetterSpacing, newFontSize, resolver);
        if (ExpressionsKt.isConstant(newLetterSpacing) && ExpressionsKt.isConstant(newFontSize)) {
            return;
        }
        TextViewExtensionsKt$observeLetterSpacing$callback$1 textViewExtensionsKt$observeLetterSpacing$callback$1 = new TextViewExtensionsKt$observeLetterSpacing$callback$1(textView, newLetterSpacing, newFontSize, resolver);
        subscriber.addSubscription(newFontSize.observe(resolver, textViewExtensionsKt$observeLetterSpacing$callback$1));
        subscriber.addSubscription(newLetterSpacing.observe(resolver, textViewExtensionsKt$observeLetterSpacing$callback$1));
    }

    public static final <T extends TextView & FixedLineHeightView> void observeLineHeight(@NotNull T t4, @Nullable Expression<Long> expression, @NotNull Expression<EnumC0779dc> newFontSizeUnit, @Nullable Expression<Long> expression2, @Nullable Expression<EnumC0779dc> expression3, @NotNull ExpressionResolver resolver, @NotNull ExpressionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(newFontSizeUnit, "newFontSizeUnit");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (ExpressionsKt.equalsToConstant(expression, expression2) && ExpressionsKt.equalsToConstant(newFontSizeUnit, expression3)) {
            return;
        }
        applyLineHeight(t4, expression, newFontSizeUnit, resolver);
        if (expression != null) {
            if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(newFontSizeUnit)) {
                return;
            }
            TextViewExtensionsKt$observeLineHeight$callback$1 textViewExtensionsKt$observeLineHeight$callback$1 = new TextViewExtensionsKt$observeLineHeight$callback$1(t4, expression, newFontSizeUnit, resolver);
            subscriber.addSubscription(expression.observe(resolver, textViewExtensionsKt$observeLineHeight$callback$1));
            subscriber.addSubscription(newFontSizeUnit.observe(resolver, textViewExtensionsKt$observeLineHeight$callback$1));
        }
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTextColor(@NotNull T t4, @NotNull Expression<Integer> newTextColor, @Nullable Expression<Integer> expression, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(newTextColor, "newTextColor");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (ExpressionsKt.equalsToConstant(newTextColor, expression)) {
            return;
        }
        t4.setTextColor(newTextColor.evaluate(resolver).intValue());
        if (ExpressionsKt.isConstant(newTextColor)) {
            return;
        }
        t4.addSubscription(newTextColor.observe(resolver, new TextViewExtensionsKt$observeTextColor$1(t4)));
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTypeface(@NotNull T t4, @Nullable Expression<String> expression, @NotNull Expression<EnumC0791e6> newFontWeight, @Nullable Expression<Long> expression2, @Nullable Expression<JSONObject> expression3, @Nullable Expression<String> expression4, @Nullable Expression<EnumC0791e6> expression5, @Nullable Expression<Long> expression6, @Nullable Expression<JSONObject> expression7, @NotNull DivTypefaceResolver typefaceResolver, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(newFontWeight, "newFontWeight");
        Intrinsics.checkNotNullParameter(typefaceResolver, "typefaceResolver");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (ExpressionsKt.equalsToConstant(expression, expression4) && ExpressionsKt.equalsToConstant(newFontWeight, expression5) && ExpressionsKt.equalsToConstant(expression2, expression6) && (!getSupportFontVariations() || ExpressionsKt.equalsToConstant(expression3, expression7))) {
            return;
        }
        applyTypeface(t4, expression, newFontWeight, expression2, expression3, typefaceResolver, resolver);
        observeTypeface(t4, expression, newFontWeight, expression2, expression3, typefaceResolver, resolver);
        observeFontVariationSettings(t4, newFontWeight, expression2, expression3, resolver);
    }

    private static final <T extends TextView & ExpressionSubscriber> void observeTypeface(T t4, Expression<String> expression, Expression<EnumC0791e6> expression2, Expression<Long> expression3, Expression<JSONObject> expression4, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.isConstantOrNull(expression) && ExpressionsKt.isConstant(expression2) && ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        TextViewExtensionsKt$observeTypeface$callback$1 textViewExtensionsKt$observeTypeface$callback$1 = new TextViewExtensionsKt$observeTypeface$callback$1(t4, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
        if (expression != null) {
            t4.addSubscription(expression.observe(expressionResolver, textViewExtensionsKt$observeTypeface$callback$1));
        }
        T t5 = t4;
        t5.addSubscription(expression2.observe(expressionResolver, textViewExtensionsKt$observeTypeface$callback$1));
        if (expression3 != null) {
            t5.addSubscription(expression3.observe(expressionResolver, textViewExtensionsKt$observeTypeface$callback$1));
        }
    }

    @NotNull
    public static final String getFontVariations(@Nullable EnumC0791e6 enumC0791e6, @Nullable Integer num, @Nullable JSONObject jSONObject) {
        int typefaceValue = DivTypefaceResolverKt.getTypefaceValue(enumC0791e6, num);
        if (jSONObject == null || JsonUtilsKt.isEmpty(jSONObject)) {
            return getVariation("wght", Integer.valueOf(typefaceValue));
        }
        if (!jSONObject.has("wght")) {
            jSONObject.put("wght", typefaceValue);
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jSONObject.get(key);
            if (obj instanceof Number) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                createListBuilder.add(getVariation(key, (Number) obj));
            }
        }
        return CollectionsKt.joinToString$default(CollectionsKt.build(createListBuilder), ", ", null, null, 0, null, null, 62, null);
    }
}
