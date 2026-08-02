package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes9.dex */
public abstract class FooterComponentKt {
    public static final LinearLayout makeView(FooterComponent footerComponent, MarkwonImpl markwonImpl, ArrayList arrayList, List list, Footer footer) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        list.getClass();
        Context context = (Context) markwonImpl.parser;
        View inflate = LayoutInflater.from(context).inflate(R.layout.pi2_ui_footer, (ViewGroup) null, false);
        int i = R.id.footer_begin_margin;
        if (((Guideline) ViewBindings.findChildViewById(inflate, R.id.footer_begin_margin)) != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            int i2 = R.id.footer_container_inner;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.footer_container_inner);
            if (constraintLayout != null) {
                i2 = R.id.footer_end_margin;
                if (((Guideline) ViewBindings.findChildViewById(inflate, R.id.footer_end_margin)) != null) {
                    i2 = R.id.hairline;
                    View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.hairline);
                    if (findChildViewById != null) {
                        Integer backgroundColor = footer.getBackgroundColor();
                        if (backgroundColor != null) {
                            linearLayout.setBackgroundColor(backgroundColor.intValue());
                        }
                        StyleElements.SizeSet padding = footer.getPadding();
                        if (padding != null) {
                            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.startEndMargin);
                            StyleElements.Size left = padding.getLeft();
                            int dpToPx = (left == null || (dp5 = left.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp5.doubleValue());
                            if (dpToPx < dimensionPixelOffset) {
                                dpToPx = dimensionPixelOffset;
                            }
                            StyleElements.Size right = padding.getRight();
                            int dpToPx2 = (right == null || (dp4 = right.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp4.doubleValue());
                            if (dpToPx2 >= dimensionPixelOffset) {
                                dimensionPixelOffset = dpToPx2;
                            }
                            StyleElements.Size top = padding.getTop();
                            int dpToPx3 = (top == null || (dp3 = top.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
                            StyleElements.Size bottom = padding.getBottom();
                            constraintLayout.setPadding(dpToPx, dpToPx3, dimensionPixelOffset, (bottom == null || (dp2 = bottom.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp2.doubleValue()));
                        }
                        StyleElements.SizeSet borderWidth = footer.getBorderWidth();
                        if (borderWidth != null) {
                            ViewGroup.LayoutParams layoutParams = findChildViewById.getLayoutParams();
                            if (layoutParams == null) {
                                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                return null;
                            }
                            StyleElements.Size top2 = borderWidth.getTop();
                            layoutParams.height = (top2 == null || (dp = top2.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp.doubleValue());
                            findChildViewById.setLayoutParams(layoutParams);
                        } else {
                            ViewGroup.LayoutParams layoutParams2 = findChildViewById.getLayoutParams();
                            if (layoutParams2 == null) {
                                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                return null;
                            }
                            layoutParams2.height = (int) ExtensionsKt.getDpToPx(1.0d);
                            findChildViewById.setLayoutParams(layoutParams2);
                        }
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
                        StacksKt.setupVerticalStack(constraintLayout, constraintSet, arrayList, arrayList2, StyleElements.PositionType.CENTER, 0);
                        constraintSet.applyTo(constraintLayout);
                        linearLayout.getClass();
                        return linearLayout;
                    }
                }
            }
            i = i2;
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
