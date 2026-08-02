package com.withpersona.sdk2.inquiry.steps.ui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.constraintlayout.widget.ConstraintLayout;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.integrity.internal.ak;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public abstract class ViewUtilsKt {
    public static final void applyHeight(View view, StyleElements.Size size) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        if (size instanceof StyleElements.DPSize) {
            layoutParams.height = (int) ExtensionsKt.getDpToPx(((StyleElements.DPSize) size).getDp().doubleValue());
        } else if (size instanceof StyleElements.Size.PercentSize) {
            Object parent = view.getParent();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentHeight = (float) ((StyleElements.Size.PercentSize) size).getPercent();
            } else if (parent instanceof View) {
                layoutParams.height = (int) (((StyleElements.Size.PercentSize) size).getPercent() * ((View) parent).getHeight());
            }
        } else if (size != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void applyWidth(View view, StyleElements.Size size) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (size instanceof StyleElements.DPSize) {
            int dpToPx = (int) ExtensionsKt.getDpToPx(((StyleElements.DPSize) size).getDp().doubleValue());
            ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            int i = Integer.MAX_VALUE;
            if ((layoutParams2 == null || layoutParams2.width != -2) && view2 != null) {
                i = view2.getWidth();
            }
            if (dpToPx > i) {
                dpToPx = i;
            }
            layoutParams.width = dpToPx;
        } else if (size instanceof StyleElements.Size.PercentSize) {
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = (float) ((StyleElements.Size.PercentSize) size).getPercent();
            } else if (view2 != null) {
                layoutParams.width = (int) (((StyleElements.Size.PercentSize) size).getPercent() * view2.getWidth());
            }
        } else if (size != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void setMargins(View view, StyleElements.SizeSet sizeSet) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            StyleElements.Size left = sizeSet.getLeft();
            marginLayoutParams.leftMargin = (left == null || (dp4 = left.getDp()) == null) ? marginLayoutParams.leftMargin : (int) ExtensionsKt.getDpToPx(dp4.doubleValue());
            StyleElements.Size right = sizeSet.getRight();
            marginLayoutParams.rightMargin = (right == null || (dp3 = right.getDp()) == null) ? marginLayoutParams.rightMargin : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
            StyleElements.Size top = sizeSet.getTop();
            marginLayoutParams.topMargin = (top == null || (dp2 = top.getDp()) == null) ? marginLayoutParams.topMargin : (int) ExtensionsKt.getDpToPx(dp2.doubleValue());
            StyleElements.Size bottom = sizeSet.getBottom();
            marginLayoutParams.bottomMargin = (bottom == null || (dp = bottom.getDp()) == null) ? marginLayoutParams.bottomMargin : (int) ExtensionsKt.getDpToPx(dp.doubleValue());
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void setOrClearError(TextInputLayout textInputLayout, String str, TextBasedComponentStyle textBasedComponentStyle) {
        textInputLayout.getClass();
        if (str == null || StringsKt.isBlank(str)) {
            textInputLayout.setErrorEnabled(false);
            return;
        }
        textInputLayout.setError(str);
        if (textBasedComponentStyle != null) {
            SpannableString spannableString = new SpannableString(textInputLayout.getError());
            String fontNameValue = textBasedComponentStyle.getFontNameValue();
            if (fontNameValue != null) {
                Context context = textInputLayout.getContext();
                context.getClass();
                Typeface typeface = ak.getTypeface(context, fontNameValue);
                if (typeface != null) {
                    spannableString.setSpan(new TypefaceSpan(typeface, 1), 0, spannableString.length(), 33);
                }
            }
            Double fontSizeValue = textBasedComponentStyle.getFontSizeValue();
            if (fontSizeValue != null) {
                spannableString.setSpan(new AbsoluteSizeSpan((int) ExtensionsKt.getDpToPx(fontSizeValue.doubleValue())), 0, spannableString.length(), 33);
            }
            textInputLayout.setError(spannableString);
        }
    }
}
