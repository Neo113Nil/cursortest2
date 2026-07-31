package com.yandex.div.core.animation;

import O1.AbstractC0861i4;
import O1.AbstractC1086uf;
import O1.C0892k0;
import O1.C0910l0;
import O1.E2;
import O1.EnumC1145y2;
import O1.EnumC1163z2;
import O1.F2;
import O1.M3;
import O1.W8;
import W1.m;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivVariableAnimatorBuilder {

    @NotNull
    public static final DivVariableAnimatorBuilder INSTANCE = new DivVariableAnimatorBuilder();

    private DivVariableAnimatorBuilder() {
    }

    private final Animator buildColorAnimator(Div2View div2View, M3 m32, C0910l0 c0910l0, ExpressionResolver expressionResolver) {
        Integer colorIntValue;
        Integer colorIntValue2;
        String h4 = m32.h();
        VariableController variableController = UtilsKt.getVariableController(expressionResolver);
        Integer num = null;
        Variable mutableVariable = variableController != null ? variableController.getMutableVariable(h4) : null;
        if (!(mutableVariable instanceof Variable.ColorVariable)) {
            mutableVariable = null;
        }
        Variable.ColorVariable colorVariable = (Variable.ColorVariable) mutableVariable;
        if (colorVariable == null) {
            DivActionTypedUtilsKt.logError(div2View, new MissingVariableException("Unable to find color variable with name '" + m32.h() + '\'', null, 2, null));
            return null;
        }
        AbstractC1086uf abstractC1086uf = c0910l0.f6886h;
        if (abstractC1086uf == null || (colorIntValue2 = DivActionTypedUtilsKt.colorIntValue(abstractC1086uf, expressionResolver)) == null) {
            Expression expression = m32.f3821j;
            if (expression != null) {
                num = (Integer) expression.evaluate(expressionResolver);
            }
        } else {
            num = colorIntValue2;
        }
        AbstractC1086uf abstractC1086uf2 = c0910l0.f6882d;
        int intValue = (abstractC1086uf2 == null || (colorIntValue = DivActionTypedUtilsKt.colorIntValue(abstractC1086uf2, expressionResolver)) == null) ? ((Number) m32.f3816e.evaluate(expressionResolver)).intValue() : colorIntValue.intValue();
        if (num != null) {
            colorVariable.setValueDirectly(Color.m210boximpl(Color.m211constructorimpl(num.intValue())));
        }
        ObjectAnimator ofArgb = ObjectAnimator.ofArgb(colorVariable, ColorIntValueProperty.INSTANCE, intValue);
        Intrinsics.checkNotNullExpressionValue(ofArgb, "ofArgb(variable, ColorIntValueProperty, endValue)");
        return configure(ofArgb, div2View, m32, c0910l0, expressionResolver);
    }

    private final Animator buildDoubleAnimator(Div2View div2View, W8 w8, C0910l0 c0910l0, ExpressionResolver expressionResolver, Variable.DoubleVariable doubleVariable) {
        Double d4;
        Double doubleValue;
        AbstractC1086uf abstractC1086uf = c0910l0.f6886h;
        if (abstractC1086uf == null || (d4 = DivActionTypedUtilsKt.doubleValue(abstractC1086uf, expressionResolver)) == null) {
            Expression expression = w8.f5131j;
            d4 = expression != null ? (Double) expression.evaluate(expressionResolver) : null;
        }
        AbstractC1086uf abstractC1086uf2 = c0910l0.f6882d;
        double doubleValue2 = (abstractC1086uf2 == null || (doubleValue = DivActionTypedUtilsKt.doubleValue(abstractC1086uf2, expressionResolver)) == null) ? ((Number) w8.f5126e.evaluate(expressionResolver)).doubleValue() : doubleValue.doubleValue();
        if (d4 != null) {
            doubleVariable.setValueDirectly(d4);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(doubleVariable, NumberValueProperty.INSTANCE, (float) doubleValue2);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(variable, Number…erty, endValue.toFloat())");
        return configure(ofFloat, div2View, w8, c0910l0, expressionResolver);
    }

    private final Animator buildIntegerAnimator(Div2View div2View, W8 w8, C0910l0 c0910l0, ExpressionResolver expressionResolver, Variable.IntegerVariable integerVariable) {
        Object evaluate;
        Object evaluate2;
        AbstractC1086uf abstractC1086uf = c0910l0.f6886h;
        if (abstractC1086uf == null || (evaluate = DivActionTypedUtilsKt.longValue(abstractC1086uf, expressionResolver)) == null) {
            Expression expression = w8.f5131j;
            evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        }
        AbstractC1086uf abstractC1086uf2 = c0910l0.f6882d;
        if (abstractC1086uf2 == null || (evaluate2 = DivActionTypedUtilsKt.longValue(abstractC1086uf2, expressionResolver)) == null) {
            evaluate2 = w8.f5126e.evaluate(expressionResolver);
        }
        if (evaluate != null) {
            integerVariable.setValueDirectly(evaluate);
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(integerVariable, IntegerValueProperty.INSTANCE, ((Number) evaluate2).intValue());
        Intrinsics.checkNotNullExpressionValue(ofInt, "ofInt(variable, IntegerV…operty, endValue.toInt())");
        return configure(ofInt, div2View, w8, c0910l0, expressionResolver);
    }

    private final Animator buildNumberAnimator(Div2View div2View, W8 w8, C0910l0 c0910l0, ExpressionResolver expressionResolver) {
        String h4 = w8.h();
        VariableController variableController = UtilsKt.getVariableController(expressionResolver);
        Object mutableVariable = variableController != null ? variableController.getMutableVariable(h4) : null;
        if (mutableVariable == null) {
            mutableVariable = null;
        }
        if (mutableVariable instanceof Variable.IntegerVariable) {
            return buildIntegerAnimator(div2View, w8, c0910l0, expressionResolver, (Variable.IntegerVariable) mutableVariable);
        }
        if (mutableVariable instanceof Variable.DoubleVariable) {
            return buildDoubleAnimator(div2View, w8, c0910l0, expressionResolver, (Variable.DoubleVariable) mutableVariable);
        }
        DivActionTypedUtilsKt.logError(div2View, new MissingVariableException("Unable to find number variable with name '" + w8.h() + '\'', null, 2, null));
        return null;
    }

    private final ObjectAnimator configure(ObjectAnimator objectAnimator, final Div2View div2View, F2 f22, C0910l0 c0910l0, final ExpressionResolver expressionResolver) {
        EnumC1145y2 enumC1145y2;
        EnumC1163z2 enumC1163z2;
        int i4;
        Expression expression = c0910l0.f6880b;
        if (expression == null || (enumC1145y2 = (EnumC1145y2) expression.evaluate(expressionResolver)) == null) {
            enumC1145y2 = (EnumC1145y2) f22.c().evaluate(expressionResolver);
        }
        Expression expression2 = c0910l0.f6881c;
        if (expression2 == null) {
            expression2 = f22.getDuration();
        }
        objectAnimator.setDuration(((Number) expression2.evaluate(expressionResolver)).longValue());
        Expression expression3 = c0910l0.f6885g;
        if (expression3 == null) {
            expression3 = f22.f();
        }
        objectAnimator.setStartDelay(((Number) expression3.evaluate(expressionResolver)).longValue());
        Expression expression4 = c0910l0.f6883e;
        if (expression4 == null || (enumC1163z2 = (EnumC1163z2) expression4.evaluate(expressionResolver)) == null) {
            enumC1163z2 = (EnumC1163z2) f22.d().evaluate(expressionResolver);
        }
        objectAnimator.setInterpolator(DivUtilKt.androidInterpolator(enumC1163z2, DivUtilKt.isReversed(enumC1145y2)));
        AbstractC0861i4 abstractC0861i4 = c0910l0.f6884f;
        if (abstractC0861i4 == null) {
            abstractC0861i4 = f22.b();
        }
        if (abstractC0861i4 instanceof AbstractC0861i4.c) {
            i4 = g.d(((int) ((Number) ((AbstractC0861i4.c) abstractC0861i4).c().f2967a.evaluate(expressionResolver)).longValue()) - 1, 0);
        } else {
            if (!(abstractC0861i4 instanceof AbstractC0861i4.d)) {
                throw new m();
            }
            i4 = -1;
        }
        objectAnimator.setRepeatCount(i4);
        objectAnimator.setRepeatMode(DivUtilKt.isAlternated(enumC1145y2) ? 2 : 1);
        final List a4 = f22.a();
        if (a4 != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$2$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    Iterator it = a4.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((C0892k0) it.next(), "animation_end", expressionResolver);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
        }
        final List e4 = f22.e();
        if (e4 != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$5$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                    Iterator it = e4.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((C0892k0) it.next(), "animation_cancel", expressionResolver);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
        }
        return objectAnimator;
    }

    @Nullable
    public final Animator build(@NotNull Div2View divView, @NotNull E2 animator, @NotNull C0910l0 startAction, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(startAction, "startAction");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        if (animator instanceof E2.d) {
            return buildNumberAnimator(divView, ((E2.d) animator).c(), startAction, expressionResolver);
        }
        if (animator instanceof E2.a) {
            return buildColorAnimator(divView, ((E2.a) animator).c(), startAction, expressionResolver);
        }
        throw new m();
    }
}
