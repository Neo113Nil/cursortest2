package f1;

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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.t f1444a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1445b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.emoji2.text.q f1446c;
    public final androidx.emoji2.text.q d;

    /* renamed from: e, reason: collision with root package name */
    public w f1447e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1448f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1449g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1450h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f1451j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1452k;

    /* renamed from: l, reason: collision with root package name */
    public int f1453l;

    /* renamed from: m, reason: collision with root package name */
    public int f1454m;

    /* renamed from: n, reason: collision with root package name */
    public int f1455n;

    /* renamed from: o, reason: collision with root package name */
    public int f1456o;

    public m0() {
        k0 k0Var = new k0(this, 0);
        k0 k0Var2 = new k0(this, 1);
        this.f1446c = new androidx.emoji2.text.q(k0Var);
        this.d = new androidx.emoji2.text.q(k0Var2);
        this.f1448f = false;
        this.f1449g = false;
        this.f1450h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((n0) view.getLayoutParams()).f1461b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((n0) view.getLayoutParams()).f1460a.b();
    }

    public static l0 I(Context context, AttributeSet attributeSet, int i, int i4) {
        l0 l0Var = new l0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.a.f1170a, i, i4);
        l0Var.f1414a = obtainStyledAttributes.getInt(0, 1);
        l0Var.f1415b = obtainStyledAttributes.getInt(10, 1);
        l0Var.f1416c = obtainStyledAttributes.getBoolean(9, false);
        l0Var.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return l0Var;
    }

    public static boolean M(int i, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (i5 > 0 && i != i5) {
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

    public static void N(View view, int i, int i4, int i5, int i6) {
        n0 n0Var = (n0) view.getLayoutParams();
        Rect rect = n0Var.f1461b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) n0Var).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) n0Var).topMargin, (i5 - rect.right) - ((ViewGroup.MarginLayoutParams) n0Var).rightMargin, (i6 - rect.bottom) - ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin);
    }

    public static int g(int i, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i5) : size : Math.min(size, Math.max(i4, i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(boolean z3, int i, int i4, int i5, int i6) {
        int max = Math.max(0, i - i5);
        if (z3) {
            if (i6 < 0) {
                if (i6 == -1) {
                    if (i4 != Integer.MIN_VALUE) {
                        if (i4 != 0) {
                        }
                    }
                    i6 = max;
                }
                i4 = 0;
                i6 = 0;
            }
            i4 = 1073741824;
        } else {
            if (i6 < 0) {
                if (i6 != -1) {
                    if (i6 == -2) {
                        if (i4 == Integer.MIN_VALUE || i4 == 1073741824) {
                            i6 = max;
                            i4 = Integer.MIN_VALUE;
                        } else {
                            i6 = max;
                            i4 = 0;
                        }
                    }
                    i4 = 0;
                    i6 = 0;
                }
                i6 = max;
            }
            i4 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i6, i4);
    }

    public static int z(View view) {
        Rect rect = ((n0) view.getLayoutParams()).f1461b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.f1445b;
        d0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f1445b;
        WeakHashMap weakHashMap = n0.l0.f2757a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(s0 s0Var, y0 y0Var) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((n0) view.getLayoutParams()).f1461b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f1445b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f1445b.f681p;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView != null) {
            int l4 = recyclerView.f669j.l();
            for (int i4 = 0; i4 < l4; i4++) {
                recyclerView.f669j.k(i4).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView != null) {
            int l4 = recyclerView.f669j.l();
            for (int i4 = 0; i4 < l4; i4++) {
                recyclerView.f669j.k(i4).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, s0 s0Var, y0 y0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1445b;
        s0 s0Var = recyclerView.f665g;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1445b.canScrollVertically(-1) && !this.f1445b.canScrollHorizontally(-1) && !this.f1445b.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        d0 d0Var = this.f1445b.f683q;
        if (d0Var != null) {
            accessibilityEvent.setItemCount(d0Var.a());
        }
    }

    public final void V(View view, o0.e eVar) {
        b1 I = RecyclerView.I(view);
        if (I == null || I.h()) {
            return;
        }
        androidx.emoji2.text.t tVar = this.f1444a;
        if (((ArrayList) tVar.d).contains(I.f1309a)) {
            return;
        }
        RecyclerView recyclerView = this.f1445b;
        W(recyclerView.f665g, recyclerView.f672k0, view, eVar);
    }

    public final void b(View view, int i, boolean z3) {
        b1 I = RecyclerView.I(view);
        if (z3 || I.h()) {
            q.j jVar = (q.j) this.f1445b.f671k.f346g;
            l1 l1Var = (l1) jVar.get(I);
            if (l1Var == null) {
                l1Var = l1.a();
                jVar.put(I, l1Var);
            }
            l1Var.f1417a |= 1;
        } else {
            this.f1445b.f671k.F(I);
        }
        n0 n0Var = (n0) view.getLayoutParams();
        if (I.p() || I.i()) {
            if (I.i()) {
                I.f1320n.k(I);
            } else {
                I.f1316j &= -33;
            }
            this.f1444a.g(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f1445b) {
                androidx.emoji2.text.t tVar = this.f1444a;
                c cVar = (c) tVar.f356c;
                int indexOfChild = ((c0) tVar.f355b).f1328a.indexOfChild(view);
                int b4 = (indexOfChild == -1 || cVar.d(indexOfChild)) ? -1 : indexOfChild - cVar.b(indexOfChild);
                if (i == -1) {
                    i = this.f1444a.l();
                }
                if (b4 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1445b.indexOfChild(view) + this.f1445b.y());
                }
                if (b4 != i) {
                    m0 m0Var = this.f1445b.f685r;
                    View u3 = m0Var.u(b4);
                    if (u3 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b4 + m0Var.f1445b.toString());
                    }
                    m0Var.u(b4);
                    m0Var.f1444a.i(b4);
                    n0 n0Var2 = (n0) u3.getLayoutParams();
                    b1 I2 = RecyclerView.I(u3);
                    if (I2.h()) {
                        q.j jVar2 = (q.j) m0Var.f1445b.f671k.f346g;
                        l1 l1Var2 = (l1) jVar2.get(I2);
                        if (l1Var2 == null) {
                            l1Var2 = l1.a();
                            jVar2.put(I2, l1Var2);
                        }
                        l1Var2.f1417a = 1 | l1Var2.f1417a;
                    } else {
                        m0Var.f1445b.f671k.F(I2);
                    }
                    m0Var.f1444a.g(u3, i, n0Var2, I2.h());
                }
            } else {
                this.f1444a.f(view, i, false);
                n0Var.f1462c = true;
                w wVar = this.f1447e;
                if (wVar != null && wVar.f1518e) {
                    wVar.f1516b.getClass();
                    b1 I3 = RecyclerView.I(view);
                    if ((I3 != null ? I3.b() : -1) == wVar.f1515a) {
                        wVar.f1519f = view;
                    }
                }
            }
        }
        if (n0Var.d) {
            I.f1309a.invalidate();
            n0Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(s0 s0Var, y0 y0Var);

    public abstract boolean d();

    public abstract void d0(y0 y0Var);

    public abstract boolean e();

    public boolean f(n0 n0Var) {
        return n0Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(s0 s0Var) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            if (!RecyclerView.I(u(v3)).o()) {
                View u3 = u(v3);
                k0(v3);
                s0Var.g(u3);
            }
        }
    }

    public final void i0(s0 s0Var) {
        ArrayList arrayList = s0Var.f1490a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((b1) arrayList.get(i)).f1309a;
            b1 I = RecyclerView.I(view);
            if (!I.o()) {
                I.n(false);
                if (I.j()) {
                    this.f1445b.removeDetachedView(view, false);
                }
                i0 i0Var = this.f1445b.P;
                if (i0Var != null) {
                    i0Var.d(I);
                }
                I.n(true);
                b1 I2 = RecyclerView.I(view);
                I2.f1320n = null;
                I2.f1321o = false;
                I2.f1316j &= -33;
                s0Var.h(I2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = s0Var.f1491b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f1445b.invalidate();
        }
    }

    public abstract int j(y0 y0Var);

    public final void j0(View view, s0 s0Var) {
        androidx.emoji2.text.t tVar = this.f1444a;
        c0 c0Var = (c0) tVar.f355b;
        int indexOfChild = c0Var.f1328a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c) tVar.f356c).f(indexOfChild)) {
                tVar.A(view);
            }
            c0Var.h(indexOfChild);
        }
        s0Var.g(view);
    }

    public abstract int k(y0 y0Var);

    public final void k0(int i) {
        if (u(i) != null) {
            androidx.emoji2.text.t tVar = this.f1444a;
            int q3 = tVar.q(i);
            c0 c0Var = (c0) tVar.f355b;
            View childAt = c0Var.f1328a.getChildAt(q3);
            if (childAt == null) {
                return;
            }
            if (((c) tVar.f356c).f(q3)) {
                tVar.A(childAt);
            }
            c0Var.h(q3);
        }
    }

    public abstract int l(y0 y0Var);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        int E = E();
        int G = G();
        int F = this.f1455n - F();
        int D = this.f1456o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E;
        int min = Math.min(0, i);
        int i4 = top - G;
        int min2 = Math.min(0, i4);
        int i5 = width - F;
        int max = Math.max(0, i5);
        int max2 = Math.max(0, height - D);
        if (C() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i5);
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        int[] iArr = {max, min2};
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E2 = E();
                int G2 = G();
                int F2 = this.f1455n - F();
                int D2 = this.f1456o - D();
                Rect rect2 = this.f1445b.f677n;
                y(focusedChild, rect2);
                if (rect2.left - i6 < F2) {
                    if (rect2.right - i6 > E2) {
                        if (rect2.top - i7 < D2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i6 != 0 || i7 != 0) {
            if (z3) {
                recyclerView.scrollBy(i6, i7);
                return true;
            }
            recyclerView.a0(i6, i7, false);
            return true;
        }
        return false;
    }

    public abstract int m(y0 y0Var);

    public final void m0() {
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(y0 y0Var);

    public abstract int n0(int i, s0 s0Var, y0 y0Var);

    public abstract int o(y0 y0Var);

    public abstract void o0(int i);

    public final void p(s0 s0Var) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            b1 I = RecyclerView.I(u3);
            if (!I.o()) {
                if (!I.f() || I.h() || this.f1445b.f683q.f1334b) {
                    u(v3);
                    this.f1444a.i(v3);
                    s0Var.i(u3);
                    this.f1445b.f671k.F(I);
                } else {
                    k0(v3);
                    s0Var.h(I);
                }
            }
        }
    }

    public abstract int p0(int i, s0 s0Var, y0 y0Var);

    public View q(int i) {
        int v3 = v();
        for (int i4 = 0; i4 < v3; i4++) {
            View u3 = u(i4);
            b1 I = RecyclerView.I(u3);
            if (I != null && I.b() == i && !I.o() && (this.f1445b.f672k0.f1541g || !I.h())) {
                return u3;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract n0 r();

    public final void r0(int i, int i4) {
        this.f1455n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f1453l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.D0;
        }
        this.f1456o = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f1454m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.D0;
        }
    }

    public n0 s(Context context, AttributeSet attributeSet) {
        return new n0(context, attributeSet);
    }

    public void s0(Rect rect, int i, int i4) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.f1445b;
        WeakHashMap weakHashMap = n0.l0.f2757a;
        this.f1445b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i4, D, this.f1445b.getMinimumHeight()));
    }

    public n0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof n0 ? new n0((n0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n0((ViewGroup.MarginLayoutParams) layoutParams) : new n0(layoutParams);
    }

    public final void t0(int i, int i4) {
        int v3 = v();
        if (v3 == 0) {
            this.f1445b.n(i, i4);
            return;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < v3; i9++) {
            View u3 = u(i9);
            Rect rect = this.f1445b.f677n;
            y(u3, rect);
            int i10 = rect.left;
            if (i10 < i8) {
                i8 = i10;
            }
            int i11 = rect.right;
            if (i11 > i5) {
                i5 = i11;
            }
            int i12 = rect.top;
            if (i12 < i6) {
                i6 = i12;
            }
            int i13 = rect.bottom;
            if (i13 > i7) {
                i7 = i13;
            }
        }
        this.f1445b.f677n.set(i8, i6, i5, i7);
        s0(this.f1445b.f677n, i, i4);
    }

    public final View u(int i) {
        androidx.emoji2.text.t tVar = this.f1444a;
        if (tVar != null) {
            return tVar.k(i);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1445b = null;
            this.f1444a = null;
            this.f1455n = 0;
            this.f1456o = 0;
        } else {
            this.f1445b = recyclerView;
            this.f1444a = recyclerView.f669j;
            this.f1455n = recyclerView.getWidth();
            this.f1456o = recyclerView.getHeight();
        }
        this.f1453l = 1073741824;
        this.f1454m = 1073741824;
    }

    public final int v() {
        androidx.emoji2.text.t tVar = this.f1444a;
        if (tVar != null) {
            return tVar.l();
        }
        return 0;
    }

    public final boolean v0(View view, int i, int i4, n0 n0Var) {
        return (!view.isLayoutRequested() && this.f1450h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) n0Var).width) && M(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) n0Var).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(s0 s0Var, y0 y0Var) {
        return -1;
    }

    public final boolean x0(View view, int i, int i4, n0 n0Var) {
        return (this.f1450h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) n0Var).width) && M(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) n0Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.D0;
        n0 n0Var = (n0) view.getLayoutParams();
        Rect rect2 = n0Var.f1461b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) n0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) n0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) n0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i);

    public final void z0(w wVar) {
        w wVar2 = this.f1447e;
        if (wVar2 != null && wVar != wVar2 && wVar2.f1518e) {
            wVar2.i();
        }
        this.f1447e = wVar;
        RecyclerView recyclerView = this.f1445b;
        a1 a1Var = recyclerView.f668h0;
        a1Var.f1301l.removeCallbacks(a1Var);
        a1Var.f1298h.abortAnimation();
        if (wVar.f1521h) {
            Log.w("RecyclerView", "An instance of " + wVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wVar.f1516b = recyclerView;
        wVar.f1517c = this;
        int i = wVar.f1515a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f672k0.f1536a = i;
        wVar.f1518e = true;
        wVar.d = true;
        wVar.f1519f = recyclerView.f685r.q(i);
        wVar.f1516b.f668h0.a();
        wVar.f1521h = true;
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

    public void X(int i, int i4) {
    }

    public void Z(int i, int i4) {
    }

    public void a0(int i, int i4) {
    }

    public void b0(int i, int i4) {
    }

    public void i(int i, n nVar) {
    }

    public void W(s0 s0Var, y0 y0Var, View view, o0.e eVar) {
    }

    public void h(int i, int i4, y0 y0Var, n nVar) {
    }
}
