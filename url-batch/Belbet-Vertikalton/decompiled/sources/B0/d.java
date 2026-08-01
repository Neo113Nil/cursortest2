package B0;

import D.j;
import D.q;
import H0.m;
import H1.l;
import I0.h;
import I0.i;
import a.AbstractC0058a;
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
import com.winpower.neonfit.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n.C0298s;
import q0.C0333b;
import q0.C0335d;
import q0.C0336e;
import q0.C0337f;
import t0.AbstractC0383a;

/* loaded from: classes.dex */
public final class d extends C0298s {
    public final LinkedHashSet e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f50f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f51g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f52h;
    public boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f53k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f54l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f55m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f56n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f57o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f58p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f59q;

    /* renamed from: r, reason: collision with root package name */
    public int f60r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f61s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f62t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f63u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f64v;

    /* renamed from: w, reason: collision with root package name */
    public final C0337f f65w;

    /* renamed from: x, reason: collision with root package name */
    public final a f66x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f48y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f49z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f46A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f47B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public d(Context context, AttributeSet attributeSet) {
        super(S0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.e = new LinkedHashSet();
        this.f50f = new LinkedHashSet();
        Context context2 = getContext();
        C0337f c0337f = new C0337f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = q.f192a;
        Drawable a2 = j.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0337f.f3946a = a2;
        a2.setCallback(c0337f.f3945f);
        new C0336e(c0337f.f3946a.getConstantState());
        this.f65w = c0337f;
        this.f66x = new a(this);
        Context context3 = getContext();
        this.f54l = S.c.a(this);
        this.f57o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0383a.f4157n;
        m.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        m.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        h hVar = new h(context3, obtainStyledAttributes);
        this.f55m = hVar.h(2);
        if (this.f54l != null && AbstractC0058a.W(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f47B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f54l = H1.d.F(context3, R.drawable.mtrl_checkbox_button);
                this.f56n = true;
                if (this.f55m == null) {
                    this.f55m = H1.d.F(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f58p = H1.d.B(context3, hVar, 3);
        this.f59q = m.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f52h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.j = obtainStyledAttributes.getBoolean(9, false);
        this.f53k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        hVar.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f60r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f51g == null) {
            int u2 = l.u(this, R.attr.colorControlActivated);
            int u3 = l.u(this, R.attr.colorError);
            int u4 = l.u(this, R.attr.colorSurface);
            int u5 = l.u(this, R.attr.colorOnSurface);
            this.f51g = new ColorStateList(f46A, new int[]{l.H(u4, u3, 1.0f), l.H(u4, u2, 1.0f), l.H(u4, u5, 0.54f), l.H(u4, u5, 0.38f), l.H(u4, u5, 0.38f)});
        }
        return this.f51g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f57o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i iVar;
        Drawable drawable = this.f54l;
        ColorStateList colorStateList3 = this.f57o;
        PorterDuff.Mode b2 = S.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                F.a.i(drawable, b2);
            }
        }
        this.f54l = drawable;
        Drawable drawable2 = this.f55m;
        ColorStateList colorStateList4 = this.f58p;
        PorterDuff.Mode mode = this.f59q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                F.a.i(drawable2, mode);
            }
        }
        this.f55m = drawable2;
        if (this.f56n) {
            C0337f c0337f = this.f65w;
            if (c0337f != null) {
                Drawable drawable3 = c0337f.f3946a;
                a aVar = this.f66x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f42a == null) {
                        aVar.f42a = new C0333b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f42a);
                }
                ArrayList arrayList = c0337f.e;
                C0335d c0335d = c0337f.f3942b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c0337f.e.size() == 0 && (iVar = c0337f.f3944d) != null) {
                        c0335d.f3938b.removeListener(iVar);
                        c0337f.f3944d = null;
                    }
                }
                Drawable drawable4 = c0337f.f3946a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f42a == null) {
                        aVar.f42a = new C0333b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f42a);
                } else if (aVar != null) {
                    if (c0337f.e == null) {
                        c0337f.e = new ArrayList();
                    }
                    if (!c0337f.e.contains(aVar)) {
                        c0337f.e.add(aVar);
                        if (c0337f.f3944d == null) {
                            c0337f.f3944d = new i(6, c0337f);
                        }
                        c0335d.f3938b.addListener(c0337f.f3944d);
                    }
                }
            }
            Drawable drawable5 = this.f54l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0337f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0337f, false);
                ((AnimatedStateListDrawable) this.f54l).addTransition(R.id.indeterminate, R.id.unchecked, c0337f, false);
            }
        }
        Drawable drawable6 = this.f54l;
        if (drawable6 != null && (colorStateList2 = this.f57o) != null) {
            F.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f55m;
        if (drawable7 != null && (colorStateList = this.f58p) != null) {
            F.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f54l;
        Drawable drawable9 = this.f55m;
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
        return this.f54l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f55m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f58p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f59q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f57o;
    }

    public int getCheckedState() {
        return this.f60r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f53k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f60r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f52h && this.f57o == null && this.f58p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f48y);
        }
        if (this.j) {
            View.mergeDrawableStates(onCreateDrawableState, f49z);
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
        this.f61s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = S.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (m.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            F.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f53k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setCheckedState(cVar.f45a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f45a = getCheckedState();
        return cVar;
    }

    @Override // n.C0298s, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(H1.d.F(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f55m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(H1.d.F(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f58p == colorStateList) {
            return;
        }
        this.f58p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f59q == mode) {
            return;
        }
        this.f59q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f57o == colorStateList) {
            return;
        }
        this.f57o = colorStateList;
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
        if (this.f60r != i) {
            this.f60r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f63u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f62t) {
                return;
            }
            this.f62t = true;
            LinkedHashSet linkedHashSet = this.f50f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f60r != 2 && (onCheckedChangeListener = this.f64v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f62t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f53k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        refreshDrawableState();
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f64v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f63u = charSequence;
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
        this.f52h = z2;
        if (z2) {
            S.b.c(this, getMaterialThemeColorsTintList());
        } else {
            S.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // n.C0298s, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f54l = drawable;
        this.f56n = false;
        a();
    }
}
