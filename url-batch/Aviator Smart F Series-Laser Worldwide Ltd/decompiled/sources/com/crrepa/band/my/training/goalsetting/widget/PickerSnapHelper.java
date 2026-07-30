package com.crrepa.band.my.training.goalsetting.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class PickerSnapHelper extends LinearSnapHelper {
    private static final float INVALID_DISTANCE = 1.0f;

    @Nullable
    private OrientationHelper mHorizontalHelper;
    private OrientationHelper mVerticalHelper;

    private float computeDistancePerChild(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int position;
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i8 = Integer.MAX_VALUE;
        int i9 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = layoutManager.getChildAt(i10);
            if (childAt != null && (position = layoutManager.getPosition(childAt)) != -1) {
                if (position < i8) {
                    view = childAt;
                    i8 = position;
                }
                if (position > i9) {
                    view2 = childAt;
                    i9 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(orientationHelper.getDecoratedEnd(view), orientationHelper.getDecoratedEnd(view2)) - Math.min(orientationHelper.getDecoratedStart(view), orientationHelper.getDecoratedStart(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i9 - i8) + 1);
    }

    private int estimateNextPositionDiffForFling(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i8, int i9) {
        int[] calculateScrollDistance = calculateScrollDistance(i8, i9);
        float computeDistancePerChild = computeDistancePerChild(layoutManager, orientationHelper);
        if (computeDistancePerChild <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1]) ? calculateScrollDistance[0] : calculateScrollDistance[1]) / computeDistancePerChild);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int findTargetSnapPosition1(RecyclerView.LayoutManager layoutManager, int i8, int i9) {
        int itemCount;
        View findSnapView;
        int position;
        int i10;
        PointF computeScrollVectorForPosition;
        int i11;
        int i12;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (itemCount = layoutManager.getItemCount()) == 0 || (findSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (layoutManager.canScrollHorizontally()) {
            i11 = estimateNextPositionDiffForFling(layoutManager, getHorizontalHelper(layoutManager), i8, 0);
            if (i11 > 3) {
                i11 = 3;
            }
            if (i11 < -3) {
                i11 = -3;
            }
            if (computeScrollVectorForPosition.x < 0.0f) {
                i11 = -i11;
            }
        } else {
            i11 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int estimateNextPositionDiffForFling = estimateNextPositionDiffForFling(layoutManager, getVerticalHelper(layoutManager), 0, i9);
            int i13 = estimateNextPositionDiffForFling <= 3 ? estimateNextPositionDiffForFling : 3;
            i12 = i13 >= -3 ? i13 : -3;
            if (computeScrollVectorForPosition.y < 0.0f) {
                i12 = -i12;
            }
        } else {
            i12 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i11 = i12;
        }
        if (i11 == 0) {
            return -1;
        }
        int i14 = position + i11;
        int i15 = i14 >= 0 ? i14 : 0;
        return i15 >= itemCount ? i10 : i15;
    }

    @NonNull
    private OrientationHelper getHorizontalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (this.mHorizontalHelper == null) {
            this.mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    @NonNull
    private OrientationHelper getVerticalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (this.mVerticalHelper == null) {
            this.mVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.mVerticalHelper;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i8, int i9) {
        return findTargetSnapPosition1(layoutManager, i8, i9);
    }
}
