package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public h f1597a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1598b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.emoji2.text.q f1599c;
    public final androidx.emoji2.text.q d;

    /* renamed from: e, reason: collision with root package name */
    public h0 f1600e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1601f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1602g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f1603j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1604k;

    /* renamed from: l, reason: collision with root package name */
    public int f1605l;

    /* renamed from: m, reason: collision with root package name */
    public int f1606m;

    /* renamed from: n, reason: collision with root package name */
    public int f1607n;

    /* renamed from: o, reason: collision with root package name */
    public int f1608o;

    public a1() {
        y0 y0Var = new y0(this, 0);
        y0 y0Var2 = new y0(this, 1);
        this.f1599c = new androidx.emoji2.text.q(y0Var);
        this.d = new androidx.emoji2.text.q(y0Var2);
        this.f1601f = false;
        this.f1602g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((b1) view.getLayoutParams()).f1618b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((b1) view.getLayoutParams()).f1617a.b();
    }

    public static z0 H(Context context, AttributeSet attributeSet, int i, int i4) {
        z0 z0Var = new z0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1.a.f1435a, i, i4);
        z0Var.f1866a = obtainStyledAttributes.getInt(0, 1);
        z0Var.f1867b = obtainStyledAttributes.getInt(10, 1);
        z0Var.f1868c = obtainStyledAttributes.getBoolean(9, false);
        z0Var.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return z0Var;
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
        b1 b1Var = (b1) view.getLayoutParams();
        Rect rect = b1Var.f1618b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) b1Var).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) b1Var).topMargin, (i5 - rect.right) - ((ViewGroup.MarginLayoutParams) b1Var).rightMargin, (i6 - rect.bottom) - ((ViewGroup.MarginLayoutParams) b1Var).bottomMargin);
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
    public static int w(boolean z4, int i, int i4, int i5, int i6) {
        int max = Math.max(0, i - i5);
        if (z4) {
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
        Rect rect = ((b1) view.getLayoutParams()).f1618b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i);

    public final int B() {
        RecyclerView recyclerView = this.f1598b;
        q0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final void B0(h0 h0Var) {
        h0 h0Var2 = this.f1600e;
        if (h0Var2 != null && h0Var != h0Var2 && h0Var2.f1678e) {
            h0Var2.i();
        }
        this.f1600e = h0Var;
        RecyclerView recyclerView = this.f1598b;
        p1 p1Var = recyclerView.i0;
        p1Var.f1757l.removeCallbacks(p1Var);
        p1Var.h.abortAnimation();
        if (h0Var.h) {
            Log.w("RecyclerView", "An instance of " + h0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + h0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        h0Var.f1676b = recyclerView;
        h0Var.f1677c = this;
        int i = h0Var.f1675a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f775l0.f1720a = i;
        h0Var.f1678e = true;
        h0Var.d = true;
        h0Var.f1679f = recyclerView.f788s.q(i);
        h0Var.f1676b.i0.b();
        h0Var.h = true;
    }

    public final int C() {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean C0() {
        return false;
    }

    public final int D() {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(g1 g1Var, m1 m1Var) {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView == null || recyclerView.f786r == null || !e()) {
            return 1;
        }
        return this.f1598b.f786r.a();
    }

    public final void J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((b1) view.getLayoutParams()).f1618b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f1598b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f1598b.f784q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean K();

    public boolean L() {
        return false;
    }

    public void O(int i) {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView != null) {
            int e4 = recyclerView.f772k.e();
            for (int i4 = 0; i4 < e4; i4++) {
                recyclerView.f772k.d(i4).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView != null) {
            int e4 = recyclerView.f772k.e();
            for (int i4 = 0; i4 < e4; i4++) {
                recyclerView.f772k.d(i4).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, g1 g1Var, m1 m1Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1598b;
        g1 g1Var = recyclerView.h;
        m1 m1Var = recyclerView.f775l0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1598b.canScrollVertically(-1) && !this.f1598b.canScrollHorizontally(-1) && !this.f1598b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        q0 q0Var = this.f1598b.f786r;
        if (q0Var != null) {
            accessibilityEvent.setItemCount(q0Var.a());
        }
    }

    public void V(g1 g1Var, m1 m1Var, o0.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2882a;
        if (this.f1598b.canScrollVertically(-1) || this.f1598b.canScrollHorizontally(-1)) {
            gVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
            gVar.g(67108864, true);
        }
        if (this.f1598b.canScrollVertically(1) || this.f1598b.canScrollHorizontally(1)) {
            gVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
            gVar.g(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(g1Var, m1Var), x(g1Var, m1Var), false, 0));
    }

    public final void W(View view, o0.g gVar) {
        q1 M = RecyclerView.M(view);
        if (M == null || M.h()) {
            return;
        }
        h hVar = this.f1597a;
        if (hVar.f1673c.contains(M.f1768a)) {
            return;
        }
        RecyclerView recyclerView = this.f1598b;
        X(recyclerView.h, recyclerView.f775l0, view, gVar);
    }

    public void X(g1 g1Var, m1 m1Var, View view, o0.g gVar) {
        gVar.i(o0.f.a(false, e() ? G(view) : 0, 1, d() ? G(view) : 0, 1));
    }

    public final void b(View view, int i, boolean z4) {
        q1 M = RecyclerView.M(view);
        if (z4 || M.h()) {
            q.j jVar = (q.j) this.f1598b.f774l.f466g;
            a2 a2Var = (a2) jVar.get(M);
            if (a2Var == null) {
                a2Var = a2.a();
                jVar.put(M, a2Var);
            }
            a2Var.f1609a |= 1;
        } else {
            this.f1598b.f774l.H(M);
        }
        b1 b1Var = (b1) view.getLayoutParams();
        if (M.p() || M.i()) {
            if (M.i()) {
                M.f1778n.m(M);
            } else {
                M.f1774j &= -33;
            }
            this.f1597a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f1598b) {
                h hVar = this.f1597a;
                g gVar = hVar.f1672b;
                int indexOfChild = hVar.f1671a.f1752a.indexOfChild(view);
                int b2 = (indexOfChild == -1 || gVar.d(indexOfChild)) ? -1 : indexOfChild - gVar.b(indexOfChild);
                if (i == -1) {
                    i = this.f1597a.e();
                }
                if (b2 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f1598b.indexOfChild(view));
                    throw new IllegalStateException(a4.b.e(this.f1598b, sb));
                }
                if (b2 != i) {
                    a1 a1Var = this.f1598b.f788s;
                    View u4 = a1Var.u(b2);
                    if (u4 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + a1Var.f1598b.toString());
                    }
                    a1Var.u(b2);
                    a1Var.f1597a.c(b2);
                    b1 b1Var2 = (b1) u4.getLayoutParams();
                    q1 M2 = RecyclerView.M(u4);
                    if (M2.h()) {
                        q.j jVar2 = (q.j) a1Var.f1598b.f774l.f466g;
                        a2 a2Var2 = (a2) jVar2.get(M2);
                        if (a2Var2 == null) {
                            a2Var2 = a2.a();
                            jVar2.put(M2, a2Var2);
                        }
                        a2Var2.f1609a = 1 | a2Var2.f1609a;
                    } else {
                        a1Var.f1598b.f774l.H(M2);
                    }
                    a1Var.f1597a.b(u4, i, b1Var2, M2.h());
                }
            } else {
                this.f1597a.a(view, i, false);
                b1Var.f1619c = true;
                h0 h0Var = this.f1600e;
                if (h0Var != null && h0Var.f1678e) {
                    h0Var.f1676b.getClass();
                    q1 M3 = RecyclerView.M(view);
                    if ((M3 != null ? M3.b() : -1) == h0Var.f1675a) {
                        h0Var.f1679f = view;
                        if (RecyclerView.H0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (b1Var.d) {
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + b1Var.f1617a);
            }
            M.f1768a.invalidate();
            b1Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract void d0(g1 g1Var, m1 m1Var);

    public abstract boolean e();

    public abstract void e0(m1 m1Var);

    public boolean f(b1 b1Var) {
        return b1Var != null;
    }

    public Parcelable g0() {
        return null;
    }

    public boolean i0(int i, Bundle bundle) {
        int F;
        int D;
        float f5;
        g1 g1Var = this.f1598b.h;
        int i4 = this.f1608o;
        int i5 = this.f1607n;
        Rect rect = new Rect();
        if (this.f1598b.getMatrix().isIdentity() && this.f1598b.getGlobalVisibleRect(rect)) {
            i4 = rect.height();
            i5 = rect.width();
        }
        if (i == 4096) {
            F = this.f1598b.canScrollVertically(1) ? (i4 - F()) - C() : 0;
            if (this.f1598b.canScrollHorizontally(1)) {
                D = (i5 - D()) - E();
            }
            D = 0;
        } else if (i != 8192) {
            F = 0;
            D = 0;
        } else {
            F = this.f1598b.canScrollVertically(-1) ? -((i4 - F()) - C()) : 0;
            if (this.f1598b.canScrollHorizontally(-1)) {
                D = -((i5 - D()) - E());
            }
            D = 0;
        }
        if (F != 0 || D != 0) {
            if (bundle != null) {
                f5 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f5 < 0.0f) {
                    if (RecyclerView.G0) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f5 + ")");
                    }
                }
            } else {
                f5 = 1.0f;
            }
            if (Float.compare(f5, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f5) != 0 && Float.compare(0.0f, f5) != 0) {
                    D = (int) (D * f5);
                    F = (int) (F * f5);
                }
                this.f1598b.i0(D, F, true);
                return true;
            }
            RecyclerView recyclerView = this.f1598b;
            q0 q0Var = recyclerView.f786r;
            if (q0Var != null) {
                if (i == 4096) {
                    recyclerView.j0(q0Var.a() - 1);
                    return true;
                }
                if (i != 8192) {
                    return true;
                }
                recyclerView.j0(0);
                return true;
            }
        }
        return false;
    }

    public abstract int j(m1 m1Var);

    public final void j0(g1 g1Var) {
        for (int v4 = v() - 1; v4 >= 0; v4--) {
            if (!RecyclerView.M(u(v4)).o()) {
                View u4 = u(v4);
                m0(v4);
                g1Var.i(u4);
            }
        }
    }

    public abstract int k(m1 m1Var);

    public final void k0(g1 g1Var) {
        ArrayList arrayList = g1Var.f1665a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((q1) arrayList.get(i)).f1768a;
            q1 M = RecyclerView.M(view);
            if (!M.o()) {
                M.n(false);
                if (M.j()) {
                    this.f1598b.removeDetachedView(view, false);
                }
                w0 w0Var = this.f1598b.Q;
                if (w0Var != null) {
                    w0Var.d(M);
                }
                M.n(true);
                q1 M2 = RecyclerView.M(view);
                M2.f1778n = null;
                M2.f1779o = false;
                M2.f1774j &= -33;
                g1Var.j(M2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = g1Var.f1666b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f1598b.invalidate();
        }
    }

    public abstract int l(m1 m1Var);

    public final void l0(View view, g1 g1Var) {
        h hVar = this.f1597a;
        p0 p0Var = hVar.f1671a;
        int i = hVar.d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            hVar.d = 1;
            hVar.f1674e = view;
            int indexOfChild = p0Var.f1752a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (hVar.f1672b.g(indexOfChild)) {
                    hVar.j(view);
                }
                p0Var.k(indexOfChild);
            }
            hVar.d = 0;
            hVar.f1674e = null;
            g1Var.i(view);
        } catch (Throwable th) {
            hVar.d = 0;
            hVar.f1674e = null;
            throw th;
        }
    }

    public abstract int m(m1 m1Var);

    public final void m0(int i) {
        if (u(i) != null) {
            h hVar = this.f1597a;
            p0 p0Var = hVar.f1671a;
            int i4 = hVar.d;
            if (i4 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i4 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int f5 = hVar.f(i);
                View childAt = p0Var.f1752a.getChildAt(f5);
                if (childAt != null) {
                    hVar.d = 1;
                    hVar.f1674e = childAt;
                    if (hVar.f1672b.g(f5)) {
                        hVar.j(childAt);
                    }
                    p0Var.k(f5);
                }
                hVar.d = 0;
                hVar.f1674e = null;
            } catch (Throwable th) {
                hVar.d = 0;
                hVar.f1674e = null;
                throw th;
            }
        }
    }

    public abstract int n(m1 m1Var);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        int D = D();
        int F = F();
        int E = this.f1607n - E();
        int C = this.f1608o - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - D;
        int min = Math.min(0, i);
        int i4 = top - F;
        int min2 = Math.min(0, i4);
        int i5 = width - E;
        int max = Math.max(0, i5);
        int max2 = Math.max(0, height - C);
        if (this.f1598b.getLayoutDirection() != 1) {
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
        if (z5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int D2 = D();
                int F2 = F();
                int E2 = this.f1607n - E();
                int C2 = this.f1608o - C();
                Rect rect2 = this.f1598b.f780o;
                y(focusedChild, rect2);
                if (rect2.left - i6 < E2) {
                    if (rect2.right - i6 > D2) {
                        if (rect2.top - i7 < C2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i6 != 0 || i7 != 0) {
            if (z4) {
                recyclerView.scrollBy(i6, i7);
                return true;
            }
            recyclerView.i0(i6, i7, false);
            return true;
        }
        return false;
    }

    public abstract int o(m1 m1Var);

    public final void o0() {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(g1 g1Var) {
        for (int v4 = v() - 1; v4 >= 0; v4--) {
            View u4 = u(v4);
            q1 M = RecyclerView.M(u4);
            if (M.o()) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "ignoring view " + M);
                }
            } else if (!M.f() || M.h() || this.f1598b.f786r.f1765b) {
                u(v4);
                this.f1597a.c(v4);
                g1Var.k(u4);
                this.f1598b.f774l.H(M);
            } else {
                m0(v4);
                g1Var.j(M);
            }
        }
    }

    public abstract int p0(int i, g1 g1Var, m1 m1Var);

    public View q(int i) {
        int v4 = v();
        for (int i4 = 0; i4 < v4; i4++) {
            View u4 = u(i4);
            q1 M = RecyclerView.M(u4);
            if (M != null && M.b() == i && !M.o() && (this.f1598b.f775l0.f1725g || !M.h())) {
                return u4;
            }
        }
        return null;
    }

    public abstract void q0(int i);

    public abstract b1 r();

    public abstract int r0(int i, g1 g1Var, m1 m1Var);

    public b1 s(Context context, AttributeSet attributeSet) {
        return new b1(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public b1 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b1 ? new b1((b1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new b1((ViewGroup.MarginLayoutParams) layoutParams) : new b1(layoutParams);
    }

    public final void t0(int i, int i4) {
        this.f1607n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f1605l = mode;
        if (mode == 0 && !RecyclerView.K0) {
            this.f1607n = 0;
        }
        this.f1608o = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f1606m = mode2;
        if (mode2 != 0 || RecyclerView.K0) {
            return;
        }
        this.f1608o = 0;
    }

    public final View u(int i) {
        h hVar = this.f1597a;
        if (hVar != null) {
            return hVar.d(i);
        }
        return null;
    }

    public void u0(Rect rect, int i, int i4) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f1598b;
        WeakHashMap weakHashMap = n0.p0.f2816a;
        this.f1598b.setMeasuredDimension(g(i, E, recyclerView.getMinimumWidth()), g(i4, C, this.f1598b.getMinimumHeight()));
    }

    public final int v() {
        h hVar = this.f1597a;
        if (hVar != null) {
            return hVar.e();
        }
        return 0;
    }

    public final void v0(int i, int i4) {
        int v4 = v();
        if (v4 == 0) {
            this.f1598b.q(i, i4);
            return;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < v4; i9++) {
            View u4 = u(i9);
            Rect rect = this.f1598b.f780o;
            y(u4, rect);
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
        this.f1598b.f780o.set(i8, i6, i5, i7);
        u0(this.f1598b.f780o, i, i4);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1598b = null;
            this.f1597a = null;
            this.f1607n = 0;
            this.f1608o = 0;
        } else {
            this.f1598b = recyclerView;
            this.f1597a = recyclerView.f772k;
            this.f1607n = recyclerView.getWidth();
            this.f1608o = recyclerView.getHeight();
        }
        this.f1605l = 1073741824;
        this.f1606m = 1073741824;
    }

    public int x(g1 g1Var, m1 m1Var) {
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView == null || recyclerView.f786r == null || !d()) {
            return 1;
        }
        return this.f1598b.f786r.a();
    }

    public final boolean x0(View view, int i, int i4, b1 b1Var) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) b1Var).width) && M(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) b1Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        boolean z4 = RecyclerView.G0;
        b1 b1Var = (b1) view.getLayoutParams();
        Rect rect2 = b1Var.f1618b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) b1Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) b1Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) b1Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) b1Var).bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i, int i4, b1 b1Var) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) b1Var).width) && M(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) b1Var).height)) ? false : true;
    }

    public void R(RecyclerView recyclerView) {
    }

    public void f0(Parcelable parcelable) {
    }

    public void h0(int i) {
    }

    public void Q() {
    }

    public void Z() {
    }

    public void Y(int i, int i4) {
    }

    public void a0(int i, int i4) {
    }

    public void b0(int i, int i4) {
    }

    public void c0(int i, int i4) {
    }

    public void i(int i, y yVar) {
    }

    public void h(int i, int i4, m1 m1Var, y yVar) {
    }
}
