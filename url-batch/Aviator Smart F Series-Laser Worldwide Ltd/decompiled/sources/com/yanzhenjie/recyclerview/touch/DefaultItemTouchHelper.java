package com.yanzhenjie.recyclerview.touch;

import androidx.recyclerview.widget.ItemTouchHelper;
import t5.b;
import t5.c;

/* loaded from: classes4.dex */
public class DefaultItemTouchHelper extends ItemTouchHelper {
    private a mItemTouchHelperCallback;

    public DefaultItemTouchHelper() {
        this(new a());
    }

    public t5.a getOnItemMoveListener() {
        return this.mItemTouchHelperCallback.getOnItemMoveListener();
    }

    public b getOnItemMovementListener() {
        this.mItemTouchHelperCallback.getOnItemMovementListener();
        return null;
    }

    public c getOnItemStateChangedListener() {
        return this.mItemTouchHelperCallback.getOnItemStateChangedListener();
    }

    public boolean isItemViewSwipeEnabled() {
        return this.mItemTouchHelperCallback.isItemViewSwipeEnabled();
    }

    public boolean isLongPressDragEnabled() {
        return this.mItemTouchHelperCallback.isLongPressDragEnabled();
    }

    public void setItemViewSwipeEnabled(boolean z7) {
        this.mItemTouchHelperCallback.setItemViewSwipeEnabled(z7);
    }

    public void setLongPressDragEnabled(boolean z7) {
        this.mItemTouchHelperCallback.setLongPressDragEnabled(z7);
    }

    public void setOnItemMoveListener(t5.a aVar) {
        this.mItemTouchHelperCallback.setOnItemMoveListener(aVar);
    }

    public void setOnItemMovementListener(b bVar) {
        this.mItemTouchHelperCallback.setOnItemMovementListener(bVar);
    }

    public void setOnItemStateChangedListener(c cVar) {
        this.mItemTouchHelperCallback.setOnItemStateChangedListener(cVar);
    }

    private DefaultItemTouchHelper(a aVar) {
        super(aVar);
        this.mItemTouchHelperCallback = aVar;
    }
}
