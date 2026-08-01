package com.google.android.material.sidesheet;

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
import b0.k;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import g2.j;
import g2.n;
import g2.o;
import h2.c;
import h2.e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k0.b0;
import k0.j0;
import k3.d;
import k3.m;
import x.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public d f1370a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1371b;
    public final ColorStateList c;

    /* renamed from: d, reason: collision with root package name */
    public final o f1372d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1373e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1374f;
    public final boolean g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public q0.e f1375i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1376j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1377k;

    /* renamed from: l, reason: collision with root package name */
    public int f1378l;

    /* renamed from: m, reason: collision with root package name */
    public int f1379m;

    /* renamed from: n, reason: collision with root package name */
    public int f1380n;

    /* renamed from: o, reason: collision with root package name */
    public int f1381o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1382p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1383q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1384r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1385s;

    /* renamed from: t, reason: collision with root package name */
    public int f1386t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1387u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1388v;

    public SideSheetBehavior() {
        this.f1373e = new e(this);
        this.g = true;
        this.h = 5;
        this.f1377k = 0.1f;
        this.f1384r = -1;
        this.f1387u = new LinkedHashSet();
        this.f1388v = new c(this, 0);
    }

    @Override // x.a
    public final void c(x.d dVar) {
        this.f1382p = null;
        this.f1375i = null;
    }

    @Override // x.a
    public final void e() {
        this.f1382p = null;
        this.f1375i = null;
    }

    @Override // x.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        q0.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && j0.e(view) == null) || !this.g) {
            this.f1376j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1385s) != null) {
            velocityTracker.recycle();
            this.f1385s = null;
        }
        if (this.f1385s == null) {
            this.f1385s = VelocityTracker.obtain();
        }
        this.f1385s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1386t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1376j) {
            this.f1376j = false;
            return false;
        }
        return (this.f1376j || (eVar = this.f1375i) == null || !eVar.o(motionEvent)) ? false : true;
    }

    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        View view2;
        View view3;
        int i5;
        View findViewById;
        int i6 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f1382p;
        j jVar = this.f1371b;
        int i7 = 0;
        if (weakReference == null) {
            this.f1382p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            m.Q(context, R.attr.motionDurationMedium2, 300);
            m.Q(context, R.attr.motionDurationShort3, 150);
            m.Q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (jVar != null) {
                view.setBackground(jVar);
                float f4 = this.f1374f;
                if (f4 == -1.0f) {
                    f4 = view.getElevation();
                }
                jVar.p(f4);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = j0.f2752a;
                    b0.g(view, colorStateList);
                }
            }
            int i8 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i8) {
                view.setVisibility(i8);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (j0.e(view) == null) {
                j0.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i9 = Gravity.getAbsoluteGravity(((x.d) view.getLayoutParams()).c, i4) == 3 ? 1 : 0;
        d dVar = this.f1370a;
        if (dVar == null || dVar.M() != i9) {
            x.d dVar2 = null;
            o oVar = this.f1372d;
            if (i9 == 0) {
                this.f1370a = new h2.a(this, i6);
                if (oVar != null) {
                    WeakReference weakReference2 = this.f1382p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof x.d)) {
                        dVar2 = (x.d) view3.getLayoutParams();
                    }
                    if (dVar2 == null || ((ViewGroup.MarginLayoutParams) dVar2).rightMargin <= 0) {
                        n j4 = oVar.j();
                        j4.f1881f = new g2.a(0.0f);
                        j4.g = new g2.a(0.0f);
                        o a4 = j4.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a4);
                        }
                    }
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i9 + ". Must be 0 or 1.");
                }
                this.f1370a = new h2.a(this, i7);
                if (oVar != null) {
                    WeakReference weakReference3 = this.f1382p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof x.d)) {
                        dVar2 = (x.d) view2.getLayoutParams();
                    }
                    if (dVar2 == null || ((ViewGroup.MarginLayoutParams) dVar2).leftMargin <= 0) {
                        n j5 = oVar.j();
                        j5.f1880e = new g2.a(0.0f);
                        j5.h = new g2.a(0.0f);
                        o a5 = j5.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a5);
                        }
                    }
                }
            }
        }
        if (this.f1375i == null) {
            this.f1375i = new q0.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1388v);
        }
        int K = this.f1370a.K(view);
        coordinatorLayout.q(view, i4);
        this.f1379m = coordinatorLayout.getWidth();
        this.f1380n = this.f1370a.L(coordinatorLayout);
        this.f1378l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1381o = marginLayoutParams != null ? this.f1370a.c(marginLayoutParams) : 0;
        int i10 = this.h;
        if (i10 == 1 || i10 == 2) {
            i7 = K - this.f1370a.K(view);
        } else if (i10 != 3) {
            if (i10 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i7 = this.f1370a.H();
        }
        WeakHashMap weakHashMap2 = j0.f2752a;
        view.offsetLeftAndRight(i7);
        if (this.f1383q == null && (i5 = this.f1384r) != -1 && (findViewById = coordinatorLayout.findViewById(i5)) != null) {
            this.f1383q = new WeakReference(findViewById);
        }
        Iterator it = this.f1387u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // x.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // x.a
    public final void m(View view, Parcelable parcelable) {
        int i4 = ((h2.d) parcelable).h;
        if (i4 == 1 || i4 == 2) {
            i4 = 5;
        }
        this.h = i4;
    }

    @Override // x.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new h2.d(this);
    }

    @Override // x.a
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
            this.f1375i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1385s) != null) {
            velocityTracker.recycle();
            this.f1385s = null;
        }
        if (this.f1385s == null) {
            this.f1385s = VelocityTracker.obtain();
        }
        this.f1385s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1376j && s()) {
            float abs = Math.abs(this.f1386t - motionEvent.getX());
            q0.e eVar = this.f1375i;
            if (abs > eVar.f3110b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1376j;
    }

    public final void r(int i4) {
        View view;
        if (this.h == i4) {
            return;
        }
        this.h = i4;
        WeakReference weakReference = this.f1382p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i5 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i5) {
            view.setVisibility(i5);
        }
        Iterator it = this.f1387u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        if (this.f1375i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1373e.a(r4);
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
    public final void t(View view, int i4, boolean z3) {
        int G;
        if (i4 == 3) {
            G = this.f1370a.G();
        } else {
            if (i4 != 5) {
                throw new IllegalArgumentException(w0.e("Invalid state to get outer edge offset: ", i4));
            }
            G = this.f1370a.H();
        }
        q0.e eVar = this.f1375i;
        if (eVar != null) {
            if (!z3) {
                int top = view.getTop();
                eVar.f3123r = view;
                eVar.c = -1;
                boolean h = eVar.h(G, top, 0, 0);
                if (!h && eVar.f3109a == 0 && eVar.f3123r != null) {
                    eVar.f3123r = null;
                }
            }
        }
        r(i4);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1382p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        j0.j(view, 262144);
        j0.h(view, 0);
        j0.j(view, 1048576);
        j0.h(view, 0);
        final int i4 = 5;
        if (this.h != 5) {
            j0.k(view, l0.d.f2849i, new l0.o() { // from class: h2.b
                @Override // l0.o
                public final boolean d(View view2) {
                    int i5 = i4;
                    if (i5 == 1 || i5 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i5 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.f1382p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i5);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f1382p.get();
                    k kVar = new k(i5, 1, sideSheetBehavior);
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
        final int i5 = 3;
        if (this.h != 3) {
            j0.k(view, l0.d.h, new l0.o() { // from class: h2.b
                @Override // l0.o
                public final boolean d(View view2) {
                    int i52 = i5;
                    if (i52 == 1 || i52 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i52 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.f1382p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i52);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f1382p.get();
                    k kVar = new k(i52, 1, sideSheetBehavior);
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
        this.f1373e = new e(this);
        this.g = true;
        this.h = 5;
        this.f1377k = 0.1f;
        this.f1384r = -1;
        this.f1387u = new LinkedHashSet();
        this.f1388v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a.B);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = m.u(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f1372d = o.f(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1384r = resourceId;
            WeakReference weakReference = this.f1383q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1383q = null;
            WeakReference weakReference2 = this.f1382p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o oVar = this.f1372d;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f1371b = jVar;
            jVar.m(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.f1371b.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1371b.setTint(typedValue.data);
            }
        }
        this.f1374f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
