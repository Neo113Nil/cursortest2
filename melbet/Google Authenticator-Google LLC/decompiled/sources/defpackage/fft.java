package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fft extends abr {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public fft(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.abr
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.abr
    public final void c(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.a;
            swipeDismissBehavior.b = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.b = false;
        }
    }

    @Override // defpackage.abr
    public final void d(int i) {
        kee keeVar = this.a.f;
        if (keeVar != null) {
            if (i != 0) {
                fpp.a().e(((fpk) keeVar.a).u);
            } else {
                fpp.a().f(((fpk) keeVar.a).u);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0046, code lost:
    
        if (java.lang.Math.abs(r7.getLeft() - r6.b) >= java.lang.Math.round(r7.getWidth() * 0.5f)) goto L22;
     */
    @Override // defpackage.abr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view, float f, float f2) {
        int i;
        kee keeVar;
        this.c = -1;
        int width = view.getWidth();
        boolean z = true;
        if (f != 0.0f) {
            int layoutDirection = view.getLayoutDirection();
            int i2 = this.a.c;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.b;
                    z = false;
                } else {
                    i = this.b;
                    z = false;
                }
            }
            if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.b;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.b - width;
        }
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        if (swipeDismissBehavior.a.h(i, view.getTop())) {
            view.postOnAnimation(new ffv(swipeDismissBehavior, view, z));
        } else {
            if (!z || (keeVar = swipeDismissBehavior.f) == null) {
                return;
            }
            keeVar.h(view);
        }
    }

    @Override // defpackage.abr
    public final boolean f(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.J(view);
    }

    @Override // defpackage.abr
    public final int g(View view, int i) {
        int width;
        int width2;
        int width3;
        int layoutDirection = view.getLayoutDirection();
        int i2 = this.a.c;
        if (i2 == 0) {
            width = this.b;
            if (layoutDirection == 1) {
                width -= view.getWidth();
                width2 = this.b;
            } else {
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 == 1) {
            width = this.b;
            if (layoutDirection == 1) {
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width -= view.getWidth();
                width2 = this.b;
            }
        } else {
            width = this.b - view.getWidth();
            width2 = this.b + view.getWidth();
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.abr
    public final int h(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.abr
    public final void l(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        float f = width * swipeDismissBehavior.d;
        float width2 = view.getWidth() * swipeDismissBehavior.e;
        float abs = Math.abs(i - this.b);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.K(1.0f - ((abs - f) / (width2 - f))));
        }
    }
}
