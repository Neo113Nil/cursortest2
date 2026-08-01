package s0;

import K.T;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import w1.l;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296a extends l {

    /* renamed from: e, reason: collision with root package name */
    public int f3687e;

    /* renamed from: f, reason: collision with root package name */
    public int f3688f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3689g;

    public C0296a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3689g = swipeDismissBehavior;
    }

    @Override // w1.l
    public final int C(View view) {
        return view.getWidth();
    }

    @Override // w1.l
    public final void M(View view, int i) {
        this.f3688f = i;
        this.f3687e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3689g;
            swipeDismissBehavior.f1661c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1661c = false;
        }
    }

    @Override // w1.l
    public final void N(int i) {
        this.f3689g.getClass();
    }

    @Override // w1.l
    public final void O(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3689g;
        float f2 = width * swipeDismissBehavior.f1662e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1663f;
        float abs = Math.abs(i - this.f3687e);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(RecyclerView.f1530C0);
        } else {
            view.setAlpha(Math.min(Math.max(RecyclerView.f1530C0, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // w1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(View view, float f2, float f3) {
        int i;
        this.f3688f = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f3689g;
        if (f2 != RecyclerView.f1530C0) {
            WeakHashMap weakHashMap = T.f423a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f3687e;
                    z2 = false;
                } else {
                    i = this.f3687e;
                    z2 = false;
                }
            }
            if (f2 >= RecyclerView.f1530C0) {
                int left = view.getLeft();
                int i3 = this.f3687e;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f3687e - width;
        } else {
            int left2 = view.getLeft() - this.f3687e;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1659a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = T.f423a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // w1.l
    public final boolean a0(View view, int i) {
        int i2 = this.f3688f;
        return (i2 == -1 || i2 == i) && this.f3689g.r(view);
    }

    @Override // w1.l
    public final int k(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = T.f423a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f3689g.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f3687e - view.getWidth();
                width2 = this.f3687e;
            } else {
                width = this.f3687e;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f3687e - view.getWidth();
            width2 = view.getWidth() + this.f3687e;
        } else if (z2) {
            width = this.f3687e;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3687e - view.getWidth();
            width2 = this.f3687e;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // w1.l
    public final int l(View view, int i) {
        return view.getTop();
    }
}
