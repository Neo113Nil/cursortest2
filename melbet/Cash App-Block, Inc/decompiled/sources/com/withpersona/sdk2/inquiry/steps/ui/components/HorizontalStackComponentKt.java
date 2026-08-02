package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSecureTextBinding;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes9.dex */
public abstract class HorizontalStackComponentKt {
    public static final ConstraintLayout makeView(HorizontalStackComponent horizontalStackComponent, MarkwonImpl markwonImpl, ArrayList arrayList, List list, HorizontalStack horizontalStack) {
        StyleElements.Axis axis;
        StyleElements.Size gapValue;
        Double dp;
        list.getClass();
        View inflate = ((LayoutInflater) markwonImpl.visitorFactory).inflate(R.layout.pi2_ui_horizontal_stack, (ViewGroup) null, false);
        if (inflate == null) {
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        Pi2UiSecureTextBinding pi2UiSecureTextBinding = new Pi2UiSecureTextBinding(constraintLayout, 2);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        List<View> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (View view : list2) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            constraintLayout.addView(view);
            arrayList2.add(Integer.valueOf(view.getId()));
        }
        HorizontalStack.HorizontalStackComponentStyle styles = horizontalStack.getStyles();
        int dpToPx = (int) ExtensionsKt.getDpToPx((styles == null || (gapValue = styles.getGapValue()) == null || (dp = gapValue.getDp()) == null) ? 16.0d : dp.doubleValue());
        if (styles == null || (axis = styles.getAxisValue()) == null) {
            axis = StyleElements.Axis.HORIZONTAL;
        }
        StyleElements.Axis axis2 = StyleElements.Axis.HORIZONTAL;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) pi2UiSecureTextBinding.rootView;
        if (axis == axis2) {
            StacksKt.setupHorizontalStack(constraintLayout2, constraintSet, arrayList, arrayList2, styles != null ? styles.getChildSizesValue() : null, styles != null ? styles.getAlignmentValue() : null, dpToPx);
        } else {
            StacksKt.setupVerticalStack(constraintLayout2, constraintSet, arrayList, arrayList2, styles != null ? styles.getAlignmentValue() : null, dpToPx);
        }
        if (styles != null) {
            ((LinkedList) markwonImpl.plugins).add(new StateFlowsKt$$ExternalSyntheticLambda2(22, pi2UiSecureTextBinding, styles));
        }
        constraintSet.applyTo(constraintLayout);
        return constraintLayout;
    }
}
