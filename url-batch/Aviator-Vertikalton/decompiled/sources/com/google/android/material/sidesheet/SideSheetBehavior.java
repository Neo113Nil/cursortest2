package com.google.android.material.sidesheet;

import B.p;
import H0.g;
import H0.j;
import H0.k;
import I0.c;
import I0.d;
import I0.e;
import K.L;
import K.X;
import L.s;
import M.a;
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
import com.fortuneink.neonpad.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.AbstractC0303a;
import q1.l;
import x.AbstractC0361a;
import x.C0364d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0361a {

    /* renamed from: a, reason: collision with root package name */
    public l f1954a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1955b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1956c;

    /* renamed from: d, reason: collision with root package name */
    public final k f1957d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1958e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1959f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1960g;
    public int h;
    public S.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1961j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1962k;

    /* renamed from: l, reason: collision with root package name */
    public int f1963l;

    /* renamed from: m, reason: collision with root package name */
    public int f1964m;

    /* renamed from: n, reason: collision with root package name */
    public int f1965n;

    /* renamed from: o, reason: collision with root package name */
    public int f1966o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1967p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1968q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1969r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1970s;

    /* renamed from: t, reason: collision with root package name */
    public int f1971t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1972u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1973v;

    public SideSheetBehavior() {
        this.f1958e = new e(this);
        this.f1960g = true;
        this.h = 5;
        this.f1962k = 0.1f;
        this.f1969r = -1;
        this.f1972u = new LinkedHashSet();
        this.f1973v = new c(this, 0);
    }

    @Override // x.AbstractC0361a
    public final void c(C0364d c0364d) {
        this.f1967p = null;
        this.i = null;
    }

    @Override // x.AbstractC0361a
    public final void e() {
        this.f1967p = null;
        this.i = null;
    }

    @Override // x.AbstractC0361a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        S.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && X.d(view) == null) || !this.f1960g) {
            this.f1961j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1970s) != null) {
            velocityTracker.recycle();
            this.f1970s = null;
        }
        if (this.f1970s == null) {
            this.f1970s = VelocityTracker.obtain();
        }
        this.f1970s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1971t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1961j) {
            this.f1961j = false;
            return false;
        }
        return (this.f1961j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // x.AbstractC0361a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f1955b;
        WeakHashMap weakHashMap = X.f418a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1967p == null) {
            this.f1967p = new WeakReference(view);
            Context context = view.getContext();
            l.g0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            l.f0(context, R.attr.motionDurationMedium2, 300);
            l.f0(context, R.attr.motionDurationShort3, 150);
            l.f0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1959f;
                if (f2 == -1.0f) {
                    f2 = L.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1956c;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
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
            if (X.d(view) == null) {
                X.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C0364d) view.getLayoutParams()).f4592c, i) == 3 ? 1 : 0;
        l lVar = this.f1954a;
        if (lVar == null || lVar.G() != i6) {
            k kVar = this.f1957d;
            C0364d c0364d = null;
            if (i6 == 0) {
                this.f1954a = new I0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f1967p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0364d)) {
                        c0364d = (C0364d) view3.getLayoutParams();
                    }
                    if (c0364d == null || ((ViewGroup.MarginLayoutParams) c0364d).rightMargin <= 0) {
                        j e2 = kVar.e();
                        e2.f299f = new H0.a(0.0f);
                        e2.f300g = new H0.a(0.0f);
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
                this.f1954a = new I0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f1967p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0364d)) {
                        c0364d = (C0364d) view2.getLayoutParams();
                    }
                    if (c0364d == null || ((ViewGroup.MarginLayoutParams) c0364d).leftMargin <= 0) {
                        j e3 = kVar.e();
                        e3.f298e = new H0.a(0.0f);
                        e3.h = new H0.a(0.0f);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new S.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1973v);
        }
        int D2 = this.f1954a.D(view);
        coordinatorLayout.q(view, i);
        this.f1964m = coordinatorLayout.getWidth();
        this.f1965n = this.f1954a.E(coordinatorLayout);
        this.f1963l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1966o = marginLayoutParams != null ? this.f1954a.e(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i3 = D2 - this.f1954a.D(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.f1954a.z();
        }
        view.offsetLeftAndRight(i3);
        if (this.f1968q == null && (i2 = this.f1969r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1968q = new WeakReference(findViewById);
        }
        Iterator it = this.f1972u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // x.AbstractC0361a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0361a
    public final void m(View view, Parcelable parcelable) {
        int i = ((d) parcelable).f374c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // x.AbstractC0361a
    public final Parcelable n(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0361a
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
        if (actionMasked == 0 && (velocityTracker = this.f1970s) != null) {
            velocityTracker.recycle();
            this.f1970s = null;
        }
        if (this.f1970s == null) {
            this.f1970s = VelocityTracker.obtain();
        }
        this.f1970s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1961j && s()) {
            float abs = Math.abs(this.f1971t - motionEvent.getX());
            S.e eVar = this.i;
            if (abs > eVar.f756b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1961j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f1967p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1972u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f1960g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1958e.a(r4);
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
        int x2;
        if (i == 3) {
            x2 = this.f1954a.x();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(X0.e.d("Invalid state to get outer edge offset: ", i));
            }
            x2 = this.f1954a.z();
        }
        S.e eVar = this.i;
        if (eVar != null) {
            if (!z2) {
                int top = view.getTop();
                eVar.f770r = view;
                eVar.f757c = -1;
                boolean h = eVar.h(x2, top, 0, 0);
                if (!h && eVar.f755a == 0 && eVar.f770r != null) {
                    eVar.f770r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1967p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.i(view, 262144);
        X.g(view, 0);
        X.i(view, 1048576);
        X.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            X.j(view, L.e.f657j, new s() { // from class: I0.b
                @Override // L.s
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
                    WeakReference weakReference2 = sideSheetBehavior.f1967p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1967p.get();
                        p pVar = new p(sideSheetBehavior, i3, i2);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = X.f418a;
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
            X.j(view, L.e.h, new s() { // from class: I0.b
                @Override // L.s
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
                    WeakReference weakReference2 = sideSheetBehavior.f1967p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1967p.get();
                        p pVar = new p(sideSheetBehavior, i3, i22);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = X.f418a;
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
        this.f1958e = new e(this);
        this.f1960g = true;
        this.h = 5;
        this.f1962k = 0.1f;
        this.f1969r = -1;
        this.f1972u = new LinkedHashSet();
        this.f1973v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0303a.f3650w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1956c = q1.d.y(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f1957d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1969r = resourceId;
            WeakReference weakReference = this.f1968q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1968q = null;
            WeakReference weakReference2 = this.f1967p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = X.f418a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f1957d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1955b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1956c;
            if (colorStateList != null) {
                this.f1955b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1955b.setTint(typedValue.data);
            }
        }
        this.f1959f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1960g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
