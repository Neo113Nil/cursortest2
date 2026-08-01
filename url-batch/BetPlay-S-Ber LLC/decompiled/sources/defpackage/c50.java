package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class c50 extends g90 {
    public int a;
    public int b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public c50(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // defpackage.g90
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i3 = this.c.d;
        if (i3 == 0) {
            width = this.a;
            if (z) {
                width -= view.getWidth();
                width2 = this.a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i4 = this.a;
            if (i3 != 1) {
                width = i4 - view.getWidth();
                width2 = this.a + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i4;
                width = i4;
            } else {
                width = i4 - view.getWidth();
                width2 = this.a;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.g90
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // defpackage.g90
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // defpackage.g90
    public final void onViewCaptured(View view, int i) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // defpackage.g90
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float abs = Math.abs(i - this.a);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // defpackage.g90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        this.b = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
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
            view.postOnAnimation(new h1(swipeDismissBehavior, view, z));
        }
    }

    @Override // defpackage.g90
    public final boolean tryCaptureView(View view, int i) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.a(view);
    }

    @Override // defpackage.g90
    public final void onViewDragStateChanged(int i) {
    }
}
