package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ug0 extends ud0 {
    public int a;
    public int b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public ug0(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // defpackage.ud0
    public final boolean B(View view, int i) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.w(view);
    }

    @Override // defpackage.ud0
    public final int c(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.c.e;
        if (i2 == 0) {
            width = this.a;
            if (z) {
                width -= view.getWidth();
                width2 = this.a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.a;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.a + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.a;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.ud0
    public final int d(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.ud0
    public final int q(View view) {
        return view.getWidth();
    }

    @Override // defpackage.ud0
    public final void v(View view, int i) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // defpackage.ud0
    public final void w(int i) {
        l8 l8Var = this.c.b;
        if (l8Var != null) {
            n8 n8Var = l8Var.f.t;
            if (i == 0) {
                wi.i().r(n8Var);
            } else if (i == 1 || i == 2) {
                wi.i().p(n8Var);
            }
        }
    }

    @Override // defpackage.ud0
    public final void x(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float abs = Math.abs(i - this.a);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // defpackage.ud0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(View view, float f, float f2) {
        int i;
        l8 l8Var;
        this.b = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.e;
            if (i2 != 2) {
                i = i2 == 0 ? this.a : this.a;
            }
            if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.a;
                if (left >= i3) {
                    i = i3 + width;
                    z = true;
                }
            }
            i = this.a - width;
            z = true;
        }
        if (swipeDismissBehavior.a.n(i, view.getTop())) {
            view.postOnAnimation(new vg0(swipeDismissBehavior, view, z));
        } else {
            if (!z || (l8Var = swipeDismissBehavior.b) == null) {
                return;
            }
            l8Var.a(view);
        }
    }
}
