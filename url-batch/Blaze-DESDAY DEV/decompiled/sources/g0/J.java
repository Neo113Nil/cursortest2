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
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public C0119c f2310a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2311b;

    /* renamed from: c, reason: collision with root package name */
    public final B.j f2312c;
    public final B.j d;

    /* renamed from: e, reason: collision with root package name */
    public C0138w f2313e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2314f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2315g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f2316j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2317k;

    /* renamed from: l, reason: collision with root package name */
    public int f2318l;

    /* renamed from: m, reason: collision with root package name */
    public int f2319m;

    /* renamed from: n, reason: collision with root package name */
    public int f2320n;

    /* renamed from: o, reason: collision with root package name */
    public int f2321o;

    public J() {
        H h = new H(this, 0);
        H h2 = new H(this, 1);
        this.f2312c = new B.j(h);
        this.d = new B.j(h2);
        this.f2314f = false;
        this.f2315g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((K) view.getLayoutParams()).f2323b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((K) view.getLayoutParams()).f2322a.b();
    }

    public static I I(Context context, AttributeSet attributeSet, int i, int i2) {
        I i3 = new I();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0089a.f2121a, i, i2);
        i3.f2307a = obtainStyledAttributes.getInt(0, 1);
        i3.f2308b = obtainStyledAttributes.getInt(10, 1);
        i3.f2309c = obtainStyledAttributes.getBoolean(9, false);
        i3.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return i3;
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
        K k2 = (K) view.getLayoutParams();
        Rect rect = k2.f2323b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) k2).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) k2).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) k2).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) k2).bottomMargin);
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
        Rect rect = ((K) view.getLayoutParams()).f2323b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final void A0(C0138w c0138w) {
        C0138w c0138w2 = this.f2313e;
        if (c0138w2 != null && c0138w != c0138w2 && c0138w2.f2530e) {
            c0138w2.i();
        }
        this.f2313e = c0138w;
        RecyclerView recyclerView = this.f2311b;
        Z z2 = recyclerView.f1591b0;
        z2.f2361g.removeCallbacks(z2);
        z2.f2358c.abortAnimation();
        if (c0138w.h) {
            Log.w("RecyclerView", "An instance of " + c0138w.getClass().getSimpleName() + " was started more than once. Each instance of" + c0138w.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0138w.f2528b = recyclerView;
        c0138w.f2529c = this;
        int i = c0138w.f2527a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1596e0.f2345a = i;
        c0138w.f2530e = true;
        c0138w.d = true;
        c0138w.f2531f = recyclerView.f1609m.q(i);
        c0138w.f2528b.f1591b0.b();
        c0138w.h = true;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2311b;
        AbstractC0112B adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2311b;
        WeakHashMap weakHashMap = K.T.f440a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(P p2, W w2) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((K) view.getLayoutParams()).f2323b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2311b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2311b.f1605k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1597f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1597f.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1597f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1597f.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, P p2, W w2);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2311b;
        P p2 = recyclerView.f1592c;
        W w2 = recyclerView.f1596e0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2311b.canScrollVertically(-1) && !this.f2311b.canScrollHorizontally(-1) && !this.f2311b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0112B abstractC0112B = this.f2311b.f1607l;
        if (abstractC0112B != null) {
            accessibilityEvent.setItemCount(abstractC0112B.a());
        }
    }

    public void V(P p2, W w2, L.j jVar) {
        boolean canScrollVertically = this.f2311b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f561a;
        if (canScrollVertically || this.f2311b.canScrollHorizontally(-1)) {
            jVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f2311b.canScrollVertically(1) || this.f2311b.canScrollHorizontally(1)) {
            jVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(p2, w2), x(p2, w2), false, 0));
    }

    public final void W(View view, L.j jVar) {
        a0 L2 = RecyclerView.L(view);
        if (L2 == null || L2.i() || this.f2310a.f2388c.contains(L2.f2366a)) {
            return;
        }
        RecyclerView recyclerView = this.f2311b;
        X(recyclerView.f1592c, recyclerView.f1596e0, view, jVar);
    }

    public void X(P p2, W w2, View view, L.j jVar) {
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
        a0 L2 = RecyclerView.L(view);
        if (z2 || L2.i()) {
            o.k kVar = (o.k) this.f2311b.f1599g.f45b;
            k0 k0Var = (k0) kVar.getOrDefault(L2, null);
            if (k0Var == null) {
                k0Var = k0.a();
                kVar.put(L2, k0Var);
            }
            k0Var.f2456a |= 1;
        } else {
            this.f2311b.f1599g.I(L2);
        }
        K k2 = (K) view.getLayoutParams();
        if (L2.q() || L2.j()) {
            if (L2.j()) {
                L2.f2376n.l(L2);
            } else {
                L2.f2372j &= -33;
            }
            this.f2310a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2311b) {
                C0119c c0119c = this.f2310a;
                int indexOfChild = c0119c.f2386a.f2296a.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0118b c0118b = c0119c.f2387b;
                    if (!c0118b.d(indexOfChild)) {
                        b2 = indexOfChild - c0118b.b(indexOfChild);
                        if (i == -1) {
                            i = this.f2310a.e();
                        }
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            sb.append(this.f2311b.indexOfChild(view));
                            throw new IllegalStateException(Y.V.d(this.f2311b, sb));
                        }
                        if (b2 != i) {
                            J j2 = this.f2311b.f1609m;
                            View u2 = j2.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + j2.f2311b.toString());
                            }
                            j2.u(b2);
                            j2.f2310a.c(b2);
                            K k3 = (K) u2.getLayoutParams();
                            a0 L3 = RecyclerView.L(u2);
                            if (L3.i()) {
                                o.k kVar2 = (o.k) j2.f2311b.f1599g.f45b;
                                k0 k0Var2 = (k0) kVar2.getOrDefault(L3, null);
                                if (k0Var2 == null) {
                                    k0Var2 = k0.a();
                                    kVar2.put(L3, k0Var2);
                                }
                                k0Var2.f2456a = 1 | k0Var2.f2456a;
                            } else {
                                j2.f2311b.f1599g.I(L3);
                            }
                            j2.f2310a.b(u2, i, k3, L3.i());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f2310a.a(view, i, false);
                k2.f2324c = true;
                C0138w c0138w = this.f2313e;
                if (c0138w != null && c0138w.f2530e) {
                    c0138w.f2528b.getClass();
                    a0 L4 = RecyclerView.L(view);
                    if ((L4 != null ? L4.b() : -1) == c0138w.f2527a) {
                        c0138w.f2531f = view;
                        if (RecyclerView.f1565y0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (k2.d) {
            if (RecyclerView.f1565y0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + k2.f2322a);
            }
            L2.f2366a.invalidate();
            k2.d = false;
        }
    }

    public void b0(int i, int i2) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i, int i2) {
    }

    public abstract boolean d();

    public abstract void d0(P p2, W w2);

    public abstract boolean e();

    public abstract void e0(W w2);

    public boolean f(K k2) {
        return k2 != null;
    }

    public void f0(Parcelable parcelable) {
    }

    public Parcelable g0() {
        return null;
    }

    public void h(int i, int i2, W w2, C0130n c0130n) {
    }

    public void h0(int i) {
    }

    public void i(int i, C0130n c0130n) {
    }

    public final void i0(P p2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.L(u(v2)).p()) {
                View u2 = u(v2);
                l0(v2);
                p2.h(u2);
            }
        }
    }

    public abstract int j(W w2);

    public final void j0(P p2) {
        ArrayList arrayList;
        int size = p2.f2331a.size();
        int i = size - 1;
        while (true) {
            arrayList = p2.f2331a;
            if (i < 0) {
                break;
            }
            View view = ((a0) arrayList.get(i)).f2366a;
            a0 L2 = RecyclerView.L(view);
            if (!L2.p()) {
                L2.o(false);
                if (L2.k()) {
                    this.f2311b.removeDetachedView(view, false);
                }
                AbstractC0116F abstractC0116F = this.f2311b.f1574J;
                if (abstractC0116F != null) {
                    abstractC0116F.d(L2);
                }
                L2.o(true);
                a0 L3 = RecyclerView.L(view);
                L3.f2376n = null;
                L3.f2377o = false;
                L3.f2372j &= -33;
                p2.i(L3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = p2.f2332b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2311b.invalidate();
        }
    }

    public abstract int k(W w2);

    public final void k0(View view, P p2) {
        C0119c c0119c = this.f2310a;
        C0111A c0111a = c0119c.f2386a;
        int i = c0119c.d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0119c.d = 1;
            c0119c.f2389e = view;
            int indexOfChild = c0111a.f2296a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c0119c.f2387b.g(indexOfChild)) {
                    c0119c.j(view);
                }
                c0111a.h(indexOfChild);
            }
            c0119c.d = 0;
            c0119c.f2389e = null;
            p2.h(view);
        } catch (Throwable th) {
            c0119c.d = 0;
            c0119c.f2389e = null;
            throw th;
        }
    }

    public abstract int l(W w2);

    public final void l0(int i) {
        if (u(i) != null) {
            C0119c c0119c = this.f2310a;
            C0111A c0111a = c0119c.f2386a;
            int i2 = c0119c.d;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int f2 = c0119c.f(i);
                View childAt = c0111a.f2296a.getChildAt(f2);
                if (childAt != null) {
                    c0119c.d = 1;
                    c0119c.f2389e = childAt;
                    if (c0119c.f2387b.g(f2)) {
                        c0119c.j(childAt);
                    }
                    c0111a.h(f2);
                }
            } finally {
                c0119c.d = 0;
                c0119c.f2389e = null;
            }
        }
    }

    public abstract int m(W w2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int E2 = E();
        int G2 = G();
        int F = this.f2320n - F();
        int D2 = this.f2321o - D();
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
                int F2 = this.f2320n - F();
                int D3 = this.f2321o - D();
                Rect rect2 = this.f2311b.i;
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
                recyclerView.g0(i4, i5, false);
            }
            return true;
        }
        return false;
    }

    public abstract int n(W w2);

    public final void n0() {
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int o(W w2);

    public abstract int o0(int i, P p2, W w2);

    public final void p(P p2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            a0 L2 = RecyclerView.L(u2);
            if (L2.p()) {
                if (RecyclerView.f1565y0) {
                    Log.d("RecyclerView", "ignoring view " + L2);
                }
            } else if (!L2.g() || L2.i() || this.f2311b.f1607l.f2298b) {
                u(v2);
                this.f2310a.c(v2);
                p2.j(u2);
                this.f2311b.f1599g.I(L2);
            } else {
                l0(v2);
                p2.i(L2);
            }
        }
    }

    public abstract void p0(int i);

    public View q(int i) {
        int v2 = v();
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            a0 L2 = RecyclerView.L(u2);
            if (L2 != null && L2.b() == i && !L2.p() && (this.f2311b.f1596e0.f2350g || !L2.i())) {
                return u2;
            }
        }
        return null;
    }

    public abstract int q0(int i, P p2, W w2);

    public abstract K r();

    public final void r0(RecyclerView recyclerView) {
        s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public K s(Context context, AttributeSet attributeSet) {
        return new K(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        this.f2320n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2318l = mode;
        if (mode == 0 && !RecyclerView.f1560B0) {
            this.f2320n = 0;
        }
        this.f2321o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2319m = mode2;
        if (mode2 != 0 || RecyclerView.f1560B0) {
            return;
        }
        this.f2321o = 0;
    }

    public K t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof K ? new K((K) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new K((ViewGroup.MarginLayoutParams) layoutParams) : new K(layoutParams);
    }

    public void t0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2311b;
        WeakHashMap weakHashMap = K.T.f440a;
        this.f2311b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D2, this.f2311b.getMinimumHeight()));
    }

    public final View u(int i) {
        C0119c c0119c = this.f2310a;
        if (c0119c != null) {
            return c0119c.d(i);
        }
        return null;
    }

    public final void u0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f2311b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f2311b.i;
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
        this.f2311b.i.set(i6, i4, i3, i5);
        t0(this.f2311b.i, i, i2);
    }

    public final int v() {
        C0119c c0119c = this.f2310a;
        if (c0119c != null) {
            return c0119c.e();
        }
        return 0;
    }

    public final void v0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2311b = null;
            this.f2310a = null;
            this.f2320n = 0;
            this.f2321o = 0;
        } else {
            this.f2311b = recyclerView;
            this.f2310a = recyclerView.f1597f;
            this.f2320n = recyclerView.getWidth();
            this.f2321o = recyclerView.getHeight();
        }
        this.f2318l = 1073741824;
        this.f2319m = 1073741824;
    }

    public final boolean w0(View view, int i, int i2, K k2) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) k2).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) k2).height)) ? false : true;
    }

    public int x(P p2, W w2) {
        return -1;
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        boolean z2 = RecyclerView.f1564x0;
        K k2 = (K) view.getLayoutParams();
        Rect rect2 = k2.f2323b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) k2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) k2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) k2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) k2).bottomMargin);
    }

    public final boolean y0(View view, int i, int i2, K k2) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) k2).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) k2).height)) ? false : true;
    }

    public abstract void z0(RecyclerView recyclerView, int i);
}
