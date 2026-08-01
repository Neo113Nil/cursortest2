package com.google.android.material.sidesheet;

import D.o;
import G1.AbstractC0001b;
import I0.b;
import I0.i;
import I0.l;
import M.E;
import M.P;
import N.r;
import N0.g;
import N0.j;
import N0.k;
import O0.a;
import O0.d;
import O0.f;
import U.e;
import a.AbstractC0058a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.C0089b;
import b0.C0096a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.winpower.neonfit.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t0.AbstractC0383a;
import u0.AbstractC0389a;
import z.AbstractC0427a;
import z.C0430d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0427a implements b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0058a f2452a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2453b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f2454c;

    /* renamed from: d, reason: collision with root package name */
    public final k f2455d;
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2456f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2457g;

    /* renamed from: h, reason: collision with root package name */
    public int f2458h;
    public e i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2459k;

    /* renamed from: l, reason: collision with root package name */
    public int f2460l;

    /* renamed from: m, reason: collision with root package name */
    public int f2461m;

    /* renamed from: n, reason: collision with root package name */
    public int f2462n;

    /* renamed from: o, reason: collision with root package name */
    public int f2463o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f2464p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f2465q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2466r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f2467s;

    /* renamed from: t, reason: collision with root package name */
    public l f2468t;

    /* renamed from: u, reason: collision with root package name */
    public int f2469u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f2470v;

    /* renamed from: w, reason: collision with root package name */
    public final d f2471w;

    public SideSheetBehavior() {
        this.e = new f(this);
        this.f2457g = true;
        this.f2458h = 5;
        this.f2459k = 0.1f;
        this.f2466r = -1;
        this.f2470v = new LinkedHashSet();
        this.f2471w = new d(this, 0);
    }

    @Override // I0.b
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        l lVar = this.f2468t;
        if (lVar == null) {
            return;
        }
        C0089b c0089b = lVar.f584f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        lVar.f584f = null;
        int i2 = 5;
        if (c0089b == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        AbstractC0058a abstractC0058a = this.f2452a;
        if (abstractC0058a != null && abstractC0058a.E() != 0) {
            i2 = 3;
        }
        i iVar = new i(2, this);
        WeakReference weakReference = this.f2465q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int u2 = this.f2452a.u(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: O0.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.f2452a.f0(marginLayoutParams, AbstractC0389a.c(u2, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        boolean z2 = c0089b.f2155d == 0;
        WeakHashMap weakHashMap = P.f711a;
        View view2 = lVar.f581b;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z3 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f2 = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z3) {
            f2 = -f2;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f2);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new C0096a(1));
        ofFloat.setDuration(AbstractC0389a.c(lVar.f582c, lVar.f583d, c0089b.f2154c));
        ofFloat.addListener(new I0.k(lVar, z2, i2));
        ofFloat.addListener(iVar);
        ofFloat.start();
    }

    @Override // I0.b
    public final void b(C0089b c0089b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        l lVar = this.f2468t;
        if (lVar == null) {
            return;
        }
        AbstractC0058a abstractC0058a = this.f2452a;
        int i = 5;
        if (abstractC0058a != null && abstractC0058a.E() != 0) {
            i = 3;
        }
        if (lVar.f584f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0089b c0089b2 = lVar.f584f;
        lVar.f584f = c0089b;
        if (c0089b2 != null) {
            lVar.a(c0089b.f2154c, c0089b.f2155d == 0, i);
        }
        WeakReference weakReference = this.f2464p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f2464p.get();
        WeakReference weakReference2 = this.f2465q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f2452a.f0(marginLayoutParams, (int) ((view.getScaleX() * this.f2460l) + this.f2463o));
        view2.requestLayout();
    }

    @Override // I0.b
    public final void c(C0089b c0089b) {
        l lVar = this.f2468t;
        if (lVar == null) {
            return;
        }
        lVar.f584f = c0089b;
    }

    @Override // I0.b
    public final void d() {
        l lVar = this.f2468t;
        if (lVar == null) {
            return;
        }
        if (lVar.f584f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0089b c0089b = lVar.f584f;
        lVar.f584f = null;
        if (c0089b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = lVar.f581b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(lVar.e);
        animatorSet.start();
    }

    @Override // z.AbstractC0427a
    public final void g(C0430d c0430d) {
        this.f2464p = null;
        this.i = null;
        this.f2468t = null;
    }

    @Override // z.AbstractC0427a
    public final void i() {
        this.f2464p = null;
        this.i = null;
        this.f2468t = null;
    }

    @Override // z.AbstractC0427a
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && P.d(view) == null) || !this.f2457g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2467s) != null) {
            velocityTracker.recycle();
            this.f2467s = null;
        }
        if (this.f2467s == null) {
            this.f2467s = VelocityTracker.obtain();
        }
        this.f2467s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2469u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // z.AbstractC0427a
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f2453b;
        WeakHashMap weakHashMap = P.f711a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2464p == null) {
            this.f2464p = new WeakReference(view);
            this.f2468t = new l(view);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f2456f;
                if (f2 == -1.0f) {
                    f2 = E.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f2454c;
                if (colorStateList != null) {
                    E.q(view, colorStateList);
                }
            }
            int i5 = this.f2458h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (P.d(view) == null) {
                P.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C0430d) view.getLayoutParams()).f4770c, i) == 3 ? 1 : 0;
        AbstractC0058a abstractC0058a = this.f2452a;
        if (abstractC0058a == null || abstractC0058a.E() != i6) {
            k kVar = this.f2455d;
            C0430d c0430d = null;
            if (i6 == 0) {
                this.f2452a = new a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f2464p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0430d)) {
                        c0430d = (C0430d) view3.getLayoutParams();
                    }
                    if (c0430d == null || ((ViewGroup.MarginLayoutParams) c0430d).rightMargin <= 0) {
                        j e = kVar.e();
                        e.f924f = new N0.a(0.0f);
                        e.f925g = new N0.a(0.0f);
                        k a2 = e.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f2452a = new a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f2464p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0430d)) {
                        c0430d = (C0430d) view2.getLayoutParams();
                    }
                    if (c0430d == null || ((ViewGroup.MarginLayoutParams) c0430d).leftMargin <= 0) {
                        j e2 = kVar.e();
                        e2.e = new N0.a(0.0f);
                        e2.f926h = new N0.a(0.0f);
                        k a3 = e2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2471w);
        }
        int B2 = this.f2452a.B(view);
        coordinatorLayout.q(view, i);
        this.f2461m = coordinatorLayout.getWidth();
        this.f2462n = this.f2452a.C(coordinatorLayout);
        this.f2460l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2463o = marginLayoutParams != null ? this.f2452a.e(marginLayoutParams) : 0;
        int i7 = this.f2458h;
        if (i7 == 1 || i7 == 2) {
            i3 = B2 - this.f2452a.B(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f2458h);
            }
            i3 = this.f2452a.w();
        }
        view.offsetLeftAndRight(i3);
        if (this.f2465q == null && (i2 = this.f2466r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f2465q = new WeakReference(findViewById);
        }
        Iterator it = this.f2470v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // z.AbstractC0427a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // z.AbstractC0427a
    public final void q(View view, Parcelable parcelable) {
        int i = ((O0.e) parcelable).f981c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f2458h = i;
    }

    @Override // z.AbstractC0427a
    public final Parcelable r(View view) {
        return new O0.e(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // z.AbstractC0427a
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2458h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2467s) != null) {
            velocityTracker.recycle();
            this.f2467s = null;
        }
        if (this.f2467s == null) {
            this.f2467s = VelocityTracker.obtain();
        }
        this.f2467s.addMovement(motionEvent);
        if (x() && actionMasked == 2 && !this.j && x()) {
            float abs = Math.abs(this.f2469u - motionEvent.getX());
            e eVar = this.i;
            if (abs > eVar.f1212b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void v(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0001b.g(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f2464p;
        if (weakReference == null || weakReference.get() == null) {
            w(i);
            return;
        }
        View view = (View) this.f2464p.get();
        o oVar = new o(this, i, 1);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = P.f711a;
            if (view.isAttachedToWindow()) {
                view.post(oVar);
                return;
            }
        }
        oVar.run();
    }

    public final void w(int i) {
        View view;
        if (this.f2458h == i) {
            return;
        }
        this.f2458h = i;
        WeakReference weakReference = this.f2464p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f2458h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f2470v.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        z();
    }

    public final boolean x() {
        return this.i != null && (this.f2457g || this.f2458h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        w(2);
        r2.e.a(r4);
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
    public final void y(View view, int i, boolean z2) {
        int v2;
        if (i == 3) {
            v2 = this.f2452a.v();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC0001b.e("Invalid state to get outer edge offset: ", i));
            }
            v2 = this.f2452a.w();
        }
        e eVar = this.i;
        if (eVar != null) {
            if (!z2) {
                int top = view.getTop();
                eVar.f1225r = view;
                eVar.f1213c = -1;
                boolean h2 = eVar.h(v2, top, 0, 0);
                if (!h2 && eVar.f1211a == 0 && eVar.f1225r != null) {
                    eVar.f1225r = null;
                }
            }
        }
        w(i);
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.f2464p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        P.i(view, 262144);
        P.g(view, 0);
        P.i(view, 1048576);
        P.g(view, 0);
        final int i = 5;
        if (this.f2458h != 5) {
            P.j(view, N.d.j, new r() { // from class: O0.b
                @Override // N.r
                public final boolean b(View view2) {
                    SideSheetBehavior.this.v(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f2458h != 3) {
            P.j(view, N.d.f870h, new r() { // from class: O0.b
                @Override // N.r
                public final boolean b(View view2) {
                    SideSheetBehavior.this.v(i2);
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new f(this);
        this.f2457g = true;
        this.f2458h = 5;
        this.f2459k = 0.1f;
        this.f2466r = -1;
        this.f2470v = new LinkedHashSet();
        this.f2471w = new d(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0383a.f4166w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2454c = H1.d.C(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f2455d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2466r = resourceId;
            WeakReference weakReference = this.f2465q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2465q = null;
            WeakReference weakReference2 = this.f2464p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = P.f711a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f2455d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2453b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2454c;
            if (colorStateList != null) {
                this.f2453b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2453b.setTint(typedValue.data);
            }
        }
        this.f2456f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2457g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
