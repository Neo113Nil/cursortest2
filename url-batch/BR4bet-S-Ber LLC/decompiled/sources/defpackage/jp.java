package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class jp extends vc0 {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public jp() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // defpackage.oe
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout z;
        ye0 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (z = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.j(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (z.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int totalScrollRange = z.getTotalScrollRange() + size;
        int measuredHeight = z.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.r(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // defpackage.vc0
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout z = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.j(view));
        if (z == null) {
            coordinatorLayout.q(view, i);
            this.e = 0;
            return;
        }
        re reVar = (re) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) reVar).leftMargin;
        int bottom = z.getBottom() + ((ViewGroup.MarginLayoutParams) reVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) reVar).rightMargin;
        int bottom2 = ((z.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) reVar).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        ye0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i2 = reVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int y = y(z);
        view.layout(rect2.left, rect2.top - y, rect2.right, rect2.bottom - y);
        this.e = rect2.top - z.getBottom();
    }

    public final int y(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            oe oeVar = ((re) appBarLayout.getLayoutParams()).a;
            int y = oeVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) oeVar).y() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + y > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (y / i) + 1.0f;
            }
        }
        int i2 = this.f;
        return la0.o((int) (f * i2), 0, i2);
    }

    public jp(int i) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}
