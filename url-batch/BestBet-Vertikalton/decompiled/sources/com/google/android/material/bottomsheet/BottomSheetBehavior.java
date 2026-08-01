package com.google.android.material.bottomsheet;

import C0.b;
import C0.c;
import C0.f;
import C0.h;
import C0.j;
import G1.AbstractC0001b;
import H1.l;
import K.C0005a;
import K.C0006b;
import K.C0008d;
import K.D;
import K.F;
import K.Q;
import K.e0;
import K.f0;
import K.g0;
import L0.m;
import L0.n;
import M.a;
import R0.g;
import R0.k;
import T.e;
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
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import u0.C0365d;
import x.AbstractC0392a;
import x.d;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0392a {

    /* renamed from: A, reason: collision with root package name */
    public final j f2145A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f2146B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2147C;

    /* renamed from: D, reason: collision with root package name */
    public int f2148D;

    /* renamed from: E, reason: collision with root package name */
    public int f2149E;
    public final float F;

    /* renamed from: G, reason: collision with root package name */
    public int f2150G;

    /* renamed from: H, reason: collision with root package name */
    public final float f2151H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2152I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2153J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f2154K;

    /* renamed from: L, reason: collision with root package name */
    public int f2155L;

    /* renamed from: M, reason: collision with root package name */
    public e f2156M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2157N;

    /* renamed from: O, reason: collision with root package name */
    public int f2158O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2159P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f2160Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2161R;

    /* renamed from: S, reason: collision with root package name */
    public int f2162S;

    /* renamed from: T, reason: collision with root package name */
    public int f2163T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f2164U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f2165V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f2166W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f2167X;

    /* renamed from: Y, reason: collision with root package name */
    public int f2168Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2169Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f2170a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2171a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2172b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f2173b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f2174c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f2175c0;
    public final int d;

    /* renamed from: d0, reason: collision with root package name */
    public final C0.e f2176d0;

    /* renamed from: e, reason: collision with root package name */
    public int f2177e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2178f;

    /* renamed from: g, reason: collision with root package name */
    public int f2179g;
    public final int h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f2180j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2181k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2182l;

    /* renamed from: m, reason: collision with root package name */
    public int f2183m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2184n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2185o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2186p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2187q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2188r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2189s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2190t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2191u;

    /* renamed from: v, reason: collision with root package name */
    public int f2192v;

    /* renamed from: w, reason: collision with root package name */
    public int f2193w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2194x;

    /* renamed from: y, reason: collision with root package name */
    public final k f2195y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2196z;

    public BottomSheetBehavior() {
        this.f2170a = 0;
        this.f2172b = true;
        this.f2181k = -1;
        this.f2182l = -1;
        this.f2145A = new j(this);
        this.F = 0.5f;
        this.f2151H = -1.0f;
        this.f2154K = true;
        this.f2155L = 4;
        this.f2160Q = 0.1f;
        this.f2166W = new ArrayList();
        this.f2169Z = -1;
        this.f2175c0 = new SparseIntArray();
        this.f2176d0 = new C0.e(this, 0);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = Q.f578a;
        if (F.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View v2 = v(viewGroup.getChildAt(i));
                if (v2 != null) {
                    return v2;
                }
            }
        }
        return null;
    }

    public static int w(int i, int i2, int i3, int i4) {
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

    public final void A(int i) {
        if (i == -1) {
            if (this.f2178f) {
                return;
            } else {
                this.f2178f = true;
            }
        } else {
            if (!this.f2178f && this.f2177e == i) {
                return;
            }
            this.f2178f = false;
            this.f2177e = Math.max(0, i);
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
        if (!this.f2152I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f2172b && y(i) <= this.f2148D) ? 3 : i;
        WeakReference weakReference = this.f2164U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f2164U.get();
        b bVar = new b(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = Q.f578a;
            if (view.isAttachedToWindow()) {
                view.post(bVar);
                return;
            }
        }
        bVar.run();
    }

    public final void C(int i) {
        if (this.f2155L == i) {
            return;
        }
        this.f2155L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f2152I;
        }
        WeakReference weakReference = this.f2164U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f2166W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f2153J) {
            return true;
        }
        if (view.getTop() < this.f2150G) {
            return false;
        }
        return Math.abs(((f2 * this.f2160Q) + ((float) view.getTop())) - ((float) this.f2150G)) / ((float) t()) > 0.5f;
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
        r2.f2145A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z2) {
        int y2 = y(i);
        e eVar = this.f2156M;
        if (eVar != null) {
            if (!z2) {
                int left = view.getLeft();
                eVar.f1022r = view;
                eVar.f1010c = -1;
                boolean h = eVar.h(left, y2, 0, 0);
                if (!h && eVar.f1008a == 0 && eVar.f1022r != null) {
                    eVar.f1022r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f2164U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Q.i(view, 524288);
        Q.g(view, 0);
        Q.i(view, 262144);
        Q.g(view, 0);
        Q.i(view, 1048576);
        Q.g(view, 0);
        SparseIntArray sparseIntArray = this.f2175c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            Q.i(view, i2);
            Q.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2172b && this.f2155L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            f fVar = new f(this, 6);
            ArrayList e2 = Q.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= e2.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = Q.d[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < e2.size(); i7++) {
                            z2 &= ((L.e) e2.get(i7)).a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((L.e) e2.get(i3)).f693a).getLabel())) {
                        i = ((L.e) e2.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                L.e eVar = new L.e(null, i, string, fVar, null);
                View.AccessibilityDelegate c2 = Q.c(view);
                C0006b c0006b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f592a : new C0006b(c2);
                if (c0006b == null) {
                    c0006b = new C0006b();
                }
                Q.l(view, c0006b);
                Q.i(view, eVar.a());
                Q.e(view).add(eVar);
                Q.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f2152I && this.f2155L != 5) {
            Q.j(view, L.e.f690j, new f(this, 5));
        }
        int i8 = this.f2155L;
        if (i8 == 3) {
            Q.j(view, L.e.i, new f(this, this.f2172b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            Q.j(view, L.e.h, new f(this, this.f2172b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            Q.j(view, L.e.i, new f(this, 4));
            Q.j(view, L.e.h, new f(this, 3));
        }
    }

    public final void G(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f2146B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f2155L == 3 && (this.f2194x || z());
        if (this.f2196z == z3 || gVar == null) {
            return;
        }
        this.f2196z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f917a.i, z3 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s2 = this.f2196z ? s() : 1.0f;
        R0.f fVar = gVar.f917a;
        if (fVar.i != s2) {
            fVar.i = s2;
            gVar.f920e = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f2164U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f2173b0 != null) {
                    return;
                } else {
                    this.f2173b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f2164U.get() && z2) {
                    this.f2173b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f2173b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f2164U != null) {
            r();
            if (this.f2155L != 4 || (view = (View) this.f2164U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // x.AbstractC0392a
    public final void c(d dVar) {
        this.f2164U = null;
        this.f2156M = null;
    }

    @Override // x.AbstractC0392a
    public final void e() {
        this.f2164U = null;
        this.f2156M = null;
    }

    @Override // x.AbstractC0392a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        e eVar;
        if (!view.isShown() || !this.f2154K) {
            this.f2157N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2168Y = -1;
            this.f2169Z = -1;
            VelocityTracker velocityTracker = this.f2167X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2167X = null;
            }
        }
        if (this.f2167X == null) {
            this.f2167X = VelocityTracker.obtain();
        }
        this.f2167X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f2169Z = (int) motionEvent.getY();
            if (this.f2155L != 2) {
                WeakReference weakReference = this.f2165V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f2169Z)) {
                    this.f2168Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2171a0 = true;
                }
            }
            this.f2157N = this.f2168Y == -1 && !coordinatorLayout.o(view, x2, this.f2169Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2171a0 = false;
            this.f2168Y = -1;
            if (this.f2157N) {
                this.f2157N = false;
                return false;
            }
        }
        if (!this.f2157N && (eVar = this.f2156M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f2165V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f2157N || this.f2155L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2156M == null || (i = this.f2169Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f2156M.f1009b)) ? false : true;
    }

    @Override // x.AbstractC0392a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f2182l;
        g gVar = this.i;
        int i3 = 3;
        WeakHashMap weakHashMap = Q.f578a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2164U == null) {
            this.f2179g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f2184n || this.f2178f) ? false : true;
            if (this.f2185o || this.f2186p || this.f2187q || this.f2189s || this.f2190t || this.f2191u || z2) {
                C0.d dVar = new C0.d(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                n nVar = new n();
                nVar.f779a = paddingStart;
                nVar.f780b = paddingEnd;
                nVar.f781c = paddingBottom;
                F.u(view, new C0365d(dVar, i3, nVar));
                if (view.isAttachedToWindow()) {
                    D.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new m());
                }
            }
            C0008d c0008d = new C0008d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new g0(c0008d));
            } else {
                PathInterpolator pathInterpolator = f0.f611e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener e0Var = new e0(view, c0008d);
                view.setTag(R.id.tag_window_insets_animation_callback, e0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(e0Var);
                }
            }
            this.f2164U = new WeakReference(view);
            Context context = view.getContext();
            l.c0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(RecyclerView.f1937A0, RecyclerView.f1937A0, RecyclerView.f1937A0, 1.0f));
            l.b0(context, R.attr.motionDurationMedium2, 300);
            l.b0(context, R.attr.motionDurationShort3, 150);
            l.b0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f2151H;
                if (f2 == -1.0f) {
                    f2 = F.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f2180j;
                if (colorStateList != null) {
                    F.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2156M == null) {
            this.f2156M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2176d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f2162S = coordinatorLayout.getWidth();
        this.f2163T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2161R = height;
        int i5 = this.f2163T;
        int i6 = i5 - height;
        int i7 = this.f2193w;
        if (i6 < i7) {
            if (this.f2188r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f2161R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f2161R = i8;
            }
        }
        this.f2148D = Math.max(0, this.f2163T - this.f2161R);
        this.f2149E = (int) ((1.0f - this.F) * this.f2163T);
        r();
        int i9 = this.f2155L;
        if (i9 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f2149E);
        } else if (this.f2152I && i9 == 5) {
            view.offsetTopAndBottom(this.f2163T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f2150G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f2155L, false);
        this.f2165V = new WeakReference(v(view));
        ArrayList arrayList = this.f2166W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // x.AbstractC0392a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f2181k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2182l, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0392a
    public final boolean i(View view) {
        WeakReference weakReference = this.f2165V;
        return (weakReference == null || view != weakReference.get() || this.f2155L == 3) ? false : true;
    }

    @Override // x.AbstractC0392a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f2154K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f2165V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                WeakHashMap weakHashMap = Q.f578a;
                view.offsetTopAndBottom(-x2);
                C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = Q.f578a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f2150G;
            if (i4 > i5 && !this.f2152I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = Q.f578a;
                view.offsetTopAndBottom(-i6);
                C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = Q.f578a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        u(view.getTop());
        this.f2158O = i2;
        this.f2159P = true;
    }

    @Override // x.AbstractC0392a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // x.AbstractC0392a
    public final void m(View view, Parcelable parcelable) {
        h hVar = (h) parcelable;
        int i = this.f2170a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f2177e = hVar.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f2172b = hVar.f99e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f2152I = hVar.f100f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f2153J = hVar.f101g;
            }
        }
        int i2 = hVar.f98c;
        if (i2 == 1 || i2 == 2) {
            this.f2155L = 4;
        } else {
            this.f2155L = i2;
        }
    }

    @Override // x.AbstractC0392a
    public final Parcelable n(View view) {
        return new h(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0392a
    public final boolean o(View view, int i, int i2) {
        this.f2158O = 0;
        this.f2159P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f2149E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2148D) < java.lang.Math.abs(r5 - r3.f2150G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f2150G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f2150G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2149E) < java.lang.Math.abs(r5 - r3.f2150G)) goto L50;
     */
    @Override // x.AbstractC0392a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.f2165V;
        if (weakReference != null && view2 == weakReference.get() && this.f2159P) {
            if (this.f2158O > 0) {
                if (!this.f2172b) {
                }
                E(view, i2, false);
                this.f2159P = false;
            }
            if (this.f2152I) {
                VelocityTracker velocityTracker = this.f2167X;
                if (velocityTracker == null) {
                    yVelocity = RecyclerView.f1937A0;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f2174c);
                    yVelocity = this.f2167X.getYVelocity(this.f2168Y);
                }
                if (D(view, yVelocity)) {
                    i2 = 5;
                    E(view, i2, false);
                    this.f2159P = false;
                }
            }
            if (this.f2158O == 0) {
                int top = view.getTop();
                if (!this.f2172b) {
                    int i3 = this.f2149E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f2172b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            E(view, i2, false);
            this.f2159P = false;
        }
    }

    @Override // x.AbstractC0392a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f2155L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f2156M;
        if (eVar != null && (this.f2154K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2168Y = -1;
            this.f2169Z = -1;
            VelocityTracker velocityTracker = this.f2167X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2167X = null;
            }
        }
        if (this.f2167X == null) {
            this.f2167X = VelocityTracker.obtain();
        }
        this.f2167X.addMovement(motionEvent);
        if (this.f2156M != null && ((this.f2154K || this.f2155L == 1) && actionMasked == 2 && !this.f2157N)) {
            float abs = Math.abs(this.f2169Z - motionEvent.getY());
            e eVar2 = this.f2156M;
            if (abs > eVar2.f1009b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2157N;
    }

    public final void r() {
        int t2 = t();
        if (this.f2172b) {
            this.f2150G = Math.max(this.f2163T - t2, this.f2148D);
        } else {
            this.f2150G = this.f2163T - t2;
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
        float f2;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        g gVar = this.i;
        float f3 = RecyclerView.f1937A0;
        if (gVar != null && (weakReference = this.f2164U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f2164U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar2 = this.i;
                float a2 = gVar2.f917a.f903a.f949e.a(gVar2.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > RecyclerView.f1937A0 && a2 > RecyclerView.f1937A0) {
                        f2 = f4 / a2;
                        g gVar3 = this.i;
                        float a3 = gVar3.f917a.f903a.f950f.a(gVar3.f());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f5 = radius;
                            if (f5 > RecyclerView.f1937A0 && a3 > RecyclerView.f1937A0) {
                                f3 = f5 / a3;
                            }
                        }
                        return Math.max(f2, f3);
                    }
                }
                f2 = 0.0f;
                g gVar32 = this.i;
                float a32 = gVar32.f917a.f903a.f950f.a(gVar32.f());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f3);
            }
        }
        return RecyclerView.f1937A0;
    }

    public final int t() {
        int i;
        return this.f2178f ? Math.min(Math.max(this.f2179g, this.f2163T - ((this.f2162S * 9) / 16)), this.f2161R) + this.f2192v : (this.f2184n || this.f2185o || (i = this.f2183m) <= 0) ? this.f2177e + this.f2192v : Math.max(this.f2177e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.f2164U.get()) != null) {
            ArrayList arrayList = this.f2166W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f2150G;
            if (i <= i2 && i2 != x()) {
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
        if (this.f2172b) {
            return this.f2148D;
        }
        return Math.max(this.f2147C, this.f2188r ? 0 : this.f2193w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f2150G;
        }
        if (i == 5) {
            return this.f2163T;
        }
        if (i == 6) {
            return this.f2149E;
        }
        throw new IllegalArgumentException(AbstractC0001b.f("Invalid state to get top offset: ", i));
    }

    public final boolean z() {
        WeakReference weakReference = this.f2164U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f2164U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.f2170a = 0;
        this.f2172b = true;
        this.f2181k = -1;
        this.f2182l = -1;
        this.f2145A = new j(this);
        this.F = 0.5f;
        this.f2151H = -1.0f;
        this.f2154K = true;
        this.f2155L = 4;
        this.f2160Q = 0.1f;
        this.f2166W = new ArrayList();
        this.f2169Z = -1;
        this.f2175c0 = new SparseIntArray();
        this.f2176d0 = new C0.e(this, i2);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0393a.f4543a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2180j = l.B(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2195y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f2195y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2180j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f2146B = ofFloat;
        ofFloat.setDuration(500L);
        this.f2146B.addUpdateListener(new c(i2, this));
        this.f2151H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2181k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2182l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f2152I != z2) {
            this.f2152I = z2;
            if (!z2 && this.f2155L == 5) {
                B(4);
            }
            F();
        }
        this.f2184n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2172b != z3) {
            this.f2172b = z3;
            if (this.f2164U != null) {
                r();
            }
            C((this.f2172b && this.f2155L == 6) ? 3 : this.f2155L);
            G(this.f2155L, true);
            F();
        }
        this.f2153J = obtainStyledAttributes.getBoolean(12, false);
        this.f2154K = obtainStyledAttributes.getBoolean(4, true);
        this.f2170a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > RecyclerView.f1937A0 && f2 < 1.0f) {
            this.F = f2;
            if (this.f2164U != null) {
                this.f2149E = (int) ((1.0f - f2) * this.f2163T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f2147C = i3;
                    G(this.f2155L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2147C = dimensionPixelOffset;
                    G(this.f2155L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(11, 500);
            this.f2185o = obtainStyledAttributes.getBoolean(17, false);
            this.f2186p = obtainStyledAttributes.getBoolean(18, false);
            this.f2187q = obtainStyledAttributes.getBoolean(19, false);
            this.f2188r = obtainStyledAttributes.getBoolean(20, true);
            this.f2189s = obtainStyledAttributes.getBoolean(14, false);
            this.f2190t = obtainStyledAttributes.getBoolean(15, false);
            this.f2191u = obtainStyledAttributes.getBoolean(16, false);
            this.f2194x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f2174c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
