package com.google.android.material.sidesheet;

import B.b;
import C3.g;
import C3.j;
import C3.k;
import D.y;
import D3.d;
import D3.f;
import O.L;
import O.X;
import P.u;
import Q.a;
import W.e;
import android.R;
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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anythink.basead.exoplayer.h.o;
import com.bumptech.glide.h;
import com.google.android.gms.internal.ads.CL;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public h f36203a;

    /* renamed from: b, reason: collision with root package name */
    public final g f36204b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f36205c;

    /* renamed from: d, reason: collision with root package name */
    public final k f36206d;

    /* renamed from: e, reason: collision with root package name */
    public final f f36207e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36208f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36209g;

    /* renamed from: h, reason: collision with root package name */
    public int f36210h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f36211j;

    /* renamed from: k, reason: collision with root package name */
    public final float f36212k;

    /* renamed from: l, reason: collision with root package name */
    public int f36213l;

    /* renamed from: m, reason: collision with root package name */
    public int f36214m;

    /* renamed from: n, reason: collision with root package name */
    public int f36215n;

    /* renamed from: o, reason: collision with root package name */
    public int f36216o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f36217p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f36218q;

    /* renamed from: r, reason: collision with root package name */
    public final int f36219r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f36220s;

    /* renamed from: t, reason: collision with root package name */
    public int f36221t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f36222u;

    /* renamed from: v, reason: collision with root package name */
    public final d f36223v;

    public SideSheetBehavior() {
        this.f36207e = new f(this);
        this.f36209g = true;
        this.f36210h = 5;
        this.f36212k = 0.1f;
        this.f36219r = -1;
        this.f36222u = new LinkedHashSet();
        this.f36223v = new d(this, 0);
    }

    @Override // B.b
    public final void c(B.e eVar) {
        this.f36217p = null;
        this.i = null;
    }

    @Override // B.b
    public final void e() {
        this.f36217p = null;
        this.i = null;
    }

    @Override // B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && X.e(view) == null) || !this.f36209g) {
            this.f36211j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f36220s) != null) {
            velocityTracker.recycle();
            this.f36220s = null;
        }
        if (this.f36220s == null) {
            this.f36220s = VelocityTracker.obtain();
        }
        this.f36220s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f36221t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f36211j) {
            this.f36211j = false;
            return false;
        }
        return (this.f36211j || (eVar = this.i) == null || !eVar.r(motionEvent)) ? false : true;
    }

    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i4;
        View findViewById;
        int i9 = 0;
        int i10 = 1;
        g gVar = this.f36204b;
        WeakHashMap weakHashMap = X.f2240a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f36217p == null) {
            this.f36217p = new WeakReference(view);
            Context context = view.getContext();
            K3.b.z(context, C5284R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            K3.b.y(context, C5284R.attr.motionDurationMedium2, 300);
            K3.b.y(context, C5284R.attr.motionDurationShort3, 150);
            K3.b.y(context, C5284R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C5284R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(C5284R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(C5284R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f6 = this.f36208f;
                if (f6 == -1.0f) {
                    f6 = L.i(view);
                }
                gVar.i(f6);
            } else {
                ColorStateList colorStateList = this.f36205c;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
                }
            }
            int i11 = this.f36210h == 5 ? 4 : 0;
            if (view.getVisibility() != i11) {
                view.setVisibility(i11);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (X.e(view) == null) {
                X.p(view, view.getResources().getString(C5284R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i12 = Gravity.getAbsoluteGravity(((B.e) view.getLayoutParams()).f45c, i) == 3 ? 1 : 0;
        h hVar = this.f36203a;
        if (hVar == null || hVar.m() != i12) {
            k kVar = this.f36206d;
            B.e eVar = null;
            if (i12 == 0) {
                this.f36203a = new D3.a(this, i10);
                if (kVar != null) {
                    WeakReference weakReference = this.f36217p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof B.e)) {
                        eVar = (B.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        j e6 = kVar.e();
                        e6.f426f = new C3.a(0.0f);
                        e6.f427g = new C3.a(0.0f);
                        k a9 = e6.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a9);
                        }
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalArgumentException(y.i(i12, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f36203a = new D3.a(this, i9);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f36217p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof B.e)) {
                        eVar = (B.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        j e9 = kVar.e();
                        e9.f425e = new C3.a(0.0f);
                        e9.f428h = new C3.a(0.0f);
                        k a10 = e9.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a10);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f36223v);
        }
        int k6 = this.f36203a.k(view);
        coordinatorLayout.q(i, view);
        this.f36214m = coordinatorLayout.getWidth();
        this.f36215n = this.f36203a.l(coordinatorLayout);
        this.f36213l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f36216o = marginLayoutParams != null ? this.f36203a.d(marginLayoutParams) : 0;
        int i13 = this.f36210h;
        if (i13 == 1 || i13 == 2) {
            i9 = k6 - this.f36203a.k(view);
        } else if (i13 != 3) {
            if (i13 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f36210h);
            }
            i9 = this.f36203a.h();
        }
        view.offsetLeftAndRight(i9);
        if (this.f36218q == null && (i4 = this.f36219r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f36218q = new WeakReference(findViewById);
        }
        Iterator it = this.f36222u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // B.b
    public final void m(View view, Parcelable parcelable) {
        int i = ((D3.e) parcelable).f694v;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f36210h = i;
    }

    @Override // B.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new D3.e(this);
    }

    @Override // B.b
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f36210h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f36220s) != null) {
            velocityTracker.recycle();
            this.f36220s = null;
        }
        if (this.f36220s == null) {
            this.f36220s = VelocityTracker.obtain();
        }
        this.f36220s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f36211j && s()) {
            float abs = Math.abs(this.f36221t - motionEvent.getX());
            e eVar = this.i;
            if (abs > eVar.f3392b) {
                eVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f36211j;
    }

    public final void r(int i) {
        View view;
        if (this.f36210h == i) {
            return;
        }
        this.f36210h = i;
        WeakReference weakReference = this.f36217p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = this.f36210h == 5 ? 4 : 0;
        if (view.getVisibility() != i4) {
            view.setVisibility(i4);
        }
        Iterator it = this.f36222u.iterator();
        if (it.hasNext()) {
            throw y.h(it);
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.f36209g || this.f36210h == 1;
        }
        return false;
    }

    public final void t(View view, int i, boolean z8) {
        int g9;
        if (i == 3) {
            g9 = this.f36203a.g();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(CL.i(i, "Invalid state to get outer edge offset: "));
            }
            g9 = this.f36203a.h();
        }
        e eVar = this.i;
        if (eVar == null || (!z8 ? eVar.s(g9, view.getTop(), view) : eVar.q(g9, view.getTop()))) {
            r(i);
        } else {
            r(2);
            this.f36207e.a(i);
        }
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f36217p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.l(262144, view);
        X.i(0, view);
        X.l(o.f7899d, view);
        X.i(0, view);
        final int i = 5;
        if (this.f36210h != 5) {
            X.m(view, P.f.f2666l, new u() { // from class: D3.b
                @Override // P.u
                public final boolean f(View view2) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i4 = i;
                    if (i4 == 1 || i4 == 2) {
                        throw new IllegalArgumentException(AbstractC5051n.g(new StringBuilder("STATE_"), i4 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f36217p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i4);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f36217p.get();
                    c cVar = new c(sideSheetBehavior, i4, 0);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = X.f2240a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(cVar);
                            return true;
                        }
                    }
                    cVar.run();
                    return true;
                }
            });
        }
        final int i4 = 3;
        if (this.f36210h != 3) {
            X.m(view, P.f.f2664j, new u() { // from class: D3.b
                @Override // P.u
                public final boolean f(View view2) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i42 = i4;
                    if (i42 == 1 || i42 == 2) {
                        throw new IllegalArgumentException(AbstractC5051n.g(new StringBuilder("STATE_"), i42 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f36217p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i42);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f36217p.get();
                    c cVar = new c(sideSheetBehavior, i42, 0);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = X.f2240a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(cVar);
                            return true;
                        }
                    }
                    cVar.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f36207e = new f(this);
        this.f36209g = true;
        this.f36210h = 5;
        this.f36212k = 0.1f;
        this.f36219r = -1;
        this.f36222u = new LinkedHashSet();
        this.f36223v = new d(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4576a.f38313w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f36205c = com.bumptech.glide.d.o(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f36206d = k.b(context, attributeSet, 0, C5284R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f36219r = resourceId;
            WeakReference weakReference = this.f36218q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f36218q = null;
            WeakReference weakReference2 = this.f36217p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = X.f2240a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f36206d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f36204b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f36205c;
            if (colorStateList != null) {
                this.f36204b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f36204b.setTint(typedValue.data);
            }
        }
        this.f36208f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f36209g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
