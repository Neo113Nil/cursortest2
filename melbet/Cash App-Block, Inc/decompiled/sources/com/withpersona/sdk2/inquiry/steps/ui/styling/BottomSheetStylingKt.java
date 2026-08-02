package com.withpersona.sdk2.inquiry.steps.ui.styling;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.hash.AbstractHashFunction;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import java.util.Iterator;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public abstract class BottomSheetStylingKt {
    public static void applyBottomSheetStyles$default(ViewGroup viewGroup, StepStyle stepStyle, View view, Rect rect, int i) {
        int colorFromAttr$default;
        Double dp;
        StyleElements.SizeSet modalPaddingValue;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        boolean z;
        Integer backgroundColorValue;
        if ((i & 2) != 0) {
            view = viewGroup;
        }
        if ((i & 4) != 0) {
            rect = null;
        }
        boolean z2 = (i & 8) == 0;
        viewGroup.getClass();
        view.getClass();
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = viewGroup.getContext();
            context.getClass();
            colorFromAttr$default = ResToolsKt.getColorFromAttr$default(context, R.attr.colorSurface);
        } else {
            colorFromAttr$default = backgroundColorValue.intValue();
        }
        viewGroup.setBackgroundTintList(ColorStateList.valueOf(colorFromAttr$default));
        int i2 = 2;
        if (stepStyle != null) {
            Context context2 = viewGroup.getContext();
            context2.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(stepStyle, context2);
            if (backgroundImageDrawable != null) {
                FilteringSequence filter = SequencesKt___SequencesKt.filter(new ViewGroupKt$children$1(viewGroup), new InstantKt$$ExternalSyntheticLambda0(i2));
                Iterator it = filter.sequence.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (((Boolean) filter.predicate.invoke(it.next())).booleanValue() == filter.sendWhen) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    FilteringSequence$iterator$1 filteringSequence$iterator$1 = (FilteringSequence$iterator$1) filter.iterator();
                    if (!filteringSequence$iterator$1.hasNext()) {
                        OptionalProvider$$ExternalSyntheticLambda0.m("Sequence is empty.");
                        return;
                    }
                    ((View) filteringSequence$iterator$1.next()).setBackground(backgroundImageDrawable);
                } else {
                    Context context3 = viewGroup.getContext();
                    context3.getClass();
                    View backgroundImage = new BackgroundImage(context3);
                    backgroundImage.setBackground(backgroundImageDrawable);
                    viewGroup.addView(backgroundImage, 0);
                    ViewGroup.LayoutParams layoutParams = backgroundImage.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        return;
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                    layoutParams2.startToStart = viewGroup.getId();
                    layoutParams2.endToEnd = viewGroup.getId();
                    layoutParams2.topToTop = viewGroup.getId();
                    layoutParams2.bottomToBottom = viewGroup.getId();
                    backgroundImage.setLayoutParams(layoutParams2);
                }
            }
        }
        if (!z2 && stepStyle != null && (modalPaddingValue = stepStyle.getModalPaddingValue()) != null) {
            StyleElements.Size left = modalPaddingValue.getLeft();
            if (left == null || (dp5 = left.getDp()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(((int) ExtensionsKt.getDpToPx(dp5.doubleValue())) - (rect != null ? rect.left : 0));
            }
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top == null || (dp4 = top.getDp()) == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(((int) ExtensionsKt.getDpToPx(dp4.doubleValue())) - (rect != null ? rect.top : 0));
            }
            StyleElements.Size right = modalPaddingValue.getRight();
            if (right == null || (dp3 = right.getDp()) == null) {
                num3 = null;
            } else {
                num3 = Integer.valueOf(((int) ExtensionsKt.getDpToPx(dp3.doubleValue())) - (rect != null ? rect.right : 0));
            }
            StyleElements.Size bottom = modalPaddingValue.getBottom();
            if (bottom == null || (dp2 = bottom.getDp()) == null) {
                num4 = null;
            } else {
                num4 = Integer.valueOf(((int) ExtensionsKt.getDpToPx(dp2.doubleValue())) - (rect != null ? rect.bottom : 0));
            }
            view.setPadding(num != null ? num.intValue() : viewGroup.getPaddingLeft(), num2 != null ? num2.intValue() : viewGroup.getPaddingTop(), num3 != null ? num3.intValue() : viewGroup.getPaddingRight(), num4 != null ? num4.intValue() : viewGroup.getPaddingBottom());
        }
        StyleElements.Size modalBorderRadiusValue = stepStyle != null ? stepStyle.getModalBorderRadiusValue() : null;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float dpToPx = (float) ExtensionsKt.getDpToPx((modalBorderRadiusValue == null || (dp = modalBorderRadiusValue.getDp()) == null) ? 12.0d : dp.doubleValue());
        gradientDrawable.setCornerRadii(new float[]{dpToPx, dpToPx, dpToPx, dpToPx, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE});
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        viewGroup.setBackground(gradientDrawable);
    }
}
