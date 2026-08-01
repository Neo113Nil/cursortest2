package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.derinko.gbini.n1casino.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class us extends g3 {
    public static final int[] D = {R.attr.state_indeterminate};
    public static final int[] E = {R.attr.state_error};
    public static final int[][] F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CompoundButton.OnCheckedChangeListener A;
    public final s2 B;
    public final ss C;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public ColorStateList l;
    public boolean m;
    public boolean n;
    public boolean o;
    public CharSequence p;
    public Drawable q;
    public Drawable r;
    public boolean s;
    public ColorStateList t;
    public ColorStateList u;
    public PorterDuff.Mode v;
    public int w;
    public int[] x;
    public boolean y;
    public CharSequence z;

    public us(Context context, AttributeSet attributeSet) {
        super(e70.W(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        Context context2 = getContext();
        s2 s2Var = new s2(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = f00.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        s2Var.f = drawable;
        drawable.setCallback(s2Var.k);
        new r2(s2Var.f.getConstantState());
        this.B = s2Var;
        this.C = new ss(this);
        Context context3 = getContext();
        this.q = getButtonDrawable();
        this.t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        o8.h(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = vx.u;
        o8.k(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        a6 a6Var = new a6(context3, obtainStyledAttributes);
        this.r = a6Var.k(2);
        if (this.q != null && zo.J(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.q = zo.s(context3, R.drawable.mtrl_checkbox_button);
                this.s = true;
                if (this.r == null) {
                    this.r = zo.s(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.u = e70.x(context3, a6Var, 3);
        this.v = u90.b(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.m = obtainStyledAttributes.getBoolean(11, false);
        this.n = obtainStyledAttributes.getBoolean(6, true);
        this.o = obtainStyledAttributes.getBoolean(9, false);
        this.p = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRippleColor(e70.x(context3, a6Var, 10));
        }
        a6Var.w();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.w;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.l == null) {
            int X = jw.X(getContext(), zo.L(this, R.attr.colorControlActivated));
            int X2 = jw.X(getContext(), zo.L(this, R.attr.colorError));
            int X3 = jw.X(getContext(), zo.L(this, R.attr.colorSurface));
            int X4 = jw.X(getContext(), zo.L(this, R.attr.colorOnSurface));
            this.l = new ColorStateList(F, new int[]{jw.I(X3, X2, 1.0f), jw.I(X3, X, 1.0f), jw.I(X3, X4, 0.54f), jw.I(X3, X4, 0.38f), jw.I(X3, X4, 0.38f)});
        }
        return this.l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.t;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        v0 v0Var;
        Drawable drawable = this.q;
        ColorStateList colorStateList3 = this.t;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.q = drawable;
        Drawable drawable2 = this.r;
        ColorStateList colorStateList4 = this.u;
        PorterDuff.Mode mode = this.v;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.r = drawable2;
        if (this.s) {
            s2 s2Var = this.B;
            if (s2Var != null) {
                q2 q2Var = s2Var.g;
                Drawable drawable3 = s2Var.f;
                ss ssVar = this.C;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (ssVar.a == null) {
                        ssVar.a = new o2(ssVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(ssVar.a);
                }
                ArrayList arrayList = s2Var.j;
                if (arrayList != null && ssVar != null) {
                    arrayList.remove(ssVar);
                    if (s2Var.j.size() == 0 && (v0Var = s2Var.i) != null) {
                        q2Var.b.removeListener(v0Var);
                        s2Var.i = null;
                    }
                }
                Drawable drawable4 = s2Var.f;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (ssVar.a == null) {
                        ssVar.a = new o2(ssVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(ssVar.a);
                } else if (ssVar != null) {
                    if (s2Var.j == null) {
                        s2Var.j = new ArrayList();
                    }
                    if (!s2Var.j.contains(ssVar)) {
                        s2Var.j.add(ssVar);
                        if (s2Var.i == null) {
                            s2Var.i = new v0(1, s2Var);
                        }
                        q2Var.b.addListener(s2Var.i);
                    }
                }
            }
            Drawable drawable5 = this.q;
            if ((drawable5 instanceof AnimatedStateListDrawable) && s2Var != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, s2Var, false);
                ((AnimatedStateListDrawable) this.q).addTransition(R.id.indeterminate, R.id.unchecked, s2Var, false);
            }
        }
        Drawable drawable6 = this.q;
        if (drawable6 != null && (colorStateList2 = this.t) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.r;
        if (drawable7 != null && (colorStateList = this.u) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.q;
        Drawable drawable9 = this.r;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.q;
    }

    public Drawable getButtonIconDrawable() {
        return this.r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.t;
    }

    public int getCheckedState() {
        return this.w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m && this.t == null && this.u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (this.o) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.x = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.n || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ts)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ts tsVar = (ts) parcelable;
        super.onRestoreInstanceState(tsVar.getSuperState());
        setCheckedState(tsVar.f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ts tsVar = new ts(super.onSaveInstanceState());
        tsVar.f = getCheckedState();
        return tsVar;
    }

    @Override // defpackage.g3, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(zo.s(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.r = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(zo.s(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.u == colorStateList) {
            return;
        }
        this.u = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.v == mode) {
            return;
        }
        this.v = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.t == colorStateList) {
            return;
        }
        this.t = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.n = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.w != i) {
            this.w = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.y) {
                return;
            }
            this.y = true;
            LinkedHashSet linkedHashSet = this.k;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    t8.c();
                    return;
                }
            }
            if (this.w != 2 && (onCheckedChangeListener = this.A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.y = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            t8.c();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.m = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.g3, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.q = drawable;
        this.s = false;
        a();
    }
}
