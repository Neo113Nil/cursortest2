package com.donkingliang.groupedadapter.decoration;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;

/* loaded from: classes3.dex */
public abstract class AbsGroupedLinearItemDecoration extends RecyclerView.ItemDecoration implements a {
    protected GroupedRecyclerViewAdapter mAdapter;
    private final Rect mBounds = new Rect();

    public AbsGroupedLinearItemDecoration(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        this.mAdapter = groupedRecyclerViewAdapter;
    }

    private Drawable getDividerForType(int i8, int i9, int i10, int i11) {
        if (i8 == GroupedRecyclerViewAdapter.TYPE_HEADER) {
            return getHeaderDivider(i9);
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_FOOTER) {
            return getFooterDivider(i9);
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_CHILD) {
            return i11 == 1 ? getChildRowDivider(i9, i10) : getChildColumnDivider(i9, i10);
        }
        return null;
    }

    private int getDividerSizeForType(int i8, int i9, int i10, int i11) {
        if (i8 == GroupedRecyclerViewAdapter.TYPE_HEADER) {
            return getHeaderDividerSize(i9);
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_FOOTER) {
            return getFooterDividerSize(i9);
        }
        if (i8 == GroupedRecyclerViewAdapter.TYPE_CHILD) {
            return i11 == 1 ? getChildRowDividerSize(i9, i10) : getChildColumnDividerSize(i9, i10);
        }
        return 0;
    }

    @Override // com.donkingliang.groupedadapter.decoration.a
    public boolean checkLayoutManager(RecyclerView recyclerView) {
        return recyclerView.getLayoutManager() != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager);
    }

    @Override // com.donkingliang.groupedadapter.decoration.a
    public Drawable getChildColumnDivider(int i8, int i9) {
        return getChildDivider(i8, i9);
    }

    @Override // com.donkingliang.groupedadapter.decoration.a
    public int getChildColumnDividerSize(int i8, int i9) {
        return getChildDividerSize(i8, i9);
    }

    public abstract Drawable getChildDivider(int i8, int i9);

    public abstract int getChildDividerSize(int i8, int i9);

    @Override // com.donkingliang.groupedadapter.decoration.a
    public Drawable getChildRowDivider(int i8, int i9) {
        return getChildDivider(i8, i9);
    }

    @Override // com.donkingliang.groupedadapter.decoration.a
    public int getChildRowDividerSize(int i8, int i9) {
        return getChildDividerSize(i8, i9);
    }

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
        int orientation = ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int judgeType = this.mAdapter.judgeType(childAdapterPosition);
        int groupPositionForPosition = this.mAdapter.getGroupPositionForPosition(childAdapterPosition);
        int dividerSizeForType = getDividerSizeForType(judgeType, groupPositionForPosition, this.mAdapter.getChildPositionForPosition(groupPositionForPosition, childAdapterPosition), orientation);
        if (orientation == 1) {
            rect.set(0, 0, 0, dividerSizeForType);
        } else {
            rect.set(0, 0, dividerSizeForType, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (checkLayoutManager(recyclerView)) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                canvas.clipRect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), recyclerView.getHeight() - recyclerView.getPaddingBottom());
            }
            int orientation = ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
            int childCount = recyclerView.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = recyclerView.getChildAt(i8);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                int judgeType = this.mAdapter.judgeType(childAdapterPosition);
                int groupPositionForPosition = this.mAdapter.getGroupPositionForPosition(childAdapterPosition);
                int childPositionForPosition = this.mAdapter.getChildPositionForPosition(groupPositionForPosition, childAdapterPosition);
                Drawable dividerForType = getDividerForType(judgeType, groupPositionForPosition, childPositionForPosition, orientation);
                if (dividerForType != null) {
                    recyclerView.getDecoratedBoundsWithMargins(childAt, this.mBounds);
                    int dividerSizeForType = getDividerSizeForType(judgeType, groupPositionForPosition, childPositionForPosition, orientation);
                    if (orientation == 1) {
                        int round = this.mBounds.bottom + Math.round(childAt.getTranslationY());
                        int i9 = round - dividerSizeForType;
                        Rect rect = this.mBounds;
                        dividerForType.setBounds(rect.left, i9, rect.right, round);
                        dividerForType.draw(canvas);
                    } else {
                        int round2 = this.mBounds.right + Math.round(childAt.getTranslationX());
                        int i10 = round2 - dividerSizeForType;
                        Rect rect2 = this.mBounds;
                        dividerForType.setBounds(i10, rect2.top, round2, rect2.bottom);
                        dividerForType.draw(canvas);
                    }
                }
            }
            canvas.restore();
        }
    }
}
