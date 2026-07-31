package com.yandex.div.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.InterfaceC1490j3;
import com.yandex.div.R$styleable;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes2.dex */
public abstract class GridContainer extends DivViewGroup {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Grid grid;
    private boolean initialized;
    private int lastLayoutHashCode;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static final class Cell {
        private final int columnIndex;
        private int columnSpan;
        private final int rowIndex;
        private int rowSpan;
        private final int viewIndex;

        public Cell(int i4, int i5, int i6, int i7, int i8) {
            this.viewIndex = i4;
            this.columnIndex = i5;
            this.rowIndex = i6;
            this.columnSpan = i7;
            this.rowSpan = i8;
        }

        public final int getColumnIndex() {
            return this.columnIndex;
        }

        public final int getColumnSpan() {
            return this.columnSpan;
        }

        public final int getRowIndex() {
            return this.rowIndex;
        }

        public final int getRowSpan() {
            return this.rowSpan;
        }

        public final int getViewIndex() {
            return this.viewIndex;
        }

        public final void setRowSpan(int i4) {
            this.rowSpan = i4;
        }
    }

    @Metadata
    private static final class CellProjection {
        private final int contentSize;
        private final int index;
        private final int marginEnd;
        private final int marginStart;
        private final int span;
        private final float weight;

        public CellProjection(int i4, int i5, int i6, int i7, int i8, float f4) {
            this.index = i4;
            this.contentSize = i5;
            this.marginStart = i6;
            this.marginEnd = i7;
            this.span = i8;
            this.weight = f4;
        }

        public final int getContentSize() {
            return this.contentSize;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getSize() {
            return this.contentSize + this.marginStart + this.marginEnd;
        }

        public final int getSpan() {
            return this.span;
        }

        public final int getSpecificSize() {
            return getSize() / this.span;
        }

        public final float getWeight() {
            return this.weight;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    final class Grid {

        @NotNull
        private final SizeConstraint heightConstraint;

        @NotNull
        private final SizeConstraint widthConstraint;
        private int columnCount = 1;

        @NotNull
        private final Resettable<List<Cell>> _cells = new Resettable<>(new GridContainer$Grid$_cells$1(this));

        @NotNull
        private final Resettable<List<Line>> _columns = new Resettable<>(new GridContainer$Grid$_columns$1(this));

        @NotNull
        private final Resettable<List<Line>> _rows = new Resettable<>(new GridContainer$Grid$_rows$1(this));

        public Grid() {
            int i4 = 0;
            int i5 = 3;
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.widthConstraint = new SizeConstraint(i4, i4, i5, defaultConstructorMarker);
            this.heightConstraint = new SizeConstraint(i4, i4, i5, defaultConstructorMarker);
        }

        private final void adjustWeightedLines(List<Line> list, SizeConstraint sizeConstraint) {
            int size = list.size();
            float f4 = 0.0f;
            int i4 = 0;
            float f5 = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                Line line = list.get(i5);
                if (line.isFlexible()) {
                    f4 += line.getWeight();
                    f5 = Math.max(f5, line.getSize() / line.getWeight());
                } else {
                    i4 += line.getSize();
                }
                line.getSize();
            }
            int size2 = list.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size2; i7++) {
                Line line2 = list.get(i7);
                i6 += line2.isFlexible() ? (int) Math.ceil(line2.getWeight() * f5) : line2.getSize();
            }
            float max = Math.max(0, Math.max(sizeConstraint.getMin(), i6) - i4) / f4;
            int size3 = list.size();
            for (int i8 = 0; i8 < size3; i8++) {
                Line line3 = list.get(i8);
                if (line3.isFlexible()) {
                    int ceil = (int) Math.ceil(line3.getWeight() * max);
                    Line.include$default(line3, ceil - line3.getMarginSize(), ceil, 0.0f, 4, null);
                }
            }
        }

        private final void align(List<Line> list) {
            int size = list.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Line line = list.get(i5);
                line.setOffset(i4);
                i4 += line.getSize();
            }
        }

