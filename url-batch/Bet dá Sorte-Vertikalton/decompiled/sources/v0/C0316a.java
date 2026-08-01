package v0;

import K.S;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import u1.d;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316a extends d {

    /* renamed from: c, reason: collision with root package name */
    public int f4164c;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4165e;

    public C0316a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4165e = swipeDismissBehavior;
    }

    @Override // u1.d
    public final int J(View view) {
        return view.getWidth();
    }

    @Override // u1.d
    public final void S(View view, int i) {
        this.d = i;
        this.f4164c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4165e;
            swipeDismissBehavior.f1665c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1665c = false;
        }
    }

    @Override // u1.d
    public final void T(int i) {
        this.f4165e.getClass();
    }

    @Override // u1.d
    public final void U(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4165e;
        float f2 = width * swipeDismissBehavior.f1666e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1667f;
        float abs = Math.abs(i - this.f4164c);
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
    public final void V(View view, float f2, float f3) {
        int i;
        this.d = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f4165e;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = S.f351a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f4164c;
                    z2 = false;
                } else {
                    i = this.f4164c;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f4164c;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f4164c - width;
        } else {
            int left2 = view.getLeft() - this.f4164c;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1663a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = S.f351a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // u1.d
    public final boolean i0(View view, int i) {
        int i2 = this.d;
        return (i2 == -1 || i2 == i) && this.f4165e.r(view);
    }

    @Override // u1.d
    public final int k(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = S.f351a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f4165e.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f4164c - view.getWidth();
                width2 = this.f4164c;
            } else {
                width = this.f4164c;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f4164c - view.getWidth();
            width2 = view.getWidth() + this.f4164c;
        } else if (z2) {
            width = this.f4164c;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4164c - view.getWidth();
            width2 = this.f4164c;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // u1.d
    public final int l(View view, int i) {
        return view.getTop();
    }
}
