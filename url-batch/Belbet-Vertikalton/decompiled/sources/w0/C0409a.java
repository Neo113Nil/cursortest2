package w0;

import H1.d;
import M.P;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409a extends d {

    /* renamed from: b, reason: collision with root package name */
    public int f4459b;

    /* renamed from: c, reason: collision with root package name */
    public int f4460c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4461d;

    public C0409a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4461d = swipeDismissBehavior;
    }

    @Override // H1.d
    public final int I(View view) {
        return view.getWidth();
    }

    @Override // H1.d
    public final void V(View view, int i) {
        this.f4460c = i;
        this.f4459b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4461d;
            swipeDismissBehavior.f2253c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2253c = false;
        }
    }

    @Override // H1.d
    public final void W(int i) {
        this.f4461d.getClass();
    }

    @Override // H1.d
    public final void X(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4461d;
        float f2 = width * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f2255f;
        float abs = Math.abs(i - this.f4459b);
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
    @Override // H1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(View view, float f2, float f3) {
        int i;
        this.f4460c = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f4461d;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = P.f711a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.f2254d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f4459b;
                    z2 = false;
                } else {
                    i = this.f4459b;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f4459b;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f4459b - width;
        } else {
            int left2 = view.getLeft() - this.f4459b;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f2251a.o(i, view.getTop())) {
            B.a aVar = new B.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = P.f711a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // H1.d
    public final boolean k0(View view, int i) {
        int i2 = this.f4460c;
        return (i2 == -1 || i2 == i) && this.f4461d.v(view);
    }

    @Override // H1.d
    public final int o(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = P.f711a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f4461d.f2254d;
        if (i2 == 0) {
            if (z2) {
                width = this.f4459b - view.getWidth();
                width2 = this.f4459b;
            } else {
                width = this.f4459b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f4459b - view.getWidth();
            width2 = view.getWidth() + this.f4459b;
        } else if (z2) {
            width = this.f4459b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4459b - view.getWidth();
            width2 = this.f4459b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // H1.d
    public final int p(View view, int i) {
        return view.getTop();
    }
}
