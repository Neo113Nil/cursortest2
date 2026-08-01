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
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.moontiko.really.admiralcasino.R;
import defpackage.av;
import defpackage.cs;
import defpackage.dw;
import defpackage.e0;
import defpackage.e50;
import defpackage.ew;
import defpackage.f50;
import defpackage.f60;
import defpackage.fw;
import defpackage.g;
import defpackage.g3;
import defpackage.g9;
import defpackage.hl;
import defpackage.ic0;
import defpackage.kc0;
import defpackage.kr;
import defpackage.la0;
import defpackage.n7;
import defpackage.oe;
import defpackage.re;
import defpackage.t0;
import defpackage.t8;
import defpackage.uu;
import defpackage.v50;
import defpackage.w0;
import defpackage.w8;
import defpackage.y00;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends oe implements uu {
    public la0 a;
    public final dw b;
    public final ColorStateList c;
    public final f50 d;
    public final w8 e;
    public final float f;
    public final boolean g;
    public int h;
    public kc0 i;
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
    public fw t;
    public int u;
    public final LinkedHashSet v;
    public final t8 w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new w8(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new t8(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.I);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = kr.w(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = f50.g(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
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
        f50 f50Var = this.d;
        if (f50Var != null) {
            dw dwVar = new dw(f50Var);
            this.b = dwVar;
            dwVar.n(context);
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
        ic0.j(view, 262144);
        ic0.h(view, 0);
        ic0.j(view, 1048576);
        ic0.h(view, 0);
        final int i = 5;
        if (this.h != 5) {
            ic0.k(view, e0.i, new t0() { // from class: t50
                @Override // defpackage.t0
                public final boolean a(View view2) {
                    SideSheetBehavior.this.w(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            ic0.k(view, e0.h, new t0() { // from class: t50
                @Override // defpackage.t0
                public final boolean a(View view2) {
                    SideSheetBehavior.this.w(i2);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.uu
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        fw fwVar = this.t;
        if (fwVar == null) {
            return;
        }
        n7 n7Var = fwVar.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        fwVar.f = null;
        int i2 = 5;
        if (n7Var == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        la0 la0Var = this.a;
        if (la0Var != null && la0Var.G() != 0) {
            i2 = 3;
        }
        w0 w0Var = new w0(7, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int x = this.a.x(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: u50
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.a.g0(marginLayoutParams, g3.c(x, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        View view2 = fwVar.b;
        boolean z = n7Var.d == 0;
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
        ofFloat.setInterpolator(new hl(1));
        ofFloat.setDuration(g3.c(fwVar.c, fwVar.d, n7Var.c));
        ofFloat.addListener(new ew(fwVar, z, i2));
        ofFloat.addListener(w0Var);
        ofFloat.start();
    }

    @Override // defpackage.uu
    public final void b(n7 n7Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        fw fwVar = this.t;
        if (fwVar == null) {
            return;
        }
        la0 la0Var = this.a;
        int i = (la0Var == null || la0Var.G() == 0) ? 5 : 3;
        if (fwVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        n7 n7Var2 = fwVar.f;
        fwVar.f = n7Var;
        if (n7Var2 != null) {
            fwVar.a(n7Var.c, n7Var.d == 0, i);
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
        this.a.g0(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // defpackage.uu
    public final void c(n7 n7Var) {
        fw fwVar = this.t;
        if (fwVar == null) {
            return;
        }
        fwVar.f = n7Var;
    }

    @Override // defpackage.uu
    public final void d() {
        fw fwVar = this.t;
        if (fwVar == null) {
            return;
        }
        View view = fwVar.b;
        if (fwVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        n7 n7Var = fwVar.f;
        fwVar.f = null;
        if (n7Var == null) {
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
        animatorSet.setDuration(fwVar.e);
        animatorSet.start();
    }

    @Override // defpackage.oe
    public final void g(re reVar) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.oe
    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.oe
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        kc0 kc0Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && ic0.e(view) == null) || !this.g) {
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
        return (this.j || (kc0Var = this.i) == null || !kc0Var.o(motionEvent)) ? false : true;
    }

    @Override // defpackage.oe
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
        dw dwVar = this.b;
        int i4 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new fw(view);
            if (dwVar != null) {
                view.setBackground(dwVar);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                dwVar.q(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = ic0.a;
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
            if (ic0.e(view) == null) {
                ic0.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((re) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        la0 la0Var = this.a;
        if (la0Var == null || la0Var.G() != i6) {
            re reVar = null;
            f50 f50Var = this.d;
            if (i6 == 0) {
                this.a = new cs(this, i3);
                if (f50Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof re)) {
                        reVar = (re) view3.getLayoutParams();
                    }
                    if (reVar == null || ((ViewGroup.MarginLayoutParams) reVar).rightMargin <= 0) {
                        e50 k = f50Var.k();
                        k.f = new g(0.0f);
                        k.g = new g(0.0f);
                        f50 a = k.a();
                        if (dwVar != null) {
                            dwVar.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    g9.c(i6, ". Must be 0 or 1.", "Invalid sheet edge position value: ");
                    return false;
                }
                this.a = new cs(this, i4);
                if (f50Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof re)) {
                        reVar = (re) view2.getLayoutParams();
                    }
                    if (reVar == null || ((ViewGroup.MarginLayoutParams) reVar).leftMargin <= 0) {
                        e50 k2 = f50Var.k();
                        k2.e = new g(0.0f);
                        k2.h = new g(0.0f);
                        f50 a2 = k2.a();
                        if (dwVar != null) {
                            dwVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new kc0(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int E2 = this.a.E(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.F(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.h(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            E = E2 - this.a.E(view);
        } else if (i7 == 3) {
            E = 0;
        } else {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            E = this.a.A();
        }
        WeakHashMap weakHashMap2 = ic0.a;
        view.offsetLeftAndRight(E);
        if (this.q == null && (i2 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(findViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.oe
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.oe
    public final void r(View view, Parcelable parcelable) {
        int i = ((v50) parcelable).h;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.oe
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new v50(this);
    }

    @Override // defpackage.oe
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
            kc0 kc0Var = this.i;
            if (abs > kc0Var.b) {
                kc0Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void w(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        View view = (View) this.p.get();
        av avVar = new av(i, 2, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(avVar);
        } else {
            avVar.run();
        }
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
            g9.b();
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
        int z2;
        if (i == 3) {
            z2 = this.a.z();
        } else {
            if (i != 5) {
                g9.i(f60.e("Invalid state to get outer edge offset: ", i));
                return;
            }
            z2 = this.a.A();
        }
        kc0 kc0Var = this.i;
        if (kc0Var != null) {
            if (!z) {
                int top = view.getTop();
                kc0Var.r = view;
                kc0Var.c = -1;
                boolean h = kc0Var.h(z2, top, 0, 0);
                if (!h && kc0Var.a == 0 && kc0Var.r != null) {
                    kc0Var.r = null;
                }
            }
        }
        x(i);
    }

    public SideSheetBehavior() {
        this.e = new w8(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new t8(this, 1);
    }
}
