package androidx.recyclerview.widget;

import a0.g1;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import h4.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.t0;
import q3.c0;
import q3.k0;
import r5.m;
import u.i1;
import v4.a;
import w4.a0;
import w4.b0;
import w4.d0;
import w4.e0;
import w4.f0;
import w4.g;
import w4.g0;
import w4.h0;
import w4.i0;
import w4.j;
import w4.j0;
import w4.l;
import w4.l0;
import w4.m0;
import w4.n0;
import w4.o0;
import w4.p0;
import w4.r0;
import w4.v;
import w4.w;
import w4.w0;
import w4.x;
import w4.y;
import w4.z;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f905n0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: o0, reason: collision with root package name */
    public static final Class[] f906o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final v f907p0;
    public boolean A;
    public int B;
    public final int C;
    public z D;
    public EdgeEffect E;
    public EdgeEffect F;
    public EdgeEffect G;
    public EdgeEffect H;
    public a0 I;
    public int J;
    public int K;
    public VelocityTracker L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final int R;
    public final int S;
    public final float T;
    public final float U;
    public boolean V;
    public final o0 W;

    /* renamed from: a0, reason: collision with root package name */
    public l f908a0;

    /* renamed from: b0, reason: collision with root package name */
    public final m f909b0;

    /* renamed from: c0, reason: collision with root package name */
    public final m0 f910c0;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f911d;

    /* renamed from: d0, reason: collision with root package name */
    public g0 f912d0;

    /* renamed from: e, reason: collision with root package name */
    public l0 f913e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f914e0;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f915f;

    /* renamed from: f0, reason: collision with root package name */
    public final w f916f0;

    /* renamed from: g, reason: collision with root package name */
    public final g1 f917g;

    /* renamed from: g0, reason: collision with root package name */
    public r0 f918g0;

    /* renamed from: h, reason: collision with root package name */
    public final a0.a0 f919h;

    /* renamed from: h0, reason: collision with root package name */
    public q3.m f920h0;
    public boolean i;

    /* renamed from: i0, reason: collision with root package name */
    public final int[] f921i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f922j;

    /* renamed from: j0, reason: collision with root package name */
    public final int[] f923j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f924k;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f925k0;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f926l;

    /* renamed from: l0, reason: collision with root package name */
    public final ArrayList f927l0;

    /* renamed from: m, reason: collision with root package name */
    public d0 f928m;

    /* renamed from: m0, reason: collision with root package name */
    public final b f929m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f930n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f931o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f932p;

    /* renamed from: q, reason: collision with root package name */
    public j f933q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f934r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f935s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f936t;

    /* renamed from: u, reason: collision with root package name */
    public int f937u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f938v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f939w;

    /* renamed from: x, reason: collision with root package name */
    public int f940x;

    /* renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f941y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f942z;

    static {
        Class cls = Integer.TYPE;
        f906o0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f907p0 = new v(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.snovikpovik.vuevnxsj.R.attr.recyclerViewStyle);
    }

    public static void e(p0 p0Var) {
        WeakReference weakReference = p0Var.f8004a;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            p0Var.f8004a = null;
        }
    }

    private q3.m getScrollingChildHelper() {
        if (this.f920h0 == null) {
            this.f920h0 = new q3.m(this);
        }
        return this.f920h0;
    }

    public static p0 s(View view) {
        if (view == null) {
            return null;
        }
        ((e0) view.getLayoutParams()).getClass();
        return null;
    }

    public final void A(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f922j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof e0) {
            e0 e0Var = (e0) layoutParams;
            if (!e0Var.f7909b) {
                Rect rect2 = e0Var.f7908a;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f928m.V(this, view, this.f922j, !this.f936t, view2 == null);
    }

    public final void B() {
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        H(0);
        EdgeEffect edgeEffect = this.E;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.E.isFinished();
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.G;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.H;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.H.isFinished();
        }
        if (z3) {
            Field field = k0.f6120a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(int i, int i8, MotionEvent motionEvent, int i9) {
        boolean z3;
        g();
        if (!this.f931o.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f925k0;
        iArr[0] = 0;
        iArr[1] = 0;
        k(0, 0, 0, 0, this.f921i0, i9, iArr);
        int i10 = iArr[0];
        int i11 = 0 - i10;
        int i12 = iArr[1];
        int i13 = 0 - i12;
        boolean z7 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.O;
        int[] iArr2 = this.f921i0;
        int i15 = iArr2[0];
        this.O = i14 - i15;
        int i16 = this.P;
        int i17 = iArr2[1];
        this.P = i16 - i17;
        int[] iArr3 = this.f923j0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x7 = motionEvent.getX();
                float f6 = i11;
                float y7 = motionEvent.getY();
                float f8 = i13;
                if (f6 < 0.0f) {
                    m();
                    u3.b.a(this.E, (-f6) / getWidth(), 1.0f - (y7 / getHeight()));
                } else if (f6 > 0.0f) {
                    n();
                    u3.b.a(this.G, f6 / getWidth(), y7 / getHeight());
                } else {
                    z3 = false;
                    if (f8 >= 0.0f) {
                        o();
                        u3.b.a(this.F, (-f8) / getHeight(), x7 / getWidth());
                    } else {
                        if (f8 > 0.0f) {
                            l();
                            u3.b.a(this.H, f8 / getHeight(), 1.0f - (x7 / getWidth()));
                        }
                        if (!z3 || f6 != 0.0f || f8 != 0.0f) {
                            Field field = k0.f6120a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z3 = true;
                    if (!z3) {
                    }
                    Field field2 = k0.f6120a;
                    postInvalidateOnAnimation();
                }
                z3 = true;
                if (f8 >= 0.0f) {
                }
                z3 = true;
                if (!z3) {
                }
                Field field22 = k0.f6120a;
                postInvalidateOnAnimation();
            }
            f(i, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return z7;
    }

    public final void D(int i, int i8, int[] iArr) {
        F();
        w();
        int i9 = m3.b.f5221a;
        Trace.beginSection("RV Scroll");
        int scrollState = getScrollState();
        m0 m0Var = this.f910c0;
        if (scrollState == 2) {
            OverScroller overScroller = this.W.f7996f;
            overScroller.getFinalX();
            overScroller.getCurrX();
            m0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
        } else {
            m0Var.getClass();
        }
        j0 j0Var = this.f911d;
        int X = i != 0 ? this.f928m.X(i, j0Var, m0Var) : 0;
        int Y = i8 != 0 ? this.f928m.Y(i8, j0Var, m0Var) : 0;
        Trace.endSection();
        g1 g1Var = this.f917g;
        int o2 = g1Var.o();
        for (int i10 = 0; i10 < o2; i10++) {
            View n6 = g1Var.n(i10);
            ViewParent parent = n6.getParent();
            if (parent != null && parent != this) {
                throw new IllegalArgumentException("View " + n6 + " is not a direct child of " + this);
            }
            s(n6);
        }
        x(true);
        G(false);
        if (iArr != null) {
            iArr[0] = X;
            iArr[1] = Y;
        }
    }

    public final void E(int i, int i8, boolean z3) {
        d0 d0Var = this.f928m;
        if (d0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f938v) {
            return;
        }
        int i9 = !d0Var.c() ? 0 : i;
        int i10 = !this.f928m.d() ? 0 : i8;
        if (i9 == 0 && i10 == 0) {
            return;
        }
        if (z3) {
            int i11 = i9 != 0 ? 1 : 0;
            if (i10 != 0) {
                i11 |= 2;
            }
            getScrollingChildHelper().g(i11, 1);
        }
        o0 o0Var = this.W;
        RecyclerView recyclerView = o0Var.f7999j;
        int abs = Math.abs(i9);
        int abs2 = Math.abs(i10);
        boolean z7 = abs > abs2;
        int width = z7 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z7) {
            abs = abs2;
        }
        int min = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        v vVar = f907p0;
        if (o0Var.f7997g != vVar) {
            o0Var.f7997g = vVar;
            o0Var.f7996f = new OverScroller(recyclerView.getContext(), vVar);
        }
        o0Var.f7995e = 0;
        o0Var.f7994d = 0;
        recyclerView.setScrollState(2);
        o0Var.f7996f.startScroll(0, 0, i9, i10, min);
        o0Var.a();
    }

    public final void F() {
        this.f937u++;
    }

    public final void G(boolean z3) {
        if (this.f937u < 1) {
            this.f937u = 1;
        }
        this.f937u--;
    }

    public final void H(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i8) {
        d0 d0Var = this.f928m;
        if (d0Var != null) {
            d0Var.getClass();
        }
        super.addFocusables(arrayList, i, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e0) && this.f928m.e((e0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        d0 d0Var = this.f928m;
        if (d0Var != null && d0Var.c()) {
            return this.f928m.g(this.f910c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        d0 d0Var = this.f928m;
        if (d0Var != null && d0Var.c()) {
            return this.f928m.h(this.f910c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        d0 d0Var = this.f928m;
        if (d0Var != null && d0Var.c()) {
            return this.f928m.i(this.f910c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        d0 d0Var = this.f928m;
        if (d0Var != null && d0Var.d()) {
            return this.f928m.j(this.f910c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        d0 d0Var = this.f928m;
        if (d0Var != null && d0Var.d()) {
            return this.f928m.k(this.f910c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        d0 d0Var = this.f928m;
        if (d0Var != null && d0Var.d()) {
            return this.f928m.l(this.f910c0);
        }
        return 0;
    }

    public final void d(String str) {
        if (this.B > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + p());
        }
        if (this.C > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + p()));
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f8, boolean z3) {
        return getScrollingChildHelper().a(f6, f8, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f8) {
        return getScrollingChildHelper().b(f6, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().d(i, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.f931o;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i = 0; i < size; i++) {
            ((b0) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.E;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.E;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.F;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.G;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.G;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.H;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.H;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z3 |= z7;
            canvas.restoreToCount(save4);
        }
        if ((z3 || this.I == null || arrayList.size() <= 0 || !this.I.d()) ? z3 : true) {
            Field field = k0.f6120a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    public final void f(int i, int i8) {
        boolean z3;
        EdgeEffect edgeEffect = this.E;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z3 = false;
        } else {
            this.E.onRelease();
            z3 = this.E.isFinished();
        }
        EdgeEffect edgeEffect2 = this.G;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.G.onRelease();
            z3 |= this.G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.F.onRelease();
            z3 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.H;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.H.onRelease();
            z3 |= this.H.isFinished();
        }
        if (z3) {
            Field field = k0.f6120a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        if (r4 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
    
        if (r7 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        if (r4 < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
    
        if (r7 < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
    
        if ((r7 * r1) <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        if ((r7 * r1) >= 0) goto L84;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        int i8;
        this.f928m.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            A(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && findNextFocus != view && q(findNextFocus) != null) {
            if (view != null && q(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f922j;
                char c8 = 0;
                rect.set(0, 0, width, height);
                int width2 = findNextFocus.getWidth();
                int height2 = findNextFocus.getHeight();
                Rect rect2 = this.f924k;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect2);
                RecyclerView recyclerView = this.f928m.f7900b;
                Field field = k0.f6120a;
                int i9 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
                int i10 = rect.left;
                int i11 = rect2.left;
                if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
                    i8 = 1;
                } else {
                    int i12 = rect.right;
                    int i13 = rect2.right;
                    i8 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? -1 : 0;
                }
                int i14 = rect.top;
                int i15 = rect2.top;
                if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
                    c8 = 1;
                } else {
                    int i16 = rect.bottom;
                    int i17 = rect2.bottom;
                    if ((i16 > i17 || i14 >= i17) && i14 > i15) {
                        c8 = 65535;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i + p());
                                    }
                                }
                            }
                        }
                    } else if (c8 <= 0) {
                        if (c8 == 0) {
                        }
                    }
                } else if (c8 >= 0) {
                    if (c8 == 0) {
                    }
                }
            }
            return findNextFocus;
        }
        return super.focusSearch(view, i);
    }

    public final void g() {
        if (!this.f936t || this.f942z) {
            int i = m3.b.f5221a;
            Trace.beginSection("RV FullInvalidate");
            i();
            Trace.endSection();
            return;
        }
        g1 g1Var = this.f915f;
        if (g1Var.y()) {
            g1Var.getClass();
            if (g1Var.y()) {
                int i8 = m3.b.f5221a;
                Trace.beginSection("RV FullInvalidate");
                i();
                Trace.endSection();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d0 d0Var = this.f928m;
        if (d0Var != null) {
            return d0Var.m();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        d0 d0Var = this.f928m;
        if (d0Var != null) {
            return d0Var.n(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public x getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        d0 d0Var = this.f928m;
        if (d0Var == null) {
            return super.getBaseline();
        }
        d0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i8) {
        return super.getChildDrawingOrder(i, i8);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.i;
    }

    public r0 getCompatAccessibilityDelegate() {
        return this.f918g0;
    }

    public z getEdgeEffectFactory() {
        return this.D;
    }

    public a0 getItemAnimator() {
        return this.I;
    }

    public int getItemDecorationCount() {
        return this.f931o.size();
    }

    public d0 getLayoutManager() {
        return this.f928m;
    }

    public int getMaxFlingVelocity() {
        return this.S;
    }

    public int getMinFlingVelocity() {
        return this.R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public f0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.V;
    }

    public i0 getRecycledViewPool() {
        return this.f911d.c();
    }

    public int getScrollState() {
        return this.J;
    }

    public final void h(int i, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = k0.f6120a;
        setMeasuredDimension(d0.f(i, paddingRight, getMinimumWidth()), d0.f(i8, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i() {
        Log.w("RecyclerView", "No adapter attached; skipping layout");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f934r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f938v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f6131d;
    }

    public final boolean j(int i, int i8, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i8, i9, iArr, iArr2);
    }

    public final void k(int i, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().d(i, i8, i9, i10, iArr, i11, iArr2);
    }

    public final void l() {
        if (this.H != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.H = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void m() {
        if (this.E != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.E = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void n() {
        if (this.G != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.G = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void o() {
        if (this.F != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f6;
        super.onAttachedToWindow();
        boolean z3 = false;
        this.B = 0;
        this.f934r = true;
        if (this.f936t && !isLayoutRequested()) {
            z3 = true;
        }
        this.f936t = z3;
        d0 d0Var = this.f928m;
        if (d0Var != null) {
            d0Var.f7903e = true;
            d0Var.K(this);
        }
        ThreadLocal threadLocal = l.f7965h;
        l lVar = (l) threadLocal.get();
        this.f908a0 = lVar;
        if (lVar == null) {
            l lVar2 = new l();
            lVar2.f7966d = new ArrayList();
            lVar2.f7969g = new ArrayList();
            this.f908a0 = lVar2;
            Field field = k0.f6120a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f6 = display.getRefreshRate();
            }
            f6 = 60.0f;
            l lVar3 = this.f908a0;
            lVar3.f7968f = (long) (1.0E9f / f6);
            threadLocal.set(lVar3);
        }
        this.f908a0.f7966d.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a0 a0Var = this.I;
        if (a0Var != null) {
            a0Var.c();
        }
        setScrollState(0);
        o0 o0Var = this.W;
        o0Var.f7999j.removeCallbacks(o0Var);
        o0Var.f7996f.abortAnimation();
        this.f934r = false;
        d0 d0Var = this.f928m;
        if (d0Var != null) {
            d0Var.f7903e = false;
            d0Var.L(this);
        }
        this.f927l0.clear();
        removeCallbacks(this.f929m0);
        this.f919h.getClass();
        while (w0.f8056b.a() != null) {
        }
        l lVar = this.f908a0;
        if (lVar != null) {
            lVar.f7966d.remove(this);
            this.f908a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f931o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b0) arrayList.get(i)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        float f8;
        d0 d0Var;
        if (this.f928m != null && !this.f938v && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f6 = this.f928m.d() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f928m.c()) {
                    f8 = motionEvent.getAxisValue(10);
                    if (f6 == 0.0f || f8 != 0.0f) {
                        int i = (int) (f8 * this.T);
                        int i8 = (int) (f6 * this.U);
                        d0Var = this.f928m;
                        if (d0Var == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            return false;
                        }
                        if (!this.f938v) {
                            int[] iArr = this.f925k0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean c8 = d0Var.c();
                            boolean d8 = this.f928m.d();
                            getScrollingChildHelper().g(d8 ? (c8 ? 1 : 0) | 2 : c8 ? 1 : 0, 1);
                            if (j(c8 ? i : 0, d8 ? i8 : 0, 1, this.f925k0, this.f921i0)) {
                                i -= iArr[0];
                                i8 -= iArr[1];
                            }
                            C(c8 ? i : 0, d8 ? i8 : 0, motionEvent, 1);
                            l lVar = this.f908a0;
                            if (lVar != null && (i != 0 || i8 != 0)) {
                                lVar.a(this, i, i8);
                            }
                            H(1);
                        }
                    }
                }
                f8 = 0.0f;
                if (f6 == 0.0f) {
                }
                int i9 = (int) (f8 * this.T);
                int i82 = (int) (f6 * this.U);
                d0Var = this.f928m;
                if (d0Var == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f928m.d()) {
                        f6 = -axisValue;
                        f8 = 0.0f;
                        if (f6 == 0.0f) {
                        }
                        int i92 = (int) (f8 * this.T);
                        int i822 = (int) (f6 * this.U);
                        d0Var = this.f928m;
                        if (d0Var == null) {
                        }
                    } else if (this.f928m.c()) {
                        f8 = axisValue;
                        f6 = 0.0f;
                        if (f6 == 0.0f) {
                        }
                        int i922 = (int) (f8 * this.T);
                        int i8222 = (int) (f6 * this.U);
                        d0Var = this.f928m;
                        if (d0Var == null) {
                        }
                    }
                }
                f6 = 0.0f;
                f8 = 0.0f;
                if (f6 == 0.0f) {
                }
                int i9222 = (int) (f8 * this.T);
                int i82222 = (int) (f6 * this.U);
                d0Var = this.f928m;
                if (d0Var == null) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (!this.f938v) {
            this.f933q = null;
            if (r(motionEvent)) {
                B();
                setScrollState(0);
                return true;
            }
            d0 d0Var = this.f928m;
            if (d0Var != null) {
                boolean c8 = d0Var.c();
                boolean d8 = this.f928m.d();
                if (this.L == null) {
                    this.L = VelocityTracker.obtain();
                }
                this.L.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f939w) {
                        this.f939w = false;
                    }
                    this.K = motionEvent.getPointerId(0);
                    int x7 = (int) (motionEvent.getX() + 0.5f);
                    this.O = x7;
                    this.M = x7;
                    int y7 = (int) (motionEvent.getY() + 0.5f);
                    this.P = y7;
                    this.N = y7;
                    if (this.J == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        H(1);
                    }
                    int[] iArr = this.f923j0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = c8;
                    if (d8) {
                        i = (c8 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.L.clear();
                    H(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.K);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.K + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x8 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y8 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.J != 1) {
                        int i8 = x8 - this.M;
                        int i9 = y8 - this.N;
                        if (c8 == 0 || Math.abs(i8) <= this.Q) {
                            z3 = false;
                        } else {
                            this.O = x8;
                            z3 = true;
                        }
                        if (d8 && Math.abs(i9) > this.Q) {
                            this.P = y8;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    B();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.K = motionEvent.getPointerId(actionIndex);
                    int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.O = x9;
                    this.M = x9;
                    int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.P = y9;
                    this.N = y9;
                } else if (actionMasked == 6) {
                    y(motionEvent);
                }
                if (this.J == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        int i11 = m3.b.f5221a;
        Trace.beginSection("RV OnLayout");
        i();
        Trace.endSection();
        this.f936t = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        d0 d0Var = this.f928m;
        if (d0Var == null) {
            h(i, i8);
            return;
        }
        if (d0Var.E()) {
            View.MeasureSpec.getMode(i);
            View.MeasureSpec.getMode(i8);
            this.f928m.f7900b.h(i, i8);
        } else {
            if (this.f935s) {
                this.f928m.f7900b.h(i, i8);
                return;
            }
            m0 m0Var = this.f910c0;
            if (m0Var.i) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            m0Var.f7975c = 0;
            F();
            this.f928m.f7900b.h(i, i8);
            G(false);
            m0Var.f7977e = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.B > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l0 l0Var = (l0) parcelable;
        this.f913e = l0Var;
        super.onRestoreInstanceState(l0Var.f7877d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l0 l0Var = new l0(super.onSaveInstanceState());
        l0 l0Var2 = this.f913e;
        if (l0Var2 != null) {
            l0Var.f7970f = l0Var2.f7970f;
            return l0Var;
        }
        d0 d0Var = this.f928m;
        if (d0Var != null) {
            l0Var.f7970f = d0Var.P();
            return l0Var;
        }
        l0Var.f7970f = null;
        return l0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        if (i == i9 && i8 == i10) {
            return;
        }
        this.H = null;
        this.F = null;
        this.G = null;
        this.E = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z7;
        if (!this.f938v && !this.f939w) {
            j jVar = this.f933q;
            if (jVar == null) {
                z3 = motionEvent.getAction() == 0 ? false : r(motionEvent);
            } else {
                int i = jVar.f7931a;
                if (jVar.f7946q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d8 = jVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean c8 = jVar.c(motionEvent.getX(), motionEvent.getY());
                        if (d8 || c8) {
                            if (c8) {
                                jVar.f7947r = 1;
                                jVar.f7940k = (int) motionEvent.getX();
                            } else if (d8) {
                                jVar.f7947r = 2;
                                jVar.f7939j = (int) motionEvent.getY();
                            }
                            jVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && jVar.f7946q == 2) {
                        jVar.f7939j = 0.0f;
                        jVar.f7940k = 0.0f;
                        jVar.f(1);
                        jVar.f7947r = 0;
                    } else if (motionEvent.getAction() == 2 && jVar.f7946q == 2) {
                        jVar.g();
                        if (jVar.f7947r == 1) {
                            float x7 = motionEvent.getX();
                            int[] iArr = jVar.f7949t;
                            iArr[0] = i;
                            int i8 = jVar.f7941l - i;
                            iArr[1] = i8;
                            float max = Math.max(i, Math.min(i8, x7));
                            if (Math.abs(0 - max) >= 2.0f) {
                                int e8 = j.e(jVar.f7940k, max, iArr, jVar.f7943n.computeHorizontalScrollRange(), jVar.f7943n.computeHorizontalScrollOffset(), jVar.f7941l);
                                if (e8 != 0) {
                                    jVar.f7943n.scrollBy(e8, 0);
                                }
                                jVar.f7940k = max;
                            }
                        }
                        if (jVar.f7947r == 2) {
                            float y7 = motionEvent.getY();
                            int[] iArr2 = jVar.f7948s;
                            iArr2[0] = i;
                            int i9 = jVar.f7942m - i;
                            iArr2[1] = i9;
                            float max2 = Math.max(i, Math.min(i9, y7));
                            if (Math.abs(0 - max2) >= 2.0f) {
                                int e9 = j.e(jVar.f7939j, max2, iArr2, jVar.f7943n.computeVerticalScrollRange(), jVar.f7943n.computeVerticalScrollOffset(), jVar.f7942m);
                                if (e9 != 0) {
                                    jVar.f7943n.scrollBy(0, e9);
                                }
                                jVar.f7939j = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f933q = null;
                }
                z3 = true;
            }
            if (z3) {
                B();
                setScrollState(0);
                return true;
            }
            d0 d0Var = this.f928m;
            if (d0Var != null) {
                boolean c9 = d0Var.c();
                boolean d9 = this.f928m.d();
                if (this.L == null) {
                    this.L = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f923j0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.K = motionEvent.getPointerId(0);
                    int x8 = (int) (motionEvent.getX() + 0.5f);
                    this.O = x8;
                    this.M = x8;
                    int y8 = (int) (motionEvent.getY() + 0.5f);
                    this.P = y8;
                    this.N = y8;
                    int i10 = c9;
                    if (d9) {
                        i10 = (c9 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.L.addMovement(obtain);
                        VelocityTracker velocityTracker = this.L;
                        int i11 = this.S;
                        velocityTracker.computeCurrentVelocity(1000, i11);
                        float f6 = c9 != 0 ? -this.L.getXVelocity(this.K) : 0.0f;
                        float f8 = d9 ? -this.L.getYVelocity(this.K) : 0.0f;
                        if (f6 != 0.0f || f8 != 0.0f) {
                            int i12 = (int) f6;
                            int i13 = (int) f8;
                            d0 d0Var2 = this.f928m;
                            if (d0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f938v) {
                                boolean c10 = d0Var2.c();
                                boolean d10 = this.f928m.d();
                                int i14 = this.R;
                                if (c10 == 0 || Math.abs(i12) < i14) {
                                    i12 = 0;
                                }
                                if (!d10 || Math.abs(i13) < i14) {
                                    i13 = 0;
                                }
                                if (i12 != 0 || i13 != 0) {
                                    float f9 = i12;
                                    float f10 = i13;
                                    if (!dispatchNestedPreFling(f9, f10)) {
                                        boolean z8 = c10 != 0 || d10;
                                        dispatchNestedFling(f9, f10, z8);
                                        int i15 = c10;
                                        if (z8) {
                                            if (d10) {
                                                i15 = (c10 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i15, 1);
                                            int i16 = -i11;
                                            int max3 = Math.max(i16, Math.min(i12, i11));
                                            int max4 = Math.max(i16, Math.min(i13, i11));
                                            o0 o0Var = this.W;
                                            RecyclerView recyclerView = o0Var.f7999j;
                                            recyclerView.setScrollState(2);
                                            o0Var.f7995e = 0;
                                            o0Var.f7994d = 0;
                                            Interpolator interpolator = o0Var.f7997g;
                                            v vVar = f907p0;
                                            if (interpolator != vVar) {
                                                o0Var.f7997g = vVar;
                                                o0Var.f7996f = new OverScroller(recyclerView.getContext(), vVar);
                                            }
                                            o0Var.f7996f.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                            o0Var.a();
                                            B();
                                            obtain.recycle();
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                        B();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.K);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.K + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x9 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y9 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i17 = this.O - x9;
                        int i18 = this.P - y9;
                        if (this.J != 1) {
                            if (c9 != 0) {
                                i17 = i17 > 0 ? Math.max(0, i17 - this.Q) : Math.min(0, i17 + this.Q);
                                if (i17 != 0) {
                                    z7 = true;
                                    if (d9) {
                                        i18 = i18 > 0 ? Math.max(0, i18 - this.Q) : Math.min(0, i18 + this.Q);
                                        if (i18 != 0) {
                                            z7 = true;
                                        }
                                    }
                                    if (z7) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z7 = false;
                            if (d9) {
                            }
                            if (z7) {
                            }
                        }
                        int i19 = i17;
                        int i20 = i18;
                        if (this.J == 1) {
                            int[] iArr4 = this.f925k0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean j7 = j(c9 != 0 ? i19 : 0, d9 ? i20 : 0, 0, iArr4, this.f921i0);
                            int[] iArr5 = this.f921i0;
                            if (j7) {
                                i19 -= iArr4[0];
                                i20 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i21 = i20;
                            this.O = x9 - iArr5[0];
                            this.P = y9 - iArr5[1];
                            if (C(c9 != 0 ? i19 : 0, d9 ? i21 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            l lVar = this.f908a0;
                            if (lVar != null && (i19 != 0 || i21 != 0)) {
                                lVar.a(this, i19, i21);
                            }
                        }
                    } else if (actionMasked == 3) {
                        B();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.K = motionEvent.getPointerId(actionIndex);
                        int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.O = x10;
                        this.M = x10;
                        int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.P = y10;
                        this.N = y10;
                    } else if (actionMasked == 6) {
                        y(motionEvent);
                    }
                }
                this.L.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final String p() {
        return " " + super.toString() + ", adapter:" + ((Object) null) + ", layout:" + this.f928m + ", context:" + getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View q(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f932p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j jVar = (j) arrayList.get(i);
            int i8 = jVar.f7946q;
            if (i8 == 1) {
                boolean d8 = jVar.d(motionEvent.getX(), motionEvent.getY());
                boolean c8 = jVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d8 || c8)) {
                    if (c8) {
                        jVar.f7947r = 1;
                        jVar.f7940k = (int) motionEvent.getX();
                    } else if (d8) {
                        jVar.f7947r = 2;
                        jVar.f7939j = (int) motionEvent.getY();
                    }
                    jVar.f(2);
                    if (action == 3) {
                        this.f933q = jVar;
                        return true;
                    }
                }
            } else {
                if (i8 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        s(view);
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f928m.getClass();
        if (this.B <= 0 && view2 != null) {
            A(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f928m.V(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f932p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f937u != 0 || this.f938v) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i8) {
        d0 d0Var = this.f928m;
        if (d0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f938v) {
            return;
        }
        boolean c8 = d0Var.c();
        boolean d8 = this.f928m.d();
        if (c8 || d8) {
            if (!c8) {
                i = 0;
            }
            if (!d8) {
                i8 = 0;
            }
            C(i, i8, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.B <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f940x |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(r0 r0Var) {
        this.f918g0 = r0Var;
        k0.k(this, r0Var);
    }

    public void setAdapter(x xVar) {
        setLayoutFrozen(false);
        a0 a0Var = this.I;
        if (a0Var != null) {
            a0Var.c();
        }
        d0 d0Var = this.f928m;
        j0 j0Var = this.f911d;
        if (d0Var != null) {
            d0Var.R(j0Var);
            this.f928m.S(j0Var);
        }
        j0Var.f7953a.clear();
        j0Var.e();
        g1 g1Var = this.f915f;
        g1Var.H((ArrayList) g1Var.f85c);
        g1Var.H((ArrayList) g1Var.f86d);
        d0 d0Var2 = this.f928m;
        if (d0Var2 != null) {
            d0Var2.J();
        }
        j0Var.f7953a.clear();
        j0Var.e();
        i0 c8 = j0Var.c();
        if (c8.f7928b == 0) {
            SparseArray sparseArray = c8.f7927a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((h0) sparseArray.valueAt(i)).f7922a.clear();
            }
        }
        this.f910c0.f7976d = true;
        this.A = false | this.A;
        this.f942z = true;
        int w7 = this.f917g.w();
        for (int i8 = 0; i8 < w7; i8++) {
            s(this.f917g.v(i8));
        }
        v();
        j0 j0Var2 = this.f911d;
        ArrayList arrayList = j0Var2.f7955c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
        }
        j0Var2.e();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(y yVar) {
        if (yVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.i) {
            this.H = null;
            this.F = null;
            this.G = null;
            this.E = null;
        }
        this.i = z3;
        super.setClipToPadding(z3);
        if (this.f936t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(z zVar) {
        zVar.getClass();
        this.D = zVar;
        this.H = null;
        this.F = null;
        this.G = null;
        this.E = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f935s = z3;
    }

    public void setItemAnimator(a0 a0Var) {
        a0 a0Var2 = this.I;
        if (a0Var2 != null) {
            a0Var2.c();
            this.I.f7878a = null;
        }
        this.I = a0Var;
        if (a0Var != null) {
            a0Var.f7878a = this.f916f0;
        }
    }

    public void setItemViewCacheSize(int i) {
        j0 j0Var = this.f911d;
        j0Var.f7956d = i;
        j0Var.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(d0 d0Var) {
        if (d0Var == this.f928m) {
            return;
        }
        setScrollState(0);
        o0 o0Var = this.W;
        o0Var.f7999j.removeCallbacks(o0Var);
        o0Var.f7996f.abortAnimation();
        d0 d0Var2 = this.f928m;
        j0 j0Var = this.f911d;
        if (d0Var2 != null) {
            a0 a0Var = this.I;
            if (a0Var != null) {
                a0Var.c();
            }
            this.f928m.R(j0Var);
            this.f928m.S(j0Var);
            j0Var.f7953a.clear();
            j0Var.e();
            if (this.f934r) {
                d0 d0Var3 = this.f928m;
                d0Var3.f7903e = false;
                d0Var3.L(this);
            }
            this.f928m.Z(null);
            this.f928m = null;
        } else {
            j0Var.f7953a.clear();
            j0Var.e();
        }
        g1 g1Var = this.f917g;
        RecyclerView recyclerView = ((w) g1Var.f84b).f8055a;
        ((i1) g1Var.f85c).i();
        ArrayList arrayList = (ArrayList) g1Var.f86d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s((View) arrayList.get(size));
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f928m = d0Var;
        if (d0Var != null) {
            if (d0Var.f7900b != null) {
                throw new IllegalArgumentException("LayoutManager " + d0Var + " is already attached to a RecyclerView:" + d0Var.f7900b.p());
            }
            d0Var.Z(this);
            if (this.f934r) {
                d0 d0Var4 = this.f928m;
                d0Var4.f7903e = true;
                d0Var4.K(this);
            }
        }
        j0Var.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        q3.m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f6131d) {
            ViewGroup viewGroup = scrollingChildHelper.f6130c;
            Field field = k0.f6120a;
            c0.j(viewGroup);
        }
        scrollingChildHelper.f6131d = z3;
    }

    @Deprecated
    public void setOnScrollListener(g0 g0Var) {
        this.f912d0 = g0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.V = z3;
    }

    public void setRecycledViewPool(i0 i0Var) {
        j0 j0Var = this.f911d;
        if (j0Var.f7958f != null) {
            r1.f7928b--;
        }
        j0Var.f7958f = i0Var;
        if (i0Var != null) {
            j0Var.f7959g.getAdapter();
        }
    }

    public void setScrollState(int i) {
        if (i == this.J) {
            return;
        }
        this.J = i;
        if (i != 2) {
            o0 o0Var = this.W;
            o0Var.f7999j.removeCallbacks(o0Var);
            o0Var.f7996f.abortAnimation();
        }
        d0 d0Var = this.f928m;
        if (d0Var != null) {
            d0Var.Q(i);
        }
        g0 g0Var = this.f912d0;
        if (g0Var != null) {
            g0Var.a(i);
        }
        ArrayList arrayList = this.f914e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((g0) this.f914e0.get(size)).a(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.Q = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.Q = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(n0 n0Var) {
        this.f911d.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        if (z3 != this.f938v) {
            d("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.f938v = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f938v = true;
            this.f939w = true;
            setScrollState(0);
            o0 o0Var = this.W;
            o0Var.f7999j.removeCallbacks(o0Var);
            o0Var.f7996f.abortAnimation();
        }
    }

    public final Rect t(View view) {
        e0 e0Var = (e0) view.getLayoutParams();
        boolean z3 = e0Var.f7909b;
        Rect rect = e0Var.f7908a;
        if (!z3) {
            return rect;
        }
        if (this.f910c0.f7977e) {
            throw null;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f931o;
        if (arrayList.size() <= 0) {
            e0Var.f7909b = false;
            return rect;
        }
        this.f922j.set(0, 0, 0, 0);
        ((b0) arrayList.get(0)).getClass();
        ((e0) view.getLayoutParams()).getClass();
        throw null;
    }

    public final boolean u() {
        return !this.f936t || this.f942z || this.f915f.y();
    }

    public final void v() {
        int w7 = this.f917g.w();
        for (int i = 0; i < w7; i++) {
            ((e0) this.f917g.v(i).getLayoutParams()).f7909b = true;
        }
        ArrayList arrayList = this.f911d.f7955c;
        if (arrayList.size() <= 0) {
            return;
        }
        ((p0) arrayList.get(0)).getClass();
        throw null;
    }

    public final void w() {
        this.B++;
    }

    public final void x(boolean z3) {
        AccessibilityManager accessibilityManager;
        int i = this.B - 1;
        this.B = i;
        if (i < 1) {
            this.B = 0;
            if (z3) {
                int i8 = this.f940x;
                this.f940x = 0;
                if (i8 != 0 && (accessibilityManager = this.f941y) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i8);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f927l0;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    arrayList.clear();
                } else {
                    ((p0) arrayList.get(size)).getClass();
                    throw null;
                }
            }
        }
    }

    public final void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            int i = actionIndex == 0 ? 1 : 0;
            this.K = motionEvent.getPointerId(i);
            int x7 = (int) (motionEvent.getX(i) + 0.5f);
            this.O = x7;
            this.M = x7;
            int y7 = (int) (motionEvent.getY(i) + 0.5f);
            this.P = y7;
            this.N = y7;
        }
    }

    public final void z(p0 p0Var, p.b bVar) {
        p0Var.f8005b &= -8193;
        if (this.f910c0.f7978f && p0Var.k() && !p0Var.h() && !p0Var.n()) {
            throw null;
        }
        t0 t0Var = (t0) this.f919h.f11e;
        w0 w0Var = (w0) t0Var.get(p0Var);
        if (w0Var == null) {
            w0Var = w0.a();
            t0Var.put(p0Var, w0Var);
        }
        w0Var.getClass();
        w0Var.f8057a |= 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float a8;
        char c8;
        boolean z3;
        char c9;
        TypedArray typedArray;
        int i8;
        Constructor constructor;
        new p.b(14, this);
        this.f911d = new j0(this);
        this.f919h = new a0.a0(27);
        this.f922j = new Rect();
        this.f924k = new Rect();
        this.f926l = new RectF();
        this.f930n = new ArrayList();
        this.f931o = new ArrayList();
        this.f932p = new ArrayList();
        this.f937u = 0;
        this.f942z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = new z();
        g gVar = new g();
        Object[] objArr = null;
        gVar.f7878a = null;
        gVar.f7879b = new ArrayList();
        gVar.f7880c = 120L;
        gVar.f7881d = 120L;
        gVar.f7882e = 250L;
        gVar.f7883f = 250L;
        gVar.f7911g = true;
        gVar.f7912h = new ArrayList();
        gVar.i = new ArrayList();
        gVar.f7913j = new ArrayList();
        gVar.f7914k = new ArrayList();
        gVar.f7915l = new ArrayList();
        gVar.f7916m = new ArrayList();
        gVar.f7917n = new ArrayList();
        gVar.f7918o = new ArrayList();
        gVar.f7919p = new ArrayList();
        gVar.f7920q = new ArrayList();
        gVar.f7921r = new ArrayList();
        this.I = gVar;
        this.J = 0;
        this.K = -1;
        this.T = Float.MIN_VALUE;
        this.U = Float.MIN_VALUE;
        this.V = true;
        this.W = new o0(this);
        this.f909b0 = new m();
        m0 m0Var = new m0();
        m0Var.f7973a = 0;
        m0Var.f7974b = 0;
        m0Var.f7975c = 0;
        m0Var.f7976d = false;
        m0Var.f7977e = false;
        m0Var.f7978f = false;
        m0Var.f7979g = false;
        m0Var.f7980h = false;
        m0Var.i = false;
        this.f910c0 = m0Var;
        w wVar = new w(this);
        this.f916f0 = wVar;
        this.f921i0 = new int[2];
        this.f923j0 = new int[2];
        this.f925k0 = new int[2];
        this.f927l0 = new ArrayList();
        this.f929m0 = new b(8, this);
        new p.b(11, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.Q = viewConfiguration.getScaledTouchSlop();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            Method method = q3.l0.f6125a;
            a8 = q3.l.c(viewConfiguration);
        } else {
            a8 = q3.l0.a(viewConfiguration, context);
        }
        this.T = a8;
        this.U = i9 >= 26 ? q3.l.d(viewConfiguration) : q3.l0.a(viewConfiguration, context);
        this.R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.I.f7878a = wVar;
        this.f915f = new g1(new p.b(12, this));
        this.f917g = new g1(new w(this));
        Field field = k0.f6120a;
        if ((i9 >= 26 ? q3.e0.a(this) : 0) == 0 && i9 >= 26) {
            q3.e0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f941y = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new r0(this));
        int[] iArr = a.f7479a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        k0.j(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.i = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + p());
            }
            Resources resources = getContext().getResources();
            c8 = 3;
            c9 = 2;
            z3 = 1;
            typedArray = obtainStyledAttributes;
            i8 = 4;
            new j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.snovikpovik.vuevnxsj.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.snovikpovik.vuevnxsj.R.dimen.fastscroll_margin));
        } else {
            c8 = 3;
            z3 = 1;
            c9 = 2;
            typedArray = obtainStyledAttributes;
            i8 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(d0.class);
                    try {
                        constructor = asSubclass.getConstructor(f906o0);
                        Object[] objArr2 = new Object[i8];
                        objArr2[0] = context;
                        objArr2[z3] = attributeSet;
                        objArr2[c9] = Integer.valueOf(i);
                        objArr2[c8] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e8) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e9) {
                            e9.initCause(e8);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e9);
                        }
                    }
                    constructor.setAccessible(z3);
                    setLayoutManager((d0) constructor.newInstance(objArr));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                }
            }
        }
        int[] iArr2 = f905n0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        k0.j(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z7 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z7);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d0 d0Var = this.f928m;
        if (d0Var != null) {
            return d0Var.o(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    public void setOnFlingListener(f0 f0Var) {
    }

    @Deprecated
    public void setRecyclerListener(w4.k0 k0Var) {
    }
}
