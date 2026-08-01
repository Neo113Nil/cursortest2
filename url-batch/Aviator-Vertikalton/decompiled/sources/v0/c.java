package v0;

import B.k;
import B.r;
import B0.o;
import K.C0007d0;
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
import com.fortuneink.neonpad.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k0.C0215b;
import k0.C0217d;
import k0.C0218e;
import k0.C0219f;
import l.C0284s;
import n0.AbstractC0303a;
import q1.d;
import q1.l;

/* loaded from: classes.dex */
public final class c extends C0284s {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4452e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4453f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4454g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4455j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4456k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4457l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4458m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4459n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4460o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4461p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4462q;

    /* renamed from: r, reason: collision with root package name */
    public int f4463r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4464s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4465t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4466u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4467v;

    /* renamed from: w, reason: collision with root package name */
    public final C0219f f4468w;

    /* renamed from: x, reason: collision with root package name */
    public final a f4469x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4450y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4451z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4448A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4449B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(M0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4452e = new LinkedHashSet();
        this.f4453f = new LinkedHashSet();
        Context context2 = getContext();
        C0219f c0219f = new C0219f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f49a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0219f.f3148a = a2;
        a2.setCallback(c0219f.f3147f);
        new C0218e(c0219f.f3148a.getConstantState());
        this.f4468w = c0219f;
        this.f4469x = new a(this);
        Context context3 = getContext();
        this.f4457l = Q.c.a(this);
        this.f4460o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0303a.f3641n;
        o.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        o.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        T.r rVar = new T.r(context3, obtainStyledAttributes);
        this.f4458m = rVar.h(2);
        if (this.f4457l != null && l.e0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4449B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4457l = d.z(context3, R.drawable.mtrl_checkbox_button);
                this.f4459n = true;
                if (this.f4458m == null) {
                    this.f4458m = d.z(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4461p = d.x(context3, rVar, 3);
        this.f4462q = o.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4455j = obtainStyledAttributes.getBoolean(9, false);
        this.f4456k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        rVar.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4463r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4454g == null) {
            int h = i1.r.h(this, R.attr.colorControlActivated);
            int h2 = i1.r.h(this, R.attr.colorError);
            int h3 = i1.r.h(this, R.attr.colorSurface);
            int h4 = i1.r.h(this, R.attr.colorOnSurface);
            this.f4454g = new ColorStateList(f4448A, new int[]{i1.r.l(h3, h2, 1.0f), i1.r.l(h3, h, 1.0f), i1.r.l(h3, h4, 0.54f), i1.r.l(h3, h4, 0.38f), i1.r.l(h3, h4, 0.38f)});
        }
        return this.f4454g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4460o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0007d0 c0007d0;
        Drawable drawable = this.f4457l;
        ColorStateList colorStateList3 = this.f4460o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f4457l = drawable;
        Drawable drawable2 = this.f4458m;
        ColorStateList colorStateList4 = this.f4461p;
        PorterDuff.Mode mode = this.f4462q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f4458m = drawable2;
        if (this.f4459n) {
            C0219f c0219f = this.f4468w;
            if (c0219f != null) {
                Drawable drawable3 = c0219f.f3148a;
                a aVar = this.f4469x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f4445a == null) {
                        aVar.f4445a = new C0215b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f4445a);
                }
                ArrayList arrayList = c0219f.f3146e;
                C0217d c0217d = c0219f.f3143b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c0219f.f3146e.size() == 0 && (c0007d0 = c0219f.f3145d) != null) {
                        c0217d.f3139b.removeListener(c0007d0);
                        c0219f.f3145d = null;
                    }
                }
                Drawable drawable4 = c0219f.f3148a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f4445a == null) {
                        aVar.f4445a = new C0215b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f4445a);
                } else if (aVar != null) {
                    if (c0219f.f3146e == null) {
                        c0219f.f3146e = new ArrayList();
                    }
                    if (!c0219f.f3146e.contains(aVar)) {
                        c0219f.f3146e.add(aVar);
                        if (c0219f.f3145d == null) {
                            c0219f.f3145d = new C0007d0(3, c0219f);
                        }
                        c0217d.f3139b.addListener(c0219f.f3145d);
                    }
                }
            }
            Drawable drawable5 = this.f4457l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0219f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0219f, false);
                ((AnimatedStateListDrawable) this.f4457l).addTransition(R.id.indeterminate, R.id.unchecked, c0219f, false);
            }
        }
        Drawable drawable6 = this.f4457l;
        if (drawable6 != null && (colorStateList2 = this.f4460o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4458m;
        if (drawable7 != null && (colorStateList = this.f4461p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4457l;
        Drawable drawable9 = this.f4458m;
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
        return this.f4457l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4458m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4461p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4462q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4460o;
    }

    public int getCheckedState() {
        return this.f4463r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4456k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4463r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f4460o == null && this.f4461p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4450y);
        }
        if (this.f4455j) {
            View.mergeDrawableStates(onCreateDrawableState, f4451z);
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
        this.f4464s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = Q.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (o.e(this) ? -1 : 1);
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
        if (accessibilityNodeInfo != null && this.f4455j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4456k));
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
        setCheckedState(bVar.f4447a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4447a = getCheckedState();
        return bVar;
    }

    @Override // l.C0284s, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(d.z(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4458m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(d.z(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4461p == colorStateList) {
            return;
        }
        this.f4461p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4462q == mode) {
            return;
        }
        this.f4462q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4460o == colorStateList) {
            return;
        }
        this.f4460o = colorStateList;
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
        if (this.f4463r != i) {
            this.f4463r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4466u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4465t) {
                return;
            }
            this.f4465t = true;
            LinkedHashSet linkedHashSet = this.f4453f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4463r != 2 && (onCheckedChangeListener = this.f4467v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4465t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4456k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4455j == z2) {
            return;
        }
        this.f4455j = z2;
        refreshDrawableState();
        Iterator it = this.f4452e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4467v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4466u = charSequence;
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

    @Override // l.C0284s, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4457l = drawable;
        this.f4459n = false;
        a();
    }
}
