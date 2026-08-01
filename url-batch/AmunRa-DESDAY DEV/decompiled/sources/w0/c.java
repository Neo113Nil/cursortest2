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
import com.visualfortune.eyerest.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0239s;
import l0.C0256b;
import l0.C0258d;
import l0.C0259e;
import l0.C0260f;
import o0.AbstractC0275a;
import s1.d;
import s1.l;

/* loaded from: classes.dex */
public final class c extends C0239s {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4125e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4126f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4127g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4128j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4129k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4130l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4131m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4132n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4133o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4134p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4135q;

    /* renamed from: r, reason: collision with root package name */
    public int f4136r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4137s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4138t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4139u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4140v;

    /* renamed from: w, reason: collision with root package name */
    public final C0260f f4141w;

    /* renamed from: x, reason: collision with root package name */
    public final a f4142x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4123y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4124z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4121A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4122B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(N0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4125e = new LinkedHashSet();
        this.f4126f = new LinkedHashSet();
        Context context2 = getContext();
        C0260f c0260f = new C0260f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f38a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0260f.f3201a = a2;
        a2.setCallback(c0260f.f3200f);
        new C0259e(c0260f.f3201a.getConstantState());
        this.f4141w = c0260f;
        this.f4142x = new a(this);
        Context context3 = getContext();
        this.f4130l = Q.c.a(this);
        this.f4133o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0275a.f3349n;
        n.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        n.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0011l c0011l = new C0011l(context3, obtainStyledAttributes);
        this.f4131m = c0011l.h(2);
        if (this.f4130l != null && l.T(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4122B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4130l = l.z(context3, R.drawable.mtrl_checkbox_button);
                this.f4132n = true;
                if (this.f4131m == null) {
                    this.f4131m = l.z(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4134p = d.v(context3, c0011l, 3);
        this.f4135q = n.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4128j = obtainStyledAttributes.getBoolean(9, false);
        this.f4129k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0011l.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4136r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4127g == null) {
            int n2 = k1.c.n(this, R.attr.colorControlActivated);
            int n3 = k1.c.n(this, R.attr.colorError);
            int n4 = k1.c.n(this, R.attr.colorSurface);
            int n5 = k1.c.n(this, R.attr.colorOnSurface);
            this.f4127g = new ColorStateList(f4121A, new int[]{k1.c.q(n4, n3, 1.0f), k1.c.q(n4, n2, 1.0f), k1.c.q(n4, n5, 0.54f), k1.c.q(n4, n5, 0.38f), k1.c.q(n4, n5, 0.38f)});
        }
        return this.f4127g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4133o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Y y2;
        Drawable drawable = this.f4130l;
        ColorStateList colorStateList3 = this.f4133o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f4130l = drawable;
        Drawable drawable2 = this.f4131m;
        ColorStateList colorStateList4 = this.f4134p;
        PorterDuff.Mode mode = this.f4135q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f4131m = drawable2;
        if (this.f4132n) {
            C0260f c0260f = this.f4141w;
            if (c0260f != null) {
                Drawable drawable3 = c0260f.f3201a;
                a aVar = this.f4142x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f4118a == null) {
                        aVar.f4118a = new C0256b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f4118a);
                }
                ArrayList arrayList = c0260f.f3199e;
                C0258d c0258d = c0260f.f3197b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c0260f.f3199e.size() == 0 && (y2 = c0260f.d) != null) {
                        c0258d.f3194b.removeListener(y2);
                        c0260f.d = null;
                    }
                }
                Drawable drawable4 = c0260f.f3201a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f4118a == null) {
                        aVar.f4118a = new C0256b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f4118a);
                } else if (aVar != null) {
                    if (c0260f.f3199e == null) {
                        c0260f.f3199e = new ArrayList();
                    }
                    if (!c0260f.f3199e.contains(aVar)) {
                        c0260f.f3199e.add(aVar);
                        if (c0260f.d == null) {
                            c0260f.d = new Y(4, c0260f);
                        }
                        c0258d.f3194b.addListener(c0260f.d);
                    }
                }
            }
            Drawable drawable5 = this.f4130l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0260f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0260f, false);
                ((AnimatedStateListDrawable) this.f4130l).addTransition(R.id.indeterminate, R.id.unchecked, c0260f, false);
            }
        }
        Drawable drawable6 = this.f4130l;
        if (drawable6 != null && (colorStateList2 = this.f4133o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4131m;
        if (drawable7 != null && (colorStateList = this.f4134p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4130l;
        Drawable drawable9 = this.f4131m;
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
        return this.f4130l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4131m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4134p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4135q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4133o;
    }

    public int getCheckedState() {
        return this.f4136r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4129k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4136r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f4133o == null && this.f4134p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4123y);
        }
        if (this.f4128j) {
            View.mergeDrawableStates(onCreateDrawableState, f4124z);
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
        this.f4137s = copyOf;
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
        if (accessibilityNodeInfo != null && this.f4128j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4129k));
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
        setCheckedState(bVar.f4120a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4120a = getCheckedState();
        return bVar;
    }

    @Override // l.C0239s, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l.z(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4131m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(l.z(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4134p == colorStateList) {
            return;
        }
        this.f4134p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4135q == mode) {
            return;
        }
        this.f4135q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4133o == colorStateList) {
            return;
        }
        this.f4133o = colorStateList;
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
        if (this.f4136r != i) {
            this.f4136r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4139u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4138t) {
                return;
            }
            this.f4138t = true;
            LinkedHashSet linkedHashSet = this.f4126f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4136r != 2 && (onCheckedChangeListener = this.f4140v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4138t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4129k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4128j == z2) {
            return;
        }
        this.f4128j = z2;
        refreshDrawableState();
        Iterator it = this.f4125e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4140v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4139u = charSequence;
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

    @Override // l.C0239s, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4130l = drawable;
        this.f4132n = false;
        a();
    }
}
