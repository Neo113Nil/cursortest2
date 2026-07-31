package com.yandex.div.core.widget.wraplayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1293g0;
import androidx.core.view.AbstractC1317t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import j2.AbstractC3185a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.properties.c;
import kotlin.ranges.d;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class WrapContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ h[] $$delegatedProperties = {H.d(new v(WrapContainerLayout.class, "showSeparators", "getShowSeparators()I", 0)), H.d(new v(WrapContainerLayout.class, "showLineSeparators", "getShowLineSeparators()I", 0)), H.d(new v(WrapContainerLayout.class, "separatorDrawable", "getSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0)), H.d(new v(WrapContainerLayout.class, "lineSeparatorDrawable", "getLineSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0)), H.d(new v(WrapContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    @NotNull
    private final c aspectRatio$delegate;
    private int childState;
    private int edgeLineSeparatorOffset;
    private boolean isRowDirection;

    @NotNull
    private final c lineSeparatorDrawable$delegate;
    private int lineSeparatorMarginBottom;
    private int lineSeparatorMarginLeft;
    private int lineSeparatorMarginRight;
    private int lineSeparatorMarginTop;

    @NotNull
    private final List<WrapLine> lines;
    private int middleLineSeparatorOffset;

    @NotNull
    private final DivViewGroup.OffsetsHolder offsetsHolder;

    @NotNull
    private final c separatorDrawable$delegate;
    private int separatorMarginBottom;
    private int separatorMarginLeft;
    private int separatorMarginRight;
    private int separatorMarginTop;

    @NotNull
    private final c showLineSeparators$delegate;

    @NotNull
    private final c showSeparators$delegate;
    private int tempSumCrossSize;
    private int wrapDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContainerLayout(@NotNull Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.showSeparators$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.showLineSeparators$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.separatorDrawable$delegate = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.lineSeparatorDrawable$delegate = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.isRowDirection = true;
        this.lines = new ArrayList();
        this.offsetsHolder = new DivViewGroup.OffsetsHolder(this, 0.0f, 0.0f, 0, 7, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
    }

    private final void addEdgeSpace(WrapLine wrapLine) {
        this.lines.add(0, wrapLine);
        this.lines.add(wrapLine);
    }

    private final void addLine(WrapLine wrapLine) {
        this.lines.add(wrapLine);
        if (wrapLine.getMaxBaseline() > 0) {
            wrapLine.setCrossSize(Math.max(wrapLine.getCrossSize(), wrapLine.getMaxBaseline() + wrapLine.getMaxHeightUnderBaseline()));
        }
        this.tempSumCrossSize += wrapLine.getCrossSize();
    }

    private final void addLineIfNeeded(int i4, WrapLine wrapLine) {
        if (i4 != getChildCount() - 1 || wrapLine.getItemCountNotGone() == 0) {
            return;
        }
        addLine(wrapLine);
    }

    private final void addSpaceBetweenLines(WrapLine wrapLine) {
        for (int i4 = 1; i4 < this.lines.size(); i4 += 2) {
            this.lines.add(i4, wrapLine);
        }
    }

    private final void calculateLines(int i4, int i5) {
        int i6;
        int edgeSeparatorsLength;
        int i7;
        int i8;
        this.tempSumCrossSize = getEdgeLineSeparatorsLength();
        int i9 = this.isRowDirection ? i4 : i5;
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int edgeSeparatorsLength2 = getEdgeSeparatorsLength() + (this.isRowDirection ? getHorizontalPaddings$div_release() : getVerticalPaddings$div_release());
        WrapLine wrapLine = new WrapLine(0, edgeSeparatorsLength2, 0, 5, null);
        int i10 = 0;
        WrapLine wrapLine2 = wrapLine;
        int i11 = Integer.MIN_VALUE;
        for (Object obj : AbstractC1293g0.b(this)) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = (View) obj;
            if (isHidden(view)) {
                wrapLine2.setGoneItemCount(wrapLine2.getGoneItemCount() + 1);
                wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                addLineIfNeeded(i10, wrapLine2);
                int i13 = mode;
                i7 = size;
                i8 = i13;
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int horizontalPaddings$div_release = getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release();
                int verticalPaddings$div_release = getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release();
                if (this.isRowDirection) {
                    i6 = horizontalPaddings$div_release + getEdgeSeparatorsLength();
                    edgeSeparatorsLength = this.tempSumCrossSize;
                } else {
                    i6 = horizontalPaddings$div_release + this.tempSumCrossSize;
                    edgeSeparatorsLength = getEdgeSeparatorsLength();
                }
                int i14 = verticalPaddings$div_release + edgeSeparatorsLength;
                int i15 = i6;
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                view.measure(companion.getChildMeasureSpec(i4, i15, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i5, i14, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
                this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                int measuredWidth = view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release();
                int measuredHeight = view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release();
                if (this.isRowDirection) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                int i16 = measuredWidth;
                int i17 = mode;
                i7 = size;
                i8 = i17;
                if (isWrapRequired(i8, i7, wrapLine2.getMainSize(), measuredHeight, wrapLine2.getItemCount())) {
                    if (wrapLine2.getItemCountNotGone() > 0) {
                        addLine(wrapLine2);
                    }
                    wrapLine2 = new WrapLine(i10, edgeSeparatorsLength2, 1);
                    i11 = Integer.MIN_VALUE;
                } else {
                    if (wrapLine2.getItemCount() > 0) {
                        wrapLine2.setMainSize(wrapLine2.getMainSize() + getMiddleSeparatorLength());
                    }
                    wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                }
                if (this.isRowDirection && divLayoutParams.isBaselineAligned()) {
                    wrapLine2.setMaxBaseline(Math.max(wrapLine2.getMaxBaseline(), view.getBaseline() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin));
                    wrapLine2.setMaxHeightUnderBaseline(Math.max(wrapLine2.getMaxHeightUnderBaseline(), (view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) - view.getBaseline()));
                }
                wrapLine2.setMainSize(wrapLine2.getMainSize() + measuredHeight);
                i11 = Math.max(i11, i16);
                wrapLine2.setCrossSize(Math.max(wrapLine2.getCrossSize(), i11));
                addLineIfNeeded(i10, wrapLine2);
            }
            int i18 = i7;
            mode = i8;
            size = i18;
            i10 = i12;
        }
    }

    private final void determineCrossSize(int i4, int i5, int i6) {
        this.middleLineSeparatorOffset = 0;
        this.edgeLineSeparatorOffset = 0;
        if (this.lines.size() != 0 && View.MeasureSpec.getMode(i4) == 1073741824) {
            int size = View.MeasureSpec.getSize(i4);
            if (this.lines.size() == 1) {
                this.lines.get(0).setCrossSize(size - i6);
                return;
            }
            int sumOfCrossSize = (size - getSumOfCrossSize()) + i6;
            if (i5 != 1) {
                if (i5 != 5) {
                    if (i5 != 16) {
                        if (i5 != 80) {
                            if (i5 != 16777216) {
                                if (i5 != 33554432) {
                                    if (i5 != 67108864) {
                                        if (i5 != 268435456) {
                                            if (i5 != 536870912) {
                                                if (i5 != 1073741824) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    WrapLine wrapLine = new WrapLine(0, 0, 0, 7, null);
                                    int c4 = AbstractC3185a.c(DivViewGroup.Companion.getSpaceEvenlyPart$div_release(sumOfCrossSize, this.lines.size()));
                                    wrapLine.setCrossSize(c4);
                                    int i7 = c4 / 2;
                                    this.middleLineSeparatorOffset = i7;
                                    this.edgeLineSeparatorOffset = i7;
                                    addSpaceBetweenLines(wrapLine);
                                    addEdgeSpace(wrapLine);
                                    return;
                                }
                                WrapLine wrapLine2 = new WrapLine(0, 0, 0, 7, null);
                                int c5 = AbstractC3185a.c(DivViewGroup.Companion.getSpaceBetweenPart$div_release(sumOfCrossSize, this.lines.size()));
                                wrapLine2.setCrossSize(c5);
                                this.middleLineSeparatorOffset = c5 / 2;
                                addSpaceBetweenLines(wrapLine2);
                                return;
                            }
                            WrapLine wrapLine3 = new WrapLine(0, 0, 0, 7, null);
                            int c6 = AbstractC3185a.c(DivViewGroup.Companion.getSpaceAroundPart$div_release(sumOfCrossSize, this.lines.size()));
                            wrapLine3.setCrossSize(c6);
                            this.middleLineSeparatorOffset = c6;
                            this.edgeLineSeparatorOffset = c6 / 2;
                            for (int i8 = 0; i8 < this.lines.size(); i8 += 3) {
                                this.lines.add(i8, wrapLine3);
                                this.lines.add(i8 + 2, wrapLine3);
                            }
                            return;
                        }
                    }
                }
                WrapLine wrapLine4 = new WrapLine(0, 0, 0, 7, null);
                wrapLine4.setCrossSize(sumOfCrossSize);
                this.lines.add(0, wrapLine4);
                return;
            }
            WrapLine wrapLine5 = new WrapLine(0, 0, 0, 7, null);
            wrapLine5.setCrossSize(sumOfCrossSize / 2);
            addEdgeSpace(wrapLine5);
        }
    }

    private final void drawLineSeparator(Canvas canvas, int i4, int i5, int i6, int i7) {
        drawSeparator(getLineSeparatorDrawable(), canvas, i4 + this.lineSeparatorMarginLeft, i5 - this.lineSeparatorMarginTop, i6 - this.lineSeparatorMarginRight, i7 + this.lineSeparatorMarginBottom);
    }

    private final void drawSeparator(Canvas canvas, int i4, int i5, int i6, int i7) {
        drawSeparator(getSeparatorDrawable(), canvas, i4 + this.separatorMarginLeft, i5 - this.separatorMarginTop, i6 - this.separatorMarginRight, i7 + this.separatorMarginBottom);
    }

    private final void drawSeparatorsHorizontal(Canvas canvas) {
        int i4;
        E e4 = new E();
        E e5 = new E();
        if (this.lines.size() > 0 && showSeparatorAtStart(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int bottom = firstVisibleLine != null ? firstVisibleLine.getBottom() - firstVisibleLine.getCrossSize() : 0;
            e4.f41130b = bottom;
            drawSeparatorsHorizontal$drawLineSeparator(this, canvas, bottom - this.edgeLineSeparatorOffset);
        }
        boolean z4 = false;
        for (WrapLine wrapLine : this.lines) {
            if (wrapLine.getItemCountNotGone() != 0) {
                int bottom2 = wrapLine.getBottom();
                e5.f41130b = bottom2;
                e4.f41130b = bottom2 - wrapLine.getCrossSize();
                if (z4 && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsHorizontal$drawLineSeparator(this, canvas, e4.f41130b - this.middleLineSeparatorOffset);
                }
                d indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
                int b4 = indices.b();
                int d4 = indices.d();
                int e6 = indices.e();
                if ((e6 > 0 && b4 <= d4) || (e6 < 0 && d4 <= b4)) {
                    i4 = 0;
                    boolean z5 = true;
                    while (true) {
                        View childAt = getChildAt(b4);
                        if (childAt != null && !isHidden(childAt)) {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                            i4 = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + childAt.getRight();
                            if (z5) {
                                if (showLeftSeparator(getShowSeparators())) {
                                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, e4, e5, left - wrapLine.getEdgeSeparatorOffset());
                                }
                                z5 = false;
                            } else if (showSeparatorBetween(getShowSeparators())) {
                                drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, e4, e5, left - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                            }
                        }
                        if (b4 == d4) {
                            break;
                        } else {
                            b4 += e6;
                        }
                    }
                } else {
                    i4 = 0;
                }
                if (i4 > 0 && showRightSeparator(getShowSeparators())) {
                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, e4, e5, i4 + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
                z4 = true;
            }
        }
        if (e5.f41130b <= 0 || !showSeparatorAtEnd(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsHorizontal$drawLineSeparator(this, canvas, e5.f41130b + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsHorizontal$drawLineSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i4) {
        wrapContainerLayout.drawLineSeparator(canvas, wrapContainerLayout.getPaddingLeft(), i4 - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getWidth() - wrapContainerLayout.getPaddingRight(), i4);
    }

    private static final void drawSeparatorsHorizontal$lambda$12$drawSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, E e4, E e5, int i4) {
        wrapContainerLayout.drawSeparator(canvas, i4 - wrapContainerLayout.getSeparatorLength(), e4.f41130b, i4, e5.f41130b);
    }

    private final void drawSeparatorsVertical(Canvas canvas) {
        E e4 = new E();
        E e5 = new E();
        if (this.lines.size() > 0 && showLeftSeparator(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int right = firstVisibleLine != null ? firstVisibleLine.getRight() - firstVisibleLine.getCrossSize() : 0;
            e4.f41130b = right;
            drawSeparatorsVertical$drawLineSeparator$13(this, canvas, right - this.edgeLineSeparatorOffset);
        }
        Iterator it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((kotlin.collections.E) it).a());
            if (wrapLine.getItemCountNotGone() != 0) {
                int right2 = wrapLine.getRight();
                e5.f41130b = right2;
                e4.f41130b = right2 - wrapLine.getCrossSize();
                if (z4 && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsVertical$drawLineSeparator$13(this, canvas, e4.f41130b - this.middleLineSeparatorOffset);
                }
                boolean z5 = true;
                z4 = getLineSeparatorDrawable() != null;
                int itemCount = wrapLine.getItemCount();
                int i4 = 0;
                for (int i5 = 0; i5 < itemCount; i5++) {
                    View childAt = getChildAt(wrapLine.getFirstIndex() + i5);
                    if (childAt != null && !isHidden(childAt)) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                        i4 = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + childAt.getBottom();
                        if (z5) {
                            if (showSeparatorAtStart(getShowSeparators())) {
                                drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, e4, e5, top - wrapLine.getEdgeSeparatorOffset());
                            }
                            z5 = false;
                        } else if (showSeparatorBetween(getShowSeparators())) {
                            drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, e4, e5, top - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                        }
                    }
                }
                if (i4 > 0 && showSeparatorAtEnd(getShowSeparators())) {
                    drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, e4, e5, i4 + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
            }
        }
        if (e5.f41130b <= 0 || !showRightSeparator(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsVertical$drawLineSeparator$13(this, canvas, e5.f41130b + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsVertical$drawLineSeparator$13(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i4) {
        wrapContainerLayout.drawLineSeparator(canvas, i4 - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getPaddingTop(), i4, wrapContainerLayout.getHeight() - wrapContainerLayout.getPaddingBottom());
    }

    private static final void drawSeparatorsVertical$lambda$16$drawSeparator$15(WrapContainerLayout wrapContainerLayout, Canvas canvas, E e4, E e5, int i4) {
        wrapContainerLayout.drawSeparator(canvas, e4.f41130b, i4 - wrapContainerLayout.getSeparatorLength(), e5.f41130b, i4);
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (showSeparatorAtEnd(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (showSeparatorAtEnd(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final WrapLine getFirstVisibleLine() {
        Object obj = null;
        if (this.isRowDirection || !com.yandex.div.core.util.ViewsKt.isLayoutRtl(this)) {
            Iterator<T> it = this.lines.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((WrapLine) next).isVisible()) {
                    obj = next;
                    break;
                }
            }
            return (WrapLine) obj;
        }
        List<WrapLine> list = this.lines;
        ListIterator<WrapLine> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (((WrapLine) previous).isVisible()) {
                obj = previous;
                break;
            }
        }
        return (WrapLine) obj;
    }

    private final boolean getHasIncorrectSize(View view) {
        if (this.isRowDirection) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return isIncorrectForCrossAxis(layoutParams != null ? Integer.valueOf(layoutParams.height) : null);
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return isIncorrectForCrossAxis(layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null);
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator<T> it = this.lines.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((WrapLine) it.next()).getMainSize());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((WrapLine) it.next()).getMainSize());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getLeftOffsetForVerticalLayout(View view, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int b4 = AbstractC1317t.b(DivViewGroup.Companion.toHorizontalGravity(divLayoutParams.getGravity()), AbstractC1281a0.C(this));
        return b4 != 1 ? b4 != 5 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (i4 - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : (((i4 - view.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
    }

    private final int getLineSeparatorLength() {
        int intrinsicWidth;
        int i4;
        if (this.isRowDirection) {
            Drawable lineSeparatorDrawable = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable != null ? lineSeparatorDrawable.getIntrinsicHeight() : 0) + this.lineSeparatorMarginTop;
            i4 = this.lineSeparatorMarginBottom;
        } else {
            Drawable lineSeparatorDrawable2 = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable2 != null ? lineSeparatorDrawable2.getIntrinsicWidth() : 0) + this.lineSeparatorMarginLeft;
            i4 = this.lineSeparatorMarginRight;
        }
        return intrinsicWidth + i4;
    }

    private final int getMiddleLineSeparatorLength() {
        if (showSeparatorBetween(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (showSeparatorBetween(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getSeparatorLength() {
        int intrinsicHeight;
        int i4;
        if (this.isRowDirection) {
            Drawable separatorDrawable = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable != null ? separatorDrawable.getIntrinsicWidth() : 0) + this.separatorMarginLeft;
            i4 = this.separatorMarginRight;
        } else {
            Drawable separatorDrawable2 = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable2 != null ? separatorDrawable2.getIntrinsicHeight() : 0) + this.separatorMarginTop;
            i4 = this.separatorMarginBottom;
        }
        return intrinsicHeight + i4;
    }

    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    private final int getSize(int i4, int i5, int i6, boolean z4) {
        if (i4 == Integer.MIN_VALUE) {
            return z4 ? Math.min(i5, i6) : (i6 <= i5 && getVisibleLinesCount() <= 1) ? i6 : i5;
        }
        if (i4 != 0) {
            if (i4 != 1073741824) {
                throw new IllegalStateException("Unknown size mode is set: " + i4);
            }
        }
    }

    private final int getStartLineSeparatorLength() {
        if (showSeparatorAtStart(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (showSeparatorAtStart(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getState(int i4, int i5, int i6, int i7, int i8) {
        return (i4 != 0 && i6 < i7) ? View.combineMeasuredStates(i5, i8) : i5;
    }

    private final int getSumOfCrossSize() {
        Iterator<T> it = this.lines.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((WrapLine) it.next()).getCrossSize();
        }
        return i4 + getEdgeLineSeparatorsLength() + (getMiddleLineSeparatorLength() * (getVisibleLinesCount() - 1));
    }

    private final int getTopOffsetForHorizontalLayout(View view, WrapLine wrapLine) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int verticalGravity = DivViewGroup.Companion.toVerticalGravity(divLayoutParams.getGravity());
        return verticalGravity != 16 ? verticalGravity != 80 ? divLayoutParams.isBaselineAligned() ? Math.max(wrapLine.getMaxBaseline() - view.getBaseline(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) : ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin : (wrapLine.getCrossSize() - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin : (((wrapLine.getCrossSize() - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
    }

    private final int getVisibleLinesCount() {
        List<WrapLine> list = this.lines;
        int i4 = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((WrapLine) it.next()).getItemCountNotGone() > 0 && (i4 = i4 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i4;
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }

    private final boolean isHidden(View view) {
        return view.getVisibility() == 8 || getHasIncorrectSize(view);
    }

    private final boolean isIncorrectForCrossAxis(Integer num) {
        return num != null && num.intValue() == -1;
    }

    private final boolean isWrapRequired(int i4, int i5, int i6, int i7, int i8) {
        return i4 != 0 && i5 < (i6 + i7) + (i8 != 0 ? getMiddleSeparatorLength() : 0);
    }

    private final void layoutHorizontal(int i4, int i5) {
        int paddingTop = getPaddingTop() + getStartLineSeparatorLength();
        int b4 = AbstractC1317t.b(getHorizontalGravity$div_release(), AbstractC1281a0.C(this));
        boolean z4 = false;
        for (WrapLine wrapLine : this.lines) {
            float mainSize = (i5 - i4) - wrapLine.getMainSize();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, b4, wrapLine.getItemCountNotGone());
            float paddingLeft = getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndSeparatorLength() : getStartSeparatorLength()) + offsetsHolder.getFirstChildOffset();
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z4) {
                    paddingTop += getMiddleLineSeparatorLength();
                }
                z4 = true;
            }
            d indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
            int b5 = indices.b();
            int d4 = indices.d();
            int e4 = indices.e();
            if ((e4 > 0 && b5 <= d4) || (e4 < 0 && d4 <= b5)) {
                boolean z5 = false;
                while (true) {
                    View child = getChildAt(b5);
                    if (child == null || isHidden(child)) {
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        if (getHasIncorrectSize(child)) {
                            child.layout(0, 0, 0, 0);
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        float f4 = paddingLeft + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                        if (z5) {
                            f4 += getMiddleSeparatorLength();
                        }
                        int topOffsetForHorizontalLayout = getTopOffsetForHorizontalLayout(child, wrapLine) + paddingTop;
                        child.layout(AbstractC3185a.c(f4), topOffsetForHorizontalLayout, AbstractC3185a.c(f4) + child.getMeasuredWidth(), topOffsetForHorizontalLayout + child.getMeasuredHeight());
                        paddingLeft = f4 + child.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + wrapLine.getSpaceBetweenChildren();
                        z5 = true;
                    }
                    if (b5 != d4) {
                        b5 += e4;
                    }
                }
            }
            paddingTop += wrapLine.getCrossSize();
            wrapLine.setRight(AbstractC3185a.c(paddingLeft));
            wrapLine.setBottom(paddingTop);
        }
    }

    private final void layoutVertical(int i4, int i5) {
        int paddingLeft = getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndLineSeparatorLength() : getStartLineSeparatorLength());
        Iterator it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((kotlin.collections.E) it).a());
            float mainSize = (i5 - i4) - wrapLine.getMainSize();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, getVerticalGravity$div_release(), wrapLine.getItemCountNotGone());
            float paddingTop = getPaddingTop() + getStartSeparatorLength() + offsetsHolder.getFirstChildOffset();
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z4) {
                    paddingLeft += getMiddleLineSeparatorLength();
                }
                z4 = true;
            }
            int itemCount = wrapLine.getItemCount();
            boolean z5 = false;
            for (int i6 = 0; i6 < itemCount; i6++) {
                View child = getChildAt(wrapLine.getFirstIndex() + i6);
                if (child == null || isHidden(child)) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    if (getHasIncorrectSize(child)) {
                        child.layout(0, 0, 0, 0);
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    float f4 = paddingTop + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                    if (z5) {
                        f4 += getMiddleSeparatorLength();
                    }
                    int leftOffsetForVerticalLayout = getLeftOffsetForVerticalLayout(child, wrapLine.getCrossSize()) + paddingLeft;
                    child.layout(leftOffsetForVerticalLayout, AbstractC3185a.c(f4), child.getMeasuredWidth() + leftOffsetForVerticalLayout, AbstractC3185a.c(f4) + child.getMeasuredHeight());
                    paddingTop = f4 + child.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + wrapLine.getSpaceBetweenChildren();
                    z5 = true;
                }
            }
            paddingLeft += wrapLine.getCrossSize();
            wrapLine.setRight(paddingLeft);
            wrapLine.setBottom(AbstractC3185a.c(paddingTop));
        }
    }

    private final boolean showLeftSeparator(int i4) {
        return com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? showSeparatorAtEnd(i4) : showSeparatorAtStart(i4);
    }

    private final boolean showRightSeparator(int i4) {
        return com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? showSeparatorAtStart(i4) : showSeparatorAtEnd(i4);
    }

    private final boolean showSeparatorAtEnd(int i4) {
        return (i4 & 4) != 0;
    }

    private final boolean showSeparatorAtStart(int i4) {
        return (i4 & 1) != 0;
    }

    private final boolean showSeparatorBetween(int i4) {
        return (i4 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (getSeparatorDrawable() == null && getLineSeparatorDrawable() == null) {
            return;
        }
        if (getShowSeparators() == 0 && getShowLineSeparators() == 0) {
            return;
        }
        if (this.isRowDirection) {
            drawSeparatorsHorizontal(canvas);
        } else {
            drawSeparatorsVertical(canvas);
        }
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        WrapLine firstVisibleLine = getFirstVisibleLine();
        return firstVisibleLine != null ? firstVisibleLine.getMaxBaseline() + getPaddingTop() : super.getBaseline();
    }

    @Nullable
    public final Drawable getLineSeparatorDrawable() {
        return (Drawable) this.lineSeparatorDrawable$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Nullable
    public final Drawable getSeparatorDrawable() {
        return (Drawable) this.separatorDrawable$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final int getShowLineSeparators() {
        return ((Number) this.showLineSeparators$delegate.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final int getShowSeparators() {
        return ((Number) this.showSeparators$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getWrapDirection() {
        return this.wrapDirection;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        if (this.isRowDirection) {
            layoutHorizontal(i4, i6);
        } else {
            layoutVertical(i5, i7);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int mode;
        int size;
        int i7;
        this.lines.clear();
        this.childState = 0;
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (getAspectRatio() != 0.0f && mode2 == 1073741824) {
            int c4 = AbstractC3185a.c(size2 / getAspectRatio());
            size = c4;
            i6 = View.MeasureSpec.makeMeasureSpec(c4, 1073741824);
            mode = 1073741824;
        } else {
            i6 = i5;
            mode = View.MeasureSpec.getMode(i5);
            size = View.MeasureSpec.getSize(i5);
        }
        calculateLines(i4, i6);
        if (this.isRowDirection) {
            determineCrossSize(i6, getVerticalGravity$div_release(), getVerticalPaddings$div_release());
        } else {
            determineCrossSize(i4, getHorizontalGravity$div_release(), getHorizontalPaddings$div_release());
        }
        int largestMainSize = this.isRowDirection ? getLargestMainSize() : getSumOfCrossSize() + getHorizontalPaddings$div_release();
        int sumOfCrossSize = this.isRowDirection ? getSumOfCrossSize() + getVerticalPaddings$div_release() : getLargestMainSize();
        this.childState = getState(mode2, this.childState, size2, largestMainSize, 16777216);
        int resolveSizeAndState = View.resolveSizeAndState(getSize(mode2, size2, largestMainSize, !this.isRowDirection), i4, this.childState);
        if (!this.isRowDirection || getAspectRatio() == 0.0f || mode2 == 1073741824) {
            i7 = mode;
        } else {
            size = AbstractC3185a.c((16777215 & resolveSizeAndState) / getAspectRatio());
            i6 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i7 = 1073741824;
        }
        int i8 = size;
        this.childState = getState(i7, this.childState, i8, sumOfCrossSize, UserVerificationMethods.USER_VERIFY_HANDPRINT);
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(getSize(i7, i8, sumOfCrossSize, this.isRowDirection), i6, this.childState));
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f4) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[4], Float.valueOf(f4));
    }

    public final void setLineSeparatorDrawable(@Nullable Drawable drawable) {
        this.lineSeparatorDrawable$delegate.setValue(this, $$delegatedProperties[3], drawable);
    }

    public final void setLineSeparatorMargins(int i4, int i5, int i6, int i7) {
        this.lineSeparatorMarginLeft = i4;
        this.lineSeparatorMarginRight = i6;
        this.lineSeparatorMarginTop = i5;
        this.lineSeparatorMarginBottom = i7;
        requestLayout();
    }

    public final void setSeparatorDrawable(@Nullable Drawable drawable) {
        this.separatorDrawable$delegate.setValue(this, $$delegatedProperties[2], drawable);
    }

    public final void setSeparatorMargins(int i4, int i5, int i6, int i7) {
        this.separatorMarginLeft = i4;
        this.separatorMarginRight = i6;
        this.separatorMarginTop = i5;
        this.separatorMarginBottom = i7;
        requestLayout();
    }

    public final void setShowLineSeparators(int i4) {
        this.showLineSeparators$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i4));
    }

    public final void setShowSeparators(int i4) {
        this.showSeparators$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i4));
    }

    public final void setWrapDirection(int i4) {
        if (this.wrapDirection != i4) {
            this.wrapDirection = i4;
            boolean z4 = true;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Invalid value for the wrap direction is set: " + this.wrapDirection);
                }
                z4 = false;
            }
            this.isRowDirection = z4;
            requestLayout();
        }
    }

    @Metadata
    private static final class WrapLine {
        private int bottom;
        private int crossSize;
        private int edgeSeparatorOffset;
        private final int firstIndex;
        private int goneItemCount;
        private int itemCount;
        private int mainSize;
        private int maxBaseline;
        private int maxHeightUnderBaseline;
        private int right;
        private float spaceBetweenChildren;

        public WrapLine(int i4, int i5, int i6) {
            this.firstIndex = i4;
            this.mainSize = i5;
            this.itemCount = i6;
            this.maxBaseline = -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WrapLine)) {
                return false;
            }
            WrapLine wrapLine = (WrapLine) obj;
            return this.firstIndex == wrapLine.firstIndex && this.mainSize == wrapLine.mainSize && this.itemCount == wrapLine.itemCount;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getCrossSize() {
            return this.crossSize;
        }

        public final int getEdgeSeparatorOffset() {
            return this.edgeSeparatorOffset;
        }

        public final int getFirstIndex() {
            return this.firstIndex;
        }

        public final int getGoneItemCount() {
            return this.goneItemCount;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final int getItemCountNotGone() {
            return this.itemCount - this.goneItemCount;
        }

        public final int getMainSize() {
            return this.mainSize;
        }

        public final int getMaxBaseline() {
            return this.maxBaseline;
        }

        public final int getMaxHeightUnderBaseline() {
            return this.maxHeightUnderBaseline;
        }

        public final int getRight() {
            return this.right;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.firstIndex) * 31) + Integer.hashCode(this.mainSize)) * 31) + Integer.hashCode(this.itemCount);
        }

        public final boolean isVisible() {
            return getItemCountNotGone() > 0;
        }

        public final void setBottom(int i4) {
            this.bottom = i4;
        }

        public final void setCrossSize(int i4) {
            this.crossSize = i4;
        }

        public final void setEdgeSeparatorOffset(int i4) {
            this.edgeSeparatorOffset = i4;
        }

        public final void setGoneItemCount(int i4) {
            this.goneItemCount = i4;
        }

        public final void setItemCount(int i4) {
            this.itemCount = i4;
        }

        public final void setMainSize(int i4) {
            this.mainSize = i4;
        }

        public final void setMaxBaseline(int i4) {
            this.maxBaseline = i4;
        }

        public final void setMaxHeightUnderBaseline(int i4) {
            this.maxHeightUnderBaseline = i4;
        }

        public final void setRight(int i4) {
            this.right = i4;
        }

        public final void setSpaceBetweenChildren(float f4) {
            this.spaceBetweenChildren = f4;
        }

        @NotNull
        public String toString() {
            return "WrapLine(firstIndex=" + this.firstIndex + ", mainSize=" + this.mainSize + ", itemCount=" + this.itemCount + ')';
        }

        public /* synthetic */ WrapLine(int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 0 : i4, (i7 & 2) != 0 ? 0 : i5, (i7 & 4) != 0 ? 0 : i6);
        }
    }

    private final Unit drawSeparator(Drawable drawable, Canvas canvas, int i4, int i5, int i6, int i7) {
        if (drawable == null) {
            return null;
        }
        float f4 = (i4 + i6) / 2.0f;
        float f5 = (i5 + i7) / 2.0f;
        float intrinsicWidth = drawable.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = drawable.getIntrinsicHeight() / 2.0f;
        drawable.setBounds((int) (f4 - intrinsicWidth), (int) (f5 - intrinsicHeight), (int) (f4 + intrinsicWidth), (int) (f5 + intrinsicHeight));
        drawable.draw(canvas);
        return Unit.f41027a;
    }
}
