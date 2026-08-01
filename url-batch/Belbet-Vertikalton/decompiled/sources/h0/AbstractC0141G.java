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
import g0.AbstractC0123a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: h0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0141G {

    /* renamed from: a, reason: collision with root package name */
    public I0.h f2904a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2905b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.c f2906c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.c f2907d;
    public C0170u e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2908f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2909g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2910h;
    public final boolean i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2911k;

    /* renamed from: l, reason: collision with root package name */
    public int f2912l;

    /* renamed from: m, reason: collision with root package name */
    public int f2913m;

    /* renamed from: n, reason: collision with root package name */
    public int f2914n;

    /* renamed from: o, reason: collision with root package name */
    public int f2915o;

    public AbstractC0141G() {
        C0139E c0139e = new C0139E(this, 0);
        C0139E c0139e2 = new C0139E(this, 1);
        this.f2906c = new B1.c(c0139e);
        this.f2907d = new B1.c(c0139e2);
        this.f2908f = false;
        this.f2909g = false;
        this.f2910h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((C0142H) view.getLayoutParams()).f2917b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((C0142H) view.getLayoutParams()).f2916a.b();
    }

    public static C0140F I(Context context, AttributeSet attributeSet, int i, int i2) {
        C0140F c0140f = new C0140F();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0123a.f2718a, i, i2);
        c0140f.f2900a = obtainStyledAttributes.getInt(0, 1);
        c0140f.f2901b = obtainStyledAttributes.getInt(10, 1);
        c0140f.f2902c = obtainStyledAttributes.getBoolean(9, false);
        c0140f.f2903d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c0140f;
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
        C0142H c0142h = (C0142H) view.getLayoutParams();
        Rect rect = c0142h.f2917b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0142h).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0142h).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0142h).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0142h).bottomMargin);
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
        Rect rect = ((C0142H) view.getLayoutParams()).f2917b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2905b;
        AbstractC0174y adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2905b;
        WeakHashMap weakHashMap = M.P.f711a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(C0147M c0147m, S s2) {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView == null || recyclerView.f2029k == null || !e()) {
            return 1;
        }
        return this.f2905b.f2029k.a();
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0142H) view.getLayoutParams()).f2917b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2905b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2905b.j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView != null) {
            int f2 = recyclerView.e.f();
            for (int i2 = 0; i2 < f2; i2++) {
                recyclerView.e.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView != null) {
            int f2 = recyclerView.e.f();
            for (int i2 = 0; i2 < f2; i2++) {
                recyclerView.e.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q(RecyclerView recyclerView) {
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, C0147M c0147m, S s2);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2905b;
        C0147M c0147m = recyclerView.f2014b;
        S s2 = recyclerView.f2017c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2905b.canScrollVertically(-1) && !this.f2905b.canScrollHorizontally(-1) && !this.f2905b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0174y abstractC0174y = this.f2905b.f2029k;
        if (abstractC0174y != null) {
            accessibilityEvent.setItemCount(abstractC0174y.a());
        }
    }

    public final void U(View view, N.i iVar) {
        V I2 = RecyclerView.I(view);
        if (I2 == null || I2.i() || ((ArrayList) this.f2904a.f593d).contains(I2.f2958a)) {
            return;
        }
        RecyclerView recyclerView = this.f2905b;
        V(recyclerView.f2014b, recyclerView.f2017c0, view, iVar);
    }

    public void V(C0147M c0147m, S s2, View view, N.i iVar) {
        iVar.h(N.h.a(false, e() ? H(view) : 0, 1, d() ? H(view) : 0, 1));
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
        V I2 = RecyclerView.I(view);
        if (z2 || I2.i()) {
            q.k kVar = (q.k) this.f2905b.f2021f.f68b;
            f0 f0Var = (f0) kVar.getOrDefault(I2, null);
            if (f0Var == null) {
                f0Var = f0.a();
                kVar.put(I2, f0Var);
            }
            f0Var.f3028a |= 1;
        } else {
            this.f2905b.f2021f.J(I2);
        }
        C0142H c0142h = (C0142H) view.getLayoutParams();
        if (I2.q() || I2.j()) {
            if (I2.j()) {
                I2.f2968n.j(I2);
            } else {
                I2.j &= -33;
            }
            this.f2904a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2905b) {
                I0.h hVar = this.f2904a;
                int indexOfChild = ((C0173x) hVar.f591b).f3135a.indexOfChild(view);
                if (indexOfChild != -1) {
                    F1.a aVar = (F1.a) hVar.f592c;
                    if (!aVar.d(indexOfChild)) {
                        b2 = indexOfChild - aVar.b(indexOfChild);
                        if (i == -1) {
                            i = this.f2904a.f();
                        }
                        if (b2 != -1) {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2905b.indexOfChild(view) + this.f2905b.y());
                        }
                        if (b2 != i) {
                            AbstractC0141G abstractC0141G = this.f2905b.f2031l;
                            View u2 = abstractC0141G.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + abstractC0141G.f2905b.toString());
                            }
                            abstractC0141G.u(b2);
                            abstractC0141G.f2904a.d(b2);
                            C0142H c0142h2 = (C0142H) u2.getLayoutParams();
                            V I3 = RecyclerView.I(u2);
                            if (I3.i()) {
                                q.k kVar2 = (q.k) abstractC0141G.f2905b.f2021f.f68b;
                                f0 f0Var2 = (f0) kVar2.getOrDefault(I3, null);
                                if (f0Var2 == null) {
                                    f0Var2 = f0.a();
                                    kVar2.put(I3, f0Var2);
                                }
                                f0Var2.f3028a = 1 | f0Var2.f3028a;
                            } else {
                                abstractC0141G.f2905b.f2021f.J(I3);
                            }
                            abstractC0141G.f2904a.b(u2, i, c0142h2, I3.i());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f2904a.a(view, i, false);
                c0142h.f2918c = true;
                C0170u c0170u = this.e;
                if (c0170u != null && c0170u.e) {
                    c0170u.f3118b.getClass();
                    V I4 = RecyclerView.I(view);
                    if ((I4 != null ? I4.b() : -1) == c0170u.f3117a) {
                        c0170u.f3121f = view;
                    }
                }
            }
        }
        if (c0142h.f2919d) {
            I2.f2958a.invalidate();
            c0142h.f2919d = false;
        }
    }

    public abstract void b0(C0147M c0147m, S s2);

    public void c(String str) {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(S s2);

    public abstract boolean d();

    public void d0(Parcelable parcelable) {
    }

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(C0142H c0142h) {
        return c0142h != null;
    }

    public void f0(int i) {
    }

    public final void g0(C0147M c0147m) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.I(u(v2)).p()) {
                View u2 = u(v2);
                j0(v2);
                c0147m.f(u2);
            }
        }
    }

    public void h(int i, int i2, S s2, C0162l c0162l) {
    }

    public final void h0(C0147M c0147m) {
        ArrayList arrayList;
        int size = c0147m.f2926a.size();
        int i = size - 1;
        while (true) {
            arrayList = c0147m.f2926a;
            if (i < 0) {
                break;
            }
            View view = ((V) arrayList.get(i)).f2958a;
            V I2 = RecyclerView.I(view);
            if (!I2.p()) {
                I2.o(false);
                if (I2.k()) {
                    this.f2905b.removeDetachedView(view, false);
                }
                AbstractC0137C abstractC0137C = this.f2905b.H;
                if (abstractC0137C != null) {
                    abstractC0137C.d(I2);
                }
                I2.o(true);
                V I3 = RecyclerView.I(view);
                I3.f2968n = null;
                I3.f2969o = false;
                I3.j &= -33;
                c0147m.g(I3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0147m.f2927b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2905b.invalidate();
        }
    }

    public void i(int i, C0162l c0162l) {
    }

    public final void i0(View view, C0147M c0147m) {
        I0.h hVar = this.f2904a;
        C0173x c0173x = (C0173x) hVar.f591b;
        int indexOfChild = c0173x.f3135a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((F1.a) hVar.f592c).g(indexOfChild)) {
                hVar.v(view);
            }
            c0173x.h(indexOfChild);
        }
        c0147m.f(view);
    }

    public abstract int j(S s2);

    public final void j0(int i) {
        if (u(i) != null) {
            I0.h hVar = this.f2904a;
            int k2 = hVar.k(i);
            C0173x c0173x = (C0173x) hVar.f591b;
            View childAt = c0173x.f3135a.getChildAt(k2);
            if (childAt == null) {
                return;
            }
            if (((F1.a) hVar.f592c).g(k2)) {
                hVar.v(childAt);
            }
            c0173x.h(k2);
        }
    }

    public abstract int k(S s2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int E2 = E();
        int G2 = G();
        int F2 = this.f2914n - F();
        int D2 = this.f2915o - D();
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
                int F3 = this.f2914n - F();
                int D3 = this.f2915o - D();
                Rect rect2 = this.f2905b.f2025h;
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

    public abstract int l(S s2);

    public final void l0() {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(S s2);

    public abstract int m0(int i, C0147M c0147m, S s2);

    public abstract int n(S s2);

    public abstract void n0(int i);

    public abstract int o(S s2);

    public abstract int o0(int i, C0147M c0147m, S s2);

    public final void p(C0147M c0147m) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            V I2 = RecyclerView.I(u2);
            if (!I2.p()) {
                if (!I2.g() || I2.i() || this.f2905b.f2029k.f3137b) {
                    u(v2);
                    this.f2904a.d(v2);
                    c0147m.h(u2);
                    this.f2905b.f2021f.J(I2);
                } else {
                    j0(v2);
                    c0147m.g(I2);
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
            V I2 = RecyclerView.I(u2);
            if (I2 != null && I2.b() == i && !I2.p() && (this.f2905b.f2017c0.f2945g || !I2.i())) {
                return u2;
            }
        }
        return null;
    }

    public final void q0(int i, int i2) {
        this.f2914n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2912l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.s0;
        }
        this.f2915o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2913m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.s0;
        }
    }

    public abstract C0142H r();

    public void r0(Rect rect, int i, int i2) {
        int F2 = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2905b;
        WeakHashMap weakHashMap = M.P.f711a;
        this.f2905b.setMeasuredDimension(g(i, F2, recyclerView.getMinimumWidth()), g(i2, D2, this.f2905b.getMinimumHeight()));
    }

    public C0142H s(Context context, AttributeSet attributeSet) {
        return new C0142H(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f2905b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f2905b.f2025h;
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
        this.f2905b.f2025h.set(i6, i4, i3, i5);
        r0(this.f2905b.f2025h, i, i2);
    }

    public C0142H t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0142H ? new C0142H((C0142H) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0142H((ViewGroup.MarginLayoutParams) layoutParams) : new C0142H(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2905b = null;
            this.f2904a = null;
            this.f2914n = 0;
            this.f2915o = 0;
        } else {
            this.f2905b = recyclerView;
            this.f2904a = recyclerView.e;
            this.f2914n = recyclerView.getWidth();
            this.f2915o = recyclerView.getHeight();
        }
        this.f2912l = 1073741824;
        this.f2913m = 1073741824;
    }

    public final View u(int i) {
        I0.h hVar = this.f2904a;
        if (hVar != null) {
            return hVar.e(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i2, C0142H c0142h) {
        return (!view.isLayoutRequested() && this.f2910h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0142h).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0142h).height)) ? false : true;
    }

    public final int v() {
        I0.h hVar = this.f2904a;
        if (hVar != null) {
            return hVar.f();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i, int i2, C0142H c0142h) {
        return (this.f2910h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0142h).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0142h).height)) ? false : true;
    }

    public int x(C0147M c0147m, S s2) {
        RecyclerView recyclerView = this.f2905b;
        if (recyclerView == null || recyclerView.f2029k == null || !d()) {
            return 1;
        }
        return this.f2905b.f2029k.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.s0;
        C0142H c0142h = (C0142H) view.getLayoutParams();
        Rect rect2 = c0142h.f2917b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0142h).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0142h).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0142h).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0142h).bottomMargin);
    }

    public final void y0(C0170u c0170u) {
        C0170u c0170u2 = this.e;
        if (c0170u2 != null && c0170u != c0170u2 && c0170u2.e) {
            c0170u2.i();
        }
        this.e = c0170u;
        RecyclerView recyclerView = this.f2905b;
        U u2 = recyclerView.f2011W;
        u2.f2956g.removeCallbacks(u2);
        u2.f2953c.abortAnimation();
        if (c0170u.f3123h) {
            Log.w("RecyclerView", "An instance of " + c0170u.getClass().getSimpleName() + " was started more than once. Each instance of" + c0170u.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0170u.f3118b = recyclerView;
        c0170u.f3119c = this;
        int i = c0170u.f3117a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f2017c0.f2940a = i;
        c0170u.e = true;
        c0170u.f3120d = true;
        c0170u.f3121f = recyclerView.f2031l.q(i);
        c0170u.f3118b.f2011W.a();
        c0170u.f3123h = true;
    }

    public boolean z0() {
        return false;
    }
}
