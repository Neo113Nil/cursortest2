package t0;

import B.b;
import M.Q;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import z1.l;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271a extends l {

    /* renamed from: a, reason: collision with root package name */
    public int f3614a;

    /* renamed from: b, reason: collision with root package name */
    public int f3615b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3616c;

    public C0271a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3616c = swipeDismissBehavior;
    }

    @Override // z1.l
    public final int S(View view) {
        return view.getWidth();
    }

    @Override // z1.l
    public final void g0(View view, int i) {
        this.f3615b = i;
        this.f3614a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3616c;
            swipeDismissBehavior.f1740c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1740c = false;
        }
    }

    @Override // z1.l
    public final void h0(int i) {
        this.f3616c.getClass();
    }

    @Override // z1.l
    public final void i0(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3616c;
        float f2 = width * swipeDismissBehavior.f1741e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1742f;
        float abs = Math.abs(i - this.f3614a);
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
    @Override // z1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(View view, float f2, float f3) {
        int i;
        this.f3615b = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f3616c;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = Q.f513a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f3614a;
                    z2 = false;
                } else {
                    i = this.f3614a;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f3614a;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f3614a - width;
        } else {
            int left2 = view.getLeft() - this.f3614a;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1738a.o(i, view.getTop())) {
            b bVar = new b(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = Q.f513a;
            view.postOnAnimation(bVar);
        }
    }

    @Override // z1.l
    public final int s(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = Q.f513a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f3616c.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f3614a - view.getWidth();
                width2 = this.f3614a;
            } else {
                width = this.f3614a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f3614a - view.getWidth();
            width2 = view.getWidth() + this.f3614a;
        } else if (z2) {
            width = this.f3614a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3614a - view.getWidth();
            width2 = this.f3614a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // z1.l
    public final int t(View view, int i) {
        return view.getTop();
    }

    @Override // z1.l
    public final boolean v0(View view, int i) {
        int i2 = this.f3615b;
        return (i2 == -1 || i2 == i) && this.f3616c.r(view);
    }
}
