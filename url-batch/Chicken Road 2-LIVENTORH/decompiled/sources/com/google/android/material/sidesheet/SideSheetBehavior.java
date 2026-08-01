package com.google.android.material.sidesheet;

import a.y;
import a0.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.w0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.oriondriftchasers.arordrft.R;
import e0.k;
import h.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l2.j;
import l2.m;
import l2.n;
import m2.c;
import m2.d;
import m2.e;
import n0.d0;
import n0.l0;
import o0.o;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public a f984a;

    /* renamed from: b, reason: collision with root package name */
    public final j f985b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f986c;
    public final n d;

    /* renamed from: e, reason: collision with root package name */
    public final e f987e;

    /* renamed from: f, reason: collision with root package name */
    public final float f988f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f989g;

    /* renamed from: h, reason: collision with root package name */
    public int f990h;
    public t0.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f991j;

    /* renamed from: k, reason: collision with root package name */
    public final float f992k;

    /* renamed from: l, reason: collision with root package name */
    public int f993l;

    /* renamed from: m, reason: collision with root package name */
    public int f994m;

    /* renamed from: n, reason: collision with root package name */
    public int f995n;

    /* renamed from: o, reason: collision with root package name */
    public int f996o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f997p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f998q;

    /* renamed from: r, reason: collision with root package name */
    public final int f999r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1000s;

    /* renamed from: t, reason: collision with root package name */
    public int f1001t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1002u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1003v;

    public SideSheetBehavior() {
        this.f987e = new e(this);
        this.f989g = true;
        this.f990h = 5;
        this.f992k = 0.1f;
        this.f999r = -1;
        this.f1002u = new LinkedHashSet();
        this.f1003v = new c(this, 0);
    }

    @Override // a0.b
    public final void c(a0.e eVar) {
        this.f997p = null;
        this.i = null;
    }

    @Override // a0.b
    public final void e() {
        this.f997p = null;
        this.i = null;
    }

    @Override // a0.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        t0.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && l0.e(view) == null) || !this.f989g) {
            this.f991j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1000s) != null) {
            velocityTracker.recycle();
            this.f1000s = null;
        }
        if (this.f1000s == null) {
            this.f1000s = VelocityTracker.obtain();
        }
        this.f1000s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1001t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f991j) {
            this.f991j = false;
            return false;
        }
        return (this.f991j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // a0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i4;
        View findViewById;
        int i5 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f997p;
        j jVar = this.f985b;
        int i6 = 0;
        if (weakReference == null) {
            this.f997p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            y.R(context, R.attr.motionDurationMedium2, 300);
            y.R(context, R.attr.motionDurationShort3, 150);
            y.R(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (jVar != null) {
                view.setBackground(jVar);
                float f2 = this.f988f;
                if (f2 == -1.0f) {
                    f2 = view.getElevation();
                }
                jVar.p(f2);
            } else {
                ColorStateList colorStateList = this.f986c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = l0.f2757a;
                    d0.g(view, colorStateList);
                }
            }
            int i7 = this.f990h == 5 ? 4 : 0;
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (l0.e(view) == null) {
                l0.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i8 = Gravity.getAbsoluteGravity(((a0.e) view.getLayoutParams()).f85c, i) == 3 ? 1 : 0;
        a aVar = this.f984a;
        if (aVar == null || aVar.F() != i8) {
            a0.e eVar = null;
            n nVar = this.d;
            if (i8 == 0) {
                this.f984a = new m2.a(this, i5);
                if (nVar != null) {
                    WeakReference weakReference2 = this.f997p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof a0.e)) {
                        eVar = (a0.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        m g4 = nVar.g();
                        g4.f2622f = new l2.a(0.0f);
                        g4.f2623g = new l2.a(0.0f);
                        n a2 = g4.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i8 + ". Must be 0 or 1.");
                }
                this.f984a = new m2.a(this, i6);
                if (nVar != null) {
                    WeakReference weakReference3 = this.f997p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof a0.e)) {
                        eVar = (a0.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        m g5 = nVar.g();
                        g5.f2621e = new l2.a(0.0f);
                        g5.f2624h = new l2.a(0.0f);
                        n a4 = g5.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a4);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new t0.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1003v);
        }
        int D = this.f984a.D(view);
        coordinatorLayout.q(view, i);
        this.f994m = coordinatorLayout.getWidth();
        this.f995n = this.f984a.E(coordinatorLayout);
        this.f993l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f996o = marginLayoutParams != null ? this.f984a.f(marginLayoutParams) : 0;
        int i9 = this.f990h;
        if (i9 == 1 || i9 == 2) {
            i6 = D - this.f984a.D(view);
        } else if (i9 != 3) {
            if (i9 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f990h);
            }
            i6 = this.f984a.A();
        }
        WeakHashMap weakHashMap2 = l0.f2757a;
        view.offsetLeftAndRight(i6);
        if (this.f998q == null && (i4 = this.f999r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f998q = new WeakReference(findViewById);
        }
        Iterator it = this.f1002u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // a0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // a0.b
    public final void m(View view, Parcelable parcelable) {
        int i = ((d) parcelable).f2691h;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f990h = i;
    }

    @Override // a0.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d(this);
    }

    @Override // a0.b
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f990h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1000s) != null) {
            velocityTracker.recycle();
            this.f1000s = null;
        }
        if (this.f1000s == null) {
            this.f1000s = VelocityTracker.obtain();
        }
        this.f1000s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f991j && s()) {
            float abs = Math.abs(this.f1001t - motionEvent.getX());
            t0.e eVar = this.i;
            if (abs > eVar.f3289b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f991j;
    }

    public final void r(int i) {
        View view;
        if (this.f990h == i) {
            return;
        }
        this.f990h = i;
        WeakReference weakReference = this.f997p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = this.f990h == 5 ? 4 : 0;
        if (view.getVisibility() != i4) {
            view.setVisibility(i4);
        }
        Iterator it = this.f1002u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.f989g || this.f990h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f987e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i, boolean z3) {
        int z4;
        if (i == 3) {
            z4 = this.f984a.z();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(w0.d("Invalid state to get outer edge offset: ", i));
            }
            z4 = this.f984a.A();
        }
        t0.e eVar = this.i;
        if (eVar != null) {
            if (!z3) {
                int top = view.getTop();
                eVar.f3303r = view;
                eVar.f3290c = -1;
                boolean h4 = eVar.h(z4, top, 0, 0);
                if (!h4 && eVar.f3288a == 0 && eVar.f3303r != null) {
                    eVar.f3303r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f997p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        l0.j(view, 262144);
        l0.h(view, 0);
        l0.j(view, 1048576);
        l0.h(view, 0);
        final int i = 5;
        if (this.f990h != 5) {
            l0.k(view, o0.c.f2854j, new o() { // from class: m2.b
                @Override // o0.o
                public final boolean g(View view2) {
                    int i4 = i;
                    if (i4 == 1 || i4 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i4 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.f997p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i4);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f997p.get();
                    k kVar = new k(i4, 1, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(kVar);
                        return true;
                    }
                    kVar.run();
                    return true;
                }
            });
        }
        final int i4 = 3;
        if (this.f990h != 3) {
            l0.k(view, o0.c.f2853h, new o() { // from class: m2.b
                @Override // o0.o
                public final boolean g(View view2) {
                    int i42 = i4;
                    if (i42 == 1 || i42 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i42 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.f997p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i42);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f997p.get();
                    k kVar = new k(i42, 1, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(kVar);
                        return true;
                    }
                    kVar.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f987e = new e(this);
        this.f989g = true;
        this.f990h = 5;
        this.f992k = 0.1f;
        this.f999r = -1;
        this.f1002u = new LinkedHashSet();
        this.f1003v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.E);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f986c = a.t(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = n.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f999r = resourceId;
            WeakReference weakReference = this.f998q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f998q = null;
            WeakReference weakReference2 = this.f997p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        n nVar = this.d;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.f985b = jVar;
            jVar.m(context);
            ColorStateList colorStateList = this.f986c;
            if (colorStateList != null) {
                this.f985b.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f985b.setTint(typedValue.data);
            }
        }
        this.f988f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f989g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