        private final int calculateSize(List<Line> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Line line = (Line) CollectionsKt.last((List) list);
            return line.getOffset() + line.getSize();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Cell> distributeCells() {
            Integer valueOf;
            if (GridContainer.this.getChildCount() == 0) {
                return CollectionsKt.emptyList();
            }
            int i4 = this.columnCount;
            ArrayList arrayList = new ArrayList(GridContainer.this.getChildCount());
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            GridContainer gridContainer = GridContainer.this;
            int childCount = gridContainer.getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View child = gridContainer.getChildAt(i6);
                if (child.getVisibility() != 8) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    Integer s02 = AbstractC3219i.s0(iArr2);
                    int intValue = s02 != null ? s02.intValue() : 0;
                    int Q3 = AbstractC3219i.Q(iArr2, intValue);
                    int i7 = i5 + intValue;
                    IntRange p4 = g.p(0, i4);
                    int b4 = p4.b();
                    int d4 = p4.d();
                    if (b4 <= d4) {
                        while (true) {
                            iArr2[b4] = Math.max(0, iArr2[b4] - intValue);
                            if (b4 == d4) {
                                break;
                            }
                            b4++;
                        }
                    }
                    DivViewGroup.Companion companion = DivViewGroup.Companion;
                    ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int min = Math.min(divLayoutParams.getColumnSpan(), i4 - Q3);
                    int rowSpan = divLayoutParams.getRowSpan();
                    arrayList.add(new Cell(i6, Q3, i7, min, rowSpan));
                    int i8 = Q3 + min;
                    while (Q3 < i8) {
                        if (iArr2[Q3] > 0) {
                            Object obj = arrayList.get(iArr[Q3]);
                            Intrinsics.checkNotNullExpressionValue(obj, "cells[cellIndices[i]]");
                            Cell cell = (Cell) obj;
                            int columnIndex = cell.getColumnIndex();
                            int columnSpan = cell.getColumnSpan() + columnIndex;
                            while (columnIndex < columnSpan) {
                                int i9 = iArr2[columnIndex];
                                iArr2[columnIndex] = 0;
                                columnIndex++;
                            }
                            cell.setRowSpan(i7 - cell.getRowIndex());
                        }
                        iArr[Q3] = i6;
                        iArr2[Q3] = rowSpan;
                        Q3++;
                    }
                    i5 = i7;
                }
            }
            if (i4 == 0) {
                valueOf = null;
            } else {
                int i10 = iArr2[0];
                int K3 = AbstractC3219i.K(iArr2);
                if (K3 == 0) {
                    valueOf = Integer.valueOf(i10);
                } else {
                    int i11 = 1;
                    int max = Math.max(1, i10);
                    E it = new IntRange(1, K3).iterator();
                    while (it.hasNext()) {
                        int i12 = iArr2[it.a()];
                        int max2 = Math.max(i11, i12);
                        if (max > max2) {
                            i10 = i12;
                            max = max2;
                        }
                        i11 = 1;
                    }
                    valueOf = Integer.valueOf(i10);
                }
            }
            int rowIndex = ((Cell) CollectionsKt.last((List) arrayList)).getRowIndex() + (valueOf != null ? valueOf.intValue() : 1);
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                Cell cell2 = (Cell) arrayList.get(i13);
                if (cell2.getRowIndex() + cell2.getRowSpan() > rowIndex) {
                    cell2.setRowSpan(rowIndex - cell2.getRowIndex());
                }
            }
            return arrayList;
        }

        private final int getHeight() {
            return calculateSize(getRows());
        }

        private final int getWidth() {
            return calculateSize(getColumns());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureColumns() {
            int i4;
            float f4;
            int i5;
            float columnWeight;
            float columnWeight2;
            int i6;
            int i7 = this.columnCount;
            SizeConstraint sizeConstraint = this.widthConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                Cell cell = list.get(i9);
                View child = gridContainer.getChildAt(cell.getViewIndex());
                Intrinsics.checkNotNullExpressionValue(child, "child");
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int columnIndex = cell.getColumnIndex();
                int measuredWidth = child.getMeasuredWidth();
                int i10 = ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                int i11 = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                int columnSpan = cell.getColumnSpan();
                columnWeight2 = GridContainerKt.getColumnWeight(divLayoutParams);
                CellProjection cellProjection = new CellProjection(columnIndex, measuredWidth, i10, i11, columnSpan, columnWeight2);
                if (cellProjection.getSpan() == 1) {
                    ((Line) arrayList.get(cellProjection.getIndex())).include(cellProjection.getContentSize(), cellProjection.getSize(), cellProjection.getWeight());
                } else {
                    int span = cellProjection.getSpan() - 1;
                    float weight = cellProjection.getWeight() / cellProjection.getSpan();
                    if (span >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.getIndex() + i6), 0, 0, weight, 3, null);
                            i6 = i6 != span ? i6 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Cell cell2 = list.get(i12);
                View child2 = gridContainer2.getChildAt(cell2.getViewIndex());
                Intrinsics.checkNotNullExpressionValue(child2, "child");
                DivViewGroup.Companion companion2 = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams2 = child2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                int columnIndex2 = cell2.getColumnIndex();
                int measuredWidth2 = child2.getMeasuredWidth();
                int i13 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).leftMargin;
                int i14 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).rightMargin;
                int columnSpan2 = cell2.getColumnSpan();
                columnWeight = GridContainerKt.getColumnWeight(divLayoutParams2);
                CellProjection cellProjection2 = new CellProjection(columnIndex2, measuredWidth2, i13, i14, columnSpan2, columnWeight);
                if (cellProjection2.getSpan() > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            CollectionsKt.sortWith(arrayList2, SpannedCellComparator.INSTANCE);
            int size3 = arrayList2.size();
            for (int i15 = 0; i15 < size3; i15++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i15);
                int index = cellProjection3.getIndex();
                int index2 = (cellProjection3.getIndex() + cellProjection3.getSpan()) - 1;
                int size4 = cellProjection3.getSize();
                if (index <= index2) {
                    int i16 = index;
                    i4 = size4;
                    f4 = 0.0f;
                    i5 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i16);
                        size4 -= line.getSize();
                        if (line.isFlexible()) {
                            f4 += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i5++;
                            }
                            i4 -= line.getSize();
                        }
                        if (i16 == index2) {
                            break;
                        }
                        i16++;
                    }
                } else {
                    i4 = size4;
                    f4 = 0.0f;
                    i5 = 0;
                }
                if (f4 > 0.0f) {
                    if (index <= index2) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(index);
                            if (line2.isFlexible()) {
                                int ceil = (int) Math.ceil((line2.getWeight() / f4) * i4);
                                Line.include$default(line2, ceil - line2.getMarginSize(), ceil, 0.0f, 4, null);
                            }
                            if (index != index2) {
                                index++;
                            }
                        }
                    }
                } else if (size4 > 0 && index <= index2) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(index);
                        if (i5 <= 0) {
                            int span2 = size4 / cellProjection3.getSpan();
                            Line.include$default(line3, line3.getContentSize() + span2, line3.getSize() + span2, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i17 = size4 / i5;
                            Line.include$default(line3, line3.getContentSize() + i17, line3.getSize() + i17, 0.0f, 4, null);
                        }
                        if (index != index2) {
                            index++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureRows() {
            int i4;
            float f4;
            int i5;
            float rowWeight;
            float rowWeight2;
            int i6;
            int rowCount = getRowCount();
            SizeConstraint sizeConstraint = this.heightConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(rowCount);
            for (int i7 = 0; i7 < rowCount; i7++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                Cell cell = list.get(i8);
                View child = gridContainer.getChildAt(cell.getViewIndex());
                Intrinsics.checkNotNullExpressionValue(child, "child");
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int rowIndex = cell.getRowIndex();
                int measuredHeight = child.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                int i10 = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                int rowSpan = cell.getRowSpan();
                rowWeight2 = GridContainerKt.getRowWeight(divLayoutParams);
                CellProjection cellProjection = new CellProjection(rowIndex, measuredHeight, i9, i10, rowSpan, rowWeight2);
                if (cellProjection.getSpan() == 1) {
                    ((Line) arrayList.get(cellProjection.getIndex())).include(cellProjection.getContentSize(), cellProjection.getSize(), cellProjection.getWeight());
                } else {
                    int span = cellProjection.getSpan() - 1;
                    float weight = cellProjection.getWeight() / cellProjection.getSpan();
                    if (span >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.getIndex() + i6), 0, 0, weight, 3, null);
                            i6 = i6 != span ? i6 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Cell cell2 = list.get(i11);
                View child2 = gridContainer2.getChildAt(cell2.getViewIndex());
                Intrinsics.checkNotNullExpressionValue(child2, "child");
                DivViewGroup.Companion companion2 = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams2 = child2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                int rowIndex2 = cell2.getRowIndex();
                int measuredHeight2 = child2.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).topMargin;
                int i13 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).bottomMargin;
                int rowSpan2 = cell2.getRowSpan();
                rowWeight = GridContainerKt.getRowWeight(divLayoutParams2);
                CellProjection cellProjection2 = new CellProjection(rowIndex2, measuredHeight2, i12, i13, rowSpan2, rowWeight);
                if (cellProjection2.getSpan() > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            CollectionsKt.sortWith(arrayList2, SpannedCellComparator.INSTANCE);
            int size3 = arrayList2.size();
            for (int i14 = 0; i14 < size3; i14++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i14);
                int index = cellProjection3.getIndex();
                int index2 = (cellProjection3.getIndex() + cellProjection3.getSpan()) - 1;
                int size4 = cellProjection3.getSize();
                if (index <= index2) {
                    int i15 = index;
                    i4 = size4;
                    f4 = 0.0f;
                    i5 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i15);
                        size4 -= line.getSize();
                        if (line.isFlexible()) {
                            f4 += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i5++;
                            }
                            i4 -= line.getSize();
                        }
                        if (i15 == index2) {
                            break;
                        }
                        i15++;
                    }
                } else {
                    i4 = size4;
                    f4 = 0.0f;
                    i5 = 0;
                }
                if (f4 > 0.0f) {
                    if (index <= index2) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(index);
                            if (line2.isFlexible()) {
                                int ceil = (int) Math.ceil((line2.getWeight() / f4) * i4);
                                Line.include$default(line2, ceil - line2.getMarginSize(), ceil, 0.0f, 4, null);
                            }
                            if (index != index2) {
                                index++;
                            }
                        }
                    }
                } else if (size4 > 0 && index <= index2) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(index);
                        if (i5 <= 0) {
                            int span2 = size4 / cellProjection3.getSpan();
                            Line.include$default(line3, line3.getContentSize() + span2, line3.getSize() + span2, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i16 = size4 / i5;
                            Line.include$default(line3, line3.getContentSize() + i16, line3.getSize() + i16, 0.0f, 4, null);
                        }
                        if (index != index2) {
                            index++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        private final int rowCount(List<Cell> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Cell cell = (Cell) CollectionsKt.last((List) list);
            return cell.getRowIndex() + cell.getRowSpan();
        }

        @NotNull
        public final List<Cell> getCells() {
            return this._cells.get();
        }

        public final int getColumnCount() {
            return this.columnCount;
        }

        @NotNull
        public final List<Line> getColumns() {
            return this._columns.get();
        }

        public final int getMeasuredHeight() {
            if (this._rows.getInitialized()) {
                return calculateSize(this._rows.get());
            }
            return 0;
        }

        public final int getMeasuredWidth() {
            if (this._columns.getInitialized()) {
                return calculateSize(this._columns.get());
            }
            return 0;
        }

        public final int getRowCount() {
            return rowCount(getCells());
        }

        @NotNull
        public final List<Line> getRows() {
            return this._rows.get();
        }

        public final void invalidateMeasurement() {
            this._columns.reset();
            this._rows.reset();
        }

        public final void invalidateStructure() {
            this._cells.reset();
            invalidateMeasurement();
        }

        public final int measureHeight(int i4) {
            this.heightConstraint.set(i4);
            return Math.max(this.heightConstraint.getMin(), Math.min(getHeight(), this.heightConstraint.getMax()));
        }

        public final int measureWidth(int i4) {
            this.widthConstraint.set(i4);
            return Math.max(this.widthConstraint.getMin(), Math.min(getWidth(), this.widthConstraint.getMax()));
        }

        public final void setColumnCount(int i4) {
            if (i4 <= 0 || this.columnCount == i4) {
                return;
            }
            this.columnCount = i4;
            invalidateStructure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static final class Line {
        private int contentSize;
        private int offset;
        private int size;
        private float weight;

        public static /* synthetic */ void include$default(Line line, int i4, int i5, float f4, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = 0;
            }
            if ((i6 & 4) != 0) {
                f4 = 0.0f;
            }
            line.include(i4, i5, f4);
        }

        public final int getContentSize() {
            return this.contentSize;
        }

        public final int getMarginSize() {
            return this.size - this.contentSize;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getSize() {
            return this.size;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final void include(int i4, int i5, float f4) {
            this.contentSize = Math.max(this.contentSize, i4);
            this.size = Math.max(this.size, i5);
            this.weight = Math.max(this.weight, f4);
        }

        public final boolean isFlexible() {
            return this.weight > 0.0f;
        }

        public final void setOffset(int i4) {
            this.offset = i4;
        }
    }

    @Metadata
    private static final class SpannedCellComparator implements Comparator<CellProjection> {

        @NotNull
        public static final SpannedCellComparator INSTANCE = new SpannedCellComparator();

        private SpannedCellComparator() {
        }

        @Override // java.util.Comparator
        public int compare(@NotNull CellProjection lhs, @NotNull CellProjection rhs) {
            Intrinsics.checkNotNullParameter(lhs, "lhs");
            Intrinsics.checkNotNullParameter(rhs, "rhs");
            if (lhs.getSpecificSize() < rhs.getSpecificSize()) {
                return 1;
            }
            return lhs.getSpecificSize() > rhs.getSpecificSize() ? -1 : 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.grid = new Grid();
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GridContainer, i4, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ntainer, defStyleAttr, 0)");
            try {
                setColumnCount(obtainStyledAttributes.getInt(R$styleable.GridContainer_android_columnCount, 1));
                setGravity(obtainStyledAttributes.getInt(R$styleable.GridContainer_android_gravity, 8388659));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.initialized = true;
    }

    private final int calculateChildHorizontalPosition(int i4, int i5, int i6, int i7) {
        int i8 = i7 & 7;
        return i8 != 1 ? i8 != 5 ? i4 : (i4 + i5) - i6 : i4 + ((i5 - i6) / 2);
    }

    private final int calculateChildVerticalPosition(int i4, int i5, int i6, int i7) {
        int i8 = i7 & InterfaceC1490j3.d.b.f16818j;
        return i8 != 16 ? i8 != 80 ? i4 : (i4 + i5) - i6 : i4 + ((i5 - i6) / 2);
    }

    private final int calculateGridHorizontalPosition() {
        int gravity = getGravity() & 7;
        int measuredWidth = this.grid.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        return gravity != 1 ? gravity != 5 ? getPaddingLeft() : (getPaddingLeft() + measuredWidth2) - measuredWidth : getPaddingLeft() + ((measuredWidth2 - measuredWidth) / 2);
    }

    private final int calculateGridVerticalPosition() {
        int gravity = getGravity() & InterfaceC1490j3.d.b.f16818j;
        int measuredHeight = this.grid.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        return gravity != 16 ? gravity != 80 ? getPaddingTop() : (getPaddingTop() + measuredHeight2) - measuredHeight : getPaddingTop() + ((measuredHeight2 - measuredHeight) / 2);
    }

    private final void checkConsistency() {
        int i4 = this.lastLayoutHashCode;
        if (i4 == 0) {
            validateLayoutParams();
            this.lastLayoutHashCode = computeLayoutHashCode();
        } else if (i4 != computeLayoutHashCode()) {
            invalidateStructure();
            checkConsistency();
        }
    }

    private final int computeLayoutHashCode() {
        int childCount = getChildCount();
        int i4 = 223;
        for (int i5 = 0; i5 < childCount; i5++) {
            View child = getChildAt(i5);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                i4 = (i4 * 31) + ((DivLayoutParams) layoutParams).hashCode();
            }
        }
        return i4;
    }

    private final int getPaddingHorizontal() {
        return getPaddingLeft() + getPaddingRight();
    }

    private final int getPaddingVertical() {
        return getPaddingTop() + getPaddingBottom();
    }

    private final void invalidateMeasurement() {
        this.grid.invalidateMeasurement();
    }

    private final void invalidateStructure() {
        this.lastLayoutHashCode = 0;
        this.grid.invalidateStructure();
    }

    private final void measureChild(View view, int i4, int i5, int i6, int i7) {
        DivViewGroup.Companion companion = DivViewGroup.Companion;
        int minimumWidth = view.getMinimumWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        int childMeasureSpec = companion.getChildMeasureSpec(i4, 0, i6, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        int minimumHeight = view.getMinimumHeight();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        view.measure(childMeasureSpec, companion.getChildMeasureSpec(i5, 0, i7, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight()));
    }

    private final void measureChildrenInitial(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        GridContainer gridContainer;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View child = getChildAt(i9);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int i10 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                int i11 = i10 == -1 ? 0 : i10;
                int i12 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
                if (i12 == -1) {
                    i8 = 0;
                    gridContainer = this;
                    i6 = i4;
                    i7 = i5;
                } else {
                    i8 = i12;
                    i6 = i4;
                    i7 = i5;
                    gridContainer = this;
                }
                gridContainer.measureChild(child, i6, i7, i11, i8);
            } else {
                i6 = i4;
                i7 = i5;
            }
            i9++;
            i4 = i6;
            i5 = i7;
        }
    }

    private final void measureMatchParentChild(View view, int i4, int i5, int i6, int i7, int i8, int i9) {
        int childMeasureSpec;
        int childMeasureSpec2;
        if (i6 == -1) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            DivViewGroup.Companion companion = DivViewGroup.Companion;
            int minimumWidth = view.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec = companion.getChildMeasureSpec(i4, 0, i6, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        }
        if (i7 == -1) {
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else {
            DivViewGroup.Companion companion2 = DivViewGroup.Companion;
            int minimumHeight = view.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec2 = companion2.getChildMeasureSpec(i5, 0, i7, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight());
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final void remeasureChildrenHeight(int i4, int i5) {
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View child = getChildAt(i7);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    Cell cell = cells.get(i6);
                    Line line = columns.get((cell.getColumnIndex() + cell.getColumnSpan()) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.getColumnIndex()).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    Line line2 = rows.get((cell.getRowIndex() + cell.getRowSpan()) - 1);
                    measureMatchParentChild(child, i4, i5, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, ((line2.getOffset() + line2.getSize()) - rows.get(cell.getRowIndex()).getOffset()) - divLayoutParams.getVerticalMargins$div_release());
                }
                i6++;
            }
        }
    }

    private final void remeasureChildrenWidth(int i4, int i5) {
        int i6;
        int i7;
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (i8 < childCount) {
            View child = getChildAt(i8);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
                    i9++;
                } else {
                    Cell cell = cells.get(i9);
                    Line line = columns.get((cell.getColumnIndex() + cell.getColumnSpan()) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.getColumnIndex()).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    i6 = i4;
                    i7 = i5;
                    measureMatchParentChild(child, i6, i7, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, 0);
                    i9++;
                    i8++;
                    i4 = i6;
                    i5 = i7;
                }
            }
            i6 = i4;
            i7 = i5;
            i8++;
            i4 = i6;
            i5 = i7;
        }
    }

    private final void validateLayoutParams() {
        float columnWeight;
        float rowWeight;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View child = getChildAt(i4);
            Intrinsics.checkNotNullExpressionValue(child, "child");
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getColumnSpan() < 0 || divLayoutParams.getRowSpan() < 0) {
                throw new IllegalStateException("Negative spans are not supported.");
            }
            columnWeight = GridContainerKt.getColumnWeight(divLayoutParams);
            if (columnWeight >= 0.0f) {
                rowWeight = GridContainerKt.getRowWeight(divLayoutParams);
                if (rowWeight >= 0.0f) {
                }
            }
            throw new IllegalStateException("Negative weights are not supported.");
        }
    }

    public final int getColumnCount() {
        return this.grid.getColumnCount();
    }

    public final int getRowCount() {
        return this.grid.getRowCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        long j4;
        List<Line> list;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        List<Cell> cells = this.grid.getCells();
        int calculateGridHorizontalPosition = calculateGridHorizontalPosition();
        int calculateGridVerticalPosition = calculateGridVerticalPosition();
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (i8 < childCount) {
            View child = getChildAt(i8);
            if (child.getVisibility() != 8) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                Cell cell = cells.get(i9);
                int offset = columns.get(cell.getColumnIndex()).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                j4 = elapsedRealtime;
                int offset2 = rows.get(cell.getRowIndex()).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                Line line = columns.get((cell.getColumnIndex() + cell.getColumnSpan()) - 1);
                int offset3 = ((line.getOffset() + line.getSize()) - offset) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                Line line2 = rows.get((cell.getRowIndex() + cell.getRowSpan()) - 1);
                int offset4 = ((line2.getOffset() + line2.getSize()) - offset2) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                list = columns;
                int calculateChildHorizontalPosition = calculateChildHorizontalPosition(offset, offset3, child.getMeasuredWidth(), divLayoutParams.getGravity()) + calculateGridHorizontalPosition;
                int calculateChildVerticalPosition = calculateChildVerticalPosition(offset2, offset4, child.getMeasuredHeight(), divLayoutParams.getGravity()) + calculateGridVerticalPosition;
                child.layout(calculateChildHorizontalPosition, calculateChildVerticalPosition, child.getMeasuredWidth() + calculateChildHorizontalPosition, child.getMeasuredHeight() + calculateChildVerticalPosition);
                i9++;
            } else {
                j4 = elapsedRealtime;
                list = columns;
            }
            i8++;
            elapsedRealtime = j4;
            columns = list;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "GridContainer", "onLayout() performed in " + elapsedRealtime2 + " ms");
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        invalidateMeasurement();
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4 - paddingHorizontal), View.MeasureSpec.getMode(i4));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5 - paddingVertical), View.MeasureSpec.getMode(i5));
        measureChildrenInitial(makeMeasureSpec, makeMeasureSpec2);
        int measureWidth = this.grid.measureWidth(makeMeasureSpec);
        remeasureChildrenWidth(makeMeasureSpec, makeMeasureSpec2);
        int measureHeight = this.grid.measureHeight(makeMeasureSpec2);
        remeasureChildrenHeight(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(measureWidth + paddingHorizontal, getSuggestedMinimumWidth()), i4, 0), View.resolveSizeAndState(Math.max(measureHeight + paddingVertical, getSuggestedMinimumHeight()), i5, 0));
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "GridContainer", "onMeasure() performed in " + elapsedRealtime2 + " ms");
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.onViewAdded(child);
        invalidateStructure();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.onViewRemoved(child);
        invalidateStructure();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.initialized) {
            invalidateMeasurement();
        }
    }

    public final void setColumnCount(int i4) {
        this.grid.setColumnCount(i4);
        invalidateStructure();
        requestLayout();
    }

    @Metadata
    private static final class SizeConstraint {
        private int max;
        private int min;

        public SizeConstraint(int i4, int i5) {
            this.min = i4;
            this.max = i5;
        }

        public final int getMax() {
            return this.max;
        }

        public final int getMin() {
            return this.min;
        }

        public final void set(int i4) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            if (mode == Integer.MIN_VALUE) {
                this.min = 0;
                this.max = size;
            } else if (mode == 0) {
                this.min = 0;
                this.max = 32768;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.min = size;
                this.max = size;
            }
        }

        public /* synthetic */ SizeConstraint(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 32768 : i5);
        }
    }
}
