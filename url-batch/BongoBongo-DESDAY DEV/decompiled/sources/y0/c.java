package y0;

import A1.d;
import A1.m;
import C.k;
import C.r;
import E0.n;
import L.C0003b0;
import L.C0014l;
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
import com.winfour.winrandom.R;
import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.C0235r;
import n0.C0265b;
import n0.C0267d;
import n0.C0268e;
import n0.C0269f;
import q0.AbstractC0285a;

/* loaded from: classes.dex */
public final class c extends C0235r {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4323e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4324f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4325g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4326h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4327j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4328k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4329l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4330m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4331n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4332o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4333p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4334q;

    /* renamed from: r, reason: collision with root package name */
    public int f4335r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4336s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4337t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4338u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4339v;

    /* renamed from: w, reason: collision with root package name */
    public final C0269f f4340w;

    /* renamed from: x, reason: collision with root package name */
    public final C0318a f4341x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4321y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4322z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4319A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4320B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(P0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4323e = new LinkedHashSet();
        this.f4324f = new LinkedHashSet();
        Context context2 = getContext();
        C0269f c0269f = new C0269f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f99a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0269f.f3330a = a2;
        a2.setCallback(c0269f.f3329f);
        new C0268e(c0269f.f3330a.getConstantState());
        this.f4340w = c0269f;
        this.f4341x = new C0318a(this);
        Context context3 = getContext();
        this.f4329l = R.c.a(this);
        this.f4332o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0285a.f3511n;
        n.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        n.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0014l c0014l = new C0014l(context3, obtainStyledAttributes);
        this.f4330m = c0014l.c(2);
        if (this.f4329l != null && m.Y(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4320B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4329l = AbstractC0112a.l(context3, R.drawable.mtrl_checkbox_button);
                this.f4331n = true;
                if (this.f4330m == null) {
                    this.f4330m = AbstractC0112a.l(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4333p = d.C(context3, c0014l, 3);
        this.f4334q = n.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f4326h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4327j = obtainStyledAttributes.getBoolean(9, false);
        this.f4328k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0014l.k();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4335r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4325g == null) {
            int B2 = d.B(this, R.attr.colorControlActivated);
            int B3 = d.B(this, R.attr.colorError);
            int B4 = d.B(this, R.attr.colorSurface);
            int B5 = d.B(this, R.attr.colorOnSurface);
            this.f4325g = new ColorStateList(f4319A, new int[]{d.S(B4, B3, 1.0f), d.S(B4, B2, 1.0f), d.S(B4, B5, 0.54f), d.S(B4, B5, 0.38f), d.S(B4, B5, 0.38f)});
        }
        return this.f4325g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4332o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0003b0 c0003b0;
        Drawable drawable = this.f4329l;
        ColorStateList colorStateList3 = this.f4332o;
        PorterDuff.Mode b2 = R.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                E.a.i(drawable, b2);
            }
        }
        this.f4329l = drawable;
        Drawable drawable2 = this.f4330m;
        ColorStateList colorStateList4 = this.f4333p;
        PorterDuff.Mode mode = this.f4334q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                E.a.i(drawable2, mode);
            }
        }
        this.f4330m = drawable2;
        if (this.f4331n) {
            C0269f c0269f = this.f4340w;
            if (c0269f != null) {
                Drawable drawable3 = c0269f.f3330a;
                C0318a c0318a = this.f4341x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0318a.f4316a == null) {
                        c0318a.f4316a = new C0265b(c0318a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0318a.f4316a);
                }
                ArrayList arrayList = c0269f.f3328e;
                C0267d c0267d = c0269f.f3326b;
                if (arrayList != null && c0318a != null) {
                    arrayList.remove(c0318a);
                    if (c0269f.f3328e.size() == 0 && (c0003b0 = c0269f.d) != null) {
                        c0267d.f3323b.removeListener(c0003b0);
                        c0269f.d = null;
                    }
                }
                Drawable drawable4 = c0269f.f3330a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0318a.f4316a == null) {
                        c0318a.f4316a = new C0265b(c0318a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0318a.f4316a);
                } else if (c0318a != null) {
                    if (c0269f.f3328e == null) {
                        c0269f.f3328e = new ArrayList();
                    }
                    if (!c0269f.f3328e.contains(c0318a)) {
                        c0269f.f3328e.add(c0318a);
                        if (c0269f.d == null) {
                            c0269f.d = new C0003b0(4, c0269f);
                        }
                        c0267d.f3323b.addListener(c0269f.d);
                    }
                }
            }
            Drawable drawable5 = this.f4329l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0269f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0269f, false);
                ((AnimatedStateListDrawable) this.f4329l).addTransition(R.id.indeterminate, R.id.unchecked, c0269f, false);
            }
        }
        Drawable drawable6 = this.f4329l;
        if (drawable6 != null && (colorStateList2 = this.f4332o) != null) {
            E.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4330m;
        if (drawable7 != null && (colorStateList = this.f4333p) != null) {
            E.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4329l;
        Drawable drawable9 = this.f4330m;
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
        return this.f4329l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4330m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4333p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4334q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4332o;
    }

    public int getCheckedState() {
        return this.f4335r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4328k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4335r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4326h && this.f4332o == null && this.f4333p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4321y);
        }
        if (this.f4327j) {
            View.mergeDrawableStates(onCreateDrawableState, f4322z);
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
        this.f4336s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = R.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (n.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, RecyclerView.A0);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            E.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f4327j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4328k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0319b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0319b c0319b = (C0319b) parcelable;
        super.onRestoreInstanceState(c0319b.getSuperState());
        setCheckedState(c0319b.f4318a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0319b c0319b = new C0319b(super.onSaveInstanceState());
        c0319b.f4318a = getCheckedState();
        return c0319b;
    }

    @Override // m.C0235r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0112a.l(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4330m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0112a.l(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4333p == colorStateList) {
            return;
        }
        this.f4333p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4334q == mode) {
            return;
        }
        this.f4334q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4332o == colorStateList) {
            return;
        }
        this.f4332o = colorStateList;
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
        if (this.f4335r != i) {
            this.f4335r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4338u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4337t) {
                return;
            }
            this.f4337t = true;
            LinkedHashSet linkedHashSet = this.f4324f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4335r != 2 && (onCheckedChangeListener = this.f4339v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4337t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4328k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4327j == z2) {
            return;
        }
        this.f4327j = z2;
        refreshDrawableState();
        Iterator it = this.f4323e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4339v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4338u = charSequence;
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
        this.f4326h = z2;
        if (z2) {
            R.b.c(this, getMaterialThemeColorsTintList());
        } else {
            R.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // m.C0235r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4329l = drawable;
        this.f4331n = false;
        a();
    }
}
