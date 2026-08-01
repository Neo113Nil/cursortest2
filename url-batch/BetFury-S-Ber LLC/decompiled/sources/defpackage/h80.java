package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class h80 {
    public s6 a;
    public RecyclerView b;
    public final tl0 c;
    public final tl0 d;
    public wx e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public h80() {
        f80 f80Var = new f80(this, 0);
        f80 f80Var2 = new f80(this, 1);
        this.c = new tl0(f80Var);
        this.d = new tl0(f80Var2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((i80) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((i80) view.getLayoutParams()).a.c();
    }

    public static g80 I(Context context, AttributeSet attributeSet, int i, int i2) {
        g80 g80Var = new g80();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b70.a, i, i2);
        g80Var.a = obtainStyledAttributes.getInt(0, 1);
        g80Var.b = obtainStyledAttributes.getInt(10, 1);
        g80Var.c = obtainStyledAttributes.getBoolean(9, false);
        g80Var.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return g80Var;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        i80 i80Var = (i80) view.getLayoutParams();
        Rect rect = i80Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) i80Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) i80Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) i80Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) i80Var).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != 0) {
                        }
                    }
                    i4 = max;
                }
                i2 = 0;
                i4 = 0;
            }
            i2 = 1073741824;
        } else {
            if (i4 < 0) {
                if (i4 != -1) {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i4 = max;
                            i2 = Integer.MIN_VALUE;
                        } else {
                            i4 = max;
                            i2 = 0;
                        }
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i4 = max;
            }
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int z(View view) {
        Rect rect = ((i80) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        z70 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = hm0.a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(o80 o80Var, u80 u80Var) {
        return -1;
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((i80) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.p;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int h = recyclerView.j.h();
            for (int i2 = 0; i2 < h; i2++) {
                recyclerView.j.g(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int h = recyclerView.j.h();
            for (int i2 = 0; i2 < h; i2++) {
                recyclerView.j.g(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, o80 o80Var, u80 u80Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        o80 o80Var = recyclerView.g;
        u80 u80Var = recyclerView.l0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        z70 z70Var = this.b.q;
        if (z70Var != null) {
            accessibilityEvent.setItemCount(z70Var.a());
        }
    }

    public final void W(View view, m0 m0Var) {
        x80 J = RecyclerView.J(view);
        if (J == null || J.i()) {
            return;
        }
        s6 s6Var = this.a;
        if (((ArrayList) s6Var.d).contains(J.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        V(recyclerView.g, recyclerView.l0, view, m0Var);
    }

    public final void b(View view, int i, boolean z) {
        x80 J = RecyclerView.J(view);
        if (z || J.i()) {
            zd0 zd0Var = (zd0) this.b.k.g;
            nm0 nm0Var = (nm0) zd0Var.get(J);
            if (nm0Var == null) {
                nm0Var = nm0.a();
                zd0Var.put(J, nm0Var);
            }
            nm0Var.a |= 1;
        } else {
            this.b.k.e(J);
        }
        i80 i80Var = (i80) view.getLayoutParams();
        if (J.q() || J.j()) {
            if (J.j()) {
                J.n.k(J);
            } else {
                J.j &= -33;
            }
            this.a.b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            s6 s6Var = this.a;
            if (parent == recyclerView) {
                mb mbVar = (mb) s6Var.c;
                int indexOfChild = ((w70) s6Var.b).a.indexOfChild(view);
                int b = (indexOfChild == -1 || mbVar.d(indexOfChild)) ? -1 : indexOfChild - mbVar.b(indexOfChild);
                if (i == -1) {
                    i = this.a.h();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.z());
                }
                if (b != i) {
                    h80 h80Var = this.b.r;
                    View u = h80Var.u(b);
                    if (u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b + h80Var.b.toString());
                    }
                    h80Var.u(b);
                    h80Var.a.d(b);
                    i80 i80Var2 = (i80) u.getLayoutParams();
                    x80 J2 = RecyclerView.J(u);
                    boolean i2 = J2.i();
                    RecyclerView recyclerView2 = h80Var.b;
                    if (i2) {
                        zd0 zd0Var2 = (zd0) recyclerView2.k.g;
                        nm0 nm0Var2 = (nm0) zd0Var2.get(J2);
                        if (nm0Var2 == null) {
                            nm0Var2 = nm0.a();
                            zd0Var2.put(J2, nm0Var2);
                        }
                        nm0Var2.a = 1 | nm0Var2.a;
                    } else {
                        recyclerView2.k.e(J2);
                    }
                    h80Var.a.b(u, i, i80Var2, J2.i());
                }
            } else {
                s6Var.a(view, i, false);
                i80Var.c = true;
                wx wxVar = this.e;
                if (wxVar != null && wxVar.e) {
                    wxVar.b.getClass();
                    x80 J3 = RecyclerView.J(view);
                    if ((J3 != null ? J3.c() : -1) == wxVar.a) {
                        wxVar.f = view;
                    }
                }
            }
        }
        if (i80Var.d) {
            J.a.invalidate();
            i80Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(o80 o80Var, u80 u80Var);

    public abstract boolean d();

    public abstract void d0(u80 u80Var);

    public abstract boolean e();

    public boolean f(i80 i80Var) {
        return i80Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(o80 o80Var) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.J(u(v)).p()) {
                View u = u(v);
                k0(v);
                o80Var.g(u);
            }
        }
    }

    public final void i0(o80 o80Var) {
        ArrayList arrayList;
        int size = o80Var.a.size();
        int i = size - 1;
        while (true) {
            arrayList = o80Var.a;
            if (i < 0) {
                break;
            }
            View view = ((x80) arrayList.get(i)).a;
            x80 J = RecyclerView.J(view);
            if (!J.p()) {
                J.o(false);
                if (J.k()) {
                    this.b.removeDetachedView(view, false);
                }
                d80 d80Var = this.b.Q;
                if (d80Var != null) {
                    d80Var.d(J);
                }
                J.o(true);
                x80 J2 = RecyclerView.J(view);
                J2.n = null;
                J2.o = false;
                J2.j &= -33;
                o80Var.h(J2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = o80Var.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(u80 u80Var);

    public final void j0(View view, o80 o80Var) {
        s6 s6Var = this.a;
        w70 w70Var = (w70) s6Var.b;
        int indexOfChild = w70Var.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((mb) s6Var.c).g(indexOfChild)) {
                s6Var.x(view);
            }
            w70Var.h(indexOfChild);
        }
        o80Var.g(view);
    }

    public abstract int k(u80 u80Var);

    public final void k0(int i) {
        if (u(i) != null) {
            s6 s6Var = this.a;
            int n = s6Var.n(i);
            w70 w70Var = (w70) s6Var.b;
            View childAt = w70Var.a.getChildAt(n);
            if (childAt == null) {
                return;
            }
            if (((mb) s6Var.c).g(n)) {
                s6Var.x(childAt);
            }
            w70Var.h(n);
        }
    }

    public abstract int l(u80 u80Var);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int E = E();
        int G = G();
        int F = this.n - F();
        int D = this.o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E;
        int min = Math.min(0, i);
        int i2 = top - G;
        int min2 = Math.min(0, i2);
        int i3 = width - F;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - D);
        if (C() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i3);
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        int[] iArr = {max, min2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E2 = E();
                int G2 = G();
                int F2 = this.n - F();
                int D2 = this.o - D();
                Rect rect2 = this.b.n;
                y(rect2, focusedChild);
                if (rect2.left - i4 < F2) {
                    if (rect2.right - i4 > E2) {
                        if (rect2.top - i5 < D2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.c0(i4, i5, false);
            return true;
        }
        return false;
    }

    public abstract int m(u80 u80Var);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(u80 u80Var);

    public abstract int n0(int i, o80 o80Var, u80 u80Var);

    public abstract int o(u80 u80Var);

    public abstract void o0(int i);

    public final void p(o80 o80Var) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            x80 J = RecyclerView.J(u);
            if (!J.p()) {
                if (!J.g() || J.i() || this.b.q.b) {
                    u(v);
                    this.a.d(v);
                    o80Var.i(u);
                    this.b.k.e(J);
                } else {
                    k0(v);
                    o80Var.h(J);
                }
            }
        }
    }

    public abstract int p0(int i, o80 o80Var, u80 u80Var);

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            x80 J = RecyclerView.J(u);
            if (J != null && J.c() == i && !J.p() && (this.b.l0.g || !J.i())) {
                return u;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract i80 r();

    public final void r0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.E0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.E0;
        }
    }

    public i80 s(Context context, AttributeSet attributeSet) {
        return new i80(context, attributeSet);
    }

    public void s0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = hm0.a;
        this.b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D, this.b.getMinimumHeight()));
    }

    public i80 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i80 ? new i80((i80) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new i80((ViewGroup.MarginLayoutParams) layoutParams) : new i80(layoutParams);
    }

    public final void t0(int i, int i2) {
        int v = v();
        if (v == 0) {
            this.b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v; i7++) {
            View u = u(i7);
            Rect rect = this.b.n;
            y(rect, u);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.n.set(i6, i4, i3, i5);
        s0(this.b.n, i, i2);
    }

    public final View u(int i) {
        s6 s6Var = this.a;
        if (s6Var != null) {
            return s6Var.g(i);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.j;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final int v() {
        s6 s6Var = this.a;
        if (s6Var != null) {
            return s6Var.h();
        }
        return 0;
    }

    public final boolean v0(View view, int i, int i2, i80 i80Var) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) i80Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) i80Var).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(o80 o80Var, u80 u80Var) {
        return -1;
    }

    public final boolean x0(View view, int i, int i2, i80 i80Var) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) i80Var).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) i80Var).height)) ? false : true;
    }

    public void y(Rect rect, View view) {
        int[] iArr = RecyclerView.E0;
        i80 i80Var = (i80) view.getLayoutParams();
        Rect rect2 = i80Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) i80Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) i80Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) i80Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) i80Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i);

    public final void z0(wx wxVar) {
        wx wxVar2 = this.e;
        if (wxVar2 != null && wxVar != wxVar2 && wxVar2.e) {
            wxVar2.i();
        }
        this.e = wxVar;
        RecyclerView recyclerView = this.b;
        w80 w80Var = recyclerView.i0;
        w80Var.l.removeCallbacks(w80Var);
        w80Var.h.abortAnimation();
        if (wxVar.h) {
            Log.w("RecyclerView", "An instance of " + wxVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wxVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wxVar.b = recyclerView;
        wxVar.c = this;
        int i = wxVar.a;
        if (i == -1) {
            s9.k("Invalid target position");
            return;
        }
        recyclerView.l0.a = i;
        wxVar.e = true;
        wxVar.d = true;
        wxVar.f = recyclerView.r.q(i);
        wxVar.b.i0.a();
        wxVar.h = true;
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i) {
    }

    public void Q() {
    }

    public void Y() {
    }

    public void X(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void i(int i, ac acVar) {
    }

    public void V(o80 o80Var, u80 u80Var, View view, m0 m0Var) {
    }

    public void h(int i, int i2, u80 u80Var, ac acVar) {
    }
}
