package com.donkingliang.groupedadapter.decoration;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;

/* loaded from: classes3.dex */
public abstract class AbsGroupedGridItemDecoration extends RecyclerView.ItemDecoration implements a {
    protected GroupedRecyclerViewAdapter mAdapter;
    private final Rect mBounds = new Rect();

    public AbsGroupedGridItemDecoration(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        this.mAdapter = groupedRecyclerViewAdapter;
    }

    private Drawable getColumnDividerForType(int i8, int i9, int i10, int i11) {
        if (i8 == GroupedRecyclerViewAdapter.TYPE_HEADER) {
            if (i11 == 1) {
                return null;
            }
            return getHeaderDivider(i9);
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_FOOTER) {
            if (i11 == 1) {
                return null;
            }
            return getFooterDivider(i9);
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_CHILD) {
            return getChildColumnDivider(i9, i10);
        }
        return null;
    }

    private int getColumnDividerSizeForType(int i8, int i9, int i10, int i11) {
        if (i8 == GroupedRecyclerViewAdapter.TYPE_HEADER) {
            if (i11 == 1) {
                return 0;
            }
            return getHeaderDividerSize(i9);
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_FOOTER) {
            if (i11 == 1) {
                return 0;
            }
            return getFooterDividerSize(i9);
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_CHILD) {
            return getChildColumnDividerSize(i9, i10);
        }
        return 0;
    }

    private Drawable getRowDividerForType(int i8, int i9, int i10, int i11) {
        if (i8 == GroupedRecyclerViewAdapter.TYPE_HEADER) {
            if (i11 == 1) {
                return getHeaderDivider(i9);
            }
            return null;
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_FOOTER) {
            if (i11 == 1) {
                return getFooterDivider(i9);
            }
            return null;
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_CHILD) {
            return getChildRowDivider(i9, i10);
        }
        return null;
    }

    private int getRowDividerSizeForType(int i8, int i9, int i10, int i11) {
        if (i8 == GroupedRecyclerViewAdapter.TYPE_HEADER) {
            if (i11 == 1) {
                return getHeaderDividerSize(i9);
            }
            return 0;
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_FOOTER) {
            if (i11 == 1) {
                return getFooterDividerSize(i9);
            }
            return 0;
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_CHILD) {
            return getChildRowDividerSize(i9, i10);
        }
        return 0;
    }

    @Override // com.donkingliang.groupedadapter.decoration.a
    public boolean checkLayoutManager(RecyclerView recyclerView) {
        return recyclerView.getLayoutManager() != null && (recyclerView.getLayoutManager() instanceof GridLayoutManager);
    }

    @Override // com.donkingliang.groupedadapter.decoration.a
    public abstract /* synthetic */ Drawable getChildColumnDivider(int i8, int i9);

    @Override // com.donkingliang.groupedadapter.decoration.a
    public abstract /* synthetic */ int getChildColumnDividerSize(int i8, int i9);

    @Override // com.donkingliang.groupedadapter.decoration.a
    public abstract /* synthetic */ Drawable getChildRowDivider(int i8, int i9);

    @Override // com.donkingliang.groupedadapter.decoration.a
    public abstract /* synthetic */ int getChildRowDividerSize(int i8, int i9);

    @Override // com.donkingliang.groupedadapter.decoration.a
    public abstract /* synthetic */ Drawable getFooterDivider(int i8);

    @Override // com.donkingliang.groupedadapter.decoration.a
    public abstract /* synthetic */ int getFooterDividerSize(int i8);

    @Override // com.donkingliang.groupedadapter.decoration.a
    public abstract /* synthetic */ Drawable getHeaderDivider(int i8);

    @Override // com.donkingliang.groupedadapter.decoration.a
    public abstract /* synthetic */ int getHeaderDividerSize(int i8);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (!checkLayoutManager(recyclerView)) {
            rect.set(0, 0, 0, 0);
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        int orientation = gridLayoutManager.getOrientation();
        GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
        int spanCount = gridLayoutManager.getSpanCount();
        int itemCount = gridLayoutManager.getItemCount();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int judgeType = this.mAdapter.judgeType(childAdapterPosition);
        int groupPositionForPosition = this.mAdapter.getGroupPositionForPosition(childAdapterPosition);
        int childPositionForPosition = this.mAdapter.getChildPositionForPosition(groupPositionForPosition, childAdapterPosition);
        rect.set(0, 0, !isRightItem(childAdapterPosition, spanCount, itemCount, spanSizeLookup, orientation) ? getColumnDividerSizeForType(judgeType, groupPositionForPosition, childPositionForPosition, orientation) : 0, getRowDividerSizeForType(judgeType, groupPositionForPosition, childPositionForPosition, orientation));
    }

