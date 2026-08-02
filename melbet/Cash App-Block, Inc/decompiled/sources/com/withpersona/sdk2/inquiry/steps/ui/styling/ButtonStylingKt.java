package com.withpersona.sdk2.inquiry.steps.ui.styling;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.integrity.internal.ah;
import com.miteksystems.misnap.workflow.a.o;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public abstract class ButtonStylingKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isEmpty$isNullOrZero(StyleElements.Size size) {
        if (size == null) {
            return true;
        }
        if (size instanceof StyleElements.Size.PercentSize) {
            return ((StyleElements.Size.PercentSize) size).getPercent() == 0.0d;
        }
        if (!(size instanceof StyleElements.DPSize)) {
            return size.getDp() == null || Intrinsics.areEqual(size.getDp());
        }
        StyleElements.DPSize dPSize = (StyleElements.DPSize) size;
        return dPSize.getDp() == null || dPSize.getDp().doubleValue() == 0.0d;
    }

    public static final void style$applyStyles(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z, boolean z2) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Double dp6;
        Double dp7;
        Double dp8;
        Integer baseTextColorValue = baseButtonComponentStyle.getBaseTextColorValue();
        if (baseTextColorValue != null) {
            int intValue = baseTextColorValue.intValue();
            Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
            int intValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : intValue;
            Integer disabledTextColorValue = baseButtonComponentStyle.getDisabledTextColorValue();
            button.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{intValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : intValue, intValue}));
        }
        Double fontSizeValue = baseButtonComponentStyle.getFontSizeValue();
        if (fontSizeValue != null) {
            button.setTextSize((float) fontSizeValue.doubleValue());
        }
        Double letterSpacingValue = baseButtonComponentStyle.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            button.setLetterSpacing((float) (letterSpacingValue.doubleValue() / button.getTextSize()));
        }
        String fontNameValue = baseButtonComponentStyle.getFontNameValue();
        StyleElements.FontWeight fontWeightValue = baseButtonComponentStyle.getFontWeightValue();
        if (fontWeightValue == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        TextStylingKt.setTypeface(button, fontNameValue, fontWeightValue, new InstantKt$$ExternalSyntheticLambda0(3));
        Double lineHeightValue = baseButtonComponentStyle.getLineHeightValue();
        if (lineHeightValue != null) {
            button.setLineHeight((int) ExtensionsKt.getDpToPx(lineHeightValue.doubleValue()));
        }
        button.isEnabled();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Double borderWidthValue = baseButtonComponentStyle.getBorderWidthValue();
        int dpToPx = borderWidthValue != null ? (int) ExtensionsKt.getDpToPx(borderWidthValue.doubleValue()) : 0;
        Integer baseBorderColorValue = baseButtonComponentStyle.getBaseBorderColorValue();
        int intValue3 = baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0;
        Integer activeTextColorValue2 = baseButtonComponentStyle.getActiveTextColorValue();
        int intValue4 = activeTextColorValue2 != null ? activeTextColorValue2.intValue() : intValue3;
        Integer disabledTextColorValue2 = baseButtonComponentStyle.getDisabledTextColorValue();
        gradientDrawable.setStroke(dpToPx, new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{intValue4, disabledTextColorValue2 != null ? disabledTextColorValue2.intValue() : intValue3, intValue3}));
        Double borderRadiusValue = baseButtonComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            float dpToPx2 = (float) ExtensionsKt.getDpToPx(borderRadiusValue.doubleValue());
            Drawable mutate = gradientDrawable.mutate();
            mutate.getClass();
            ((GradientDrawable) mutate).setCornerRadii(new float[]{dpToPx2, dpToPx2, dpToPx2, dpToPx2, dpToPx2, dpToPx2, dpToPx2, dpToPx2});
        }
        Integer baseBackgroundColorValue = baseButtonComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            Integer activeBackgroundColorValue = baseButtonComponentStyle.getActiveBackgroundColorValue();
            int intValue5 = activeBackgroundColorValue != null ? activeBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            Integer disabledBackgroundColorValue = baseButtonComponentStyle.getDisabledBackgroundColorValue();
            int intValue6 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{intValue5, intValue6, baseBackgroundColorValue.intValue()});
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{intValue5, intValue6, baseBackgroundColorValue.intValue()}));
        }
        button.setBackground(gradientDrawable);
        button.setBackgroundTintList(null);
        float f = RecyclerView.DECELERATION_RATE;
        button.setElevation(RecyclerView.DECELERATION_RATE);
        button.setStateListAnimator(null);
        button.setAllCaps(false);
        Object parent = button.getParent();
        View view = parent instanceof ButtonWithLoadingIndicator ? (View) parent : button;
        StyleElements.SizeSet marginValue = baseButtonComponentStyle.getMarginValue();
        if (marginValue != null && (!z || !isEmpty$isNullOrZero(marginValue.getTop()) || !isEmpty$isNullOrZero(marginValue.getBottom()) || !isEmpty$isNullOrZero(marginValue.getLeft()) || !isEmpty$isNullOrZero(marginValue.getRight()))) {
            ViewUtilsKt.setMargins(button, marginValue);
            if (view instanceof ButtonWithLoadingIndicator) {
                o oVar = ((ButtonWithLoadingIndicator) view).binding;
                ProgressBar progressBar = (ProgressBar) oVar.c;
                StyleElements.Size left = marginValue.getLeft();
                int paddingLeft = (left == null || (dp8 = left.getDp()) == null) ? ((ProgressBar) oVar.c).getPaddingLeft() : (int) ExtensionsKt.getDpToPx(dp8.doubleValue());
                StyleElements.Size top = marginValue.getTop();
                int paddingTop = (top == null || (dp7 = top.getDp()) == null) ? ((ProgressBar) oVar.c).getPaddingTop() : (int) ExtensionsKt.getDpToPx(dp7.doubleValue());
                StyleElements.Size right = marginValue.getRight();
                int paddingRight = (right == null || (dp6 = right.getDp()) == null) ? ((ProgressBar) oVar.c).getPaddingRight() : (int) ExtensionsKt.getDpToPx(dp6.doubleValue());
                StyleElements.Size bottom = marginValue.getBottom();
                progressBar.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp5 = bottom.getDp()) == null) ? ((ProgressBar) oVar.c).getPaddingBottom() : (int) ExtensionsKt.getDpToPx(dp5.doubleValue()));
            }
        }
        StyleElements.SizeSet paddingValue = baseButtonComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left2 = paddingValue.getLeft();
            int paddingLeft2 = (left2 == null || (dp4 = left2.getDp()) == null) ? button.getPaddingLeft() : (int) ExtensionsKt.getDpToPx(dp4.doubleValue());
            StyleElements.Size top2 = paddingValue.getTop();
            int paddingTop2 = (top2 == null || (dp3 = top2.getDp()) == null) ? button.getPaddingTop() : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
            StyleElements.Size right2 = paddingValue.getRight();
            int paddingRight2 = (right2 == null || (dp2 = right2.getDp()) == null) ? button.getPaddingRight() : (int) ExtensionsKt.getDpToPx(dp2.doubleValue());
            StyleElements.Size bottom2 = paddingValue.getBottom();
            button.setPadding(paddingLeft2, paddingTop2, paddingRight2, (bottom2 == null || (dp = bottom2.getDp()) == null) ? button.getPaddingBottom() : (int) ExtensionsKt.getDpToPx(dp.doubleValue()));
        }
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        Double widthValue = baseButtonComponentStyle.getWidthValue();
        if (widthValue != null) {
            double doubleValue = widthValue.doubleValue();
            if (z2) {
                int dpToPx3 = (int) ExtensionsKt.getDpToPx(doubleValue);
                if (dpToPx3 <= measuredWidth) {
                    measuredWidth = dpToPx3;
                }
                layoutParams.width = measuredWidth;
            }
        }
        Double heightValue = baseButtonComponentStyle.getHeightValue();
        if (heightValue != null) {
            double doubleValue2 = heightValue.doubleValue();
            if (z2) {
                layoutParams.height = (int) ExtensionsKt.getDpToPx(doubleValue2);
            }
        }
        if (view instanceof ButtonWithLoadingIndicator) {
            int i = layoutParams.height;
            ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i2 = i + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams3 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            layoutParams.height = i2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        }
        StyleElements.PositionType justificationValue = baseButtonComponentStyle.getJustificationValue();
        if (justificationValue != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams;
            int i3 = WhenMappings.$EnumSwitchMapping$0[justificationValue.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    f = 0.5f;
                } else {
                    if (i3 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    f = 1.0f;
                }
            }
            layoutParams4.horizontalBias = f;
        }
        view.setLayoutParams(layoutParams);
    }

    public static void style$default(ButtonWithLoadingIndicator buttonWithLoadingIndicator, BaseButtonComponentStyle baseButtonComponentStyle) {
        style$default(buttonWithLoadingIndicator.button, baseButtonComponentStyle, false, false, 6);
        Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
        if (activeTextColorValue != null) {
            ((ProgressBar) buttonWithLoadingIndicator.binding.c).setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{activeTextColorValue.intValue()}));
        }
    }

    public static void style$default(final Button button, final BaseButtonComponentStyle baseButtonComponentStyle, final boolean z, final boolean z2, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        button.getClass();
        if (button.isLaidOut()) {
            style$applyStyles(baseButtonComponentStyle, button, z2, z);
        } else {
            ah.addOneShotPreDrawListenerAndDiscardFrame(button, new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ButtonStylingKt.style$applyStyles(BaseButtonComponentStyle.this, button, z2, z);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
