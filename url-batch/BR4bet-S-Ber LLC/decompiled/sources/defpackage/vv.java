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
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class vv extends q3 {
    public static final int[] D = {R.attr.state_indeterminate};
    public static final int[] E = {R.attr.state_error};
    public static final int[][] F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CompoundButton.OnCheckedChangeListener A;
    public final c3 B;
    public final tv C;
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

    public vv(Context context, AttributeSet attributeSet) {
        super(la0.j0(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        Context context2 = getContext();
        c3 c3Var = new c3(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = k30.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c3Var.f = drawable;
        drawable.setCallback(c3Var.k);
        new b3(c3Var.f.getConstantState());
        this.B = c3Var;
        this.C = new tv(this);
        Context context3 = getContext();
        this.q = getButtonDrawable();
        this.t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        la0.j(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = y00.x;
        la0.m(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        k6 k6Var = new k6(context3, obtainStyledAttributes);
        this.r = k6Var.o(2);
        if (this.q != null && b9.L(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.q = mz.m(context3, R.drawable.mtrl_checkbox_button);
                this.s = true;
                if (this.r == null) {
                    this.r = mz.m(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.u = kr.v(context3, k6Var, 3);
        this.v = la0.S(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.m = obtainStyledAttributes.getBoolean(11, false);
        this.n = obtainStyledAttributes.getBoolean(6, true);
        this.o = obtainStyledAttributes.getBoolean(9, false);
        this.p = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRippleColor(kr.v(context3, k6Var, 10));
        }
        k6Var.B();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.w;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.l == null) {
            int G2 = xf.G(getContext(), b9.N(this, R.attr.colorControlActivated));
            int G3 = xf.G(getContext(), b9.N(this, R.attr.colorError));
            int G4 = xf.G(getContext(), b9.N(this, R.attr.colorSurface));
            int G5 = xf.G(getContext(), b9.N(this, R.attr.colorOnSurface));
            this.l = new ColorStateList(F, new int[]{xf.z(G4, G3, 1.0f), xf.z(G4, G2, 1.0f), xf.z(G4, G5, 0.54f), xf.z(G4, G5, 0.38f), xf.z(G4, G5, 0.38f)});
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
        w0 w0Var;
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
            c3 c3Var = this.B;
            if (c3Var != null) {
                a3 a3Var = c3Var.g;
                Drawable drawable3 = c3Var.f;
                tv tvVar = this.C;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (tvVar.a == null) {
                        tvVar.a = new y2(tvVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(tvVar.a);
                }
                ArrayList arrayList = c3Var.j;
                if (arrayList != null && tvVar != null) {
                    arrayList.remove(tvVar);
                    if (c3Var.j.size() == 0 && (w0Var = c3Var.i) != null) {
                        a3Var.b.removeListener(w0Var);
                        c3Var.i = null;
                    }
                }
                Drawable drawable4 = c3Var.f;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (tvVar.a == null) {
                        tvVar.a = new y2(tvVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(tvVar.a);
                } else if (tvVar != null) {
                    if (c3Var.j == null) {
                        c3Var.j = new ArrayList();
                    }
                    if (!c3Var.j.contains(tvVar)) {
                        c3Var.j.add(tvVar);
                        if (c3Var.i == null) {
                            c3Var.i = new w0(1, c3Var);
                        }
                        a3Var.b.addListener(c3Var.i);
                    }
                }
            }
            Drawable drawable5 = this.q;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c3Var != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c3Var, false);
                ((AnimatedStateListDrawable) this.q).addTransition(R.id.indeterminate, R.id.unchecked, c3Var, false);
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
        if (!(parcelable instanceof uv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        uv uvVar = (uv) parcelable;
        super.onRestoreInstanceState(uvVar.getSuperState());
        setCheckedState(uvVar.f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        uv uvVar = new uv(super.onSaveInstanceState());
        uvVar.f = getCheckedState();
        return uvVar;
    }

    @Override // defpackage.q3, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(mz.m(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.r = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(mz.m(getContext(), i));
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
                    g9.b();
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
            g9.b();
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

    @Override // defpackage.q3, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.q = drawable;
        this.s = false;
        a();
    }
}
