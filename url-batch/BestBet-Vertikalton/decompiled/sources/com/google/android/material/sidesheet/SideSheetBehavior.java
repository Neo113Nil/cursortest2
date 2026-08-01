package com.google.android.material.sidesheet;

import B.o;
import C0.j;
import G1.AbstractC0001b;
import H1.d;
import H1.l;
import K.F;
import K.Q;
import L.s;
import M.a;
import R0.g;
import R0.k;
import S0.c;
import T.e;
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
import com.fortunequest.neontrack.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import x.AbstractC0392a;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0392a {

    /* renamed from: a, reason: collision with root package name */
    public d f2338a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2339b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f2340c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2341e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2342f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2343g;
    public int h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2344j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2345k;

    /* renamed from: l, reason: collision with root package name */
    public int f2346l;

    /* renamed from: m, reason: collision with root package name */
    public int f2347m;

    /* renamed from: n, reason: collision with root package name */
    public int f2348n;

    /* renamed from: o, reason: collision with root package name */
    public int f2349o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f2350p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f2351q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2352r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f2353s;

    /* renamed from: t, reason: collision with root package name */
    public int f2354t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f2355u;

    /* renamed from: v, reason: collision with root package name */
    public final C0.e f2356v;

    public SideSheetBehavior() {
        this.f2341e = new j(this);
        this.f2343g = true;
        this.h = 5;
        this.f2345k = 0.1f;
        this.f2352r = -1;
        this.f2355u = new LinkedHashSet();
        this.f2356v = new C0.e(this, 1);
    }

    @Override // x.AbstractC0392a
    public final void c(x.d dVar) {
        this.f2350p = null;
        this.i = null;
    }

    @Override // x.AbstractC0392a
    public final void e() {
        this.f2350p = null;
        this.i = null;
    }

    @Override // x.AbstractC0392a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && Q.d(view) == null) || !this.f2343g) {
            this.f2344j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2353s) != null) {
            velocityTracker.recycle();
            this.f2353s = null;
        }
        if (this.f2353s == null) {
            this.f2353s = VelocityTracker.obtain();
        }
        this.f2353s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2354t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2344j) {
            this.f2344j = false;
            return false;
        }
        return (this.f2344j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // x.AbstractC0392a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f2339b;
        WeakHashMap weakHashMap = Q.f578a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2350p == null) {
            this.f2350p = new WeakReference(view);
            Context context = view.getContext();
            l.c0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(RecyclerView.f1937A0, RecyclerView.f1937A0, RecyclerView.f1937A0, 1.0f));
            l.b0(context, R.attr.motionDurationMedium2, 300);
            l.b0(context, R.attr.motionDurationShort3, 150);
            l.b0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f2342f;
                if (f2 == -1.0f) {
                    f2 = F.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f2340c;
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
        int i6 = Gravity.getAbsoluteGravity(((x.d) view.getLayoutParams()).f4527c, i) == 3 ? 1 : 0;
        d dVar = this.f2338a;
        if (dVar == null || dVar.H() != i6) {
            k kVar = this.d;
            x.d dVar2 = null;
            if (i6 == 0) {
                this.f2338a = new S0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f2350p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof x.d)) {
                        dVar2 = (x.d) view3.getLayoutParams();
                    }
                    if (dVar2 == null || ((ViewGroup.MarginLayoutParams) dVar2).rightMargin <= 0) {
                        R0.j e2 = kVar.e();
                        e2.f941f = new R0.a(RecyclerView.f1937A0);
                        e2.f942g = new R0.a(RecyclerView.f1937A0);
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
                this.f2338a = new S0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f2350p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof x.d)) {
                        dVar2 = (x.d) view2.getLayoutParams();
                    }
                    if (dVar2 == null || ((ViewGroup.MarginLayoutParams) dVar2).leftMargin <= 0) {
                        R0.j e3 = kVar.e();
                        e3.f940e = new R0.a(RecyclerView.f1937A0);
                        e3.h = new R0.a(RecyclerView.f1937A0);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2356v);
        }
        int F = this.f2338a.F(view);
        coordinatorLayout.q(view, i);
        this.f2347m = coordinatorLayout.getWidth();
        this.f2348n = this.f2338a.G(coordinatorLayout);
        this.f2346l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2349o = marginLayoutParams != null ? this.f2338a.f(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i3 = F - this.f2338a.F(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.f2338a.C();
        }
        view.offsetLeftAndRight(i3);
        if (this.f2351q == null && (i2 = this.f2352r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f2351q = new WeakReference(findViewById);
        }
        Iterator it = this.f2355u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // x.AbstractC0392a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0392a
    public final void m(View view, Parcelable parcelable) {
        int i = ((c) parcelable).f991c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // x.AbstractC0392a
    public final Parcelable n(View view) {
        return new c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0392a
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
        if (actionMasked == 0 && (velocityTracker = this.f2353s) != null) {
            velocityTracker.recycle();
            this.f2353s = null;
        }
        if (this.f2353s == null) {
            this.f2353s = VelocityTracker.obtain();
        }
        this.f2353s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f2344j && s()) {
            float abs = Math.abs(this.f2354t - motionEvent.getX());
            e eVar = this.i;
            if (abs > eVar.f1009b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2344j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f2350p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f2355u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f2343g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f2341e.a(r4);
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
        int B2;
        if (i == 3) {
            B2 = this.f2338a.B();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC0001b.f("Invalid state to get outer edge offset: ", i));
            }
            B2 = this.f2338a.C();
        }
        e eVar = this.i;
        if (eVar != null) {
            if (!z2) {
                int top = view.getTop();
                eVar.f1022r = view;
                eVar.f1010c = -1;
                boolean h = eVar.h(B2, top, 0, 0);
                if (!h && eVar.f1008a == 0 && eVar.f1022r != null) {
                    eVar.f1022r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f2350p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Q.i(view, 262144);
        Q.g(view, 0);
        Q.i(view, 1048576);
        Q.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            Q.j(view, L.e.f690j, new s() { // from class: S0.b
                @Override // L.s
                public final boolean g(View view2) {
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
                    WeakReference weakReference2 = sideSheetBehavior.f2350p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2350p.get();
                        o oVar = new o(sideSheetBehavior, i3, i2);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = Q.f578a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(oVar);
                            }
                        }
                        oVar.run();
                    }
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            Q.j(view, L.e.h, new s() { // from class: S0.b
                @Override // L.s
                public final boolean g(View view2) {
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
                    WeakReference weakReference2 = sideSheetBehavior.f2350p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2350p.get();
                        o oVar = new o(sideSheetBehavior, i3, i22);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = Q.f578a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(oVar);
                            }
                        }
                        oVar.run();
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f2341e = new j(this);
        this.f2343g = true;
        this.h = 5;
        this.f2345k = 0.1f;
        this.f2352r = -1;
        this.f2355u = new LinkedHashSet();
        this.f2356v = new C0.e(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0393a.f4562w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2340c = l.B(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2352r = resourceId;
            WeakReference weakReference = this.f2351q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2351q = null;
            WeakReference weakReference2 = this.f2350p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = Q.f578a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2339b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2340c;
            if (colorStateList != null) {
                this.f2339b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2339b.setTint(typedValue.data);
            }
        }
        this.f2342f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2343g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
