package com.google.android.material.sidesheet;

import D.p;
import L0.g;
import L0.j;
import L0.k;
import M.F;
import M.Q;
import M0.c;
import M0.d;
import M0.e;
import N.s;
import O.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.winfour.neondrop.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import q0.AbstractC0257a;
import z.AbstractC0318a;
import z.C0321d;
import z1.l;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0318a {

    /* renamed from: a, reason: collision with root package name */
    public l f1945a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1946b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1947c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1948e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1949f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1950g;
    public int h;
    public U.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1951j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1952k;

    /* renamed from: l, reason: collision with root package name */
    public int f1953l;

    /* renamed from: m, reason: collision with root package name */
    public int f1954m;

    /* renamed from: n, reason: collision with root package name */
    public int f1955n;

    /* renamed from: o, reason: collision with root package name */
    public int f1956o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1957p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1958q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1959r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1960s;

    /* renamed from: t, reason: collision with root package name */
    public int f1961t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1962u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1963v;

    public SideSheetBehavior() {
        this.f1948e = new e(this);
        this.f1950g = true;
        this.h = 5;
        this.f1952k = 0.1f;
        this.f1959r = -1;
        this.f1962u = new LinkedHashSet();
        this.f1963v = new c(this, 0);
    }

    @Override // z.AbstractC0318a
    public final void c(C0321d c0321d) {
        this.f1957p = null;
        this.i = null;
    }

    @Override // z.AbstractC0318a
    public final void e() {
        this.f1957p = null;
        this.i = null;
    }

    @Override // z.AbstractC0318a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        U.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && Q.d(view) == null) || !this.f1950g) {
            this.f1951j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1960s) != null) {
            velocityTracker.recycle();
            this.f1960s = null;
        }
        if (this.f1960s == null) {
            this.f1960s = VelocityTracker.obtain();
        }
        this.f1960s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1961t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1951j) {
            this.f1951j = false;
            return false;
        }
        return (this.f1951j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // z.AbstractC0318a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f1946b;
        WeakHashMap weakHashMap = Q.f513a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1957p == null) {
            this.f1957p = new WeakReference(view);
            Context context = view.getContext();
            l.n0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            l.m0(context, R.attr.motionDurationMedium2, 300);
            l.m0(context, R.attr.motionDurationShort3, 150);
            l.m0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1949f;
                if (f2 == -1.0f) {
                    f2 = F.i(view);
                }
                gVar.k(f2);
            } else {
                ColorStateList colorStateList = this.f1947c;
                if (colorStateList != null) {
                    F.q(view, colorStateList);
                }
            }
            int i5 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (Q.d(view) == null) {
                Q.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C0321d) view.getLayoutParams()).f4306c, i) == 3 ? 1 : 0;
        l lVar = this.f1945a;
        if (lVar == null || lVar.P() != i6) {
            k kVar = this.d;
            C0321d c0321d = null;
            if (i6 == 0) {
                this.f1945a = new M0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f1957p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0321d)) {
                        c0321d = (C0321d) view3.getLayoutParams();
                    }
                    if (c0321d == null || ((ViewGroup.MarginLayoutParams) c0321d).rightMargin <= 0) {
                        j e2 = kVar.e();
                        e2.f457f = new L0.a(0.0f);
                        e2.f458g = new L0.a(0.0f);
                        k a2 = e2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f1945a = new M0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f1957p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0321d)) {
                        c0321d = (C0321d) view2.getLayoutParams();
                    }
                    if (c0321d == null || ((ViewGroup.MarginLayoutParams) c0321d).leftMargin <= 0) {
                        j e3 = kVar.e();
                        e3.f456e = new L0.a(0.0f);
                        e3.h = new L0.a(0.0f);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new U.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1963v);
        }
        int M2 = this.f1945a.M(view);
        coordinatorLayout.q(view, i);
        this.f1954m = coordinatorLayout.getWidth();
        this.f1955n = this.f1945a.N(coordinatorLayout);
        this.f1953l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1956o = marginLayoutParams != null ? this.f1945a.m(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i3 = M2 - this.f1945a.M(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.f1945a.I();
        }
        view.offsetLeftAndRight(i3);
        if (this.f1958q == null && (i2 = this.f1959r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1958q = new WeakReference(findViewById);
        }
        Iterator it = this.f1962u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // z.AbstractC0318a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // z.AbstractC0318a
    public final void m(View view, Parcelable parcelable) {
        int i = ((d) parcelable).f612c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // z.AbstractC0318a
    public final Parcelable n(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // z.AbstractC0318a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1960s) != null) {
            velocityTracker.recycle();
            this.f1960s = null;
        }
        if (this.f1960s == null) {
            this.f1960s = VelocityTracker.obtain();
        }
        this.f1960s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1951j && s()) {
            float abs = Math.abs(this.f1961t - motionEvent.getX());
            U.e eVar = this.i;
            if (abs > eVar.f843b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1951j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f1957p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1962u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f1950g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1948e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i, boolean z2) {
        int H;
        if (i == 3) {
            H = this.f1945a.H();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(X0.a.e("Invalid state to get outer edge offset: ", i));
            }
            H = this.f1945a.I();
        }
        U.e eVar = this.i;
        if (eVar != null) {
            if (!z2) {
                int top = view.getTop();
                eVar.f856r = view;
                eVar.f844c = -1;
                boolean h = eVar.h(H, top, 0, 0);
                if (!h && eVar.f842a == 0 && eVar.f856r != null) {
                    eVar.f856r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1957p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Q.i(view, 262144);
        Q.g(view, 0);
        Q.i(view, 1048576);
        Q.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            Q.j(view, N.e.f624j, new s() { // from class: M0.b
                @Override // N.s
                public final boolean b(View view2) {
                    int i2 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i3 = i;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f1957p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1957p.get();
                        p pVar = new p(sideSheetBehavior, i3, i2);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = Q.f513a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(pVar);
                            }
                        }
                        pVar.run();
                    }
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            Q.j(view, N.e.h, new s() { // from class: M0.b
                @Override // N.s
                public final boolean b(View view2) {
                    int i22 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i3 = i2;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f1957p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1957p.get();
                        p pVar = new p(sideSheetBehavior, i3, i22);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = Q.f513a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(pVar);
                            }
                        }
                        pVar.run();
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f1948e = new e(this);
        this.f1950g = true;
        this.h = 5;
        this.f1952k = 0.1f;
        this.f1959r = -1;
        this.f1962u = new LinkedHashSet();
        this.f1963v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0257a.f3401y);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1947c = z1.d.v(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1959r = resourceId;
            WeakReference weakReference = this.f1958q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1958q = null;
            WeakReference weakReference2 = this.f1957p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = Q.f513a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1946b = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f1947c;
            if (colorStateList != null) {
                this.f1946b.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1946b.setTint(typedValue.data);
            }
        }
        this.f1949f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1950g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
