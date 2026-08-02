package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import defpackage.ka;
import defpackage.kb;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AlertDialogLayout extends kb {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    private static int a(View view) {
        int i = yq.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    @Override // defpackage.kb, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i9 = this.f;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        int paddingTop = i10 != 16 ? i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        Drawable drawable = this.g;
        int intrinsicHeight = drawable == null ? 0 : drawable.getIntrinsicHeight();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                ka kaVar = (ka) childAt.getLayoutParams();
                int i13 = kaVar.gravity;
                if (i13 < 0) {
                    i13 = i11;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + kaVar.leftMargin;
                    i6 = kaVar.rightMargin;
                } else if (absoluteGravity != 5) {
                    i7 = kaVar.leftMargin + paddingLeft;
                    if (s(i12)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i14 = paddingTop + kaVar.topMargin;
                    childAt.layout(i7, i14, measuredWidth + i7, i14 + measuredHeight2);
                    paddingTop = i14 + measuredHeight2 + kaVar.bottomMargin;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = kaVar.rightMargin;
                }
                i7 = i5 - i6;
                if (s(i12)) {
                }
                int i142 = paddingTop + kaVar.topMargin;
                childAt.layout(i7, i142, measuredWidth + i7, i142 + measuredHeight2);
                paddingTop = i142 + measuredHeight2 + kaVar.bottomMargin;
            }
        }
    }

    @Override // defpackage.kb, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        View view4 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = alertDialogLayout.getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view2 = childAt;
                } else if (id == R.id.buttonPanel) {
                    view3 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view4 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view4 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = alertDialogLayout.getPaddingTop() + alertDialogLayout.getPaddingBottom();
        if (view2 != null) {
            view2.measure(i, 0);
            paddingTop += view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view2.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view3 != null) {
            view3.measure(i, 0);
            i4 = a(view3);
            i5 = view3.getMeasuredHeight() - i4;
            paddingTop += i4;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view4 != null) {
            view4.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            int measuredHeight = view4.getMeasuredHeight();
            paddingTop += measuredHeight;
            int combineMeasuredStates = View.combineMeasuredStates(i3, view4.getMeasuredState());
            i7 = measuredHeight;
            view = view4;
            i6 = combineMeasuredStates;
        } else {
            i6 = i3;
            i7 = 0;
        }
        int i9 = size - paddingTop;
        if (view3 != null) {
            int i10 = paddingTop - i4;
            int min = Math.min(i9, i5);
            if (min > 0) {
                i9 -= min;
                i4 += min;
            }
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingTop = i10 + view3.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        }
        if (view != null && i9 > 0) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(i7 + i9, mode));
            paddingTop = (paddingTop - i7) + view.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view.getMeasuredState());
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = alertDialogLayout.getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                i11 = Math.max(i11, childAt2.getMeasuredWidth());
            }
        }
        int resolveSizeAndState = View.resolveSizeAndState(i11 + alertDialogLayout.getPaddingLeft() + alertDialogLayout.getPaddingRight(), i, i6);
        int i13 = i2;
        alertDialogLayout.setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(paddingTop, i13, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i14 = 0;
            while (i14 < childCount) {
                int i15 = makeMeasureSpec;
                View childAt3 = alertDialogLayout.getChildAt(i14);
                if (childAt3.getVisibility() != 8) {
                    ka kaVar = (ka) childAt3.getLayoutParams();
                    if (kaVar.width == -1) {
                        int i16 = kaVar.height;
                        kaVar.height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, i15, 0, i13, 0);
                        kaVar.height = i16;
                    }
                }
                i14++;
                alertDialogLayout = this;
                i13 = i2;
                makeMeasureSpec = i15;
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
