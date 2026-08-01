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
import com.luckyarcade.spinthrow.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k0.C0217b;
import k0.C0219d;
import k0.C0220e;
import k0.C0221f;
import l.C0284r;
import n0.AbstractC0305a;
import q1.d;
import q1.l;

/* loaded from: classes.dex */
public final class c extends C0284r {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4456e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4457f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4458g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4459j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4460k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4461l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4462m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4463n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4464o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4465p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4466q;

    /* renamed from: r, reason: collision with root package name */
    public int f4467r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4468s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4469t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4470u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4471v;

    /* renamed from: w, reason: collision with root package name */
    public final C0221f f4472w;

    /* renamed from: x, reason: collision with root package name */
    public final a f4473x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4454y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4455z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4452A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4453B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(M0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4456e = new LinkedHashSet();
        this.f4457f = new LinkedHashSet();
        Context context2 = getContext();
        C0221f c0221f = new C0221f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f49a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0221f.f3152a = a2;
        a2.setCallback(c0221f.f3151f);
        new C0220e(c0221f.f3152a.getConstantState());
        this.f4472w = c0221f;
        this.f4473x = new a(this);
        Context context3 = getContext();
        this.f4461l = Q.c.a(this);
        this.f4464o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0305a.f3645n;
        o.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        o.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        T.r rVar = new T.r(context3, obtainStyledAttributes);
        this.f4462m = rVar.h(2);
        if (this.f4461l != null && l.e0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4453B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4461l = d.z(context3, R.drawable.mtrl_checkbox_button);
                this.f4463n = true;
                if (this.f4462m == null) {
                    this.f4462m = d.z(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4465p = d.x(context3, rVar, 3);
        this.f4466q = o.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4459j = obtainStyledAttributes.getBoolean(9, false);
        this.f4460k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        rVar.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4467r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4458g == null) {
            int h = i1.r.h(this, R.attr.colorControlActivated);
            int h2 = i1.r.h(this, R.attr.colorError);
            int h3 = i1.r.h(this, R.attr.colorSurface);
            int h4 = i1.r.h(this, R.attr.colorOnSurface);
            this.f4458g = new ColorStateList(f4452A, new int[]{i1.r.l(h3, h2, 1.0f), i1.r.l(h3, h, 1.0f), i1.r.l(h3, h4, 0.54f), i1.r.l(h3, h4, 0.38f), i1.r.l(h3, h4, 0.38f)});
        }
        return this.f4458g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4464o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0007d0 c0007d0;
        Drawable drawable = this.f4461l;
        ColorStateList colorStateList3 = this.f4464o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f4461l = drawable;
        Drawable drawable2 = this.f4462m;
        ColorStateList colorStateList4 = this.f4465p;
        PorterDuff.Mode mode = this.f4466q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f4462m = drawable2;
        if (this.f4463n) {
            C0221f c0221f = this.f4472w;
            if (c0221f != null) {
                Drawable drawable3 = c0221f.f3152a;
                a aVar = this.f4473x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f4449a == null) {
                        aVar.f4449a = new C0217b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f4449a);
                }
                ArrayList arrayList = c0221f.f3150e;
                C0219d c0219d = c0221f.f3147b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c0221f.f3150e.size() == 0 && (c0007d0 = c0221f.f3149d) != null) {
                        c0219d.f3143b.removeListener(c0007d0);
                        c0221f.f3149d = null;
                    }
                }
                Drawable drawable4 = c0221f.f3152a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f4449a == null) {
                        aVar.f4449a = new C0217b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f4449a);
                } else if (aVar != null) {
                    if (c0221f.f3150e == null) {
                        c0221f.f3150e = new ArrayList();
                    }
                    if (!c0221f.f3150e.contains(aVar)) {
                        c0221f.f3150e.add(aVar);
                        if (c0221f.f3149d == null) {
                            c0221f.f3149d = new C0007d0(3, c0221f);
                        }
                        c0219d.f3143b.addListener(c0221f.f3149d);
                    }
                }
            }
            Drawable drawable5 = this.f4461l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0221f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0221f, false);
                ((AnimatedStateListDrawable) this.f4461l).addTransition(R.id.indeterminate, R.id.unchecked, c0221f, false);
            }
        }
        Drawable drawable6 = this.f4461l;
        if (drawable6 != null && (colorStateList2 = this.f4464o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4462m;
        if (drawable7 != null && (colorStateList = this.f4465p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4461l;
        Drawable drawable9 = this.f4462m;
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
        return this.f4461l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4462m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4465p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4466q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4464o;
    }

    public int getCheckedState() {
        return this.f4467r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4460k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4467r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f4464o == null && this.f4465p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4454y);
        }
        if (this.f4459j) {
            View.mergeDrawableStates(onCreateDrawableState, f4455z);
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
        this.f4468s = copyOf;
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
        if (accessibilityNodeInfo != null && this.f4459j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4460k));
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
        setCheckedState(bVar.f4451a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4451a = getCheckedState();
        return bVar;
    }

    @Override // l.C0284r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(d.z(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4462m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(d.z(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4465p == colorStateList) {
            return;
        }
        this.f4465p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4466q == mode) {
            return;
        }
        this.f4466q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4464o == colorStateList) {
            return;
        }
        this.f4464o = colorStateList;
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
        if (this.f4467r != i) {
            this.f4467r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4470u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4469t) {
                return;
            }
            this.f4469t = true;
            LinkedHashSet linkedHashSet = this.f4457f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4467r != 2 && (onCheckedChangeListener = this.f4471v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4469t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4460k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4459j == z2) {
            return;
        }
        this.f4459j = z2;
        refreshDrawableState();
        Iterator it = this.f4456e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4471v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4470u = charSequence;
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

    @Override // l.C0284r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4461l = drawable;
        this.f4463n = false;
        a();
    }
}
