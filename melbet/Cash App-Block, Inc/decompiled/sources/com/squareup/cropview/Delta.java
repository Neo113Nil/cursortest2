package com.squareup.cropview;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public final class Delta {
    public final RectF bounds;
    public float dx;
    public float dy;
    public final float minHeight;
    public final float minWidth;

    public Delta(RectF rectF, float f, float f2, float f3, float f4, float f5) {
        rectF.getClass();
        this.bounds = rectF;
        this.minWidth = f2;
        this.minHeight = f3;
        this.dx = f4;
        this.dy = f5;
    }

    public final void adjustBottomBounds(RectF rectF) {
        rectF.getClass();
        float f = rectF.bottom;
        float f2 = this.dy + f;
        float f3 = rectF.top;
        float f4 = f2 - f3;
        float f5 = this.minHeight;
        if (f4 < f5) {
            f2 = f3 + f5;
            this.dy = f2 - f;
        }
        float f6 = f2 - this.bounds.bottom;
        if (f6 > RecyclerView.DECELERATION_RATE) {
            this.dy -= f6;
        }
    }

    public final void adjustLeftBounds(RectF rectF) {
        rectF.getClass();
        float f = rectF.left;
        float f2 = this.dx + f;
        float f3 = rectF.right;
        float f4 = f3 - f2;
        float f5 = this.minWidth;
        if (f4 < f5) {
            f2 = f3 - f5;
            this.dx = f2 - f;
        }
        float f6 = f2 - this.bounds.left;
        if (f6 < RecyclerView.DECELERATION_RATE) {
            this.dx -= f6;
        }
    }

    public final void adjustRightBounds(RectF rectF) {
        rectF.getClass();
        float f = rectF.right;
        float f2 = this.dx + f;
        float f3 = rectF.left;
        float f4 = f2 - f3;
        float f5 = this.minWidth;
        if (f4 < f5) {
            f2 = f3 + f5;
            this.dx = f2 - f;
        }
        float f6 = f2 - this.bounds.right;
        if (f6 > RecyclerView.DECELERATION_RATE) {
            this.dx -= f6;
        }
    }

    public final void adjustTopBounds(RectF rectF) {
        rectF.getClass();
        float f = rectF.top;
        float f2 = this.dy + f;
        float f3 = rectF.bottom;
        float f4 = f3 - f2;
        float f5 = this.minHeight;
        if (f4 < f5) {
            f2 = f3 - f5;
            this.dy = f2 - f;
        }
        float f6 = f2 - this.bounds.top;
        if (f6 < RecyclerView.DECELERATION_RATE) {
            this.dy -= f6;
        }
    }
}
