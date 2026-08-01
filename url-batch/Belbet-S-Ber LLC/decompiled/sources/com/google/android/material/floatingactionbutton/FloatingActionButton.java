package com.google.android.material.floatingactionbutton;

import a0.b;
import a0.c;
import a0.f;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.l;
import com.gdmhkmf.belbet.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import e0.d;
import f2.a;
import g1.v;
import g2.h;
import g2.i;
import i2.o;
import i2.r;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.p0;
import o2.z;
import q.j;
import r1.e;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class FloatingActionButton extends r implements a, z, b {

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1138g;
    public PorterDuff.Mode h;
    public ColorStateList i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f1139j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1140k;

    /* renamed from: l, reason: collision with root package name */
    public int f1141l;

    /* renamed from: m, reason: collision with root package name */
    public int f1142m;

    /* renamed from: n, reason: collision with root package name */
    public int f1143n;

    /* renamed from: o, reason: collision with root package name */
    public int f1144o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1145p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f1146q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f1147r;

    /* renamed from: s, reason: collision with root package name */
    public final d f1148s;

    /* renamed from: t, reason: collision with root package name */
    public final f2.b f1149t;

    /* renamed from: u, reason: collision with root package name */
    public i f1150u;

    /* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(u2.a.b(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        ColorStateList colorStateList;
        FloatingActionButton floatingActionButton;
        Drawable drawable;
        Drawable drawable2;
        this.f2068f = getVisibility();
        this.f1146q = new Rect();
        this.f1147r = new Rect();
        Context context2 = getContext();
        TypedArray e4 = o.e(context2, attributeSet, q1.a.h, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f1138g = l.r(context2, e4, 1);
        this.h = o.f(e4.getInt(2, -1), null);
        this.f1140k = l.r(context2, e4, 12);
        this.f1141l = e4.getInt(7, -1);
        this.f1142m = e4.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = e4.getDimensionPixelSize(3, 0);
        float dimension = e4.getDimension(4, 0.0f);
        float dimension2 = e4.getDimension(9, 0.0f);
        float dimension3 = e4.getDimension(11, 0.0f);
        this.f1145p = e4.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(e4.getDimensionPixelSize(10, 0));
        e a5 = e.a(context2, e4, 15);
        e a6 = e.a(context2, e4, 8);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, q1.a.f3161y, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        o2.o a7 = o2.o.h(contextThemeWrapper.obtainStyledAttributes(q1.a.F), o2.o.f2983m).a();
        boolean z4 = e4.getBoolean(5, false);
        setEnabled(e4.getBoolean(0, true));
        e4.recycle();
        d dVar = new d(this);
        this.f1148s = dVar;
        dVar.d(attributeSet, R.attr.floatingActionButtonStyle);
        this.f1149t = new f2.b(this);
        getImpl().g(a7);
        i impl = getImpl();
        ColorStateList colorStateList2 = this.f1138g;
        PorterDuff.Mode mode = this.h;
        ColorStateList colorStateList3 = this.f1140k;
        FloatingActionButton floatingActionButton2 = impl.f1917s;
        o2.o oVar = impl.f1902a;
        oVar.getClass();
        h hVar = new h(oVar);
        impl.f1903b = hVar;
        hVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.f1903b.setTintMode(mode);
        }
        impl.f1903b.n(floatingActionButton2.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton2.getContext();
            o2.o oVar2 = impl.f1902a;
            oVar2.getClass();
            g2.b bVar = new g2.b(oVar2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            colorStateList = colorStateList3;
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            floatingActionButton = floatingActionButton2;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            bVar.i = color;
            bVar.f1881j = color2;
            bVar.f1882k = color3;
            bVar.f1883l = color4;
            float f5 = dimensionPixelSize;
            if (bVar.h != f5) {
                bVar.h = f5;
                bVar.f1876b.setStrokeWidth(f5 * 1.3333f);
                bVar.f1885n = true;
                bVar.invalidateSelf();
            }
            if (colorStateList2 != null) {
                bVar.f1884m = colorStateList2.getColorForState(bVar.getState(), bVar.f1884m);
            }
            bVar.f1887p = colorStateList2;
            bVar.f1885n = true;
            bVar.invalidateSelf();
            impl.d = bVar;
            g2.b bVar2 = impl.d;
            bVar2.getClass();
            h hVar2 = impl.f1903b;
            hVar2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{bVar2, hVar2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            floatingActionButton = floatingActionButton2;
            drawable = null;
            impl.d = null;
            drawable2 = impl.f1903b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(m2.a.a(colorStateList), drawable2, drawable);
        impl.f1904c = rippleDrawable;
        FocusRingDrawable.e(floatingActionButton.getContext(), rippleDrawable, impl.f1903b);
        impl.f1905e = rippleDrawable;
        getImpl().f1909k = dimensionPixelSize2;
        i impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.f1908j);
        }
        i impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.f1908j);
        }
        i impl4 = getImpl();
        if (impl4.f1908j != dimension3) {
            impl4.f1908j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().f1912n = a5;
        getImpl().f1913o = a6;
        getImpl().f1906f = z4;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private i getImpl() {
        if (this.f1150u == null) {
            this.f1150u = new i(this, new a0.a(15, this));
        }
        return this.f1150u;
    }

    public final int c(int i) {
        int i4 = this.f1142m;
        if (i4 != 0) {
            return i4;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        i impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f1917s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f1916r == 1) {
                return;
            }
        } else if (impl.f1916r != 2) {
            return;
        }
        Animator animator = impl.f1911m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.f1917s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        e eVar = impl.f1913o;
        AnimatorSet b2 = eVar != null ? impl.b(eVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, i.B, i.C);
        b2.addListener(new v(impl));
        b2.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.i;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f1139j;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(l.r.c(colorForState, mode));
    }

    public final void f() {
        i impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f1917s;
        Matrix matrix = impl.f1922x;
        FloatingActionButton floatingActionButton2 = impl.f1917s;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f1916r == 2) {
                return;
            }
        } else if (impl.f1916r != 1) {
            return;
        }
        Animator animator = impl.f1911m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z4 = impl.f1912n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f1914p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z4 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z4 ? 0.4f : 0.0f);
            float f5 = z4 ? 0.4f : 0.0f;
            impl.f1914p = f5;
            impl.a(f5, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        e eVar = impl.f1912n;
        AnimatorSet b2 = eVar != null ? impl.b(eVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, i.f1901z, i.A);
        b2.addListener(new g2.e(0, impl));
        b2.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f1138g;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.h;
    }

    @Override // a0.b
    public c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f1917s.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f1908j;
    }

    public Drawable getContentBackground() {
        return getImpl().f1905e;
    }

    public int getCustomSize() {
        return this.f1142m;
    }

    public int getExpandedComponentIdHint() {
        return this.f1149t.f1437g;
    }

    public e getHideMotionSpec() {
        return getImpl().f1913o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f1140k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f1140k;
    }

    public o2.o getShapeAppearanceModel() {
        o2.o oVar = getImpl().f1902a;
        oVar.getClass();
        return oVar;
    }

    public e getShowMotionSpec() {
        return getImpl().f1912n;
    }

    public int getSize() {
        return this.f1141l;
    }

    public int getSizeDimension() {
        return c(this.f1141l);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.i;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f1139j;
    }

    public boolean getUseCompatPadding() {
        return this.f1145p;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i impl = getImpl();
        h hVar = impl.f1903b;
        if (hVar != null) {
            l.f0(impl.f1917s, hVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().f1917s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i4) {
        int sizeDimension = getSizeDimension();
        this.f1143n = (sizeDimension - this.f1144o) / 2;
        getImpl().h();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i4));
        Rect rect = this.f1146q;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r2.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r2.a aVar = (r2.a) parcelable;
        super.onRestoreInstanceState(aVar.f3386f);
        Bundle bundle = (Bundle) aVar.h.get("expandableWidgetHelper");
        bundle.getClass();
        f2.b bVar = this.f1149t;
        bVar.getClass();
        bVar.f1436f = bundle.getBoolean("expanded", false);
        bVar.f1437g = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f1436f) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) bVar.h;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                List list = (List) ((j) coordinatorLayout.f385g.f98g).get(floatingActionButton);
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    View view = (View) list.get(i);
                    c cVar = ((f) view.getLayoutParams()).f81a;
                    if (cVar != null) {
                        cVar.d(coordinatorLayout, view, floatingActionButton);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        r2.a aVar = new r2.a(onSaveInstanceState);
        f2.b bVar = this.f1149t;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f1436f);
        bundle.putInt("expandedComponentIdHint", bVar.f1437g);
        aVar.h.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f1147r;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.f1146q;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            i iVar = this.f1150u;
            int i4 = -(iVar.f1906f ? Math.max((iVar.f1909k - iVar.f1917s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i4, i4);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1138g != colorStateList) {
            this.f1138g = colorStateList;
            i impl = getImpl();
            h hVar = impl.f1903b;
            if (hVar != null) {
                hVar.setTintList(colorStateList);
            }
            g2.b bVar = impl.d;
            if (bVar != null) {
                if (colorStateList != null) {
                    bVar.f1884m = colorStateList.getColorForState(bVar.getState(), bVar.f1884m);
                }
                bVar.f1887p = colorStateList;
                bVar.f1885n = true;
                bVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            h hVar = getImpl().f1903b;
            if (hVar != null) {
                hVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        super.setClickable(z4);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCompatElevation(float f5) {
        i impl = getImpl();
        if (impl.h != f5) {
            impl.h = f5;
            impl.e(f5, impl.i, impl.f1908j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f5) {
        i impl = getImpl();
        if (impl.i != f5) {
            impl.i = f5;
            impl.e(impl.h, f5, impl.f1908j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f5) {
        i impl = getImpl();
        if (impl.f1908j != f5) {
            impl.f1908j = f5;
            impl.e(impl.h, impl.i, f5);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f1142m) {
            this.f1142m = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        h hVar = getImpl().f1903b;
        if (hVar != null) {
            hVar.q(f5);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        if (z4 != getImpl().f1906f) {
            getImpl().f1906f = z4;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f1149t.f1437g = i;
    }

    public void setHideMotionSpec(e eVar) {
        getImpl().f1913o = eVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(e.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i impl = getImpl();
            float f5 = impl.f1914p;
            impl.f1914p = f5;
            Matrix matrix = impl.f1922x;
            impl.a(f5, matrix);
            impl.f1917s.setImageMatrix(matrix);
            if (this.i != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f1148s.e(i);
        e();
    }

    public void setMaxImageSize(int i) {
        this.f1144o = i;
        i impl = getImpl();
        if (impl.f1915q != i) {
            impl.f1915q = i;
            float f5 = impl.f1914p;
            impl.f1914p = f5;
            Matrix matrix = impl.f1922x;
            impl.a(f5, matrix);
            impl.f1917s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f5) {
        super.setScaleX(f5);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f5) {
        super.setScaleY(f5);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z4) {
        i impl = getImpl();
        impl.f1907g = z4;
        impl.h();
    }

    @Override // o2.z
    public void setShapeAppearanceModel(o2.o oVar) {
        getImpl().g(oVar);
    }

    public void setShowMotionSpec(e eVar) {
        getImpl().f1912n = eVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(e.b(getContext(), i));
    }

    public void setSize(int i) {
        this.f1142m = 0;
        if (i != this.f1141l) {
            this.f1141l = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f1139j != mode) {
            this.f1139j = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f5) {
        super.setTranslationX(f5);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f5) {
        super.setTranslationY(f5);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f5) {
        super.setTranslationZ(f5);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.f1145p != z4) {
            this.f1145p = z4;
            getImpl().h();
        }
    }

    @Override // i2.r, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
    public static class BaseBehavior<T extends FloatingActionButton> extends c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1151a;

        public BaseBehavior() {
            this.f1151a = true;
        }

        @Override // a0.c
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f1146q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // a0.c
        public final void c(f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // a0.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof f ? ((f) layoutParams).f81a instanceof BottomSheetBehavior : false) {
                r(view2, floatingActionButton);
            }
            return false;
        }

        @Override // a0.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList j2 = coordinatorLayout.j(floatingActionButton);
            int size = j2.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) j2.get(i5);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof f ? ((f) layoutParams).f81a instanceof BottomSheetBehavior : false) && r(view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.q(floatingActionButton, i);
            Rect rect = floatingActionButton.f1146q;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                f fVar = (f) floatingActionButton.getLayoutParams();
                int i6 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i4 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i4 = -rect.top;
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap = p0.f2816a;
                    floatingActionButton.offsetTopAndBottom(i4);
                }
                if (i6 != 0) {
                    WeakHashMap weakHashMap2 = p0.f2816a;
                    floatingActionButton.offsetLeftAndRight(i6);
                }
            }
            return true;
        }

        public final boolean r(View view, FloatingActionButton floatingActionButton) {
            f fVar = (f) floatingActionButton.getLayoutParams();
            if (!this.f1151a || fVar.f85f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.a.i);
            this.f1151a = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f1140k != colorStateList) {
            this.f1140k = colorStateList;
            i impl = getImpl();
            ColorStateList colorStateList2 = this.f1140k;
            RippleDrawable rippleDrawable = impl.f1904c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(m2.a.a(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(m2.a.a(colorStateList2));
            }
        }
    }
}
