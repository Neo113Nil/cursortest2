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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class b20 {
    public k6 a;
    public RecyclerView b;
    public final a5 c;
    public final a5 d;
    public xs e;
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

    public b20() {
        z10 z10Var = new z10(this, 0);
        z10 z10Var2 = new z10(this, 1);
        this.c = new a5(z10Var);
        this.d = new a5(z10Var2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((c20) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((c20) view.getLayoutParams()).a.b();
    }

    public static a20 I(Context context, AttributeSet attributeSet, int i, int i2) {
        a20 a20Var = new a20();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x00.a, i, i2);
        a20Var.a = obtainStyledAttributes.getInt(0, 1);
        a20Var.b = obtainStyledAttributes.getInt(10, 1);
        a20Var.c = obtainStyledAttributes.getBoolean(9, false);
        a20Var.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return a20Var;
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
        c20 c20Var = (c20) view.getLayoutParams();
        Rect rect = c20Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c20Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c20Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c20Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c20Var).bottomMargin);
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
        Rect rect = ((c20) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        t10 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = ic0.a;
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

    public int J(h20 h20Var, n20 n20Var) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((c20) view.getLayoutParams()).b;
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
            int m = recyclerView.j.m();
            for (int i2 = 0; i2 < m; i2++) {
                recyclerView.j.l(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int m = recyclerView.j.m();
            for (int i2 = 0; i2 < m; i2++) {
                recyclerView.j.l(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, h20 h20Var, n20 n20Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        h20 h20Var = recyclerView.g;
        n20 n20Var = recyclerView.k0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        t10 t10Var = this.b.q;
        if (t10Var != null) {
            accessibilityEvent.setItemCount(t10Var.a());
        }
    }

    public final void W(View view, k0 k0Var) {
        q20 I = RecyclerView.I(view);
        if (I == null || I.h()) {
            return;
        }
        k6 k6Var = this.a;
        if (((ArrayList) k6Var.i).contains(I.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        V(recyclerView.g, recyclerView.k0, view, k0Var);
    }

    public final void b(View view, int i, boolean z) {
        q20 I = RecyclerView.I(view);
        if (z || I.h()) {
            w50 w50Var = (w50) this.b.k.g;
            oc0 oc0Var = (oc0) w50Var.get(I);
            if (oc0Var == null) {
                oc0Var = oc0.a();
                w50Var.put(I, oc0Var);
            }
            oc0Var.a |= 1;
        } else {
            this.b.k.P(I);
        }
        c20 c20Var = (c20) view.getLayoutParams();
        if (I.p() || I.i()) {
            if (I.i()) {
                I.n.k(I);
            } else {
                I.j &= -33;
            }
            this.a.f(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            k6 k6Var = this.a;
            if (parent == recyclerView) {
                ra raVar = (ra) k6Var.h;
                int indexOfChild = ((s10) k6Var.g).a.indexOfChild(view);
                int b = (indexOfChild == -1 || raVar.d(indexOfChild)) ? -1 : indexOfChild - raVar.b(indexOfChild);
                if (i == -1) {
                    i = this.a.m();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.y());
                }
                if (b != i) {
                    b20 b20Var = this.b.r;
                    View u = b20Var.u(b);
                    if (u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b + b20Var.b.toString());
                    }
                    b20Var.u(b);
                    b20Var.a.i(b);
                    c20 c20Var2 = (c20) u.getLayoutParams();
                    q20 I2 = RecyclerView.I(u);
                    boolean h = I2.h();
                    RecyclerView recyclerView2 = b20Var.b;
                    if (h) {
                        w50 w50Var2 = (w50) recyclerView2.k.g;
                        oc0 oc0Var2 = (oc0) w50Var2.get(I2);
                        if (oc0Var2 == null) {
                            oc0Var2 = oc0.a();
                            w50Var2.put(I2, oc0Var2);
                        }
                        oc0Var2.a = 1 | oc0Var2.a;
                    } else {
                        recyclerView2.k.P(I2);
                    }
                    b20Var.a.f(u, i, c20Var2, I2.h());
                }
            } else {
                k6Var.a(view, i, false);
                c20Var.c = true;
                xs xsVar = this.e;
                if (xsVar != null && xsVar.e) {
                    xsVar.b.getClass();
                    q20 I3 = RecyclerView.I(view);
                    if ((I3 != null ? I3.b() : -1) == xsVar.a) {
                        xsVar.f = view;
                    }
                }
            }
        }
        if (c20Var.d) {
            I.a.invalidate();
            c20Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(h20 h20Var, n20 n20Var);

    public abstract boolean d();

    public abstract void d0(n20 n20Var);

    public abstract boolean e();

    public boolean f(c20 c20Var) {
        return c20Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(h20 h20Var) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.I(u(v)).o()) {
                View u = u(v);
                k0(v);
                h20Var.g(u);
            }
        }
    }

    public final void i0(h20 h20Var) {
        ArrayList arrayList;
        int size = h20Var.a.size();
        int i = size - 1;
        while (true) {
            arrayList = h20Var.a;
            if (i < 0) {
                break;
            }
            View view = ((q20) arrayList.get(i)).a;
            q20 I = RecyclerView.I(view);
            if (!I.o()) {
                I.n(false);
                if (I.j()) {
                    this.b.removeDetachedView(view, false);
                }
                x10 x10Var = this.b.P;
                if (x10Var != null) {
                    x10Var.d(I);
                }
                I.n(true);
                q20 I2 = RecyclerView.I(view);
                I2.n = null;
                I2.o = false;
                I2.j &= -33;
                h20Var.h(I2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = h20Var.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(n20 n20Var);

    public final void j0(View view, h20 h20Var) {
        k6 k6Var = this.a;
        s10 s10Var = (s10) k6Var.g;
        int indexOfChild = s10Var.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ra) k6Var.h).g(indexOfChild)) {
                k6Var.D(view);
            }
            s10Var.h(indexOfChild);
        }
        h20Var.g(view);
    }

    public abstract int k(n20 n20Var);

    public final void k0(int i) {
        if (u(i) != null) {
            k6 k6Var = this.a;
            int s = k6Var.s(i);
            s10 s10Var = (s10) k6Var.g;
            View childAt = s10Var.a.getChildAt(s);
            if (childAt == null) {
                return;
            }
            if (((ra) k6Var.h).g(s)) {
                k6Var.D(childAt);
            }
            s10Var.h(s);
        }
    }

    public abstract int l(n20 n20Var);

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
                y(focusedChild, rect2);
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
            recyclerView.a0(i4, i5, false);
            return true;
        }
        return false;
    }

    public abstract int m(n20 n20Var);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(n20 n20Var);

    public abstract int n0(int i, h20 h20Var, n20 n20Var);

    public abstract int o(n20 n20Var);

    public abstract void o0(int i);

    public final void p(h20 h20Var) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            q20 I = RecyclerView.I(u);
            if (!I.o()) {
                if (!I.f() || I.h() || this.b.q.b) {
                    u(v);
                    this.a.i(v);
                    h20Var.i(u);
                    this.b.k.P(I);
                } else {
                    k0(v);
                    h20Var.h(I);
                }
            }
        }
    }

    public abstract int p0(int i, h20 h20Var, n20 n20Var);

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            q20 I = RecyclerView.I(u);
            if (I != null && I.b() == i && !I.o() && (this.b.k0.g || !I.h())) {
                return u;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract c20 r();

    public final void r0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.D0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.D0;
        }
    }

    public c20 s(Context context, AttributeSet attributeSet) {
        return new c20(context, attributeSet);
    }

    public void s0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = ic0.a;
        this.b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D, this.b.getMinimumHeight()));
    }

    public c20 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c20 ? new c20((c20) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c20((ViewGroup.MarginLayoutParams) layoutParams) : new c20(layoutParams);
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
            y(u, rect);
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
        k6 k6Var = this.a;
        if (k6Var != null) {
            return k6Var.l(i);
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
        k6 k6Var = this.a;
        if (k6Var != null) {
            return k6Var.m();
        }
        return 0;
    }

    public final boolean v0(View view, int i, int i2, c20 c20Var) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c20Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c20Var).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(h20 h20Var, n20 n20Var) {
        return -1;
    }

    public final boolean x0(View view, int i, int i2, c20 c20Var) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c20Var).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c20Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.D0;
        c20 c20Var = (c20) view.getLayoutParams();
        Rect rect2 = c20Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c20Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c20Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c20Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c20Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i);

    public final void z0(xs xsVar) {
        xs xsVar2 = this.e;
        if (xsVar2 != null && xsVar != xsVar2 && xsVar2.e) {
            xsVar2.i();
        }
        this.e = xsVar;
        RecyclerView recyclerView = this.b;
        p20 p20Var = recyclerView.h0;
        p20Var.l.removeCallbacks(p20Var);
        p20Var.h.abortAnimation();
        if (xsVar.h) {
            Log.w("RecyclerView", "An instance of " + xsVar.getClass().getSimpleName() + " was started more than once. Each instance of" + xsVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        xsVar.b = recyclerView;
        xsVar.c = this;
        int i = xsVar.a;
        if (i == -1) {
            g9.i("Invalid target position");
            return;
        }
        recyclerView.k0.a = i;
        xsVar.e = true;
        xsVar.d = true;
        xsVar.f = recyclerView.r.q(i);
        xsVar.b.h0.a();
        xsVar.h = true;
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

    public void i(int i, ro roVar) {
    }

    public void V(h20 h20Var, n20 n20Var, View view, k0 k0Var) {
    }

    public void h(int i, int i2, n20 n20Var, ro roVar) {
    }
}
