package com.donkingliang.groupedadapter.decoration;

import android.graphics.drawable.Drawable;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;

/* loaded from: classes3.dex */
public class GroupedLinearItemDecoration extends AbsGroupedLinearItemDecoration {
    private Drawable mChildDivider;
    private int mChildDividerSize;
    private Drawable mFooterDivider;
    private int mFooterDividerSize;
    private Drawable mHeaderDivider;
    private int mHeaderDividerSize;

    public GroupedLinearItemDecoration(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, int i8, Drawable drawable, int i9, Drawable drawable2, int i10, Drawable drawable3) {
        super(groupedRecyclerViewAdapter);
        this.mHeaderDividerSize = i8;
        this.mHeaderDivider = drawable;
        this.mFooterDividerSize = i9;
        this.mFooterDivider = drawable2;
        this.mChildDividerSize = i10;
        this.mChildDivider = drawable3;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedLinearItemDecoration
    public Drawable getChildDivider(int i8, int i9) {
        return this.mChildDivider;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedLinearItemDecoration
    public int getChildDividerSize(int i8, int i9) {
        return this.mChildDividerSize;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedLinearItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public Drawable getFooterDivider(int i8) {
        return this.mFooterDivider;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedLinearItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public int getFooterDividerSize(int i8) {
        return this.mFooterDividerSize;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedLinearItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public Drawable getHeaderDivider(int i8) {
        return this.mHeaderDivider;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedLinearItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public int getHeaderDividerSize(int i8) {
        return this.mHeaderDividerSize;
    }
}
