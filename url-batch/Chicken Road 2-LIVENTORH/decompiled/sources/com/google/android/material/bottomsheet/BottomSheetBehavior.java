package com.google.android.material.bottomsheet;

import a.y;
import a0.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
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
import androidx.fragment.app.w0;
import com.oriondriftchasers.arordrft.R;
import e2.l;
import e2.o;
import g.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.u0;
import l2.j;
import l2.n;
import m2.c;
import m2.e;
import n0.a;
import n0.d0;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b {
    public final e A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public t0.e O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f819a;

    /* renamed from: a0, reason: collision with root package name */
    public int f820a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f821b;

    /* renamed from: b0, reason: collision with root package name */
    public int f822b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f823c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f824c0;
    public final int d;
    public HashMap d0;

    /* renamed from: e, reason: collision with root package name */
    public int f825e;

    /* renamed from: e0, reason: collision with root package name */
    public final SparseIntArray f826e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f827f;

    /* renamed from: f0, reason: collision with root package name */
    public final c f828f0;

    /* renamed from: g, reason: collision with root package name */
    public int f829g;

    /* renamed from: h, reason: collision with root package name */
    public final int f830h;
    public final j i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f831j;

    /* renamed from: k, reason: collision with root package name */
    public final int f832k;

    /* renamed from: l, reason: collision with root package name */
    public final int f833l;

    /* renamed from: m, reason: collision with root package name */
    public int f834m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f835n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f836o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f837p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f838q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f839r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f840s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f841t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f842u;

    /* renamed from: v, reason: collision with root package name */
    public int f843v;

    /* renamed from: w, reason: collision with root package name */
    public int f844w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f845x;

    /* renamed from: y, reason: collision with root package name */
    public final n f846y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f847z;

    public BottomSheetBehavior() {
        this.f819a = 0;
        this.f821b = true;
        this.f832k = -1;
        this.f833l = -1;
        this.A = new e(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f822b0 = -1;
        this.f826e0 = new SparseIntArray();
        this.f828f0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View v3 = v(viewGroup.getChildAt(i));
            if (v3 != null) {
                return v3;
            }
        }
        return null;
    }

    public static int w(int i, int i4, int i5, int i6) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i4, i6);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
        }
        if (size != 0) {
            i5 = Math.min(size, i5);
        }
        return View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.f827f) {
                return;
            } else {
                this.f827f = true;
            }
        } else {
            if (!this.f827f && this.f825e == i) {
                return;
            }
            this.f827f = false;
            this.f825e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i4 = (i == 6 && this.f821b && y(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.W.get();
        u0 u0Var = new u0(this, view, i4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(u0Var);
        } else {
            u0Var.run();
        }
    }

    public final void C(int i) {
        if (this.N == i) {
            return;
        }
        this.N = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z3 = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f2 * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z3) {
        int y3 = y(i);
        t0.e eVar = this.O;
        if (eVar != null) {
            if (!z3) {
                int left = view.getLeft();
                eVar.f3303r = view;
                eVar.f3290c = -1;
                boolean h4 = eVar.h(left, y3, 0, 0);
                if (!h4 && eVar.f3288a == 0 && eVar.f3303r != null) {
                    eVar.f3303r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        l0.j(view, 524288);
        l0.h(view, 0);
        l0.j(view, 262144);
        l0.h(view, 0);
        l0.j(view, 1048576);
        l0.h(view, 0);
        SparseIntArray sparseIntArray = this.f826e0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            l0.j(view, i4);
            l0.h(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f821b && this.N != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            f fVar = new f(this, 6);
            ArrayList f2 = l0.f(view);
            int i5 = 0;
            while (true) {
                if (i5 >= f2.size()) {
                    int i6 = 0;
                    int i7 = -1;
                    while (true) {
                        int[] iArr = l0.d;
                        if (i6 >= 32 || i7 != -1) {
                            break;
                        }
                        int i8 = iArr[i6];
                        boolean z3 = true;
                        for (int i9 = 0; i9 < f2.size(); i9++) {
                            z3 &= ((o0.c) f2.get(i9)).a() != i8;
                        }
                        if (z3) {
                            i7 = i8;
                        }
                        i6++;
                    }
                    i = i7;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((o0.c) f2.get(i5)).f2857a).getLabel())) {
                        i = ((o0.c) f2.get(i5)).a();
                        break;
                    }
                    i5++;
                }
            }
            if (i != -1) {
                o0.c cVar = new o0.c(null, i, string, fVar, null);
                View.AccessibilityDelegate d = l0.d(view);
                n0.b bVar = d == null ? null : d instanceof a ? ((a) d).f2709a : new n0.b(d);
                if (bVar == null) {
                    bVar = new n0.b();
                }
                l0.m(view, bVar);
                l0.j(view, cVar.a());
                l0.f(view).add(cVar);
                l0.h(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.I && this.N != 5) {
            l0.k(view, o0.c.f2854j, new f(this, 5));
        }
        int i10 = this.N;
        if (i10 == 3) {
            l0.k(view, o0.c.i, new f(this, this.f821b ? 4 : 6));
            return;
        }
        if (i10 == 4) {
            l0.k(view, o0.c.f2853h, new f(this, this.f821b ? 3 : 6));
        } else {
            if (i10 != 6) {
                return;
            }
            l0.k(view, o0.c.i, new f(this, 4));
            l0.k(view, o0.c.f2853h, new f(this, 3));
        }
    }

    public final void G(int i, boolean z3) {
        j jVar;
        if (i == 2) {
            return;
        }
        boolean z4 = this.N == 3 && (this.f845x || z());
        if (this.f847z == z4 || (jVar = this.i) == null) {
            return;
        }
        this.f847z = z4;
        ValueAnimator valueAnimator = this.B;
        if (!z3 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            jVar.r(this.f847z ? s() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(jVar.f2598g.f2588j, z4 ? s() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void H(boolean z3) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.d0 != null) {
                    return;
                } else {
                    this.d0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.W.get() && z3) {
                    this.d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z3) {
                return;
            }
            this.d0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.W != null) {
            r();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // a0.b
    public final void c(a0.e eVar) {
        this.W = null;
        this.O = null;
    }

    @Override // a0.b
    public final void e() {
        this.W = null;
        this.O = null;
    }

    @Override // a0.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        t0.e eVar;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f820a0 = -1;
            this.f822b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            this.f822b0 = y3;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x3, y3)) {
                    this.f820a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f824c0 = true;
                }
            }
            this.P = this.f820a0 == -1 && !coordinatorLayout.o(view, x3, this.f822b0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f824c0 = false;
            this.f820a0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (eVar = this.O) == null || !eVar.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i = this.f822b0) == -1 || Math.abs(i - motionEvent.getY()) <= this.O.f3289b) {
                return false;
            }
        }
        return true;
    }

    @Override // a0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f829g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z3 = (Build.VERSION.SDK_INT < 29 || this.f835n || this.f827f) ? false : true;
            if (this.f836o || this.f837p || this.f838q || this.f840s || this.f841t || this.f842u || z3) {
                o.d(view, new l0.f(this, z3));
            }
            l0.o(view, new u1.b(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            y.R(context, R.attr.motionDurationMedium2, 300);
            y.R(context, R.attr.motionDurationShort3, 150);
            y.R(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            j jVar = this.i;
            if (jVar != null) {
                view.setBackground(jVar);
                float f2 = this.H;
                if (f2 == -1.0f) {
                    f2 = view.getElevation();
                }
                jVar.p(f2);
            } else {
                ColorStateList colorStateList = this.f831j;
                if (colorStateList != null) {
                    d0.g(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new t0.e(coordinatorLayout.getContext(), coordinatorLayout, this.f828f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i4 = this.V;
        int i5 = i4 - height;
        int i6 = this.f844w;
        if (i5 < i6) {
            boolean z4 = this.f839r;
            int i7 = this.f833l;
            if (z4) {
                if (i7 != -1) {
                    i4 = Math.min(i4, i7);
                }
                this.T = i4;
            } else {
                int i8 = i4 - i6;
                if (i7 != -1) {
                    i8 = Math.min(i8, i7);
                }
                this.T = i8;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        r();
        int i9 = this.N;
        if (i9 == 3) {
            int x3 = x();
            WeakHashMap weakHashMap = l0.f2757a;
            view.offsetTopAndBottom(x3);
        } else if (i9 == 6) {
            int i10 = this.E;
            WeakHashMap weakHashMap2 = l0.f2757a;
            view.offsetTopAndBottom(i10);
        } else if (this.I && i9 == 5) {
            int i11 = this.V;
            WeakHashMap weakHashMap3 = l0.f2757a;
            view.offsetTopAndBottom(i11);
        } else if (i9 == 4) {
            int i12 = this.G;
            WeakHashMap weakHashMap4 = l0.f2757a;
            view.offsetTopAndBottom(i12);
        } else if (i9 == 1 || i9 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = l0.f2757a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // a0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f832k, marginLayoutParams.width), w(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f833l, marginLayoutParams.height));
        return true;
    }

    @Override // a0.b
    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // a0.b
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i5) {
        if (i5 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i6 = top - i4;
        boolean z3 = this.K;
        boolean z4 = this.L;
        if (i4 > 0) {
            if (!this.R && !z4 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i6 < x()) {
                int x3 = top - x();
                iArr[1] = x3;
                WeakHashMap weakHashMap = l0.f2757a;
                view.offsetTopAndBottom(-x3);
                C(3);
            } else {
                if (!z3) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap2 = l0.f2757a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        } else if (i4 < 0) {
            boolean canScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z4 && view2 == view3 && canScrollVertically) {
                this.M = true;
                return;
            }
            if (!canScrollVertically) {
                int i7 = this.G;
                if (i6 > i7 && !this.I) {
                    int i8 = top - i7;
                    iArr[1] = i8;
                    WeakHashMap weakHashMap3 = l0.f2757a;
                    view.offsetTopAndBottom(-i8);
                    C(4);
                } else {
                    if (!z3) {
                        return;
                    }
                    iArr[1] = i4;
                    WeakHashMap weakHashMap4 = l0.f2757a;
                    view.offsetTopAndBottom(-i4);
                    C(1);
                }
            }
        }
        u(view.getTop());
        this.Q = i4;
        this.R = true;
        this.M = false;
    }

    @Override // a0.b
    public final void m(View view, Parcelable parcelable) {
        u1.a aVar = (u1.a) parcelable;
        int i = this.f819a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f825e = aVar.i;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f821b = aVar.f3349j;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = aVar.f3350k;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = aVar.f3351l;
            }
        }
        int i4 = aVar.f3348h;
        if (i4 == 1 || i4 == 2) {
            this.N = 4;
        } else {
            this.N = i4;
        }
    }

    @Override // a0.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new u1.a(this);
    }

    @Override // a0.b
    public final boolean o(View view, int i, int i4) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.D) < java.lang.Math.abs(r5 - r3.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.E) < java.lang.Math.abs(r5 - r3.G)) goto L50;
     */
    @Override // a0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i) {
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.X;
        if (weakReference != null && view2 == weakReference.get() && this.R) {
            if (this.Q > 0) {
                if (!this.f821b) {
                }
                E(view, i4, false);
                this.R = false;
            }
            if (this.I) {
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f823c);
                    yVelocity = this.Z.getYVelocity(this.f820a0);
                }
                if (D(view, yVelocity)) {
                    i4 = 5;
                    E(view, i4, false);
                    this.R = false;
                }
            }
            if (this.Q == 0) {
                int top = view.getTop();
                if (!this.f821b) {
                    int i5 = this.E;
                    if (top < i5) {
                    }
                    i4 = 6;
                }
            } else {
                if (!this.f821b) {
                    int top2 = view.getTop();
                }
                i4 = 4;
            }
            E(view, i4, false);
            this.R = false;
        }
    }

    @Override // a0.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        t0.e eVar = this.O;
        if (eVar != null && (this.K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f820a0 = -1;
            this.f822b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float abs = Math.abs(this.f822b0 - motionEvent.getY());
            t0.e eVar2 = this.O;
            if (abs > eVar2.f3289b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int t2 = t();
        if (this.f821b) {
            this.G = Math.max(this.V - t2, this.D);
        } else {
            this.G = this.V - t2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f2;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f4 = 0.0f;
        if (this.i != null && (weakReference = this.W) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.W.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float k4 = this.i.k();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f5 = radius2;
                    if (f5 > 0.0f && k4 > 0.0f) {
                        f2 = f5 / k4;
                        j jVar = this.i;
                        float[] fArr = jVar.G;
                        float a2 = fArr == null ? fArr[0] : jVar.f2598g.f2581a.f2632f.a(jVar.h());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f6 = radius;
                            if (f6 > 0.0f && a2 > 0.0f) {
                                f4 = f6 / a2;
                            }
                        }
                        return Math.max(f2, f4);
                    }
                }
                f2 = 0.0f;
                j jVar2 = this.i;
                float[] fArr2 = jVar2.G;
                if (fArr2 == null) {
                }
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f4);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        return this.f827f ? Math.min(Math.max(this.f829g, this.V - ((this.U * 9) / 16)), this.T) + this.f843v : (this.f835n || this.f836o || (i = this.f834m) <= 0) ? this.f825e + this.f843v : Math.max(this.f825e, i + this.f830h);
    }

    public final void u(int i) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i4 = this.G;
            if (i <= i4 && i4 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int x() {
        if (this.f821b) {
            return this.D;
        }
        return Math.max(this.C, this.f839r ? 0 : this.f844w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.V;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(w0.d("Invalid state to get top offset: ", i));
    }

    public final boolean z() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f819a = 0;
        this.f821b = true;
        this.f832k = -1;
        this.f833l = -1;
        this.A = new e(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f822b0 = -1;
        this.f826e0 = new SparseIntArray();
        this.f828f0 = new c(this, 1);
        this.f830h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f2812c);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f831j = h.a.t(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.f846y = n.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        n nVar = this.f846y;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.i = jVar;
            jVar.m(context);
            ColorStateList colorStateList = this.f831j;
            if (colorStateList != null) {
                this.i.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new l(r7, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f832k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f833l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z3 = obtainStyledAttributes.getBoolean(9, false);
        if (this.I != z3) {
            this.I = z3;
            if (!z3 && this.N == 5) {
                B(4);
            }
            F();
        }
        this.f835n = obtainStyledAttributes.getBoolean(14, false);
        boolean z4 = obtainStyledAttributes.getBoolean(7, true);
        if (this.f821b != z4) {
            this.f821b = z4;
            if (this.W != null) {
                r();
            }
            C((this.f821b && this.N == 6) ? 3 : this.N);
            G(this.N, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.f819a = obtainStyledAttributes.getInt(11, 0);
        float f2 = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.F = f2;
            if (this.W != null) {
                this.E = (int) ((1.0f - f2) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i4 = peekValue2.data;
                if (i4 >= 0) {
                    this.C = i4;
                    G(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(12, 500);
            this.f836o = obtainStyledAttributes.getBoolean(18, false);
            this.f837p = obtainStyledAttributes.getBoolean(19, false);
            this.f838q = obtainStyledAttributes.getBoolean(20, false);
            this.f839r = obtainStyledAttributes.getBoolean(21, true);
            this.f840s = obtainStyledAttributes.getBoolean(15, false);
            this.f841t = obtainStyledAttributes.getBoolean(16, false);
            this.f842u = obtainStyledAttributes.getBoolean(17, false);
            this.f845x = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.f823c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // a0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
    }
}
