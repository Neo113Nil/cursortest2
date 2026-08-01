package com.google.android.material.sidesheet;

import A1.m;
import C.p;
import K0.g;
import K0.j;
import K0.k;
import L.H;
import L.T;
import L0.c;
import L0.e;
import M.s;
import N.a;
import Z.V;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.winfour.winrandom.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import q0.AbstractC0285a;
import y.AbstractC0317a;
import y.d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0317a {

    /* renamed from: a, reason: collision with root package name */
    public m f1957a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1958b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1959c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1960e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1961f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1962g;

    /* renamed from: h, reason: collision with root package name */
    public int f1963h;
    public U.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1964j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1965k;

    /* renamed from: l, reason: collision with root package name */
    public int f1966l;

    /* renamed from: m, reason: collision with root package name */
    public int f1967m;

    /* renamed from: n, reason: collision with root package name */
    public int f1968n;

    /* renamed from: o, reason: collision with root package name */
    public int f1969o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1970p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1971q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1972r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1973s;

    /* renamed from: t, reason: collision with root package name */
    public int f1974t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1975u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1976v;

    public SideSheetBehavior() {
        this.f1960e = new e(this);
        this.f1962g = true;
        this.f1963h = 5;
        this.f1965k = 0.1f;
        this.f1972r = -1;
        this.f1975u = new LinkedHashSet();
        this.f1976v = new c(this, 0);
    }

    @Override // y.AbstractC0317a
    public final void c(d dVar) {
        this.f1970p = null;
        this.i = null;
    }

    @Override // y.AbstractC0317a
    public final void e() {
        this.f1970p = null;
        this.i = null;
    }

    @Override // y.AbstractC0317a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        U.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && T.d(view) == null) || !this.f1962g) {
            this.f1964j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1973s) != null) {
            velocityTracker.recycle();
            this.f1973s = null;
        }
        if (this.f1973s == null) {
            this.f1973s = VelocityTracker.obtain();
        }
        this.f1973s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1974t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1964j) {
            this.f1964j = false;
            return false;
        }
        return (this.f1964j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // y.AbstractC0317a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f1958b;
        WeakHashMap weakHashMap = T.f490a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1970p == null) {
            this.f1970p = new WeakReference(view);
            Context context = view.getContext();
            m.a0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(RecyclerView.A0, RecyclerView.A0, RecyclerView.A0, 1.0f));
            m.Z(context, R.attr.motionDurationMedium2, 300);
            m.Z(context, R.attr.motionDurationShort3, 150);
            m.Z(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1961f;
                if (f2 == -1.0f) {
                    f2 = H.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1959c;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            int i5 = this.f1963h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (T.d(view) == null) {
                T.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((d) view.getLayoutParams()).f4301c, i) == 3 ? 1 : 0;
        m mVar = this.f1957a;
        if (mVar == null || mVar.D() != i6) {
            k kVar = this.d;
            d dVar = null;
            if (i6 == 0) {
                this.f1957a = new L0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f1970p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof d)) {
                        dVar = (d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        j e2 = kVar.e();
                        e2.f422f = new K0.a(RecyclerView.A0);
                        e2.f423g = new K0.a(RecyclerView.A0);
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
                this.f1957a = new L0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f1970p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof d)) {
                        dVar = (d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        j e3 = kVar.e();
                        e3.f421e = new K0.a(RecyclerView.A0);
                        e3.f424h = new K0.a(RecyclerView.A0);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new U.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1976v);
        }
        int B2 = this.f1957a.B(view);
        coordinatorLayout.q(view, i);
        this.f1967m = coordinatorLayout.getWidth();
        this.f1968n = this.f1957a.C(coordinatorLayout);
        this.f1966l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1969o = marginLayoutParams != null ? this.f1957a.f(marginLayoutParams) : 0;
        int i7 = this.f1963h;
        if (i7 == 1 || i7 == 2) {
            i3 = B2 - this.f1957a.B(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f1963h);
            }
            i3 = this.f1957a.v();
        }
        view.offsetLeftAndRight(i3);
        if (this.f1971q == null && (i2 = this.f1972r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1971q = new WeakReference(findViewById);
        }
        Iterator it = this.f1975u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // y.AbstractC0317a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // y.AbstractC0317a
    public final void m(View view, Parcelable parcelable) {
        int i = ((L0.d) parcelable).f596c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f1963h = i;
    }

    @Override // y.AbstractC0317a
    public final Parcelable n(View view) {
        return new L0.d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // y.AbstractC0317a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1963h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1973s) != null) {
            velocityTracker.recycle();
            this.f1973s = null;
        }
        if (this.f1973s == null) {
            this.f1973s = VelocityTracker.obtain();
        }
        this.f1973s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1964j && s()) {
            float abs = Math.abs(this.f1974t - motionEvent.getX());
            U.e eVar = this.i;
            if (abs > eVar.f853b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1964j;
    }

    public final void r(int i) {
        View view;
        if (this.f1963h == i) {
            return;
        }
        this.f1963h = i;
        WeakReference weakReference = this.f1970p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f1963h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1975u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f1962g || this.f1963h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1960e.a(r4);
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
        int u2;
        if (i == 3) {
            u2 = this.f1957a.u();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(V.e("Invalid state to get outer edge offset: ", i));
            }
            u2 = this.f1957a.v();
        }
        U.e eVar = this.i;
        if (eVar != null) {
            if (!z2) {
                int top = view.getTop();
                eVar.f867r = view;
                eVar.f854c = -1;
                boolean h2 = eVar.h(u2, top, 0, 0);
                if (!h2 && eVar.f852a == 0 && eVar.f867r != null) {
                    eVar.f867r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1970p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        T.i(view, 262144);
        T.g(view, 0);
        T.i(view, 1048576);
        T.g(view, 0);
        final int i = 5;
        if (this.f1963h != 5) {
            T.j(view, M.e.f609j, new s() { // from class: L0.b
                @Override // M.s
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
                    WeakReference weakReference2 = sideSheetBehavior.f1970p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1970p.get();
                        p pVar = new p(sideSheetBehavior, i3, i2);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f490a;
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
        if (this.f1963h != 3) {
            T.j(view, M.e.f608h, new s() { // from class: L0.b
                @Override // M.s
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
                    WeakReference weakReference2 = sideSheetBehavior.f1970p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1970p.get();
                        p pVar = new p(sideSheetBehavior, i3, i22);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f490a;
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
        this.f1960e = new e(this);
        this.f1962g = true;
        this.f1963h = 5;
        this.f1965k = 0.1f;
        this.f1972r = -1;
        this.f1975u = new LinkedHashSet();
        this.f1976v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f3520w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1959c = A1.d.D(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1972r = resourceId;
            WeakReference weakReference = this.f1971q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1971q = null;
            WeakReference weakReference2 = this.f1970p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = T.f490a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1958b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1959c;
            if (colorStateList != null) {
                this.f1958b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1958b.setTint(typedValue.data);
            }
        }
        this.f1961f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1962g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
