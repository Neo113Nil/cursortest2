package com.yanzhenjie.recyclerview;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class i {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private SwipeMenuLayout mMenuLayout;
    private int mOrientation = 0;
    private List<l> mSwipeMenuItems = new ArrayList(2);

    public i(SwipeMenuLayout swipeMenuLayout) {
        this.mMenuLayout = swipeMenuLayout;
    }

    public void addMenuItem(l lVar) {
        this.mSwipeMenuItems.add(lVar);
    }

    public List<l> getMenuItems() {
        return this.mSwipeMenuItems;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean hasMenuItems() {
        return !this.mSwipeMenuItems.isEmpty();
    }

    public void removeMenuItem(l lVar) {
        this.mSwipeMenuItems.remove(lVar);
    }

    public void setOpenPercent(@FloatRange(from = 0.1d, to = 1.0d) float f8) {
        this.mMenuLayout.setOpenPercent(f8);
    }

    public void setOrientation(int i8) {
        this.mOrientation = i8;
    }

    public void setScrollerDuration(@IntRange(from = 1) int i8) {
        this.mMenuLayout.setScrollerDuration(i8);
    }
}
