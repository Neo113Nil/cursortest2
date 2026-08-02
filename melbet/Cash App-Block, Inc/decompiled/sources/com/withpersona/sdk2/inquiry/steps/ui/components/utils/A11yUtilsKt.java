package com.withpersona.sdk2.inquiry.steps.ui.components.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.timepicker.ClockFaceView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.TextBlock;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes9.dex */
public abstract class A11yUtilsKt {
    public static final void generateAndAddViews(LinearLayout linearLayout, List list, TextBasedComponentStyle textBasedComponentStyle, boolean z) {
        View view;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            TextBlock textBlock = (TextBlock) it.next();
            if (textBlock instanceof TextBlock.ListTextBlock) {
                TextBlock.ListTextBlock listTextBlock = (TextBlock.ListTextBlock) textBlock;
                Context context = linearLayout.getContext();
                context.getClass();
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout2.setOrientation(1);
                generateAndAddViews(linearLayout2, listTextBlock.textBlocks, textBasedComponentStyle, true);
                ViewCompat.setAccessibilityDelegate(linearLayout2, new ClockFaceView.AnonymousClass2(listTextBlock, 10));
                view = linearLayout2;
            } else {
                if (!(textBlock instanceof TextBlock.RegularTextBlock)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                TextBlock.RegularTextBlock regularTextBlock = (TextBlock.RegularTextBlock) textBlock;
                Context context2 = linearLayout.getContext();
                context2.getClass();
                Integer valueOf = z ? Integer.valueOf(i) : null;
                TextView textView = new TextView(context2);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                ExtensionsKt.setParsedMarkdown(textView, regularTextBlock.spanned);
                if (valueOf != null) {
                    ViewCompat.setAccessibilityDelegate(textView, new ClockFaceView.AnonymousClass2(valueOf, 11));
                }
                if (textBasedComponentStyle != null) {
                    TextStylingKt.style(textView, textBasedComponentStyle, SetsKt__SetsJVMKt.setOf(TextStyleElements.Margin));
                }
                view = textView;
            }
            if (i != CollectionsKt__CollectionsKt.getLastIndex(list)) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    return;
                } else {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomMargin = (int) com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(8.0d);
                    view.setLayoutParams(layoutParams2);
                }
            }
            linearLayout.addView(view);
            i = i2;
        }
    }
}
