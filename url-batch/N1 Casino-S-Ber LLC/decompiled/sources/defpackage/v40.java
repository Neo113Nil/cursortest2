package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class v40 extends x90 {
    public int d;
    public int e = -1;
    public final /* synthetic */ SwipeDismissBehavior f;

    public v40(SwipeDismissBehavior swipeDismissBehavior) {
        this.f = swipeDismissBehavior;
    }

    @Override // defpackage.x90
    public final int a(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f.e;
        if (i2 == 0) {
            width = this.d;
            if (z) {
                width -= view.getWidth();
                width2 = this.d;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.d;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.d + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.d;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.x90
    public final int b(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.x90
    public final int d(View view) {
        return view.getWidth();
    }

    @Override // defpackage.x90
    public final void f(View view, int i) {
        this.e = i;
        this.d = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // defpackage.x90
    public final void g(int i) {
        n7 n7Var = this.f.b;
        if (n7Var != null) {
            p7 p7Var = n7Var.f.s;
            if (i == 0) {
                we.o().y(p7Var);
            } else if (i == 1 || i == 2) {
                we.o().w(p7Var);
            }
        }
    }

    @Override // defpackage.x90
    public final void h(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float abs = Math.abs(i - this.d);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.d) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // defpackage.x90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, float f, float f2) {
        int i;
        n7 n7Var;
        this.e = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.e;
            if (i2 != 2) {
                i = i2 == 0 ? this.d : this.d;
            }
            if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.d;
                if (left >= i3) {
                    i = i3 + width;
                    z = true;
                }
            }
            i = this.d - width;
            z = true;
        }
        if (swipeDismissBehavior.a.n(i, view.getTop())) {
            view.postOnAnimation(new w40(swipeDismissBehavior, view, z));
        } else {
            if (!z || (n7Var = swipeDismissBehavior.b) == null) {
                return;
            }
            n7Var.a(view);
        }
    }

    @Override // defpackage.x90
    public final boolean k(View view, int i) {
        int i2 = this.e;
        return (i2 == -1 || i2 == i) && this.f.w(view);
    }
}
