package z1;

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
import androidx.emoji2.text.t;
import b4.d;
import b4.l;
import com.gdmhkmf.belbet.R;
import e0.m;
import i2.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.p;
import l1.e;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends p {
    public static final int[] D = {R.attr.state_indeterminate};
    public static final int[] E = {R.attr.state_error};
    public static final int[][] F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CompoundButton.OnCheckedChangeListener A;
    public final e B;
    public final a C;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f4130j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f4131k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4132l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4133m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4134n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4135o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4136p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f4137q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f4138r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4139s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f4140t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f4141u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f4142v;

    /* renamed from: w, reason: collision with root package name */
    public int f4143w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f4144x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4145y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f4146z;

    public c(Context context, AttributeSet attributeSet) {
        super(u2.a.b(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4130j = new LinkedHashSet();
        this.f4131k = new LinkedHashSet();
        Context context2 = getContext();
        e eVar = new e(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = m.f1339a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        eVar.f2649f = drawable;
        drawable.setCallback(eVar.f2648k);
        new g2.a(eVar.f2649f.getConstantState());
        this.B = eVar;
        this.C = new a(this);
        Context context3 = getContext();
        this.f4137q = getButtonDrawable();
        this.f4140t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        o.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = q1.a.f3158v;
        o.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        t tVar = new t(context3, obtainStyledAttributes);
        this.f4138r = tVar.d(2);
        if (this.f4137q != null && d.P(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4137q = d.y(context3, R.drawable.mtrl_checkbox_button);
                this.f4139s = true;
                if (this.f4138r == null) {
                    this.f4138r = d.y(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4141u = l.s(context3, tVar, 3);
        this.f4142v = o.f(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f4133m = obtainStyledAttributes.getBoolean(11, false);
        this.f4134n = obtainStyledAttributes.getBoolean(6, true);
        this.f4135o = obtainStyledAttributes.getBoolean(9, false);
        this.f4136p = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRippleColor(l.s(context3, tVar, 10));
        }
        tVar.k();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4143w;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4132l == null) {
            int U = l.U(getContext(), d.R(this, R.attr.colorControlActivated));
            int U2 = l.U(getContext(), d.R(this, R.attr.colorError));
            int U3 = l.U(getContext(), d.R(this, R.attr.colorSurface));
            int U4 = l.U(getContext(), d.R(this, R.attr.colorOnSurface));
            this.f4132l = new ColorStateList(F, new int[]{l.P(U3, U2, 1.0f), l.P(U3, U, 1.0f), l.P(U3, U4, 0.54f), l.P(U3, U4, 0.38f), l.P(U3, U4, 0.38f)});
        }
        return this.f4132l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4140t;
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
        g2.e eVar;
        Drawable drawable = this.f4137q;
        ColorStateList colorStateList3 = this.f4140t;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f4137q = drawable;
        Drawable drawable2 = this.f4138r;
        ColorStateList colorStateList4 = this.f4141u;
        PorterDuff.Mode mode = this.f4142v;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f4138r = drawable2;
        if (this.f4139s) {
            e eVar2 = this.B;
            if (eVar2 != null) {
                l1.d dVar = eVar2.f2646g;
                Drawable drawable3 = eVar2.f2649f;
                a aVar = this.C;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f4127a == null) {
                        aVar.f4127a = new l1.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f4127a);
                }
                ArrayList arrayList = eVar2.f2647j;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (eVar2.f2647j.size() == 0 && (eVar = eVar2.i) != null) {
                        dVar.f2644b.removeListener(eVar);
                        eVar2.i = null;
                    }
                }
                Drawable drawable4 = eVar2.f2649f;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f4127a == null) {
                        aVar.f4127a = new l1.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f4127a);
                } else if (aVar != null) {
                    if (eVar2.f2647j == null) {
                        eVar2.f2647j = new ArrayList();
                    }
                    if (!eVar2.f2647j.contains(aVar)) {
                        eVar2.f2647j.add(aVar);
                        if (eVar2.i == null) {
                            eVar2.i = new g2.e(4, eVar2);
                        }
                        dVar.f2644b.addListener(eVar2.i);
                    }
                }
            }
            Drawable drawable5 = this.f4137q;
            if ((drawable5 instanceof AnimatedStateListDrawable) && eVar2 != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, eVar2, false);
                ((AnimatedStateListDrawable) this.f4137q).addTransition(R.id.indeterminate, R.id.unchecked, eVar2, false);
            }
        }
        Drawable drawable6 = this.f4137q;
        if (drawable6 != null && (colorStateList2 = this.f4140t) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f4138r;
        if (drawable7 != null && (colorStateList = this.f4141u) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f4137q;
        Drawable drawable9 = this.f4138r;
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
                float f5 = intrinsicWidth / intrinsicHeight;
                if (f5 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f5);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f5 * intrinsicHeight);
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
        return this.f4137q;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4138r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4141u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4142v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4140t;
    }

    public int getCheckedState() {
        return this.f4143w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4136p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4143w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4133m && this.f4140t == null && this.f4141u == null) {
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
        if (this.f4135o) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i5 = onCreateDrawableState[i4];
            if (i5 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i5 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i4] = 16842912;
                break;
            }
            i4++;
        }
        this.f4144x = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f4134n || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
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
        if (accessibilityNodeInfo != null && this.f4135o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4136p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f4129f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4129f = getCheckedState();
        return bVar;
    }

    @Override // l.p, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(d.y(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4138r = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(d.y(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4141u == colorStateList) {
            return;
        }
        this.f4141u = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4142v == mode) {
            return;
        }
        this.f4142v = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4140t == colorStateList) {
            return;
        }
        this.f4140t = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z4) {
        this.f4134n = z4;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        setCheckedState(z4 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f4143w != i) {
            this.f4143w = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4146z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4145y) {
                return;
            }
            this.f4145y = true;
            LinkedHashSet linkedHashSet = this.f4131k;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4143w != 2 && (onCheckedChangeListener = this.A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4145y = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4136p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z4) {
        if (this.f4135o == z4) {
            return;
        }
        this.f4135o = z4;
        refreshDrawableState();
        Iterator it = this.f4130j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4146z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f4133m = z4;
        if (z4) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.p, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4137q = drawable;
        this.f4139s = false;
        a();
    }
}
