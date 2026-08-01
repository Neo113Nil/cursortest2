package o1;

import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.e;
import com.google.android.material.behavior.SwipeDismissBehavior;
import l0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public int f2989a;

    /* renamed from: b, reason: collision with root package name */
    public int f2990b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // l0.g
    public final int d(View view, int i4) {
        int width;
        int width2;
        int width3;
        boolean z3 = view.getLayoutDirection() == 1;
        int i5 = this.c.f1191d;
        if (i5 == 0) {
            if (z3) {
                width = this.f2989a - view.getWidth();
                width2 = this.f2989a;
            } else {
                width = this.f2989a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i5 != 1) {
            width = this.f2989a - view.getWidth();
            width2 = view.getWidth() + this.f2989a;
        } else if (z3) {
            width = this.f2989a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f2989a - view.getWidth();
            width2 = this.f2989a;
        }
        return Math.min(Math.max(width, i4), width2);
    }

    @Override // l0.g
    public final int e(View view, int i4) {
        return view.getTop();
    }

    @Override // l0.g
    public final int l(View view) {
        return view.getWidth();
    }

    @Override // l0.g
    public final void p(View view, int i4) {
        this.f2990b = i4;
        this.f2989a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // l0.g
    public final void r(View view, int i4, int i5) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f4 = width * swipeDismissBehavior.f1192e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1193f;
        float abs = Math.abs(i4 - this.f2989a);
        if (abs <= f4) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f4) / (width2 - f4))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f2989a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // l0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, float f4, float f5) {
        int i4;
        this.f2990b = -1;
        int width = view.getWidth();
        boolean z3 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        if (f4 != 0.0f) {
            boolean z4 = view.getLayoutDirection() == 1;
            int i5 = swipeDismissBehavior.f1191d;
            if (i5 != 2) {
                i4 = i5 == 0 ? this.f2989a : this.f2989a;
            }
            if (f4 >= 0.0f) {
                int left = view.getLeft();
                int i6 = this.f2989a;
                if (left >= i6) {
                    i4 = i6 + width;
                    z3 = true;
                }
            }
            i4 = this.f2989a - width;
            z3 = true;
        }
        if (swipeDismissBehavior.f1189a.n(i4, view.getTop())) {
            view.postOnAnimation(new e(swipeDismissBehavior, view, z3));
        }
    }

    @Override // l0.g
    public final boolean y(View view, int i4) {
        int i5 = this.f2990b;
        return (i5 == -1 || i5 == i4) && this.c.r(view);
    }

    @Override // l0.g
    public final void q(int i4) {
    }
}