    public boolean isBottomItem(RecyclerView recyclerView, int i8) {
        if (!checkLayoutManager(recyclerView)) {
            return false;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        int orientation = gridLayoutManager.getOrientation();
        return isBottomItem(i8, gridLayoutManager.getSpanCount(), gridLayoutManager.getItemCount(), gridLayoutManager.getSpanSizeLookup(), orientation);
    }

    public boolean isRightItem(RecyclerView recyclerView, int i8) {
        if (!checkLayoutManager(recyclerView)) {
            return false;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        int orientation = gridLayoutManager.getOrientation();
        return isRightItem(i8, gridLayoutManager.getSpanCount(), gridLayoutManager.getItemCount(), gridLayoutManager.getSpanSizeLookup(), orientation);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i8;
        GridLayoutManager.SpanSizeLookup spanSizeLookup;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView2 = recyclerView;
        if (checkLayoutManager(recyclerView2)) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            int orientation = gridLayoutManager.getOrientation();
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                canvas.clipRect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), recyclerView.getHeight() - recyclerView.getPaddingBottom());
            }
            int childCount = recyclerView.getChildCount();
            GridLayoutManager.SpanSizeLookup spanSizeLookup2 = gridLayoutManager.getSpanSizeLookup();
            int spanCount = gridLayoutManager.getSpanCount();
            int itemCount = gridLayoutManager.getItemCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = recyclerView2.getChildAt(i13);
                recyclerView2.getDecoratedBoundsWithMargins(childAt, this.mBounds);
                int childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt);
                int judgeType = this.mAdapter.judgeType(childAdapterPosition);
                int groupPositionForPosition = this.mAdapter.getGroupPositionForPosition(childAdapterPosition);
                int childPositionForPosition = this.mAdapter.getChildPositionForPosition(groupPositionForPosition, childAdapterPosition);
                Drawable columnDividerForType = getColumnDividerForType(judgeType, groupPositionForPosition, childPositionForPosition, orientation);
                if (columnDividerForType != null) {
                    int i14 = spanCount;
                    i8 = childCount;
                    i10 = childPositionForPosition;
                    i9 = spanCount;
                    i11 = groupPositionForPosition;
                    GridLayoutManager.SpanSizeLookup spanSizeLookup3 = spanSizeLookup2;
                    spanSizeLookup = spanSizeLookup2;
                    i12 = judgeType;
                    if (!isRightItem(childAdapterPosition, i14, itemCount, spanSizeLookup3, orientation)) {
                        int round = this.mBounds.right + Math.round(childAt.getTranslationX());
                        int columnDividerSizeForType = round - getColumnDividerSizeForType(i12, i11, i10, orientation);
                        Rect rect = this.mBounds;
                        columnDividerForType.setBounds(columnDividerSizeForType, rect.top, round, rect.bottom);
                        columnDividerForType.draw(canvas);
                    }
                } else {
                    i8 = childCount;
                    spanSizeLookup = spanSizeLookup2;
                    i9 = spanCount;
                    i10 = childPositionForPosition;
                    i11 = groupPositionForPosition;
                    i12 = judgeType;
                }
                Drawable rowDividerForType = getRowDividerForType(i12, i11, i10, orientation);
                if (rowDividerForType != null) {
                    int round2 = this.mBounds.bottom + Math.round(childAt.getTranslationY());
                    int rowDividerSizeForType = round2 - getRowDividerSizeForType(i12, i11, i10, orientation);
                    Rect rect2 = this.mBounds;
                    rowDividerForType.setBounds(rect2.left, rowDividerSizeForType, rect2.right, round2);
                    rowDividerForType.draw(canvas);
                }
                i13++;
                recyclerView2 = recyclerView;
                childCount = i8;
                spanCount = i9;
                spanSizeLookup2 = spanSizeLookup;
            }
            canvas.restore();
        }
    }

    private boolean isBottomItem(int i8, int i9, int i10, GridLayoutManager.SpanSizeLookup spanSizeLookup, int i11) {
        if (i11 != 1) {
            return spanSizeLookup.getSpanSize(i8) + spanSizeLookup.getSpanIndex(i8, i9) == i9;
        }
        int i12 = i10 - 1;
        while (i12 >= 0 && spanSizeLookup.getSpanIndex(i12, i9) != 0) {
            i12--;
        }
        return i12 <= i8;
    }

    private boolean isRightItem(int i8, int i9, int i10, GridLayoutManager.SpanSizeLookup spanSizeLookup, int i11) {
        if (i11 == 1) {
            return spanSizeLookup.getSpanSize(i8) + spanSizeLookup.getSpanIndex(i8, i9) == i9;
        }
        int i12 = i10 - 1;
        while (i12 >= 0 && spanSizeLookup.getSpanIndex(i12, i9) != 0) {
            i12--;
        }
        return i12 <= i8;
    }
}
