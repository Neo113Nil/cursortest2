package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.moontiko.really.admiralcasino.R;
import defpackage.a5;
import defpackage.al;
import defpackage.bl;
import defpackage.cl;
import defpackage.f50;
import defpackage.f60;
import defpackage.g9;
import defpackage.gh;
import defpackage.k6;
import defpackage.la0;
import defpackage.ne;
import defpackage.nx;
import defpackage.oe;
import defpackage.rc0;
import defpackage.re;
import defpackage.t7;
import defpackage.u7;
import defpackage.w0;
import defpackage.y00;
import defpackage.zk;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements ne {
    public static final t7 o0 = new t7(Float.class, "width", 6);
    public static final t7 p0 = new t7(Float.class, "height", 7);
    public static final t7 q0 = new t7(Float.class, "paddingStart", 8);
    public static final t7 r0 = new t7(Float.class, "paddingEnd", 9);
    public int V;
    public boolean W;
    public final al a0;
    public final al b0;
    public final cl c0;
    public final bl d0;
    public int e0;
    public int f0;
    public int g0;
    public final ExtendedFloatingActionButtonBehavior h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public ColorStateList l0;
    public int m0;
    public int n0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [k6] */
    /* JADX WARN: Type inference failed for: r9v1, types: [a5] */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(la0.j0(context, attributeSet, R.attr.extendedFloatingActionButtonStyle, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, R.attr.extendedFloatingActionButtonStyle);
        boolean z = false;
        this.V = 0;
        this.W = true;
        int i = 6;
        rc0 rc0Var = new rc0(i, z);
        cl clVar = new cl(this, rc0Var);
        this.c0 = clVar;
        bl blVar = new bl(this, rc0Var);
        this.d0 = blVar;
        this.i0 = true;
        this.j0 = false;
        this.k0 = false;
        Context context2 = getContext();
        this.h0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray O = la0.O(context2, attributeSet, y00.i, R.attr.extendedFloatingActionButtonStyle, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        nx a = nx.a(context2, O, 5);
        nx a2 = nx.a(context2, O, 4);
        nx a3 = nx.a(context2, O, 2);
        nx a4 = nx.a(context2, O, 6);
        this.e0 = O.getDimensionPixelSize(0, -1);
        int i2 = O.getInt(3, 1);
        this.f0 = getPaddingStart();
        this.g0 = getPaddingEnd();
        rc0 rc0Var2 = new rc0(i, z);
        zk zkVar = new zk(this, 1);
        ?? a5Var = new a5(this, zkVar, 15, z);
        ?? k6Var = new k6(this, (a5) a5Var, zkVar);
        boolean z2 = true;
        if (i2 != 1) {
            zkVar = i2 != 2 ? k6Var : a5Var;
            z2 = true;
        }
        al alVar = new al(this, rc0Var2, zkVar, z2);
        this.b0 = alVar;
        al alVar2 = new al(this, rc0Var2, new zk(this, 0), false);
        this.a0 = alVar2;
        clVar.f = a;
        blVar.f = a2;
        alVar.f = a3;
        alVar2.f = a4;
        O.recycle();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, y00.A, R.attr.extendedFloatingActionButtonStyle, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        setShapeAppearanceModel(f50.h(contextThemeWrapper.obtainStyledAttributes(y00.H), f50.m).a());
        this.l0 = getTextColors();
    }

    public final void A() {
        CharSequence charSequence;
        if (this.i0 || !isClickable()) {
            charSequence = null;
        } else {
            charSequence = getText();
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = getContentDescription();
            }
        }
        if (TextUtils.equals(getTooltipText(), charSequence)) {
            return;
        }
        setTooltipText(charSequence);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // defpackage.ne
    public oe getBehavior() {
        return this.h0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.e0;
        if (i >= 0) {
            return i;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public int getCurrentOriginalTextColor() {
        return this.l0.getColorForState(getDrawableState(), 0);
    }

    public nx getExtendMotionSpec() {
        return this.b0.f;
    }

    public nx getHideMotionSpec() {
        return this.d0.f;
    }

    public ColorStateList getOriginalTextColor() {
        return this.l0;
    }

    public nx getShowMotionSpec() {
        return this.c0.f;
    }

    public nx getShrinkMotionSpec() {
        return this.a0.f;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.i0 || !TextUtils.isEmpty(getText()) || getIcon() == null) {
            A();
        } else {
            this.i0 = false;
            this.a0.g();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.k0 = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.W = z;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        A();
    }

    public void setCollapsedSize(int i) {
        this.e0 = i;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        A();
    }

    public void setExtendMotionSpec(nx nxVar) {
        this.b0.f = nxVar;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(nx.b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.i0 == z) {
            return;
        }
        al alVar = z ? this.b0 : this.a0;
        if (alVar.h()) {
            return;
        }
        alVar.g();
    }

    public void setHideMotionSpec(nx nxVar) {
        this.d0.f = nxVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(nx.b(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.i0 || this.j0) {
            return;
        }
        this.f0 = getPaddingStart();
        this.g0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.i0 || this.j0) {
            return;
        }
        this.f0 = i;
        this.g0 = i3;
    }

    public void setShowMotionSpec(nx nxVar) {
        this.c0.f = nxVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(nx.b(getContext(), i));
    }

    public void setShrinkMotionSpec(nx nxVar) {
        this.a0.f = nxVar;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(nx.b(getContext(), i));
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        A();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.l0 = getTextColors();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r5.k0 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i) {
        u7 u7Var;
        if (i == 0) {
            u7Var = this.c0;
        } else if (i == 1) {
            u7Var = this.d0;
        } else if (i == 2) {
            u7Var = this.a0;
        } else {
            if (i != 3) {
                g9.s(f60.e("Unknown strategy type: ", i));
                return;
            }
            u7Var = this.b0;
        }
        if (u7Var.h()) {
            return;
        }
        if (this.W) {
            if (!isLaidOut()) {
                int visibility = getVisibility();
                int i2 = this.V;
                if (visibility == 0 ? i2 == 1 : i2 != 2) {
                }
            }
            if (!isInEditMode()) {
                if (i == 2) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.m0 = layoutParams.width;
                        this.n0 = layoutParams.height;
                    } else {
                        this.m0 = getWidth();
                        this.n0 = getHeight();
                    }
                }
                int i3 = 0;
                measure(0, 0);
                AnimatorSet a = u7Var.a();
                a.addListener(new w0(4, u7Var));
                ArrayList arrayList = u7Var.c;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    a.addListener((Animator.AnimatorListener) obj);
                }
                a.start();
                return;
            }
        }
        u7Var.g();
    }

    public final void z(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.l0 = getTextColors();
    }

    /* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends oe {
        public Rect a;
        public final boolean b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.j);
            this.b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // defpackage.oe
        public final /* bridge */ /* synthetic */ boolean e(View view) {
            return false;
        }

        @Override // defpackage.oe
        public final void g(re reVar) {
            if (reVar.h == 0) {
                reVar.h = 80;
            }
        }

        @Override // defpackage.oe
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof re ? ((re) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // defpackage.oe
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList j = coordinatorLayout.j(extendedFloatingActionButton);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) j.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof re ? ((re) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.q(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            re reVar = (re) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || reVar.f != appBarLayout.getId()) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            gh.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i = z2 ? 2 : 1;
                t7 t7Var = ExtendedFloatingActionButton.o0;
                extendedFloatingActionButton.y(i);
            } else {
                int i2 = z2 ? 3 : 0;
                t7 t7Var2 = ExtendedFloatingActionButton.o0;
                extendedFloatingActionButton.y(i2);
            }
            return true;
        }

        public final boolean x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            re reVar = (re) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || reVar.f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((re) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                int i = z2 ? 2 : 1;
                t7 t7Var = ExtendedFloatingActionButton.o0;
                extendedFloatingActionButton.y(i);
            } else {
                int i2 = z2 ? 3 : 0;
                t7 t7Var2 = ExtendedFloatingActionButton.o0;
                extendedFloatingActionButton.y(i2);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
    }
}
