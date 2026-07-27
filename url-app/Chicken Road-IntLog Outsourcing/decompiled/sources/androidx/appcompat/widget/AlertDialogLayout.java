package androidx.appcompat.widget;

import E.G;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.chickyneer.roadway.R;
import java.lang.reflect.Field;
import l.AbstractC1228C;
import l.C1227B;

/* loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC1228C {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int h(View view) {
        Field field = G.f566a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return h(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    @Override // l.AbstractC1228C, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int i11 = i6 - i2;
        int paddingRight = i11 - getPaddingRight();
        int paddingRight2 = (i11 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i12 = gravity & 112;
        int i13 = gravity & 8388615;
        int paddingTop = i12 != 16 ? i12 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i3) - measuredHeight : (((i7 - i3) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C1227B c1227b = (C1227B) childAt.getLayoutParams();
                int i15 = c1227b.f10746b;
                if (i15 < 0) {
                    i15 = i13;
                }
                Field field = G.f566a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) c1227b).leftMargin;
                    i9 = ((ViewGroup.MarginLayoutParams) c1227b).rightMargin;
                } else if (absoluteGravity != 5) {
                    i10 = ((ViewGroup.MarginLayoutParams) c1227b).leftMargin + paddingLeft;
                    if (g(i14)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i16 = paddingTop + ((ViewGroup.MarginLayoutParams) c1227b).topMargin;
                    childAt.layout(i10, i16, measuredWidth + i10, i16 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1227b).bottomMargin + i16;
                } else {
                    i8 = paddingRight - measuredWidth;
                    i9 = ((ViewGroup.MarginLayoutParams) c1227b).rightMargin;
                }
                i10 = i8 - i9;
                if (g(i14)) {
                }
                int i162 = paddingTop + ((ViewGroup.MarginLayoutParams) c1227b).topMargin;
                childAt.layout(i10, i162, measuredWidth + i10, i162 + measuredHeight2);
                paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1227b).bottomMargin + i162;
            }
        }
    }

    @Override // l.AbstractC1228C, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i2, i3);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i2, 0);
            paddingBottom += view.getMeasuredHeight();
            i6 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i6 = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            i7 = h(view2);
            i8 = view2.getMeasuredHeight() - i7;
            paddingBottom += i7;
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i9 = view3.getMeasuredHeight();
            paddingBottom += i9;
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        } else {
            i9 = 0;
        }
        int i11 = size - paddingBottom;
        if (view2 != null) {
            int i12 = paddingBottom - i7;
            int min = Math.min(i11, i8);
            if (min > 0) {
                i11 -= min;
                i7 += min;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            paddingBottom = i12 + view2.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        }
        if (view3 != null && i11 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(i9 + i11, mode));
            paddingBottom = (paddingBottom - i9) + view3.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                i13 = Math.max(i13, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i13, i2, i6), View.resolveSizeAndState(paddingBottom, i3, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                if (childAt3.getVisibility() != 8) {
                    C1227B c1227b = (C1227B) childAt3.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) c1227b).width == -1) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c1227b).height;
                        ((ViewGroup.MarginLayoutParams) c1227b).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i3, 0);
                        ((ViewGroup.MarginLayoutParams) c1227b).height = i16;
                    }
                }
            }
        }
    }
}
