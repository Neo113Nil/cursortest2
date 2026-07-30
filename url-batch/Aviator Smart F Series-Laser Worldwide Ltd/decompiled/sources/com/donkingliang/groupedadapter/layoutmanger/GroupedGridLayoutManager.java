package com.donkingliang.groupedadapter.layoutmanger;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;

/* loaded from: classes3.dex */
public class GroupedGridLayoutManager extends GridLayoutManager {
    private GroupedRecyclerViewAdapter mAdapter;

    class a extends GridLayoutManager.SpanSizeLookup {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i8) {
            int spanCount = GroupedGridLayoutManager.this.getSpanCount();
            if (GroupedGridLayoutManager.this.mAdapter == null || GroupedGridLayoutManager.this.mAdapter.judgeType(i8) != GroupedRecyclerViewAdapter.TYPE_CHILD) {
                return spanCount;
            }
            int groupPositionForPosition = GroupedGridLayoutManager.this.mAdapter.getGroupPositionForPosition(i8);
            return GroupedGridLayoutManager.this.getChildSpanSize(groupPositionForPosition, GroupedGridLayoutManager.this.mAdapter.getChildPositionForPosition(groupPositionForPosition, i8));
        }
    }

    public GroupedGridLayoutManager(Context context, int i8, GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        super(context, i8);
        this.mAdapter = groupedRecyclerViewAdapter;
        setSpanSizeLookup();
    }

    public int getChildSpanSize(int i8, int i9) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    public void setSpanSizeLookup(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
    }

    private void setSpanSizeLookup() {
        super.setSpanSizeLookup(new a());
    }

    public GroupedGridLayoutManager(Context context, int i8, int i9, boolean z7, GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        super(context, i8, i9, z7);
        this.mAdapter = groupedRecyclerViewAdapter;
        setSpanSizeLookup();
    }

    public GroupedGridLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9, GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        super(context, attributeSet, i8, i9);
        this.mAdapter = groupedRecyclerViewAdapter;
        setSpanSizeLookup();
    }
}
