package com.google.android.material.bottomsheet;

import B0.r;
import B0.s;
import H.j;
import H0.f;
import H0.g;
import H0.k;
import I0.c;
import I0.e;
import K.C0000a;
import K.C0002b;
import K.C0006d;
import K.J;
import K.L;
import K.X;
import K.j0;
import K.k0;
import K.l0;
import K0.C;
import M.a;
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
import com.fortuneink.neonpad.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.W;
import n0.AbstractC0303a;
import q1.d;
import q1.l;
import s0.C0327a;
import x.AbstractC0361a;
import x.C0364d;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0361a {

    /* renamed from: A, reason: collision with root package name */
    public final e f1754A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f1755B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1756C;

    /* renamed from: D, reason: collision with root package name */
    public int f1757D;

    /* renamed from: E, reason: collision with root package name */
    public int f1758E;
    public final float F;

    /* renamed from: G, reason: collision with root package name */
    public int f1759G;

    /* renamed from: H, reason: collision with root package name */
    public final float f1760H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1761I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1762J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f1763K;

    /* renamed from: L, reason: collision with root package name */
    public int f1764L;

    /* renamed from: M, reason: collision with root package name */
    public S.e f1765M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1766N;

    /* renamed from: O, reason: collision with root package name */
    public int f1767O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1768P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f1769Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1770R;

    /* renamed from: S, reason: collision with root package name */
    public int f1771S;

    /* renamed from: T, reason: collision with root package name */
    public int f1772T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f1773U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f1774V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f1775W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f1776X;

    /* renamed from: Y, reason: collision with root package name */
    public int f1777Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1778Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1779a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1780a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1781b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f1782b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f1783c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f1784c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f1785d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f1786d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1787e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1788f;

    /* renamed from: g, reason: collision with root package name */
    public int f1789g;
    public final int h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1790j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1791k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1792l;

    /* renamed from: m, reason: collision with root package name */
    public int f1793m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1794n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1795o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1796p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1797q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1798r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1799s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1800t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1801u;

    /* renamed from: v, reason: collision with root package name */
    public int f1802v;

    /* renamed from: w, reason: collision with root package name */
    public int f1803w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1804x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1805y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1806z;

    public BottomSheetBehavior() {
        this.f1779a = 0;
        this.f1781b = true;
        this.f1791k = -1;
        this.f1792l = -1;
        this.f1754A = new e(this);
        this.F = 0.5f;
        this.f1760H = -1.0f;
        this.f1763K = true;
        this.f1764L = 4;
        this.f1769Q = 0.1f;
        this.f1775W = new ArrayList();
        this.f1778Z = -1;
        this.f1784c0 = new SparseIntArray();
        this.f1786d0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = X.f418a;
        if (L.p(view)) {
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
            if (this.f1788f) {
                return;
            } else {
                this.f1788f = true;
            }
        } else {
            if (!this.f1788f && this.f1787e == i) {
                return;
            }
            this.f1788f = false;
            this.f1787e = Math.max(0, i);
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
        if (!this.f1761I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f1781b && y(i) <= this.f1757D) ? 3 : i;
        WeakReference weakReference = this.f1773U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f1773U.get();
        W w2 = new W(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = X.f418a;
            if (view.isAttachedToWindow()) {
                view.post(w2);
                return;
            }
        }
        w2.run();
    }

    public final void C(int i) {
        if (this.f1764L == i) {
            return;
        }
        this.f1764L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f1761I;
        }
        WeakReference weakReference = this.f1773U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f1775W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f1762J) {
            return true;
        }
        if (view.getTop() < this.f1759G) {
            return false;
        }
        return Math.abs(((f2 * this.f1769Q) + ((float) view.getTop())) - ((float) this.f1759G)) / ((float) t()) > 0.5f;
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
        r2.f1754A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z2) {
        int y2 = y(i);
        S.e eVar = this.f1765M;
        if (eVar != null) {
            if (!z2) {
                int left = view.getLeft();
                eVar.f770r = view;
                eVar.f757c = -1;
                boolean h = eVar.h(left, y2, 0, 0);
                if (!h && eVar.f755a == 0 && eVar.f770r != null) {
                    eVar.f770r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f1773U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.i(view, 524288);
        X.g(view, 0);
        X.i(view, 262144);
        X.g(view, 0);
        X.i(view, 1048576);
        X.g(view, 0);
        SparseIntArray sparseIntArray = this.f1784c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            X.i(view, i2);
            X.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f1781b && this.f1764L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            j jVar = new j(this, 6);
            ArrayList e2 = X.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= e2.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = X.f421d[i5];
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
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((L.e) e2.get(i3)).f660a).getLabel())) {
                        i = ((L.e) e2.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                L.e eVar = new L.e(null, i, string, jVar, null);
                View.AccessibilityDelegate c2 = X.c(view);
                C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f424a : new C0002b(c2);
                if (c0002b == null) {
                    c0002b = new C0002b();
                }
                X.l(view, c0002b);
                X.i(view, eVar.a());
                X.e(view).add(eVar);
                X.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f1761I && this.f1764L != 5) {
            X.j(view, L.e.f657j, new j(this, 5));
        }
        int i8 = this.f1764L;
        if (i8 == 3) {
            X.j(view, L.e.i, new j(this, this.f1781b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            X.j(view, L.e.h, new j(this, this.f1781b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            X.j(view, L.e.i, new j(this, 4));
            X.j(view, L.e.h, new j(this, 3));
        }
    }

    public final void G(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f1755B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f1764L == 3 && (this.f1804x || z());
        if (this.f1806z == z3 || gVar == null) {
            return;
        }
        this.f1806z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f273a.i, z3 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s2 = this.f1806z ? s() : 1.0f;
        f fVar = gVar.f273a;
        if (fVar.i != s2) {
            fVar.i = s2;
            gVar.f277e = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f1773U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f1782b0 != null) {
                    return;
                } else {
                    this.f1782b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f1773U.get() && z2) {
                    this.f1782b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f1782b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f1773U != null) {
            r();
            if (this.f1764L != 4 || (view = (View) this.f1773U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // x.AbstractC0361a
    public final void c(C0364d c0364d) {
        this.f1773U = null;
        this.f1765M = null;
    }

    @Override // x.AbstractC0361a
    public final void e() {
        this.f1773U = null;
        this.f1765M = null;
    }

    @Override // x.AbstractC0361a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        S.e eVar;
        if (!view.isShown() || !this.f1763K) {
            this.f1766N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1777Y = -1;
            this.f1778Z = -1;
            VelocityTracker velocityTracker = this.f1776X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1776X = null;
            }
        }
        if (this.f1776X == null) {
            this.f1776X = VelocityTracker.obtain();
        }
        this.f1776X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f1778Z = (int) motionEvent.getY();
            if (this.f1764L != 2) {
                WeakReference weakReference = this.f1774V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f1778Z)) {
                    this.f1777Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1780a0 = true;
                }
            }
            this.f1766N = this.f1777Y == -1 && !coordinatorLayout.o(view, x2, this.f1778Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1780a0 = false;
            this.f1777Y = -1;
            if (this.f1766N) {
                this.f1766N = false;
                return false;
            }
        }
        if (!this.f1766N && (eVar = this.f1765M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f1774V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f1766N || this.f1764L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1765M == null || (i = this.f1778Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f1765M.f756b)) ? false : true;
    }

    @Override // x.AbstractC0361a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f1792l;
        g gVar = this.i;
        int i3 = 1;
        WeakHashMap weakHashMap = X.f418a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1773U == null) {
            this.f1789g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f1794n || this.f1788f) ? false : true;
            if (this.f1795o || this.f1796p || this.f1797q || this.f1799s || this.f1800t || this.f1801u || z2) {
                I.g gVar2 = new I.g(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                s sVar = new s();
                sVar.f153a = paddingStart;
                sVar.f154b = paddingEnd;
                sVar.f155c = paddingBottom;
                L.u(view, new B.j(gVar2, i3, sVar));
                if (view.isAttachedToWindow()) {
                    J.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new r());
                }
            }
            C0006d c0006d = new C0006d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new l0(c0006d));
            } else {
                PathInterpolator pathInterpolator = k0.f459e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener j0Var = new j0(view, c0006d);
                view.setTag(R.id.tag_window_insets_animation_callback, j0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(j0Var);
                }
            }
            this.f1773U = new WeakReference(view);
            Context context = view.getContext();
            l.g0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            l.f0(context, R.attr.motionDurationMedium2, 300);
            l.f0(context, R.attr.motionDurationShort3, 150);
            l.f0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1760H;
                if (f2 == -1.0f) {
                    f2 = L.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1790j;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f1765M == null) {
            this.f1765M = new S.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1786d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f1771S = coordinatorLayout.getWidth();
        this.f1772T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1770R = height;
        int i5 = this.f1772T;
        int i6 = i5 - height;
        int i7 = this.f1803w;
        if (i6 < i7) {
            if (this.f1798r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f1770R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f1770R = i8;
            }
        }
        this.f1757D = Math.max(0, this.f1772T - this.f1770R);
        this.f1758E = (int) ((1.0f - this.F) * this.f1772T);
        r();
        int i9 = this.f1764L;
        if (i9 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f1758E);
        } else if (this.f1761I && i9 == 5) {
            view.offsetTopAndBottom(this.f1772T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f1759G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f1764L, false);
        this.f1774V = new WeakReference(v(view));
        ArrayList arrayList = this.f1775W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // x.AbstractC0361a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f1791k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1792l, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0361a
    public final boolean i(View view) {
        WeakReference weakReference = this.f1774V;
        return (weakReference == null || view != weakReference.get() || this.f1764L == 3) ? false : true;
    }

    @Override // x.AbstractC0361a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f1763K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f1774V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                WeakHashMap weakHashMap = X.f418a;
                view.offsetTopAndBottom(-x2);
                C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = X.f418a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f1759G;
            if (i4 > i5 && !this.f1761I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = X.f418a;
                view.offsetTopAndBottom(-i6);
                C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = X.f418a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        u(view.getTop());
        this.f1767O = i2;
        this.f1768P = true;
    }

    @Override // x.AbstractC0361a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // x.AbstractC0361a
    public final void m(View view, Parcelable parcelable) {
        C0327a c0327a = (C0327a) parcelable;
        int i = this.f1779a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1787e = c0327a.f4146d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1781b = c0327a.f4147e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f1761I = c0327a.f4148f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f1762J = c0327a.f4149g;
            }
        }
        int i2 = c0327a.f4145c;
        if (i2 == 1 || i2 == 2) {
            this.f1764L = 4;
        } else {
            this.f1764L = i2;
        }
    }

    @Override // x.AbstractC0361a
    public final Parcelable n(View view) {
        return new C0327a(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0361a
    public final boolean o(View view, int i, int i2) {
        this.f1767O = 0;
        this.f1768P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f1758E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1757D) < java.lang.Math.abs(r5 - r3.f1759G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f1759G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f1759G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1758E) < java.lang.Math.abs(r5 - r3.f1759G)) goto L50;
     */
    @Override // x.AbstractC0361a
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
        WeakReference weakReference = this.f1774V;
        if (weakReference != null && view2 == weakReference.get() && this.f1768P) {
            if (this.f1767O > 0) {
                if (!this.f1781b) {
                }
                E(view, i2, false);
                this.f1768P = false;
            }
            if (this.f1761I) {
                VelocityTracker velocityTracker = this.f1776X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f1783c);
                    yVelocity = this.f1776X.getYVelocity(this.f1777Y);
                }
                if (D(view, yVelocity)) {
                    i2 = 5;
                    E(view, i2, false);
                    this.f1768P = false;
                }
            }
            if (this.f1767O == 0) {
                int top = view.getTop();
                if (!this.f1781b) {
                    int i3 = this.f1758E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f1781b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            E(view, i2, false);
            this.f1768P = false;
        }
    }

    @Override // x.AbstractC0361a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f1764L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        S.e eVar = this.f1765M;
        if (eVar != null && (this.f1763K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1777Y = -1;
            this.f1778Z = -1;
            VelocityTracker velocityTracker = this.f1776X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1776X = null;
            }
        }
        if (this.f1776X == null) {
            this.f1776X = VelocityTracker.obtain();
        }
        this.f1776X.addMovement(motionEvent);
        if (this.f1765M != null && ((this.f1763K || this.f1764L == 1) && actionMasked == 2 && !this.f1766N)) {
            float abs = Math.abs(this.f1778Z - motionEvent.getY());
            S.e eVar2 = this.f1765M;
            if (abs > eVar2.f756b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1766N;
    }

    public final void r() {
        int t2 = t();
        if (this.f1781b) {
            this.f1759G = Math.max(this.f1772T - t2, this.f1757D);
        } else {
            this.f1759G = this.f1772T - t2;
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
        float f3 = 0.0f;
        if (this.i != null && (weakReference = this.f1773U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f1773U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float a2 = gVar.f273a.f258a.f308e.a(gVar.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > 0.0f && a2 > 0.0f) {
                        f2 = f4 / a2;
                        g gVar2 = this.i;
                        float a3 = gVar2.f273a.f258a.f309f.a(gVar2.f());
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
                float a32 = gVar22.f273a.f258a.f309f.a(gVar22.f());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f3);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        return this.f1788f ? Math.min(Math.max(this.f1789g, this.f1772T - ((this.f1771S * 9) / 16)), this.f1770R) + this.f1802v : (this.f1794n || this.f1795o || (i = this.f1793m) <= 0) ? this.f1787e + this.f1802v : Math.max(this.f1787e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.f1773U.get()) != null) {
            ArrayList arrayList = this.f1775W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f1759G;
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
        if (this.f1781b) {
            return this.f1757D;
        }
        return Math.max(this.f1756C, this.f1798r ? 0 : this.f1803w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f1759G;
        }
        if (i == 5) {
            return this.f1772T;
        }
        if (i == 6) {
            return this.f1758E;
        }
        throw new IllegalArgumentException(X0.e.d("Invalid state to get top offset: ", i));
    }

    public final boolean z() {
        WeakReference weakReference = this.f1773U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f1773U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 2;
        this.f1779a = 0;
        this.f1781b = true;
        this.f1791k = -1;
        this.f1792l = -1;
        this.f1754A = new e(this);
        this.F = 0.5f;
        this.f1760H = -1.0f;
        this.f1763K = true;
        this.f1764L = 4;
        this.f1769Q = 0.1f;
        this.f1775W = new ArrayList();
        this.f1778Z = -1;
        this.f1784c0 = new SparseIntArray();
        this.f1786d0 = new c(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0303a.f3630a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1790j = d.y(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f1805y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f1805y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1790j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f1755B = ofFloat;
        ofFloat.setDuration(500L);
        this.f1755B.addUpdateListener(new C(i2, this));
        this.f1760H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1791k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1792l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f1761I != z2) {
            this.f1761I = z2;
            if (!z2 && this.f1764L == 5) {
                B(4);
            }
            F();
        }
        this.f1794n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1781b != z3) {
            this.f1781b = z3;
            if (this.f1773U != null) {
                r();
            }
            C((this.f1781b && this.f1764L == 6) ? 3 : this.f1764L);
            G(this.f1764L, true);
            F();
        }
        this.f1762J = obtainStyledAttributes.getBoolean(12, false);
        this.f1763K = obtainStyledAttributes.getBoolean(4, true);
        this.f1779a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.F = f2;
            if (this.f1773U != null) {
                this.f1758E = (int) ((1.0f - f2) * this.f1772T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f1756C = i3;
                    G(this.f1764L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f1756C = dimensionPixelOffset;
                    G(this.f1764L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f1785d = obtainStyledAttributes.getInt(11, 500);
            this.f1795o = obtainStyledAttributes.getBoolean(17, false);
            this.f1796p = obtainStyledAttributes.getBoolean(18, false);
            this.f1797q = obtainStyledAttributes.getBoolean(19, false);
            this.f1798r = obtainStyledAttributes.getBoolean(20, true);
            this.f1799s = obtainStyledAttributes.getBoolean(14, false);
            this.f1800t = obtainStyledAttributes.getBoolean(15, false);
            this.f1801u = obtainStyledAttributes.getBoolean(16, false);
            this.f1804x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f1783c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
