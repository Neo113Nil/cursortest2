package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.oriondriftchasers.arordrft.R;
import java.util.WeakHashMap;
import l.w1;
import l.x1;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class AlertDialogLayout extends x1 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int j(View view) {
        WeakHashMap weakHashMap = l0.f2757a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    @Override // l.x1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft();
        int i10 = i5 - i;
        int paddingRight = i10 - getPaddingRight();
        int paddingRight2 = (i10 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i11 = gravity & 112;
        int i12 = gravity & 8388615;
        int paddingTop = i11 != 16 ? i11 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - measuredHeight : (((i6 - i4) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                w1 w1Var = (w1) childAt.getLayoutParams();
                int i14 = ((LinearLayout.LayoutParams) w1Var).gravity;
                if (i14 < 0) {
                    i14 = i12;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i14, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) w1Var).leftMargin;
                    i8 = ((LinearLayout.LayoutParams) w1Var).rightMargin;
                } else if (absoluteGravity != 5) {
                    i9 = ((LinearLayout.LayoutParams) w1Var).leftMargin + paddingLeft;
                    if (i(i13)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i15 = paddingTop + ((LinearLayout.LayoutParams) w1Var).topMargin;
                    childAt.layout(i9, i15, measuredWidth + i9, i15 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i15;
                } else {
                    i7 = paddingRight - measuredWidth;
                    i8 = ((LinearLayout.LayoutParams) w1Var).rightMargin;
                }
                i9 = i7 - i8;
                if (i(i13)) {
                }
                int i152 = paddingTop + ((LinearLayout.LayoutParams) w1Var).topMargin;
                childAt.layout(i9, i152, measuredWidth + i9, i152 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i152;
            }
        }
    }

    @Override // l.x1, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = alertDialogLayout.getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i4);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i5 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i5 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i6 = j(view2);
            i7 = view2.getMeasuredHeight() - i6;
            paddingBottom += i6;
            i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i8 = view3.getMeasuredHeight();
            paddingBottom += i8;
            i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
        } else {
            i8 = 0;
        }
        int i10 = size - paddingBottom;
        if (view2 != null) {
            int i11 = paddingBottom - i6;
            int min = Math.min(i10, i7);
            if (min > 0) {
                i10 -= min;
                i6 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            paddingBottom = i11 + view2.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
        }
        if (view3 != null && i10 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i8 + i10, mode));
            paddingBottom = (paddingBottom - i8) + view3.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = alertDialogLayout.getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                i12 = Math.max(i12, childAt2.getMeasuredWidth());
            }
        }
        int i14 = i4;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i12, i, i5), View.resolveSizeAndState(paddingBottom, i14, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i15 = 0;
            while (i15 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i15);
                if (childAt3.getVisibility() != 8) {
                    w1 w1Var = (w1) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) w1Var).width == -1) {
                        int i16 = ((LinearLayout.LayoutParams) w1Var).height;
                        ((LinearLayout.LayoutParams) w1Var).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i14, 0);
                        ((LinearLayout.LayoutParams) w1Var).height = i16;
                    }
                }
                i15++;
                alertDialogLayout = this;
                i14 = i4;
            }
        }
    }
}
