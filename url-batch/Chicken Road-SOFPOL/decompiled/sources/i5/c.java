package i5;

import android.view.View;
import android.view.ViewParent;
import b7.d;
import com.google.android.material.behavior.SwipeDismissBehavior;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends r {

    /* renamed from: a, reason: collision with root package name */
    public int f3455a;

    /* renamed from: b, reason: collision with root package name */
    public int f3456b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3457c;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3457c = swipeDismissBehavior;
    }

    @Override // r2.r
    public final int B(View view) {
        return view.getWidth();
    }

    @Override // r2.r
    public final void J(View view, int i) {
        this.f3456b = i;
        this.f3455a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3457c;
            swipeDismissBehavior.f1835c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1835c = false;
        }
    }

    @Override // r2.r
    public final void L(View view, int i, int i8) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3457c;
        float f6 = width * swipeDismissBehavior.f1837e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1838f;
        float abs = Math.abs(i - this.f3455a);
        if (abs <= f6) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f6) / (width2 - f6))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f3455a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(View view, float f6, float f8) {
        int i;
        this.f3456b = -1;
        int width = view.getWidth();
        boolean z3 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f3457c;
        if (f6 != 0.0f) {
            boolean z7 = view.getLayoutDirection() == 1;
            int i8 = swipeDismissBehavior.f1836d;
            if (i8 != 2) {
                i = i8 == 0 ? this.f3455a : this.f3455a;
            }
            if (f6 >= 0.0f) {
                int left = view.getLeft();
                int i9 = this.f3455a;
                if (left >= i9) {
                    i = i9 + width;
                    z3 = true;
                }
            }
            i = this.f3455a - width;
            z3 = true;
        }
        if (swipeDismissBehavior.f1833a.o(i, view.getTop())) {
            view.postOnAnimation(new d(swipeDismissBehavior, view, z3));
        }
    }

    @Override // r2.r
    public final boolean Y(View view, int i) {
        int i8 = this.f3456b;
        return (i8 == -1 || i8 == i) && this.f3457c.r(view);
    }

    @Override // r2.r
    public final int o(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z3 = view.getLayoutDirection() == 1;
        int i8 = this.f3457c.f1836d;
        if (i8 == 0) {
            if (z3) {
                width = this.f3455a - view.getWidth();
                width2 = this.f3455a;
            } else {
                width = this.f3455a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i8 != 1) {
            width = this.f3455a - view.getWidth();
            width2 = view.getWidth() + this.f3455a;
        } else if (z3) {
            width = this.f3455a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3455a - view.getWidth();
            width2 = this.f3455a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // r2.r
    public final int p(View view, int i) {
        return view.getTop();
    }

    @Override // r2.r
    public final void K(int i) {
    }
}
