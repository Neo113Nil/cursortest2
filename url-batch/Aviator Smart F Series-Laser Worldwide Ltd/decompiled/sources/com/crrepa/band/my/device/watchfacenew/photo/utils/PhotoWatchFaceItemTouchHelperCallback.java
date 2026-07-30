package com.crrepa.band.my.device.watchfacenew.photo.utils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.my.device.watchfacenew.delegate.img.WatchFaceImgAdapter;

/* loaded from: classes2.dex */
public class PhotoWatchFaceItemTouchHelperCallback extends ItemTouchHelper.Callback {
    private final WatchFaceImgAdapter adapter;

    public PhotoWatchFaceItemTouchHelperCallback(WatchFaceImgAdapter watchFaceImgAdapter) {
        this.adapter = watchFaceImgAdapter;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        return !this.adapter.isEditingState.booleanValue() ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeFlag(2, 12);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
        if (!this.adapter.isEditingState.booleanValue()) {
            return false;
        }
        this.adapter.onMove(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i8) {
    }
}
