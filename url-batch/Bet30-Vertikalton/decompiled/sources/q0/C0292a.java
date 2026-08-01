package q0;

import K.T;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import q1.l;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292a extends l {

    /* renamed from: a, reason: collision with root package name */
    public int f3548a;

    /* renamed from: b, reason: collision with root package name */
    public int f3549b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3550c;

    public C0292a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3550c = swipeDismissBehavior;
    }

    @Override // q1.l
    public final int A(View view) {
        return view.getWidth();
    }

    @Override // q1.l
    public final void I(View view, int i) {
        this.f3549b = i;
        this.f3548a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3550c;
            swipeDismissBehavior.f1537c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1537c = false;
        }
    }

    @Override // q1.l
    public final void J(int i) {
        this.f3550c.getClass();
    }

    @Override // q1.l
    public final void K(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3550c;
        float f2 = width * swipeDismissBehavior.f1538e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1539f;
        float abs = Math.abs(i - this.f3548a);
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
    public final void L(View view, float f2, float f3) {
        int i;
        this.f3549b = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f3550c;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = T.f381a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f3548a;
                    z2 = false;
                } else {
                    i = this.f3548a;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f3548a;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f3548a - width;
        } else {
            int left2 = view.getLeft() - this.f3548a;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1535a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = T.f381a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // q1.l
    public final boolean b0(View view, int i) {
        int i2 = this.f3549b;
        return (i2 == -1 || i2 == i) && this.f3550c.r(view);
    }

    @Override // q1.l
    public final int m(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = T.f381a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f3550c.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f3548a - view.getWidth();
                width2 = this.f3548a;
            } else {
                width = this.f3548a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f3548a - view.getWidth();
            width2 = view.getWidth() + this.f3548a;
        } else if (z2) {
            width = this.f3548a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3548a - view.getWidth();
            width2 = this.f3548a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // q1.l
    public final int n(View view, int i) {
        return view.getTop();
    }
}
