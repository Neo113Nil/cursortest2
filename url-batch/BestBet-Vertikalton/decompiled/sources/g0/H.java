package g0;

import G1.AbstractC0001b;
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
import f0.AbstractC0110a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u0.C0365d;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public C0138b f2724a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2725b;

    /* renamed from: c, reason: collision with root package name */
    public final C0365d f2726c;
    public final C0365d d;

    /* renamed from: e, reason: collision with root package name */
    public C0157v f2727e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2728f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2729g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f2730j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2731k;

    /* renamed from: l, reason: collision with root package name */
    public int f2732l;

    /* renamed from: m, reason: collision with root package name */
    public int f2733m;

    /* renamed from: n, reason: collision with root package name */
    public int f2734n;

    /* renamed from: o, reason: collision with root package name */
    public int f2735o;

    public H() {
        C0136F c0136f = new C0136F(this, 0);
        C0136F c0136f2 = new C0136F(this, 1);
        this.f2726c = new C0365d(c0136f);
        this.d = new C0365d(c0136f2);
        this.f2728f = false;
        this.f2729g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((I) view.getLayoutParams()).f2737b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((I) view.getLayoutParams()).f2736a.b();
    }

    public static G I(Context context, AttributeSet attributeSet, int i, int i2) {
        G g2 = new G();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0110a.f2537a, i, i2);
        g2.f2721a = obtainStyledAttributes.getInt(0, 1);
        g2.f2722b = obtainStyledAttributes.getInt(10, 1);
        g2.f2723c = obtainStyledAttributes.getBoolean(9, false);
        g2.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return g2;
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
        I i5 = (I) view.getLayoutParams();
        Rect rect = i5.f2737b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) i5).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) i5).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) i5).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) i5).bottomMargin);
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
        Rect rect = ((I) view.getLayoutParams()).f2737b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final void A0(C0157v c0157v) {
        C0157v c0157v2 = this.f2727e;
        if (c0157v2 != null && c0157v != c0157v2 && c0157v2.f2941e) {
            c0157v2.i();
        }
        this.f2727e = c0157v;
        RecyclerView recyclerView = this.f2725b;
        X x2 = recyclerView.f1971b0;
        x2.f2775g.removeCallbacks(x2);
        x2.f2772c.abortAnimation();
        if (c0157v.h) {
            Log.w("RecyclerView", "An instance of " + c0157v.getClass().getSimpleName() + " was started more than once. Each instance of" + c0157v.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0157v.f2939b = recyclerView;
        c0157v.f2940c = this;
        int i = c0157v.f2938a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1976e0.f2759a = i;
        c0157v.f2941e = true;
        c0157v.d = true;
        c0157v.f2942f = recyclerView.f1989m.q(i);
        c0157v.f2939b.f1971b0.b();
        c0157v.h = true;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2725b;
        AbstractC0161z adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2725b;
        WeakHashMap weakHashMap = K.Q.f578a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(N n2, U u2) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((I) view.getLayoutParams()).f2737b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2725b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2725b.f1985k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1977f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1977f.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1977f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1977f.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, N n2, U u2);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2725b;
        N n2 = recyclerView.f1972c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2725b.canScrollVertically(-1) && !this.f2725b.canScrollHorizontally(-1) && !this.f2725b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0161z abstractC0161z = this.f2725b.f1987l;
        if (abstractC0161z != null) {
            accessibilityEvent.setItemCount(abstractC0161z.a());
        }
    }

    public void V(N n2, U u2, L.j jVar) {
        boolean canScrollVertically = this.f2725b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f696a;
        if (canScrollVertically || this.f2725b.canScrollHorizontally(-1)) {
            jVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f2725b.canScrollVertically(1) || this.f2725b.canScrollHorizontally(1)) {
            jVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(n2, u2), x(n2, u2), false, 0));
    }

    public final void W(View view, L.j jVar) {
        Y L2 = RecyclerView.L(view);
        if (L2 == null || L2.i() || this.f2724a.f2800c.contains(L2.f2777a)) {
            return;
        }
        RecyclerView recyclerView = this.f2725b;
        X(recyclerView.f1972c, recyclerView.f1976e0, view, jVar);
    }

    public void X(N n2, U u2, View view, L.j jVar) {
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
        Y L2 = RecyclerView.L(view);
        if (z2 || L2.i()) {
            o.k kVar = (o.k) this.f2725b.f1979g.f4231b;
            i0 i0Var = (i0) kVar.getOrDefault(L2, null);
            if (i0Var == null) {
                i0Var = i0.a();
                kVar.put(L2, i0Var);
            }
            i0Var.f2866a |= 1;
        } else {
            this.f2725b.f1979g.C(L2);
        }
        I i2 = (I) view.getLayoutParams();
        if (L2.q() || L2.j()) {
            if (L2.j()) {
                L2.f2787n.l(L2);
            } else {
                L2.f2783j &= -33;
            }
            this.f2724a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2725b) {
                C0138b c0138b = this.f2724a;
                int indexOfChild = c0138b.f2798a.f2954a.indexOfChild(view);
                if (indexOfChild != -1) {
                    F1.a aVar = c0138b.f2799b;
                    if (!aVar.d(indexOfChild)) {
                        b2 = indexOfChild - aVar.b(indexOfChild);
                        if (i == -1) {
                            i = this.f2724a.e();
                        }
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            sb.append(this.f2725b.indexOfChild(view));
                            throw new IllegalStateException(AbstractC0001b.e(this.f2725b, sb));
                        }
                        if (b2 != i) {
                            H h = this.f2725b.f1989m;
                            View u2 = h.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + h.f2725b.toString());
                            }
                            h.u(b2);
                            h.f2724a.c(b2);
                            I i3 = (I) u2.getLayoutParams();
                            Y L3 = RecyclerView.L(u2);
                            if (L3.i()) {
                                o.k kVar2 = (o.k) h.f2725b.f1979g.f4231b;
                                i0 i0Var2 = (i0) kVar2.getOrDefault(L3, null);
                                if (i0Var2 == null) {
                                    i0Var2 = i0.a();
                                    kVar2.put(L3, i0Var2);
                                }
                                i0Var2.f2866a = 1 | i0Var2.f2866a;
                            } else {
                                h.f2725b.f1979g.C(L3);
                            }
                            h.f2724a.b(u2, i, i3, L3.i());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f2724a.a(view, i, false);
                i2.f2738c = true;
                C0157v c0157v = this.f2727e;
                if (c0157v != null && c0157v.f2941e) {
                    c0157v.f2939b.getClass();
                    Y L4 = RecyclerView.L(view);
                    if ((L4 != null ? L4.b() : -1) == c0157v.f2938a) {
                        c0157v.f2942f = view;
                        if (RecyclerView.f1944y0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (i2.d) {
            if (RecyclerView.f1944y0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + i2.f2736a);
            }
            L2.f2777a.invalidate();
            i2.d = false;
        }
    }

    public void b0(int i, int i2) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i, int i2) {
    }

    public abstract boolean d();

    public abstract void d0(N n2, U u2);

    public abstract boolean e();

    public abstract void e0(U u2);

    public boolean f(I i) {
        return i != null;
    }

    public void f0(Parcelable parcelable) {
    }

    public Parcelable g0() {
        return null;
    }

    public void h(int i, int i2, U u2, C0149m c0149m) {
    }

    public void h0(int i) {
    }

    public void i(int i, C0149m c0149m) {
    }

    public final void i0(N n2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.L(u(v2)).p()) {
                View u2 = u(v2);
                l0(v2);
                n2.h(u2);
            }
        }
    }

    public abstract int j(U u2);

    public final void j0(N n2) {
        ArrayList arrayList;
        int size = n2.f2745a.size();
        int i = size - 1;
        while (true) {
            arrayList = n2.f2745a;
            if (i < 0) {
                break;
            }
            View view = ((Y) arrayList.get(i)).f2777a;
            Y L2 = RecyclerView.L(view);
            if (!L2.p()) {
                L2.o(false);
                if (L2.k()) {
                    this.f2725b.removeDetachedView(view, false);
                }
                AbstractC0134D abstractC0134D = this.f2725b.f1954J;
                if (abstractC0134D != null) {
                    abstractC0134D.d(L2);
                }
                L2.o(true);
                Y L3 = RecyclerView.L(view);
                L3.f2787n = null;
                L3.f2788o = false;
                L3.f2783j &= -33;
                n2.i(L3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = n2.f2746b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2725b.invalidate();
        }
    }

    public abstract int k(U u2);

    public final void k0(View view, N n2) {
        C0138b c0138b = this.f2724a;
        C0160y c0160y = c0138b.f2798a;
        int i = c0138b.d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0138b.d = 1;
            c0138b.f2801e = view;
            int indexOfChild = c0160y.f2954a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c0138b.f2799b.g(indexOfChild)) {
                    c0138b.j(view);
                }
                c0160y.h(indexOfChild);
            }
            c0138b.d = 0;
            c0138b.f2801e = null;
            n2.h(view);
        } catch (Throwable th) {
            c0138b.d = 0;
            c0138b.f2801e = null;
            throw th;
        }
    }

    public abstract int l(U u2);

    public final void l0(int i) {
        if (u(i) != null) {
            C0138b c0138b = this.f2724a;
            C0160y c0160y = c0138b.f2798a;
            int i2 = c0138b.d;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int f2 = c0138b.f(i);
                View childAt = c0160y.f2954a.getChildAt(f2);
                if (childAt != null) {
                    c0138b.d = 1;
                    c0138b.f2801e = childAt;
                    if (c0138b.f2799b.g(f2)) {
                        c0138b.j(childAt);
                    }
                    c0160y.h(f2);
                }
            } finally {
                c0138b.d = 0;
                c0138b.f2801e = null;
            }
        }
    }

    public abstract int m(U u2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int E2 = E();
        int G2 = G();
        int F = this.f2734n - F();
        int D2 = this.f2735o - D();
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
                int F2 = this.f2734n - F();
                int D3 = this.f2735o - D();
                Rect rect2 = this.f2725b.i;
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

    public abstract int n(U u2);

    public final void n0() {
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int o(U u2);

    public abstract int o0(int i, N n2, U u2);

    public final void p(N n2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            Y L2 = RecyclerView.L(u2);
            if (L2.p()) {
                if (RecyclerView.f1944y0) {
                    Log.d("RecyclerView", "ignoring view " + L2);
                }
            } else if (!L2.g() || L2.i() || this.f2725b.f1987l.f2956b) {
                u(v2);
                this.f2724a.c(v2);
                n2.j(u2);
                this.f2725b.f1979g.C(L2);
            } else {
                l0(v2);
                n2.i(L2);
            }
        }
    }

    public abstract void p0(int i);

    public View q(int i) {
        int v2 = v();
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            Y L2 = RecyclerView.L(u2);
            if (L2 != null && L2.b() == i && !L2.p() && (this.f2725b.f1976e0.f2764g || !L2.i())) {
                return u2;
            }
        }
        return null;
    }

    public abstract int q0(int i, N n2, U u2);

    public abstract I r();

    public final void r0(RecyclerView recyclerView) {
        s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public I s(Context context, AttributeSet attributeSet) {
        return new I(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        this.f2734n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2732l = mode;
        if (mode == 0 && !RecyclerView.f1938B0) {
            this.f2734n = 0;
        }
        this.f2735o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2733m = mode2;
        if (mode2 != 0 || RecyclerView.f1938B0) {
            return;
        }
        this.f2735o = 0;
    }

    public I t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof I ? new I((I) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new I((ViewGroup.MarginLayoutParams) layoutParams) : new I(layoutParams);
    }

    public void t0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2725b;
        WeakHashMap weakHashMap = K.Q.f578a;
        this.f2725b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D2, this.f2725b.getMinimumHeight()));
    }

    public final View u(int i) {
        C0138b c0138b = this.f2724a;
        if (c0138b != null) {
            return c0138b.d(i);
        }
        return null;
    }

    public final void u0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f2725b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f2725b.i;
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
        this.f2725b.i.set(i6, i4, i3, i5);
        t0(this.f2725b.i, i, i2);
    }

    public final int v() {
        C0138b c0138b = this.f2724a;
        if (c0138b != null) {
            return c0138b.e();
        }
        return 0;
    }

    public final void v0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2725b = null;
            this.f2724a = null;
            this.f2734n = 0;
            this.f2735o = 0;
        } else {
            this.f2725b = recyclerView;
            this.f2724a = recyclerView.f1977f;
            this.f2734n = recyclerView.getWidth();
            this.f2735o = recyclerView.getHeight();
        }
        this.f2732l = 1073741824;
        this.f2733m = 1073741824;
    }

    public final boolean w0(View view, int i, int i2, I i3) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) i3).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) i3).height)) ? false : true;
    }

    public int x(N n2, U u2) {
        return -1;
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        boolean z2 = RecyclerView.f1943x0;
        I i = (I) view.getLayoutParams();
        Rect rect2 = i.f2737b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) i).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) i).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) i).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) i).bottomMargin);
    }

    public final boolean y0(View view, int i, int i2, I i3) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) i3).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) i3).height)) ? false : true;
    }

    public abstract void z0(RecyclerView recyclerView, int i);
}
