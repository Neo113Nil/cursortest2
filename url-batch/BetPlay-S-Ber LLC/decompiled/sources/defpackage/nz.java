package defpackage;

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
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class nz {
    public r6 a;
    public RecyclerView b;
    public final h5 c;
    public final h5 d;
    public wq e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public nz() {
        lz lzVar = new lz(this, 0);
        lz lzVar2 = new lz(this, 1);
        this.c = new h5(lzVar);
        this.d = new h5(lzVar2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((oz) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((oz) view.getLayoutParams()).a.b();
    }

    public static mz I(Context context, AttributeSet attributeSet, int i, int i2) {
        mz mzVar = new mz();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ky.a, i, i2);
        mzVar.a = obtainStyledAttributes.getInt(0, 1);
        mzVar.b = obtainStyledAttributes.getInt(10, 1);
        mzVar.c = obtainStyledAttributes.getBoolean(9, false);
        mzVar.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return mzVar;
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
        oz ozVar = (oz) view.getLayoutParams();
        Rect rect = ozVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) ozVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) ozVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) ozVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) ozVar).bottomMargin);
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
    public static int w(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z) {
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
        Rect rect = ((oz) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        fz adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = e90.a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(tz tzVar, zz zzVar) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((oz) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.p;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int i2 = recyclerView.j.i();
            for (int i3 = 0; i3 < i2; i3++) {
                recyclerView.j.h(i3).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int i2 = recyclerView.j.i();
            for (int i3 = 0; i3 < i2; i3++) {
                recyclerView.j.h(i3).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, tz tzVar, zz zzVar);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        tz tzVar = recyclerView.g;
        zz zzVar = recyclerView.k0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        fz fzVar = this.b.q;
        if (fzVar != null) {
            accessibilityEvent.setItemCount(fzVar.a());
        }
    }

    public final void W(View view, i0 i0Var) {
        c00 I = RecyclerView.I(view);
        if (I == null || I.h()) {
            return;
        }
        r6 r6Var = this.a;
        if (((ArrayList) r6Var.d).contains(I.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        V(recyclerView.g, recyclerView.k0, view, i0Var);
    }

    public final void b(View view, int i, boolean z) {
        c00 I = RecyclerView.I(view);
        if (z || I.h()) {
            h30 h30Var = (h30) this.b.k.g;
            l90 l90Var = (l90) h30Var.get(I);
            if (l90Var == null) {
                l90Var = l90.a();
                h30Var.put(I, l90Var);
            }
            l90Var.a |= 1;
        } else {
            this.b.k.J(I);
        }
        oz ozVar = (oz) view.getLayoutParams();
        if (I.p() || I.i()) {
            if (I.i()) {
                I.n.k(I);
            } else {
                I.j &= -33;
            }
            this.a.b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            r6 r6Var = this.a;
            if (parent == recyclerView) {
                aa aaVar = (aa) r6Var.c;
                int indexOfChild = ((ez) r6Var.b).a.indexOfChild(view);
                int b = (indexOfChild == -1 || aaVar.d(indexOfChild)) ? -1 : indexOfChild - aaVar.b(indexOfChild);
                if (i == -1) {
                    i = this.a.i();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.y());
                }
                if (b != i) {
                    nz nzVar = this.b.r;
                    View u = nzVar.u(b);
                    if (u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b + nzVar.b.toString());
                    }
                    nzVar.u(b);
                    nzVar.a.d(b);
                    oz ozVar2 = (oz) u.getLayoutParams();
                    c00 I2 = RecyclerView.I(u);
                    boolean h = I2.h();
                    RecyclerView recyclerView2 = nzVar.b;
                    if (h) {
                        h30 h30Var2 = (h30) recyclerView2.k.g;
                        l90 l90Var2 = (l90) h30Var2.get(I2);
                        if (l90Var2 == null) {
                            l90Var2 = l90.a();
                            h30Var2.put(I2, l90Var2);
                        }
                        l90Var2.a = 1 | l90Var2.a;
                    } else {
                        recyclerView2.k.J(I2);
                    }
                    nzVar.a.b(u, i, ozVar2, I2.h());
                }
            } else {
                r6Var.a(view, i, false);
                ozVar.c = true;
                wq wqVar = this.e;
                if (wqVar != null && wqVar.e) {
                    wqVar.b.getClass();
                    c00 I3 = RecyclerView.I(view);
                    if ((I3 != null ? I3.b() : -1) == wqVar.a) {
                        wqVar.f = view;
                    }
                }
            }
        }
        if (ozVar.d) {
            I.a.invalidate();
            ozVar.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(tz tzVar, zz zzVar);

    public abstract boolean d();

    public abstract void d0(zz zzVar);

    public abstract boolean e();

    public boolean f(oz ozVar) {
        return ozVar != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(tz tzVar) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.I(u(v)).o()) {
                View u = u(v);
                k0(v);
                tzVar.g(u);
            }
        }
    }

    public final void i0(tz tzVar) {
        ArrayList arrayList;
        int size = tzVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = tzVar.a;
            if (i < 0) {
                break;
            }
            View view = ((c00) arrayList.get(i)).a;
            c00 I = RecyclerView.I(view);
            if (!I.o()) {
                I.n(false);
                if (I.j()) {
                    this.b.removeDetachedView(view, false);
                }
                jz jzVar = this.b.P;
                if (jzVar != null) {
                    jzVar.d(I);
                }
                I.n(true);
                c00 I2 = RecyclerView.I(view);
                I2.n = null;
                I2.o = false;
                I2.j &= -33;
                tzVar.h(I2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = tzVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(zz zzVar);

    public final void j0(View view, tz tzVar) {
        r6 r6Var = this.a;
        ez ezVar = (ez) r6Var.b;
        int indexOfChild = ezVar.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((aa) r6Var.c).g(indexOfChild)) {
                r6Var.y(view);
            }
            ezVar.h(indexOfChild);
        }
        tzVar.g(view);
    }

    public abstract int k(zz zzVar);

    public final void k0(int i) {
        if (u(i) != null) {
            r6 r6Var = this.a;
            int o = r6Var.o(i);
            ez ezVar = (ez) r6Var.b;
            View childAt = ezVar.a.getChildAt(o);
            if (childAt == null) {
                return;
            }
            if (((aa) r6Var.c).g(o)) {
                r6Var.y(childAt);
            }
            ezVar.h(o);
        }
    }

    public abstract int l(zz zzVar);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int E = E();
        int G = G();
        int F = this.n - F();
        int D = this.o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E;
        int min = Math.min(0, i);
        int i2 = top - G;
        int min2 = Math.min(0, i2);
        int i3 = width - F;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - D);
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
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E2 = E();
                int G2 = G();
                int F2 = this.n - F();
                int D2 = this.o - D();
                Rect rect2 = this.b.n;
                y(focusedChild, rect2);
                if (rect2.left - i4 < F2) {
                    if (rect2.right - i4 > E2) {
                        if (rect2.top - i5 < D2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.a0(i4, false, i5);
            return true;
        }
        return false;
    }

    public abstract int m(zz zzVar);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(zz zzVar);

    public abstract int n0(int i, tz tzVar, zz zzVar);

    public abstract int o(zz zzVar);

    public abstract void o0(int i);

    public final void p(tz tzVar) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            c00 I = RecyclerView.I(u);
            if (!I.o()) {
                if (!I.f() || I.h() || this.b.q.b) {
                    u(v);
                    this.a.d(v);
                    tzVar.i(u);
                    this.b.k.J(I);
                } else {
                    k0(v);
                    tzVar.h(I);
                }
            }
        }
    }

    public abstract int p0(int i, tz tzVar, zz zzVar);

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            c00 I = RecyclerView.I(u);
            if (I != null && I.b() == i && !I.o() && (this.b.k0.g || !I.h())) {
                return u;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract oz r();

    public final void r0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.D0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.D0;
        }
    }

    public oz s(Context context, AttributeSet attributeSet) {
        return new oz(context, attributeSet);
    }

    public void s0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = e90.a;
        this.b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D, this.b.getMinimumHeight()));
    }

    public oz t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof oz ? new oz((oz) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new oz((ViewGroup.MarginLayoutParams) layoutParams) : new oz(layoutParams);
    }

    public final void t0(int i, int i2) {
        int v = v();
        if (v == 0) {
            this.b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v; i7++) {
            View u = u(i7);
            Rect rect = this.b.n;
            y(u, rect);
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
        this.b.n.set(i6, i4, i3, i5);
        s0(this.b.n, i, i2);
    }

    public final View u(int i) {
        r6 r6Var = this.a;
        if (r6Var != null) {
            return r6Var.h(i);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.j;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final int v() {
        r6 r6Var = this.a;
        if (r6Var != null) {
            return r6Var.i();
        }
        return 0;
    }

    public final boolean v0(View view, int i, int i2, oz ozVar) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) ozVar).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) ozVar).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(tz tzVar, zz zzVar) {
        return -1;
    }

    public final boolean x0(View view, int i, int i2, oz ozVar) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) ozVar).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) ozVar).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.D0;
        oz ozVar = (oz) view.getLayoutParams();
        Rect rect2 = ozVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) ozVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) ozVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) ozVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) ozVar).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i);

    public final void z0(wq wqVar) {
        wq wqVar2 = this.e;
        if (wqVar2 != null && wqVar != wqVar2 && wqVar2.e) {
            wqVar2.i();
        }
        this.e = wqVar;
        RecyclerView recyclerView = this.b;
        b00 b00Var = recyclerView.h0;
        b00Var.l.removeCallbacks(b00Var);
        b00Var.h.abortAnimation();
        if (wqVar.h) {
            Log.w("RecyclerView", "An instance of " + wqVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wqVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wqVar.b = recyclerView;
        wqVar.c = this;
        int i = wqVar.a;
        if (i == -1) {
            o8.j("Invalid target position");
            return;
        }
        recyclerView.k0.a = i;
        wqVar.e = true;
        wqVar.d = true;
        wqVar.f = recyclerView.r.q(i);
        wqVar.b.h0.a();
        wqVar.h = true;
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

    public void X(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void i(int i, sm smVar) {
    }

    public void V(tz tzVar, zz zzVar, View view, i0 i0Var) {
    }

    public void h(int i, int i2, zz zzVar, sm smVar) {
    }
}
