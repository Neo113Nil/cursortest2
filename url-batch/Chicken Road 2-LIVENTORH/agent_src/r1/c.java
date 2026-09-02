package r1;

import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.e;
import com.google.android.material.behavior.SwipeDismissBehavior;
import t0.d;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public int f3150a;

    /* renamed from: b, reason: collision with root package name */
    public int f3151b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3152c;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3152c = swipeDismissBehavior;
    }

    @Override // t0.d
    public final int c(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z3 = view.getLayoutDirection() == 1;
        int i4 = this.f3152c.d;
        if (i4 == 0) {
            if (z3) {
                width = this.f3150a - view.getWidth();
                width2 = this.f3150a;
            } else {
                width = this.f3150a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i4 != 1) {
            width = this.f3150a - view.getWidth();
            width2 = view.getWidth() + this.f3150a;
        } else if (z3) {
            width = this.f3150a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3150a - view.getWidth();
            width2 = this.f3150a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // t0.d
    public final int d(View view, int i) {
        return view.getTop();
    }

    @Override // t0.d
    public final int i(View view) {
        return view.getWidth();
    }

    @Override // t0.d
    public final void n(View view, int i) {
        this.f3151b = i;
        this.f3150a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3152c;
            swipeDismissBehavior.f815c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f815c = false;
        }
    }

    @Override // t0.d
    public final void p(View view, int i, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3152c;
        float f2 = width * swipeDismissBehavior.f816e;
        float width2 = view.getWidth() * swipeDismissBehavior.f817f;
        float abs = Math.abs(i - this.f3150a);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f3150a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // t0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(View view, float f2, float f4) {
        int i;
        this.f3151b = -1;
        int width = view.getWidth();
        boolean z3 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f3152c;
        if (f2 != 0.0f) {
            boolean z4 = view.getLayoutDirection() == 1;
            int i4 = swipeDismissBehavior.d;
            if (i4 != 2) {
                i = i4 == 0 ? this.f3150a : this.f3150a;
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i5 = this.f3150a;
                if (left >= i5) {
                    i = i5 + width;
                    z3 = true;
                }
            }
            i = this.f3150a - width;
            z3 = true;
        }
        if (swipeDismissBehavior.f813a.o(i, view.getTop())) {
            view.postOnAnimation(new e(swipeDismissBehavior, view, z3));
        }
    }

    @Override // t0.d
    public final boolean u(View view, int i) {
        int i4 = this.f3151b;
        return (i4 == -1 || i4 == i) && this.f3152c.r(view);
    }

    @Override // t0.d
    public final void o(int i) {
    }
}
