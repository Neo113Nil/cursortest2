package com.google.android.material.sidesheet;

import B.p;
import K.G;
import K.S;
import L.s;
import M.a;
import M0.g;
import M0.j;
import M0.k;
import N0.c;
import N0.d;
import N0.e;
import X.V;
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
import com.glasspulse.glasspulse.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import s0.AbstractC0283a;
import u1.l;
import x.AbstractC0319a;
import x.C0322d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0319a {

    /* renamed from: a, reason: collision with root package name */
    public l f1862a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1863b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1864c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1865e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1866f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1867g;
    public int h;
    public S.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1868j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1869k;

    /* renamed from: l, reason: collision with root package name */
    public int f1870l;

    /* renamed from: m, reason: collision with root package name */
    public int f1871m;

    /* renamed from: n, reason: collision with root package name */
    public int f1872n;

    /* renamed from: o, reason: collision with root package name */
    public int f1873o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1874p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1875q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1876r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1877s;

    /* renamed from: t, reason: collision with root package name */
    public int f1878t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1879u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1880v;

    public SideSheetBehavior() {
        this.f1865e = new e(this);
        this.f1867g = true;
        this.h = 5;
        this.f1869k = 0.1f;
        this.f1876r = -1;
        this.f1879u = new LinkedHashSet();
        this.f1880v = new c(this, 0);
    }

    @Override // x.AbstractC0319a
    public final void c(C0322d c0322d) {
        this.f1874p = null;
        this.i = null;
    }

    @Override // x.AbstractC0319a
    public final void e() {
        this.f1874p = null;
        this.i = null;
    }

    @Override // x.AbstractC0319a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        S.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && S.d(view) == null) || !this.f1867g) {
            this.f1868j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1877s) != null) {
            velocityTracker.recycle();
            this.f1877s = null;
        }
        if (this.f1877s == null) {
            this.f1877s = VelocityTracker.obtain();
        }
        this.f1877s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1878t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1868j) {
            this.f1868j = false;
            return false;
        }
        return (this.f1868j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // x.AbstractC0319a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f1863b;
        WeakHashMap weakHashMap = S.f351a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1874p == null) {
            this.f1874p = new WeakReference(view);
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
                float f2 = this.f1866f;
                if (f2 == -1.0f) {
                    f2 = G.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1864c;
                if (colorStateList != null) {
                    G.q(view, colorStateList);
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
            if (S.d(view) == null) {
                S.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C0322d) view.getLayoutParams()).f4186c, i) == 3 ? 1 : 0;
        l lVar = this.f1862a;
        if (lVar == null || lVar.I() != i6) {
            k kVar = this.d;
            C0322d c0322d = null;
            if (i6 == 0) {
                this.f1862a = new N0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f1874p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0322d)) {
                        c0322d = (C0322d) view3.getLayoutParams();
                    }
                    if (c0322d == null || ((ViewGroup.MarginLayoutParams) c0322d).rightMargin <= 0) {
                        j e2 = kVar.e();
                        e2.f519f = new M0.a(0.0f);
                        e2.f520g = new M0.a(0.0f);
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
                this.f1862a = new N0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f1874p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0322d)) {
                        c0322d = (C0322d) view2.getLayoutParams();
                    }
                    if (c0322d == null || ((ViewGroup.MarginLayoutParams) c0322d).leftMargin <= 0) {
                        j e3 = kVar.e();
                        e3.f518e = new M0.a(0.0f);
                        e3.h = new M0.a(0.0f);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new S.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1880v);
        }
        int F = this.f1862a.F(view);
        coordinatorLayout.q(view, i);
        this.f1871m = coordinatorLayout.getWidth();
        this.f1872n = this.f1862a.G(coordinatorLayout);
        this.f1870l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1873o = marginLayoutParams != null ? this.f1862a.i(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i3 = F - this.f1862a.F(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.f1862a.z();
        }
        view.offsetLeftAndRight(i3);
        if (this.f1875q == null && (i2 = this.f1876r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1875q = new WeakReference(findViewById);
        }
        Iterator it = this.f1879u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // x.AbstractC0319a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0319a
    public final void m(View view, Parcelable parcelable) {
        int i = ((d) parcelable).f568c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // x.AbstractC0319a
    public final Parcelable n(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0319a
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
        if (actionMasked == 0 && (velocityTracker = this.f1877s) != null) {
            velocityTracker.recycle();
            this.f1877s = null;
        }
        if (this.f1877s == null) {
            this.f1877s = VelocityTracker.obtain();
        }
        this.f1877s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1868j && s()) {
            float abs = Math.abs(this.f1878t - motionEvent.getX());
            S.e eVar = this.i;
            if (abs > eVar.f751b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1868j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f1874p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1879u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f1867g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1865e.a(r4);
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
        int y2;
        if (i == 3) {
            y2 = this.f1862a.y();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(V.d("Invalid state to get outer edge offset: ", i));
            }
            y2 = this.f1862a.z();
        }
        S.e eVar = this.i;
        if (eVar != null) {
            if (!z2) {
                int top = view.getTop();
                eVar.f764r = view;
                eVar.f752c = -1;
                boolean h = eVar.h(y2, top, 0, 0);
                if (!h && eVar.f750a == 0 && eVar.f764r != null) {
                    eVar.f764r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1874p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.i(view, 262144);
        S.g(view, 0);
        S.i(view, 1048576);
        S.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            S.j(view, L.e.f457j, new s() { // from class: N0.b
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
                    WeakReference weakReference2 = sideSheetBehavior.f1874p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1874p.get();
                        p pVar = new p(sideSheetBehavior, i3, i2);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = S.f351a;
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
            S.j(view, L.e.h, new s() { // from class: N0.b
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
                    WeakReference weakReference2 = sideSheetBehavior.f1874p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1874p.get();
                        p pVar = new p(sideSheetBehavior, i3, i22);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = S.f351a;
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
        this.f1865e = new e(this);
        this.f1867g = true;
        this.h = 5;
        this.f1869k = 0.1f;
        this.f1876r = -1;
        this.f1879u = new LinkedHashSet();
        this.f1880v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0283a.f3762w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1864c = u1.d.C(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1876r = resourceId;
            WeakReference weakReference = this.f1875q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1875q = null;
            WeakReference weakReference2 = this.f1874p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = S.f351a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1863b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1864c;
            if (colorStateList != null) {
                this.f1863b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1863b.setTint(typedValue.data);
            }
        }
        this.f1866f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1867g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
