package x0;

import B.k;
import B.r;
import D0.n;
import K.C0003b0;
import K.C0014l;
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
import androidx.recyclerview.widget.RecyclerView;
import com.winworm.neongrid.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k0.AbstractC0180a;
import l.C0233r;
import m0.C0265b;
import m0.C0267d;
import m0.C0268e;
import m0.C0269f;
import p0.AbstractC0285a;
import z1.d;
import z1.l;

/* loaded from: classes.dex */
public final class c extends C0233r {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4128e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4129f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4130g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4131j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4132k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4133l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4134m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4135n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4136o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4137p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4138q;

    /* renamed from: r, reason: collision with root package name */
    public int f4139r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4140s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4141t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4142u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4143v;

    /* renamed from: w, reason: collision with root package name */
    public final C0269f f4144w;

    /* renamed from: x, reason: collision with root package name */
    public final C0316a f4145x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4126y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4127z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4124A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4125B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(O0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4128e = new LinkedHashSet();
        this.f4129f = new LinkedHashSet();
        Context context2 = getContext();
        C0269f c0269f = new C0269f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f58a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0269f.f3163a = a2;
        a2.setCallback(c0269f.f3162f);
        new C0268e(c0269f.f3163a.getConstantState());
        this.f4144w = c0269f;
        this.f4145x = new C0316a(this);
        Context context3 = getContext();
        this.f4133l = Q.c.a(this);
        this.f4136o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0285a.f3333n;
        n.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        n.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0014l c0014l = new C0014l(context3, obtainStyledAttributes);
        this.f4134m = c0014l.c(2);
        if (this.f4133l != null && d.g0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4125B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4133l = l.w(context3, R.drawable.mtrl_checkbox_button);
                this.f4135n = true;
                if (this.f4134m == null) {
                    this.f4134m = l.w(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4137p = l.s(context3, c0014l, 3);
        this.f4138q = n.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4131j = obtainStyledAttributes.getBoolean(9, false);
        this.f4132k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0014l.k();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4139r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4130g == null) {
            int i = AbstractC0180a.i(this, R.attr.colorControlActivated);
            int i2 = AbstractC0180a.i(this, R.attr.colorError);
            int i3 = AbstractC0180a.i(this, R.attr.colorSurface);
            int i4 = AbstractC0180a.i(this, R.attr.colorOnSurface);
            this.f4130g = new ColorStateList(f4124A, new int[]{AbstractC0180a.l(i3, i2, 1.0f), AbstractC0180a.l(i3, i, 1.0f), AbstractC0180a.l(i3, i4, 0.54f), AbstractC0180a.l(i3, i4, 0.38f), AbstractC0180a.l(i3, i4, 0.38f)});
        }
        return this.f4130g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4136o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0003b0 c0003b0;
        Drawable drawable = this.f4133l;
        ColorStateList colorStateList3 = this.f4136o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f4133l = drawable;
        Drawable drawable2 = this.f4134m;
        ColorStateList colorStateList4 = this.f4137p;
        PorterDuff.Mode mode = this.f4138q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f4134m = drawable2;
        if (this.f4135n) {
            C0269f c0269f = this.f4144w;
            if (c0269f != null) {
                Drawable drawable3 = c0269f.f3163a;
                C0316a c0316a = this.f4145x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0316a.f4121a == null) {
                        c0316a.f4121a = new C0265b(c0316a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0316a.f4121a);
                }
                ArrayList arrayList = c0269f.f3161e;
                C0267d c0267d = c0269f.f3159b;
                if (arrayList != null && c0316a != null) {
                    arrayList.remove(c0316a);
                    if (c0269f.f3161e.size() == 0 && (c0003b0 = c0269f.d) != null) {
                        c0267d.f3156b.removeListener(c0003b0);
                        c0269f.d = null;
                    }
                }
                Drawable drawable4 = c0269f.f3163a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0316a.f4121a == null) {
                        c0316a.f4121a = new C0265b(c0316a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0316a.f4121a);
                } else if (c0316a != null) {
                    if (c0269f.f3161e == null) {
                        c0269f.f3161e = new ArrayList();
                    }
                    if (!c0269f.f3161e.contains(c0316a)) {
                        c0269f.f3161e.add(c0316a);
                        if (c0269f.d == null) {
                            c0269f.d = new C0003b0(4, c0269f);
                        }
                        c0267d.f3156b.addListener(c0269f.d);
                    }
                }
            }
            Drawable drawable5 = this.f4133l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0269f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0269f, false);
                ((AnimatedStateListDrawable) this.f4133l).addTransition(R.id.indeterminate, R.id.unchecked, c0269f, false);
            }
        }
        Drawable drawable6 = this.f4133l;
        if (drawable6 != null && (colorStateList2 = this.f4136o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4134m;
        if (drawable7 != null && (colorStateList = this.f4137p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4133l;
        Drawable drawable9 = this.f4134m;
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
        return this.f4133l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4134m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4137p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4138q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4136o;
    }

    public int getCheckedState() {
        return this.f4139r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4132k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4139r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f4136o == null && this.f4137p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4126y);
        }
        if (this.f4131j) {
            View.mergeDrawableStates(onCreateDrawableState, f4127z);
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
        this.f4140s = copyOf;
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
        canvas.translate(width, RecyclerView.f1559A0);
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
        if (accessibilityNodeInfo != null && this.f4131j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4132k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0317b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0317b c0317b = (C0317b) parcelable;
        super.onRestoreInstanceState(c0317b.getSuperState());
        setCheckedState(c0317b.f4123a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0317b c0317b = new C0317b(super.onSaveInstanceState());
        c0317b.f4123a = getCheckedState();
        return c0317b;
    }

    @Override // l.C0233r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l.w(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4134m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(l.w(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4137p == colorStateList) {
            return;
        }
        this.f4137p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4138q == mode) {
            return;
        }
        this.f4138q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4136o == colorStateList) {
            return;
        }
        this.f4136o = colorStateList;
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
        if (this.f4139r != i) {
            this.f4139r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4142u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4141t) {
                return;
            }
            this.f4141t = true;
            LinkedHashSet linkedHashSet = this.f4129f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4139r != 2 && (onCheckedChangeListener = this.f4143v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4141t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4132k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4131j == z2) {
            return;
        }
        this.f4131j = z2;
        refreshDrawableState();
        Iterator it = this.f4128e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4143v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4142u = charSequence;
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

    @Override // l.C0233r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4133l = drawable;
        this.f4135n = false;
        a();
    }
}
