package com.google.android.material.sidesheet;

import a0.q;
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
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.snovikpovik.vuevnxsj.R;
import d3.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k5.d;
import q3.c0;
import q3.k0;
import r2.o;
import r2.r;
import r3.p;
import w5.j;
import w5.m;
import w5.n;
import x3.c;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public o f1936a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1937b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1938c;

    /* renamed from: d, reason: collision with root package name */
    public final n f1939d;

    /* renamed from: e, reason: collision with root package name */
    public final h4.a f1940e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1941f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1942g;

    /* renamed from: h, reason: collision with root package name */
    public int f1943h;
    public c i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1944j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1945k;

    /* renamed from: l, reason: collision with root package name */
    public int f1946l;

    /* renamed from: m, reason: collision with root package name */
    public int f1947m;

    /* renamed from: n, reason: collision with root package name */
    public int f1948n;

    /* renamed from: o, reason: collision with root package name */
    public int f1949o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1950p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1951q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1952r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1953s;

    /* renamed from: t, reason: collision with root package name */
    public int f1954t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1955u;

    /* renamed from: v, reason: collision with root package name */
    public final d f1956v;

    public SideSheetBehavior() {
        this.f1940e = new h4.a(this);
        this.f1942g = true;
        this.f1943h = 5;
        this.f1945k = 0.1f;
        this.f1952r = -1;
        this.f1955u = new LinkedHashSet();
        this.f1956v = new d(this, 1);
    }

    @Override // d3.a
    public final void c(d3.d dVar) {
        this.f1950p = null;
        this.i = null;
    }

    @Override // d3.a
    public final void e() {
        this.f1950p = null;
        this.i = null;
    }

    @Override // d3.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        c cVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && k0.c(view) == null) || !this.f1942g) {
            this.f1944j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1953s) != null) {
            velocityTracker.recycle();
            this.f1953s = null;
        }
        if (this.f1953s == null) {
            this.f1953s = VelocityTracker.obtain();
        }
        this.f1953s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1954t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1944j) {
            this.f1944j = false;
            return false;
        }
        return (this.f1944j || (cVar = this.i) == null || !cVar.p(motionEvent)) ? false : true;
    }

    @Override // d3.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i8;
        View findViewById;
        int i9 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f1950p;
        j jVar = this.f1937b;
        int i10 = 0;
        if (weakReference == null) {
            this.f1950p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            r.Q(context, R.attr.motionDurationMedium2, 300);
            r.Q(context, R.attr.motionDurationShort3, 150);
            r.Q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (jVar != null) {
                view.setBackground(jVar);
                float f6 = this.f1941f;
                if (f6 == -1.0f) {
                    f6 = view.getElevation();
                }
                jVar.m(f6);
            } else {
                ColorStateList colorStateList = this.f1938c;
                if (colorStateList != null) {
                    Field field = k0.f6120a;
                    c0.g(view, colorStateList);
                }
            }
            int i11 = this.f1943h == 5 ? 4 : 0;
            if (view.getVisibility() != i11) {
                view.setVisibility(i11);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (k0.c(view) == null) {
                k0.l(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i12 = Gravity.getAbsoluteGravity(((d3.d) view.getLayoutParams()).f2228c, i) == 3 ? 1 : 0;
        o oVar = this.f1936a;
        if (oVar == null || oVar.O() != i12) {
            d3.d dVar = null;
            n nVar = this.f1939d;
            if (i12 == 0) {
                this.f1936a = new x5.a(this, i9);
                if (nVar != null) {
                    WeakReference weakReference2 = this.f1950p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof d3.d)) {
                        dVar = (d3.d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        m f8 = nVar.f();
                        f8.f8132f = new w5.a(0.0f);
                        f8.f8133g = new w5.a(0.0f);
                        n a8 = f8.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a8);
                        }
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i12 + ". Must be 0 or 1.");
                }
                this.f1936a = new x5.a(this, i10);
                if (nVar != null) {
                    WeakReference weakReference3 = this.f1950p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof d3.d)) {
                        dVar = (d3.d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        m f9 = nVar.f();
                        f9.f8131e = new w5.a(0.0f);
                        f9.f8134h = new w5.a(0.0f);
                        n a9 = f9.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a9);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f1956v);
        }
        int J = this.f1936a.J(view);
        coordinatorLayout.q(view, i);
        this.f1947m = coordinatorLayout.getWidth();
        this.f1948n = this.f1936a.K(coordinatorLayout);
        this.f1946l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1949o = marginLayoutParams != null ? this.f1936a.k(marginLayoutParams) : 0;
        int i13 = this.f1943h;
        if (i13 == 1 || i13 == 2) {
            i10 = J - this.f1936a.J(view);
        } else if (i13 != 3) {
            if (i13 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f1943h);
            }
            i10 = this.f1936a.G();
        }
        Field field2 = k0.f6120a;
        view.offsetLeftAndRight(i10);
        if (this.f1951q == null && (i8 = this.f1952r) != -1 && (findViewById = coordinatorLayout.findViewById(i8)) != null) {
            this.f1951q = new WeakReference(findViewById);
        }
        Iterator it = this.f1955u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // d3.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // d3.a
    public final void m(View view, Parcelable parcelable) {
        int i = ((x5.c) parcelable).f8661f;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f1943h = i;
    }

    @Override // d3.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new x5.c(this);
    }

    @Override // d3.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1943h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1953s) != null) {
            velocityTracker.recycle();
            this.f1953s = null;
        }
        if (this.f1953s == null) {
            this.f1953s = VelocityTracker.obtain();
        }
        this.f1953s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1944j && s()) {
            float abs = Math.abs(this.f1954t - motionEvent.getX());
            c cVar = this.i;
            if (abs > cVar.f8633b) {
                cVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1944j;
    }

    public final void r(int i) {
        View view;
        if (this.f1943h == i) {
            return;
        }
        this.f1943h = i;
        WeakReference weakReference = this.f1950p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i8 = this.f1943h == 5 ? 4 : 0;
        if (view.getVisibility() != i8) {
            view.setVisibility(i8);
        }
        Iterator it = this.f1955u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.f1942g || this.f1943h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1940e.a(r4);
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
        int F;
        if (i == 3) {
            F = this.f1936a.F();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(q.h("Invalid state to get outer edge offset: ", i));
            }
            F = this.f1936a.G();
        }
        c cVar = this.i;
        if (cVar != null) {
            if (!z3) {
                int top = view.getTop();
                cVar.f8648r = view;
                cVar.f8634c = -1;
                boolean h8 = cVar.h(F, top, 0, 0);
                if (!h8 && cVar.f8632a == 0 && cVar.f8648r != null) {
                    cVar.f8648r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1950p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        k0.h(view, 262144);
        k0.f(view, 0);
        k0.h(view, 1048576);
        k0.f(view, 0);
        final int i = 5;
        if (this.f1943h != 5) {
            k0.i(view, r3.d.f6547l, new p() { // from class: x5.b
                @Override // r3.p
                public final boolean d(View view2) {
                    int i8 = i;
                    if (i8 == 1 || i8 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i8 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.f1950p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i8);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f1950p.get();
                    h3.j jVar = new h3.j(i8, 1, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(jVar);
                        return true;
                    }
                    jVar.run();
                    return true;
                }
            });
        }
        final int i8 = 3;
        if (this.f1943h != 3) {
            k0.i(view, r3.d.f6545j, new p() { // from class: x5.b
                @Override // r3.p
                public final boolean d(View view2) {
                    int i82 = i8;
                    if (i82 == 1 || i82 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i82 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.f1950p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i82);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f1950p.get();
                    h3.j jVar = new h3.j(i82, 1, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(jVar);
                        return true;
                    }
                    jVar.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f1940e = new h4.a(this);
        this.f1942g = true;
        this.f1943h = 5;
        this.f1945k = 0.1f;
        this.f1952r = -1;
        this.f1955u = new LinkedHashSet();
        this.f1956v = new d(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5.a.f2754t);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1938c = o.C(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f1939d = n.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1952r = resourceId;
            WeakReference weakReference = this.f1951q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1951q = null;
            WeakReference weakReference2 = this.f1950p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        n nVar = this.f1939d;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.f1937b = jVar;
            jVar.k(context);
            ColorStateList colorStateList = this.f1938c;
            if (colorStateList != null) {
                this.f1937b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1937b.setTint(typedValue.data);
            }
        }
        this.f1941f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1942g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
