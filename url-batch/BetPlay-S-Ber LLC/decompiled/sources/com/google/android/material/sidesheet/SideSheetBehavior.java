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
import com.awerser.monnit.betplay.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.c0;
import defpackage.cq;
import defpackage.e30;
import defpackage.e90;
import defpackage.f30;
import defpackage.g;
import defpackage.g30;
import defpackage.gs;
import defpackage.h90;
import defpackage.ly;
import defpackage.m20;
import defpackage.n20;
import defpackage.ns;
import defpackage.o3;
import defpackage.o30;
import defpackage.o8;
import defpackage.op;
import defpackage.r7;
import defpackage.rd;
import defpackage.rt;
import defpackage.si;
import defpackage.st;
import defpackage.t0;
import defpackage.tt;
import defpackage.ud;
import defpackage.vw;
import defpackage.x0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends rd implements gs {
    public vw a;
    public final rt b;
    public final ColorStateList c;
    public final n20 d;
    public final g30 e;
    public final float f;
    public final boolean g;
    public int h;
    public h90 i;
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
    public tt t;
    public int u;
    public final LinkedHashSet v;
    public final e30 w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new g30(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new e30(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.G);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = op.x(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = n20.g(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
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
        n20 n20Var = this.d;
        if (n20Var != null) {
            rt rtVar = new rt(n20Var);
            this.b = rtVar;
            rtVar.n(context);
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

    @Override // defpackage.gs
    public final void cancelBackProgress() {
        tt ttVar = this.t;
        if (ttVar == null) {
            return;
        }
        View view = ttVar.b;
        if (ttVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        r7 r7Var = ttVar.f;
        ttVar.f = null;
        if (r7Var == null) {
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
        animatorSet.setDuration(ttVar.e);
        animatorSet.start();
    }

    @Override // defpackage.gs
    public final void handleBackInvoked() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        tt ttVar = this.t;
        if (ttVar == null) {
            return;
        }
        r7 r7Var = ttVar.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        ttVar.f = null;
        int i2 = 5;
        if (r7Var == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
            return;
        }
        vw vwVar = this.a;
        if (vwVar != null && vwVar.J() != 0) {
            i2 = 3;
        }
        x0 x0Var = new x0(7, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int z = this.a.z(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: d30
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.a.p0(marginLayoutParams, o3.c(z, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        View view2 = ttVar.b;
        boolean z2 = r7Var.d == 0;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z3 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z3) {
            f = -f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new si(1));
        ofFloat.setDuration(o3.c(ttVar.c, ttVar.d, r7Var.c));
        ofFloat.addListener(new st(ttVar, z2, i2));
        ofFloat.addListener(x0Var);
        ofFloat.start();
    }

    @Override // defpackage.rd
    public final void onAttachedToLayoutParams(ud udVar) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.rd
    public final void onDetachedFromLayoutParams() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.rd
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        h90 h90Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && e90.e(view) == null) || !this.g) {
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
        return (this.j || (h90Var = this.i) == null || !h90Var.o(motionEvent)) ? false : true;
    }

    @Override // defpackage.rd
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int H;
        int i2;
        View findViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        rt rtVar = this.b;
        int i4 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new tt(view);
            if (rtVar != null) {
                view.setBackground(rtVar);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                rtVar.q(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = e90.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            updateAccessibilityActions();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (e90.e(view) == null) {
                e90.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((ud) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        vw vwVar = this.a;
        if (vwVar == null || vwVar.J() != i6) {
            ud udVar = null;
            n20 n20Var = this.d;
            if (i6 == 0) {
                this.a = new cq(this, i3);
                if (n20Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof ud)) {
                        udVar = (ud) view3.getLayoutParams();
                    }
                    if (udVar == null || ((ViewGroup.MarginLayoutParams) udVar).rightMargin <= 0) {
                        m20 k = n20Var.k();
                        k.f = new g(0.0f);
                        k.g = new g(0.0f);
                        n20 a = k.a();
                        if (rtVar != null) {
                            rtVar.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    o8.d(i6, ". Must be 0 or 1.", "Invalid sheet edge position value: ");
                    return false;
                }
                this.a = new cq(this, i4);
                if (n20Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof ud)) {
                        udVar = (ud) view2.getLayoutParams();
                    }
                    if (udVar == null || ((ViewGroup.MarginLayoutParams) udVar).leftMargin <= 0) {
                        m20 k2 = n20Var.k();
                        k2.e = new g(0.0f);
                        k2.h = new g(0.0f);
                        n20 a2 = k2.a();
                        if (rtVar != null) {
                            rtVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new h90(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int H2 = this.a.H(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.I(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.i(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            H = H2 - this.a.H(view);
        } else if (i7 == 3) {
            H = 0;
        } else {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            H = this.a.C();
        }
        WeakHashMap weakHashMap2 = e90.a;
        view.offsetLeftAndRight(H);
        if (this.q == null && (i2 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(findViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rd
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.rd
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f30 f30Var = (f30) parcelable;
        if (f30Var.getSuperState() != null) {
            f30Var.getSuperState();
        }
        int i = f30Var.f;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.rd
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new f30(this);
    }

    @Override // defpackage.rd
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
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
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.j && shouldHandleDraggingWithHelper()) {
            float abs = Math.abs(this.u - motionEvent.getX());
            h90 h90Var = this.i;
            if (abs > h90Var.b) {
                h90Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void setState(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
            return;
        }
        View view = (View) this.p.get();
        ns nsVar = new ns(i, 2, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(nsVar);
        } else {
            nsVar.run();
        }
    }

    public final void setStateInternal(int i) {
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
            updateAccessibilityActions();
        } else {
            it.next().getClass();
            o8.c();
        }
    }

    public final boolean shouldHandleDraggingWithHelper() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    @Override // defpackage.gs
    public final void startBackProgress(r7 r7Var) {
        tt ttVar = this.t;
        if (ttVar == null) {
            return;
        }
        ttVar.f = r7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        setStateInternal(2);
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
    public final void startSettling(View view, int i, boolean z) {
        int A;
        if (i == 3) {
            A = this.a.A();
        } else {
            if (i != 5) {
                o8.j(o30.e("Invalid state to get outer edge offset: ", i));
                return;
            }
            A = this.a.C();
        }
        h90 h90Var = this.i;
        if (h90Var != null) {
            if (!z) {
                int top = view.getTop();
                h90Var.r = view;
                h90Var.c = -1;
                boolean h = h90Var.h(A, top, 0, 0);
                if (!h && h90Var.a == 0 && h90Var.r != null) {
                    h90Var.r = null;
                }
            }
        }
        setStateInternal(i);
    }

    public final void updateAccessibilityActions() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        e90.j(view, 262144);
        e90.h(view, 0);
        e90.j(view, 1048576);
        e90.h(view, 0);
        final int i = 5;
        if (this.h != 5) {
            e90.k(view, c0.i, null, new t0() { // from class: c30
                @Override // defpackage.t0
                public final boolean perform(View view2, l0 l0Var) {
                    SideSheetBehavior.this.setState(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            e90.k(view, c0.h, null, new t0() { // from class: c30
                @Override // defpackage.t0
                public final boolean perform(View view2, l0 l0Var) {
                    SideSheetBehavior.this.setState(i2);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.gs
    public final void updateBackProgress(r7 r7Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        tt ttVar = this.t;
        if (ttVar == null) {
            return;
        }
        vw vwVar = this.a;
        int i = (vwVar == null || vwVar.J() == 0) ? 5 : 3;
        if (ttVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        r7 r7Var2 = ttVar.f;
        ttVar.f = r7Var;
        if (r7Var2 != null) {
            ttVar.a(r7Var.c, r7Var.d == 0, i);
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
        this.a.p0(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    public SideSheetBehavior() {
        this.e = new g30(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new e30(this);
    }
}
