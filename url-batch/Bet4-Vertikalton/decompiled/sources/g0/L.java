package g0;

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
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import f0.AbstractC0089a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public C0118d f2275a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2276b;

    /* renamed from: c, reason: collision with root package name */
    public final B.j f2277c;
    public final B.j d;

    /* renamed from: e, reason: collision with root package name */
    public C0137x f2278e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2279f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2280g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f2281j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2282k;

    /* renamed from: l, reason: collision with root package name */
    public int f2283l;

    /* renamed from: m, reason: collision with root package name */
    public int f2284m;

    /* renamed from: n, reason: collision with root package name */
    public int f2285n;

    /* renamed from: o, reason: collision with root package name */
    public int f2286o;

    public L() {
        J j2 = new J(this, 0);
        J j3 = new J(this, 1);
        this.f2277c = new B.j(j2);
        this.d = new B.j(j3);
        this.f2279f = false;
        this.f2280g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((M) view.getLayoutParams()).f2288b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((M) view.getLayoutParams()).f2287a.c();
    }

    public static K I(Context context, AttributeSet attributeSet, int i, int i2) {
        K k2 = new K();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0089a.f2078a, i, i2);
        k2.f2272a = obtainStyledAttributes.getInt(0, 1);
        k2.f2273b = obtainStyledAttributes.getInt(10, 1);
        k2.f2274c = obtainStyledAttributes.getBoolean(9, false);
        k2.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return k2;
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
        M m2 = (M) view.getLayoutParams();
        Rect rect = m2.f2288b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) m2).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) m2).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) m2).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) m2).bottomMargin);
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
        Rect rect = ((M) view.getLayoutParams()).f2288b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final void A0(C0137x c0137x) {
        C0137x c0137x2 = this.f2278e;
        if (c0137x2 != null && c0137x != c0137x2 && c0137x2.f2500e) {
            c0137x2.i();
        }
        this.f2278e = c0137x;
        RecyclerView recyclerView = this.f2276b;
        b0 b0Var = recyclerView.f1564d0;
        b0Var.f2334g.removeCallbacks(b0Var);
        b0Var.f2331c.abortAnimation();
        if (c0137x.h) {
            Log.w("RecyclerView", "An instance of " + c0137x.getClass().getSimpleName() + " was started more than once. Each instance of" + c0137x.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0137x.f2498b = recyclerView;
        c0137x.f2499c = this;
        int i = c0137x.f2497a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1570g0.f2310a = i;
        c0137x.f2500e = true;
        c0137x.d = true;
        c0137x.f2501f = recyclerView.f1580n.q(i);
        c0137x.f2498b.f1564d0.b();
        c0137x.h = true;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2276b;
        AbstractC0112D adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2276b;
        WeakHashMap weakHashMap = K.T.f423a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(S s2, Y y2) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((M) view.getLayoutParams()).f2288b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2276b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2276b.f1576l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1567f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1567f.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1567f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1567f.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, S s2, Y y2);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2276b;
        S s2 = recyclerView.f1562c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2276b.canScrollVertically(-1) && !this.f2276b.canScrollHorizontally(-1) && !this.f2276b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0112D abstractC0112D = this.f2276b.f1578m;
        if (abstractC0112D != null) {
            accessibilityEvent.setItemCount(abstractC0112D.a());
        }
    }

    public void V(S s2, Y y2, L.j jVar) {
        boolean canScrollVertically = this.f2276b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f544a;
        if (canScrollVertically || this.f2276b.canScrollHorizontally(-1)) {
            jVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f2276b.canScrollVertically(1) || this.f2276b.canScrollHorizontally(1)) {
            jVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(s2, y2), x(s2, y2), false, 0));
    }

    public final void W(View view, L.j jVar) {
        c0 L2 = RecyclerView.L(view);
        if (L2 == null || L2.j() || this.f2275a.f2357c.contains(L2.f2339a)) {
            return;
        }
        RecyclerView recyclerView = this.f2276b;
        X(recyclerView.f1562c, recyclerView.f1570g0, view, jVar);
    }

    public void X(S s2, Y y2, View view, L.j jVar) {
    }

    public void Y(int i, int i2) {
    }

    public void Z() {
    }

    public void a0(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, int i, boolean z2) {
        int b2;
        c0 L2 = RecyclerView.L(view);
        if (z2 || L2.j()) {
            o.k kVar = (o.k) this.f2276b.f1569g.f31b;
            m0 m0Var = (m0) kVar.getOrDefault(L2, null);
            if (m0Var == null) {
                m0Var = m0.a();
                kVar.put(L2, m0Var);
            }
            m0Var.f2428a |= 1;
        } else {
            this.f2276b.f1569g.I(L2);
        }
        M m2 = (M) view.getLayoutParams();
        if (L2.r() || L2.k()) {
            if (L2.k()) {
                L2.f2349n.l(L2);
            } else {
                L2.f2345j &= -33;
            }
            this.f2275a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2276b) {
                C0118d c0118d = this.f2275a;
                int indexOfChild = c0118d.f2355a.f2261a.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0117c c0117c = c0118d.f2356b;
                    if (!c0117c.d(indexOfChild)) {
                        b2 = indexOfChild - c0117c.b(indexOfChild);
                        if (i == -1) {
                            i = this.f2275a.e();
                        }
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            sb.append(this.f2276b.indexOfChild(view));
                            throw new IllegalStateException(Y.V.d(this.f2276b, sb));
                        }
                        if (b2 != i) {
                            L l2 = this.f2276b.f1580n;
                            View u2 = l2.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + l2.f2276b.toString());
                            }
                            l2.u(b2);
                            l2.f2275a.c(b2);
                            M m3 = (M) u2.getLayoutParams();
                            c0 L3 = RecyclerView.L(u2);
                            if (L3.j()) {
                                o.k kVar2 = (o.k) l2.f2276b.f1569g.f31b;
                                m0 m0Var2 = (m0) kVar2.getOrDefault(L3, null);
                                if (m0Var2 == null) {
                                    m0Var2 = m0.a();
                                    kVar2.put(L3, m0Var2);
                                }
                                m0Var2.f2428a = 1 | m0Var2.f2428a;
                            } else {
                                l2.f2276b.f1569g.I(L3);
                            }
                            l2.f2275a.b(u2, i, m3, L3.j());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f2275a.a(view, i, false);
                m2.f2289c = true;
                C0137x c0137x = this.f2278e;
                if (c0137x != null && c0137x.f2500e) {
                    c0137x.f2498b.getClass();
                    c0 L4 = RecyclerView.L(view);
                    if ((L4 != null ? L4.c() : -1) == c0137x.f2497a) {
                        c0137x.f2501f = view;
                        if (RecyclerView.f1528A0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (m2.d) {
            if (RecyclerView.f1528A0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + m2.f2287a);
            }
            L2.f2339a.invalidate();
            m2.d = false;
        }
    }

    public void b0(int i, int i2) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i, int i2) {
    }

    public abstract boolean d();

    public abstract void d0(S s2, Y y2);

    public abstract boolean e();

    public abstract void e0(Y y2);

    public boolean f(M m2) {
        return m2 != null;
    }

    public void f0(Parcelable parcelable) {
    }

    public Parcelable g0() {
        return null;
    }

    public void h(int i, int i2, Y y2, C0129o c0129o) {
    }

    public void h0(int i) {
    }

    public void i(int i, C0129o c0129o) {
    }

    public final void i0(S s2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.L(u(v2)).q()) {
                View u2 = u(v2);
                l0(v2);
                s2.h(u2);
            }
        }
    }

    public abstract int j(Y y2);

    public final void j0(S s2) {
        ArrayList arrayList;
        int size = s2.f2296a.size();
        int i = size - 1;
        while (true) {
            arrayList = s2.f2296a;
            if (i < 0) {
                break;
            }
            View view = ((c0) arrayList.get(i)).f2339a;
            c0 L2 = RecyclerView.L(view);
            if (!L2.q()) {
                L2.p(false);
                if (L2.l()) {
                    this.f2276b.removeDetachedView(view, false);
                }
                H h = this.f2276b.f1546L;
                if (h != null) {
                    h.d(L2);
                }
                L2.p(true);
                c0 L3 = RecyclerView.L(view);
                L3.f2349n = null;
                L3.f2350o = false;
                L3.f2345j &= -33;
                s2.i(L3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = s2.f2297b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2276b.invalidate();
        }
    }

    public abstract int k(Y y2);

    public final void k0(View view, S s2) {
        C0118d c0118d = this.f2275a;
        C0111C c0111c = c0118d.f2355a;
        int i = c0118d.d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0118d.d = 1;
            c0118d.f2358e = view;
            int indexOfChild = c0111c.f2261a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c0118d.f2356b.g(indexOfChild)) {
                    c0118d.j(view);
                }
                c0111c.h(indexOfChild);
            }
            c0118d.d = 0;
            c0118d.f2358e = null;
            s2.h(view);
        } catch (Throwable th) {
            c0118d.d = 0;
            c0118d.f2358e = null;
            throw th;
        }
    }

    public abstract int l(Y y2);

    public final void l0(int i) {
        if (u(i) != null) {
            C0118d c0118d = this.f2275a;
            C0111C c0111c = c0118d.f2355a;
            int i2 = c0118d.d;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int f2 = c0118d.f(i);
                View childAt = c0111c.f2261a.getChildAt(f2);
                if (childAt != null) {
                    c0118d.d = 1;
                    c0118d.f2358e = childAt;
                    if (c0118d.f2356b.g(f2)) {
                        c0118d.j(childAt);
                    }
                    c0111c.h(f2);
                }
            } finally {
                c0118d.d = 0;
                c0118d.f2358e = null;
            }
        }
    }

    public abstract int m(Y y2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int E2 = E();
        int G2 = G();
        int F = this.f2285n - F();
        int D2 = this.f2286o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E2;
        int min = Math.min(0, i);
        int i2 = top - G2;
        int min2 = Math.min(0, i2);
        int i3 = width - F;
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
                int F2 = this.f2285n - F();
                int D3 = this.f2286o - D();
                Rect rect2 = this.f2276b.f1573j;
                y(focusedChild, rect2);
                if (rect2.left - i4 < F2) {
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
                recyclerView.h0(i4, i5, false);
            }
            return true;
        }
        return false;
    }

    public abstract int n(Y y2);

    public final void n0() {
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int o(Y y2);

    public abstract int o0(int i, S s2, Y y2);

    public final void p(S s2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            c0 L2 = RecyclerView.L(u2);
            if (L2.q()) {
                if (RecyclerView.f1528A0) {
                    Log.d("RecyclerView", "ignoring view " + L2);
                }
            } else if (!L2.h() || L2.j() || this.f2276b.f1578m.f2263b) {
                u(v2);
                this.f2275a.c(v2);
                s2.j(u2);
                this.f2276b.f1569g.I(L2);
            } else {
                l0(v2);
                s2.i(L2);
            }
        }
    }

    public abstract void p0(int i);

    public View q(int i) {
        int v2 = v();
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            c0 L2 = RecyclerView.L(u2);
            if (L2 != null && L2.c() == i && !L2.q() && (this.f2276b.f1570g0.f2315g || !L2.j())) {
                return u2;
            }
        }
        return null;
    }

    public abstract int q0(int i, S s2, Y y2);

    public abstract M r();

    public final void r0(RecyclerView recyclerView) {
        s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public M s(Context context, AttributeSet attributeSet) {
        return new M(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        this.f2285n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2283l = mode;
        if (mode == 0 && !RecyclerView.f1531D0) {
            this.f2285n = 0;
        }
        this.f2286o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2284m = mode2;
        if (mode2 != 0 || RecyclerView.f1531D0) {
            return;
        }
        this.f2286o = 0;
    }

    public M t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof M ? new M((M) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new M((ViewGroup.MarginLayoutParams) layoutParams) : new M(layoutParams);
    }

    public void t0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2276b;
        WeakHashMap weakHashMap = K.T.f423a;
        this.f2276b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D2, this.f2276b.getMinimumHeight()));
    }

    public final View u(int i) {
        C0118d c0118d = this.f2275a;
        if (c0118d != null) {
            return c0118d.d(i);
        }
        return null;
    }

    public final void u0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f2276b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f2276b.f1573j;
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
        this.f2276b.f1573j.set(i6, i4, i3, i5);
        t0(this.f2276b.f1573j, i, i2);
    }

    public final int v() {
        C0118d c0118d = this.f2275a;
        if (c0118d != null) {
            return c0118d.e();
        }
        return 0;
    }

    public final void v0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2276b = null;
            this.f2275a = null;
            this.f2285n = 0;
            this.f2286o = 0;
        } else {
            this.f2276b = recyclerView;
            this.f2275a = recyclerView.f1567f;
            this.f2285n = recyclerView.getWidth();
            this.f2286o = recyclerView.getHeight();
        }
        this.f2283l = 1073741824;
        this.f2284m = 1073741824;
    }

    public final boolean w0(View view, int i, int i2, M m2) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) m2).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) m2).height)) ? false : true;
    }

    public int x(S s2, Y y2) {
        return -1;
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        boolean z2 = RecyclerView.z0;
        M m2 = (M) view.getLayoutParams();
        Rect rect2 = m2.f2288b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) m2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) m2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) m2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) m2).bottomMargin);
    }

    public final boolean y0(View view, int i, int i2, M m2) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) m2).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) m2).height)) ? false : true;
    }

    public abstract void z0(RecyclerView recyclerView, int i);
}
