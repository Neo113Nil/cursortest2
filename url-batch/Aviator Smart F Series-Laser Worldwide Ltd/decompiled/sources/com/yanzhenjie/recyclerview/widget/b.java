package com.yanzhenjie.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes4.dex */
class b {
    private final Drawable mDivider;
    private final int mHeight;
    private final int mWidth;

    public b(Drawable drawable, int i8, int i9) {
        this.mDivider = drawable;
        this.mWidth = i8;
        this.mHeight = i9;
    }

    public void drawBottom(View view, Canvas canvas) {
        int left = view.getLeft() - this.mWidth;
        int bottom = view.getBottom();
        this.mDivider.setBounds(left, bottom, view.getRight() + this.mWidth, this.mHeight + bottom);
        this.mDivider.draw(canvas);
    }

    public void drawLeft(View view, Canvas canvas) {
        int left = view.getLeft() - this.mWidth;
        this.mDivider.setBounds(left, view.getTop() - this.mHeight, this.mWidth + left, view.getBottom() + this.mHeight);
        this.mDivider.draw(canvas);
    }

    public void drawRight(View view, Canvas canvas) {
        int right = view.getRight();
        this.mDivider.setBounds(right, view.getTop() - this.mHeight, this.mWidth + right, view.getBottom() + this.mHeight);
        this.mDivider.draw(canvas);
    }

    public void drawTop(View view, Canvas canvas) {
        int left = view.getLeft() - this.mWidth;
        int top = view.getTop() - this.mHeight;
        this.mDivider.setBounds(left, top, view.getRight() + this.mWidth, this.mHeight + top);
        this.mDivider.draw(canvas);
    }
}
