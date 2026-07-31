package w4;

import a0.g1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import u.i1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public g1 f7899a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f7900b;

    /* renamed from: c, reason: collision with root package name */
    public final a0.a0 f7901c;

    /* renamed from: d, reason: collision with root package name */
    public final a0.a0 f7902d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7903e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7904f;

    /* renamed from: g, reason: collision with root package name */
    public int f7905g;

    /* renamed from: h, reason: collision with root package name */
    public int f7906h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f7907j;

    public d0() {
        c0 c0Var = new c0(this, 0);
        c0 c0Var2 = new c0(this, 1);
        this.f7901c = new a0.a0(c0Var);
        this.f7902d = new a0.a0(c0Var2);
        this.f7903e = false;
        this.f7904f = true;
    }

    public static int A(View view) {
        ((e0) view.getLayoutParams()).getClass();
        throw null;
    }

    public static o B(Context context, AttributeSet attributeSet, int i, int i8) {
        o oVar = new o(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v4.a.f7479a, i, i8);
        oVar.f7990b = obtainStyledAttributes.getInt(0, 1);
        oVar.f7991c = obtainStyledAttributes.getInt(10, 1);
        oVar.f7992d = obtainStyledAttributes.getBoolean(9, false);
        oVar.f7993e = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return oVar;
    }

    public static boolean F(int i, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (i9 > 0 && i != i9) {
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

    public static void G(View view, int i, int i8, int i9, int i10) {
        e0 e0Var = (e0) view.getLayoutParams();
        Rect rect = e0Var.f7908a;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) e0Var).leftMargin, i8 + rect.top + ((ViewGroup.MarginLayoutParams) e0Var).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) e0Var).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) e0Var).bottomMargin);
    }

    public static int f(int i, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i8, i9) : size : Math.min(size, Math.max(i8, i9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int r(boolean z3, int i, int i8, int i9, int i10) {
        int max = Math.max(0, i - i9);
        if (z3) {
            if (i10 < 0) {
                if (i10 == -1) {
                    if (i8 != Integer.MIN_VALUE) {
                        if (i8 != 0) {
                        }
                    }
                    i10 = max;
                }
                i8 = 0;
                i10 = 0;
            }
            i8 = 1073741824;
        } else {
            if (i10 < 0) {
                if (i10 != -1) {
                    if (i10 == -2) {
                        if (i8 == Integer.MIN_VALUE || i8 == 1073741824) {
                            i10 = max;
                            i8 = Integer.MIN_VALUE;
                        } else {
                            i10 = max;
                            i8 = 0;
                        }
                    }
                    i8 = 0;
                    i10 = 0;
                }
                i10 = max;
            }
            i8 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i10, i8);
    }

    public static int u(View view) {
        Rect rect = ((e0) view.getLayoutParams()).f7908a;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int v(View view) {
        Rect rect = ((e0) view.getLayoutParams()).f7908a;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int C(j0 j0Var, m0 m0Var) {
        return -1;
    }

    public final void D(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((e0) view.getLayoutParams()).f7908a;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f7900b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f7900b.f926l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean E();

    public void H(int i) {
        RecyclerView recyclerView = this.f7900b;
        if (recyclerView != null) {
            int o2 = recyclerView.f917g.o();
            for (int i8 = 0; i8 < o2; i8++) {
                recyclerView.f917g.n(i8).offsetLeftAndRight(i);
            }
        }
    }

    public void I(int i) {
        RecyclerView recyclerView = this.f7900b;
        if (recyclerView != null) {
            int o2 = recyclerView.f917g.o();
            for (int i8 = 0; i8 < o2; i8++) {
                recyclerView.f917g.n(i8).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void L(RecyclerView recyclerView);

    public void M(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7900b;
        j0 j0Var = recyclerView.f911d;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7900b.canScrollVertically(-1) && !this.f7900b.canScrollHorizontally(-1) && !this.f7900b.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        this.f7900b.getClass();
    }

    public final void N(View view, r3.f fVar) {
        RecyclerView.s(view);
    }

    public Parcelable P() {
        return null;
    }

    public final void R(j0 j0Var) {
        for (int q4 = q() - 1; q4 >= 0; q4--) {
            if (!RecyclerView.s(p(q4)).n()) {
                View p7 = p(q4);
                U(q4);
                j0Var.g(p7);
            }
        }
    }

    public final void S(j0 j0Var) {
        ArrayList arrayList = j0Var.f7953a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            ((p0) arrayList.get(i)).getClass();
            p0 s5 = RecyclerView.s(null);
            if (!s5.n()) {
                s5.m(false);
                if (s5.j()) {
                    this.f7900b.removeDetachedView(null, false);
                }
                a0 a0Var = this.f7900b.I;
                if (a0Var != null) {
                    a0Var.b(s5);
                }
                s5.m(true);
                p0 s7 = RecyclerView.s(null);
                s7.f8006c = null;
                s7.f8007d = false;
                s7.f8005b &= -33;
                j0Var.h(s7);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = j0Var.f7954b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f7900b.invalidate();
        }
    }

    public final void T(View view, j0 j0Var) {
        g1 g1Var = this.f7899a;
        w wVar = (w) g1Var.f84b;
        int indexOfChild = wVar.f8055a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((i1) g1Var.f85c).h(indexOfChild)) {
                g1Var.O(view);
            }
            wVar.a(indexOfChild);
        }
        j0Var.g(view);
    }

    public final void U(int i) {
        if (p(i) != null) {
            g1 g1Var = this.f7899a;
            int s5 = g1Var.s(i);
            w wVar = (w) g1Var.f84b;
            View childAt = wVar.f8055a.getChildAt(s5);
            if (childAt == null) {
                return;
            }
            if (((i1) g1Var.f85c).h(s5)) {
                g1Var.O(childAt);
            }
            wVar.a(s5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean V(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z7) {
        int x7 = x();
        int z8 = z();
        int y7 = this.i - y();
        int w7 = this.f7907j - w();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - x7;
        int min = Math.min(0, i);
        int i8 = top - z8;
        int min2 = Math.min(0, i8);
        int i9 = width - y7;
        int max = Math.max(0, i9);
        int max2 = Math.max(0, height - w7);
        RecyclerView recyclerView2 = this.f7900b;
        Field field = q3.k0.f6120a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i9);
        }
        if (min2 == 0) {
            min2 = Math.min(i8, max2);
        }
        int[] iArr = {max, min2};
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (z7) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int x8 = x();
                int z9 = z();
                int y8 = this.i - y();
                int w8 = this.f7907j - w();
                Rect rect2 = this.f7900b.f922j;
                t(focusedChild, rect2);
                if (rect2.left - i10 < y8) {
                    if (rect2.right - i10 > x8) {
                        if (rect2.top - i11 < w8) {
                        }
                    }
                }
            }
            return false;
        }
        if (i10 != 0 || i11 != 0) {
            if (z3) {
                recyclerView.scrollBy(i10, i11);
                return true;
            }
            recyclerView.E(i10, i11, false);
            return true;
        }
        return false;
    }

    public final void W() {
        RecyclerView recyclerView = this.f7900b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int X(int i, j0 j0Var, m0 m0Var);

    public abstract int Y(int i, j0 j0Var, m0 m0Var);

    public final void Z(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7900b = null;
            this.f7899a = null;
            this.i = 0;
            this.f7907j = 0;
        } else {
            this.f7900b = recyclerView;
            this.f7899a = recyclerView.f917g;
            this.i = recyclerView.getWidth();
            this.f7907j = recyclerView.getHeight();
        }
        this.f7905g = 1073741824;
        this.f7906h = 1073741824;
    }

    public final void a(View view, int i, boolean z3) {
        p0 s5 = RecyclerView.s(view);
        if (z3 || s5.h()) {
            o.t0 t0Var = (o.t0) this.f7900b.f919h.f11e;
            w0 w0Var = (w0) t0Var.get(s5);
            if (w0Var == null) {
                w0Var = w0.a();
                t0Var.put(s5, w0Var);
            }
            w0Var.f8057a |= 1;
        } else {
            this.f7900b.f919h.t(s5);
        }
        e0 e0Var = (e0) view.getLayoutParams();
        if (s5.o() || s5.i()) {
            if (s5.i()) {
                s5.f8006c.j(s5);
            } else {
                s5.f8005b &= -33;
            }
            this.f7899a.g(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f7900b) {
            g1 g1Var = this.f7899a;
            i1 i1Var = (i1) g1Var.f85c;
            int indexOfChild = ((w) g1Var.f84b).f8055a.indexOfChild(view);
            int c8 = (indexOfChild == -1 || i1Var.e(indexOfChild)) ? -1 : indexOfChild - i1Var.c(indexOfChild);
            if (i == -1) {
                i = this.f7899a.o();
            }
            if (c8 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f7900b.indexOfChild(view) + this.f7900b.p());
            }
            if (c8 != i) {
                d0 d0Var = this.f7900b.f928m;
                View p7 = d0Var.p(c8);
                if (p7 == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c8 + d0Var.f7900b.toString());
                }
                d0Var.p(c8);
                d0Var.f7899a.j(c8);
                e0 e0Var2 = (e0) p7.getLayoutParams();
                p0 s7 = RecyclerView.s(p7);
                if (s7.h()) {
                    o.t0 t0Var2 = (o.t0) d0Var.f7900b.f919h.f11e;
                    w0 w0Var2 = (w0) t0Var2.get(s7);
                    if (w0Var2 == null) {
                        w0Var2 = w0.a();
                        t0Var2.put(s7, w0Var2);
                    }
                    w0Var2.f8057a = 1 | w0Var2.f8057a;
                } else {
                    d0Var.f7900b.f919h.t(s7);
                }
                d0Var.f7899a.g(p7, i, e0Var2, s7.h());
            }
        } else {
            g1 g1Var2 = this.f7899a;
            RecyclerView recyclerView = ((w) g1Var2.f84b).f8055a;
            int childCount = i < 0 ? recyclerView.getChildCount() : g1Var2.s(i);
            ((i1) g1Var2.f85c).f(childCount, false);
            recyclerView.addView(view, childCount);
            RecyclerView.s(view);
            e0Var.f7909b = true;
        }
        if (e0Var.f7910c) {
            throw null;
        }
    }

    public final boolean a0(View view, int i, int i8, e0 e0Var) {
        return (!view.isLayoutRequested() && this.f7904f && F(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) e0Var).width) && F(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) e0Var).height)) ? false : true;
    }

    public void b(String str) {
        RecyclerView recyclerView = this.f7900b;
        if (recyclerView != null) {
            recyclerView.d(str);
        }
    }

    public final boolean b0(View view, int i, int i8, e0 e0Var) {
        return (this.f7904f && F(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) e0Var).width) && F(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) e0Var).height)) ? false : true;
    }

    public abstract boolean c();

    public abstract boolean d();

    public boolean e(e0 e0Var) {
        return e0Var != null;
    }

    public abstract int g(m0 m0Var);

    public abstract int h(m0 m0Var);

    public abstract int i(m0 m0Var);

    public abstract int j(m0 m0Var);

    public abstract int k(m0 m0Var);

    public abstract int l(m0 m0Var);

    public abstract e0 m();

    public e0 n(Context context, AttributeSet attributeSet) {
        return new e0(context, attributeSet);
    }

    public e0 o(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e0 ? new e0((e0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e0((ViewGroup.MarginLayoutParams) layoutParams) : new e0(layoutParams);
    }

    public final View p(int i) {
        g1 g1Var = this.f7899a;
        if (g1Var != null) {
            return g1Var.n(i);
        }
        return null;
    }

    public final int q() {
        g1 g1Var = this.f7899a;
        if (g1Var != null) {
            return g1Var.o();
        }
        return 0;
    }

    public int s(j0 j0Var, m0 m0Var) {
        return -1;
    }

    public void t(View view, Rect rect) {
        int[] iArr = RecyclerView.f905n0;
        e0 e0Var = (e0) view.getLayoutParams();
        Rect rect2 = e0Var.f7908a;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) e0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) e0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) e0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) e0Var).bottomMargin);
    }

    public final int w() {
        RecyclerView recyclerView = this.f7900b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int x() {
        RecyclerView recyclerView = this.f7900b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int y() {
        RecyclerView recyclerView = this.f7900b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.f7900b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public void J() {
    }

    public void K(RecyclerView recyclerView) {
    }

    public void Q(int i) {
    }

    public void O(j0 j0Var, m0 m0Var, View view, r3.f fVar) {
    }
}
