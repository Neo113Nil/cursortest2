package t1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.oriondriftchasers.arordrft.R;
import g2.j;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: g0, reason: collision with root package name */
    public final int f3307g0;

    /* renamed from: h0, reason: collision with root package name */
    public final int f3308h0;
    public final int i0;

    /* renamed from: j0, reason: collision with root package name */
    public final int f3309j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f3310k0;

    /* renamed from: l0, reason: collision with root package name */
    public final ArrayList f3311l0;

    public b(Context context) {
        super(context);
        this.f3311l0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f3307g0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f3308h0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.i0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f3309j0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int i7 = i5 - i;
        int i8 = i6 - i4;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i11 = i7 - i9;
                    childAt.layout(i11 - childAt.getMeasuredWidth(), 0, i11, i8);
                } else {
                    childAt.layout(i9, 0, childAt.getMeasuredWidth() + i9, i8);
                }
                i9 += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int size = View.MeasureSpec.getSize(i);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        ArrayList arrayList = this.f3311l0;
        arrayList.clear();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), Integer.MIN_VALUE);
        int i9 = 0;
        if (getItemIconGravity() == 0) {
            int labelVisibilityMode = getLabelVisibilityMode();
            int i10 = this.i0;
            if (labelVisibilityMode != -1 ? labelVisibilityMode == 0 : currentVisibleContentItemCount > 3) {
                if (this.f3310k0) {
                    View childAt = getChildAt(getSelectedItemPosition());
                    int visibility = childAt.getVisibility();
                    int i11 = this.f3309j0;
                    if (visibility != 8) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), makeMeasureSpec);
                        i11 = Math.max(i11, childAt.getMeasuredWidth());
                    }
                    int i12 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                    int min = Math.min(size - (this.f3308h0 * i12), Math.min(i11, i10));
                    int i13 = size - min;
                    int min2 = Math.min(i13 / (i12 != 0 ? i12 : 1), this.f3307g0);
                    int i14 = i13 - (i12 * min2);
                    int i15 = 0;
                    while (i15 < childCount) {
                        if (getChildAt(i15).getVisibility() != 8) {
                            i7 = i15 == getSelectedItemPosition() ? min : min2;
                            if (i14 > 0) {
                                i7++;
                                i14--;
                            }
                        } else {
                            i7 = 0;
                        }
                        arrayList.add(Integer.valueOf(i7));
                        i15++;
                    }
                    i5 = 0;
                    i6 = 0;
                    while (i9 < childCount) {
                        View childAt2 = getChildAt(i9);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i9)).intValue(), 1073741824), makeMeasureSpec);
                            childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                            int measuredWidth = childAt2.getMeasuredWidth() + i5;
                            i6 = Math.max(i6, childAt2.getMeasuredHeight());
                            i5 = measuredWidth;
                        }
                        i9++;
                    }
                }
            }
            int min3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), i10);
            int i16 = size - (currentVisibleContentItemCount * min3);
            for (int i17 = 0; i17 < childCount; i17++) {
                if (getChildAt(i17).getVisibility() == 8) {
                    i8 = 0;
                } else if (i16 > 0) {
                    i8 = min3 + 1;
                    i16--;
                } else {
                    i8 = min3;
                }
                arrayList.add(Integer.valueOf(i8));
            }
            i5 = 0;
            i6 = 0;
            while (i9 < childCount) {
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f2 = size;
            float min4 = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f2;
            float f4 = currentVisibleContentItemCount;
            int round = Math.round(min4 / f4);
            int round2 = Math.round(f2 / f4);
            int i18 = 0;
            int i19 = 0;
            while (i9 < childCount) {
                View childAt3 = getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(round2, Integer.MIN_VALUE), makeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < round) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i18;
                    i19 = Math.max(i19, childAt3.getMeasuredHeight());
                    i18 = measuredWidth2;
                }
                i9++;
            }
            i5 = i18;
            i6 = i19;
        }
        setMeasuredDimension(i5, Math.max(i6, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z3) {
        this.f3310k0 = z3;
    }
}
