package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.Cfor;
import defpackage.a;
import defpackage.ckm;
import defpackage.few;
import defpackage.fhq;
import defpackage.fhu;
import defpackage.fib;
import defpackage.fic;
import defpackage.fie;
import defpackage.fif;
import defpackage.fig;
import defpackage.fiq;
import defpackage.fjw;
import defpackage.fkc;
import defpackage.fmq;
import defpackage.fny;
import defpackage.fob;
import defpackage.fog;
import defpackage.fpo;
import defpackage.fpq;
import defpackage.frj;
import defpackage.kee;
import defpackage.qy;
import defpackage.tv;
import defpackage.tw;
import defpackage.tz;
import defpackage.yq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FloatingActionButton extends fkc implements Cfor, tv {
    private PorterDuff.Mode a;
    private ColorStateList b;
    public ColorStateList c;
    public int d;
    public boolean e;
    public final Rect f;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private fif m;
    private final fpo n;
    private final ckm o;

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable drawable2;
        this.f = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray a = fjw.a(context2, attributeSet, fig.b, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.c = fny.e(context2, a, 1);
        this.a = a.q(a.getInt(2, -1), null);
        this.b = fny.e(context2, a, 12);
        this.i = a.getInt(7, -1);
        this.j = a.getDimensionPixelSize(6, 0);
        this.h = a.getDimensionPixelSize(3, 0);
        float dimension = a.getDimension(4, 0.0f);
        float dimension2 = a.getDimension(9, 0.0f);
        float dimension3 = a.getDimension(11, 0.0f);
        this.e = a.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = a.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        fif f = f();
        if (f.z != dimensionPixelSize2) {
            f.z = dimensionPixelSize2;
            f.h();
        }
        few a2 = few.a(context2, a, 15);
        few a3 = few.a(context2, a, 8);
        fog fogVar = new fog(fog.i(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, fog.a));
        boolean z = a.getBoolean(5, false);
        setEnabled(a.getBoolean(0, true));
        a.recycle();
        ckm ckmVar = new ckm(this);
        this.o = ckmVar;
        ckmVar.i(attributeSet, i);
        this.n = new fpo(this);
        f().g(fogVar);
        fif f2 = f();
        ColorStateList colorStateList2 = this.c;
        PorterDuff.Mode mode = this.a;
        ColorStateList colorStateList3 = this.b;
        int i2 = this.h;
        fog fogVar2 = f2.l;
        tw.F(fogVar2);
        f2.m = new fie(fogVar2);
        f2.m.setTintList(colorStateList2);
        if (mode != null) {
            f2.m.setTintMode(mode);
        }
        f2.m.J(f2.B.getContext());
        if (i2 > 0) {
            Context context3 = f2.B.getContext();
            fog fogVar3 = f2.l;
            tw.F(fogVar3);
            fhu fhuVar = new fhu(fogVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            fhuVar.c = color;
            fhuVar.d = color2;
            fhuVar.e = color3;
            fhuVar.f = color4;
            float f3 = i2;
            if (fhuVar.b != f3) {
                fhuVar.b = f3;
                fhuVar.a.setStrokeWidth(f3 * 1.3333f);
                fhuVar.g = true;
                fhuVar.invalidateSelf();
            }
            fhuVar.b(colorStateList2);
            f2.o = fhuVar;
            fhu fhuVar2 = f2.o;
            tw.F(fhuVar2);
            fob fobVar = f2.m;
            tw.F(fobVar);
            drawable2 = new LayerDrawable(new Drawable[]{fhuVar2, fobVar});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            f2.o = null;
            drawable2 = f2.m;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(fmq.b(colorStateList), drawable2, drawable);
        f2.n = rippleDrawable;
        FocusRingDrawable.a(f2.B.getContext(), rippleDrawable, f2.m);
        f2.p = rippleDrawable;
        f().u = dimensionPixelSize;
        fif f4 = f();
        if (f4.r != dimension) {
            f4.r = dimension;
            f4.e(dimension, f4.s, f4.t);
        }
        fif f5 = f();
        if (f5.s != dimension2) {
            f5.s = dimension2;
            f5.e(f5.r, dimension2, f5.t);
        }
        fif f6 = f();
        if (f6.t != dimension3) {
            f6.t = dimension3;
            f6.e(f6.r, f6.s, dimension3);
        }
        f().w = a2;
        f().x = a3;
        f().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final int b(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? b(1) : b(0);
    }

    private final void c() {
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    @Override // defpackage.tv
    public final tw a() {
        return new Behavior();
    }

    @Override // defpackage.Cfor
    public final void bz(fog fogVar) {
        f().g(fogVar);
    }

    public final int e() {
        return b(this.i);
    }

    public final fif f() {
        fif fifVar = this.m;
        if (fifVar != null) {
            return fifVar;
        }
        fif fifVar2 = new fif(this, new kee(this));
        this.m = fifVar2;
        return fifVar2;
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.c;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.a;
    }

    public final void h(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        Rect rect2 = this.f;
        rect.left += rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    final void i() {
        fif f = f();
        FloatingActionButton floatingActionButton = f.B;
        if (floatingActionButton.getVisibility() == 0) {
            if (f.A == 1) {
                return;
            }
        } else if (f.A != 2) {
            return;
        }
        Animator animator = f.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!f.l()) {
            floatingActionButton.k(4, false);
            return;
        }
        few fewVar = f.x;
        AnimatorSet b = fewVar != null ? f.b(fewVar, 0.0f, 0.0f, 0.0f) : f.c(0.0f, 0.4f, 0.4f, fif.d, fif.e);
        b.addListener(new fib(f));
        b.start();
    }

    final void j() {
        fif f = f();
        FloatingActionButton floatingActionButton = f.B;
        if (floatingActionButton.getVisibility() != 0) {
            if (f.A == 2) {
                return;
            }
        } else if (f.A != 1) {
            return;
        }
        Animator animator = f.v;
        if (animator != null) {
            animator.cancel();
        }
        few fewVar = f.w;
        if (!f.l()) {
            floatingActionButton.k(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            f.f(1.0f);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            float f2 = fewVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f2);
            floatingActionButton.setScaleX(f2);
            f.f(f2);
        }
        few fewVar2 = f.w;
        AnimatorSet b = fewVar2 != null ? f.b(fewVar2, 1.0f, 1.0f, 1.0f) : f.c(1.0f, 1.0f, 1.0f, fif.b, fif.c);
        b.addListener(new fic(f));
        b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fif f = f();
        fob fobVar = f.m;
        if (fobVar != null) {
            fhq.y(f.B, fobVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f().B.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int e = e();
        this.d = (e - this.k) / 2;
        f().i();
        int min = Math.min(View.resolveSize(e, i), View.resolveSize(e, i2));
        Rect rect = this.f;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fpq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fpq fpqVar = (fpq) parcelable;
        super.onRestoreInstanceState(fpqVar.d);
        fpo fpoVar = this.n;
        Bundle bundle = (Bundle) fpqVar.a.get("expandableWidgetHelper");
        tw.F(bundle);
        fpoVar.b = bundle.getBoolean("expanded", false);
        fpoVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (fpoVar.b) {
            View view = (View) fpoVar.c;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).b(view);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        fpq fpqVar = new fpq(onSaveInstanceState);
        qy qyVar = fpqVar.a;
        fpo fpoVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", fpoVar.b);
        bundle.putInt("expandedComponentIdHint", fpoVar.a);
        qyVar.put("expandableWidgetHelper", bundle);
        return fpqVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            h(rect);
            int i = -this.m.a();
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.c != colorStateList) {
            this.c = colorStateList;
            fif f = f();
            fob fobVar = f.m;
            if (fobVar != null) {
                fobVar.setTintList(colorStateList);
            }
            fhu fhuVar = f.o;
            if (fhuVar != null) {
                fhuVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.a != mode) {
            this.a = mode;
            fob fobVar = f().m;
            if (fobVar != null) {
                fobVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        c();
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        c();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fob fobVar = f().m;
        if (fobVar != null) {
            fobVar.L(f);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            f().h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.o.k(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        f();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        f();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        f();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        f();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        f();
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class BaseBehavior extends tw {
        private Rect a;
        private final boolean b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fig.c);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        private final boolean J(View view, FloatingActionButton floatingActionButton) {
            return (this.b && ((tz) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.g == 0) ? false : true;
        }

        private static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof tz) {
                return ((tz) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (J(appBarLayout, floatingActionButton)) {
                return false;
            }
            Rect rect = this.a;
            if (rect == null) {
                rect = new Rect();
                this.a = rect;
            }
            fiq.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.i();
                return true;
            }
            floatingActionButton.j();
            return true;
        }

        private final boolean M(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((tz) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.i();
                return true;
            }
            floatingActionButton.j();
            return true;
        }

        @Override // defpackage.tw
        public final void h(tz tzVar) {
            if (tzVar.h == 0) {
                tzVar.h = 80;
            }
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List a = coordinatorLayout.a(floatingActionButton);
            int size = a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) a.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    if (K(view2) && M(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            Rect rect = floatingActionButton.f;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            tz tzVar = (tz) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - tzVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= tzVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - tzVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= tzVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int i5 = yq.a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            int i6 = yq.a;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (K(view2)) {
                M(view2, floatingActionButton);
            }
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ boolean z(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior() {
            this.b = true;
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
