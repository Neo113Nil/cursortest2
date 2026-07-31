package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.InterfaceC1490j3;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import j2.AbstractC3185a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.ranges.g;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class FrameContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ h[] $$delegatedProperties = {H.d(new v(FrameContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    @NotNull
    private final kotlin.properties.c aspectRatio$delegate;
    private int childState;

    @NotNull
    private final Rect foregroundPadding;

    @NotNull
    private final Set<View> matchParentChildren;
    private int maxHeight;
    private int maxWidth;
    private boolean measureAllChildren;

    @NotNull
    private final Set<View> measuredMatchParentChildren;

    @NotNull
    private final Set<View> skippedMatchParentChildren;

    public /* synthetic */ FrameContainerLayout(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    private final void considerMatchParentChildrenInMaxSize(int i4, int i5) {
        int i6;
        int i7;
        if (!this.matchParentChildren.isEmpty()) {
            boolean isExact = ViewsKt.isExact(i4);
            boolean isExact2 = ViewsKt.isExact(i5);
            if (!isExact || !isExact2) {
                boolean z4 = false;
                boolean z5 = !isExact && this.maxWidth == 0;
                if (!isExact2 && !getUseAspect() && this.maxHeight == 0) {
                    z4 = true;
                }
                if (z5 || z4) {
                    for (View view : this.matchParentChildren) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        if (this.skippedMatchParentChildren.contains(view) && ((((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1 && z5) || (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 && z4))) {
                            i6 = i4;
                            i7 = i5;
                            measureChildWithMargins(view, i6, 0, i7, 0);
                            this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                            this.skippedMatchParentChildren.remove(view);
                        } else {
                            i6 = i4;
                            i7 = i5;
                        }
                        if (z5) {
                            updateMaxWidth(view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
                        }
                        if (z4) {
                            updateMaxHeight(view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
                        }
                        i4 = i6;
                        i5 = i7;
                    }
                } else {
                    Iterator<T> it = this.matchParentChildren.iterator();
                    while (it.hasNext()) {
                        considerMatchParentMargins((View) it.next(), isExact, isExact2);
                    }
                }
            }
        }
    }

    private final void considerMatchParentMargins(View view, boolean z4, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (matchDynamicWidth(divLayoutParams, z4)) {
            updateMaxWidth(divLayoutParams.getHorizontalMargins$div_release());
        }
        if (matchDynamicHeight(divLayoutParams, z5)) {
            updateMaxHeight(divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final int getDynamicHeight(int i4, int i5, int i6) {
        if (ViewsKt.isExact(i5)) {
            return 0;
        }
        if (isDynamicAspect(i4)) {
            return AbstractC3185a.c(i6 / getAspectRatio());
        }
        int d4 = g.d(this.maxHeight + getVerticalPadding(), getSuggestedMinimumHeight());
        Drawable foreground = getForeground();
        return foreground != null ? g.d(d4, foreground.getMinimumHeight()) : d4;
    }

    private final int getDynamicWidth(int i4) {
        if (ViewsKt.isExact(i4)) {
            return 0;
        }
        int d4 = g.d(this.maxWidth + getHorizontalPadding(), getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        return foreground != null ? g.d(d4, foreground.getMinimumWidth()) : d4;
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    public static /* synthetic */ void getMeasureAllChildren$annotations() {
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.foregroundPadding.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.foregroundPadding.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.foregroundPadding.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.foregroundPadding.top);
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == 0.0f);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    private final boolean isDynamicAspect(int i4) {
        return getUseAspect() && !ViewsKt.isExact(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void layoutChildren(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (i6 - i4) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        int paddingBottomWithForeground = (i7 - i5) - getPaddingBottomWithForeground();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = getChildAt(i10);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int measuredWidth = child.getMeasuredWidth();
                int measuredHeight = child.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(divLayoutParams.getGravity(), getLayoutDirection());
                int gravity = divLayoutParams.getGravity() & InterfaceC1490j3.d.b.f16818j;
                int i11 = absoluteGravity & 7;
                if (i11 == 1) {
                    i8 = ((((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
                } else if (i11 != 5) {
                    i8 = ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                } else {
                    i9 = (paddingRightWithForeground - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                    int i12 = gravity == 16 ? gravity != 80 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + paddingTopWithForeground : (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin : paddingTopWithForeground + (((((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2);
                    child.layout(i9, i12, measuredWidth + i9, measuredHeight + i12);
                }
                i9 = i8 + paddingLeftWithForeground;
                if (gravity == 16) {
                }
                child.layout(i9, i12, measuredWidth + i9, measuredHeight + i12);
            }
        }
    }

    private final boolean matchDynamicHeight(DivLayoutParams divLayoutParams, boolean z4) {
        return !z4 && ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1;
    }

    private final boolean matchDynamicSize(DivLayoutParams divLayoutParams, boolean z4, boolean z5) {
        return matchDynamicWidth(divLayoutParams, z4) || matchDynamicHeight(divLayoutParams, z5);
    }

    private final boolean matchDynamicWidth(DivLayoutParams divLayoutParams, boolean z4) {
        return !z4 && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
    }

    private final void measureChildWithDefinedSize(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        boolean isExact = ViewsKt.isExact(i4);
        boolean isExact2 = ViewsKt.isExact(i5);
        boolean z4 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
        int i6 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        boolean z5 = i6 == -1;
        if (!(isExact && isExact2) && (!isExact2 ? !(!isExact ? !(z4 && (z5 || (i6 == -3 && getUseAspect()))) : !z5) : !z4)) {
            if (matchDynamicSize(divLayoutParams, isExact, isExact2)) {
                this.skippedMatchParentChildren.add(view);
                return;
            }
            return;
        }
        measureChildWithMargins(view, i4, 0, i5, 0);
        this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
        if (matchDynamicSize(divLayoutParams, isExact, isExact2)) {
            this.measuredMatchParentChildren.add(view);
        }
        if (!isExact && !z4) {
            updateMaxWidth(view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (isExact2 || z5 || getUseAspect()) {
            return;
        }
        updateMaxHeight(view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
    }

    private final void remeasureMatchParentChild(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int horizontalPadding = getHorizontalPadding() + divLayoutParams.getHorizontalMargins$div_release();
        int verticalPadding = getVerticalPadding() + divLayoutParams.getVerticalMargins$div_release();
        int i6 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        int makeExactSpec = i6 == -1 ? ViewsKt.makeExactSpec(g.d(getMeasuredWidth() - horizontalPadding, 0)) : DivViewGroup.Companion.getChildMeasureSpec(i4, horizontalPadding, i6, view.getMinimumWidth(), divLayoutParams.getMaxWidth());
        int i7 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        view.measure(makeExactSpec, i7 == -1 ? ViewsKt.makeExactSpec(g.d(getMeasuredHeight() - verticalPadding, 0)) : DivViewGroup.Companion.getChildMeasureSpec(i5, verticalPadding, i7, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        if (this.skippedMatchParentChildren.contains(view)) {
            this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
        }
    }

    private final void remeasureWrapContentConstrainedChild(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height == -3) {
            measureChildWithMargins(view, i4, 0, i5, 0);
            this.matchParentChildren.remove(view);
        }
    }

    private final void remeasureWrapContentConstrainedChildren(int i4, int i5) {
        if (isDynamicAspect(i4)) {
            boolean z4 = this.measureAllChildren;
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View child = getChildAt(i6);
                if (z4 || child.getVisibility() != 8) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    remeasureWrapContentConstrainedChild(child, i4, i5);
                }
            }
        }
    }

    private final void updateMaxHeight(int i4) {
        this.maxHeight = Math.max(this.maxHeight, i4);
    }

    private final void updateMaxWidth(int i4) {
        this.maxWidth = Math.max(this.maxWidth, i4);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-1, -1);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final boolean getMeasureAllChildren() {
        return this.measureAllChildren;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        layoutChildren(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.childState = 0;
        boolean isExact = ViewsKt.isExact(i4);
        if (getUseAspect()) {
            i5 = !isExact ? View.MeasureSpec.makeMeasureSpec(0, 0) : ViewsKt.makeExactSpec(AbstractC3185a.c(View.MeasureSpec.getSize(i4) / getAspectRatio()));
        }
        boolean z4 = this.measureAllChildren;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View child = getChildAt(i6);
            if (z4 || child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                measureChildWithDefinedSize(child, i4, i5);
            }
        }
        CollectionsKt.addAll(this.matchParentChildren, this.measuredMatchParentChildren);
        CollectionsKt.addAll(this.matchParentChildren, this.skippedMatchParentChildren);
        considerMatchParentChildrenInMaxSize(i4, i5);
        int resolveSizeAndState = View.resolveSizeAndState(getDynamicWidth(i4), i4, this.childState);
        int dynamicHeight = getDynamicHeight(i4, i5, 16777215 & resolveSizeAndState);
        if (ViewsKt.isUnspecified(i5)) {
            i5 = ViewsKt.makeExactSpec(dynamicHeight);
            remeasureWrapContentConstrainedChildren(i4, i5);
        }
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(dynamicHeight, i5, this.childState << 16));
        Iterator<T> it = this.matchParentChildren.iterator();
        while (it.hasNext()) {
            remeasureMatchParentChild((View) it.next(), i4, i5);
        }
        this.measuredMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
        this.matchParentChildren.clear();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f4) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f4));
    }

    @Override // android.view.View
    public void setForegroundGravity(int i4) {
        if (getForegroundGravity() == i4) {
            return;
        }
        super.setForegroundGravity(i4);
        if (getForegroundGravity() != 119 || getForeground() == null) {
            this.foregroundPadding.setEmpty();
        } else {
            getForeground().getPadding(this.foregroundPadding);
        }
        requestLayout();
    }

    public final void setMeasureAllChildren(boolean z4) {
        this.measureAllChildren = z4;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.foregroundPadding = new Rect();
        this.measuredMatchParentChildren = new LinkedHashSet();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.matchParentChildren = new LinkedHashSet();
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
    }
}
