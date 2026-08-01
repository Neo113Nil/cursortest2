package com.google.android.material.bottomsheet;

import D.j;
import F0.o;
import F0.p;
import J.i;
import L0.g;
import L0.k;
import M.C0000a;
import M.C0001b;
import M.C0003d;
import M.D;
import M.F;
import M.Q;
import M.d0;
import M.e0;
import M.f0;
import M0.c;
import M0.e;
import O.a;
import O0.C;
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
import com.winfour.neondrop.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.U;
import q0.AbstractC0257a;
import v0.C0293a;
import z.AbstractC0318a;
import z.C0321d;
import z1.d;
import z1.l;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0318a {

    /* renamed from: A, reason: collision with root package name */
    public final e f1744A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f1745B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1746C;

    /* renamed from: D, reason: collision with root package name */
    public int f1747D;

    /* renamed from: E, reason: collision with root package name */
    public int f1748E;

    /* renamed from: F, reason: collision with root package name */
    public final float f1749F;

    /* renamed from: G, reason: collision with root package name */
    public int f1750G;
    public final float H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1751I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1752J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f1753K;

    /* renamed from: L, reason: collision with root package name */
    public int f1754L;

    /* renamed from: M, reason: collision with root package name */
    public U.e f1755M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1756N;

    /* renamed from: O, reason: collision with root package name */
    public int f1757O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1758P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f1759Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1760R;

    /* renamed from: S, reason: collision with root package name */
    public int f1761S;

    /* renamed from: T, reason: collision with root package name */
    public int f1762T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f1763U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f1764V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f1765W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f1766X;

    /* renamed from: Y, reason: collision with root package name */
    public int f1767Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1768Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1769a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1770a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1771b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f1772b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f1773c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f1774c0;
    public final int d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f1775d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1776e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1777f;

    /* renamed from: g, reason: collision with root package name */
    public int f1778g;
    public final int h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1779j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1780k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1781l;

    /* renamed from: m, reason: collision with root package name */
    public int f1782m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1783n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1784o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1785p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1786q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1787r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1788s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1789t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1790u;

    /* renamed from: v, reason: collision with root package name */
    public int f1791v;

    /* renamed from: w, reason: collision with root package name */
    public int f1792w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1793x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1794y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1795z;

    public BottomSheetBehavior() {
        this.f1769a = 0;
        this.f1771b = true;
        this.f1780k = -1;
        this.f1781l = -1;
        this.f1744A = new e(this);
        this.f1749F = 0.5f;
        this.H = -1.0f;
        this.f1753K = true;
        this.f1754L = 4;
        this.f1759Q = 0.1f;
        this.f1765W = new ArrayList();
        this.f1768Z = -1;
        this.f1774c0 = new SparseIntArray();
        this.f1775d0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = Q.f513a;
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
            if (this.f1777f) {
                return;
            } else {
                this.f1777f = true;
            }
        } else {
            if (!this.f1777f && this.f1776e == i) {
                return;
            }
            this.f1777f = false;
            this.f1776e = Math.max(0, i);
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
        if (!this.f1751I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f1771b && y(i) <= this.f1747D) ? 3 : i;
        WeakReference weakReference = this.f1763U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f1763U.get();
        U u2 = new U(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = Q.f513a;
            if (view.isAttachedToWindow()) {
                view.post(u2);
                return;
            }
        }
        u2.run();
    }

    public final void C(int i) {
        if (this.f1754L == i) {
            return;
        }
        this.f1754L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f1751I;
        }
        WeakReference weakReference = this.f1763U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f1765W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f1752J) {
            return true;
        }
        if (view.getTop() < this.f1750G) {
            return false;
        }
        return Math.abs(((f2 * this.f1759Q) + ((float) view.getTop())) - ((float) this.f1750G)) / ((float) t()) > 0.5f;
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
        r2.f1744A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z2) {
        int y2 = y(i);
        U.e eVar = this.f1755M;
        if (eVar != null) {
            if (!z2) {
                int left = view.getLeft();
                eVar.f856r = view;
                eVar.f844c = -1;
                boolean h = eVar.h(left, y2, 0, 0);
                if (!h && eVar.f842a == 0 && eVar.f856r != null) {
                    eVar.f856r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f1763U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Q.i(view, 524288);
        Q.g(view, 0);
        Q.i(view, 262144);
        Q.g(view, 0);
        Q.i(view, 1048576);
        Q.g(view, 0);
        SparseIntArray sparseIntArray = this.f1774c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            Q.i(view, i2);
            Q.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f1771b && this.f1754L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            i iVar = new i(r5, this);
            ArrayList e2 = Q.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= e2.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = Q.d[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < e2.size(); i7++) {
                            z2 &= ((N.e) e2.get(i7)).a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((N.e) e2.get(i3)).f627a).getLabel())) {
                        i = ((N.e) e2.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                N.e eVar = new N.e(null, i, string, iVar, null);
                View.AccessibilityDelegate c2 = Q.c(view);
                C0001b c0001b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f523a : new C0001b(c2);
                if (c0001b == null) {
                    c0001b = new C0001b();
                }
                Q.l(view, c0001b);
                Q.i(view, eVar.a());
                Q.e(view).add(eVar);
                Q.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f1751I) {
            int i8 = 5;
            if (this.f1754L != 5) {
                Q.j(view, N.e.f624j, new i(i8, this));
            }
        }
        int i9 = this.f1754L;
        int i10 = 4;
        int i11 = 3;
        if (i9 == 3) {
            Q.j(view, N.e.i, new i(this.f1771b ? 4 : 6, this));
            return;
        }
        if (i9 == 4) {
            Q.j(view, N.e.h, new i(this.f1771b ? 3 : 6, this));
        } else {
            if (i9 != 6) {
                return;
            }
            Q.j(view, N.e.i, new i(i10, this));
            Q.j(view, N.e.h, new i(i11, this));
        }
    }

    public final void G(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f1745B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f1754L == 3 && (this.f1793x || z());
        if (this.f1795z == z3 || gVar == null) {
            return;
        }
        this.f1795z = z3;
        if (!z2 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            gVar.m(this.f1795z ? s() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(gVar.f433a.i, z3 ? s() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f1763U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f1772b0 != null) {
                    return;
                } else {
                    this.f1772b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f1763U.get() && z2) {
                    this.f1772b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f1772b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f1763U != null) {
            r();
            if (this.f1754L != 4 || (view = (View) this.f1763U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // z.AbstractC0318a
    public final void c(C0321d c0321d) {
        this.f1763U = null;
        this.f1755M = null;
    }

    @Override // z.AbstractC0318a
    public final void e() {
        this.f1763U = null;
        this.f1755M = null;
    }

    @Override // z.AbstractC0318a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        U.e eVar;
        if (!view.isShown() || !this.f1753K) {
            this.f1756N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1767Y = -1;
            this.f1768Z = -1;
            VelocityTracker velocityTracker = this.f1766X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1766X = null;
            }
        }
        if (this.f1766X == null) {
            this.f1766X = VelocityTracker.obtain();
        }
        this.f1766X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f1768Z = (int) motionEvent.getY();
            if (this.f1754L != 2) {
                WeakReference weakReference = this.f1764V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f1768Z)) {
                    this.f1767Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1770a0 = true;
                }
            }
            this.f1756N = this.f1767Y == -1 && !coordinatorLayout.o(view, x2, this.f1768Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1770a0 = false;
            this.f1767Y = -1;
            if (this.f1756N) {
                this.f1756N = false;
                return false;
            }
        }
        if (!this.f1756N && (eVar = this.f1755M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f1764V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f1756N || this.f1754L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1755M == null || (i = this.f1768Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f1755M.f843b)) ? false : true;
    }

    @Override // z.AbstractC0318a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f1781l;
        g gVar = this.i;
        int i3 = 1;
        WeakHashMap weakHashMap = Q.f513a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1763U == null) {
            this.f1778g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f1783n || this.f1777f) ? false : true;
            if (this.f1784o || this.f1785p || this.f1786q || this.f1788s || this.f1789t || this.f1790u || z2) {
                K.g gVar2 = new K.g(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                p pVar = new p();
                pVar.f320a = paddingStart;
                pVar.f321b = paddingEnd;
                pVar.f322c = paddingBottom;
                F.u(view, new j(gVar2, i3, pVar));
                if (view.isAttachedToWindow()) {
                    D.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new o());
                }
            }
            C0003d c0003d = new C0003d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new f0(c0003d));
            } else {
                PathInterpolator pathInterpolator = e0.f541e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener d0Var = new d0(view, c0003d);
                view.setTag(R.id.tag_window_insets_animation_callback, d0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(d0Var);
                }
            }
            this.f1763U = new WeakReference(view);
            Context context = view.getContext();
            l.n0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            l.m0(context, R.attr.motionDurationMedium2, 300);
            l.m0(context, R.attr.motionDurationShort3, 150);
            l.m0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.H;
                if (f2 == -1.0f) {
                    f2 = F.i(view);
                }
                gVar.k(f2);
            } else {
                ColorStateList colorStateList = this.f1779j;
                if (colorStateList != null) {
                    F.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f1755M == null) {
            this.f1755M = new U.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1775d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f1761S = coordinatorLayout.getWidth();
        this.f1762T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1760R = height;
        int i5 = this.f1762T;
        int i6 = i5 - height;
        int i7 = this.f1792w;
        if (i6 < i7) {
            if (this.f1787r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f1760R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f1760R = i8;
            }
        }
        this.f1747D = Math.max(0, this.f1762T - this.f1760R);
        this.f1748E = (int) ((1.0f - this.f1749F) * this.f1762T);
        r();
        int i9 = this.f1754L;
        if (i9 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f1748E);
        } else if (this.f1751I && i9 == 5) {
            view.offsetTopAndBottom(this.f1762T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f1750G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f1754L, false);
        this.f1764V = new WeakReference(v(view));
        ArrayList arrayList = this.f1765W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // z.AbstractC0318a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f1780k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1781l, marginLayoutParams.height));
        return true;
    }

    @Override // z.AbstractC0318a
    public final boolean i(View view) {
        WeakReference weakReference = this.f1764V;
        return (weakReference == null || view != weakReference.get() || this.f1754L == 3) ? false : true;
    }

    @Override // z.AbstractC0318a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f1753K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f1764V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                WeakHashMap weakHashMap = Q.f513a;
                view.offsetTopAndBottom(-x2);
                C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = Q.f513a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f1750G;
            if (i4 > i5 && !this.f1751I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = Q.f513a;
                view.offsetTopAndBottom(-i6);
                C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = Q.f513a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        u(view.getTop());
        this.f1757O = i2;
        this.f1758P = true;
    }

    @Override // z.AbstractC0318a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // z.AbstractC0318a
    public final void m(View view, Parcelable parcelable) {
        C0293a c0293a = (C0293a) parcelable;
        int i = this.f1769a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1776e = c0293a.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1771b = c0293a.f3843e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f1751I = c0293a.f3844f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f1752J = c0293a.f3845g;
            }
        }
        int i2 = c0293a.f3842c;
        if (i2 == 1 || i2 == 2) {
            this.f1754L = 4;
        } else {
            this.f1754L = i2;
        }
    }

    @Override // z.AbstractC0318a
    public final Parcelable n(View view) {
        return new C0293a(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // z.AbstractC0318a
    public final boolean o(View view, int i, int i2) {
        this.f1757O = 0;
        this.f1758P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f1748E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1747D) < java.lang.Math.abs(r5 - r3.f1750G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f1750G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f1750G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1748E) < java.lang.Math.abs(r5 - r3.f1750G)) goto L50;
     */
    @Override // z.AbstractC0318a
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
        WeakReference weakReference = this.f1764V;
        if (weakReference != null && view2 == weakReference.get() && this.f1758P) {
            if (this.f1757O > 0) {
                if (!this.f1771b) {
                }
                E(view, i2, false);
                this.f1758P = false;
            }
            if (this.f1751I) {
                VelocityTracker velocityTracker = this.f1766X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f1773c);
                    yVelocity = this.f1766X.getYVelocity(this.f1767Y);
                }
                if (D(view, yVelocity)) {
                    i2 = 5;
                    E(view, i2, false);
                    this.f1758P = false;
                }
            }
            if (this.f1757O == 0) {
                int top = view.getTop();
                if (!this.f1771b) {
                    int i3 = this.f1748E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f1771b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            E(view, i2, false);
            this.f1758P = false;
        }
    }

    @Override // z.AbstractC0318a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f1754L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        U.e eVar = this.f1755M;
        if (eVar != null && (this.f1753K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1767Y = -1;
            this.f1768Z = -1;
            VelocityTracker velocityTracker = this.f1766X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1766X = null;
            }
        }
        if (this.f1766X == null) {
            this.f1766X = VelocityTracker.obtain();
        }
        this.f1766X.addMovement(motionEvent);
        if (this.f1755M != null && ((this.f1753K || this.f1754L == 1) && actionMasked == 2 && !this.f1756N)) {
            float abs = Math.abs(this.f1768Z - motionEvent.getY());
            U.e eVar2 = this.f1755M;
            if (abs > eVar2.f843b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1756N;
    }

    public final void r() {
        int t2 = t();
        if (this.f1771b) {
            this.f1750G = Math.max(this.f1762T - t2, this.f1747D);
        } else {
            this.f1750G = this.f1762T - t2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
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
        if (this.i != null && (weakReference = this.f1763U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f1763U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float g2 = this.i.g();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > 0.0f && g2 > 0.0f) {
                        f2 = f4 / g2;
                        g gVar = this.i;
                        float a2 = gVar.f433a.f419a.f466f.a(gVar.f());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f5 = radius;
                            if (f5 > 0.0f && a2 > 0.0f) {
                                f3 = f5 / a2;
                            }
                        }
                        return Math.max(f2, f3);
                    }
                }
                f2 = 0.0f;
                g gVar2 = this.i;
                float a22 = gVar2.f433a.f419a.f466f.a(gVar2.f());
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
        return this.f1777f ? Math.min(Math.max(this.f1778g, this.f1762T - ((this.f1761S * 9) / 16)), this.f1760R) + this.f1791v : (this.f1783n || this.f1784o || (i = this.f1782m) <= 0) ? this.f1776e + this.f1791v : Math.max(this.f1776e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.f1763U.get()) != null) {
            ArrayList arrayList = this.f1765W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f1750G;
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
        if (this.f1771b) {
            return this.f1747D;
        }
        return Math.max(this.f1746C, this.f1787r ? 0 : this.f1792w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f1750G;
        }
        if (i == 5) {
            return this.f1762T;
        }
        if (i == 6) {
            return this.f1748E;
        }
        throw new IllegalArgumentException(X0.a.e("Invalid state to get top offset: ", i));
    }

    public final boolean z() {
        WeakReference weakReference = this.f1763U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f1763U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 2;
        this.f1769a = 0;
        this.f1771b = true;
        this.f1780k = -1;
        this.f1781l = -1;
        this.f1744A = new e(this);
        this.f1749F = 0.5f;
        this.H = -1.0f;
        this.f1753K = true;
        this.f1754L = 4;
        this.f1759Q = 0.1f;
        this.f1765W = new ArrayList();
        this.f1768Z = -1;
        this.f1774c0 = new SparseIntArray();
        this.f1775d0 = new c(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0257a.f3380a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1779j = d.v(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f1794y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f1794y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f1779j;
            if (colorStateList != null) {
                this.i.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f1745B = ofFloat;
        ofFloat.setDuration(500L);
        this.f1745B.addUpdateListener(new C(i2, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1780k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1781l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f1751I != z2) {
            this.f1751I = z2;
            if (!z2 && this.f1754L == 5) {
                B(4);
            }
            F();
        }
        this.f1783n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1771b != z3) {
            this.f1771b = z3;
            if (this.f1763U != null) {
                r();
            }
            C((this.f1771b && this.f1754L == 6) ? 3 : this.f1754L);
            G(this.f1754L, true);
            F();
        }
        this.f1752J = obtainStyledAttributes.getBoolean(12, false);
        this.f1753K = obtainStyledAttributes.getBoolean(4, true);
        this.f1769a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f1749F = f2;
            if (this.f1763U != null) {
                this.f1748E = (int) ((1.0f - f2) * this.f1762T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f1746C = i3;
                    G(this.f1754L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f1746C = dimensionPixelOffset;
                    G(this.f1754L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(11, 500);
            this.f1784o = obtainStyledAttributes.getBoolean(17, false);
            this.f1785p = obtainStyledAttributes.getBoolean(18, false);
            this.f1786q = obtainStyledAttributes.getBoolean(19, false);
            this.f1787r = obtainStyledAttributes.getBoolean(20, true);
            this.f1788s = obtainStyledAttributes.getBoolean(14, false);
            this.f1789t = obtainStyledAttributes.getBoolean(15, false);
            this.f1790u = obtainStyledAttributes.getBoolean(16, false);
            this.f1793x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f1773c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
