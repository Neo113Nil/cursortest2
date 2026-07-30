package com.chad.library.adapter.base.listener;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public interface OnItemSwipeListener {
    void clearView(RecyclerView.ViewHolder viewHolder, int i8);

    void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f8, float f9, boolean z7);

    void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int i8);

    void onItemSwiped(RecyclerView.ViewHolder viewHolder, int i8);
}
