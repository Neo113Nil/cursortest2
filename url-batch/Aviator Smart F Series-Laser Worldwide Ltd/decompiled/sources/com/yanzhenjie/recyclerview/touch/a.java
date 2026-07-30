package com.yanzhenjie.recyclerview.touch;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t5.b;
import t5.c;

/* loaded from: classes4.dex */
class a extends ItemTouchHelper.Callback {
    private boolean isItemViewSwipeEnabled;
    private boolean isLongPressDragEnabled;
    private t5.a onItemMoveListener;
    private b onItemMovementListener;
    private c onItemStateChangedListener;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        c cVar = this.onItemStateChangedListener;
        if (cVar != null) {
            cVar.onSelectedChanged(viewHolder, 0);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        return layoutManager instanceof GridLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? ItemTouchHelper.Callback.makeMovementFlags(15, 3) : ItemTouchHelper.Callback.makeMovementFlags(15, 12) : layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? ItemTouchHelper.Callback.makeMovementFlags(12, 3) : ItemTouchHelper.Callback.makeMovementFlags(3, 12) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
    }

    public t5.a getOnItemMoveListener() {
        return this.onItemMoveListener;
    }

    public b getOnItemMovementListener() {
        return null;
    }

    public c getOnItemStateChangedListener() {
        return this.onItemStateChangedListener;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return this.isItemViewSwipeEnabled;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return this.isLongPressDragEnabled;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f8, float f9, int i8, boolean z7) {
        float abs;
        int width;
        if (i8 == 1) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            float f10 = 1.0f;
            if (layoutManager instanceof LinearLayoutManager) {
                int orientation = ((LinearLayoutManager) layoutManager).getOrientation();
                if (orientation == 0) {
                    abs = Math.abs(f9);
                    width = viewHolder.itemView.getHeight();
                } else if (orientation == 1) {
                    abs = Math.abs(f8);
                    width = viewHolder.itemView.getWidth();
                }
                f10 = 1.0f - (abs / width);
            }
            viewHolder.itemView.setAlpha(f10);
        }
        super.onChildDraw(canvas, recyclerView, viewHolder, f8, f9, i8, z7);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        t5.a aVar = this.onItemMoveListener;
        if (aVar != null) {
            return aVar.onItemMove(viewHolder, viewHolder2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i8) {
        super.onSelectedChanged(viewHolder, i8);
        c cVar = this.onItemStateChangedListener;
        if (cVar == null || i8 == 0) {
            return;
        }
        cVar.onSelectedChanged(viewHolder, i8);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i8) {
        t5.a aVar = this.onItemMoveListener;
        if (aVar != null) {
            aVar.onItemDismiss(viewHolder);
        }
    }

    public void setItemViewSwipeEnabled(boolean z7) {
        this.isItemViewSwipeEnabled = z7;
    }

    public void setLongPressDragEnabled(boolean z7) {
        this.isLongPressDragEnabled = z7;
    }

    public void setOnItemMoveListener(t5.a aVar) {
        this.onItemMoveListener = aVar;
    }

    public void setOnItemMovementListener(b bVar) {
    }

    public void setOnItemStateChangedListener(c cVar) {
        this.onItemStateChangedListener = cVar;
    }
}
