package com.google.android.material.sidesheet;

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
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.c0;
import defpackage.c20;
import defpackage.ct;
import defpackage.d20;
import defpackage.d30;
import defpackage.d7;
import defpackage.dt;
import defpackage.e70;
import defpackage.et;
import defpackage.f8;
import defpackage.g;
import defpackage.i8;
import defpackage.nd;
import defpackage.o8;
import defpackage.qd;
import defpackage.qp;
import defpackage.s0;
import defpackage.t20;
import defpackage.t8;
import defpackage.tr;
import defpackage.v0;
import defpackage.vx;
import defpackage.w2;
import defpackage.x80;
import defpackage.z80;
import defpackage.zi;
import defpackage.zr;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends nd implements tr {
    public o8 a;
    public final ct b;
    public final ColorStateList c;
    public final d20 d;
    public final i8 e;
    public final float f;
    public final boolean g;
    public int h;
    public z80 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public et t;
    public int u;
    public final LinkedHashSet v;
    public final f8 w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new i8(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new f8(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vx.F);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = e70.y(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = d20.g(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        d20 d20Var = this.d;
        if (d20Var != null) {
            ct ctVar = new ct(d20Var);
            this.b = ctVar;
            ctVar.n(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        x80.j(view, 262144);
        x80.h(view, 0);
        x80.j(view, 1048576);
        x80.h(view, 0);
        final int i = 5;
        if (this.h != 5) {
            x80.k(view, c0.i, new s0() { // from class: r20
                @Override // defpackage.s0
                public final boolean a(View view2) {
                    SideSheetBehavior.this.w(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            x80.k(view, c0.h, new s0() { // from class: r20
                @Override // defpackage.s0
                public final boolean a(View view2) {
                    SideSheetBehavior.this.w(i2);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.tr
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        et etVar = this.t;
        if (etVar == null) {
            return;
        }
        d7 d7Var = etVar.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        etVar.f = null;
        int i2 = 5;
        if (d7Var == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        o8 o8Var = this.a;
        if (o8Var != null && o8Var.H() != 0) {
            i2 = 3;
        }
        v0 v0Var = new v0(8, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int w = this.a.w(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: s20
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.a.z0(marginLayoutParams, w2.c(w, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        View view2 = etVar.b;
        boolean z = d7Var.d == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new zi(1));
        ofFloat.setDuration(w2.c(etVar.c, etVar.d, d7Var.c));
        ofFloat.addListener(new dt(etVar, z, i2));
        ofFloat.addListener(v0Var);
        ofFloat.start();
    }

    @Override // defpackage.tr
    public final void b(d7 d7Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        et etVar = this.t;
        if (etVar == null) {
            return;
        }
        o8 o8Var = this.a;
        int i = (o8Var == null || o8Var.H() == 0) ? 5 : 3;
        if (etVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        d7 d7Var2 = etVar.f;
        etVar.f = d7Var;
        if (d7Var2 != null) {
            etVar.a(d7Var.c, d7Var.d == 0, i);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.z0(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // defpackage.tr
    public final void c(d7 d7Var) {
        et etVar = this.t;
        if (etVar == null) {
            return;
        }
        etVar.f = d7Var;
    }

    @Override // defpackage.tr
    public final void d() {
        et etVar = this.t;
        if (etVar == null) {
            return;
        }
        View view = etVar.b;
        if (etVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        d7 d7Var = etVar.f;
        etVar.f = null;
        if (d7Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(etVar.e);
        animatorSet.start();
    }

    @Override // defpackage.nd
    public final void g(qd qdVar) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.nd
    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.nd
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        z80 z80Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && x80.e(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (z80Var = this.i) == null || !z80Var.o(motionEvent)) ? false : true;
    }

    @Override // defpackage.nd
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int E;
        int i2;
        View findViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        ct ctVar = this.b;
        int i4 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new et(view);
            if (ctVar != null) {
                view.setBackground(ctVar);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                ctVar.q(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = x80.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (x80.e(view) == null) {
                x80.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((qd) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        o8 o8Var = this.a;
        if (o8Var == null || o8Var.H() != i6) {
            qd qdVar = null;
            d20 d20Var = this.d;
            if (i6 == 0) {
                this.a = new qp(this, i3);
                if (d20Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof qd)) {
                        qdVar = (qd) view3.getLayoutParams();
                    }
                    if (qdVar == null || ((ViewGroup.MarginLayoutParams) qdVar).rightMargin <= 0) {
                        c20 k = d20Var.k();
                        k.f = new g(0.0f);
                        k.g = new g(0.0f);
                        d20 a = k.a();
                        if (ctVar != null) {
                            ctVar.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    t8.d(i6, ". Must be 0 or 1.", "Invalid sheet edge position value: ");
                    return false;
                }
                this.a = new qp(this, i4);
                if (d20Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof qd)) {
                        qdVar = (qd) view2.getLayoutParams();
                    }
                    if (qdVar == null || ((ViewGroup.MarginLayoutParams) qdVar).leftMargin <= 0) {
                        c20 k2 = d20Var.k();
                        k2.e = new g(0.0f);
                        k2.h = new g(0.0f);
                        d20 a2 = k2.a();
                        if (ctVar != null) {
                            ctVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new z80(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int E2 = this.a.E(view);
        coordinatorLayout.r(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.F(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.e(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            E = E2 - this.a.E(view);
        } else if (i7 == 3) {
            E = 0;
        } else {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            E = this.a.z();
        }
        WeakHashMap weakHashMap2 = x80.a;
        view.offsetLeftAndRight(E);
        if (this.q == null && (i2 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(findViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nd
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.nd
    public final void r(View view, Parcelable parcelable) {
        int i = ((t20) parcelable).h;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.nd
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new t20(this);
    }

    @Override // defpackage.nd
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.j && y()) {
            float abs = Math.abs(this.u - motionEvent.getX());
            z80 z80Var = this.i;
            if (abs > z80Var.b) {
                z80Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void w(int i) {
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                WeakReference weakReference = this.p;
                if (weakReference == null || weakReference.get() == null) {
                    x(i);
                    return;
                }
                View view = (View) this.p.get();
                zr zrVar = new zr(i, i2, this);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(zrVar);
                    return;
                } else {
                    zrVar.run();
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder("STATE_");
        sb.append(i == 1 ? "DRAGGING" : "SETTLING");
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void x(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.v.iterator();
        if (!it.hasNext()) {
            A();
        } else {
            it.next().getClass();
            t8.c();
        }
    }

    public final boolean y() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        x(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(View view, int i, boolean z) {
        int y;
        if (i == 3) {
            y = this.a.y();
        } else {
            if (i != 5) {
                t8.k(d30.e("Invalid state to get outer edge offset: ", i));
                return;
            }
            y = this.a.z();
        }
        z80 z80Var = this.i;
        if (z80Var != null) {
            if (!z) {
                int top = view.getTop();
                z80Var.r = view;
                z80Var.c = -1;
                boolean h = z80Var.h(y, top, 0, 0);
                if (!h && z80Var.a == 0 && z80Var.r != null) {
                    z80Var.r = null;
                }
            }
        }
        x(i);
    }

    public SideSheetBehavior() {
        this.e = new i8(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new f8(this, 1);
    }
}
