package com.crrepa.band.my.home.health.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private boolean includeEdge;
    private int spacing;
    private int spanCount;

    public GridSpacingItemDecoration(int i8, int i9, boolean z7) {
        this.spanCount = i8;
        this.spacing = i9;
        this.includeEdge = z7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i8 = this.spanCount;
        int i9 = childAdapterPosition % i8;
        if (this.includeEdge) {
            int i10 = this.spacing;
            rect.left = i10 - ((i9 * i10) / i8);
            rect.right = ((i9 + 1) * i10) / i8;
            if (childAdapterPosition < i8) {
                rect.top = i10;
            }
            rect.bottom = i10;
            return;
        }
        int i11 = this.spacing;
        rect.left = (i9 * i11) / i8;
        rect.right = i11 - (((i9 + 1) * i11) / i8);
        if (childAdapterPosition >= i8) {
            rect.top = i11;
        }
    }
}
