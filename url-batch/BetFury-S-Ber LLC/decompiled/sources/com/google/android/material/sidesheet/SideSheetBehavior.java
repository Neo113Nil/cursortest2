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
import com.trembin.nirefon.betfury.R;
import defpackage.ax;
import defpackage.c70;
import defpackage.f00;
import defpackage.f9;
import defpackage.fd0;
import defpackage.g;
import defpackage.g0;
import defpackage.g10;
import defpackage.gd0;
import defpackage.h10;
import defpackage.hg;
import defpackage.hm0;
import defpackage.ho;
import defpackage.i10;
import defpackage.i9;
import defpackage.jm0;
import defpackage.kg;
import defpackage.mv;
import defpackage.o3;
import defpackage.r7;
import defpackage.s9;
import defpackage.ud0;
import defpackage.w0;
import defpackage.yd0;
import defpackage.z0;
import defpackage.z7;
import defpackage.zz;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends hg implements zz {
    public ud0 a;
    public final g10 b;
    public final ColorStateList c;
    public final gd0 d;
    public final i9 e;
    public final float f;
    public final boolean g;
    public int h;
    public jm0 i;
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
    public i10 t;
    public int u;
    public final LinkedHashSet v;
    public final f9 w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new i9(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new f9(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c70.H);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = mv.r(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = gd0.g(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
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
        gd0 gd0Var = this.d;
        if (gd0Var != null) {
            g10 g10Var = new g10(gd0Var);
            this.b = g10Var;
            g10Var.n(context);
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
        hm0.j(view, 262144);
        hm0.h(view, 0);
        hm0.j(view, 1048576);
        hm0.h(view, 0);
        final int i = 5;
        if (this.h != 5) {
            hm0.k(view, g0.i, new w0() { // from class: wd0
                @Override // defpackage.w0
                public final boolean b(View view2) {
                    SideSheetBehavior.this.w(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            hm0.k(view, g0.h, new w0() { // from class: wd0
                @Override // defpackage.w0
                public final boolean b(View view2) {
                    SideSheetBehavior.this.w(i2);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.zz
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        i10 i10Var = this.t;
        if (i10Var == null) {
            return;
        }
        z7 z7Var = i10Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        i10Var.f = null;
        int i2 = 5;
        if (z7Var == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        ud0 ud0Var = this.a;
        if (ud0Var != null && ud0Var.p() != 0) {
            i2 = 3;
        }
        z0 z0Var = new z0(8, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int i3 = this.a.i(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: xd0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.a.C(marginLayoutParams, o3.c(i3, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        View view2 = i10Var.b;
        boolean z = z7Var.d == 0;
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
        ofFloat.setInterpolator(new ho(1));
        ofFloat.setDuration(o3.c(i10Var.c, i10Var.d, z7Var.c));
        ofFloat.addListener(new h10(i10Var, z, i2));
        ofFloat.addListener(z0Var);
        ofFloat.start();
    }

    @Override // defpackage.zz
    public final void b(z7 z7Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        i10 i10Var = this.t;
        if (i10Var == null) {
            return;
        }
        ud0 ud0Var = this.a;
        int i = (ud0Var == null || ud0Var.p() == 0) ? 5 : 3;
        if (i10Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        z7 z7Var2 = i10Var.f;
        i10Var.f = z7Var;
        if (z7Var2 != null) {
            i10Var.a(z7Var.c, z7Var.d == 0, i);
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
        this.a.C(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // defpackage.zz
    public final void c(z7 z7Var) {
        i10 i10Var = this.t;
        if (i10Var == null) {
            return;
        }
        i10Var.f = z7Var;
    }

    @Override // defpackage.zz
    public final void d() {
        i10 i10Var = this.t;
        if (i10Var == null) {
            return;
        }
        View view = i10Var.b;
        if (i10Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        z7 z7Var = i10Var.f;
        i10Var.f = null;
        if (z7Var == null) {
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
        animatorSet.setDuration(i10Var.e);
        animatorSet.start();
    }

    @Override // defpackage.hg
    public final void g(kg kgVar) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.hg
    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.hg
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        jm0 jm0Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && hm0.e(view) == null) || !this.g) {
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
        return (this.j || (jm0Var = this.i) == null || !jm0Var.o(motionEvent)) ? false : true;
    }

    @Override // defpackage.hg
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int n;
        int i2;
        View findViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        g10 g10Var = this.b;
        int i4 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new i10(view);
            if (g10Var != null) {
                view.setBackground(g10Var);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                g10Var.q(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = hm0.a;
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
            if (hm0.e(view) == null) {
                hm0.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((kg) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        ud0 ud0Var = this.a;
        if (ud0Var == null || ud0Var.p() != i6) {
            kg kgVar = null;
            gd0 gd0Var = this.d;
            if (i6 == 0) {
                this.a = new ax(this, i3);
                if (gd0Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof kg)) {
                        kgVar = (kg) view3.getLayoutParams();
                    }
                    if (kgVar == null || ((ViewGroup.MarginLayoutParams) kgVar).rightMargin <= 0) {
                        fd0 k = gd0Var.k();
                        k.f = new g(0.0f);
                        k.g = new g(0.0f);
                        gd0 a = k.a();
                        if (g10Var != null) {
                            g10Var.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    s9.d(i6, ". Must be 0 or 1.", "Invalid sheet edge position value: ");
                    return false;
                }
                this.a = new ax(this, i4);
                if (gd0Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof kg)) {
                        kgVar = (kg) view2.getLayoutParams();
                    }
                    if (kgVar == null || ((ViewGroup.MarginLayoutParams) kgVar).leftMargin <= 0) {
                        fd0 k2 = gd0Var.k();
                        k2.e = new g(0.0f);
                        k2.h = new g(0.0f);
                        gd0 a2 = k2.a();
                        if (g10Var != null) {
                            g10Var.setShapeAppearanceModel(a2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new jm0(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int n2 = this.a.n(view);
        coordinatorLayout.r(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.o(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            n = n2 - this.a.n(view);
        } else if (i7 == 3) {
            n = 0;
        } else {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            n = this.a.k();
        }
        WeakHashMap weakHashMap2 = hm0.a;
        view.offsetLeftAndRight(n);
        if (this.q == null && (i2 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(findViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.hg
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.hg
    public final void r(View view, Parcelable parcelable) {
        int i = ((yd0) parcelable).h;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.hg
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new yd0(this);
    }

    @Override // defpackage.hg
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
            jm0 jm0Var = this.i;
            if (abs > jm0Var.b) {
                jm0Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void w(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(r7.d(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        View view = (View) this.p.get();
        f00 f00Var = new f00(i, 2, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(f00Var);
        } else {
            f00Var.run();
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
            s9.c();
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
        int j;
        if (i == 3) {
            j = this.a.j();
        } else {
            if (i != 5) {
                s9.k(r7.b("Invalid state to get outer edge offset: ", i));
                return;
            }
            j = this.a.k();
        }
        jm0 jm0Var = this.i;
        if (jm0Var != null) {
            if (!z) {
                int top = view.getTop();
                jm0Var.r = view;
                jm0Var.c = -1;
                boolean h = jm0Var.h(j, top, 0, 0);
                if (!h && jm0Var.a == 0 && jm0Var.r != null) {
                    jm0Var.r = null;
                }
            }
        }
        x(i);
    }

    public SideSheetBehavior() {
        this.e = new i9(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new f9(this, 1);
    }
}
