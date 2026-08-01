package h0;

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

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public A1.j f2379a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2380b;

    /* renamed from: c, reason: collision with root package name */
    public final D.j f2381c;
    public final D.j d;

    /* renamed from: e, reason: collision with root package name */
    public C0134v f2382e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2383f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2384g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f2385j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2386k;

    /* renamed from: l, reason: collision with root package name */
    public int f2387l;

    /* renamed from: m, reason: collision with root package name */
    public int f2388m;

    /* renamed from: n, reason: collision with root package name */
    public int f2389n;

    /* renamed from: o, reason: collision with root package name */
    public int f2390o;

    public I() {
        G g2 = new G(this, 0);
        G g3 = new G(this, 1);
        this.f2381c = new D.j(g2);
        this.d = new D.j(g3);
        this.f2383f = false;
        this.f2384g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((J) view.getLayoutParams()).f2392b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((J) view.getLayoutParams()).f2391a.b();
    }

    public static H I(Context context, AttributeSet attributeSet, int i, int i2) {
        H h = new H();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.a.f2358a, i, i2);
        h.f2376a = obtainStyledAttributes.getInt(0, 1);
        h.f2377b = obtainStyledAttributes.getInt(10, 1);
        h.f2378c = obtainStyledAttributes.getBoolean(9, false);
        h.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return h;
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
        J j2 = (J) view.getLayoutParams();
        Rect rect = j2.f2392b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) j2).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) j2).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) j2).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) j2).bottomMargin);
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
    public static int w(boolean z2, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z2) {
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
        Rect rect = ((J) view.getLayoutParams()).f2392b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2380b;
        AbstractC0113A adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2380b;
        WeakHashMap weakHashMap = M.Q.f513a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(O o2, U u2) {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView == null || recyclerView.f1658k == null || !e()) {
            return 1;
        }
        return this.f2380b.f1658k.a();
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((J) view.getLayoutParams()).f2392b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2380b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2380b.f1656j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView != null) {
            int h = recyclerView.f1648e.h();
            for (int i2 = 0; i2 < h; i2++) {
                recyclerView.f1648e.g(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView != null) {
            int h = recyclerView.f1648e.h();
            for (int i2 = 0; i2 < h; i2++) {
                recyclerView.f1648e.g(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q(RecyclerView recyclerView) {
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, O o2, U u2);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2380b;
        O o2 = recyclerView.f1643b;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2380b.canScrollVertically(-1) && !this.f2380b.canScrollHorizontally(-1) && !this.f2380b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0113A abstractC0113A = this.f2380b.f1658k;
        if (abstractC0113A != null) {
            accessibilityEvent.setItemCount(abstractC0113A.a());
        }
    }

    public final void U(View view, N.j jVar) {
        X I2 = RecyclerView.I(view);
        if (I2 == null || I2.i() || ((ArrayList) this.f2379a.d).contains(I2.f2430a)) {
            return;
        }
        RecyclerView recyclerView = this.f2380b;
        V(recyclerView.f1643b, recyclerView.f1646c0, view, jVar);
    }

    public void V(O o2, U u2, View view, N.j jVar) {
        jVar.h(N.i.a(false, e() ? H(view) : 0, 1, d() ? H(view) : 0, 1));
    }

    public void W(int i, int i2) {
    }

    public void X() {
    }

    public void Y(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, int i, boolean z2) {
        int b2;
        X I2 = RecyclerView.I(view);
        if (z2 || I2.i()) {
            q.k kVar = (q.k) this.f2380b.f1650f.f133b;
            i0 i0Var = (i0) kVar.getOrDefault(I2, null);
            if (i0Var == null) {
                i0Var = i0.a();
                kVar.put(I2, i0Var);
            }
            i0Var.f2521a |= 1;
        } else {
            this.f2380b.f1650f.G(I2);
        }
        J j2 = (J) view.getLayoutParams();
        if (I2.q() || I2.j()) {
            if (I2.j()) {
                I2.f2440n.j(I2);
            } else {
                I2.f2436j &= -33;
            }
            this.f2379a.c(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2380b) {
                A1.j jVar = this.f2379a;
                int indexOfChild = ((C0138z) jVar.f80b).f2611a.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0115b c0115b = (C0115b) jVar.f81c;
                    if (!c0115b.d(indexOfChild)) {
                        b2 = indexOfChild - c0115b.b(indexOfChild);
                        if (i == -1) {
                            i = this.f2379a.h();
                        }
                        if (b2 != -1) {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2380b.indexOfChild(view) + this.f2380b.y());
                        }
                        if (b2 != i) {
                            I i2 = this.f2380b.f1660l;
                            View u2 = i2.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + i2.f2380b.toString());
                            }
                            i2.u(b2);
                            i2.f2379a.f(b2);
                            J j3 = (J) u2.getLayoutParams();
                            X I3 = RecyclerView.I(u2);
                            if (I3.i()) {
                                q.k kVar2 = (q.k) i2.f2380b.f1650f.f133b;
                                i0 i0Var2 = (i0) kVar2.getOrDefault(I3, null);
                                if (i0Var2 == null) {
                                    i0Var2 = i0.a();
                                    kVar2.put(I3, i0Var2);
                                }
                                i0Var2.f2521a = 1 | i0Var2.f2521a;
                            } else {
                                i2.f2380b.f1650f.G(I3);
                            }
                            i2.f2379a.c(u2, i, j3, I3.i());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f2379a.a(view, i, false);
                j2.f2393c = true;
                C0134v c0134v = this.f2382e;
                if (c0134v != null && c0134v.f2596e) {
                    c0134v.f2594b.getClass();
                    X I4 = RecyclerView.I(view);
                    if ((I4 != null ? I4.b() : -1) == c0134v.f2593a) {
                        c0134v.f2597f = view;
                    }
                }
            }
        }
        if (j2.d) {
            I2.f2430a.invalidate();
            j2.d = false;
        }
    }

    public abstract void b0(O o2, U u2);

    public void c(String str) {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(U u2);

    public abstract boolean d();

    public void d0(Parcelable parcelable) {
    }

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(J j2) {
        return j2 != null;
    }

    public void f0(int i) {
    }

    public final void g0(O o2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.I(u(v2)).p()) {
                View u2 = u(v2);
                j0(v2);
                o2.f(u2);
            }
        }
    }

    public void h(int i, int i2, U u2, C0126m c0126m) {
    }

    public final void h0(O o2) {
        ArrayList arrayList;
        int size = o2.f2399a.size();
        int i = size - 1;
        while (true) {
            arrayList = o2.f2399a;
            if (i < 0) {
                break;
            }
            View view = ((X) arrayList.get(i)).f2430a;
            X I2 = RecyclerView.I(view);
            if (!I2.p()) {
                I2.o(false);
                if (I2.k()) {
                    this.f2380b.removeDetachedView(view, false);
                }
                E e2 = this.f2380b.H;
                if (e2 != null) {
                    e2.d(I2);
                }
                I2.o(true);
                X I3 = RecyclerView.I(view);
                I3.f2440n = null;
                I3.f2441o = false;
                I3.f2436j &= -33;
                o2.g(I3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = o2.f2400b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2380b.invalidate();
        }
    }

    public void i(int i, C0126m c0126m) {
    }

    public final void i0(View view, O o2) {
        A1.j jVar = this.f2379a;
        C0138z c0138z = (C0138z) jVar.f80b;
        int indexOfChild = c0138z.f2611a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0115b) jVar.f81c).g(indexOfChild)) {
                jVar.x(view);
            }
            c0138z.h(indexOfChild);
        }
        o2.f(view);
    }

    public abstract int j(U u2);

    public final void j0(int i) {
        if (u(i) != null) {
            A1.j jVar = this.f2379a;
            int m2 = jVar.m(i);
            C0138z c0138z = (C0138z) jVar.f80b;
            View childAt = c0138z.f2611a.getChildAt(m2);
            if (childAt == null) {
                return;
            }
            if (((C0115b) jVar.f81c).g(m2)) {
                jVar.x(childAt);
            }
            c0138z.h(m2);
        }
    }

    public abstract int k(U u2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int E2 = E();
        int G2 = G();
        int F2 = this.f2389n - F();
        int D2 = this.f2390o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E2;
        int min = Math.min(0, i);
        int i2 = top - G2;
        int min2 = Math.min(0, i2);
        int i3 = width - F2;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - D2);
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
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E3 = E();
                int G3 = G();
                int F3 = this.f2389n - F();
                int D3 = this.f2390o - D();
                Rect rect2 = this.f2380b.h;
                y(focusedChild, rect2);
                if (rect2.left - i4 < F3) {
                    if (rect2.right - i4 > E3) {
                        if (rect2.top - i5 < D3) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z2) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.Z(i4, i5, false);
            }
            return true;
        }
        return false;
    }

    public abstract int l(U u2);

    public final void l0() {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(U u2);

    public abstract int m0(int i, O o2, U u2);

    public abstract int n(U u2);

    public abstract void n0(int i);

    public abstract int o(U u2);

    public abstract int o0(int i, O o2, U u2);

    public final void p(O o2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            X I2 = RecyclerView.I(u2);
            if (!I2.p()) {
                if (!I2.g() || I2.i() || this.f2380b.f1658k.f2368b) {
                    u(v2);
                    this.f2379a.f(v2);
                    o2.h(u2);
                    this.f2380b.f1650f.G(I2);
                } else {
                    j0(v2);
                    o2.g(I2);
                }
            }
        }
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public View q(int i) {
        int v2 = v();
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            X I2 = RecyclerView.I(u2);
            if (I2 != null && I2.b() == i && !I2.p() && (this.f2380b.f1646c0.f2417g || !I2.i())) {
                return u2;
            }
        }
        return null;
    }

    public final void q0(int i, int i2) {
        this.f2389n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2387l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f1616s0;
        }
        this.f2390o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2388m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f1616s0;
        }
    }

    public abstract J r();

    public void r0(Rect rect, int i, int i2) {
        int F2 = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2380b;
        WeakHashMap weakHashMap = M.Q.f513a;
        this.f2380b.setMeasuredDimension(g(i, F2, recyclerView.getMinimumWidth()), g(i2, D2, this.f2380b.getMinimumHeight()));
    }

    public J s(Context context, AttributeSet attributeSet) {
        return new J(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f2380b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f2380b.h;
            y(u2, rect);
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
        this.f2380b.h.set(i6, i4, i3, i5);
        r0(this.f2380b.h, i, i2);
    }

    public J t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof J ? new J((J) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new J((ViewGroup.MarginLayoutParams) layoutParams) : new J(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2380b = null;
            this.f2379a = null;
            this.f2389n = 0;
            this.f2390o = 0;
        } else {
            this.f2380b = recyclerView;
            this.f2379a = recyclerView.f1648e;
            this.f2389n = recyclerView.getWidth();
            this.f2390o = recyclerView.getHeight();
        }
        this.f2387l = 1073741824;
        this.f2388m = 1073741824;
    }

    public final View u(int i) {
        A1.j jVar = this.f2379a;
        if (jVar != null) {
            return jVar.g(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i2, J j2) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) j2).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) j2).height)) ? false : true;
    }

    public final int v() {
        A1.j jVar = this.f2379a;
        if (jVar != null) {
            return jVar.h();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i, int i2, J j2) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) j2).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) j2).height)) ? false : true;
    }

    public int x(O o2, U u2) {
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView == null || recyclerView.f1658k == null || !d()) {
            return 1;
        }
        return this.f2380b.f1658k.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f1616s0;
        J j2 = (J) view.getLayoutParams();
        Rect rect2 = j2.f2392b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) j2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) j2).bottomMargin);
    }

    public final void y0(C0134v c0134v) {
        C0134v c0134v2 = this.f2382e;
        if (c0134v2 != null && c0134v != c0134v2 && c0134v2.f2596e) {
            c0134v2.i();
        }
        this.f2382e = c0134v;
        RecyclerView recyclerView = this.f2380b;
        W w2 = recyclerView.f1640W;
        w2.f2428g.removeCallbacks(w2);
        w2.f2425c.abortAnimation();
        if (c0134v.h) {
            Log.w("RecyclerView", "An instance of " + c0134v.getClass().getSimpleName() + " was started more than once. Each instance of" + c0134v.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0134v.f2594b = recyclerView;
        c0134v.f2595c = this;
        int i = c0134v.f2593a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1646c0.f2412a = i;
        c0134v.f2596e = true;
        c0134v.d = true;
        c0134v.f2597f = recyclerView.f1660l.q(i);
        c0134v.f2594b.f1640W.a();
        c0134v.h = true;
    }

    public boolean z0() {
        return false;
    }
}
