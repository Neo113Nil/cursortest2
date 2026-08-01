package q0;

import K.X;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import q1.l;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321a extends l {

    /* renamed from: g, reason: collision with root package name */
    public int f3934g;
    public int h = -1;
    public final /* synthetic */ SwipeDismissBehavior i;

    public C0321a(SwipeDismissBehavior swipeDismissBehavior) {
        this.i = swipeDismissBehavior;
    }

    @Override // q1.l
    public final int H(View view) {
        return view.getWidth();
    }

    @Override // q1.l
    public final void W(View view, int i) {
        this.h = i;
        this.f3934g = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.i;
            swipeDismissBehavior.f1727c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1727c = false;
        }
    }

    @Override // q1.l
    public final void X(int i) {
        this.i.getClass();
    }

    @Override // q1.l
    public final void Y(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.i;
        float f2 = width * swipeDismissBehavior.f1729e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1730f;
        float abs = Math.abs(i - this.f3934g);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // q1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(View view, float f2, float f3) {
        int i;
        this.h = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.i;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = X.f419a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.f1728d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f3934g;
                    z2 = false;
                } else {
                    i = this.f3934g;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f3934g;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f3934g - width;
        } else {
            int left2 = view.getLeft() - this.f3934g;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1725a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = X.f419a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // q1.l
    public final int i(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = X.f419a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.i.f1728d;
        if (i2 == 0) {
            if (z2) {
                width = this.f3934g - view.getWidth();
                width2 = this.f3934g;
            } else {
                width = this.f3934g;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f3934g - view.getWidth();
            width2 = view.getWidth() + this.f3934g;
        } else if (z2) {
            width = this.f3934g;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3934g - view.getWidth();
            width2 = this.f3934g;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // q1.l
    public final int j(View view, int i) {
        return view.getTop();
    }

    @Override // q1.l
    public final boolean s0(View view, int i) {
        int i2 = this.h;
        return (i2 == -1 || i2 == i) && this.i.r(view);
    }
}
