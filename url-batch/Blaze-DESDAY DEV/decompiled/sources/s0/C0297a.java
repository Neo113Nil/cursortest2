package s0;

import K.T;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import z1.l;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297a extends l {

    /* renamed from: e, reason: collision with root package name */
    public int f3716e;

    /* renamed from: f, reason: collision with root package name */
    public int f3717f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3718g;

    public C0297a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3718g = swipeDismissBehavior;
    }

    @Override // z1.l
    public final int B(View view) {
        return view.getWidth();
    }

    @Override // z1.l
    public final void L(View view, int i) {
        this.f3717f = i;
        this.f3716e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3718g;
            swipeDismissBehavior.f1692c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1692c = false;
        }
    }

    @Override // z1.l
    public final void M(int i) {
        this.f3718g.getClass();
    }

    @Override // z1.l
    public final void N(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3718g;
        float f2 = width * swipeDismissBehavior.f1693e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1694f;
        float abs = Math.abs(i - this.f3716e);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(RecyclerView.f1559A0);
        } else {
            view.setAlpha(Math.min(Math.max(RecyclerView.f1559A0, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // z1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(View view, float f2, float f3) {
        int i;
        this.f3717f = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f3718g;
        if (f2 != RecyclerView.f1559A0) {
            WeakHashMap weakHashMap = T.f440a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f3716e;
                    z2 = false;
                } else {
                    i = this.f3716e;
                    z2 = false;
                }
            }
            if (f2 >= RecyclerView.f1559A0) {
                int left = view.getLeft();
                int i3 = this.f3716e;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f3716e - width;
        } else {
            int left2 = view.getLeft() - this.f3716e;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f1690a.o(i, view.getTop())) {
            H.a aVar = new H.a(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = T.f440a;
            view.postOnAnimation(aVar);
        }
    }

    @Override // z1.l
    public final boolean c0(View view, int i) {
        int i2 = this.f3717f;
        return (i2 == -1 || i2 == i) && this.f3718g.r(view);
    }

    @Override // z1.l
    public final int g(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = T.f440a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f3718g.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f3716e - view.getWidth();
                width2 = this.f3716e;
            } else {
                width = this.f3716e;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f3716e - view.getWidth();
            width2 = view.getWidth() + this.f3716e;
        } else if (z2) {
            width = this.f3716e;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3716e - view.getWidth();
            width2 = this.f3716e;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // z1.l
    public final int h(View view, int i) {
        return view.getTop();
    }
}
