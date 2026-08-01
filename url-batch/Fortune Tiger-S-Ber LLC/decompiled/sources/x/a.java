package x;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a {
    public boolean a(View view) {
        return false;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
        iArr[0] = iArr[0] + i5;
        iArr[1] = iArr[1] + i6;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public Parcelable n(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean o(View view, int i4, int i5) {
        return false;
    }

    public boolean q(View view, MotionEvent motionEvent) {
        return false;
    }

    public void b(View view) {
    }

    public void c(d dVar) {
    }

    public void e() {
    }

    public void m(View view, Parcelable parcelable) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
    }

    public void p(View view, View view2, int i4) {
    }
}
