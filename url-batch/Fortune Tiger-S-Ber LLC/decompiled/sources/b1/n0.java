package b1;

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
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.s f874a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f875b;
    public final a2.s c;

    /* renamed from: d, reason: collision with root package name */
    public final a2.s f876d;

    /* renamed from: e, reason: collision with root package name */
    public x f877e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f878f;
    public boolean g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f879i;

    /* renamed from: j, reason: collision with root package name */
    public int f880j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f881k;

    /* renamed from: l, reason: collision with root package name */
    public int f882l;

    /* renamed from: m, reason: collision with root package name */
    public int f883m;

    /* renamed from: n, reason: collision with root package name */
    public int f884n;

    /* renamed from: o, reason: collision with root package name */
    public int f885o;

    public n0() {
        l0 l0Var = new l0(this, 0);
        l0 l0Var2 = new l0(this, 1);
        this.c = new a2.s(l0Var);
        this.f876d = new a2.s(l0Var2);
        this.f878f = false;
        this.g = false;
        this.h = true;
        this.f879i = true;
    }

    public static int A(View view) {
        Rect rect = ((o0) view.getLayoutParams()).f890b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((o0) view.getLayoutParams()).f889a.b();
    }

    public static m0 I(Context context, AttributeSet attributeSet, int i4, int i5) {
        m0 m0Var = new m0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f2a, i4, i5);
        m0Var.f845a = obtainStyledAttributes.getInt(0, 1);
        m0Var.f846b = obtainStyledAttributes.getInt(10, 1);
        m0Var.c = obtainStyledAttributes.getBoolean(9, false);
        m0Var.f847d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return m0Var;
    }

    public static boolean M(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i6 > 0 && i4 != i6) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i4;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i4;
        }
        return true;
    }

    public static void N(View view, int i4, int i5, int i6, int i7) {
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect = o0Var.f890b;
        view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) o0Var).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
    }

    public static int g(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(boolean z3, int i4, int i5, int i6, int i7) {
        int max = Math.max(0, i4 - i6);
        if (z3) {
            if (i7 < 0) {
                if (i7 == -1) {
                    if (i5 != Integer.MIN_VALUE) {
                        if (i5 != 0) {
                        }
                    }
                    i7 = max;
                }
                i5 = 0;
                i7 = 0;
            }
            i5 = 1073741824;
        } else {
            if (i7 < 0) {
                if (i7 != -1) {
                    if (i7 == -2) {
                        if (i5 == Integer.MIN_VALUE || i5 == 1073741824) {
                            i7 = max;
                            i5 = Integer.MIN_VALUE;
                        } else {
                            i7 = max;
                            i5 = 0;
                        }
                    }
                    i5 = 0;
                    i7 = 0;
                }
                i7 = max;
            }
            i5 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i7, i5);
    }

    public static int z(View view) {
        Rect rect = ((o0) view.getLayoutParams()).f890b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.f875b;
        e0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f875b;
        WeakHashMap weakHashMap = k0.j0.f2752a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f875b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f875b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f875b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f875b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(t0 t0Var, z0 z0Var) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((o0) view.getLayoutParams()).f890b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f875b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f875b.f649p;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i4) {
        RecyclerView recyclerView = this.f875b;
        if (recyclerView != null) {
            int g = recyclerView.f637j.g();
            for (int i5 = 0; i5 < g; i5++) {
                recyclerView.f637j.f(i5).offsetLeftAndRight(i4);
            }
        }
    }

    public void P(int i4) {
        RecyclerView recyclerView = this.f875b;
        if (recyclerView != null) {
            int g = recyclerView.f637j.g();
            for (int i5 = 0; i5 < g; i5++) {
                recyclerView.f637j.f(i5).offsetTopAndBottom(i4);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i4, t0 t0Var, z0 z0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f875b;
        t0 t0Var = recyclerView.g;
        z0 z0Var = recyclerView.f640k0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f875b.canScrollVertically(-1) && !this.f875b.canScrollHorizontally(-1) && !this.f875b.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        e0 e0Var = this.f875b.f651q;
        if (e0Var != null) {
            accessibilityEvent.setItemCount(e0Var.a());
        }
    }

    public final void V(View view, l0.e eVar) {
        c1 I = RecyclerView.I(view);
        if (I == null || I.h()) {
            return;
        }
        androidx.emoji2.text.s sVar = this.f874a;
        if (((ArrayList) sVar.f358d).contains(I.f747a)) {
            return;
        }
        RecyclerView recyclerView = this.f875b;
        W(recyclerView.g, recyclerView.f640k0, view, eVar);
    }

    public final void b(View view, int i4, boolean z3) {
        c1 I = RecyclerView.I(view);
        if (z3 || I.h()) {
            n.j jVar = (n.j) this.f875b.f639k.g;
            m1 m1Var = (m1) jVar.get(I);
            if (m1Var == null) {
                m1Var = m1.a();
                jVar.put(I, m1Var);
            }
            m1Var.f849a |= 1;
        } else {
            this.f875b.f639k.H(I);
        }
        o0 o0Var = (o0) view.getLayoutParams();
        if (I.p() || I.i()) {
            if (I.i()) {
                I.f757n.k(I);
            } else {
                I.f753j &= -33;
            }
            this.f874a.b(view, i4, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f875b) {
                androidx.emoji2.text.s sVar = this.f874a;
                c cVar = (c) sVar.c;
                int indexOfChild = ((d0) sVar.f357b).f764a.indexOfChild(view);
                int b2 = (indexOfChild == -1 || cVar.d(indexOfChild)) ? -1 : indexOfChild - cVar.b(indexOfChild);
                if (i4 == -1) {
                    i4 = this.f874a.g();
                }
                if (b2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f875b.indexOfChild(view) + this.f875b.y());
                }
                if (b2 != i4) {
                    n0 n0Var = this.f875b.f653r;
                    View u3 = n0Var.u(b2);
                    if (u3 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + n0Var.f875b.toString());
                    }
                    n0Var.u(b2);
                    n0Var.f874a.d(b2);
                    o0 o0Var2 = (o0) u3.getLayoutParams();
                    c1 I2 = RecyclerView.I(u3);
                    if (I2.h()) {
                        n.j jVar2 = (n.j) n0Var.f875b.f639k.g;
                        m1 m1Var2 = (m1) jVar2.get(I2);
                        if (m1Var2 == null) {
                            m1Var2 = m1.a();
                            jVar2.put(I2, m1Var2);
                        }
                        m1Var2.f849a = 1 | m1Var2.f849a;
                    } else {
                        n0Var.f875b.f639k.H(I2);
                    }
                    n0Var.f874a.b(u3, i4, o0Var2, I2.h());
                }
            } else {
                this.f874a.a(view, i4, false);
                o0Var.c = true;
                x xVar = this.f877e;
                if (xVar != null && xVar.f939e) {
                    xVar.f937b.getClass();
                    c1 I3 = RecyclerView.I(view);
                    if ((I3 != null ? I3.b() : -1) == xVar.f936a) {
                        xVar.f940f = view;
                    }
                }
            }
        }
        if (o0Var.f891d) {
            I.f747a.invalidate();
            o0Var.f891d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f875b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(t0 t0Var, z0 z0Var);

    public abstract boolean d();

    public abstract void d0(z0 z0Var);

    public abstract boolean e();

    public boolean f(o0 o0Var) {
        return o0Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(t0 t0Var) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            if (!RecyclerView.I(u(v3)).o()) {
                View u3 = u(v3);
                k0(v3);
                t0Var.g(u3);
            }
        }
    }

    public final void i0(t0 t0Var) {
        ArrayList arrayList = t0Var.f917a;
        int size = arrayList.size();
        for (int i4 = size - 1; i4 >= 0; i4--) {
            View view = ((c1) arrayList.get(i4)).f747a;
            c1 I = RecyclerView.I(view);
            if (!I.o()) {
                I.n(false);
                if (I.j()) {
                    this.f875b.removeDetachedView(view, false);
                }
                j0 j0Var = this.f875b.P;
                if (j0Var != null) {
                    j0Var.d(I);
                }
                I.n(true);
                c1 I2 = RecyclerView.I(view);
                I2.f757n = null;
                I2.f758o = false;
                I2.f753j &= -33;
                t0Var.h(I2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = t0Var.f918b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f875b.invalidate();
        }
    }

    public abstract int j(z0 z0Var);

    public final void j0(View view, t0 t0Var) {
        androidx.emoji2.text.s sVar = this.f874a;
        d0 d0Var = (d0) sVar.f357b;
        int indexOfChild = d0Var.f764a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c) sVar.c).g(indexOfChild)) {
                sVar.v(view);
            }
            d0Var.h(indexOfChild);
        }
        t0Var.g(view);
    }

    public abstract int k(z0 z0Var);

    public final void k0(int i4) {
        if (u(i4) != null) {
            androidx.emoji2.text.s sVar = this.f874a;
            int l4 = sVar.l(i4);
            d0 d0Var = (d0) sVar.f357b;
            View childAt = d0Var.f764a.getChildAt(l4);
            if (childAt == null) {
                return;
            }
            if (((c) sVar.c).g(l4)) {
                sVar.v(childAt);
            }
            d0Var.h(l4);
        }
    }

    public abstract int l(z0 z0Var);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        int E = E();
        int G = G();
        int F = this.f884n - F();
        int D = this.f885o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i4 = left - E;
        int min = Math.min(0, i4);
        int i5 = top - G;
        int min2 = Math.min(0, i5);
        int i6 = width - F;
        int max = Math.max(0, i6);
        int max2 = Math.max(0, height - D);
        if (C() != 1) {
            if (min == 0) {
                min = Math.min(i4, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i6);
        }
        if (min2 == 0) {
            min2 = Math.min(i5, max2);
        }
        int[] iArr = {max, min2};
        int i7 = iArr[0];
        int i8 = iArr[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E2 = E();
                int G2 = G();
                int F2 = this.f884n - F();
                int D2 = this.f885o - D();
                Rect rect2 = this.f875b.f645n;
                y(focusedChild, rect2);
                if (rect2.left - i7 < F2) {
                    if (rect2.right - i7 > E2) {
                        if (rect2.top - i8 < D2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i7 != 0 || i8 != 0) {
            if (z3) {
                recyclerView.scrollBy(i7, i8);
                return true;
            }
            recyclerView.a0(i7, i8, false);
            return true;
        }
        return false;
    }

    public abstract int m(z0 z0Var);

    public final void m0() {
        RecyclerView recyclerView = this.f875b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(z0 z0Var);

    public abstract int n0(int i4, t0 t0Var, z0 z0Var);

    public abstract int o(z0 z0Var);

    public abstract void o0(int i4);

    public final void p(t0 t0Var) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            c1 I = RecyclerView.I(u3);
            if (!I.o()) {
                if (!I.f() || I.h() || this.f875b.f651q.f772b) {
                    u(v3);
                    this.f874a.d(v3);
                    t0Var.i(u3);
                    this.f875b.f639k.H(I);
                } else {
                    k0(v3);
                    t0Var.h(I);
                }
            }
        }
    }

    public abstract int p0(int i4, t0 t0Var, z0 z0Var);

    public View q(int i4) {
        int v3 = v();
        for (int i5 = 0; i5 < v3; i5++) {
            View u3 = u(i5);
            c1 I = RecyclerView.I(u3);
            if (I != null && I.b() == i4 && !I.o() && (this.f875b.f640k0.g || !I.h())) {
                return u3;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract o0 r();

    public final void r0(int i4, int i5) {
        this.f884n = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        this.f882l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.D0;
        }
        this.f885o = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        this.f883m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.D0;
        }
    }

    public o0 s(Context context, AttributeSet attributeSet) {
        return new o0(context, attributeSet);
    }

    public void s0(Rect rect, int i4, int i5) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.f875b;
        WeakHashMap weakHashMap = k0.j0.f2752a;
        this.f875b.setMeasuredDimension(g(i4, F, recyclerView.getMinimumWidth()), g(i5, D, this.f875b.getMinimumHeight()));
    }

    public o0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o0 ? new o0((o0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o0((ViewGroup.MarginLayoutParams) layoutParams) : new o0(layoutParams);
    }

    public final void t0(int i4, int i5) {
        int v3 = v();
        if (v3 == 0) {
            this.f875b.n(i4, i5);
            return;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < v3; i10++) {
            View u3 = u(i10);
            Rect rect = this.f875b.f645n;
            y(u3, rect);
            int i11 = rect.left;
            if (i11 < i9) {
                i9 = i11;
            }
            int i12 = rect.right;
            if (i12 > i6) {
                i6 = i12;
            }
            int i13 = rect.top;
            if (i13 < i7) {
                i7 = i13;
            }
            int i14 = rect.bottom;
            if (i14 > i8) {
                i8 = i14;
            }
        }
        this.f875b.f645n.set(i9, i7, i6, i8);
        s0(this.f875b.f645n, i4, i5);
    }

    public final View u(int i4) {
        androidx.emoji2.text.s sVar = this.f874a;
        if (sVar != null) {
            return sVar.f(i4);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f875b = null;
            this.f874a = null;
            this.f884n = 0;
            this.f885o = 0;
        } else {
            this.f875b = recyclerView;
            this.f874a = recyclerView.f637j;
            this.f884n = recyclerView.getWidth();
            this.f885o = recyclerView.getHeight();
        }
        this.f882l = 1073741824;
        this.f883m = 1073741824;
    }

    public final int v() {
        androidx.emoji2.text.s sVar = this.f874a;
        if (sVar != null) {
            return sVar.g();
        }
        return 0;
    }

    public final boolean v0(View view, int i4, int i5, o0 o0Var) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) o0Var).width) && M(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) o0Var).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(t0 t0Var, z0 z0Var) {
        return -1;
    }

    public final boolean x0(View view, int i4, int i5, o0 o0Var) {
        return (this.h && M(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) o0Var).width) && M(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) o0Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.D0;
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect2 = o0Var.f890b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i4);

    public final void z0(x xVar) {
        x xVar2 = this.f877e;
        if (xVar2 != null && xVar != xVar2 && xVar2.f939e) {
            xVar2.i();
        }
        this.f877e = xVar;
        RecyclerView recyclerView = this.f875b;
        b1 b1Var = recyclerView.f634h0;
        b1Var.f742l.removeCallbacks(b1Var);
        b1Var.h.abortAnimation();
        if (xVar.h) {
            Log.w("RecyclerView", "An instance of " + xVar.getClass().getSimpleName() + " was started more than once. Each instance of" + xVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        xVar.f937b = recyclerView;
        xVar.c = this;
        int i4 = xVar.f936a;
        if (i4 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f640k0.f956a = i4;
        xVar.f939e = true;
        xVar.f938d = true;
        xVar.f940f = recyclerView.f653r.q(i4);
        xVar.f937b.f634h0.a();
        xVar.h = true;
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i4) {
    }

    public void Q() {
    }

    public void Y() {
    }

    public void X(int i4, int i5) {
    }

    public void Z(int i4, int i5) {
    }

    public void a0(int i4, int i5) {
    }

    public void b0(int i4, int i5) {
    }

    public void i(int i4, o oVar) {
    }

    public void W(t0 t0Var, z0 z0Var, View view, l0.e eVar) {
    }

    public void h(int i4, int i5, z0 z0Var, o oVar) {
    }
}
