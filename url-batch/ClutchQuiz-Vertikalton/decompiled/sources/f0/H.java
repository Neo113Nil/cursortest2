package f0;

import K.C0012m;
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
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public C0012m f2142a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2143b;

    /* renamed from: c, reason: collision with root package name */
    public final B.j f2144c;
    public final B.j d;

    /* renamed from: e, reason: collision with root package name */
    public C0115v f2145e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2146f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2147g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f2148j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2149k;

    /* renamed from: l, reason: collision with root package name */
    public int f2150l;

    /* renamed from: m, reason: collision with root package name */
    public int f2151m;

    /* renamed from: n, reason: collision with root package name */
    public int f2152n;

    /* renamed from: o, reason: collision with root package name */
    public int f2153o;

    public H() {
        F f2 = new F(this, 0);
        F f3 = new F(this, 1);
        this.f2144c = new B.j(f2);
        this.d = new B.j(f3);
        this.f2146f = false;
        this.f2147g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((I) view.getLayoutParams()).f2155b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((I) view.getLayoutParams()).f2154a.b();
    }

    public static G I(Context context, AttributeSet attributeSet, int i, int i2) {
        G g2 = new G();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0.a.f2108a, i, i2);
        g2.f2139a = obtainStyledAttributes.getInt(0, 1);
        g2.f2140b = obtainStyledAttributes.getInt(10, 1);
        g2.f2141c = obtainStyledAttributes.getBoolean(9, false);
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
        Rect rect = i5.f2155b;
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
        Rect rect = ((I) view.getLayoutParams()).f2155b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2143b;
        AbstractC0119z adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2143b;
        WeakHashMap weakHashMap = K.S.f365a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(N n2, T t2) {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView == null || recyclerView.f1598k == null || !e()) {
            return 1;
        }
        return this.f2143b.f1598k.a();
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((I) view.getLayoutParams()).f2155b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2143b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2143b.f1596j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView != null) {
            int f2 = recyclerView.f1588e.f();
            for (int i2 = 0; i2 < f2; i2++) {
                recyclerView.f1588e.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView != null) {
            int f2 = recyclerView.f1588e.f();
            for (int i2 = 0; i2 < f2; i2++) {
                recyclerView.f1588e.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q(RecyclerView recyclerView) {
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, N n2, T t2);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2143b;
        N n2 = recyclerView.f1583b;
        T t2 = recyclerView.f1586c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2143b.canScrollVertically(-1) && !this.f2143b.canScrollHorizontally(-1) && !this.f2143b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0119z abstractC0119z = this.f2143b.f1598k;
        if (abstractC0119z != null) {
            accessibilityEvent.setItemCount(abstractC0119z.a());
        }
    }

    public final void U(View view, L.k kVar) {
        W I2 = RecyclerView.I(view);
        if (I2 == null || I2.i() || ((ArrayList) this.f2142a.d).contains(I2.f2193a)) {
            return;
        }
        RecyclerView recyclerView = this.f2143b;
        V(recyclerView.f1583b, recyclerView.f1586c0, view, kVar);
    }

    public void V(N n2, T t2, View view, L.k kVar) {
        kVar.h(L.j.a(false, e() ? H(view) : 0, 1, d() ? H(view) : 0, 1));
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
        W I2 = RecyclerView.I(view);
        if (z2 || I2.i()) {
            o.k kVar = (o.k) this.f2143b.f1590f.f56b;
            g0 g0Var = (g0) kVar.getOrDefault(I2, null);
            if (g0Var == null) {
                g0Var = g0.a();
                kVar.put(I2, g0Var);
            }
            g0Var.f2264a |= 1;
        } else {
            this.f2143b.f1590f.H(I2);
        }
        I i2 = (I) view.getLayoutParams();
        if (I2.q() || I2.j()) {
            if (I2.j()) {
                I2.f2203n.j(I2);
            } else {
                I2.f2199j &= -33;
            }
            this.f2142a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2143b) {
                C0012m c0012m = this.f2142a;
                int indexOfChild = ((C0118y) c0012m.f422b).f2367a.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0096b c0096b = (C0096b) c0012m.f423c;
                    if (!c0096b.d(indexOfChild)) {
                        b2 = indexOfChild - c0096b.b(indexOfChild);
                        if (i == -1) {
                            i = this.f2142a.f();
                        }
                        if (b2 != -1) {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2143b.indexOfChild(view) + this.f2143b.y());
                        }
                        if (b2 != i) {
                            H h = this.f2143b.f1600l;
                            View u2 = h.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + h.f2143b.toString());
                            }
                            h.u(b2);
                            h.f2142a.d(b2);
                            I i3 = (I) u2.getLayoutParams();
                            W I3 = RecyclerView.I(u2);
                            if (I3.i()) {
                                o.k kVar2 = (o.k) h.f2143b.f1590f.f56b;
                                g0 g0Var2 = (g0) kVar2.getOrDefault(I3, null);
                                if (g0Var2 == null) {
                                    g0Var2 = g0.a();
                                    kVar2.put(I3, g0Var2);
                                }
                                g0Var2.f2264a = 1 | g0Var2.f2264a;
                            } else {
                                h.f2143b.f1590f.H(I3);
                            }
                            h.f2142a.b(u2, i, i3, I3.i());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f2142a.a(view, i, false);
                i2.f2156c = true;
                C0115v c0115v = this.f2145e;
                if (c0115v != null && c0115v.f2354e) {
                    c0115v.f2352b.getClass();
                    W I4 = RecyclerView.I(view);
                    if ((I4 != null ? I4.b() : -1) == c0115v.f2351a) {
                        c0115v.f2355f = view;
                    }
                }
            }
        }
        if (i2.d) {
            I2.f2193a.invalidate();
            i2.d = false;
        }
    }

    public abstract void b0(N n2, T t2);

    public void c(String str) {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(T t2);

    public abstract boolean d();

    public void d0(Parcelable parcelable) {
    }

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(I i) {
        return i != null;
    }

    public void f0(int i) {
    }

    public final void g0(N n2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.I(u(v2)).p()) {
                View u2 = u(v2);
                j0(v2);
                n2.f(u2);
            }
        }
    }

    public void h(int i, int i2, T t2, C0107m c0107m) {
    }

    public final void h0(N n2) {
        ArrayList arrayList;
        int size = n2.f2162a.size();
        int i = size - 1;
        while (true) {
            arrayList = n2.f2162a;
            if (i < 0) {
                break;
            }
            View view = ((W) arrayList.get(i)).f2193a;
            W I2 = RecyclerView.I(view);
            if (!I2.p()) {
                I2.o(false);
                if (I2.k()) {
                    this.f2143b.removeDetachedView(view, false);
                }
                D d = this.f2143b.f1565H;
                if (d != null) {
                    d.d(I2);
                }
                I2.o(true);
                W I3 = RecyclerView.I(view);
                I3.f2203n = null;
                I3.f2204o = false;
                I3.f2199j &= -33;
                n2.g(I3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = n2.f2163b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2143b.invalidate();
        }
    }

    public void i(int i, C0107m c0107m) {
    }

    public final void i0(View view, N n2) {
        C0012m c0012m = this.f2142a;
        C0118y c0118y = (C0118y) c0012m.f422b;
        int indexOfChild = c0118y.f2367a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0096b) c0012m.f423c).f(indexOfChild)) {
                c0012m.v(view);
            }
            c0118y.h(indexOfChild);
        }
        n2.f(view);
    }

    public abstract int j(T t2);

    public final void j0(int i) {
        if (u(i) != null) {
            C0012m c0012m = this.f2142a;
            int k2 = c0012m.k(i);
            C0118y c0118y = (C0118y) c0012m.f422b;
            View childAt = c0118y.f2367a.getChildAt(k2);
            if (childAt == null) {
                return;
            }
            if (((C0096b) c0012m.f423c).f(k2)) {
                c0012m.v(childAt);
            }
            c0118y.h(k2);
        }
    }

    public abstract int k(T t2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int E2 = E();
        int G2 = G();
        int F = this.f2152n - F();
        int D2 = this.f2153o - D();
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
                int F2 = this.f2152n - F();
                int D3 = this.f2153o - D();
                Rect rect2 = this.f2143b.h;
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
                recyclerView.Z(i4, i5, false);
            }
            return true;
        }
        return false;
    }

    public abstract int l(T t2);

    public final void l0() {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(T t2);

    public abstract int m0(int i, N n2, T t2);

    public abstract int n(T t2);

    public abstract void n0(int i);

    public abstract int o(T t2);

    public abstract int o0(int i, N n2, T t2);

    public final void p(N n2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            W I2 = RecyclerView.I(u2);
            if (!I2.p()) {
                if (!I2.g() || I2.i() || this.f2143b.f1598k.f2369b) {
                    u(v2);
                    this.f2142a.d(v2);
                    n2.h(u2);
                    this.f2143b.f1590f.H(I2);
                } else {
                    j0(v2);
                    n2.g(I2);
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
            W I2 = RecyclerView.I(u2);
            if (I2 != null && I2.b() == i && !I2.p() && (this.f2143b.f1586c0.f2180g || !I2.i())) {
                return u2;
            }
        }
        return null;
    }

    public final void q0(int i, int i2) {
        this.f2152n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2150l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f1556s0;
        }
        this.f2153o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2151m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f1556s0;
        }
    }

    public abstract I r();

    public void r0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2143b;
        WeakHashMap weakHashMap = K.S.f365a;
        this.f2143b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D2, this.f2143b.getMinimumHeight()));
    }

    public I s(Context context, AttributeSet attributeSet) {
        return new I(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f2143b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f2143b.h;
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
        this.f2143b.h.set(i6, i4, i3, i5);
        r0(this.f2143b.h, i, i2);
    }

    public I t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof I ? new I((I) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new I((ViewGroup.MarginLayoutParams) layoutParams) : new I(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2143b = null;
            this.f2142a = null;
            this.f2152n = 0;
            this.f2153o = 0;
        } else {
            this.f2143b = recyclerView;
            this.f2142a = recyclerView.f1588e;
            this.f2152n = recyclerView.getWidth();
            this.f2153o = recyclerView.getHeight();
        }
        this.f2150l = 1073741824;
        this.f2151m = 1073741824;
    }

    public final View u(int i) {
        C0012m c0012m = this.f2142a;
        if (c0012m != null) {
            return c0012m.e(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i2, I i3) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) i3).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) i3).height)) ? false : true;
    }

    public final int v() {
        C0012m c0012m = this.f2142a;
        if (c0012m != null) {
            return c0012m.f();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i, int i2, I i3) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) i3).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) i3).height)) ? false : true;
    }

    public int x(N n2, T t2) {
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView == null || recyclerView.f1598k == null || !d()) {
            return 1;
        }
        return this.f2143b.f1598k.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f1556s0;
        I i = (I) view.getLayoutParams();
        Rect rect2 = i.f2155b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) i).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) i).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) i).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) i).bottomMargin);
    }

    public final void y0(C0115v c0115v) {
        C0115v c0115v2 = this.f2145e;
        if (c0115v2 != null && c0115v != c0115v2 && c0115v2.f2354e) {
            c0115v2.i();
        }
        this.f2145e = c0115v;
        RecyclerView recyclerView = this.f2143b;
        V v2 = recyclerView.f1580W;
        v2.f2191g.removeCallbacks(v2);
        v2.f2188c.abortAnimation();
        if (c0115v.h) {
            Log.w("RecyclerView", "An instance of " + c0115v.getClass().getSimpleName() + " was started more than once. Each instance of" + c0115v.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0115v.f2352b = recyclerView;
        c0115v.f2353c = this;
        int i = c0115v.f2351a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1586c0.f2175a = i;
        c0115v.f2354e = true;
        c0115v.d = true;
        c0115v.f2355f = recyclerView.f1600l.q(i);
        c0115v.f2352b.f1580W.a();
        c0115v.h = true;
    }

    public boolean z0() {
        return false;
    }
}
