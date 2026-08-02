package com.withpersona.sdk2.inquiry.steps.ui.styling;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes9.dex */
public abstract class StackStylingKt {
    public static final void applyMarginsAndPadding(ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        StyleElements.SizeSet marginValue = clickableStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            ViewUtilsKt.setMargins(constraintLayout, marginValue);
        }
        StyleElements.SizeSet paddingValue = clickableStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp4 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) ExtensionsKt.getDpToPx(dp4.doubleValue());
            StyleElements.Size top = paddingValue.getTop();
            int paddingTop = (top == null || (dp3 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
            StyleElements.Size right = paddingValue.getRight();
            int paddingRight = (right == null || (dp2 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) ExtensionsKt.getDpToPx(dp2.doubleValue());
            StyleElements.Size bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) ExtensionsKt.getDpToPx(dp.doubleValue()));
        }
    }

    public static final LayerDrawable getStyledBackground(ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, StackState stackState) {
        int intValue;
        Integer baseBackgroundColorValue;
        StyleElements.Size right;
        Double dp;
        StyleElements.Size left;
        Double dp2;
        StyleElements.Size bottom;
        Double dp3;
        StyleElements.Size top;
        Double dp4;
        Double dp5;
        StyleElements.Size right2;
        Double dp6;
        StyleElements.Size left2;
        Double dp7;
        StyleElements.Size bottom2;
        Double dp8;
        StyleElements.Size top2;
        Double dp9;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        StyleElements.SizeSet borderWidthValue = clickableStackComponentStyle.getBorderWidthValue();
        double d = 0.0d;
        Double valueOf = Double.valueOf((borderWidthValue == null || (top2 = borderWidthValue.getTop()) == null || (dp9 = top2.getDp()) == null) ? 0.0d : dp9.doubleValue());
        StyleElements.SizeSet borderWidthValue2 = clickableStackComponentStyle.getBorderWidthValue();
        Double valueOf2 = Double.valueOf((borderWidthValue2 == null || (bottom2 = borderWidthValue2.getBottom()) == null || (dp8 = bottom2.getDp()) == null) ? 0.0d : dp8.doubleValue());
        StyleElements.SizeSet borderWidthValue3 = clickableStackComponentStyle.getBorderWidthValue();
        Double valueOf3 = Double.valueOf((borderWidthValue3 == null || (left2 = borderWidthValue3.getLeft()) == null || (dp7 = left2.getDp()) == null) ? 0.0d : dp7.doubleValue());
        StyleElements.SizeSet borderWidthValue4 = clickableStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue4 != null && (right2 = borderWidthValue4.getRight()) != null && (dp6 = right2.getDp()) != null) {
            d = dp6.doubleValue();
        }
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{valueOf, valueOf2, valueOf3, Double.valueOf(d)});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) Math.ceil(ExtensionsKt.getDpToPx(((Number) it.next()).doubleValue()))));
        }
        int intValue2 = ((Number) CollectionsKt.maxOrThrow((Iterable) arrayList)).intValue();
        int ordinal = stackState.ordinal();
        if (ordinal == 0) {
            Integer baseBorderColorValue = clickableStackComponentStyle.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                intValue = baseBorderColorValue.intValue();
            }
            intValue = 0;
        } else if (ordinal == 1) {
            Integer activeBorderColorValue = clickableStackComponentStyle.getActiveBorderColorValue();
            if (activeBorderColorValue != null) {
                intValue = activeBorderColorValue.intValue();
            }
            intValue = 0;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Integer disabledBorderColorValue = clickableStackComponentStyle.getDisabledBorderColorValue();
            if (disabledBorderColorValue != null) {
                intValue = disabledBorderColorValue.intValue();
            }
            intValue = 0;
        }
        gradientDrawable.setStroke(intValue2, intValue);
        StyleElements.Size borderRadiusValue = clickableStackComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null && (dp5 = borderRadiusValue.getDp()) != null) {
            float dpToPx = (float) ExtensionsKt.getDpToPx(dp5.doubleValue());
            Drawable mutate = gradientDrawable.mutate();
            mutate.getClass();
            ((GradientDrawable) mutate).setCornerRadii(new float[]{dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx});
        }
        int ordinal2 = stackState.ordinal();
        if (ordinal2 == 0) {
            baseBackgroundColorValue = clickableStackComponentStyle.getBaseBackgroundColorValue();
        } else if (ordinal2 == 1) {
            baseBackgroundColorValue = clickableStackComponentStyle.getActiveBackgroundColorValue();
        } else {
            if (ordinal2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            baseBackgroundColorValue = clickableStackComponentStyle.getDisabledBackgroundColorValue();
        }
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.SizeSet borderWidthValue5 = clickableStackComponentStyle.getBorderWidthValue();
        int ceil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp4 = top.getDp()) == null) ? intValue2 : intValue2 - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp4.doubleValue())));
        StyleElements.SizeSet borderWidthValue6 = clickableStackComponentStyle.getBorderWidthValue();
        int ceil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp3 = bottom.getDp()) == null) ? intValue2 : intValue2 - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp3.doubleValue())));
        StyleElements.SizeSet borderWidthValue7 = clickableStackComponentStyle.getBorderWidthValue();
        int ceil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp2 = left.getDp()) == null) ? intValue2 : intValue2 - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp2.doubleValue())));
        StyleElements.SizeSet borderWidthValue8 = clickableStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp = right.getDp()) != null) {
            intValue2 -= (int) Math.ceil(ExtensionsKt.getDpToPx(dp.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -ceil3, -ceil, -intValue2, -ceil2);
        return layerDrawable;
    }
}
