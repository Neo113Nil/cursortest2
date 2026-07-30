package androidx.appcompat.widget;

import I.T;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.WeakHashMap;
import n.A0;
import n.B0;

/* loaded from: classes.dex */
public class AlertDialogLayout extends B0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int i(View view) {
        WeakHashMap weakHashMap = T.f1153a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return i(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    @Override // n.B0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int paddingLeft = getPaddingLeft();
        int i12 = i7 - i2;
        int paddingRight = i12 - getPaddingRight();
        int paddingRight2 = (i12 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i13 = gravity & 112;
        int i14 = gravity & 8388615;
        int paddingTop = i13 != 16 ? i13 != 80 ? getPaddingTop() : ((getPaddingTop() + i8) - i5) - measuredHeight : (((i8 - i5) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                A0 a02 = (A0) childAt.getLayoutParams();
                int i16 = ((LinearLayout.LayoutParams) a02).gravity;
                if (i16 < 0) {
                    i16 = i14;
                }
                WeakHashMap weakHashMap = T.f1153a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i16, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i9 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) a02).leftMargin;
                    i10 = ((LinearLayout.LayoutParams) a02).rightMargin;
                } else if (absoluteGravity != 5) {
                    i11 = ((LinearLayout.LayoutParams) a02).leftMargin + paddingLeft;
                    if (h(i15)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i17 = paddingTop + ((LinearLayout.LayoutParams) a02).topMargin;
                    childAt.layout(i11, i17, measuredWidth + i11, i17 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) a02).bottomMargin + i17;
                } else {
                    i9 = paddingRight - measuredWidth;
                    i10 = ((LinearLayout.LayoutParams) a02).rightMargin;
                }
                i11 = i9 - i10;
                if (h(i15)) {
                }
                int i172 = paddingTop + ((LinearLayout.LayoutParams) a02).topMargin;
                childAt.layout(i11, i172, measuredWidth + i11, i172 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) a02).bottomMargin + i172;
            }
        }
    }

    @Override // n.B0, android.view.View
    public final void onMeasure(int i2, int i5) {
        int i7;
        int i8;
        int i9;
        int i10;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = alertDialogLayout.getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i2, i5);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i2, 0);
            paddingBottom += view.getMeasuredHeight();
            i7 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i7 = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            i8 = i(view2);
            i9 = view2.getMeasuredHeight() - i8;
            paddingBottom += i8;
            i7 = View.combineMeasuredStates(i7, view2.getMeasuredState());
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i10 = view3.getMeasuredHeight();
            paddingBottom += i10;
            i7 = View.combineMeasuredStates(i7, view3.getMeasuredState());
        } else {
            i10 = 0;
        }
        int i12 = size - paddingBottom;
        if (view2 != null) {
            int i13 = paddingBottom - i8;
            int min = Math.min(i12, i9);
            if (min > 0) {
                i12 -= min;
                i8 += min;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
            paddingBottom = i13 + view2.getMeasuredHeight();
            i7 = View.combineMeasuredStates(i7, view2.getMeasuredState());
        }
        if (view3 != null && i12 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(i10 + i12, mode));
            paddingBottom = (paddingBottom - i10) + view3.getMeasuredHeight();
            i7 = View.combineMeasuredStates(i7, view3.getMeasuredState());
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = alertDialogLayout.getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                i14 = Math.max(i14, childAt2.getMeasuredWidth());
            }
        }
        int i16 = i5;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i14, i2, i7), View.resolveSizeAndState(paddingBottom, i16, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i17 = 0;
            while (i17 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i17);
                if (childAt3.getVisibility() != 8) {
                    A0 a02 = (A0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) a02).width == -1) {
                        int i18 = ((LinearLayout.LayoutParams) a02).height;
                        ((LinearLayout.LayoutParams) a02).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i16, 0);
                        ((LinearLayout.LayoutParams) a02).height = i18;
                    }
                }
                i17++;
                alertDialogLayout = this;
                i16 = i5;
            }
        }
    }
}
