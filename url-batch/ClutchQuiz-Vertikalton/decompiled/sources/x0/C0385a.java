package x0;

import A.c;
import K.S;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385a extends c {

    /* renamed from: e, reason: collision with root package name */
    public int f4011e;

    /* renamed from: f, reason: collision with root package name */
    public int f4012f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4013g;

    public C0385a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4013g = swipeDismissBehavior;
    }

    @Override // A.c
    public final boolean J0(View view, int i) {
        int i2 = this.f4012f;
        return (i2 == -1 || i2 == i) && this.f4013g.r(view);
    }

    @Override // A.c
    public final int W(View view) {
        return view.getWidth();
    }

    @Override // A.c
    public final int n(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = S.f365a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f4013g.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f4011e - view.getWidth();
                width2 = this.f4011e;
            } else {
                width = this.f4011e;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f4011e - view.getWidth();
            width2 = view.getWidth() + this.f4011e;
        } else if (z2) {
            width = this.f4011e;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4011e - view.getWidth();
            width2 = this.f4011e;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // A.c
    public final int o(View view, int i) {
        return view.getTop();
    }

    @Override // A.c
    public final void p0(View view, int i) {
        this.f4012f = i;
        this.f4011e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4013g;
            swipeDismissBehavior.f1743c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1743c = false;
        }
    }

    @Override // A.c
    public final void q0(int i) {
        this.f4013g.getClass();
    }

    @Override // A.c
    public final void r0(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4013g;
        float f2 = width * swipeDismissBehavior.f1744e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1745f;
        float abs = Math.abs(i - this.f4011e);
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
    @Override // A.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(View view, float f2, float f3) {
        int i;
        this.f4012f = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f4013g;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = S.f365a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f4011e;
                    z2 = false;
                } else {
                    i = this.f4011e;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f4011e;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f4011e - width;
        } else {
            int left2 = view.getLeft() - this.f4011e;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1741a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = S.f365a;
            view.postOnAnimation(aVar);
        }
    }
}
