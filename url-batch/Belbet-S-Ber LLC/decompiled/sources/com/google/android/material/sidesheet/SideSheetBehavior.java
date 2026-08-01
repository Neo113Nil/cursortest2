package com.google.android.material.sidesheet;

import a0.c;
import a0.f;
import a4.b;
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
import b4.l;
import com.gdmhkmf.belbet.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e0.k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.p0;
import o0.p;
import o2.j;
import o2.n;
import o2.o;
import p2.a;
import p2.d;
import p2.e;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends c {

    /* renamed from: a, reason: collision with root package name */
    public l f1177a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1178b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1179c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1180e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1181f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1182g;
    public int h;
    public u0.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1183j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1184k;

    /* renamed from: l, reason: collision with root package name */
    public int f1185l;

    /* renamed from: m, reason: collision with root package name */
    public int f1186m;

    /* renamed from: n, reason: collision with root package name */
    public int f1187n;

    /* renamed from: o, reason: collision with root package name */
    public int f1188o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1189p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1190q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1191r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1192s;

    /* renamed from: t, reason: collision with root package name */
    public int f1193t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1194u;

    /* renamed from: v, reason: collision with root package name */
    public final p2.c f1195v;

    public SideSheetBehavior() {
        this.f1180e = new e(this);
        this.f1182g = true;
        this.h = 5;
        this.f1184k = 0.1f;
        this.f1191r = -1;
        this.f1194u = new LinkedHashSet();
        this.f1195v = new p2.c(this, 0);
    }

    @Override // a0.c
    public final void c(f fVar) {
        this.f1189p = null;
        this.i = null;
    }

    @Override // a0.c
    public final void e() {
        this.f1189p = null;
        this.i = null;
    }

    @Override // a0.c
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        u0.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && p0.e(view) == null) || !this.f1182g) {
            this.f1183j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1192s) != null) {
            velocityTracker.recycle();
            this.f1192s = null;
        }
        if (this.f1192s == null) {
            this.f1192s = VelocityTracker.obtain();
        }
        this.f1192s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1193t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1183j) {
            this.f1183j = false;
            return false;
        }
        return (this.f1183j || (eVar = this.i) == null || !eVar.o(motionEvent)) ? false : true;
    }

    @Override // a0.c
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i4;
        View findViewById;
        int i5 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f1189p;
        j jVar = this.f1178b;
        int i6 = 0;
        if (weakReference == null) {
            this.f1189p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            l.V(context, R.attr.motionDurationMedium2, 300);
            l.V(context, R.attr.motionDurationShort3, 150);
            l.V(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (jVar != null) {
                view.setBackground(jVar);
                float f5 = this.f1181f;
                if (f5 == -1.0f) {
                    f5 = view.getElevation();
                }
                jVar.q(f5);
            } else {
                ColorStateList colorStateList = this.f1179c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = p0.f2816a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i7 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (p0.e(view) == null) {
                p0.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i8 = Gravity.getAbsoluteGravity(((f) view.getLayoutParams()).f83c, i) == 3 ? 1 : 0;
        l lVar = this.f1177a;
        if (lVar == null || lVar.F() != i8) {
            f fVar = null;
            o oVar = this.d;
            if (i8 == 0) {
                this.f1177a = new a(this, i5);
                if (oVar != null) {
                    WeakReference weakReference2 = this.f1189p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof f)) {
                        fVar = (f) view3.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).rightMargin <= 0) {
                        n k4 = oVar.k();
                        k4.f2978f = new o2.a(0.0f);
                        k4.f2979g = new o2.a(0.0f);
                        o a5 = k4.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a5);
                        }
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i8 + ". Must be 0 or 1.");
                }
                this.f1177a = new a(this, i6);
                if (oVar != null) {
                    WeakReference weakReference3 = this.f1189p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof f)) {
                        fVar = (f) view2.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).leftMargin <= 0) {
                        n k5 = oVar.k();
                        k5.f2977e = new o2.a(0.0f);
                        k5.h = new o2.a(0.0f);
                        o a6 = k5.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a6);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new u0.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1195v);
        }
        int C = this.f1177a.C(view);
        coordinatorLayout.q(view, i);
        this.f1186m = coordinatorLayout.getWidth();
        this.f1187n = this.f1177a.D(coordinatorLayout);
        this.f1185l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1188o = marginLayoutParams != null ? this.f1177a.d(marginLayoutParams) : 0;
        int i9 = this.h;
        if (i9 == 1 || i9 == 2) {
            i6 = C - this.f1177a.C(view);
        } else if (i9 != 3) {
            if (i9 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i6 = this.f1177a.x();
        }
        WeakHashMap weakHashMap2 = p0.f2816a;
        view.offsetLeftAndRight(i6);
        if (this.f1190q == null && (i4 = this.f1191r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f1190q = new WeakReference(findViewById);
        }
        Iterator it = this.f1194u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // a0.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // a0.c
    public final void m(View view, Parcelable parcelable) {
        int i = ((d) parcelable).h;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // a0.c
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d(this);
    }

    @Override // a0.c
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
            this.i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1192s) != null) {
            velocityTracker.recycle();
            this.f1192s = null;
        }
        if (this.f1192s == null) {
            this.f1192s = VelocityTracker.obtain();
        }
        this.f1192s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1183j && s()) {
            float abs = Math.abs(this.f1193t - motionEvent.getX());
            u0.e eVar = this.i;
            if (abs > eVar.f3558b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1183j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f1189p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i4) {
            view.setVisibility(i4);
        }
        Iterator it = this.f1194u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.f1182g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1180e.a(r4);
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
    public final void t(View view, int i, boolean z4) {
        int w4;
        if (i == 3) {
            w4 = this.f1177a.w();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(b.f("Invalid state to get outer edge offset: ", i));
            }
            w4 = this.f1177a.x();
        }
        u0.e eVar = this.i;
        if (eVar != null) {
            if (!z4) {
                int top = view.getTop();
                eVar.f3571r = view;
                eVar.f3559c = -1;
                boolean h = eVar.h(w4, top, 0, 0);
                if (!h && eVar.f3557a == 0 && eVar.f3571r != null) {
                    eVar.f3571r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1189p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        p0.j(view, 262144);
        p0.h(view, 0);
        p0.j(view, 1048576);
        p0.h(view, 0);
        final int i = 5;
        if (this.h != 5) {
            p0.k(view, o0.c.i, new p() { // from class: p2.b
                @Override // o0.p
                public final boolean a(View view2) {
                    int i4 = i;
                    if (i4 == 1 || i4 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i4 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.f1189p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i4);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f1189p.get();
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
        if (this.h != 3) {
            p0.k(view, o0.c.h, new p() { // from class: p2.b
                @Override // o0.p
                public final boolean a(View view2) {
                    int i42 = i4;
                    if (i42 == 1 || i42 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i42 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.f1189p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i42);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f1189p.get();
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
        this.f1180e = new e(this);
        this.f1182g = true;
        this.h = 5;
        this.f1184k = 0.1f;
        this.f1191r = -1;
        this.f1194u = new LinkedHashSet();
        this.f1195v = new p2.c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.a.G);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1179c = l.r(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = o.g(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1191r = resourceId;
            WeakReference weakReference = this.f1190q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1190q = null;
            WeakReference weakReference2 = this.f1189p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o oVar = this.d;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f1178b = jVar;
            jVar.n(context);
            ColorStateList colorStateList = this.f1179c;
            if (colorStateList != null) {
                this.f1178b.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1178b.setTint(typedValue.data);
            }
        }
        this.f1181f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1182g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
