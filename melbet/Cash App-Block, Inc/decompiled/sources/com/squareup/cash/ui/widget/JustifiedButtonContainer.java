package com.squareup.cash.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.common.resources.R$styleable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes4.dex */
public final class JustifiedButtonContainer extends LinearLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final boolean applyGravity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JustifiedButtonContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.JustifiedButtonContainer);
        obtainStyledAttributes.getClass();
        this.applyGravity = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public static void setHorizontalGravity(TextView textView, int i) {
        textView.setGravity(i | ((-8388616) & textView.getGravity()));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        if (!(view instanceof TextView)) {
            a$$ExternalSyntheticBUOutline0.m$3("Children must extend from TextView");
            return;
        }
        super.addView(view, i, layoutParams);
        if (this.applyGravity) {
            ViewTreeObserver viewTreeObserver = ((TextView) view).getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.squareup.cash.ui.widget.JustifiedButtonContainer$$ExternalSyntheticLambda0
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        int i2 = JustifiedButtonContainer.$r8$clinit;
                        JustifiedButtonContainer.this.updateButtonGravities();
                    }
                });
            }
            updateButtonGravities();
        }
    }

    public final void updateButtonGravities() {
        IntRange until = RangesKt___RangesKt.until(0, getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            View childAt = getChildAt(it.nextInt());
            childAt.getClass();
            arrayList.add((TextView) childAt);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((TextView) next).getVisibility() == 0) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        if (size != 0) {
            if (size == 1) {
                setHorizontalGravity((TextView) arrayList2.get(0), 1);
                return;
            }
            setHorizontalGravity((TextView) arrayList2.get(0), 8388611);
            int size2 = arrayList2.size() - 1;
            for (int i = 1; i < size2; i++) {
                setHorizontalGravity((TextView) arrayList2.get(i), 1);
            }
            setHorizontalGravity((TextView) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList2), 8388613);
            if (arrayList2.isEmpty()) {
                return;
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (((TextView) it3.next()).getLineCount() > 1) {
                    Rect rect = new Rect();
                    int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        TextView textView = (TextView) it4.next();
                        textView.getPaint().getTextBounds(textView.getText().toString(), 0, textView.getText().length(), rect);
                        measuredWidth -= rect.width();
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        TextView textView2 = (TextView) it5.next();
                        if (textView2.getLineCount() > 1) {
                            textView2.getPaint().getTextBounds(textView2.getText().toString(), 0, textView2.getText().length(), rect);
                            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                            if (layoutParams.width < rect.width()) {
                                int min = Math.min(rect.width() - layoutParams.width, measuredWidth);
                                measuredWidth -= min;
                                layoutParams.width += min;
                                textView2.setLayoutParams(layoutParams);
                            }
                        }
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JustifiedButtonContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JustifiedButtonContainer(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ JustifiedButtonContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
