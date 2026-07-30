package com.google.android.material.bottomsheet;

import B.b;
import C3.g;
import C3.k;
import D3.d;
import D3.f;
import F3.D;
import G1.a;
import M.h;
import M0.i;
import O.C0334a;
import O.C0336b;
import O.J;
import O.L;
import O.X;
import O.i0;
import O.j0;
import O.k0;
import S0.s;
import W.e;
import android.R;
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
import com.anythink.basead.exoplayer.h.o;
import com.google.android.gms.internal.ads.C2561Fo;
import com.google.android.gms.internal.ads.CL;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import n3.C4811a;
import t0.AbstractC5051n;
import w3.l;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends b {

    /* renamed from: A, reason: collision with root package name */
    public final f f35993A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f35994B;

    /* renamed from: C, reason: collision with root package name */
    public final int f35995C;

    /* renamed from: D, reason: collision with root package name */
    public int f35996D;

    /* renamed from: E, reason: collision with root package name */
    public int f35997E;

    /* renamed from: F, reason: collision with root package name */
    public final float f35998F;

    /* renamed from: G, reason: collision with root package name */
    public int f35999G;

    /* renamed from: H, reason: collision with root package name */
    public final float f36000H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f36001I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f36002K;

    /* renamed from: L, reason: collision with root package name */
    public int f36003L;

    /* renamed from: M, reason: collision with root package name */
    public e f36004M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f36005N;

    /* renamed from: O, reason: collision with root package name */
    public int f36006O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f36007P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f36008Q;

    /* renamed from: R, reason: collision with root package name */
    public int f36009R;

    /* renamed from: S, reason: collision with root package name */
    public int f36010S;

    /* renamed from: T, reason: collision with root package name */
    public int f36011T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f36012U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f36013V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f36014W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f36015X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f36016Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f36017a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f36018a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36019b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f36020b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f36021c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f36022c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f36023d;

    /* renamed from: d0, reason: collision with root package name */
    public final d f36024d0;

    /* renamed from: e, reason: collision with root package name */
    public int f36025e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36026f;

    /* renamed from: g, reason: collision with root package name */
    public int f36027g;

    /* renamed from: h, reason: collision with root package name */
    public final int f36028h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f36029j;

    /* renamed from: k, reason: collision with root package name */
    public final int f36030k;

    /* renamed from: l, reason: collision with root package name */
    public final int f36031l;

    /* renamed from: m, reason: collision with root package name */
    public int f36032m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f36033n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f36034o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f36035p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f36036q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f36037r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f36038s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f36039t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f36040u;

    /* renamed from: v, reason: collision with root package name */
    public int f36041v;

    /* renamed from: w, reason: collision with root package name */
    public int f36042w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f36043x;

    /* renamed from: y, reason: collision with root package name */
    public final k f36044y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f36045z;

    public BottomSheetBehavior() {
        this.f36017a = 0;
        this.f36019b = true;
        this.f36030k = -1;
        this.f36031l = -1;
        this.f35993A = new f(this);
        this.f35998F = 0.5f;
        this.f36000H = -1.0f;
        this.f36002K = true;
        this.f36003L = 4;
        this.f36008Q = 0.1f;
        this.f36014W = new ArrayList();
        this.f36016Z = -1;
        this.f36022c0 = new SparseIntArray();
        this.f36024d0 = new d(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = X.f2240a;
        if (L.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View v6 = v(viewGroup.getChildAt(i));
            if (v6 != null) {
                return v6;
            }
        }
        return null;
    }

    public static int w(int i, int i4, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i4, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.f36026f) {
                return;
            } else {
                this.f36026f = true;
            }
        } else {
            if (!this.f36026f && this.f36025e == i) {
                return;
            }
            this.f36026f = false;
            this.f36025e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC5051n.g(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f36001I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i4 = (i == 6 && this.f36019b && y(i) <= this.f35996D) ? 3 : i;
        WeakReference weakReference = this.f36012U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f36012U.get();
        i iVar = new i(this, view, i4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = X.f2240a;
            if (view.isAttachedToWindow()) {
                view.post(iVar);
                return;
            }
        }
        iVar.run();
    }

    public final void C(int i) {
        if (this.f36003L == i) {
            return;
        }
        this.f36003L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z8 = this.f36001I;
        }
        WeakReference weakReference = this.f36012U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f36014W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f6) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.f35999G) {
            return false;
        }
        return Math.abs(((f6 * this.f36008Q) + ((float) view.getTop())) - ((float) this.f35999G)) / ((float) t()) > 0.5f;
    }

    public final void E(View view, int i, boolean z8) {
        int y6 = y(i);
        e eVar = this.f36004M;
        if (eVar == null || (!z8 ? eVar.s(view.getLeft(), y6, view) : eVar.q(view.getLeft(), y6))) {
            C(i);
            return;
        }
        C(2);
        G(i, true);
        this.f35993A.a(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f36012U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.l(524288, view);
        X.i(0, view);
        X.l(262144, view);
        X.i(0, view);
        X.l(o.f7899d, view);
        X.i(0, view);
        SparseIntArray sparseIntArray = this.f36022c0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            X.l(i4, view);
            X.i(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.f36019b && this.f36003L != 6) {
            String string = view.getResources().getString(C5284R.string.bottomsheet_action_expand_halfway);
            a aVar = new a(this, r5, 17);
            ArrayList f6 = X.f(view);
            int i9 = 0;
            while (true) {
                if (i9 >= f6.size()) {
                    int i10 = -1;
                    for (int i11 = 0; i11 < 32 && i10 == -1; i11++) {
                        int i12 = X.f2243d[i11];
                        boolean z8 = true;
                        for (int i13 = 0; i13 < f6.size(); i13++) {
                            z8 &= ((P.f) f6.get(i13)).a() != i12;
                        }
                        if (z8) {
                            i10 = i12;
                        }
                    }
                    i = i10;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((P.f) f6.get(i9)).f2669a).getLabel())) {
                        i = ((P.f) f6.get(i9)).a();
                        break;
                    }
                    i9++;
                }
            }
            if (i != -1) {
                P.f fVar = new P.f(null, i, string, aVar, null);
                View.AccessibilityDelegate d2 = X.d(view);
                C0336b c0336b = d2 == null ? null : d2 instanceof C0334a ? ((C0334a) d2).f2246a : new C0336b(d2);
                if (c0336b == null) {
                    c0336b = new C0336b();
                }
                X.o(view, c0336b);
                X.l(fVar.a(), view);
                X.f(view).add(fVar);
                X.i(0, view);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f36001I) {
            int i14 = 5;
            if (this.f36003L != 5) {
                X.m(view, P.f.f2666l, new a(this, i14, 17));
            }
        }
        int i15 = this.f36003L;
        int i16 = 4;
        int i17 = 3;
        if (i15 == 3) {
            X.m(view, P.f.f2665k, new a(this, this.f36019b ? 4 : 6, 17));
            return;
        }
        if (i15 == 4) {
            X.m(view, P.f.f2664j, new a(this, this.f36019b ? 3 : 6, 17));
        } else {
            if (i15 != 6) {
                return;
            }
            X.m(view, P.f.f2665k, new a(this, i16, 17));
            X.m(view, P.f.f2664j, new a(this, i17, 17));
        }
    }

    public final void G(int i, boolean z8) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f35994B;
        if (i == 2) {
            return;
        }
        boolean z9 = this.f36003L == 3 && (this.f36043x || z());
        if (this.f36045z == z9 || gVar == null) {
            return;
        }
        this.f36045z = z9;
        if (z8 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f413n.i, z9 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s3 = this.f36045z ? s() : 1.0f;
        C3.f fVar = gVar.f413n;
        if (fVar.i != s3) {
            fVar.i = s3;
            gVar.f417x = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z8) {
        WeakReference weakReference = this.f36012U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z8) {
                if (this.f36020b0 != null) {
                    return;
                } else {
                    this.f36020b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f36012U.get() && z8) {
                    this.f36020b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z8) {
                return;
            }
            this.f36020b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f36012U != null) {
            r();
            if (this.f36003L != 4 || (view = (View) this.f36012U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // B.b
    public final void c(B.e eVar) {
        this.f36012U = null;
        this.f36004M = null;
    }

    @Override // B.b
    public final void e() {
        this.f36012U = null;
        this.f36004M = null;
    }

    @Override // B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        e eVar;
        if (!view.isShown() || !this.f36002K) {
            this.f36005N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            this.f36016Z = -1;
            VelocityTracker velocityTracker = this.f36015X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36015X = null;
            }
        }
        if (this.f36015X == null) {
            this.f36015X = VelocityTracker.obtain();
        }
        this.f36015X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.f36016Z = (int) motionEvent.getY();
            if (this.f36003L != 2) {
                WeakReference weakReference = this.f36013V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(x3, this.f36016Z, view2)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f36018a0 = true;
                }
            }
            this.f36005N = this.Y == -1 && !coordinatorLayout.o(x3, this.f36016Z, view);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f36018a0 = false;
            this.Y = -1;
            if (this.f36005N) {
                this.f36005N = false;
                return false;
            }
        }
        if (this.f36005N || (eVar = this.f36004M) == null || !eVar.r(motionEvent)) {
            WeakReference weakReference2 = this.f36013V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f36005N || this.f36003L == 1 || coordinatorLayout.o((int) motionEvent.getX(), (int) motionEvent.getY(), view3) || this.f36004M == null || (i = this.f36016Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.f36004M.f3392b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [int[], java.io.Serializable] */
    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i4 = this.f36031l;
        g gVar = this.i;
        WeakHashMap weakHashMap = X.f2240a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f36012U == null) {
            this.f36027g = coordinatorLayout.getResources().getDimensionPixelSize(C5284R.dimen.design_bottom_sheet_peek_height_min);
            int i9 = Build.VERSION.SDK_INT;
            boolean z8 = (i9 < 29 || this.f36033n || this.f36026f) ? false : true;
            if (this.f36034o || this.f36035p || this.f36036q || this.f36038s || this.f36039t || this.f36040u || z8) {
                h hVar = new h(this, z8);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                W2.b bVar = new W2.b();
                bVar.f3423a = paddingStart;
                bVar.f3424b = paddingEnd;
                bVar.f3425c = paddingBottom;
                L.u(view, new s(19, hVar, bVar));
                if (view.isAttachedToWindow()) {
                    J.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new l());
                }
            }
            C2561Fo c2561Fo = new C2561Fo();
            c2561Fo.f25021x = new int[2];
            c2561Fo.f25020w = view;
            if (i9 >= 30) {
                view.setWindowInsetsAnimationCallback(new k0(c2561Fo));
            } else {
                PathInterpolator pathInterpolator = j0.f2277e;
                Object tag = view.getTag(C5284R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener i0Var = new i0(view, c2561Fo);
                view.setTag(C5284R.id.tag_window_insets_animation_callback, i0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(i0Var);
                }
            }
            this.f36012U = new WeakReference(view);
            Context context = view.getContext();
            K3.b.z(context, C5284R.attr.motionEasingStandardDecelerateInterpolator, Q.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            K3.b.y(context, C5284R.attr.motionDurationMedium2, 300);
            K3.b.y(context, C5284R.attr.motionDurationShort3, 150);
            K3.b.y(context, C5284R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C5284R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(C5284R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f6 = this.f36000H;
                if (f6 == -1.0f) {
                    f6 = L.i(view);
                }
                gVar.i(f6);
            } else {
                ColorStateList colorStateList = this.f36029j;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f36004M == null) {
            this.f36004M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f36024d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(i, view);
        this.f36010S = coordinatorLayout.getWidth();
        this.f36011T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f36009R = height;
        int i10 = this.f36011T;
        int i11 = i10 - height;
        int i12 = this.f36042w;
        if (i11 < i12) {
            if (this.f36037r) {
                if (i4 != -1) {
                    i10 = Math.min(i10, i4);
                }
                this.f36009R = i10;
            } else {
                int i13 = i10 - i12;
                if (i4 != -1) {
                    i13 = Math.min(i13, i4);
                }
                this.f36009R = i13;
            }
        }
        this.f35996D = Math.max(0, this.f36011T - this.f36009R);
        this.f35997E = (int) ((1.0f - this.f35998F) * this.f36011T);
        r();
        int i14 = this.f36003L;
        if (i14 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i14 == 6) {
            view.offsetTopAndBottom(this.f35997E);
        } else if (this.f36001I && i14 == 5) {
            view.offsetTopAndBottom(this.f36011T);
        } else if (i14 == 4) {
            view.offsetTopAndBottom(this.f35999G);
        } else if (i14 == 1 || i14 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f36003L, false);
        this.f36013V = new WeakReference(v(view));
        ArrayList arrayList = this.f36014W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f36030k, marginLayoutParams.width), w(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f36031l, marginLayoutParams.height));
        return true;
    }

    @Override // B.b
    public final boolean i(View view) {
        WeakReference weakReference = this.f36013V;
        return (weakReference == null || view != weakReference.get() || this.f36003L == 3) ? false : true;
    }

    @Override // B.b
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i9) {
        boolean z8 = this.f36002K;
        if (i9 == 1) {
            return;
        }
        WeakReference weakReference = this.f36013V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i10 = top - i4;
        if (i4 > 0) {
            if (i10 < x()) {
                int x3 = top - x();
                iArr[1] = x3;
                WeakHashMap weakHashMap = X.f2240a;
                view.offsetTopAndBottom(-x3);
                C(3);
            } else {
                if (!z8) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap2 = X.f2240a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
            int i11 = this.f35999G;
            if (i10 > i11 && !this.f36001I) {
                int i12 = top - i11;
                iArr[1] = i12;
                WeakHashMap weakHashMap3 = X.f2240a;
                view.offsetTopAndBottom(-i12);
                C(4);
            } else {
                if (!z8) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap4 = X.f2240a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        }
        u(view.getTop());
        this.f36006O = i4;
        this.f36007P = true;
    }

    @Override // B.b
    public final void m(View view, Parcelable parcelable) {
        C4811a c4811a = (C4811a) parcelable;
        int i = this.f36017a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f36025e = c4811a.f39642w;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f36019b = c4811a.f39643x;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f36001I = c4811a.f39644y;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = c4811a.f39645z;
            }
        }
        int i4 = c4811a.f39641v;
        if (i4 == 1 || i4 == 2) {
            this.f36003L = 4;
        } else {
            this.f36003L = i4;
        }
    }

    @Override // B.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C4811a(this);
    }

    @Override // B.b
    public final boolean o(int i, int i4, View view) {
        this.f36006O = 0;
        this.f36007P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f35997E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f35996D) < java.lang.Math.abs(r5 - r3.f35999G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f35999G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f35999G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f35997E) < java.lang.Math.abs(r5 - r3.f35999G)) goto L50;
     */
    @Override // B.b
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
        WeakReference weakReference = this.f36013V;
        if (weakReference != null && view2 == weakReference.get() && this.f36007P) {
            if (this.f36006O > 0) {
                if (!this.f36019b) {
                }
                E(view, i4, false);
                this.f36007P = false;
            }
            if (this.f36001I) {
                VelocityTracker velocityTracker = this.f36015X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f36021c);
                    yVelocity = this.f36015X.getYVelocity(this.Y);
                }
                if (D(view, yVelocity)) {
                    i4 = 5;
                    E(view, i4, false);
                    this.f36007P = false;
                }
            }
            if (this.f36006O == 0) {
                int top = view.getTop();
                if (!this.f36019b) {
                    int i9 = this.f35997E;
                    if (top < i9) {
                    }
                    i4 = 6;
                }
            } else {
                if (!this.f36019b) {
                    int top2 = view.getTop();
                }
                i4 = 4;
            }
            E(view, i4, false);
            this.f36007P = false;
        }
    }

    @Override // B.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f36003L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f36004M;
        if (eVar != null && (this.f36002K || i == 1)) {
            eVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.f36016Z = -1;
            VelocityTracker velocityTracker = this.f36015X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36015X = null;
            }
        }
        if (this.f36015X == null) {
            this.f36015X = VelocityTracker.obtain();
        }
        this.f36015X.addMovement(motionEvent);
        if (this.f36004M != null && ((this.f36002K || this.f36003L == 1) && actionMasked == 2 && !this.f36005N)) {
            float abs = Math.abs(this.f36016Z - motionEvent.getY());
            e eVar2 = this.f36004M;
            if (abs > eVar2.f3392b) {
                eVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f36005N;
    }

    public final void r() {
        int t9 = t();
        if (this.f36019b) {
            this.f35999G = Math.max(this.f36011T - t9, this.f35996D);
        } else {
            this.f35999G = this.f36011T - t9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f6;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f9 = 0.0f;
        if (this.i != null && (weakReference = this.f36012U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f36012U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float a9 = gVar.f413n.f383a.f436e.a(gVar.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f10 = radius2;
                    if (f10 > 0.0f && a9 > 0.0f) {
                        f6 = f10 / a9;
                        g gVar2 = this.i;
                        float a10 = gVar2.f413n.f383a.f437f.a(gVar2.f());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f11 = radius;
                            if (f11 > 0.0f && a10 > 0.0f) {
                                f9 = f11 / a10;
                            }
                        }
                        return Math.max(f6, f9);
                    }
                }
                f6 = 0.0f;
                g gVar22 = this.i;
                float a102 = gVar22.f413n.f383a.f437f.a(gVar22.f());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f6, f9);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        return this.f36026f ? Math.min(Math.max(this.f36027g, this.f36011T - ((this.f36010S * 9) / 16)), this.f36009R) + this.f36041v : (this.f36033n || this.f36034o || (i = this.f36032m) <= 0) ? this.f36025e + this.f36041v : Math.max(this.f36025e, i + this.f36028h);
    }

    public final void u(int i) {
        if (((View) this.f36012U.get()) != null) {
            ArrayList arrayList = this.f36014W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i4 = this.f35999G;
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
        if (this.f36019b) {
            return this.f35996D;
        }
        return Math.max(this.f35995C, this.f36037r ? 0 : this.f36042w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f35999G;
        }
        if (i == 5) {
            return this.f36011T;
        }
        if (i == 6) {
            return this.f35997E;
        }
        throw new IllegalArgumentException(CL.i(i, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.f36012U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f36012U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i4 = 1;
        this.f36017a = 0;
        this.f36019b = true;
        this.f36030k = -1;
        this.f36031l = -1;
        this.f35993A = new f(this);
        this.f35998F = 0.5f;
        this.f36000H = -1.0f;
        this.f36002K = true;
        this.f36003L = 4;
        this.f36008Q = 0.1f;
        this.f36014W = new ArrayList();
        this.f36016Z = -1;
        this.f36022c0 = new SparseIntArray();
        this.f36024d0 = new d(this, i4);
        this.f36028h = context.getResources().getDimensionPixelSize(C5284R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4576a.f38292a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f36029j = com.bumptech.glide.d.o(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f36044y = k.b(context, attributeSet, C5284R.attr.bottomSheetStyle, C5284R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f36044y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f36029j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f35994B = ofFloat;
        ofFloat.setDuration(500L);
        this.f35994B.addUpdateListener(new D(i4, this));
        this.f36000H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f36030k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f36031l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z8 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f36001I != z8) {
            this.f36001I = z8;
            if (!z8 && this.f36003L == 5) {
                B(4);
            }
            F();
        }
        this.f36033n = obtainStyledAttributes.getBoolean(13, false);
        boolean z9 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f36019b != z9) {
            this.f36019b = z9;
            if (this.f36012U != null) {
                r();
            }
            C((this.f36019b && this.f36003L == 6) ? 3 : this.f36003L);
            G(this.f36003L, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.f36002K = obtainStyledAttributes.getBoolean(4, true);
        this.f36017a = obtainStyledAttributes.getInt(10, 0);
        float f6 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f6 > 0.0f && f6 < 1.0f) {
            this.f35998F = f6;
            if (this.f36012U != null) {
                this.f35997E = (int) ((1.0f - f6) * this.f36011T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i9 = peekValue2.data;
                if (i9 >= 0) {
                    this.f35995C = i9;
                    G(this.f36003L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f35995C = dimensionPixelOffset;
                    G(this.f36003L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f36023d = obtainStyledAttributes.getInt(11, 500);
            this.f36034o = obtainStyledAttributes.getBoolean(17, false);
            this.f36035p = obtainStyledAttributes.getBoolean(18, false);
            this.f36036q = obtainStyledAttributes.getBoolean(19, false);
            this.f36037r = obtainStyledAttributes.getBoolean(20, true);
            this.f36038s = obtainStyledAttributes.getBoolean(14, false);
            this.f36039t = obtainStyledAttributes.getBoolean(15, false);
            this.f36040u = obtainStyledAttributes.getBoolean(16, false);
            this.f36043x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f36021c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // B.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i9, int[] iArr) {
    }
}
