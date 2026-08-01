package com.google.android.material.sidesheet;

import B.p;
import J0.g;
import J0.j;
import J0.k;
import K.H;
import K.T;
import K0.c;
import K0.e;
import L.s;
import M.a;
import Y.V;
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
import com.playbag.tripgear.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p0.AbstractC0282a;
import w1.d;
import w1.l;
import x.AbstractC0313a;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0313a {

    /* renamed from: a, reason: collision with root package name */
    public d f1857a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1858b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1859c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1860e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1861f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1862g;
    public int h;
    public T.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1863j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1864k;

    /* renamed from: l, reason: collision with root package name */
    public int f1865l;

    /* renamed from: m, reason: collision with root package name */
    public int f1866m;

    /* renamed from: n, reason: collision with root package name */
    public int f1867n;

    /* renamed from: o, reason: collision with root package name */
    public int f1868o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1869p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1870q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1871r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1872s;

    /* renamed from: t, reason: collision with root package name */
    public int f1873t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1874u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1875v;

    public SideSheetBehavior() {
        this.f1860e = new e(this);
        this.f1862g = true;
        this.h = 5;
        this.f1864k = 0.1f;
        this.f1871r = -1;
        this.f1874u = new LinkedHashSet();
        this.f1875v = new c(this, 0);
    }

    @Override // x.AbstractC0313a
    public final void c(x.d dVar) {
        this.f1869p = null;
        this.i = null;
    }

    @Override // x.AbstractC0313a
    public final void e() {
        this.f1869p = null;
        this.i = null;
    }

    @Override // x.AbstractC0313a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        T.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && T.d(view) == null) || !this.f1862g) {
            this.f1863j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1872s) != null) {
            velocityTracker.recycle();
            this.f1872s = null;
        }
        if (this.f1872s == null) {
            this.f1872s = VelocityTracker.obtain();
        }
        this.f1872s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1873t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1863j) {
            this.f1863j = false;
            return false;
        }
        return (this.f1863j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // x.AbstractC0313a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f1858b;
        WeakHashMap weakHashMap = T.f423a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1869p == null) {
            this.f1869p = new WeakReference(view);
            Context context = view.getContext();
            d.h0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(RecyclerView.f1530C0, RecyclerView.f1530C0, RecyclerView.f1530C0, 1.0f));
            d.g0(context, R.attr.motionDurationMedium2, 300);
            d.g0(context, R.attr.motionDurationShort3, 150);
            d.g0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1861f;
                if (f2 == -1.0f) {
                    f2 = H.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1859c;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
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
            if (T.d(view) == null) {
                T.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((x.d) view.getLayoutParams()).f4195c, i) == 3 ? 1 : 0;
        d dVar = this.f1857a;
        if (dVar == null || dVar.M() != i6) {
            k kVar = this.d;
            x.d dVar2 = null;
            if (i6 == 0) {
                this.f1857a = new K0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f1869p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof x.d)) {
                        dVar2 = (x.d) view3.getLayoutParams();
                    }
                    if (dVar2 == null || ((ViewGroup.MarginLayoutParams) dVar2).rightMargin <= 0) {
                        j e2 = kVar.e();
                        e2.f359f = new J0.a(RecyclerView.f1530C0);
                        e2.f360g = new J0.a(RecyclerView.f1530C0);
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
                this.f1857a = new K0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f1869p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof x.d)) {
                        dVar2 = (x.d) view2.getLayoutParams();
                    }
                    if (dVar2 == null || ((ViewGroup.MarginLayoutParams) dVar2).leftMargin <= 0) {
                        j e3 = kVar.e();
                        e3.f358e = new J0.a(RecyclerView.f1530C0);
                        e3.h = new J0.a(RecyclerView.f1530C0);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new T.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1875v);
        }
        int K2 = this.f1857a.K(view);
        coordinatorLayout.q(view, i);
        this.f1866m = coordinatorLayout.getWidth();
        this.f1867n = this.f1857a.L(coordinatorLayout);
        this.f1865l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1868o = marginLayoutParams != null ? this.f1857a.h(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i3 = K2 - this.f1857a.K(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.f1857a.E();
        }
        view.offsetLeftAndRight(i3);
        if (this.f1870q == null && (i2 = this.f1871r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1870q = new WeakReference(findViewById);
        }
        Iterator it = this.f1874u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // x.AbstractC0313a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0313a
    public final void m(View view, Parcelable parcelable) {
        int i = ((K0.d) parcelable).f526c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // x.AbstractC0313a
    public final Parcelable n(View view) {
        return new K0.d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0313a
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
        if (actionMasked == 0 && (velocityTracker = this.f1872s) != null) {
            velocityTracker.recycle();
            this.f1872s = null;
        }
        if (this.f1872s == null) {
            this.f1872s = VelocityTracker.obtain();
        }
        this.f1872s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1863j && s()) {
            float abs = Math.abs(this.f1873t - motionEvent.getX());
            T.e eVar = this.i;
            if (abs > eVar.f814b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1863j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f1869p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1874u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f1862g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1860e.a(r4);
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
        int C2;
        if (i == 3) {
            C2 = this.f1857a.C();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(V.e("Invalid state to get outer edge offset: ", i));
            }
            C2 = this.f1857a.E();
        }
        T.e eVar = this.i;
        if (eVar != null) {
            if (!z2) {
                int top = view.getTop();
                eVar.f827r = view;
                eVar.f815c = -1;
                boolean h = eVar.h(C2, top, 0, 0);
                if (!h && eVar.f813a == 0 && eVar.f827r != null) {
                    eVar.f827r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1869p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        T.i(view, 262144);
        T.g(view, 0);
        T.i(view, 1048576);
        T.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            T.j(view, L.e.f538j, new s() { // from class: K0.b
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
                    WeakReference weakReference2 = sideSheetBehavior.f1869p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1869p.get();
                        p pVar = new p(i3, i2, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f423a;
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
            T.j(view, L.e.h, new s() { // from class: K0.b
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
                    WeakReference weakReference2 = sideSheetBehavior.f1869p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1869p.get();
                        p pVar = new p(i3, i22, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f423a;
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
        this.f1860e = new e(this);
        this.f1862g = true;
        this.h = 5;
        this.f1864k = 0.1f;
        this.f1871r = -1;
        this.f1874u = new LinkedHashSet();
        this.f1875v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0282a.f3449w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1859c = l.v(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1871r = resourceId;
            WeakReference weakReference = this.f1870q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1870q = null;
            WeakReference weakReference2 = this.f1869p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = T.f423a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1858b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1859c;
            if (colorStateList != null) {
                this.f1858b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1858b.setTint(typedValue.data);
            }
        }
        this.f1861f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1862g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
