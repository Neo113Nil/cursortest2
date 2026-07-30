package com.moyoung.dafit.module.common.widgets.decoration;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class RecycleItemDivider extends RecyclerView.ItemDecoration {
    private static final int[] ATTRS = {R.attr.listDivider};
    private int dividerHeight;
    private Drawable drawable;
    private boolean hideLastDivider;
    private int orientation;
    private Paint paint;

    public RecycleItemDivider(Context context, int i8) {
        this.dividerHeight = 1;
        this.hideLastDivider = false;
        if (i8 != 1 && i8 != 0) {
            throw new IllegalArgumentException("invalid orientation!");
        }
        this.orientation = i8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        this.drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    private void drawDivider(Canvas canvas, int i8, int i9, int i10, int i11) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setBounds(i10, i8, i11, i9);
            this.drawable.draw(canvas);
        }
        Paint paint = this.paint;
        if (paint != null) {
            canvas.drawRect(i10, i8, i11, i9, paint);
        }
    }

    private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView.getChildAt(i8);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            drawDivider(canvas, bottom, bottom + this.dividerHeight, paddingLeft, measuredWidth);
        }
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView.getChildAt(i8);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            drawDivider(canvas, paddingTop, measuredHeight, right, right + this.dividerHeight);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.orientation == 1) {
            rect.set(0, 0, 0, this.dividerHeight);
        } else {
            rect.set(0, 0, this.dividerHeight, 0);
        }
        if (this.hideLastDivider && recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().getItemCount() - 1) {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.orientation == 1) {
            drawHorizontal(canvas, recyclerView);
        } else {
            drawVertical(canvas, recyclerView);
        }
    }

    public void setHideLastDivider(boolean z7) {
        this.hideLastDivider = z7;
    }

    public RecycleItemDivider(Context context, int i8, int i9) {
        this(context, i8);
        Drawable drawable = ContextCompat.getDrawable(context, i9);
        this.drawable = drawable;
        this.dividerHeight = drawable.getIntrinsicHeight();
    }

    public RecycleItemDivider(Context context, int i8, int i9, int i10) {
        this(context, i8);
        this.dividerHeight = i9;
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(i10);
        this.paint.setStyle(Paint.Style.FILL);
    }
}
