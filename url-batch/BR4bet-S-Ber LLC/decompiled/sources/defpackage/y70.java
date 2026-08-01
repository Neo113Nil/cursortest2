package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class y70 extends b9 {
    public int x;
    public int y = -1;
    public final /* synthetic */ SwipeDismissBehavior z;

    public y70(SwipeDismissBehavior swipeDismissBehavior) {
        this.z = swipeDismissBehavior;
    }

    @Override // defpackage.b9
    public final void D(View view, int i) {
        this.y = i;
        this.x = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.z;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // defpackage.b9
    public final void E(int i) {
        z7 z7Var = this.z.b;
        if (z7Var != null) {
            b8 b8Var = z7Var.f.u;
            if (i == 0) {
                rg.o().y(b8Var);
            } else if (i == 1 || i == 2) {
                rg.o().w(b8Var);
            }
        }
    }

    @Override // defpackage.b9
    public final void F(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.z;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float abs = Math.abs(i - this.x);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.x) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // defpackage.b9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(View view, float f, float f2) {
        int i;
        z7 z7Var;
        this.y = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.z;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.e;
            if (i2 != 2) {
                i = i2 == 0 ? this.x : this.x;
            }
            if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.x;
                if (left >= i3) {
                    i = i3 + width;
                    z = true;
                }
            }
            i = this.x - width;
            z = true;
        }
        if (swipeDismissBehavior.a.n(i, view.getTop())) {
            view.postOnAnimation(new z70(swipeDismissBehavior, view, z));
        } else {
            if (!z || (z7Var = swipeDismissBehavior.b) == null) {
                return;
            }
            z7Var.a(view);
        }
    }

    @Override // defpackage.b9
    public final boolean U(View view, int i) {
        int i2 = this.y;
        return (i2 == -1 || i2 == i) && this.z.w(view);
    }

    @Override // defpackage.b9
    public final int h(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.z.e;
        if (i2 == 0) {
            width = this.x;
            if (z) {
                width -= view.getWidth();
                width2 = this.x;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.x;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.x + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.x;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.b9
    public final int i(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.b9
    public final int t(View view) {
        return view.getWidth();
    }
}
