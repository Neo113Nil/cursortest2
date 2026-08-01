package com.google.android.material.bottomsheet;

import B1.c;
import D1.p;
import G1.AbstractC0001b;
import H0.o;
import I0.b;
import I0.i;
import I0.j;
import K.h;
import M.C;
import M.C0005a;
import M.C0006b;
import M.C0008d;
import M.E;
import M.P;
import M.b0;
import M.c0;
import M.d0;
import N0.g;
import N0.k;
import O0.d;
import O0.f;
import Q0.B;
import U.e;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.C0089b;
import b0.C0096a;
import com.winpower.neonfit.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import n.U;
import t0.AbstractC0383a;
import u0.AbstractC0389a;
import y0.AbstractC0422a;
import y0.C0423b;
import z.AbstractC0427a;
import z.C0430d;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0427a implements b {

    /* renamed from: A, reason: collision with root package name */
    public final f f2257A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f2258B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2259C;

    /* renamed from: D, reason: collision with root package name */
    public int f2260D;

    /* renamed from: E, reason: collision with root package name */
    public int f2261E;

    /* renamed from: F, reason: collision with root package name */
    public final float f2262F;

    /* renamed from: G, reason: collision with root package name */
    public int f2263G;
    public final float H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2264I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2265J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f2266K;

    /* renamed from: L, reason: collision with root package name */
    public int f2267L;

    /* renamed from: M, reason: collision with root package name */
    public e f2268M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2269N;

    /* renamed from: O, reason: collision with root package name */
    public int f2270O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2271P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f2272Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2273R;

    /* renamed from: S, reason: collision with root package name */
    public int f2274S;

    /* renamed from: T, reason: collision with root package name */
    public int f2275T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f2276U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f2277V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f2278W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f2279X;

    /* renamed from: Y, reason: collision with root package name */
    public j f2280Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2281Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f2282a;

    /* renamed from: a0, reason: collision with root package name */
    public int f2283a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2284b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2285b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f2286c;

    /* renamed from: c0, reason: collision with root package name */
    public HashMap f2287c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f2288d;

    /* renamed from: d0, reason: collision with root package name */
    public final SparseIntArray f2289d0;
    public int e;

    /* renamed from: e0, reason: collision with root package name */
    public final d f2290e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2291f;

    /* renamed from: g, reason: collision with root package name */
    public int f2292g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2293h;
    public final g i;
    public final ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2294k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2295l;

    /* renamed from: m, reason: collision with root package name */
    public int f2296m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2297n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2298o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2299p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2300q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2301r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2302s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2303t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2304u;

    /* renamed from: v, reason: collision with root package name */
    public int f2305v;

    /* renamed from: w, reason: collision with root package name */
    public int f2306w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2307x;

    /* renamed from: y, reason: collision with root package name */
    public final k f2308y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2309z;

    public BottomSheetBehavior() {
        this.f2282a = 0;
        this.f2284b = true;
        this.f2294k = -1;
        this.f2295l = -1;
        this.f2257A = new f(this);
        this.f2262F = 0.5f;
        this.H = -1.0f;
        this.f2266K = true;
        this.f2267L = 4;
        this.f2272Q = 0.1f;
        this.f2278W = new ArrayList();
        this.f2283a0 = -1;
        this.f2289d0 = new SparseIntArray();
        this.f2290e0 = new d(this, 1);
    }

    public static BottomSheetBehavior A(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0430d)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        AbstractC0427a abstractC0427a = ((C0430d) layoutParams).f4768a;
        if (abstractC0427a instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC0427a;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int B(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static View z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = P.f711a;
        if (E.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View z2 = z(viewGroup.getChildAt(i));
                if (z2 != null) {
                    return z2;
                }
            }
        }
        return null;
    }

    public final int C() {
        if (this.f2284b) {
            return this.f2260D;
        }
        return Math.max(this.f2259C, this.f2301r ? 0 : this.f2306w);
    }

    public final int D(int i) {
        if (i == 3) {
            return C();
        }
        if (i == 4) {
            return this.f2263G;
        }
        if (i == 5) {
            return this.f2275T;
        }
        if (i == 6) {
            return this.f2261E;
        }
        throw new IllegalArgumentException(AbstractC0001b.e("Invalid state to get top offset: ", i));
    }

    public final boolean E() {
        WeakReference weakReference = this.f2276U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f2276U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void F(boolean z2) {
        if (this.f2264I != z2) {
            this.f2264I = z2;
            if (!z2 && this.f2267L == 5) {
                H(4);
            }
            L();
        }
    }

    public final void G(int i) {
        if (i == -1) {
            if (this.f2291f) {
                return;
            } else {
                this.f2291f = true;
            }
        } else {
            if (!this.f2291f && this.e == i) {
                return;
            }
            this.f2291f = false;
            this.e = Math.max(0, i);
        }
        O();
    }

    public final void H(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0001b.g(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f2264I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f2284b && D(i) <= this.f2260D) ? 3 : i;
        WeakReference weakReference = this.f2276U;
        if (weakReference == null || weakReference.get() == null) {
            I(i);
            return;
        }
        View view = (View) this.f2276U.get();
        U u2 = new U(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = P.f711a;
            if (view.isAttachedToWindow()) {
                view.post(u2);
                return;
            }
        }
        u2.run();
    }

    public final void I(int i) {
        View view;
        if (this.f2267L == i) {
            return;
        }
        this.f2267L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f2264I;
        }
        WeakReference weakReference = this.f2276U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            N(true);
        } else if (i == 6 || i == 5 || i == 4) {
            N(false);
        }
        M(i, true);
        while (true) {
            ArrayList arrayList = this.f2278W;
            if (i2 >= arrayList.size()) {
                L();
                return;
            } else {
                ((AbstractC0422a) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean J(View view, float f2) {
        if (this.f2265J) {
            return true;
        }
        if (view.getTop() < this.f2263G) {
            return false;
        }
        return Math.abs(((f2 * this.f2272Q) + ((float) view.getTop())) - ((float) this.f2263G)) / ((float) x()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        I(2);
        M(r4, true);
        r2.f2257A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(View view, int i, boolean z2) {
        int D2 = D(i);
        e eVar = this.f2268M;
        if (eVar != null) {
            if (!z2) {
                int left = view.getLeft();
                eVar.f1225r = view;
                eVar.f1213c = -1;
                boolean h2 = eVar.h(left, D2, 0, 0);
                if (!h2 && eVar.f1211a == 0 && eVar.f1225r != null) {
                    eVar.f1225r = null;
                }
            }
        }
        I(i);
    }

    public final void L() {
        View view;
        int i;
        WeakReference weakReference = this.f2276U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        P.i(view, 524288);
        P.g(view, 0);
        P.i(view, 262144);
        P.g(view, 0);
        P.i(view, 1048576);
        P.g(view, 0);
        SparseIntArray sparseIntArray = this.f2289d0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            P.i(view, i2);
            P.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2284b && this.f2267L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            p pVar = new p(this, 6);
            ArrayList e = P.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= e.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = P.f714d[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < e.size(); i7++) {
                            z2 &= ((N.d) e.get(i7)).a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((N.d) e.get(i3)).f873a).getLabel())) {
                        i = ((N.d) e.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                N.d dVar = new N.d(null, i, string, pVar, null);
                View.AccessibilityDelegate c2 = P.c(view);
                C0006b c0006b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f723a : new C0006b(c2);
                if (c0006b == null) {
                    c0006b = new C0006b();
                }
                P.l(view, c0006b);
                P.i(view, dVar.a());
                P.e(view).add(dVar);
                P.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f2264I && this.f2267L != 5) {
            P.j(view, N.d.j, new p(this, 5));
        }
        int i8 = this.f2267L;
        if (i8 == 3) {
            P.j(view, N.d.i, new p(this, this.f2284b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            P.j(view, N.d.f870h, new p(this, this.f2284b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            P.j(view, N.d.i, new p(this, 4));
            P.j(view, N.d.f870h, new p(this, 3));
        }
    }

    public final void M(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f2258B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f2267L == 3 && (this.f2307x || E());
        if (this.f2309z == z3 || gVar == null) {
            return;
        }
        this.f2309z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f900a.i, z3 ? w() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float w2 = this.f2309z ? w() : 1.0f;
        N0.f fVar = gVar.f900a;
        if (fVar.i != w2) {
            fVar.i = w2;
            gVar.e = true;
            gVar.invalidateSelf();
        }
    }

    public final void N(boolean z2) {
        WeakReference weakReference = this.f2276U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f2287c0 != null) {
                    return;
                } else {
                    this.f2287c0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f2276U.get() && z2) {
                    this.f2287c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f2287c0 = null;
        }
    }

    public final void O() {
        View view;
        if (this.f2276U != null) {
            v();
            if (this.f2267L != 4 || (view = (View) this.f2276U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // I0.b
    public final void a() {
        int i = 0;
        j jVar = this.f2280Y;
        if (jVar == null) {
            return;
        }
        C0089b c0089b = jVar.f584f;
        jVar.f584f = null;
        if (c0089b == null || Build.VERSION.SDK_INT < 34) {
            H(this.f2264I ? 5 : 4);
            return;
        }
        boolean z2 = this.f2264I;
        int i2 = jVar.f583d;
        int i3 = jVar.f582c;
        float f2 = c0089b.f2154c;
        if (!z2) {
            AnimatorSet a2 = jVar.a();
            a2.setDuration(AbstractC0389a.c(i3, i2, f2));
            a2.start();
            H(4);
            return;
        }
        i iVar = new i(8, this);
        View view = jVar.f581b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        ofFloat.setInterpolator(new C0096a(1));
        ofFloat.setDuration(AbstractC0389a.c(i3, i2, f2));
        ofFloat.addListener(new i(i, jVar));
        ofFloat.addListener(iVar);
        ofFloat.start();
    }

    @Override // I0.b
    public final void b(C0089b c0089b) {
        j jVar = this.f2280Y;
        if (jVar == null) {
            return;
        }
        if (jVar.f584f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0089b c0089b2 = jVar.f584f;
        jVar.f584f = c0089b;
        if (c0089b2 == null) {
            return;
        }
        jVar.b(c0089b.f2154c);
    }

    @Override // I0.b
    public final void c(C0089b c0089b) {
        j jVar = this.f2280Y;
        if (jVar == null) {
            return;
        }
        jVar.f584f = c0089b;
    }

    @Override // I0.b
    public final void d() {
        j jVar = this.f2280Y;
        if (jVar == null) {
            return;
        }
        if (jVar.f584f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0089b c0089b = jVar.f584f;
        jVar.f584f = null;
        if (c0089b == null) {
            return;
        }
        AnimatorSet a2 = jVar.a();
        a2.setDuration(jVar.e);
        a2.start();
    }

    @Override // z.AbstractC0427a
    public final void g(C0430d c0430d) {
        this.f2276U = null;
        this.f2268M = null;
        this.f2280Y = null;
    }

    @Override // z.AbstractC0427a
    public final void i() {
        this.f2276U = null;
        this.f2268M = null;
        this.f2280Y = null;
    }

    @Override // z.AbstractC0427a
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        e eVar;
        if (!view.isShown() || !this.f2266K) {
            this.f2269N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2281Z = -1;
            this.f2283a0 = -1;
            VelocityTracker velocityTracker = this.f2279X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2279X = null;
            }
        }
        if (this.f2279X == null) {
            this.f2279X = VelocityTracker.obtain();
        }
        this.f2279X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f2283a0 = (int) motionEvent.getY();
            if (this.f2267L != 2) {
                WeakReference weakReference = this.f2277V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f2283a0)) {
                    this.f2281Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2285b0 = true;
                }
            }
            this.f2269N = this.f2281Z == -1 && !coordinatorLayout.o(view, x2, this.f2283a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2285b0 = false;
            this.f2281Z = -1;
            if (this.f2269N) {
                this.f2269N = false;
                return false;
            }
        }
        if (!this.f2269N && (eVar = this.f2268M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f2277V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f2269N || this.f2267L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2268M == null || (i = this.f2283a0) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f2268M.f1212b)) ? false : true;
    }

    @Override // z.AbstractC0427a
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f2295l;
        g gVar = this.i;
        int i3 = 2;
        WeakHashMap weakHashMap = P.f711a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i4 = 0;
        if (this.f2276U == null) {
            this.f2292g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i5 = Build.VERSION.SDK_INT;
            boolean z2 = (i5 < 29 || this.f2297n || this.f2291f) ? false : true;
            if (this.f2298o || this.f2299p || this.f2300q || this.f2302s || this.f2303t || this.f2304u || z2) {
                h hVar = new h(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                H0.p pVar = new H0.p();
                pVar.f541a = paddingStart;
                pVar.f542b = paddingEnd;
                pVar.f543c = paddingBottom;
                E.u(view, new c(hVar, i3, pVar));
                if (view.isAttachedToWindow()) {
                    C.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new o());
                }
            }
            C0008d c0008d = new C0008d(view);
            if (i5 >= 30) {
                view.setWindowInsetsAnimationCallback(new d0(c0008d));
            } else {
                PathInterpolator pathInterpolator = c0.e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener b0Var = new b0(view, c0008d);
                view.setTag(R.id.tag_window_insets_animation_callback, b0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(b0Var);
                }
            }
            this.f2276U = new WeakReference(view);
            this.f2280Y = new j(view);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.H;
                if (f2 == -1.0f) {
                    f2 = E.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    E.q(view, colorStateList);
                }
            }
            L();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2268M == null) {
            this.f2268M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2290e0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f2274S = coordinatorLayout.getWidth();
        this.f2275T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2273R = height;
        int i6 = this.f2275T;
        int i7 = i6 - height;
        int i8 = this.f2306w;
        if (i7 < i8) {
            if (this.f2301r) {
                if (i2 != -1) {
                    i6 = Math.min(i6, i2);
                }
                this.f2273R = i6;
            } else {
                int i9 = i6 - i8;
                if (i2 != -1) {
                    i9 = Math.min(i9, i2);
                }
                this.f2273R = i9;
            }
        }
        this.f2260D = Math.max(0, this.f2275T - this.f2273R);
        this.f2261E = (int) ((1.0f - this.f2262F) * this.f2275T);
        v();
        int i10 = this.f2267L;
        if (i10 == 3) {
            view.offsetTopAndBottom(C());
        } else if (i10 == 6) {
            view.offsetTopAndBottom(this.f2261E);
        } else if (this.f2264I && i10 == 5) {
            view.offsetTopAndBottom(this.f2275T);
        } else if (i10 == 4) {
            view.offsetTopAndBottom(this.f2263G);
        } else if (i10 == 1 || i10 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        M(this.f2267L, false);
        this.f2277V = new WeakReference(z(view));
        while (true) {
            ArrayList arrayList = this.f2278W;
            if (i4 >= arrayList.size()) {
                return true;
            }
            ((AbstractC0422a) arrayList.get(i4)).a(view);
            i4++;
        }
    }

    @Override // z.AbstractC0427a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f2294k, marginLayoutParams.width), B(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2295l, marginLayoutParams.height));
        return true;
    }

    @Override // z.AbstractC0427a
    public final boolean m(View view) {
        WeakReference weakReference = this.f2277V;
        return (weakReference == null || view != weakReference.get() || this.f2267L == 3) ? false : true;
    }

    @Override // z.AbstractC0427a
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f2266K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f2277V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < C()) {
                int C2 = top - C();
                iArr[1] = C2;
                WeakHashMap weakHashMap = P.f711a;
                view.offsetTopAndBottom(-C2);
                I(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = P.f711a;
                view.offsetTopAndBottom(-i2);
                I(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f2263G;
            if (i4 > i5 && !this.f2264I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = P.f711a;
                view.offsetTopAndBottom(-i6);
                I(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = P.f711a;
                view.offsetTopAndBottom(-i2);
                I(1);
            }
        }
        y(view.getTop());
        this.f2270O = i2;
        this.f2271P = true;
    }

    @Override // z.AbstractC0427a
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // z.AbstractC0427a
    public final void q(View view, Parcelable parcelable) {
        C0423b c0423b = (C0423b) parcelable;
        int i = this.f2282a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = c0423b.f4714d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f2284b = c0423b.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f2264I = c0423b.f4715f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f2265J = c0423b.f4716g;
            }
        }
        int i2 = c0423b.f4713c;
        if (i2 == 1 || i2 == 2) {
            this.f2267L = 4;
        } else {
            this.f2267L = i2;
        }
    }

    @Override // z.AbstractC0427a
    public final Parcelable r(View view) {
        return new C0423b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // z.AbstractC0427a
    public final boolean s(View view, int i, int i2) {
        this.f2270O = 0;
        this.f2271P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f2261E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2260D) < java.lang.Math.abs(r5 - r3.f2263G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f2263G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f2263G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2261E) < java.lang.Math.abs(r5 - r3.f2263G)) goto L50;
     */
    @Override // z.AbstractC0427a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == C()) {
            I(3);
            return;
        }
        WeakReference weakReference = this.f2277V;
        if (weakReference != null && view2 == weakReference.get() && this.f2271P) {
            if (this.f2270O > 0) {
                if (!this.f2284b) {
                }
                K(view, i2, false);
                this.f2271P = false;
            }
            if (this.f2264I) {
                VelocityTracker velocityTracker = this.f2279X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f2286c);
                    yVelocity = this.f2279X.getYVelocity(this.f2281Z);
                }
                if (J(view, yVelocity)) {
                    i2 = 5;
                    K(view, i2, false);
                    this.f2271P = false;
                }
            }
            if (this.f2270O == 0) {
                int top = view.getTop();
                if (!this.f2284b) {
                    int i3 = this.f2261E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f2284b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            K(view, i2, false);
            this.f2271P = false;
        }
    }

    @Override // z.AbstractC0427a
    public final boolean u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f2267L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f2268M;
        if (eVar != null && (this.f2266K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2281Z = -1;
            this.f2283a0 = -1;
            VelocityTracker velocityTracker = this.f2279X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2279X = null;
            }
        }
        if (this.f2279X == null) {
            this.f2279X = VelocityTracker.obtain();
        }
        this.f2279X.addMovement(motionEvent);
        if (this.f2268M != null && ((this.f2266K || this.f2267L == 1) && actionMasked == 2 && !this.f2269N)) {
            float abs = Math.abs(this.f2283a0 - motionEvent.getY());
            e eVar2 = this.f2268M;
            if (abs > eVar2.f1212b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2269N;
    }

    public final void v() {
        int x2 = x();
        if (this.f2284b) {
            this.f2263G = Math.max(this.f2275T - x2, this.f2260D);
        } else {
            this.f2263G = this.f2275T - x2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float w() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f2;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f3 = 0.0f;
        if (this.i != null && (weakReference = this.f2276U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f2276U.get();
            if (E() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float a2 = gVar.f900a.f886a.e.a(gVar.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > 0.0f && a2 > 0.0f) {
                        f2 = f4 / a2;
                        g gVar2 = this.i;
                        float a3 = gVar2.f900a.f886a.f933f.a(gVar2.f());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f5 = radius;
                            if (f5 > 0.0f && a3 > 0.0f) {
                                f3 = f5 / a3;
                            }
                        }
                        return Math.max(f2, f3);
                    }
                }
                f2 = 0.0f;
                g gVar22 = this.i;
                float a32 = gVar22.f900a.f886a.f933f.a(gVar22.f());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f3);
            }
        }
        return 0.0f;
    }

    public final int x() {
        int i;
        return this.f2291f ? Math.min(Math.max(this.f2292g, this.f2275T - ((this.f2274S * 9) / 16)), this.f2273R) + this.f2305v : (this.f2297n || this.f2298o || (i = this.f2296m) <= 0) ? this.e + this.f2305v : Math.max(this.e, i + this.f2293h);
    }

    public final void y(int i) {
        View view = (View) this.f2276U.get();
        if (view != null) {
            ArrayList arrayList = this.f2278W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f2263G;
            if (i <= i2 && i2 != C()) {
                C();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((AbstractC0422a) arrayList.get(i3)).b(view);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 2;
        this.f2282a = 0;
        this.f2284b = true;
        this.f2294k = -1;
        this.f2295l = -1;
        this.f2257A = new f(this);
        this.f2262F = 0.5f;
        this.H = -1.0f;
        this.f2266K = true;
        this.f2267L = 4;
        this.f2272Q = 0.1f;
        this.f2278W = new ArrayList();
        this.f2283a0 = -1;
        this.f2289d0 = new SparseIntArray();
        this.f2290e0 = new d(this, 1);
        this.f2293h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0383a.f4147a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = H1.d.C(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2308y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f2308y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(w(), 1.0f);
        this.f2258B = ofFloat;
        ofFloat.setDuration(500L);
        this.f2258B.addUpdateListener(new B(i2, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2294k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2295l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            G(i);
        } else {
            G(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        F(obtainStyledAttributes.getBoolean(8, false));
        this.f2297n = obtainStyledAttributes.getBoolean(13, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2284b != z2) {
            this.f2284b = z2;
            if (this.f2276U != null) {
                v();
            }
            I((this.f2284b && this.f2267L == 6) ? 3 : this.f2267L);
            M(this.f2267L, true);
            L();
        }
        this.f2265J = obtainStyledAttributes.getBoolean(12, false);
        this.f2266K = obtainStyledAttributes.getBoolean(4, true);
        this.f2282a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f2262F = f2;
            if (this.f2276U != null) {
                this.f2261E = (int) ((1.0f - f2) * this.f2275T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f2259C = i3;
                    M(this.f2267L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2259C = dimensionPixelOffset;
                    M(this.f2267L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2288d = obtainStyledAttributes.getInt(11, 500);
            this.f2298o = obtainStyledAttributes.getBoolean(17, false);
            this.f2299p = obtainStyledAttributes.getBoolean(18, false);
            this.f2300q = obtainStyledAttributes.getBoolean(19, false);
            this.f2301r = obtainStyledAttributes.getBoolean(20, true);
            this.f2302s = obtainStyledAttributes.getBoolean(14, false);
            this.f2303t = obtainStyledAttributes.getBoolean(15, false);
            this.f2304u = obtainStyledAttributes.getBoolean(16, false);
            this.f2307x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f2286c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
