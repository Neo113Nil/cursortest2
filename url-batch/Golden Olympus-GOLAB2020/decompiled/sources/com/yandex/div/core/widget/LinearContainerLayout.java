package com.yandex.div.core.widget;

import Z1.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1293g0;
import androidx.core.view.AbstractC1317t;
import com.ironsource.b9;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import j2.AbstractC3185a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.properties.c;
import kotlin.ranges.d;
import kotlin.ranges.g;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class LinearContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ h[] $$delegatedProperties = {H.d(new v(LinearContainerLayout.class, b9.h.f15492n, "getOrientation()I", 0)), H.d(new v(LinearContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0)), H.d(new v(LinearContainerLayout.class, "showDividers", "getShowDividers()I", 0))};

    @NotNull
    private final c aspectRatio$delegate;
    private int childMeasuredState;

    @NotNull
    private final List<View> constrainedChildren;

    @NotNull
    private final Set<View> crossMatchParentChildren;

    @Nullable
    private Drawable dividerDrawable;
    private int dividerHeight;
    private int dividerMarginBottom;
    private int dividerMarginLeft;
    private int dividerMarginRight;
    private int dividerMarginTop;
    private int dividerWidth;
    private int firstVisibleChildIndex;
    private int lastVisibleChildIndex;
    private int maxBaselineAscent;
    private int maxBaselineDescent;
    private int maxCrossSize;

    @NotNull
    private final DivViewGroup.OffsetsHolder offsetsHolder;

    @NotNull
    private final c orientation$delegate;

    @NotNull
    private final c showDividers$delegate;

    @NotNull
    private final Set<View> skippedMatchParentChildren;
    private int totalConstrainedLength;
    private int totalLength;
    private int totalMatchParentLength;
    private float totalWeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        this.orientation$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
        this.offsetsHolder = new DivViewGroup.OffsetsHolder(this, 0.0f, 0.0f, 0, 7, null);
        this.firstVisibleChildIndex = -1;
        this.lastVisibleChildIndex = -1;
        this.showDividers$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.constrainedChildren = new ArrayList();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.crossMatchParentChildren = new LinkedHashSet();
    }

    private final void considerMatchParentChildInMaxHeight(View view, int i4, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height != -1) {
            return;
        }
        if (z4) {
            this.maxCrossSize = Math.max(this.maxCrossSize, divLayoutParams.getVerticalMargins$div_release());
        } else {
            remeasureChildHorizontal(view, i4, view.getMeasuredWidth());
            updateMaxCrossSize(i4, view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final void considerMatchParentChildMarginsInWidth(View view, int i4) {
        if (hasSignificantWidth(view, i4)) {
            return;
        }
        int i5 = this.totalLength;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        this.totalLength = getMaxLength(i5, ((DivLayoutParams) layoutParams).getHorizontalMargins$div_release());
    }

    private final void considerMatchParentChildrenInMaxWidth(int i4, int i5) {
        if (!ViewsKt.isExact(i4)) {
            if (this.maxCrossSize != 0) {
                for (View view : this.crossMatchParentChildren) {
                    int i6 = this.maxCrossSize;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    this.maxCrossSize = Math.max(i6, ((DivLayoutParams) layoutParams).getHorizontalMargins$div_release());
                }
            } else {
                for (View view2 : this.crossMatchParentChildren) {
                    int i7 = i4;
                    measureVerticalFirstTime(view2, i7, i5, true, false);
                    this.skippedMatchParentChildren.remove(view2);
                    i4 = i7;
                }
            }
        }
    }

    private final Unit drawDivider(Canvas canvas, int i4, int i5, int i6, int i7) {
        Drawable drawable = this.dividerDrawable;
        if (drawable == null) {
            return null;
        }
        float f4 = (i4 + i6) / 2.0f;
        float f5 = (i5 + i7) / 2.0f;
        float f6 = this.dividerWidth / 2.0f;
        float f7 = this.dividerHeight / 2.0f;
        drawable.setBounds(Math.max((int) (f4 - f6), i4), Math.max((int) (f5 - f7), i5), Math.min((int) (f4 + f6), i6), Math.min((int) (f5 + f7), i7));
        drawable.draw(canvas);
        return Unit.f41027a;
    }

    private final void drawDividersHorizontal(Canvas canvas) {
        int i4;
        int edgeDividerOffset;
        int i5;
        int edgeDividerOffset2;
        int i6;
        int i7;
        boolean isLayoutRtl = com.yandex.div.core.util.ViewsKt.isLayoutRtl(this);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View child = getChildAt(i8);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                if (hasDividerBeforeChildAt(i8)) {
                    int dividerOffsetBeforeChildAt = getDividerOffsetBeforeChildAt(i8);
                    if (isLayoutRtl) {
                        int right = child.getRight();
                        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        i7 = right + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).rightMargin + this.dividerMarginLeft + dividerOffsetBeforeChildAt;
                    } else {
                        int left = child.getLeft();
                        ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        i7 = (((left - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams2)).leftMargin) - this.dividerWidth) - this.dividerMarginRight) - dividerOffsetBeforeChildAt;
                    }
                    drawVerticalDivider(canvas, i7);
                }
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null || !isLayoutRtl) {
                if (childAt == null) {
                    i5 = ((getWidth() - getPaddingRight()) - this.dividerWidth) - this.dividerMarginRight;
                    edgeDividerOffset2 = this.offsetsHolder.getEdgeDividerOffset();
                } else if (isLayoutRtl) {
                    int left2 = childAt.getLeft();
                    ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i5 = ((left2 - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams3)).leftMargin) - this.dividerWidth) - this.dividerMarginRight;
                    edgeDividerOffset2 = this.offsetsHolder.getEdgeDividerOffset();
                } else {
                    int right2 = childAt.getRight();
                    ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams4, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i4 = right2 + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams4)).rightMargin + this.dividerMarginLeft;
                    edgeDividerOffset = this.offsetsHolder.getEdgeDividerOffset();
                }
                i6 = i5 - edgeDividerOffset2;
                drawVerticalDivider(canvas, i6);
            }
            i4 = getPaddingLeft() + this.dividerMarginLeft;
            edgeDividerOffset = this.offsetsHolder.getEdgeDividerOffset();
            i6 = i4 + edgeDividerOffset;
            drawVerticalDivider(canvas, i6);
        }
    }

    private final void drawDividersVertical(Canvas canvas) {
        int height;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View child = getChildAt(i4);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                if (hasDividerBeforeChildAt(i4)) {
                    int top = child.getTop();
                    ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    drawHorizontalDivider(canvas, (((top - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).topMargin) - this.dividerHeight) - this.dividerMarginBottom) - getDividerOffsetBeforeChildAt(i4));
                }
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null) {
                int bottom = childAt.getBottom();
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                height = bottom + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams2)).bottomMargin + this.dividerMarginTop + this.offsetsHolder.getEdgeDividerOffset();
            } else {
                height = (((getHeight() - getPaddingBottom()) - this.dividerHeight) - this.dividerMarginBottom) - this.offsetsHolder.getEdgeDividerOffset();
            }
            drawHorizontalDivider(canvas, height);
        }
    }

    private final void drawHorizontalDivider(Canvas canvas, int i4) {
        drawDivider(canvas, getPaddingLeft() + this.dividerMarginLeft, i4, (getWidth() - getPaddingRight()) - this.dividerMarginRight, i4 + this.dividerHeight);
    }

    private final Unit drawVerticalDivider(Canvas canvas, int i4) {
        return drawDivider(canvas, i4, getPaddingTop() + this.dividerMarginTop, i4 + this.dividerWidth, (getHeight() - getPaddingBottom()) - this.dividerMarginBottom);
    }

    private final int getDividerHeightWithMargins() {
        return this.dividerHeight + this.dividerMarginTop + this.dividerMarginBottom;
    }

    private final int getDividerOffsetBeforeChildAt(int i4) {
        return i4 == this.firstVisibleChildIndex ? this.offsetsHolder.getEdgeDividerOffset() : (int) (this.offsetsHolder.getSpaceBetweenChildren() / 2);
    }

    private final int getDividerWidthWithMargins() {
        return this.dividerWidth + this.dividerMarginRight + this.dividerMarginLeft;
    }

    private final float getFixedHorizontalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getHorizontalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width);
    }

    private final float getFixedVerticalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getVerticalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height);
    }

    private final float getFixedWeight(float f4, int i4) {
        return f4 > 0.0f ? f4 : i4 == -1 ? 1.0f : 0.0f;
    }

    private final int getFreeSpace(int i4, int i5) {
        int i6;
        return (i4 >= 0 || (i6 = this.totalMatchParentLength) <= 0) ? (i4 < 0 || !ViewsKt.isExact(i5)) ? i4 : i4 + this.totalMatchParentLength : g.d(i4 + i6, 0);
    }

    private final int getMaxHeight(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((DivLayoutParams) layoutParams).getMaxHeight();
    }

    private final int getMaxLength(int i4, int i5) {
        return Math.max(i4, i5 + i4);
    }

    private final int getMaxWidth(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((DivLayoutParams) layoutParams).getMaxWidth();
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public static /* synthetic */ void getShowDividers$annotations() {
    }

    private final int getVisibleChildCount() {
        Iterator it = AbstractC1293g0.b(this).iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (!(((View) it.next()).getVisibility() == 8) && (i4 = i4 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i4;
    }

    private final int getWidthSizeAndState(int i4) {
        return View.resolveSizeAndState(Math.max(getSuggestedMinimumWidth(), this.totalLength), i4, this.childMeasuredState);
    }

    private final boolean hasDividerBeforeChildAt(int i4) {
        if (i4 == this.firstVisibleChildIndex) {
            return (getShowDividers() & 1) != 0;
        }
        if (i4 > this.lastVisibleChildIndex) {
            return (getShowDividers() & 4) != 0;
        }
        if ((getShowDividers() & 2) != 0) {
            for (int i5 = i4 - 1; -1 < i5; i5--) {
                View childAt = getChildAt(i4);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(childIndex)");
                if (childAt.getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean hasSignificantDimension(int i4, int i5) {
        return (i4 == -1 && ViewsKt.isExact(i5)) ? false : true;
    }

    private final boolean hasSignificantHeight(View view, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height, i4);
    }

    private final boolean hasSignificantWidth(View view, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).width, i4);
    }

    private final boolean isVertical() {
        return getOrientation() == 1;
    }

    private final void layoutHorizontal(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int baseline;
        int verticalPaddings$div_release = (i7 - i5) - getVerticalPaddings$div_release();
        int layoutDirection = getLayoutDirection();
        float f4 = (i6 - i4) - this.totalLength;
        float paddingLeft = getPaddingLeft();
        this.offsetsHolder.update(f4, AbstractC1317t.b(getHorizontalGravity$div_release(), layoutDirection), getVisibleChildCount());
        float firstChildOffset = paddingLeft + this.offsetsHolder.getFirstChildOffset();
        d indices = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, getChildCount());
        int b4 = indices.b();
        int d4 = indices.d();
        int e4 = indices.e();
        if ((e4 <= 0 || b4 > d4) && (e4 >= 0 || d4 > b4)) {
            return;
        }
        while (true) {
            View childAt = getChildAt(b4);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int verticalGravity = DivViewGroup.Companion.toVerticalGravity(divLayoutParams.getGravity());
                if (verticalGravity < 0) {
                    verticalGravity = getVerticalGravity$div_release();
                }
                int paddingTop = getPaddingTop();
                if (verticalGravity == 16) {
                    i8 = (((verticalPaddings$div_release - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
                } else if (verticalGravity != 48) {
                    if (verticalGravity != 80) {
                        i8 = 0;
                    } else {
                        i9 = verticalPaddings$div_release - measuredHeight;
                        baseline = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                        i8 = i9 - baseline;
                    }
                } else if (!divLayoutParams.isBaselineAligned() || ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 || childAt.getBaseline() == -1) {
                    i8 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                } else {
                    i9 = this.maxBaselineAscent;
                    baseline = childAt.getBaseline();
                    i8 = i9 - baseline;
                }
                int i10 = paddingTop + i8;
                if (hasDividerBeforeChildAt(com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? b4 + 1 : b4)) {
                    firstChildOffset += getDividerWidthWithMargins();
                }
                float f5 = firstChildOffset + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                setChildFrame(childAt, AbstractC3185a.c(f5), i10, measuredWidth, measuredHeight);
                firstChildOffset = f5 + measuredWidth + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + this.offsetsHolder.getSpaceBetweenChildren();
            }
            if (b4 == d4) {
                return;
            } else {
                b4 += e4;
            }
        }
    }

    private final void layoutVertical(int i4, int i5, int i6, int i7) {
        int horizontalPaddings$div_release = (i6 - i4) - getHorizontalPaddings$div_release();
        float f4 = (i7 - i5) - this.totalLength;
        float paddingTop = getPaddingTop();
        this.offsetsHolder.update(f4, getVerticalGravity$div_release(), getVisibleChildCount());
        float firstChildOffset = paddingTop + this.offsetsHolder.getFirstChildOffset();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View child = getChildAt(i8);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                int measuredWidth = child.getMeasuredWidth();
                int measuredHeight = child.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int horizontalGravity = DivViewGroup.Companion.toHorizontalGravity(divLayoutParams.getGravity());
                if (horizontalGravity < 0) {
                    horizontalGravity = getHorizontalGravity$div_release();
                }
                int layoutDirection = getLayoutDirection();
                int paddingLeft = getPaddingLeft();
                int b4 = AbstractC1317t.b(horizontalGravity, layoutDirection);
                int i9 = paddingLeft + (b4 != 1 ? b4 != 3 ? b4 != 5 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (horizontalPaddings$div_release - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (((horizontalPaddings$div_release - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2);
                if (hasDividerBeforeChildAt(i8)) {
                    firstChildOffset += getDividerHeightWithMargins();
                }
                float f5 = firstChildOffset + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                setChildFrame(child, i9, AbstractC3185a.c(f5), measuredWidth, measuredHeight);
                firstChildOffset = f5 + measuredHeight + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + this.offsetsHolder.getSpaceBetweenChildren();
            }
        }
    }

    private final void measureChildWithSignificantSizeHorizontal(View view, int i4, int i5) {
        LinearContainerLayout linearContainerLayout;
        View view2;
        int i6;
        if (hasSignificantWidth(view, i4)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            int i7 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
            if (i7 == -3) {
                linearContainerLayout = this;
                view2 = view;
                i6 = i5;
                measureConstrainedWidthChildFirstTime(view2, i4, i6);
            } else if (i7 != -1) {
                linearContainerLayout = this;
                view2 = view;
                i6 = i5;
                linearContainerLayout.measureChildWithMargins(view2, i4, 0, i6, 0);
            } else {
                linearContainerLayout = this;
                view2 = view;
                i6 = i5;
                measureMatchParentWidthChildFirstTime(view2, i4, i6);
            }
            linearContainerLayout.childMeasuredState = View.combineMeasuredStates(linearContainerLayout.childMeasuredState, view2.getMeasuredState());
            updateMaxCrossSize(i6, view2.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
            updateBaselineOffset(view2);
            linearContainerLayout.totalLength = getMaxLength(linearContainerLayout.totalLength, view2.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
    }

    private final void measureChildWithSignificantSizeVertical(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        boolean isExact = ViewsKt.isExact(i4);
        boolean hasSignificantHeight = hasSignificantHeight(view, i5);
        if (isExact ? hasSignificantHeight : ((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
            measureVerticalFirstTime(view, i4, i5, true, true);
            return;
        }
        if (!isExact) {
            this.crossMatchParentChildren.add(view);
        }
        if (hasSignificantHeight) {
            return;
        }
        this.skippedMatchParentChildren.add(view);
        int i6 = this.totalLength;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        this.totalLength = getMaxLength(i6, ((DivLayoutParams) layoutParams2).getVerticalMargins$div_release());
    }

    private final void measureConstrainedHeightChildFirstTime(View view, int i4, int i5, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int maxHeight = divLayoutParams.getMaxHeight();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        divLayoutParams.setMaxHeight(Integer.MAX_VALUE);
        measureChildWithMargins(view, i4, 0, i5, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -3;
        divLayoutParams.setMaxHeight(maxHeight);
        if (z4) {
            this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
            if (this.constrainedChildren.contains(view)) {
                return;
            }
            this.constrainedChildren.add(view);
        }
    }

    private final void measureConstrainedWidthChildFirstTime(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int maxWidth = divLayoutParams.getMaxWidth();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        divLayoutParams.setMaxWidth(Integer.MAX_VALUE);
        measureChildWithMargins(view, i4, 0, i5, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
        divLayoutParams.setMaxWidth(maxWidth);
        this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        this.constrainedChildren.add(view);
    }

    private final void measureHorizontal(int i4, int i5) {
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        boolean isExact = ViewsKt.isExact(i4);
        if (getAspectRatio() != 0.0f) {
            i5 = isExact ? ViewsKt.makeExactSpec(AbstractC3185a.c(View.MeasureSpec.getSize(i4) / getAspectRatio())) : ViewsKt.makeExactSpec(0);
        }
        int size = View.MeasureSpec.getSize(i5);
        boolean isExact2 = ViewsKt.isExact(i5);
        int d4 = g.d(isExact2 ? size : Math.max(getSuggestedMinimumHeight(), getVerticalPaddings$div_release()), 0);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View child = getChildAt(i6);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                if (hasDividerBeforeChildAt(i6)) {
                    this.totalLength += getDividerWidthWithMargins();
                }
                float f4 = this.totalWeight;
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                this.totalWeight = f4 + getFixedHorizontalWeight((DivLayoutParams) layoutParams);
                measureChildWithSignificantSizeHorizontal(child, i4, i5);
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View child2 = getChildAt(i7);
            if (child2.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child2, "child");
                considerMatchParentChildMarginsInWidth(child2, i4);
            }
        }
        if (this.totalLength > 0 && hasDividerBeforeChildAt(getChildCount())) {
            this.totalLength += getDividerWidthWithMargins();
        }
        this.totalLength += getHorizontalPaddings$div_release();
        int widthSizeAndState = getWidthSizeAndState(i4) & 16777215;
        if (!isExact && getAspectRatio() != 0.0f) {
            size = AbstractC3185a.c(widthSizeAndState / getAspectRatio());
            i5 = ViewsKt.makeExactSpec(size);
        }
        remeasureChildrenHorizontalIfNeeded(i4, widthSizeAndState, i5);
        if (!isExact2 && getAspectRatio() == 0.0f) {
            int childCount3 = getChildCount();
            for (int i8 = 0; i8 < childCount3; i8++) {
                View child3 = getChildAt(i8);
                if (child3.getVisibility() != 8) {
                    Intrinsics.checkNotNullExpressionValue(child3, "child");
                    considerMatchParentChildInMaxHeight(child3, i5, this.maxCrossSize == 0);
                }
            }
            this.maxCrossSize = Math.max(d4, this.maxCrossSize + getVerticalPaddings$div_release());
            int i9 = this.maxBaselineAscent;
            if (i9 != -1) {
                updateMaxCrossSize(i5, i9 + this.maxBaselineDescent);
            }
            size = View.resolveSize(this.maxCrossSize, i5);
        }
        int childCount4 = getChildCount();
        for (int i10 = 0; i10 < childCount4; i10++) {
            View child4 = getChildAt(i10);
            if (child4.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child4, "child");
                remeasureDynamicHeightChild(child4, ViewsKt.makeExactSpec(size));
            }
        }
        setMeasuredDimension(getWidthSizeAndState(i4), View.resolveSizeAndState(size, i5, this.childMeasuredState << 16));
    }

    private final void measureMatchParentHeightChildFirstTime(View view, int i4, int i5, boolean z4) {
        if (ViewsKt.isExact(i5)) {
            measureChildWithMargins(view, i4, 0, ViewsKt.makeExactSpec(0), 0);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        measureChildWithMargins(view, i4, 0, i5, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -1;
        if (z4) {
            this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, view.getMeasuredHeight());
        }
    }

    private final void measureMatchParentWidthChild(View view, int i4) {
        if (hasSignificantHeight(view, i4)) {
            measureVerticalFirstTime(view, ViewsKt.makeExactSpec(this.maxCrossSize + getHorizontalPaddings$div_release()), i4, false, true);
            this.skippedMatchParentChildren.remove(view);
        }
    }

    private final void measureMatchParentWidthChildFirstTime(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        measureChildWithMargins(view, i4, 0, i5, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -1;
        this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
    }

    private final void measureVertical(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i4);
        boolean z4 = View.MeasureSpec.getMode(i4) == 1073741824;
        if (getAspectRatio() != 0.0f) {
            i5 = z4 ? ViewsKt.makeExactSpec(AbstractC3185a.c(size / getAspectRatio())) : ViewsKt.makeExactSpec(0);
        }
        if (!z4) {
            size = Math.max(getSuggestedMinimumWidth(), getHorizontalPaddings$div_release());
        }
        int d4 = g.d(size, 0);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View child = getChildAt(i6);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                if (hasDividerBeforeChildAt(i6)) {
                    this.totalLength += getDividerHeightWithMargins();
                }
                float f4 = this.totalWeight;
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                this.totalWeight = f4 + getFixedVerticalWeight((DivLayoutParams) layoutParams);
                measureChildWithSignificantSizeVertical(child, i4, i5);
            }
        }
        considerMatchParentChildrenInMaxWidth(i4, i5);
        Iterator<T> it = this.crossMatchParentChildren.iterator();
        while (it.hasNext()) {
            measureMatchParentWidthChild((View) it.next(), i5);
        }
        if (this.totalLength > 0 && hasDividerBeforeChildAt(getChildCount())) {
            this.totalLength += getDividerHeightWithMargins();
        }
        this.totalLength += getVerticalPaddings$div_release();
        this.maxCrossSize = Math.max(d4, this.maxCrossSize + getHorizontalPaddings$div_release());
        int size2 = View.MeasureSpec.getSize(i5);
        if (getAspectRatio() != 0.0f && !z4) {
            size2 = AbstractC3185a.c((View.resolveSizeAndState(this.maxCrossSize, i4, this.childMeasuredState) & 16777215) / getAspectRatio());
            i5 = ViewsKt.makeExactSpec(size2);
            remeasureChildrenVerticalIfNeeded(i4, size2, i5, d4);
        } else if (getAspectRatio() != 0.0f || ViewsKt.isExact(i5)) {
            remeasureChildrenVerticalIfNeeded(i4, size2, i5, d4);
        } else {
            remeasureChildrenVerticalIfNeeded(i4, Math.max(this.totalLength, getSuggestedMinimumHeight()), i5, d4);
            size2 = Math.max(this.totalLength, getSuggestedMinimumHeight());
        }
        setMeasuredDimension(View.resolveSizeAndState(this.maxCrossSize, i4, this.childMeasuredState), View.resolveSizeAndState(size2, i5, this.childMeasuredState << 16));
    }

    private final void measureVerticalFirstTime(View view, int i4, int i5, boolean z4, boolean z5) {
        LinearContainerLayout linearContainerLayout;
        View view2;
        int i6;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int i7 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        if (i7 == -3) {
            linearContainerLayout = this;
            view2 = view;
            i6 = i4;
            measureConstrainedHeightChildFirstTime(view2, i6, i5, z5);
        } else if (i7 != -1) {
            linearContainerLayout = this;
            view2 = view;
            i6 = i4;
            linearContainerLayout.measureChildWithMargins(view2, i6, 0, i5, 0);
        } else {
            linearContainerLayout = this;
            view2 = view;
            i6 = i4;
            measureMatchParentHeightChildFirstTime(view2, i6, i5, z5);
        }
        linearContainerLayout.childMeasuredState = View.combineMeasuredStates(linearContainerLayout.childMeasuredState, view2.getMeasuredState());
        if (z4) {
            updateMaxCrossSize(i6, view2.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (z5) {
            linearContainerLayout.totalLength = getMaxLength(linearContainerLayout.totalLength, view2.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final boolean needRemeasureChildren(int i4, int i5) {
        if (!this.skippedMatchParentChildren.isEmpty()) {
            return true;
        }
        if (ViewsKt.isUnspecified(i5)) {
            return false;
        }
        return i4 < 0 ? this.totalConstrainedLength > 0 || this.totalWeight > 0.0f : ViewsKt.isExact(i5) && i4 > 0 && this.totalWeight > 0.0f;
    }

    private final int remeasureChildHorizontal(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        view.measure(ViewsKt.makeExactSpec(i5), DivViewGroup.Companion.getChildMeasureSpec(i4, divLayoutParams.getVerticalMargins$div_release() + getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        return View.combineMeasuredStates(this.childMeasuredState, view.getMeasuredState() & (-16777216));
    }

    private final void remeasureChildVertical(View view, int i4, int i5, int i6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int i7 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        if (i7 == -1) {
            if (i5 == 0) {
                ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
            } else {
                i4 = ViewsKt.makeExactSpec(i5);
            }
        }
        int childMeasureSpec = DivViewGroup.Companion.getChildMeasureSpec(i4, getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth());
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = i7;
        view.measure(childMeasureSpec, ViewsKt.makeExactSpec(i6));
        this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view.getMeasuredState() & (-256));
    }

    private final void remeasureChildrenHorizontalIfNeeded(int i4, int i5, int i6) {
        int i7 = i5 - this.totalLength;
        List<View> list = this.constrainedChildren;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (getMaxWidth((View) it.next()) != Integer.MAX_VALUE) {
                    break;
                }
            }
        }
        if (!needRemeasureChildren(i7, i4)) {
            return;
        }
        this.totalLength = 0;
        remeasureConstrainedWidthChildren(i4, i6, i7);
        remeasureMatchParentWidthChildren(i4, i6, i7);
        this.totalLength += getHorizontalPaddings$div_release();
    }

    private final void remeasureChildrenVerticalIfNeeded(int i4, int i5, int i6, int i7) {
        int i8 = i5 - this.totalLength;
        List<View> list = this.constrainedChildren;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (getMaxHeight((View) it.next()) != Integer.MAX_VALUE) {
                    break;
                }
            }
        }
        if (!needRemeasureChildren(i8, i6)) {
            return;
        }
        this.totalLength = 0;
        remeasureConstrainedHeightChildren(i4, i6, i8);
        remeasureMatchParentHeightChildren(i4, i6, i7, i8);
        this.totalLength += getVerticalPaddings$div_release();
    }

    private final void remeasureConstrainedHeightChildren(int i4, int i5, int i6) {
        int freeSpace = getFreeSpace(i6, i5);
        if (freeSpace >= 0) {
            for (View view : this.constrainedChildren) {
                if (getMaxHeight(view) != Integer.MAX_VALUE) {
                    remeasureChildVertical(view, i4, this.maxCrossSize, Math.min(view.getMeasuredHeight(), getMaxHeight(view)));
                }
            }
            return;
        }
        List<View> list = this.constrainedChildren;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedHeightChildren$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    View view2 = (View) t5;
                    View view3 = (View) t4;
                    return a.d(Float.valueOf(view2.getMinimumHeight() / view2.getMeasuredHeight()), Float.valueOf(view3.getMinimumHeight() / view3.getMeasuredHeight()));
                }
            });
        }
        for (View view2 : this.constrainedChildren) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            int measuredHeight = view2.getMeasuredHeight();
            int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + measuredHeight;
            remeasureChildVertical(view2, i4, this.maxCrossSize, g.g(g.d(AbstractC3185a.c((verticalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredHeight, view2.getMinimumHeight()), divLayoutParams.getMaxHeight()));
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & 16777216);
            this.totalConstrainedLength -= verticalMargins$div_release;
            freeSpace -= view2.getMeasuredHeight() - measuredHeight;
        }
    }

    private final void remeasureConstrainedWidthChildren(int i4, int i5, int i6) {
        int freeSpace = getFreeSpace(i6, i4);
        if (freeSpace >= 0) {
            for (View view : this.constrainedChildren) {
                if (getMaxWidth(view) != Integer.MAX_VALUE) {
                    remeasureChildHorizontal(view, i5, Math.min(view.getMeasuredWidth(), getMaxWidth(view)));
                }
            }
            return;
        }
        List<View> list = this.constrainedChildren;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedWidthChildren$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    View view2 = (View) t5;
                    View view3 = (View) t4;
                    return a.d(Float.valueOf(view2.getMinimumWidth() / view2.getMeasuredWidth()), Float.valueOf(view3.getMinimumWidth() / view3.getMeasuredWidth()));
                }
            });
        }
        for (View view2 : this.constrainedChildren) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            int measuredWidth = view2.getMeasuredWidth();
            int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + measuredWidth;
            remeasureChildHorizontal(view2, i5, g.g(g.d(AbstractC3185a.c((horizontalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredWidth, view2.getMinimumWidth()), divLayoutParams.getMaxWidth()));
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & 16777216);
            this.totalConstrainedLength -= horizontalMargins$div_release;
            freeSpace -= view2.getMeasuredWidth() - measuredWidth;
        }
    }

    private final void remeasureDynamicHeightChild(View view, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        int i5 = ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height;
        if (i5 == -1 || i5 == -3) {
            remeasureChildHorizontal(view, i4, view.getMeasuredWidth());
        }
    }

    private final void remeasureMatchParentHeightChildren(int i4, int i5, int i6, int i7) {
        int freeSpace = getFreeSpace(i7, i5);
        float f4 = this.totalWeight;
        int i8 = this.maxCrossSize;
        this.maxCrossSize = 0;
        int childCount = getChildCount();
        int i9 = freeSpace;
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = getChildAt(i10);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    if (freeSpace > 0) {
                        int fixedVerticalWeight = (int) ((getFixedVerticalWeight(divLayoutParams) * i9) / f4);
                        f4 -= getFixedVerticalWeight(divLayoutParams);
                        i9 -= fixedVerticalWeight;
                        remeasureChildVertical(child, i4, i8, fixedVerticalWeight);
                    } else if (this.skippedMatchParentChildren.contains(child)) {
                        remeasureChildVertical(child, i4, i8, 0);
                    }
                }
                updateMaxCrossSize(i4, child.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
                this.totalLength = getMaxLength(this.totalLength, child.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
            }
        }
        this.maxCrossSize = Math.max(i6, this.maxCrossSize + getHorizontalPaddings$div_release());
        KAssert kAssert = KAssert.INSTANCE;
        Integer valueOf = Integer.valueOf(i8);
        Integer valueOf2 = Integer.valueOf(this.maxCrossSize);
        if (Assert.isEnabled()) {
            Assert.assertEquals("Width of vertical container changed after remeasuring", valueOf, valueOf2);
        }
    }

    private final void remeasureMatchParentWidthChildren(int i4, int i5, int i6) {
        int freeSpace = getFreeSpace(i6, i4);
        float f4 = this.totalWeight;
        this.maxCrossSize = 0;
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        int childCount = getChildCount();
        int i7 = freeSpace;
        for (int i8 = 0; i8 < childCount; i8++) {
            View child = getChildAt(i8);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
                    if (freeSpace > 0) {
                        int fixedHorizontalWeight = (int) ((getFixedHorizontalWeight(divLayoutParams) * i7) / f4);
                        f4 -= getFixedHorizontalWeight(divLayoutParams);
                        i7 -= fixedHorizontalWeight;
                        remeasureChildHorizontal(child, i5, fixedHorizontalWeight);
                    } else {
                        remeasureChildHorizontal(child, i5, 0);
                    }
                }
                updateMaxCrossSize(i5, child.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
                this.totalLength = getMaxLength(this.totalLength, child.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
                updateBaselineOffset(child);
            }
        }
    }

    private final void setChildFrame(View view, int i4, int i5, int i6, int i7) {
        view.layout(i4, i5, i6 + i4, i7 + i5);
    }

    private final void updateBaselineOffset(View view) {
        int baseline;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (divLayoutParams.isBaselineAligned() && (baseline = view.getBaseline()) != -1) {
            this.maxBaselineAscent = Math.max(this.maxBaselineAscent, ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + baseline);
            this.maxBaselineDescent = Math.max(this.maxBaselineDescent, (view.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin);
        }
    }

    private final void updateMaxCrossSize(int i4, int i5) {
        if (ViewsKt.isExact(i4)) {
            return;
        }
        this.maxCrossSize = Math.max(this.maxCrossSize, i5);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (!isVertical()) {
            int i4 = this.maxBaselineAscent;
            return i4 != -1 ? i4 + getPaddingTop() : super.getBaseline();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.getBaseline();
        }
        int baseline = childAt.getBaseline();
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return baseline + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).topMargin + getPaddingTop();
    }

    @Nullable
    public final Drawable getDividerDrawable() {
        return this.dividerDrawable;
    }

    public final int getOrientation() {
        return ((Number) this.orientation$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getShowDividers() {
        return ((Number) this.showDividers$delegate.getValue(this, $$delegatedProperties[2])).intValue();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.dividerDrawable == null) {
            return;
        }
        if (isVertical()) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        if (isVertical()) {
            layoutVertical(i4, i5, i6, i7);
        } else {
            layoutHorizontal(i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        this.totalLength = 0;
        this.maxCrossSize = 0;
        this.totalConstrainedLength = 0;
        this.totalMatchParentLength = 0;
        this.totalWeight = 0.0f;
        this.childMeasuredState = 0;
        Iterator it = AbstractC1293g0.b(this).iterator();
        int i7 = 0;
        while (true) {
            i6 = -1;
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            Object next = it.next();
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!(((View) next).getVisibility() == 8)) {
                break;
            } else {
                i7++;
            }
        }
        this.firstVisibleChildIndex = i7;
        int i8 = 0;
        for (Object obj : AbstractC1293g0.b(this)) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!(((View) obj).getVisibility() == 8)) {
                i6 = i8;
            }
            i8++;
        }
        this.lastVisibleChildIndex = i6;
        if (isVertical()) {
            measureVertical(i4, i5);
        } else {
            measureHorizontal(i4, i5);
        }
        this.constrainedChildren.clear();
        this.crossMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f4) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f4));
    }

    public final void setDividerDrawable(@Nullable Drawable drawable) {
        if (Intrinsics.areEqual(this.dividerDrawable, drawable)) {
            return;
        }
        this.dividerDrawable = drawable;
        this.dividerWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.dividerHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setDividerMargins(int i4, int i5, int i6, int i7) {
        this.dividerMarginLeft = i4;
        this.dividerMarginRight = i6;
        this.dividerMarginTop = i5;
        this.dividerMarginBottom = i7;
        requestLayout();
    }

    public final void setOrientation(int i4) {
        this.orientation$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i4));
    }

    public final void setShowDividers(int i4) {
        this.showDividers$delegate.setValue(this, $$delegatedProperties[2], Integer.valueOf(i4));
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    public DivLayoutParams generateDefaultLayoutParams() {
        return isVertical() ? new DivLayoutParams(-1, -2) : new DivLayoutParams(-2, -2);
    }
}
