package t1;

import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.e;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends r1.b {

    /* renamed from: a, reason: collision with root package name */
    public int f3391a;

    /* renamed from: b, reason: collision with root package name */
    public int f3392b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3393c;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3393c = swipeDismissBehavior;
    }

    @Override // r1.b
    public final boolean D(View view, int i) {
        int i4 = this.f3392b;
        return (i4 == -1 || i4 == i) && this.f3393c.r(view);
    }

    @Override // r1.b
    public final int e(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z4 = view.getLayoutDirection() == 1;
        int i4 = this.f3393c.d;
        if (i4 == 0) {
            if (z4) {
                width = this.f3391a - view.getWidth();
                width2 = this.f3391a;
            } else {
                width = this.f3391a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i4 != 1) {
            width = this.f3391a - view.getWidth();
            width2 = view.getWidth() + this.f3391a;
        } else if (z4) {
            width = this.f3391a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3391a - view.getWidth();
            width2 = this.f3391a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // r1.b
    public final int f(View view, int i) {
        return view.getTop();
    }

    @Override // r1.b
    public final int n(View view) {
        return view.getWidth();
    }

    @Override // r1.b
    public final void q(View view, int i) {
        this.f3392b = i;
        this.f3391a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3393c;
            swipeDismissBehavior.f928c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f928c = false;
        }
    }

    @Override // r1.b
    public final void s(View view, int i, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3393c;
        float f5 = width * swipeDismissBehavior.f929e;
        float width2 = view.getWidth() * swipeDismissBehavior.f930f;
        float abs = Math.abs(i - this.f3391a);
        if (abs <= f5) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f5) / (width2 - f5))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f3391a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // r1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, float f5, float f6) {
        int i;
        this.f3392b = -1;
        int width = view.getWidth();
        boolean z4 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f3393c;
        if (f5 != 0.0f) {
            boolean z5 = view.getLayoutDirection() == 1;
            int i4 = swipeDismissBehavior.d;
            if (i4 != 2) {
                i = i4 == 0 ? this.f3391a : this.f3391a;
            }
            if (f5 >= 0.0f) {
                int left = view.getLeft();
                int i5 = this.f3391a;
                if (left >= i5) {
                    i = i5 + width;
                    z4 = true;
                }
            }
            i = this.f3391a - width;
            z4 = true;
        }
        if (swipeDismissBehavior.f926a.n(i, view.getTop())) {
            view.postOnAnimation(new e(swipeDismissBehavior, view, z4));
        }
    }

    @Override // r1.b
    public final void r(int i) {
    }
}
