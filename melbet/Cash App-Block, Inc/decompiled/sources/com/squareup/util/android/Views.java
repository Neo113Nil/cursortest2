package com.squareup.util.android;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.insets.SystemBarStateMonitor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes.dex */
public abstract class Views {
    public static final Views$SCALE$1 SCALE = new Views$SCALE$1(Float.TYPE, "scale");
    public static final Views$removeAccessibilityClickActionDelegate$1 removeAccessibilityClickActionDelegate = new Views$removeAccessibilityClickActionDelegate$1();

    public static final Rect boundsInWindow(View view) {
        view.getClass();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public static final Rect boundsRelativeTo(View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        view.getClass();
        PointF positionRelativeTo = positionRelativeTo(viewGroup, view);
        int i = (int) positionRelativeTo.x;
        int i2 = (int) positionRelativeTo.y;
        return new Rect(i, i2, viewGroup.getWidth() + i, viewGroup.getHeight() + i2);
    }

    public static final int dip(View view, int i) {
        view.getClass();
        return (int) TypedValue.applyDimension(1, i, view.getContext().getResources().getDisplayMetrics());
    }

    public static final Activity findActivity(View view) {
        view.getClass();
        Context context = view.getContext();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(context, "Could not find base activity. Hit ");
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static final PointF positionRelativeTo(View view, View view2) {
        view.getClass();
        view2.getClass();
        PointF pointF = new PointF();
        View view3 = view;
        do {
            pointF.offset(view3.getX(), view3.getY());
            pointF.offset(-view3.getScrollX(), -view3.getScrollY());
            Object parent = view3.getParent();
            view3 = parent instanceof View ? (View) parent : null;
            if (view3 == null) {
                throw new IllegalStateException((view2 + " is not an ancestor of " + view).toString());
            }
        } while (view3 != view2);
        return pointF;
    }

    public static final int px(View view, int i) {
        return (int) (i * view.getResources().getDisplayMetrics().density);
    }

    public static final void recurseViewTree(View view, MoneyTabUIKt$$ExternalSyntheticLambda24 moneyTabUIKt$$ExternalSyntheticLambda24) {
        view.getClass();
        moneyTabUIKt$$ExternalSyntheticLambda24.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                recurseViewTree(viewGroup.getChildAt(i), moneyTabUIKt$$ExternalSyntheticLambda24);
            }
        }
    }

    public static void resizeAndBind$default(LinearLayout linearLayout, int i, Integer num, Function0 function0, Function2 function2, int i2) {
        int i3 = (i2 & 4) != 0 ? 0 : 1;
        Integer num2 = (i2 & 8) != 0 ? null : num;
        linearLayout.getClass();
        int i4 = i3 + i;
        while (linearLayout.getChildCount() < i4) {
            linearLayout.addView((View) function0.invoke(), 0);
        }
        while (linearLayout.getChildCount() > i4) {
            linearLayout.removeViewAt(0);
        }
        boolean z = linearLayout.getOrientation() == 1;
        int i5 = 0;
        for (Object obj : SequencesKt___SequencesKt.take(SequencesKt___SequencesKt.drop(ViewGroupKt.getChildren(linearLayout), 0), i)) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            View view = (View) obj;
            Object valueOf = Integer.valueOf(i5);
            view.getClass();
            function2.invoke(valueOf, view);
            if (num2 != null) {
                int intValue = i5 < i + (-1) ? num2.intValue() : 0;
                if (z) {
                    updateMargins$default(view, 0, 0, 0, intValue, 7);
                } else {
                    updateMargins$default(view, 0, 0, intValue, 0, 11);
                }
            }
            i5 = i6;
        }
    }

    public static final void setCompoundDrawableStart(TextView textView, Drawable drawable) {
        textView.getClass();
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public static final int sp(Context context, int i) {
        context.getClass();
        return (int) TypedValue.applyDimension(2, i, context.getResources().getDisplayMetrics());
    }

    public static void updateMargins$default(View view, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            i = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        }
        if ((i5 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i2 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        }
        if ((i5 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            i3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0;
        }
        if ((i5 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            i4 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        }
        view.getClass();
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            a$$ExternalSyntheticBUOutline0.m$1("Can't use updateMargins on this view as its layoutParams is of type ".concat(view.getLayoutParams().getClass().getName()));
            return;
        }
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        if (layoutParams5 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams3.setMarginStart(i);
        marginLayoutParams3.topMargin = i2;
        marginLayoutParams3.setMarginEnd(i3);
        marginLayoutParams3.bottomMargin = i4;
        view.setLayoutParams(marginLayoutParams3);
    }

    public static void waitForMeasure$default(View view, Function3 function3) {
        view.getClass();
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            function3.invoke(view, Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
            return;
        }
        SystemBarStateMonitor.AnonymousClass3 anonymousClass3 = new SystemBarStateMonitor.AnonymousClass3(view, function3);
        if (view.isAttachedToWindow()) {
            anonymousClass3.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(anonymousClass3);
    }

    public static final float sp(Context context, float f) {
        context.getClass();
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static final float sp(View view, float f) {
        return TypedValue.applyDimension(2, f, view.getResources().getDisplayMetrics());
    }

    public static final int sp(View view, int i) {
        return (int) TypedValue.applyDimension(2, i, view.getResources().getDisplayMetrics());
    }

    public static final float dip(Context context, float f) {
        context.getClass();
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final float dip(View view, float f) {
        view.getClass();
        return TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
    }

    public static final int dip(Context context, int i) {
        context.getClass();
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
