package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class rd {
    public static Object getTag(View view) {
        return ((ud) view.getLayoutParams()).r;
    }

    public static void setTag(View view, Object obj) {
        ((ud) view.getLayoutParams()).r = obj;
    }

    public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
        return getScrimOpacity(coordinatorLayout, view) > 0.0f;
    }

    public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
        return -16777216;
    }

    public float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr);
        }
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
    }

    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i);
        }
    }

    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(coordinatorLayout, view, view2, view3, i);
        }
        return false;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (i == 0) {
            onStopNestedScroll(coordinatorLayout, view, view2);
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Deprecated
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
    }

    @Deprecated
    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
    }

    @Deprecated
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    @Deprecated
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return false;
    }

    @Deprecated
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4);
        }
    }

    @Deprecated
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
    }

    public void onAttachedToLayoutParams(ud udVar) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public ac0 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, ac0 ac0Var) {
        return ac0Var;
    }

    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }
}
