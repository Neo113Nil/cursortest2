package A0;

import K.Q;
import T0.e;
import T0.i;
import T0.m;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public int f2e;

    /* renamed from: f, reason: collision with root package name */
    public int f3f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4g;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4g = swipeDismissBehavior;
    }

    @Override // H1.d
    public final int J(View view) {
        return view.getWidth();
    }

    @Override // H1.d
    public final void W(View view, int i) {
        this.f3f = i;
        this.f2e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4g;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // H1.d
    public final void X(int i) {
        e eVar = this.f4g.f2140b;
        if (eVar != null) {
            i iVar = eVar.f1032a;
            if (i == 0) {
                m.m().w(iVar.f1065t);
            } else if (i == 1 || i == 2) {
                m.m().u(iVar.f1065t);
            }
        }
    }

    @Override // H1.d
    public final void Y(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4g;
        float f2 = width * swipeDismissBehavior.f2143f;
        float width2 = view.getWidth() * swipeDismissBehavior.f2144g;
        float abs = Math.abs(i - this.f2e);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(RecyclerView.f1937A0);
        } else {
            view.setAlpha(Math.min(Math.max(RecyclerView.f1937A0, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // H1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(View view, float f2, float f3) {
        int i;
        e eVar;
        this.f3f = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f4g;
        if (f2 != RecyclerView.f1937A0) {
            WeakHashMap weakHashMap = Q.f578a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.f2142e;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f2e;
                    z2 = false;
                } else {
                    i = this.f2e;
                    z2 = false;
                }
            }
            if (f2 >= RecyclerView.f1937A0) {
                int left = view.getLeft();
                int i3 = this.f2e;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f2e - width;
        } else {
            int left2 = view.getLeft() - this.f2e;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f2139a.o(i, view.getTop())) {
            d dVar = new d(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = Q.f578a;
            view.postOnAnimation(dVar);
        } else {
            if (!z2 || (eVar = swipeDismissBehavior.f2140b) == null) {
                return;
            }
            eVar.a(view);
        }
    }

    @Override // H1.d
    public final int n(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = Q.f578a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f4g.f2142e;
        if (i2 == 0) {
            if (z2) {
                width = this.f2e - view.getWidth();
                width2 = this.f2e;
            } else {
                width = this.f2e;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f2e - view.getWidth();
            width2 = view.getWidth() + this.f2e;
        } else if (z2) {
            width = this.f2e;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f2e - view.getWidth();
            width2 = this.f2e;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // H1.d
    public final int o(View view, int i) {
        return view.getTop();
    }

    @Override // H1.d
    public final boolean v0(View view, int i) {
        int i2 = this.f3f;
        return (i2 == -1 || i2 == i) && this.f4g.r(view);
    }
}
