package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List<Integer> tempChildWidths;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    protected NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int i12 = i10 - i8;
        int i13 = i11 - i9;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i16 = i12 - i14;
                    childAt.layout(i16 - childAt.getMeasuredWidth(), 0, i16, i13);
                } else {
                    childAt.layout(i14, 0, childAt.getMeasuredWidth() + i14, i13);
                }
                i14 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i8);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), Integer.MIN_VALUE);
        int i14 = 0;
        if (getItemIconGravity() == 0) {
            if (isShifting(getLabelVisibilityMode(), currentVisibleContentItemCount) && isItemHorizontalTranslationEnabled()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int i15 = this.activeItemMinWidth;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                    i15 = Math.max(i15, childAt.getMeasuredWidth());
                }
                int i16 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int min = Math.min(size - (this.inactiveItemMinWidth * i16), Math.min(i15, this.activeItemMaxWidth));
                int i17 = size - min;
                int min2 = Math.min(i17 / (i16 != 0 ? i16 : 1), this.inactiveItemMaxWidth);
                int i18 = i17 - (i16 * min2);
                int i19 = 0;
                while (i19 < childCount) {
                    if (getChildAt(i19).getVisibility() != 8) {
                        i13 = i19 == getSelectedItemPosition() ? min : min2;
                        if (i18 > 0) {
                            i13++;
                            i18--;
                        }
                    } else {
                        i13 = 0;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i13));
                    i19++;
                }
            } else {
                int min3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), this.activeItemMaxWidth);
                int i20 = size - (currentVisibleContentItemCount * min3);
                for (int i21 = 0; i21 < childCount; i21++) {
                    if (getChildAt(i21).getVisibility() == 8) {
                        i12 = 0;
                    } else if (i20 > 0) {
                        i12 = min3 + 1;
                        i20--;
                    } else {
                        i12 = min3;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i12));
                }
            }
            i10 = 0;
            i11 = 0;
            while (i14 < childCount) {
                View childAt2 = getChildAt(i14);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i14).intValue(), 1073741824), makeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    i10 += childAt2.getMeasuredWidth();
                    i11 = Math.max(i11, childAt2.getMeasuredHeight());
                }
                i14++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f8 = size;
            float min4 = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f8;
            float f9 = currentVisibleContentItemCount;
            int round = Math.round(min4 / f9);
            int round2 = Math.round(f8 / f9);
            int i22 = 0;
            int i23 = 0;
            while (i14 < childCount) {
                View childAt3 = getChildAt(i14);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(round2, Integer.MIN_VALUE), makeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < round) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
                    }
                    i22 += childAt3.getMeasuredWidth();
                    i23 = Math.max(i23, childAt3.getMeasuredHeight());
                }
                i14++;
            }
            i10 = i22;
            i11 = i23;
        }
        setMeasuredDimension(i10, Math.max(i11, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z7) {
        this.itemHorizontalTranslationEnabled = z7;
    }
}
