package com.yanzhenjie.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class BorderItemDecoration extends RecyclerView.ItemDecoration {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final b mDrawer;
    private final int mHeight;
    private final int mWidth;

    public BorderItemDecoration(@ColorInt int i8) {
        this(i8, 4, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        int i8 = this.mWidth;
        int i9 = this.mHeight;
        rect.set(i8, i9, i8, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        canvas.save();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = layoutManager.getChildAt(i8);
            this.mDrawer.drawLeft(childAt, canvas);
            this.mDrawer.drawTop(childAt, canvas);
            this.mDrawer.drawRight(childAt, canvas);
            this.mDrawer.drawBottom(childAt, canvas);
        }
        canvas.restore();
    }

    public BorderItemDecoration(@ColorInt int i8, int i9, int i10) {
        int round = Math.round(i9 / 2.0f);
        this.mWidth = round;
        int round2 = Math.round(i10 / 2.0f);
        this.mHeight = round2;
        this.mDrawer = new a(i8, round, round2);
    }
}
