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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class xy {
    public a6 a;
    public RecyclerView b;
    public final q4 c;
    public final q4 d;
    public jq e;
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

    public xy() {
        vy vyVar = new vy(this, 0);
        vy vyVar2 = new vy(this, 1);
        this.c = new q4(vyVar);
        this.d = new q4(vyVar2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((yy) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((yy) view.getLayoutParams()).a.c();
    }

    public static wy I(Context context, AttributeSet attributeSet, int i, int i2) {
        wy wyVar = new wy();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ux.a, i, i2);
        wyVar.a = obtainStyledAttributes.getInt(0, 1);
        wyVar.b = obtainStyledAttributes.getInt(10, 1);
        wyVar.c = obtainStyledAttributes.getBoolean(9, false);
        wyVar.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return wyVar;
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
        yy yyVar = (yy) view.getLayoutParams();
        Rect rect = yyVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) yyVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) yyVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) yyVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) yyVar).bottomMargin);
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
        Rect rect = ((yy) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        py adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = x80.a;
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

    public int J(ez ezVar, kz kzVar) {
        return -1;
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((yy) view.getLayoutParams()).b;
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
            int i2 = recyclerView.j.i();
            for (int i3 = 0; i3 < i2; i3++) {
                recyclerView.j.h(i3).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int i2 = recyclerView.j.i();
            for (int i3 = 0; i3 < i2; i3++) {
                recyclerView.j.h(i3).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, ez ezVar, kz kzVar);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        ez ezVar = recyclerView.g;
        kz kzVar = recyclerView.l0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        py pyVar = this.b.q;
        if (pyVar != null) {
            accessibilityEvent.setItemCount(pyVar.a());
        }
    }

    public final void W(View view, i0 i0Var) {
        nz J = RecyclerView.J(view);
        if (J == null || J.i()) {
            return;
        }
        a6 a6Var = this.a;
        if (((ArrayList) a6Var.d).contains(J.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        V(recyclerView.g, recyclerView.l0, view, i0Var);
    }

    public final void b(View view, int i, boolean z) {
        nz J = RecyclerView.J(view);
        if (z || J.i()) {
            u20 u20Var = (u20) this.b.k.g;
            e90 e90Var = (e90) u20Var.get(J);
            if (e90Var == null) {
                e90Var = e90.a();
                u20Var.put(J, e90Var);
            }
            e90Var.a |= 1;
        } else {
            this.b.k.P(J);
        }
        yy yyVar = (yy) view.getLayoutParams();
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
            a6 a6Var = this.a;
            if (parent == recyclerView) {
                ca caVar = (ca) a6Var.c;
                int indexOfChild = ((oy) a6Var.b).a.indexOfChild(view);
                int b = (indexOfChild == -1 || caVar.d(indexOfChild)) ? -1 : indexOfChild - caVar.b(indexOfChild);
                if (i == -1) {
                    i = this.a.i();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.z());
                }
                if (b != i) {
                    xy xyVar = this.b.r;
                    View u = xyVar.u(b);
                    if (u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b + xyVar.b.toString());
                    }
                    xyVar.u(b);
                    xyVar.a.d(b);
                    yy yyVar2 = (yy) u.getLayoutParams();
                    nz J2 = RecyclerView.J(u);
                    boolean i2 = J2.i();
                    RecyclerView recyclerView2 = xyVar.b;
                    if (i2) {
                        u20 u20Var2 = (u20) recyclerView2.k.g;
                        e90 e90Var2 = (e90) u20Var2.get(J2);
                        if (e90Var2 == null) {
                            e90Var2 = e90.a();
                            u20Var2.put(J2, e90Var2);
                        }
                        e90Var2.a = 1 | e90Var2.a;
                    } else {
                        recyclerView2.k.P(J2);
                    }
                    xyVar.a.b(u, i, yyVar2, J2.i());
                }
            } else {
                a6Var.a(view, i, false);
                yyVar.c = true;
                jq jqVar = this.e;
                if (jqVar != null && jqVar.e) {
                    jqVar.b.getClass();
                    nz J3 = RecyclerView.J(view);
                    if ((J3 != null ? J3.c() : -1) == jqVar.a) {
                        jqVar.f = view;
                    }
                }
            }
        }
        if (yyVar.d) {
            J.a.invalidate();
            yyVar.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(ez ezVar, kz kzVar);

    public abstract boolean d();

    public abstract void d0(kz kzVar);

    public abstract boolean e();

    public boolean f(yy yyVar) {
        return yyVar != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(ez ezVar) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.J(u(v)).p()) {
                View u = u(v);
                k0(v);
                ezVar.g(u);
            }
        }
    }

    public final void i0(ez ezVar) {
        ArrayList arrayList;
        int size = ezVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = ezVar.a;
            if (i < 0) {
                break;
            }
            View view = ((nz) arrayList.get(i)).a;
            nz J = RecyclerView.J(view);
            if (!J.p()) {
                J.o(false);
                if (J.k()) {
                    this.b.removeDetachedView(view, false);
                }
                ty tyVar = this.b.Q;
                if (tyVar != null) {
                    tyVar.d(J);
                }
                J.o(true);
                nz J2 = RecyclerView.J(view);
                J2.n = null;
                J2.o = false;
                J2.j &= -33;
                ezVar.h(J2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = ezVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(kz kzVar);

    public final void j0(View view, ez ezVar) {
        a6 a6Var = this.a;
        oy oyVar = (oy) a6Var.b;
        int indexOfChild = oyVar.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ca) a6Var.c).g(indexOfChild)) {
                a6Var.y(view);
            }
            oyVar.h(indexOfChild);
        }
        ezVar.g(view);
    }

    public abstract int k(kz kzVar);

    public final void k0(int i) {
        if (u(i) != null) {
            a6 a6Var = this.a;
            int o = a6Var.o(i);
            oy oyVar = (oy) a6Var.b;
            View childAt = oyVar.a.getChildAt(o);
            if (childAt == null) {
                return;
            }
            if (((ca) a6Var.c).g(o)) {
                a6Var.y(childAt);
            }
            oyVar.h(o);
        }
    }

    public abstract int l(kz kzVar);

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

    public abstract int m(kz kzVar);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(kz kzVar);

    public abstract int n0(int i, ez ezVar, kz kzVar);

    public abstract int o(kz kzVar);

    public abstract void o0(int i);

    public final void p(ez ezVar) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            nz J = RecyclerView.J(u);
            if (!J.p()) {
                if (!J.g() || J.i() || this.b.q.b) {
                    u(v);
                    this.a.d(v);
                    ezVar.i(u);
                    this.b.k.P(J);
                } else {
                    k0(v);
                    ezVar.h(J);
                }
            }
        }
    }

    public abstract int p0(int i, ez ezVar, kz kzVar);

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            nz J = RecyclerView.J(u);
            if (J != null && J.c() == i && !J.p() && (this.b.l0.g || !J.i())) {
                return u;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract yy r();

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

    public yy s(Context context, AttributeSet attributeSet) {
        return new yy(context, attributeSet);
    }

    public void s0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = x80.a;
        this.b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D, this.b.getMinimumHeight()));
    }

    public yy t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof yy ? new yy((yy) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new yy((ViewGroup.MarginLayoutParams) layoutParams) : new yy(layoutParams);
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
        a6 a6Var = this.a;
        if (a6Var != null) {
            return a6Var.h(i);
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
        a6 a6Var = this.a;
        if (a6Var != null) {
            return a6Var.i();
        }
        return 0;
    }

    public final boolean v0(View view, int i, int i2, yy yyVar) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) yyVar).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) yyVar).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(ez ezVar, kz kzVar) {
        return -1;
    }

    public final boolean x0(View view, int i, int i2, yy yyVar) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) yyVar).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) yyVar).height)) ? false : true;
    }

    public void y(Rect rect, View view) {
        int[] iArr = RecyclerView.E0;
        yy yyVar = (yy) view.getLayoutParams();
        Rect rect2 = yyVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) yyVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) yyVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) yyVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) yyVar).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i);

    public final void z0(jq jqVar) {
        jq jqVar2 = this.e;
        if (jqVar2 != null && jqVar != jqVar2 && jqVar2.e) {
            jqVar2.i();
        }
        this.e = jqVar;
        RecyclerView recyclerView = this.b;
        mz mzVar = recyclerView.i0;
        mzVar.l.removeCallbacks(mzVar);
        mzVar.h.abortAnimation();
        if (jqVar.h) {
            Log.w("RecyclerView", "An instance of " + jqVar.getClass().getSimpleName() + " was started more than once. Each instance of" + jqVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        jqVar.b = recyclerView;
        jqVar.c = this;
        int i = jqVar.a;
        if (i == -1) {
            t8.k("Invalid target position");
            return;
        }
        recyclerView.l0.a = i;
        jqVar.e = true;
        jqVar.d = true;
        jqVar.f = recyclerView.r.q(i);
        jqVar.b.i0.a();
        jqVar.h = true;
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

    public void i(int i, im imVar) {
    }

    public void V(ez ezVar, kz kzVar, View view, i0 i0Var) {
    }

    public void h(int i, int i2, kz kzVar, im imVar) {
    }
}
