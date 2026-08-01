package a0;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class c {
    public boolean a(View view, Rect rect) {
        return false;
    }

    public boolean b(View view, View view2) {
        return false;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public Parcelable n(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean o(View view, int i, int i4) {
        return false;
    }

    public boolean q(View view, MotionEvent motionEvent) {
        return false;
    }

    public void c(f fVar) {
    }

    public void e() {
    }

    public void m(View view, Parcelable parcelable) {
    }

    public void p(View view, View view2, int i) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i5) {
    }
}
