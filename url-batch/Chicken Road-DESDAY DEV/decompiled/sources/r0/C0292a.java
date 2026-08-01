package r0;

import K.S;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import u1.d;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292a extends d {

    /* renamed from: a, reason: collision with root package name */
    public int f3513a;

    /* renamed from: b, reason: collision with root package name */
    public int f3514b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3515c;

    public C0292a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3515c = swipeDismissBehavior;
    }

    @Override // u1.d
    public final int R(View view) {
        return view.getWidth();
    }

    @Override // u1.d
    public final void d0(View view, int i) {
        this.f3514b = i;
        this.f3513a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3515c;
            swipeDismissBehavior.f1599c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1599c = false;
        }
    }

    @Override // u1.d
    public final void e0(int i) {
        this.f3515c.getClass();
    }

    @Override // u1.d
    public final void f0(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3515c;
        float f2 = width * swipeDismissBehavior.f1600e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1601f;
        float abs = Math.abs(i - this.f3513a);
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
    @Override // u1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(View view, float f2, float f3) {
        int i;
        this.f3514b = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f3515c;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = S.f369a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f3513a;
                    z2 = false;
                } else {
                    i = this.f3513a;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f3513a;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f3513a - width;
        } else {
            int left2 = view.getLeft() - this.f3513a;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1597a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = S.f369a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // u1.d
    public final int n(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = S.f369a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f3515c.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f3513a - view.getWidth();
                width2 = this.f3513a;
            } else {
                width = this.f3513a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f3513a - view.getWidth();
            width2 = view.getWidth() + this.f3513a;
        } else if (z2) {
            width = this.f3513a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3513a - view.getWidth();
            width2 = this.f3513a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // u1.d
    public final int o(View view, int i) {
        return view.getTop();
    }

    @Override // u1.d
    public final boolean s0(View view, int i) {
        int i2 = this.f3514b;
        return (i2 == -1 || i2 == i) && this.f3515c.r(view);
    }
}
