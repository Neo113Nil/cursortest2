package r0;

import K.S;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import s1.d;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289a extends d {

    /* renamed from: a, reason: collision with root package name */
    public int f3525a;

    /* renamed from: b, reason: collision with root package name */
    public int f3526b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3527c;

    public C0289a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3527c = swipeDismissBehavior;
    }

    @Override // s1.d
    public final int K(View view) {
        return view.getWidth();
    }

    @Override // s1.d
    public final void W(View view, int i) {
        this.f3526b = i;
        this.f3525a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3527c;
            swipeDismissBehavior.f1569c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1569c = false;
        }
    }

    @Override // s1.d
    public final void X(int i) {
        this.f3527c.getClass();
    }

    @Override // s1.d
    public final void Y(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3527c;
        float f2 = width * swipeDismissBehavior.f1570e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1571f;
        float abs = Math.abs(i - this.f3525a);
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
    @Override // s1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(View view, float f2, float f3) {
        int i;
        this.f3526b = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f3527c;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = S.f362a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f3525a;
                    z2 = false;
                } else {
                    i = this.f3525a;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f3525a;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f3525a - width;
        } else {
            int left2 = view.getLeft() - this.f3525a;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1567a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = S.f362a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // s1.d
    public final int j(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = S.f362a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f3527c.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f3525a - view.getWidth();
                width2 = this.f3525a;
            } else {
                width = this.f3525a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f3525a - view.getWidth();
            width2 = view.getWidth() + this.f3525a;
        } else if (z2) {
            width = this.f3525a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3525a - view.getWidth();
            width2 = this.f3525a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // s1.d
    public final int k(View view, int i) {
        return view.getTop();
    }

    @Override // s1.d
    public final boolean l0(View view, int i) {
        int i2 = this.f3526b;
        return (i2 == -1 || i2 == i) && this.f3527c.r(view);
    }
}
