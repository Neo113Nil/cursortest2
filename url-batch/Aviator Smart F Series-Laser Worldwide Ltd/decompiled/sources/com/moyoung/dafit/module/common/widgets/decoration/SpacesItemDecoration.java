package com.moyoung.dafit.module.common.widgets.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private int leftSpace;
    private int space;

    public SpacesItemDecoration(int i8) {
        this.leftSpace = 0;
        this.space = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i8;
        rect.right = this.space;
        if (recyclerView.getChildAdapterPosition(view) != 0 || (i8 = this.leftSpace) == 0) {
            return;
        }
        rect.left = i8;
    }

    public SpacesItemDecoration(int i8, int i9) {
        this.space = i8;
        this.leftSpace = i9;
    }
}
