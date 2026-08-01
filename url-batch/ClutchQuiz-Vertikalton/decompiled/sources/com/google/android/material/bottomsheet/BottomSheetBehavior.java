package com.google.android.material.bottomsheet;

import H.j;
import I.h;
import I0.m;
import I0.n;
import K.C0000a;
import K.C0001b;
import K.C0004e;
import K.E;
import K.G;
import K.S;
import K.e0;
import K.f0;
import K.g0;
import L.f;
import M.a;
import O0.g;
import O0.k;
import P0.c;
import P0.e;
import R0.A;
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
import com.clutchquizarena.app.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.RunnableC0200T;
import u0.AbstractC0361a;
import x.AbstractC0378b;
import x.C0381e;
import z0.C0390a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0378b {

    /* renamed from: A, reason: collision with root package name */
    public final e f1747A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f1748B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1749C;

    /* renamed from: D, reason: collision with root package name */
    public int f1750D;

    /* renamed from: E, reason: collision with root package name */
    public int f1751E;
    public final float F;

    /* renamed from: G, reason: collision with root package name */
    public int f1752G;

    /* renamed from: H, reason: collision with root package name */
    public final float f1753H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1754I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1755J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f1756K;

    /* renamed from: L, reason: collision with root package name */
    public int f1757L;

    /* renamed from: M, reason: collision with root package name */
    public S.e f1758M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1759N;

    /* renamed from: O, reason: collision with root package name */
    public int f1760O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1761P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f1762Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1763R;

    /* renamed from: S, reason: collision with root package name */
    public int f1764S;

    /* renamed from: T, reason: collision with root package name */
    public int f1765T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f1766U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f1767V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f1768W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f1769X;

    /* renamed from: Y, reason: collision with root package name */
    public int f1770Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1771Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1772a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1773a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1774b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f1775b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f1776c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f1777c0;
    public final int d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f1778d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1779e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1780f;

    /* renamed from: g, reason: collision with root package name */
    public int f1781g;
    public final int h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1782j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1783k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1784l;

    /* renamed from: m, reason: collision with root package name */
    public int f1785m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1786n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1787o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1788p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1789q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1790r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1791s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1792t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1793u;

    /* renamed from: v, reason: collision with root package name */
    public int f1794v;

    /* renamed from: w, reason: collision with root package name */
    public int f1795w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1796x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1797y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1798z;

    public BottomSheetBehavior() {
        this.f1772a = 0;
        this.f1774b = true;
        this.f1783k = -1;
        this.f1784l = -1;
        this.f1747A = new e(this);
        this.F = 0.5f;
        this.f1753H = -1.0f;
        this.f1756K = true;
        this.f1757L = 4;
        this.f1762Q = 0.1f;
        this.f1768W = new ArrayList();
        this.f1771Z = -1;
        this.f1777c0 = new SparseIntArray();
        this.f1778d0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = S.f365a;
        if (G.p(view)) {
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
            if (this.f1780f) {
                return;
            } else {
                this.f1780f = true;
            }
        } else {
            if (!this.f1780f && this.f1779e == i) {
                return;
            }
            this.f1780f = false;
            this.f1779e = Math.max(0, i);
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
        if (!this.f1754I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f1774b && y(i) <= this.f1750D) ? 3 : i;
        WeakReference weakReference = this.f1766U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f1766U.get();
        RunnableC0200T runnableC0200T = new RunnableC0200T(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = S.f365a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0200T);
                return;
            }
        }
        runnableC0200T.run();
    }

    public final void C(int i) {
        if (this.f1757L == i) {
            return;
        }
        this.f1757L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f1754I;
        }
        WeakReference weakReference = this.f1766U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f1768W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f1755J) {
            return true;
        }
        if (view.getTop() < this.f1752G) {
            return false;
        }
        return Math.abs(((f2 * this.f1762Q) + ((float) view.getTop())) - ((float) this.f1752G)) / ((float) t()) > 0.5f;
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
        r2.f1747A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z2) {
        int y2 = y(i);
        S.e eVar = this.f1758M;
        if (eVar != null) {
            if (!z2) {
                int left = view.getLeft();
                eVar.f795r = view;
                eVar.f783c = -1;
                boolean h = eVar.h(left, y2, 0, 0);
                if (!h && eVar.f781a == 0 && eVar.f795r != null) {
                    eVar.f795r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f1766U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.i(view, 524288);
        S.g(view, 0);
        S.i(view, 262144);
        S.g(view, 0);
        S.i(view, 1048576);
        S.g(view, 0);
        SparseIntArray sparseIntArray = this.f1777c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            S.i(view, i2);
            S.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f1774b && this.f1757L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            j jVar = new j(this, 6);
            ArrayList e2 = S.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= e2.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = S.d[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < e2.size(); i7++) {
                            z2 &= ((f) e2.get(i7)).a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f) e2.get(i3)).f473a).getLabel())) {
                        i = ((f) e2.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                f fVar = new f(null, i, string, jVar, null);
                View.AccessibilityDelegate c2 = S.c(view);
                C0001b c0001b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f375a : new C0001b(c2);
                if (c0001b == null) {
                    c0001b = new C0001b();
                }
                S.l(view, c0001b);
                S.i(view, fVar.a());
                S.e(view).add(fVar);
                S.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f1754I && this.f1757L != 5) {
            S.j(view, f.f470j, new j(this, 5));
        }
        int i8 = this.f1757L;
        if (i8 == 3) {
            S.j(view, f.i, new j(this, this.f1774b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            S.j(view, f.h, new j(this, this.f1774b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            S.j(view, f.i, new j(this, 4));
            S.j(view, f.h, new j(this, 3));
        }
    }

    public final void G(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f1748B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f1757L == 3 && (this.f1796x || z());
        if (this.f1798z == z3 || gVar == null) {
            return;
        }
        this.f1798z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f527a.i, z3 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s2 = this.f1798z ? s() : 1.0f;
        O0.f fVar = gVar.f527a;
        if (fVar.i != s2) {
            fVar.i = s2;
            gVar.f530e = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f1766U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f1775b0 != null) {
                    return;
                } else {
                    this.f1775b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f1766U.get() && z2) {
                    this.f1775b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f1775b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f1766U != null) {
            r();
            if (this.f1757L != 4 || (view = (View) this.f1766U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // x.AbstractC0378b
    public final void c(C0381e c0381e) {
        this.f1766U = null;
        this.f1758M = null;
    }

    @Override // x.AbstractC0378b
    public final void e() {
        this.f1766U = null;
        this.f1758M = null;
    }

    @Override // x.AbstractC0378b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        S.e eVar;
        if (!view.isShown() || !this.f1756K) {
            this.f1759N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1770Y = -1;
            this.f1771Z = -1;
            VelocityTracker velocityTracker = this.f1769X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1769X = null;
            }
        }
        if (this.f1769X == null) {
            this.f1769X = VelocityTracker.obtain();
        }
        this.f1769X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f1771Z = (int) motionEvent.getY();
            if (this.f1757L != 2) {
                WeakReference weakReference = this.f1767V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f1771Z)) {
                    this.f1770Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1773a0 = true;
                }
            }
            this.f1759N = this.f1770Y == -1 && !coordinatorLayout.o(view, x2, this.f1771Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1773a0 = false;
            this.f1770Y = -1;
            if (this.f1759N) {
                this.f1759N = false;
                return false;
            }
        }
        if (!this.f1759N && (eVar = this.f1758M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f1767V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f1759N || this.f1757L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1758M == null || (i = this.f1771Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f1758M.f782b)) ? false : true;
    }

    @Override // x.AbstractC0378b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f1784l;
        g gVar = this.i;
        int i3 = 2;
        WeakHashMap weakHashMap = S.f365a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1766U == null) {
            this.f1781g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f1786n || this.f1780f) ? false : true;
            if (this.f1787o || this.f1788p || this.f1789q || this.f1791s || this.f1792t || this.f1793u || z2) {
                h hVar = new h(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                n nVar = new n();
                nVar.f347a = paddingStart;
                nVar.f348b = paddingEnd;
                nVar.f349c = paddingBottom;
                G.u(view, new B.j(hVar, i3, nVar));
                if (view.isAttachedToWindow()) {
                    E.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new m());
                }
            }
            C0004e c0004e = new C0004e(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new g0(c0004e));
            } else {
                PathInterpolator pathInterpolator = f0.f393e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener e0Var = new e0(view, c0004e);
                view.setTag(R.id.tag_window_insets_animation_callback, e0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(e0Var);
                }
            }
            this.f1766U = new WeakReference(view);
            Context context = view.getContext();
            A.c.x0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            A.c.w0(context, R.attr.motionDurationMedium2, 300);
            A.c.w0(context, R.attr.motionDurationShort3, 150);
            A.c.w0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1753H;
                if (f2 == -1.0f) {
                    f2 = G.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1782j;
                if (colorStateList != null) {
                    G.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f1758M == null) {
            this.f1758M = new S.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1778d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f1764S = coordinatorLayout.getWidth();
        this.f1765T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1763R = height;
        int i5 = this.f1765T;
        int i6 = i5 - height;
        int i7 = this.f1795w;
        if (i6 < i7) {
            if (this.f1790r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f1763R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f1763R = i8;
            }
        }
        this.f1750D = Math.max(0, this.f1765T - this.f1763R);
        this.f1751E = (int) ((1.0f - this.F) * this.f1765T);
        r();
        int i9 = this.f1757L;
        if (i9 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f1751E);
        } else if (this.f1754I && i9 == 5) {
            view.offsetTopAndBottom(this.f1765T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f1752G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f1757L, false);
        this.f1767V = new WeakReference(v(view));
        ArrayList arrayList = this.f1768W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // x.AbstractC0378b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f1783k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1784l, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0378b
    public final boolean i(View view) {
        WeakReference weakReference = this.f1767V;
        return (weakReference == null || view != weakReference.get() || this.f1757L == 3) ? false : true;
    }

    @Override // x.AbstractC0378b
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f1756K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f1767V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                WeakHashMap weakHashMap = S.f365a;
                view.offsetTopAndBottom(-x2);
                C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = S.f365a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f1752G;
            if (i4 > i5 && !this.f1754I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = S.f365a;
                view.offsetTopAndBottom(-i6);
                C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = S.f365a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        u(view.getTop());
        this.f1760O = i2;
        this.f1761P = true;
    }

    @Override // x.AbstractC0378b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // x.AbstractC0378b
    public final void m(View view, Parcelable parcelable) {
        C0390a c0390a = (C0390a) parcelable;
        int i = this.f1772a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1779e = c0390a.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1774b = c0390a.f4034e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f1754I = c0390a.f4035f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f1755J = c0390a.f4036g;
            }
        }
        int i2 = c0390a.f4033c;
        if (i2 == 1 || i2 == 2) {
            this.f1757L = 4;
        } else {
            this.f1757L = i2;
        }
    }

    @Override // x.AbstractC0378b
    public final Parcelable n(View view) {
        return new C0390a(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0378b
    public final boolean o(View view, int i, int i2) {
        this.f1760O = 0;
        this.f1761P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f1751E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1750D) < java.lang.Math.abs(r5 - r3.f1752G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f1752G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f1752G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1751E) < java.lang.Math.abs(r5 - r3.f1752G)) goto L50;
     */
    @Override // x.AbstractC0378b
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
        WeakReference weakReference = this.f1767V;
        if (weakReference != null && view2 == weakReference.get() && this.f1761P) {
            if (this.f1760O > 0) {
                if (!this.f1774b) {
                }
                E(view, i2, false);
                this.f1761P = false;
            }
            if (this.f1754I) {
                VelocityTracker velocityTracker = this.f1769X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f1776c);
                    yVelocity = this.f1769X.getYVelocity(this.f1770Y);
                }
                if (D(view, yVelocity)) {
                    i2 = 5;
                    E(view, i2, false);
                    this.f1761P = false;
                }
            }
            if (this.f1760O == 0) {
                int top = view.getTop();
                if (!this.f1774b) {
                    int i3 = this.f1751E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f1774b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            E(view, i2, false);
            this.f1761P = false;
        }
    }

    @Override // x.AbstractC0378b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f1757L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        S.e eVar = this.f1758M;
        if (eVar != null && (this.f1756K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1770Y = -1;
            this.f1771Z = -1;
            VelocityTracker velocityTracker = this.f1769X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1769X = null;
            }
        }
        if (this.f1769X == null) {
            this.f1769X = VelocityTracker.obtain();
        }
        this.f1769X.addMovement(motionEvent);
        if (this.f1758M != null && ((this.f1756K || this.f1757L == 1) && actionMasked == 2 && !this.f1759N)) {
            float abs = Math.abs(this.f1771Z - motionEvent.getY());
            S.e eVar2 = this.f1758M;
            if (abs > eVar2.f782b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1759N;
    }

    public final void r() {
        int t2 = t();
        if (this.f1774b) {
            this.f1752G = Math.max(this.f1765T - t2, this.f1750D);
        } else {
            this.f1752G = this.f1765T - t2;
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
        if (this.i != null && (weakReference = this.f1766U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f1766U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float a2 = gVar.f527a.f513a.f559e.a(gVar.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > 0.0f && a2 > 0.0f) {
                        f2 = f4 / a2;
                        g gVar2 = this.i;
                        float a3 = gVar2.f527a.f513a.f560f.a(gVar2.f());
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
                float a32 = gVar22.f527a.f513a.f560f.a(gVar22.f());
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
        return this.f1780f ? Math.min(Math.max(this.f1781g, this.f1765T - ((this.f1764S * 9) / 16)), this.f1763R) + this.f1794v : (this.f1786n || this.f1787o || (i = this.f1785m) <= 0) ? this.f1779e + this.f1794v : Math.max(this.f1779e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.f1766U.get()) != null) {
            ArrayList arrayList = this.f1768W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f1752G;
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
        if (this.f1774b) {
            return this.f1750D;
        }
        return Math.max(this.f1749C, this.f1790r ? 0 : this.f1795w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f1752G;
        }
        if (i == 5) {
            return this.f1765T;
        }
        if (i == 6) {
            return this.f1751E;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    public final boolean z() {
        WeakReference weakReference = this.f1766U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f1766U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 2;
        this.f1772a = 0;
        this.f1774b = true;
        this.f1783k = -1;
        this.f1784l = -1;
        this.f1747A = new e(this);
        this.F = 0.5f;
        this.f1753H = -1.0f;
        this.f1756K = true;
        this.f1757L = 4;
        this.f1762Q = 0.1f;
        this.f1768W = new ArrayList();
        this.f1771Z = -1;
        this.f1777c0 = new SparseIntArray();
        this.f1778d0 = new c(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0361a.f3728a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1782j = A.c.H(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f1797y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f1797y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1782j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f1748B = ofFloat;
        ofFloat.setDuration(500L);
        this.f1748B.addUpdateListener(new A(i2, this));
        this.f1753H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1783k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1784l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f1754I != z2) {
            this.f1754I = z2;
            if (!z2 && this.f1757L == 5) {
                B(4);
            }
            F();
        }
        this.f1786n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1774b != z3) {
            this.f1774b = z3;
            if (this.f1766U != null) {
                r();
            }
            C((this.f1774b && this.f1757L == 6) ? 3 : this.f1757L);
            G(this.f1757L, true);
            F();
        }
        this.f1755J = obtainStyledAttributes.getBoolean(12, false);
        this.f1756K = obtainStyledAttributes.getBoolean(4, true);
        this.f1772a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.F = f2;
            if (this.f1766U != null) {
                this.f1751E = (int) ((1.0f - f2) * this.f1765T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f1749C = i3;
                    G(this.f1757L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f1749C = dimensionPixelOffset;
                    G(this.f1757L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(11, 500);
            this.f1787o = obtainStyledAttributes.getBoolean(17, false);
            this.f1788p = obtainStyledAttributes.getBoolean(18, false);
            this.f1789q = obtainStyledAttributes.getBoolean(19, false);
            this.f1790r = obtainStyledAttributes.getBoolean(20, true);
            this.f1791s = obtainStyledAttributes.getBoolean(14, false);
            this.f1792t = obtainStyledAttributes.getBoolean(15, false);
            this.f1793u = obtainStyledAttributes.getBoolean(16, false);
            this.f1796x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f1776c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
