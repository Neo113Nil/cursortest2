package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.AbstractC1281a0;

/* loaded from: classes.dex */
class ViewOffsetHelper {
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private final View view;
    private boolean verticalOffsetEnabled = true;
    private boolean horizontalOffsetEnabled = true;

    public ViewOffsetHelper(View view) {
        this.view = view;
    }

    void applyOffsets() {
        View view = this.view;
        AbstractC1281a0.Z(view, this.offsetTop - (view.getTop() - this.layoutTop));
        View view2 = this.view;
        AbstractC1281a0.Y(view2, this.offsetLeft - (view2.getLeft() - this.layoutLeft));
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    void onViewLayout() {
        this.layoutTop = this.view.getTop();
        this.layoutLeft = this.view.getLeft();
    }

    public boolean setLeftAndRightOffset(int i4) {
        if (!this.horizontalOffsetEnabled || this.offsetLeft == i4) {
            return false;
        }
        this.offsetLeft = i4;
        applyOffsets();
        return true;
    }

    public boolean setTopAndBottomOffset(int i4) {
        if (!this.verticalOffsetEnabled || this.offsetTop == i4) {
            return false;
        }
        this.offsetTop = i4;
        applyOffsets();
        return true;
    }
}
