package w0;

import B.k;
import B.r;
import C0.n;
import K.C0011l;
import K.Y;
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
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.neonpulse.gridlogic.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0239r;
import l0.C0258b;
import l0.C0260d;
import l0.C0261e;
import l0.C0262f;
import o0.AbstractC0277a;
import x1.d;
import x1.l;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332c extends C0239r {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4062e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4063f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4064g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4065j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4066k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4067l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4068m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4069n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4070o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4071p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4072q;

    /* renamed from: r, reason: collision with root package name */
    public int f4073r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4074s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4075t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4076u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4077v;

    /* renamed from: w, reason: collision with root package name */
    public final C0262f f4078w;

    /* renamed from: x, reason: collision with root package name */
    public final C0330a f4079x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4060y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4061z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4058A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4059B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C0332c(Context context, AttributeSet attributeSet) {
        super(N0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4062e = new LinkedHashSet();
        this.f4063f = new LinkedHashSet();
        Context context2 = getContext();
        C0262f c0262f = new C0262f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f38a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0262f.f3110a = a2;
        a2.setCallback(c0262f.f3109f);
        new C0261e(c0262f.f3110a.getConstantState());
        this.f4078w = c0262f;
        this.f4079x = new C0330a(this);
        Context context3 = getContext();
        this.f4067l = Q.c.a(this);
        this.f4070o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0277a.f3250n;
        n.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        n.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0011l c0011l = new C0011l(context3, obtainStyledAttributes);
        this.f4068m = c0011l.h(2);
        if (this.f4067l != null && d.Y(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4059B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4067l = l.z(context3, R.drawable.mtrl_checkbox_button);
                this.f4069n = true;
                if (this.f4068m == null) {
                    this.f4068m = l.z(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4071p = l.w(context3, c0011l, 3);
        this.f4072q = n.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4065j = obtainStyledAttributes.getBoolean(9, false);
        this.f4066k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0011l.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4073r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4064g == null) {
            int j2 = k0.k.j(this, R.attr.colorControlActivated);
            int j3 = k0.k.j(this, R.attr.colorError);
            int j4 = k0.k.j(this, R.attr.colorSurface);
            int j5 = k0.k.j(this, R.attr.colorOnSurface);
            this.f4064g = new ColorStateList(f4058A, new int[]{k0.k.m(j4, j3, 1.0f), k0.k.m(j4, j2, 1.0f), k0.k.m(j4, j5, 0.54f), k0.k.m(j4, j5, 0.38f), k0.k.m(j4, j5, 0.38f)});
        }
        return this.f4064g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4070o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Y y2;
        Drawable drawable = this.f4067l;
        ColorStateList colorStateList3 = this.f4070o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f4067l = drawable;
        Drawable drawable2 = this.f4068m;
        ColorStateList colorStateList4 = this.f4071p;
        PorterDuff.Mode mode = this.f4072q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f4068m = drawable2;
        if (this.f4069n) {
            C0262f c0262f = this.f4078w;
            if (c0262f != null) {
                Drawable drawable3 = c0262f.f3110a;
                C0330a c0330a = this.f4079x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0330a.f4055a == null) {
                        c0330a.f4055a = new C0258b(c0330a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0330a.f4055a);
                }
                ArrayList arrayList = c0262f.f3108e;
                C0260d c0260d = c0262f.f3106b;
                if (arrayList != null && c0330a != null) {
                    arrayList.remove(c0330a);
                    if (c0262f.f3108e.size() == 0 && (y2 = c0262f.d) != null) {
                        c0260d.f3103b.removeListener(y2);
                        c0262f.d = null;
                    }
                }
                Drawable drawable4 = c0262f.f3110a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0330a.f4055a == null) {
                        c0330a.f4055a = new C0258b(c0330a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0330a.f4055a);
                } else if (c0330a != null) {
                    if (c0262f.f3108e == null) {
                        c0262f.f3108e = new ArrayList();
                    }
                    if (!c0262f.f3108e.contains(c0330a)) {
                        c0262f.f3108e.add(c0330a);
                        if (c0262f.d == null) {
                            c0262f.d = new Y(4, c0262f);
                        }
                        c0260d.f3103b.addListener(c0262f.d);
                    }
                }
            }
            Drawable drawable5 = this.f4067l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0262f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0262f, false);
                ((AnimatedStateListDrawable) this.f4067l).addTransition(R.id.indeterminate, R.id.unchecked, c0262f, false);
            }
        }
        Drawable drawable6 = this.f4067l;
        if (drawable6 != null && (colorStateList2 = this.f4070o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4068m;
        if (drawable7 != null && (colorStateList = this.f4071p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4067l;
        Drawable drawable9 = this.f4068m;
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
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
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
        return this.f4067l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4068m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4071p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4072q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4070o;
    }

    public int getCheckedState() {
        return this.f4073r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4066k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4073r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f4070o == null && this.f4071p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4060y);
        }
        if (this.f4065j) {
            View.mergeDrawableStates(onCreateDrawableState, f4061z);
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
        this.f4074s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = Q.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (n.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            D.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f4065j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4066k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0331b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0331b c0331b = (C0331b) parcelable;
        super.onRestoreInstanceState(c0331b.getSuperState());
        setCheckedState(c0331b.f4057a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0331b c0331b = new C0331b(super.onSaveInstanceState());
        c0331b.f4057a = getCheckedState();
        return c0331b;
    }

    @Override // l.C0239r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l.z(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4068m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(l.z(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4071p == colorStateList) {
            return;
        }
        this.f4071p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4072q == mode) {
            return;
        }
        this.f4072q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4070o == colorStateList) {
            return;
        }
        this.f4070o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f4073r != i) {
            this.f4073r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4076u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4075t) {
                return;
            }
            this.f4075t = true;
            LinkedHashSet linkedHashSet = this.f4063f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4073r != 2 && (onCheckedChangeListener = this.f4077v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4075t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4066k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4065j == z2) {
            return;
        }
        this.f4065j = z2;
        refreshDrawableState();
        Iterator it = this.f4062e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4077v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4076u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            Q.b.c(this, getMaterialThemeColorsTintList());
        } else {
            Q.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.C0239r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4067l = drawable;
        this.f4069n = false;
        a();
    }
}
