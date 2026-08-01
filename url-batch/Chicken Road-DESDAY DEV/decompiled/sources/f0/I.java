package f0;

import K.C0011l;
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
import e0.AbstractC0085a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public C0011l f2025a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2026b;

    /* renamed from: c, reason: collision with root package name */
    public final B.j f2027c;
    public final B.j d;

    /* renamed from: e, reason: collision with root package name */
    public C0112v f2028e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2029f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2030g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f2031j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2032k;

    /* renamed from: l, reason: collision with root package name */
    public int f2033l;

    /* renamed from: m, reason: collision with root package name */
    public int f2034m;

    /* renamed from: n, reason: collision with root package name */
    public int f2035n;

    /* renamed from: o, reason: collision with root package name */
    public int f2036o;

    public I() {
        G g2 = new G(this, 0);
        G g3 = new G(this, 1);
        this.f2027c = new B.j(g2);
        this.d = new B.j(g3);
        this.f2029f = false;
        this.f2030g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((J) view.getLayoutParams()).f2038b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((J) view.getLayoutParams()).f2037a.b();
    }

    public static H I(Context context, AttributeSet attributeSet, int i, int i2) {
        H h = new H();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0085a.f1989a, i, i2);
        h.f2022a = obtainStyledAttributes.getInt(0, 1);
        h.f2023b = obtainStyledAttributes.getInt(10, 1);
        h.f2024c = obtainStyledAttributes.getBoolean(9, false);
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
        Rect rect = j2.f2038b;
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
        Rect rect = ((J) view.getLayoutParams()).f2038b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2026b;
        AbstractC0086A adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2026b;
        WeakHashMap weakHashMap = K.S.f369a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2026b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2026b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2026b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2026b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(O o2, U u2) {
        RecyclerView recyclerView = this.f2026b;
        if (recyclerView == null || recyclerView.f1511k == null || !e()) {
            return 1;
        }
        return this.f2026b.f1511k.a();
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((J) view.getLayoutParams()).f2038b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2026b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2026b.f1509j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f2026b;
        if (recyclerView != null) {
            int f2 = recyclerView.f1501e.f();
            for (int i2 = 0; i2 < f2; i2++) {
                recyclerView.f1501e.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f2026b;
        if (recyclerView != null) {
            int f2 = recyclerView.f1501e.f();
            for (int i2 = 0; i2 < f2; i2++) {
                recyclerView.f1501e.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q(RecyclerView recyclerView) {
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, O o2, U u2);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2026b;
        O o2 = recyclerView.f1496b;
        U u2 = recyclerView.f1499c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2026b.canScrollVertically(-1) && !this.f2026b.canScrollHorizontally(-1) && !this.f2026b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0086A abstractC0086A = this.f2026b.f1511k;
        if (abstractC0086A != null) {
            accessibilityEvent.setItemCount(abstractC0086A.a());
        }
    }

    public final void U(View view, L.j jVar) {
        X I2 = RecyclerView.I(view);
        if (I2 == null || I2.i() || ((ArrayList) this.f2025a.d).contains(I2.f2076a)) {
            return;
        }
        RecyclerView recyclerView = this.f2026b;
        V(recyclerView.f1496b, recyclerView.f1499c0, view, jVar);
    }

    public void V(O o2, U u2, View view, L.j jVar) {
        jVar.h(L.i.a(false, e() ? H(view) : 0, 1, d() ? H(view) : 0, 1));
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
            o.k kVar = (o.k) this.f2026b.f1503f.f27b;
            h0 h0Var = (h0) kVar.getOrDefault(I2, null);
            if (h0Var == null) {
                h0Var = h0.a();
                kVar.put(I2, h0Var);
            }
            h0Var.f2152a |= 1;
        } else {
            this.f2026b.f1503f.H(I2);
        }
        J j2 = (J) view.getLayoutParams();
        if (I2.q() || I2.j()) {
            if (I2.j()) {
                I2.f2086n.j(I2);
            } else {
                I2.f2082j &= -33;
            }
            this.f2025a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2026b) {
                C0011l c0011l = this.f2025a;
                int indexOfChild = ((C0116z) c0011l.f422b).f2253a.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0093b c0093b = (C0093b) c0011l.f423c;
                    if (!c0093b.d(indexOfChild)) {
                        b2 = indexOfChild - c0093b.b(indexOfChild);
                        if (i == -1) {
                            i = this.f2025a.f();
                        }
                        if (b2 != -1) {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2026b.indexOfChild(view) + this.f2026b.y());
                        }
                        if (b2 != i) {
                            I i2 = this.f2026b.f1513l;
                            View u2 = i2.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + i2.f2026b.toString());
                            }
                            i2.u(b2);
                            i2.f2025a.d(b2);
                            J j3 = (J) u2.getLayoutParams();
                            X I3 = RecyclerView.I(u2);
                            if (I3.i()) {
                                o.k kVar2 = (o.k) i2.f2026b.f1503f.f27b;
                                h0 h0Var2 = (h0) kVar2.getOrDefault(I3, null);
                                if (h0Var2 == null) {
                                    h0Var2 = h0.a();
                                    kVar2.put(I3, h0Var2);
                                }
                                h0Var2.f2152a = 1 | h0Var2.f2152a;
                            } else {
                                i2.f2026b.f1503f.H(I3);
                            }
                            i2.f2025a.b(u2, i, j3, I3.i());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f2025a.a(view, i, false);
                j2.f2039c = true;
                C0112v c0112v = this.f2028e;
                if (c0112v != null && c0112v.f2238e) {
                    c0112v.f2236b.getClass();
                    X I4 = RecyclerView.I(view);
                    if ((I4 != null ? I4.b() : -1) == c0112v.f2235a) {
                        c0112v.f2239f = view;
                    }
                }
            }
        }
        if (j2.d) {
            I2.f2076a.invalidate();
            j2.d = false;
        }
    }

    public abstract void b0(O o2, U u2);

    public void c(String str) {
        RecyclerView recyclerView = this.f2026b;
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

    public void h(int i, int i2, U u2, C0104m c0104m) {
    }

    public final void h0(O o2) {
        ArrayList arrayList;
        int size = o2.f2045a.size();
        int i = size - 1;
        while (true) {
            arrayList = o2.f2045a;
            if (i < 0) {
                break;
            }
            View view = ((X) arrayList.get(i)).f2076a;
            X I2 = RecyclerView.I(view);
            if (!I2.p()) {
                I2.o(false);
                if (I2.k()) {
                    this.f2026b.removeDetachedView(view, false);
                }
                AbstractC0090E abstractC0090E = this.f2026b.f1478H;
                if (abstractC0090E != null) {
                    abstractC0090E.d(I2);
                }
                I2.o(true);
                X I3 = RecyclerView.I(view);
                I3.f2086n = null;
                I3.f2087o = false;
                I3.f2082j &= -33;
                o2.g(I3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = o2.f2046b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2026b.invalidate();
        }
    }

    public void i(int i, C0104m c0104m) {
    }

    public final void i0(View view, O o2) {
        C0011l c0011l = this.f2025a;
        C0116z c0116z = (C0116z) c0011l.f422b;
        int indexOfChild = c0116z.f2253a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0093b) c0011l.f423c).g(indexOfChild)) {
                c0011l.v(view);
            }
            c0116z.h(indexOfChild);
        }
        o2.f(view);
    }

    public abstract int j(U u2);

    public final void j0(int i) {
        if (u(i) != null) {
            C0011l c0011l = this.f2025a;
            int k2 = c0011l.k(i);
            C0116z c0116z = (C0116z) c0011l.f422b;
            View childAt = c0116z.f2253a.getChildAt(k2);
            if (childAt == null) {
                return;
            }
            if (((C0093b) c0011l.f423c).g(k2)) {
                c0011l.v(childAt);
            }
            c0116z.h(k2);
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
        int F = this.f2035n - F();
        int D2 = this.f2036o - D();
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
                int F2 = this.f2035n - F();
                int D3 = this.f2036o - D();
                Rect rect2 = this.f2026b.h;
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

    public abstract int l(U u2);

    public final void l0() {
        RecyclerView recyclerView = this.f2026b;
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
                if (!I2.g() || I2.i() || this.f2026b.f1511k.f2014b) {
                    u(v2);
                    this.f2025a.d(v2);
                    o2.h(u2);
                    this.f2026b.f1503f.H(I2);
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
            if (I2 != null && I2.b() == i && !I2.p() && (this.f2026b.f1499c0.f2063g || !I2.i())) {
                return u2;
            }
        }
        return null;
    }

    public final void q0(int i, int i2) {
        this.f2035n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2033l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f1469s0;
        }
        this.f2036o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2034m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f1469s0;
        }
    }

    public abstract J r();

    public void r0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2026b;
        WeakHashMap weakHashMap = K.S.f369a;
        this.f2026b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D2, this.f2026b.getMinimumHeight()));
    }

    public J s(Context context, AttributeSet attributeSet) {
        return new J(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f2026b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f2026b.h;
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
        this.f2026b.h.set(i6, i4, i3, i5);
        r0(this.f2026b.h, i, i2);
    }

    public J t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof J ? new J((J) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new J((ViewGroup.MarginLayoutParams) layoutParams) : new J(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2026b = null;
            this.f2025a = null;
            this.f2035n = 0;
            this.f2036o = 0;
        } else {
            this.f2026b = recyclerView;
            this.f2025a = recyclerView.f1501e;
            this.f2035n = recyclerView.getWidth();
            this.f2036o = recyclerView.getHeight();
        }
        this.f2033l = 1073741824;
        this.f2034m = 1073741824;
    }

    public final View u(int i) {
        C0011l c0011l = this.f2025a;
        if (c0011l != null) {
            return c0011l.e(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i2, J j2) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) j2).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) j2).height)) ? false : true;
    }

    public final int v() {
        C0011l c0011l = this.f2025a;
        if (c0011l != null) {
            return c0011l.f();
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
        RecyclerView recyclerView = this.f2026b;
        if (recyclerView == null || recyclerView.f1511k == null || !d()) {
            return 1;
        }
        return this.f2026b.f1511k.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f1469s0;
        J j2 = (J) view.getLayoutParams();
        Rect rect2 = j2.f2038b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) j2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) j2).bottomMargin);
    }

    public final void y0(C0112v c0112v) {
        C0112v c0112v2 = this.f2028e;
        if (c0112v2 != null && c0112v != c0112v2 && c0112v2.f2238e) {
            c0112v2.i();
        }
        this.f2028e = c0112v;
        RecyclerView recyclerView = this.f2026b;
        W w2 = recyclerView.f1493W;
        w2.f2074g.removeCallbacks(w2);
        w2.f2071c.abortAnimation();
        if (c0112v.h) {
            Log.w("RecyclerView", "An instance of " + c0112v.getClass().getSimpleName() + " was started more than once. Each instance of" + c0112v.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0112v.f2236b = recyclerView;
        c0112v.f2237c = this;
        int i = c0112v.f2235a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1499c0.f2058a = i;
        c0112v.f2238e = true;
        c0112v.d = true;
        c0112v.f2239f = recyclerView.f1513l.q(i);
        c0112v.f2236b.f1493W.a();
        c0112v.h = true;
    }

    public boolean z0() {
        return false;
    }
}
