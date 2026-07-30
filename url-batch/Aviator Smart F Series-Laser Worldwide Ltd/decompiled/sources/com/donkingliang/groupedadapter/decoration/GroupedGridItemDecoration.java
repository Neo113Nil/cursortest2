package com.donkingliang.groupedadapter.decoration;

import android.graphics.drawable.Drawable;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;

/* loaded from: classes3.dex */
public class GroupedGridItemDecoration extends AbsGroupedGridItemDecoration {
    private Drawable mChildColumnDivider;
    private int mChildColumnDividerSize;
    private Drawable mChildRowDivider;
    private int mChildRowDividerSize;
    private Drawable mFooterDivider;
    private int mFooterDividerSize;
    private Drawable mHeaderDivider;
    private int mHeaderDividerSize;

    public GroupedGridItemDecoration(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, int i8, Drawable drawable, int i9, Drawable drawable2, int i10, Drawable drawable3, int i11, Drawable drawable4) {
        super(groupedRecyclerViewAdapter);
        this.mHeaderDividerSize = i8;
        this.mHeaderDivider = drawable;
        this.mFooterDividerSize = i9;
        this.mFooterDivider = drawable2;
        this.mChildRowDividerSize = i10;
        this.mChildRowDivider = drawable3;
        this.mChildColumnDividerSize = i11;
        this.mChildColumnDivider = drawable4;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedGridItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public Drawable getChildColumnDivider(int i8, int i9) {
        return this.mChildColumnDivider;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedGridItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public int getChildColumnDividerSize(int i8, int i9) {
        return this.mChildColumnDividerSize;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedGridItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public Drawable getChildRowDivider(int i8, int i9) {
        return this.mChildRowDivider;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedGridItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public int getChildRowDividerSize(int i8, int i9) {
        return this.mChildRowDividerSize;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedGridItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public Drawable getFooterDivider(int i8) {
        return this.mFooterDivider;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedGridItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public int getFooterDividerSize(int i8) {
        return this.mFooterDividerSize;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedGridItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public Drawable getHeaderDivider(int i8) {
        return this.mHeaderDivider;
    }

    @Override // com.donkingliang.groupedadapter.decoration.AbsGroupedGridItemDecoration, com.donkingliang.groupedadapter.decoration.a
    public int getHeaderDividerSize(int i8) {
        return this.mHeaderDividerSize;
    }
}
